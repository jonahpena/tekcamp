import "./MiddleNavBar.css";
import { Link } from "react-router-dom";

function MiddleNavBar() {
  return (
    <div className="middleNavBar">
      <div className="middleNavList">
        <Link className="navLink" to="/">
          Dashboard
        </Link>
        <Link className="navLink" to="/MyProfile">
          My Profile
        </Link>
      </div>
    </div>
  );
}

export default MiddleNavBar;
