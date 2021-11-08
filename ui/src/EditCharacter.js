import React, { Component } from "react";

class EditCharacter extends Component {
  render() {
    return (
      <React.Fragment>
        {this.props.show && (
          <div className="modal">
          
            <form method="POST" action="/" className="change-form">
              <label>Name:</label>
              <input defaultValue={this.props.name}></input>
              <label>Status:</label>
              <input defaultValue={this.props.status}></input>
              <label>Species:</label>
              <input defaultValue={this.props.species}></input>
              <label>Type:</label>
              <input defaultValue={this.props.type}></input>
              <label>Gender:</label>
              <input defaultValue={this.props.gender}></input>
              <button onClick={this.props.onHide} className="btn">Close</button>
            </form>
          
          </div>
        )}
      </React.Fragment>
    );
  }
}

export default EditCharacter;
