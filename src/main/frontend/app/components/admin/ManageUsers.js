import React, { useState, useEffect } from "react";
import fetchData from "../../functions/fetchData";
import UsersTableHeading from "./UsersTableHeading";
import UsersTableRows from "./UsersTableRows";

const ManageUsers = (props) => {
  const [users, setUsers] = useState([]);

  const userGetApi = "/api/v1/users/all-full";

  const fetchUsers = () => fetchData(userGetApi, setUsers);
  useEffect(fetchUsers, []);

  const mapUsers = users.map((user) => (
    <UsersTableRows user={user} key={user.id} />
  ));

  return (
    <div>
      <h1 className="section-h align-center">User Statistics</h1>
      <table className="hover">
        <UsersTableHeading />
        <tbody>{mapUsers}</tbody>
      </table>
    </div>
  );
};

export default ManageUsers;
