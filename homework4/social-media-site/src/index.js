import React from "react";
import ReactDOM from "react-dom";
import Button from "react-bootstrap/Button";
import "bootstrap/dist/css/bootstrap.min.css";
import NavigationBar from "./NavigationBar";
import CommentPost from "./CommentPost";
import WhatsHappening from "./WhatsHappening";
import PostTweet from "./PostTweet";
import MiddleNavBar from "./MiddleNavBar";
import ProfileSection from "./ProfileSection";
import UserList from "./UserList";

function App() {
  return (
    <div>
      <ul>
        <ProfileSection />
        <MiddleNavBar />
        <PostTweet />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
        <CommentPost />
      </ul>
    </div>
  );
}
ReactDOM.render(<App />, document.getElementById("root"));
