import "./NavigationBar.css";
import NavOption from "./NavOption";

function NavigationBar({ navItem }) {
  return (
    <div className="navigationBar">
      <div className="navList">
        <img src="favicon.ico" width="20px" height="20px" />
        <NavOption text={"Home"} />
        <NavOption text={"Explore"} />
        <NavOption text={"Notifications"} />
        <NavOption text={"Messages"} />
        <NavOption text={"Bookmarks"} />
        <NavOption text={"Lists"} />
        <NavOption text={"Profile"} />
      </div>
      <div className="buttonContainer">
        <button className="tweetButton">Tweet</button>
      </div>
    </div>
  );
}
export default NavigationBar;
