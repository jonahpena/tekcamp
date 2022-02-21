import React from "react";
import { Link } from "react-router-dom";
import "../Stylesheets/Header.css";

export default function Header(props) {
  return (
    <header className="NavContainer">
      <div></div>
      <div>
        <Link to={"/"}>
          <button className="homeButton">Home</button>
        </Link>
      </div>
      <div>
        <Link className="cart" to={"/cart"}>
          {" "}
          {props.countCartItems ? (
            <button className="badge">{props.countCartItems}</button>
          ) : (
            ""
          )}
        </Link>{" "}
      </div>
    </header>
  );
}
