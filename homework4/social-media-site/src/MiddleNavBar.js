import NavOption from "./NavOption";
import "./MiddleNavBar.css";
import { Link } from "react-router-dom";

function MiddleNavBar() {
  return (
    <div className="middleNavBar">
      <div className="middleNavList">
        <Link to="/">Dashboard</Link>
        <Link to="/MyProfile">My Profile</Link>
      </div>
      <div className="buttonContainer"></div>
    </div>
  );
}

export default MiddleNavBar;
