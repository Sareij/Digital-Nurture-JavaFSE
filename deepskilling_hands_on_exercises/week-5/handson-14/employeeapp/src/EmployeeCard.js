import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  return (
    <div className={theme === 'dark' ? 'dark-card' : 'light-card'} style={{
      border: '1px solid #ccc',
      padding: '10px',
      margin: '5px 0',
      backgroundColor: theme === 'dark' ? '#333' : '#f9f9f9',
      color: theme === 'dark' ? '#fff' : '#000'
    }}>
      <p><strong>Name:</strong> {employee.name}</p>
      <p><strong>Role:</strong> {employee.role}</p>
      <button className={theme === 'dark' ? 'dark-button' : 'light-button'}>
        View Profile
      </button>
    </div>
  );
}

export default EmployeeCard;