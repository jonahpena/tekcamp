import React from "react";
import ReactDOM from "react-dom";
import Button from "react-bootstrap/Button";
import "bootstrap/dist/css/bootstrap.min.css";
import NavigationBar from "./NavigationBar";
import CommentPost from "./BlogPostContent";
import WhatsHappening from "./WhatsHappening";
import PostTweet from "./PostTweet";
import MiddleNavBar from "./MiddleNavBar";
import ProfileSection from "./ProfileSection";
import UserList from "./UserList";
import BlogPostContent from "./BlogPostContent";
import User from "./User";
import UserListDisplay from "./UserListDisplay";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import MyProfile from "./MyProfile";

function App() {
  return (
    <Router>
      <div className="App">
        <MiddleNavBar />

        <div className="content">
          <Switch>
            <Route exact path="/">
              <ul>
                <PostTweet />
                <BlogPostContent />
                <BlogPostContent />
                <BlogPostContent />
                <BlogPostContent />
              </ul>
            </Route>
            <Route path="/MyProfile">
              <ul>
                {/* <MyProfile /> */}
                <ProfileSection />
                <BlogPostContent />
                <BlogPostContent />
                <BlogPostContent />
                <BlogPostContent />
              </ul>
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  );
}
ReactDOM.render(<App />, document.getElementById("root"));
