import React from 'react';

function CourseDetails({ courses }) {
  return (
    <div>
      <h2>Course Details</h2>
      {courses.length > 0 && (
        <ul>
          {courses.map((course, index) => (
            <li key={index}>{course.name} - {course.duration}</li>
          ))}
        </ul>
      )}
      {courses.length === 0 && <p>No courses available.</p>}
    </div>
  );
}

export default CourseDetails;