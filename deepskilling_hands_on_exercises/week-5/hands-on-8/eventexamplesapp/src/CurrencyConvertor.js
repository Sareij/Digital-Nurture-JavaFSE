import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: null
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ rupees: event.target.value });
  }

  handleSubmit() {
    const rate = 0.011; // approx conversion rate INR to EUR
    const euros = (this.state.rupees * rate).toFixed(2);
    this.setState({ euros: euros });
  }

  render() {
    return (
      <div>
        <h2>Currency Convertor (INR to EUR)</h2>
        <input 
          type="number" 
          placeholder="Enter amount in Rupees" 
          value={this.state.rupees}
          onChange={this.handleChange} 
        />
        <button onClick={this.handleSubmit}>Convert</button>
        {this.state.euros !== null && (
          <p>{this.state.rupees} INR = {this.state.euros} EUR</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;