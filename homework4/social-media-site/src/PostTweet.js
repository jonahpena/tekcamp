import "./Stylesheets/PostTweet.css";

function PostTweet() {
  return (
    <div className="postTweet">
      <h1 className="postTitle">Home</h1>
      <form>
        <div className="postInputContainer">
          <img className="postAvatar" src="logo192.png" />
          <input className="postInput" placeholder="What's Happening?"></input>
        </div>
        <div className="iconButtonContainer">
          <div className="iconList">
            <img className="iconListItem" src="logo192.png" />
          </div>
          <div className="postTweetButtonContainer">
            <button className="postTweetButton">Tweet</button>
          </div>
        </div>
      </form>
    </div>
  );
}

export default PostTweet;
