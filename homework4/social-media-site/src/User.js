import React from "react";

export default function User({ user }) {
  return (
    <div className="user">
      <h3>{user.firstName + " " + user.lastName}</h3>
      <img src={user.picture} alt={user.firstName + " " + user.lastName} />
    </div>
  );
}
