import React, { useState } from 'react';
import ThemeContext from './ThemeContext';
import EmployeeList from './EmployeeList';

function App() {
  const [theme, setTheme] = useState('light');

  const employees = [
    { name: 'Arun Kumar', role: 'Software Engineer' },
    { name: 'Priya Sharma', role: 'Project Manager' },
    { name: 'Karthik Raj', role: 'QA Analyst' }
  ];

  const toggleTheme = () => {
    setTheme(prevTheme => (prevTheme === 'light' ? 'dark' : 'light'));
  };

  return (
    <ThemeContext.Provider value={theme}>
      <div style={{ padding: '20px' }}>
        <h1>Employee Management App</h1>
        <button onClick={toggleTheme}>
          Switch to {theme === 'light' ? 'Dark' : 'Light'} Theme
        </button>
        <hr />
        <EmployeeList employees={employees} />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;