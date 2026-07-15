import React from 'react';

function ListOfPlayers() {
  const players = [
    { name: 'Player 1', score: 45 },
    { name: 'Player 2', score: 78 },
    { name: 'Player 3', score: 62 },
    { name: 'Player 4', score: 91 },
    { name: 'Player 5', score: 30 },
    { name: 'Player 6', score: 85 },
    { name: 'Player 7', score: 55 },
    { name: 'Player 8', score: 72 },
    { name: 'Player 9', score: 68 },
    { name: 'Player 10', score: 99 },
    { name: 'Player 11', score: 40 }
  ];

  // map() - ES6 feature to display all players
  const allPlayers = players.map(p => `${p.name}: ${p.score}`);

  // arrow function + filter - players scoring below 70
  const lowScorers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players (Team of 11)</h2>
      <ul>
        {allPlayers.map((p, index) => <li key={index}>{p}</li>)}
      </ul>

      <h3>Players with Score Below 70</h3>
      <ul>
        {lowScorers.map((p, index) => (
          <li key={index}>{p.name}: {p.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListOfPlayers;