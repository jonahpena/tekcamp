import "./NavBar.css";
import SearchBar from "./SearchBar";

function NavBar() {
  return (
    <div className="NavContainer">
      <SearchBar />
      <img className="logo" src="logo192.png" height="50px" width="50px"></img>
      <button className="cartButton">0</button>
    </div>
  );
}

export default NavBar;
