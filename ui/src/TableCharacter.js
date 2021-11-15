import React, { Component } from "react";
import EditCharacter from "./EditCharacter";

export default class TableCharacter extends Component {
  constructor(props) {
    super(props);
    this.state = { showModal: 0 };
    this.filterSearchForName = this.filterSearchForName.bind(this);
  }

  filterSearchForName(e) {
    if (e.key === "Enter") {
      if (!e.target.value.length) this.setjson();
        
      this.setState(()=>({
            items: this.state.items.filter(
                (item) => {
                if (item.name.toLowerCase().search(e.target.value.toLowerCase()) !== -1) return item;
                else return null;
              }
            ),
            isLoaded: true,
            error: false,
            showModal: 0,
          }
        )
      );

    }

    
  }
  getjson() {
    fetch("http://localhost:8080/characters")
      .then((res) => res.json())
      .then(
        (data) => {
          var result = { isLoaded: true, items: data, showModal: 0 };
          return result;
        },
        (error) => {
          var result = { isLoaded: true, error, showModal: 0 };
          return result;
        }
      );
  }

  setjson() {
    fetch("http://localhost:8080/characters")
      .then((res) => res.json())
      .then(
        (data) => {
          this.setState({
            isLoaded: true,
            items: data,
            showModal: 0,
          });
        },

        (error) => {
          this.setState({
            isLoaded: true,
            error,
            showModal: 0,
          });
        }
      );
  }

  getModal = (value) => {
    this.setState({ showModal: value });
  };

  hideModal = (value) => {
    this.setState({ showModal: 0 });
  };
  componentDidMount() {
    this.setjson();
  }

  render() {
    const { error, isLoaded, items } = this.state;

    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
        <div className="container">
          <h2>Search by name</h2>
          <input
            type="text"
            placeholder="Go search by name: "
            className="search-inp"
            onKeyDown={this.filterSearchForName}
          />
          <table id="content-table">
            <thead>
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Status</th>
                <th>Species</th>
                <th>Type</th>
                <th>Gender</th>
              </tr>
            </thead>
            <tbody>
              {items.map((item, line) => (
                <tr key={line}>
                  <td>{item.id}</td>
                  <td>{item.name}</td>
                  <td>{item.status}</td>
                  <td>{item.species}</td>
                  <td>{item.type}</td>
                  <td>{item.gender}</td>
                  <td>
                    <input
                      type="button"
                      value="Edit"
                      className="btn btn-edit"
                      onClick={()=>this.getModal(item.id)}/>

                    <EditCharacter
                    characters ={this.state.items}
                      show={this.state.showModal === item.id}
                      onHide={() => this.hideModal(item.id)}
                      id={item.id}
                      name={item.name}
                      status={item.status}
                      species={item.species}
                      type={item.type}
                      gender={item.gender}/>
                  
                  </td>
         
                </tr>
                
              ))}
            </tbody>
          </table>
        </div>
      );
    }
  }
}
