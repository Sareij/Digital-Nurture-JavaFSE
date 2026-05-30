// Using const for array
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
        name: "Rock Concert",
        category: "Music",
        seats: 40
    }

];


// Using let
let totalEvents = events.length;

console.log("Total Events:", totalEvents);


// Function with Default Parameter
function displayEvent(eventName = "Unknown Event") {

    console.log(`Event Name: ${eventName}`);

}

// Calling function
displayEvent("Music Festival");

// Using default value
displayEvent();


// Destructuring
const {
    name,
    category,
    seats
} = events[0];

console.log("Destructured Values:");

console.log("Name:", name);
console.log("Category:", category);
console.log("Seats:", seats);


// Spread Operator
const clonedEvents = [...events];


// Filter Music Events from Clone
const musicEvents = clonedEvents.filter(

    event => event.category === "Music"

);

console.log("Music Events:");

console.log(musicEvents);