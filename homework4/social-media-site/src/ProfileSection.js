import "./Stylesheets/profileSection.css";

function ProfileSection() {
  return (
    <div className="profileSection">
      <div>
        <div className="pictureButtonContainer">
          <img src="logo192.png" />
        </div>
        <h1>Jonah Pena</h1>
        <p className="profileSectionText">Gender: Male</p>
        <p className="profileSectionText">Born: 05/22/94</p>
        <div className="followingFollowersContainer">
          <p className="profileSectionText">Carrollton, TX - USA</p>
          <p className="profileSectionText"></p>
        </div>
      </div>
    </div>
  );
}

export default ProfileSection;
