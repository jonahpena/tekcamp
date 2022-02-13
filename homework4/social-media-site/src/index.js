import React from "react";
import ReactDOM from "react-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import PostTweet from "./PostTweet";
import MiddleNavBar from "./MiddleNavBar";
import ProfileSection from "./ProfileSection";
import UserList from "./UserList";
import BlogPostContent from "./BlogPostContent";
import User from "./User";
import UserListDisplay from "./UserListDisplay";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

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
