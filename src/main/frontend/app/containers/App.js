import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import NewStation from "./NewStation";
import NewUser from "./NewUser";
import Login from "./Login";
import StationContainer from "./StationContainer";
import Navigation from "../components/Navigation";
import Footer from "../components/Footer";
import StationShowPage from "../components/StationShowPage";
import MainAdmin from "./MainAdmin";
import ManageUsers from "../components/admin/ManageUsers"
import ManageReviews from "../components/admin/ManageReviews"
import ManageStations from "../components/admin/ManageStations"


const App = (props) => {
  return (
    <BrowserRouter>
      <header id="header">
        <img src="https://i.ibb.co/ngGmTZv/header.png" />
      </header>
      <Navigation />
      <div className="row medium-10 columns container">
        <Switch>
          <Route exact path="/stations" component={StationContainer} />
          <Route exact path="/stations/new" component={NewStation} />
          <Route exact path="/station/:id" component={StationShowPage} />
          <Route exact path="/users/new" component={NewUser} />
          <Route exact path="/login" component={Login} />
          <Route exact path="/admin" component={MainAdmin} />
          <Route exact path="/admin/manage/stations" component={ManageStations} />
          <Route exact path="/admin/manage/reviews" component={ManageReviews} />
          <Route exact path="/admin/manage/users" component={ManageUsers} />
        </Switch>
      </div>
      <Footer />
    </BrowserRouter>
  );
};
export default App;
