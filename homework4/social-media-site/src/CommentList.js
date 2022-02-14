import { useEffect, useState } from "react";
import ReusableCommentList from "./ReusableCommentList";
import useFetch from "./useFetch";

const CommentList = () => {
  const [blogs, setBlogs] = useState(null);
  const { data } = useFetch("http://localhost:9000/blogs");

  return (
    <div className="commentList">
      {blogs && <ReusableCommentList blogs={data} title="All Blogs" />}
    </div>
  );
};

export default CommentList;
