import React from "react";
import ReactDOM from "react-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import NavigationBar from "./NavigationBar";

function App() {
  return (
    <div>
      <NavigationBar />
    </div>
  );
}
ReactDOM.render(<App />, document.getElementById("leftColumnComponent"));
