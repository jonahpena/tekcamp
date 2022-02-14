import React, { useEffect, useState } from "react";
import User from "./User";

//.env_end will not work here, only .env
const API_KEY = process.env.REACT_APP_API_KEY;

export default function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("https://dummyapi.io/data/v1/user", {
      headers: {
        "app-id": API_KEY,
      },
    })
      .then((response) => response.json())
      .then((jsonResponse) => setUsers(jsonResponse.data));
  }, []);

  let userList = users.map((user) => {
    return <User user={user} />;
  });

  return <div>{userList}</div>;
}
