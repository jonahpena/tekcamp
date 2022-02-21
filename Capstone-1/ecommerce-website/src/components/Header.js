import React from "react";
import { Link } from "react-router-dom";
import "../Stylesheets/Header.css";
import Navbar from "reactstrap";

export default function Header(props) {
  return (
    <header className="NavContainer">
      <div>
        <Link to={"/"}>
          <button className="homeButton">Home</button>
        </Link>
      </div>
      <div>
        {" "}
        <Link to={"/"}></Link>
      </div>
      <div>
        <img src="./images/cart1.png" />
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
