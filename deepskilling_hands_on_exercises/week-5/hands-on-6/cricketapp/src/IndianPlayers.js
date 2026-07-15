import React from 'react';

function IndianPlayers() {
  const allPlayers = [
    'Player 1', 'Player 2', 'Player 3', 'Player 4', 'Player 5',
    'Player 6', 'Player 7', 'Player 8', 'Player 9', 'Player 10', 'Player 11'
  ];

  // Destructuring - odd and even index players
  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

  // Two arrays to merge
  const T20players = ['T20 Player A', 'T20 Player B', 'T20 Player C'];
  const RanjiTrophyPlayers = ['Ranji Player X', 'Ranji Player Y', 'Ranji Player Z'];

  // Merge feature of ES6 - spread operator
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team Players</h3>
      <ul>{oddTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h3>Even Team Players</h3>
      <ul>{evenTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h3>Merged T20 + Ranji Trophy Players</h3>
      <ul>{mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
    </div>
  );
}

export default IndianPlayers;