import "./profileSection.css";

function ProfileSection() {
  return (
    <div className="profileSection">
      <div>
        <div className="pictureButtonContainer">
          <img src="logo192.png" />
          <button className="editProfileButton">Edit Profile</button>
        </div>

        <h1>Jonah</h1>
        <p className="profileSectionText">@Jonah534523453</p>
        <p className="profileSectionText">Joined January 2022</p>
        <div className="followingFollowersContainer">
          <p className="profileSectionText">Following</p>
          <p className="profileSectionText">Followers</p>
        </div>
      </div>
    </div>
  );
}

export default ProfileSection;
