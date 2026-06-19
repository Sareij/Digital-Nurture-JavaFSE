// Create an array of events
const events = [

    {
        name: "Music Festival",
        category: "Music"
    },

    {
        name: "Baking Workshop",
        category: "Workshop"
    }

];


// Add a new event using push()
events.push({

    name: "Rock Concert",
    category: "Music"

});

console.log("All Events:");
console.log(events);


// Filter only Music Events
const musicEvents = events.filter(

    event => event.category === "Music"

);

console.log("Music Events:");
console.log(musicEvents);


// Format display cards using map()
const eventCards = events.map(

    event => `Workshop on ${event.name}`

);

console.log("Formatted Event Cards:");
console.log(eventCards);