import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        { itemname: 'Laptop', price: 55000 },
        { itemname: 'Headphones', price: 2500 },
        { itemname: 'Keyboard', price: 1200 },
        { itemname: 'Mouse', price: 700 },
        { itemname: 'Monitor', price: 9500 }
      ]
    };
  }

  render() {
    return (
      <div>
        <h1>Online Shopping Cart</h1>
        {this.state.items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;