import NavOption from "./NavOption";
import "./MiddleNavBar.css";

function MiddleNavBar() {
  return (
    <div className="middleNavBar">
      <div className="middleNavList">
        <NavOption text={"Tweets"} />
        <NavOption text={"Tweets & replies"} />
        <NavOption text={"Media"} />
        <NavOption text={"Likes"} />
      </div>
      <div className="buttonContainer"></div>
    </div>
  );
}

export default MiddleNavBar;
