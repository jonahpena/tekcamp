import React from "react";
import ReactDOM from "react-dom";
import ImageList from "./ImageList";
import NavBar from "./NavBar";

ReactDOM.render(
  <React.StrictMode>
    <NavBar />
    <ImageList />
  </React.StrictMode>,
  document.getElementById("root")
);
