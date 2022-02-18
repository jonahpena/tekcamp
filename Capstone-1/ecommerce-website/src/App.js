import React from "react";
import axios from "axios";
import SearchProduct from "./SearchProduct";

class App extends React.Component {
  onSearchSubmit(term) {
    console.log(term);
  }

  render() {
    return (
      <div className="ui-container" style={{ marginTop: "10px" }}>
        <SearchProduct />
      </div>
    );
  }
}

export default App;
