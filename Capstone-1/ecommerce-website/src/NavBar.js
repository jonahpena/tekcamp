import "./Stylesheets/NavBar.css";
import Header from "./components/Header";
import { Link } from "react-router-dom";

function NavBar() {
  return (
    <div className="NavContainer">
      <img className="logo" src="logo192.png" height="50px" width="50px"></img>
      <Link to={"/"}>
        <button className="homeButton">Home Button</button>
      </Link>
    </div>
  );
}

export default NavBar;
