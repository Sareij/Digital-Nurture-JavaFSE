import React from 'react';
import { useParams } from 'react-router-dom';
import trainersData from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();
  const trainer = trainersData.find(t => t.TrainerId === parseInt(id));

  if (!trainer) {
    return <h2>Trainer not found</h2>;
  }

  return (
    <div>
      <h2>Trainer Details</h2>
      <p><strong>ID:</strong> {trainer.TrainerId}</p>
      <p><strong>Name:</strong> {trainer.Name}</p>
      <p><strong>Email:</strong> {trainer.Email}</p>
      <p><strong>Phone:</strong> {trainer.Phone}</p>
      <p><strong>Technology:</strong> {trainer.Technology}</p>
      <p><strong>Skills:</strong> {trainer.Skills}</p>
    </div>
  );
}

export default TrainerDetail;