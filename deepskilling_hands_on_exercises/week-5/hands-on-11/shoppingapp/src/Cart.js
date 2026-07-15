import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <div style={{ border: '1px solid #ccc', padding: '10px', margin: '5px 0' }}>
        <p><strong>Item:</strong> {this.props.itemname}</p>
        <p><strong>Price:</strong> ₹{this.props.price}</p>
      </div>
    );
  }
}

// Default Props - used if no prop is passed
Cart.defaultProps = {
  itemname: 'Unknown Item',
  price: 0
};

export default Cart;