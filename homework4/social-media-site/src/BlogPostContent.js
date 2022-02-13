import "./blogPostContent.css";
import "./User";
import { useState } from "react";

function BlogPostContent(props) {
  const [title, setTitle] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const blog = { title };
    console.log(blog);
  };
  return (
    <div className="blogPostContent">
      <div className="iconNameButton">
        <img src="favicon.ico" />
        <h1>Name Here</h1>
        <p className="timePosted">2h ago</p>
        <button className="followButton">Follow</button>
      </div>
      <h4 className="profileNameTwo">@Nameheretoo</h4>
      <p className="commentContent">
        Mollit nostrud reprehenderit ut labore est cupidatat laborum labore
        laborum culpa aliquip. Mollit nostrud reprehenderit ut labore est
        cupidatat laborum labore laborum culpa aliquip. laborum culpa aliquip.
        Mollit nostrud reprehenderit ut labore est cupidatat laborum labore
        laborum culpa aliquip.
      </p>
      <div className="commentPostIconContainer">
        <img className="likeCommentRetweet" src="logo192.png" />
        <img className="likeCommentRetweet" src="logo192.png" />
        <img className="likeCommentRetweet" src="logo192.png" />
      </div>
      <div className="commentPostIconContainer">
        <form onSubmit={handleSubmit}>
          <input
            type="text"
            required
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
          <button>Leave comment</button>
          <p> {title} </p>
        </form>
      </div>
    </div>
  );
}

export default BlogPostContent;
