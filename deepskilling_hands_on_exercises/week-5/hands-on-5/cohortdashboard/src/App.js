import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails 
        name="React Batch 1" 
        status="ongoing" 
        startDate="01-Jun-2026" 
        endDate="01-Sep-2026" 
      />
      <CohortDetails 
        name="Java Batch 3" 
        status="completed" 
        startDate="01-Jan-2026" 
        endDate="01-Apr-2026" 
      />
    </div>
  );
}

export default App;