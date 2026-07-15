import React from 'react';

function BlogDetails({ blogs }) {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.length > 0 ? (
        <ul>
          {blogs.map((blog, index) => (
            <li key={index}>{blog.title} - {blog.author}</li>
          ))}
        </ul>
      ) : (
        <p>No blogs available.</p>
      )}
    </div>
  );
}

export default BlogDetails;