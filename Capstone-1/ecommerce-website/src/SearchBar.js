import React from "react";
import "./SearchBar.css";

class SearchBar extends React.Component {
  state = { term: "" };

  onFormSubmit = (event) => {
    event.preventDefault();

    console.log(this.state.term);
  };

  render() {
    return (
      <div className="searchContainer">
        <form onSubmit={this.onFormSubmit} className="formContainer">
          <input
            placeholder="Search"
            onChange={(e) => this.setState({ term: e.target.value })}
            className="inputText"
            type="text"
            value={this.state.term}
          />
        </form>
      </div>
    );
  }
}

export default SearchBar;
