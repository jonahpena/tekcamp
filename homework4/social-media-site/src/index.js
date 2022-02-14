import React from "react";
import ReactDOM from "react-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import PostTweet from "./PostTweet";
import MiddleNavBar from "./MiddleNavBar";
import ProfileSection from "./ProfileSection";
import BlogPostContent from "./BlogPostContent";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import CommentList from "./CommentList";
import Create from "./Create";

function App() {
  return (
    <Router>
      <div className="App">
        <MiddleNavBar />

        <div className="content">
          <Switch>
            <Route exact path="/">
              <ul>
                <Create />
                <PostTweet />
                <BlogPostContent />
                <BlogPostContent />
              </ul>
            </Route>
            <Route path="/MyProfile">
              <ul>
                <ProfileSection />
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
