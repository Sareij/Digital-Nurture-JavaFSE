import React from 'react';

function BookDetails({ books }) {
  if (books.length === 0) {
    return <p>No books available.</p>;
  } else {
    return (
      <div>
        <h2>Book Details</h2>
        <ul>
          {books.map((book, index) => (
            <li key={index}>{book.title} by {book.author}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default BookDetails;