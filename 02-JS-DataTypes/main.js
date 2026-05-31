// Using const for event name and date
const eventName = "Music Festival";
const eventDate = "15-06-2026";

// Using let for seats because seat count can change
let availableSeats = 50;

// Display event details using template literals
console.log(`
Event Name: ${eventName}
Event Date: ${eventDate}
Available Seats: ${availableSeats}
`);

// Simulate one user registration
availableSeats--;

// Display updated seat count
console.log(`Seats remaining after registration: ${availableSeats}`);