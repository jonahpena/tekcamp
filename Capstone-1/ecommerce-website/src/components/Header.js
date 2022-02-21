import React from "react";
import { Link } from "react-router-dom";
import "../Stylesheets/NavBar.css";

export default function Header(props) {
  return (
    <header className="NavContainer">
      <div>
        <Link to={"/cart"}>
          Cart{" "}
          {props.countCartItems ? (
            <button className="badge">{props.countCartItems}</button>
          ) : (
            ""
          )}
        </Link>{" "}
        <Link to={"/"}>
          <button className="homeButton">Home Button</button>
        </Link>
      </div>
    </header>
  );
}
