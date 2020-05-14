import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import NewStation from "./NewStation";
import NewUser from "./NewUser";
import NewReview from "./NewReview";
import Login from "./Login";
import StationContainer from "./StationContainer";
import Navigation from "../components/Navigation";
import Footer from "../components/Footer";
import StationShowPage from "../components/StationShowPage";
import MainAdmin from "./MainAdmin";
import ManageUsers from "../components/admin/ManageUsers";
import ManageReviews from "../components/admin/ManageReviews";
import ManageStations from "../components/admin/ManageStations";
import StationEdit from "../components/admin/StationEdit";
import UserProfile from "../components/UserProfile";
import Logout from "./Logout";

const App = (props) => {
  return (
    <BrowserRouter>
      <Navigation />
      <div className="hero align-center">
        <img className="masthead" src="https://i.ibb.co/ngGmTZv/header.png" />
      </div>
      <div className="row medium-10 columns container">
        <Switch>
          <Route exact path="/stations" component={StationContainer} />
          <Route exact path="/stations/new" component={NewStation} />
          <Route exact path="/station/:id" component={StationShowPage} />
          <Route exact path="/users/new" component={NewUser} />
          <Route exact path="/reviews/new" component={NewReview} />
          <Route exact path="/login" component={Login} />
          <Route exact path="/logout" component={Logout} />
          <Route exact path="/admin" component={MainAdmin} />
          <Route exact path="/admin/manage/stations" component={ManageStations} />
          <Route exact path="/admin/manage/reviews" component={ManageReviews} />
          <Route exact path="/admin/manage/users" component={ManageUsers} />
          <Route exact path="/edit/station/:id" component={StationEdit} />
          <Route exact path="/profile/:username" component={UserProfile} />
        </Switch>
      </div>
      <Footer />
    </BrowserRouter>
  );
};

export default App;
