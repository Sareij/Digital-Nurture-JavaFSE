import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeeList({ employees }) {
  return (
    <div>
      <h2>Employee List</h2>
      {employees.map((emp, index) => (
        <EmployeeCard key={index} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeeList;