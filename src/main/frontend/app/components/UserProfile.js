import React, { useState, useEffect } from "react";
import NotFound404 from "./NotFound404";
import fetchData from "../functions/fetchData";
import UserProfileShow from "./UserProfileShow";

const UserProfile = (props) => {
  const [profile, setProfile] = useState({});
  const usernameParam = props.match.params.username;
  const apiGetPath = `/api/v1/user/${usernameParam}`;
  const fetchUser = () => fetchData(apiGetPath, setProfile);
  useEffect(fetchUser, {});

  if (profile === null) {
    return <NotFound404 />;
  } else {
    return <UserProfileShow profile={profile} />;
  } 
};

export default UserProfile;
