import React from 'react';

function App() {
  // Single office object
  const office = {
    name: "Downtown Business Hub",
    rent: 55000,
    address: "12 MG Road, Bengaluru"
  };

  // List of offices
  const officeList = [
    { name: "Downtown Business Hub", rent: 55000, address: "12 MG Road, Bengaluru" },
    { name: "Tech Park Suite", rent: 72000, address: "45 Outer Ring Road, Bengaluru" },
    { name: "Riverside Offices", rent: 48000, address: "9 Riverside Ave, Chennai" },
    { name: "Skyline Towers", rent: 95000, address: "78 Skyline Blvd, Hyderabad" }
  ];

  return (
    <div>
      <h1>Office Space Rental App</h1>

      <img 
        src="https://images.unsplash.com/photo-1497366216548-37526070297c?w=400" 
        alt="Office Space" 
        width="400" 
      />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Address:</strong> {office.address}</p>
      <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
        <strong>Rent:</strong> {office.rent}
      </p>

      <h2>All Available Offices</h2>
      {officeList.map((item, index) => (
        <div key={index} style={{ border: '1px solid #ccc', padding: '10px', margin: '10px 0' }}>
          <p><strong>Name:</strong> {item.name}</p>
          <p><strong>Address:</strong> {item.address}</p>
          <p style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> {item.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;