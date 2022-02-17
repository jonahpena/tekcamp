import React from "react";
import ReactDOM from "react-dom";
import App from "./App";

import NavBar from "./NavBar";
import SearchBar from "./SearchBar";

ReactDOM.render(
  <React.StrictMode>
    <NavBar />
    <SearchBar />
  </React.StrictMode>,
  document.getElementById("root")
);
