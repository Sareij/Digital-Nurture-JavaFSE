import React from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const books = [
    { title: 'Atomic Habits', author: 'James Clear' },
    { title: 'Deep Work', author: 'Cal Newport' }
  ];

  const blogs = [
    { title: 'Understanding React Hooks', author: 'Saranya' },
    { title: 'ES6 Made Easy', author: 'Saranya' }
  ];

  const courses = [
    { name: 'React JS Fundamentals', duration: '4 weeks' },
    { name: 'Java Full Stack', duration: '12 weeks' }
  ];

  return (
    <div>
      <h1>Blogger App</h1>
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
      <CourseDetails courses={courses} />
    </div>
  );
}

export default App;