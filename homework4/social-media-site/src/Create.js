import { useState } from "react";

const Create = () => {
  const [title, setTitle] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const blog = { title };
    console.log(blog);

    fetch("http://localhost:9000/blogs", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      title: JSON.stringify(blog),
    }).then(() => {
      console.log("new blog ADDED");
    });
  };

  return (
    <div className="create">
      <h2>Add a New Blog</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          required
          value={title}
          onChange={(e) => setTitle(e.target.value)}
        />
        <button>Leave comment</button>
      </form>
    </div>
  );
};

export default Create;
