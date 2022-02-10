import "./CommentPost.css";

function CommentPost(props) {
  return (
    <div className="commentPost">
      <div className="iconNameButton">
        <img src="favicon.ico" />
        <h1>Name here</h1>
        <p>2h ago</p>
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
    </div>
  );
}
export default CommentPost;
