import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPChat {

    // ================= SERVER =================
    public static void startServer() throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started... Waiting for client");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);

        String msg;

        while (true) {
            // receive
            if ((msg = in.readLine()) != null) {
                System.out.println("Client: " + msg);
            }

            // send
            System.out.print("Server: ");
            String send = scanner.nextLine();
            out.println(send);

            if (send.equalsIgnoreCase("exit")) break;
        }

        socket.close();
        serverSocket.close();
    }

    // ================= CLIENT =================
    public static void startClient() throws Exception {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to server!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);

        String msg;

        while (true) {
            // send
            System.out.print("Client: ");
            String send = scanner.nextLine();
            out.println(send);

            if (send.equalsIgnoreCase("exit")) break;

            // receive
            if ((msg = in.readLine()) != null) {
                System.out.println("Server: " + msg);
            }
        }

        socket.close();
    }

    // ================= MAIN =================
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Usage: java TCPChat server | client");
            return;
        }

        if (args[0].equalsIgnoreCase("server")) {
            startServer();
        } else {
            startClient();
        }
    }
}