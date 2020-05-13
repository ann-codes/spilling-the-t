import React from "react";
import { Link } from "react-router-dom";

const UsersTableRows = ({user}) => {
  return (
    <tr>
      <td>{user.id}</td>
      <td><Link to={`/profile/${user.username}`} target="_blank">{user.username}</Link></td>
      <td>{user.firstName}</td>
      <td>{user.lastName}</td>
      <td>{`${user.firstName} ${user.lastName[0]}.`}</td>
      <td>{user.email}</td>
      <td>{user.location}</td>
      <td>
        <img src={user.imageUrl} className="user-img-thumb-resize" />
      </td>
      <td>{user.reviews.length}</td>
    </tr>
  );
};

export default UsersTableRows;