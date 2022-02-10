import React from "react";
import ReactDOM from "react-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import NavigationBar from "./NavigationBar";
import WhatsHappening from "./WhatsHappening";

function App() {
  return (
    <div>
      <WhatsHappening />
    </div>
  );
}
ReactDOM.render(<App />, document.getElementById("rightColumnComponent"));
