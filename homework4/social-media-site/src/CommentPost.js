import "./CommentPost.css";

function CommentPost(props) {
  return (
    <div className="commentPost">
      <div className="iconNameButton">
        <img src="favicon.ico" />
        <h1 className="profileName">Name here</h1>
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
    </div>
  );
}
export default CommentPost;
