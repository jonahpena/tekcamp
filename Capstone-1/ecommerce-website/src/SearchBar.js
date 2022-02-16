import React from "react";
import "./SearchBar.css";

class SearchBar extends React.Component {
  render() {
    return (
      <div className="searchContainer">
        <form className="formContainer">
          <input placeholder="Search" className="inputText" type="text" />
        </form>
      </div>
    );
  }
}

export default SearchBar;
