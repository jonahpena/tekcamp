import User from "./User";
import UserList from "./UserList";

function UserListDisplay() {
  return (
    <div className="UserListDisplay" key={User.id}>
      <UserList />
    </div>
  );
}

export default UserListDisplay;
