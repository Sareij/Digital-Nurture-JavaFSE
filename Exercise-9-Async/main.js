const loading =
document.getElementById("loading");

const container =
document.getElementById("eventsContainer");

fetch("events.json")

.then(response => response.json())

.then(data => {

    loading.style.display = "none";

    data.forEach(event => {

        const card =
        document.createElement("div");

        card.className = "event-card";

        card.innerHTML = `
            <h3>${event.name}</h3>
            <p>Category: ${event.category}</p>
            <p>Seats: ${event.seats}</p>
        `;

        container.appendChild(card);

    });

})

.catch(error => {

    console.error(error);

    loading.innerText =
    "Failed to load events";

});

//////////////////////////////////////////////
//?/ Refactored with Async/Await

// const spinner =
// document.getElementById("spinner");

// const container =
// document.getElementById("eventsContainer");


// async function loadEvents() {

//     try {

//         const response =
//         await fetch("events.json");

//         const events =
//         await response.json();

//         spinner.style.display = "none";

//         events.forEach(event => {

//             const card =
//             document.createElement("div");

//             card.className = "event-card";

//             card.innerHTML = `
//                 <h3>${event.name}</h3>
//                 <p>Category: ${event.category}</p>
//                 <p>Seats: ${event.seats}</p>
//             `;

//             container.appendChild(card);

//         });

//     }

//     catch(error) {

//         spinner.innerText =
//         "Failed to load events";

//         console.log(error);

//     }
// }

// loadEvents();