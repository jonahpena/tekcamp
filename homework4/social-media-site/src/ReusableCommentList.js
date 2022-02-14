const ReusableCommentList = ({ blogs, title }) => {
  console.log(blogs, title);

  return (
    <div className="ReusableCommentList">
      <h2>{title}</h2>
      {blogs.map((blog) => (
        <div className="blog-preview" key={blog.id}>
          <h2>{blog.title}</h2>
        </div>
      ))}
    </div>
  );
};

export default ReusableCommentList;
