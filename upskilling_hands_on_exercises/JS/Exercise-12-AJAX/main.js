const form =
document.getElementById("registrationForm");

const message =
document.getElementById("message");


form.addEventListener(

    "submit",

    function(event) {

        event.preventDefault();

        const userData = {

            name:
            document.getElementById("name").value,

            email:
            document.getElementById("email").value

        };

        message.textContent =
        "Submitting registration...";


        // Simulate server delay
        setTimeout(() => {

            fetch(
                "https://jsonplaceholder.typicode.com/posts",
                {
                    method: "POST",

                    headers: {
                        "Content-Type":
                        "application/json"
                    },

                    body:
                    JSON.stringify(userData)
                }
            )

            .then(response => {

                if (!response.ok) {
                    throw new Error(
                        "Server Error"
                    );
                }

                return response.json();
            })

            .then(data => {

                message.textContent =
                "Registration Successful!";

                console.log(
                    "Server Response:",
                    data
                );

            })

            .catch(error => {

                message.textContent =
                "Registration Failed!";

                console.log(error);

            });

        }, 2000);

    }

);