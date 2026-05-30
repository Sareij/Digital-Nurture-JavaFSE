// Event list
const events = [
    {
        name: "Music Festival",
        date: "2026-06-15",
        seats: 50
    },
    {
        name: "Past Workshop",
        date: "2025-01-10",
        seats: 20
    },
    {
        name: "Food Carnival",
        date: "2026-07-20",
        seats: 0
    }
];

console.log("Available Events");

// Loop through events using forEach()
events.forEach(event => {

    const today = new Date();
    const eventDate = new Date(event.date);

    // Show only future events with available seats
    if (eventDate > today && event.seats > 0) {

        console.log(
            `${event.name} | Date: ${event.date} | Seats: ${event.seats}`
        );

    } else {

        console.log(
            `${event.name} is hidden (Past event or No seats available)`
        );
    }
});


// Registration Function with Error Handling
function registerUser(event) {

    try {

        if (event.seats <= 0) {
            throw new Error("Registration Failed: No seats available");
        }

        event.seats--;

        console.log(
            `Registration Successful for ${event.name}`
        );

        console.log(
            `Remaining Seats: ${event.seats}`
        );

    } catch (error) {

        console.log(error.message);

    }

}


// Test Registration

registerUser(events[0]); // Success

registerUser(events[2]); // Error