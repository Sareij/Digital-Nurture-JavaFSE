import React from 'react';
import { Link } from 'react-router-dom';
import trainersData from './TrainersMock';

function TrainersList() {
  return (
    <div>
      <h2>Trainers List</h2>
      <ul>
        {trainersData.map(trainer => (
          <li key={trainer.TrainerId}>
            <Link to={`/trainers/${trainer.TrainerId}`}>{trainer.Name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainersList;