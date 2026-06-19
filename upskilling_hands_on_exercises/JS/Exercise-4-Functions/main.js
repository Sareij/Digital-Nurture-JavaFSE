// Event Array
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
    }
];


// 1. Function to Add Event
function addEvent(eventList, newEvent) {

    eventList.push(newEvent);

    console.log("Event Added Successfully");
}


// Add a new event
addEvent(events, {
    name: "Sports Meet",
    category: "Sports",
    seats: 40
});


// 2. Function to Register User
function registerUser(event) {

    if (event.seats > 0) {

        event.seats--;

        console.log(
            `Registered for ${event.name}`
        );

        console.log(
            `Remaining Seats: ${event.seats}`
        );

    } else {

        console.log(
            `No seats available for ${event.name}`
        );
    }
}


// Register user for first event
registerUser(events[0]);


// 3. Function to Filter Events by Category
function filterEventsByCategory(eventList, category) {

    return eventList.filter(

        event => event.category === category

    );
}


// Display Music Events
const musicEvents =
filterEventsByCategory(events, "Music");

console.log("Music Events:");
console.log(musicEvents);


// 4. Closure Example
function registrationTracker() {

    let totalRegistrations = 0;

    return function () {

        totalRegistrations++;

        return totalRegistrations;
    };
}


// Create tracker
const trackRegistration =
registrationTracker();

console.log(
    "Registration Count:",
    trackRegistration()
);

console.log(
    "Registration Count:",
    trackRegistration()
);

console.log(
    "Registration Count:",
    trackRegistration()
);


// 5. Higher-Order Function with Callback
function searchEvents(eventList, callback) {

    return callback(eventList);
}


// Callback Function
const workshopEvents =
searchEvents(

    events,

    function(list) {

        return list.filter(

            event =>
            event.category === "Workshop"

        );

    }

);

console.log("Workshop Events:");
console.log(workshopEvents);