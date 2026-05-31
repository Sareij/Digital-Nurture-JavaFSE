// Event Data
const events = [
    {
        name: "Music Festival",
        seats: 50
    },
    {
        name: "Baking Workshop",
        seats: 30
    }
];


// Access DOM Element using querySelector()
const container =
document.querySelector("#eventsContainer");


// Function to Display Events
function displayEvents() {

    // Clear previous UI
    container.innerHTML = "";

    events.forEach((event) => {

        // Create Event Card
        const card =
        document.createElement("div");

        card.className = "event-card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Available Seats: ${event.seats}</p>
        `;

        // Register Button
        const registerBtn =
        document.createElement("button");

        registerBtn.textContent = "Register";

        registerBtn.onclick = function () {

            if (event.seats > 0) {

                event.seats--;

                displayEvents();
            }
        };


        // Cancel Button
        const cancelBtn =
        document.createElement("button");

        cancelBtn.textContent = "Cancel";

        cancelBtn.onclick = function () {

            event.seats++;

            displayEvents();
        };


        // Append buttons to card
        card.appendChild(registerBtn);
        card.appendChild(cancelBtn);

        // Append card to container
        container.appendChild(card);

    });

}


// Initial Display
displayEvents();