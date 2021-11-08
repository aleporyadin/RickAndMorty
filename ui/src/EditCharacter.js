import axios from "axios";
import React, { Component } from "react";

class EditCharacter extends Component {
  constructor(props) {
    super(props);
    this.state = {};
  }

  handleSubmit = (event) => {
    event.preventDefault();
    this.update = {
      id: event.target.elements.heroid.value,
      name: event.target.elements.heroname.value,
      status: event.target.elements.herostatus.value,
      species: event.target.elements.herospecies.value,
      type: event.target.elements.herotype.value,
      gender: event.target.elements.herogender.value,
    };
    axios
      .put("http://localhost:9901/", this.update)
      .then((response) => {
        if (response.status === 200) {
          window.location.reload();
        } else {
          console.log("Status: ", response.status);
          console.log("Data: ", response.data);
        }
      })
      .catch((error) => {
        console.error("Something went wrong!", error.response.data);
      });
  };
  render() {
    return (
      <React.Fragment>
        {this.props.show && (
          <div className="modal">
            <form onSubmit={this.handleSubmit} className="change-form">

              <div className="container-modal-form">
                <label>ID: </label>
                
                <input className="input-id" readOnly="readonly" type="number" name="heroid" defaultValue={this.props.id}></input>
                <label>Name:</label>
                
                <input type="text" name="heroname" defaultValue={this.props.name}></input>
               
                 <label>Status:</label>
                  <input type="text" name="herostatus" defaultValue={this.props.status}></input>
                 <label>Species:</label>
                  <input type="text" name="herospecies" defaultValue={this.props.species}></input>
                <label>Type:</label>
                  <input type="text" name="herotype" defaultValue={this.props.type}></input>
                <label>Gender:</label>
                  <input type="text" name="herogender" defaultValue={this.props.gender}></input>
              </div>
              <div className="container-btn-actions-form">
                <input type="submit" value="Change" className="btn btn-action-form" />
                <button onClick={this.props.onHide} className="btn btn-action-form">Close</button>
              </div>
            </form>
          </div>
        )}
      </React.Fragment>
    );
  }
}

export default EditCharacter;


