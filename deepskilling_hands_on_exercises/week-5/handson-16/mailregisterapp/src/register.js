import React, { Component } from 'react';

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: '',
      email: '',
      password: '',
      errors: {
        name: '',
        email: '',
        password: ''
      }
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  validateField(fieldName, value) {
    let error = '';

    if (fieldName === 'name') {
      if (value.trim().length < 5) {
        error = 'Name must be at least 5 characters long.';
      }
    }

    if (fieldName === 'email') {
      if (!value.includes('@') || !value.includes('.')) {
        error = 'Email must contain @ and a dot (.)';
      }
    }

    if (fieldName === 'password') {
      if (value.length < 8) {
        error = 'Password must be at least 8 characters long.';
      }
    }

    return error;
  }

  handleChange(event) {
    const { name, value } = event.target;
    const error = this.validateField(name, value);

    this.setState(prevState => ({
      [name]: value,
      errors: {
        ...prevState.errors,
        [name]: error
      }
    }));
  }

  handleSubmit(event) {
    event.preventDefault();

    const nameError = this.validateField('name', this.state.name);
    const emailError = this.validateField('email', this.state.email);
    const passwordError = this.validateField('password', this.state.password);

    this.setState({
      errors: {
        name: nameError,
        email: emailError,
        password: passwordError
      }
    });

    if (!nameError && !emailError && !passwordError) {
      alert(`Registration Successful!\nName: ${this.state.name}\nEmail: ${this.state.email}`);
    }
  }

  render() {
    return (
      <div>
        <h1>Mail Register</h1>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name: </label>
            <input
              type="text"
              name="name"
              value={this.state.name}
              onChange={this.handleChange}
            />
            {this.state.errors.name && <p style={{ color: 'red' }}>{this.state.errors.name}</p>}
          </div>
          <br />
          <div>
            <label>Email: </label>
            <input
              type="text"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
            />
            {this.state.errors.email && <p style={{ color: 'red' }}>{this.state.errors.email}</p>}
          </div>
          <br />
          <div>
            <label>Password: </label>
            <input
              type="password"
              name="password"
              value={this.state.password}
              onChange={this.handleChange}
            />
            {this.state.errors.password && <p style={{ color: 'red' }}>{this.state.errors.password}</p>}
          </div>
          <br />
          <button type="submit">Register</button>
        </form>
      </div>
    );
  }
}

export default Register;