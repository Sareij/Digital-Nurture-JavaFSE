// Event Constructor Function
function Event(name, category, date, seats) {

    this.name = name;
    this.category = category;
    this.date = date;
    this.seats = seats;
}


// Add Method to Prototype
Event.prototype.checkAvailability = function () {

    if (this.seats > 0) {
        return "Seats Available";
    } else {
        return "Event Full";
    }
};


// Create Event Objects
const event1 = new Event(
    "Music Festival",
    "Music",
    "2026-06-15",
    50
);

const event2 = new Event(
    "Food Carnival",
    "Food",
    "2026-07-10",
    0
);


// Check Availability
console.log(
    `${event1.name}: ${event1.checkAvailability()}`
);

console.log(
    `${event2.name}: ${event2.checkAvailability()}`
);


// Display Object Keys and Values
console.log("Event 1 Details:");

Object.entries(event1).forEach(

    ([key, value]) => {

        console.log(`${key}: ${value}`);

    }

);