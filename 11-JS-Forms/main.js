const form =
document.getElementById("registrationForm");


form.addEventListener(

    "submit",

    function(event) {

        // Prevent page refresh
        event.preventDefault();

        // Clear previous errors
        document.getElementById("nameError").textContent = "";
        document.getElementById("emailError").textContent = "";
        document.getElementById("eventError").textContent = "";

        // Capture values using form.elements
        const name =
        form.elements["username"].value;

        const email =
        form.elements["email"].value;

        const selectedEvent =
        form.elements["eventName"].value;

        let isValid = true;


        // Name Validation
        if (name.trim() === "") {

            document.getElementById("nameError")
            .textContent =
            "Name is required";

            isValid = false;
        }


        // Email Validation
        if (email.trim() === "") {

            document.getElementById("emailError")
            .textContent =
            "Email is required";

            isValid = false;
        }


        // Event Validation
        if (selectedEvent === "") {

            document.getElementById("eventError")
            .textContent =
            "Please select an event";

            isValid = false;
        }


        // Success
        if (isValid) {

            alert(
                "Registration Successful!"
            );

            console.log("Name:", name);
            console.log("Email:", email);
            console.log("Event:", selectedEvent);

        }

    }

);