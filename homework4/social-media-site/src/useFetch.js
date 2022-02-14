import { useState, useEffect } from "react";

const useFetch = (url) => {
  const [data, setData] = useState(null);
  useEffect(() => {
    fetch("url")
      .then((res) => {
        return res.json();
      })
      .then((res) => {
        setData(res);
        console.log(data);
      });
  }, [url]);
  return { data };
};

export default useFetch;
