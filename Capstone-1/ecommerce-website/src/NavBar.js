import "./NavBar.css";
import App from "./App";
import { Link } from "react-router-dom";

function NavBar() {
  return (
    <div className="NavContainer">
      <img className="logo" src="logo192.png" height="50px" width="50px"></img>
      <Link to={"/"}>
        <button className="homeButton">Home Button</button>
      </Link>
      <button className="cartButton">0</button>
    </div>
  );
}

export default NavBar;
