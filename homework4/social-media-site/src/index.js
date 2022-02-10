import React from "react";
import ReactDOM from "react-dom";
import Button from "react-bootstrap/Button";
import "bootstrap/dist/css/bootstrap.min.css";
import NavigationBar from "./NavigationBar";
import CommentPost from "./CommentPost";
import ProfilePicture from "./ProfilePicture";

function App() {
  return (
    <div>
      <ul>
        <CommentPost />
        <CommentPost />
        <CommentPost />
      </ul>
    </div>
  );
}
ReactDOM.render(<App />, document.getElementById("root"));
