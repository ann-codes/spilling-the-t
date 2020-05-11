import React from "react";

const UsersTableRows = ({user}) => {
  return (
    <tr>
      <td>{user.id}</td>
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