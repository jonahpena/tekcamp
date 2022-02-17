import "./NavBar.css";
import App from "./App";

function NavBar() {
  return (
    <div className="NavContainer">
      <img className="logo" src="logo192.png" height="50px" width="50px"></img>
      <button className="cartButton">0</button>
    </div>
  );
}

export default NavBar;
