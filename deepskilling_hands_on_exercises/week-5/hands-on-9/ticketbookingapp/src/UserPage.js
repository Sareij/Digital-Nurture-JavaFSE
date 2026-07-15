import React from 'react';

function UserPage() {
  return (
    <div>
      <h2>Welcome back!</h2>
      <h3>Available Flights</h3>
      <ul>
        <li>Flight AI-101: Chennai to Delhi - 6:00 AM <button>Book</button></li>
        <li>Flight AI-202: Chennai to Mumbai - 9:30 AM <button>Book</button></li>
        <li>Flight AI-303: Chennai to Bengaluru - 2:00 PM <button>Book</button></li>
      </ul>
    </div>
  );
}

export default UserPage;