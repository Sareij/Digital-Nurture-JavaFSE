// Event Data
const events = [

    {
        name: "Music Festival",
        category: "Music",
        seats: 50
    },

    {
        name: "Baking Workshop",
        category: "Workshop",
        seats: 30
    },

    {
        name: "Football Match",
        category: "Sports",
        seats: 40
    }

];


// DOM Elements
const container =
document.getElementById("eventsContainer");

const categoryFilter =
document.getElementById("categoryFilter");

const searchBox =
document.getElementById("searchBox");


// Display Events Function
function displayEvents(eventList) {

    container.innerHTML = "";

    eventList.forEach(event => {

        const card =
        document.createElement("div");

        card.className = "event-card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Category: ${event.category}</p>
            <p>Seats: ${event.seats}</p>
        `;

        // Register Button using onclick
        const registerBtn =
        document.createElement("button");

        registerBtn.textContent = "Register";

        registerBtn.onclick = function () {

            if (event.seats > 0) {

                event.seats--;

                alert(
                    `Registered for ${event.name}`
                );

                displayEvents(events);
            }
        };

        card.appendChild(registerBtn);

        container.appendChild(card);

    });

}


// Initial Display
displayEvents(events);


// onchange Event
categoryFilter.onchange = function () {

    const selectedCategory =
    this.value;

    if (selectedCategory === "All") {

        displayEvents(events);

    } else {

        const filteredEvents =
        events.filter(

            event =>
            event.category === selectedCategory

        );

        displayEvents(filteredEvents);
    }
};


// keydown Event
searchBox.addEventListener(

    "keydown",

    function () {

        const searchText =
        this.value.toLowerCase();

        const searchedEvents =
        events.filter(

            event =>

            event.name
            .toLowerCase()
            .includes(searchText)

        );

        displayEvents(searchedEvents);
    }

);