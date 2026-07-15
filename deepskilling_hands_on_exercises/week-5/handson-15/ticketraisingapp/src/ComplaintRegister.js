import React, { Component } from 'react';

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      employeeName: '',
      complaint: ''
    };
    this.handleNameChange = this.handleNameChange.bind(this);
    this.handleComplaintChange = this.handleComplaintChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleNameChange(event) {
    this.setState({ employeeName: event.target.value });
  }

  handleComplaintChange(event) {
    this.setState({ complaint: event.target.value });
  }

  handleSubmit(event) {
    event.preventDefault();

    if (this.state.employeeName.trim() === '' || this.state.complaint.trim() === '') {
      alert('Please fill in all fields before submitting.');
      return;
    }

    // Generate a reference number
    const referenceNumber = 'REF' + Math.floor(100000 + Math.random() * 900000);

    alert(
      `Complaint Registered Successfully!\n\n` +
      `Employee Name: ${this.state.employeeName}\n` +
      `Complaint: ${this.state.complaint}\n` +
      `Reference Number: ${referenceNumber}`
    );

    // Reset the form
    this.setState({ employeeName: '', complaint: '' });
  }

  render() {
    return (
      <div>
        <h1>Complaint Registration</h1>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Employee Name: </label>
            <input
              type="text"
              value={this.state.employeeName}
              onChange={this.handleNameChange}
            />
          </div>
          <br />
          <div>
            <label>Complaint: </label>
            <br />
            <textarea
              rows="5"
              cols="40"
              value={this.state.complaint}
              onChange={this.handleComplaintChange}
            />
          </div>
          <br />
          <button type="submit">Submit Complaint</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;