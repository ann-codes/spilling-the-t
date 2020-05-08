import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import NewStation from "./NewStation";
import NewUser from "./NewUser";
import Login from "./Login";
import StationContainer from "./StationContainer";
import Navigation from "../components/Navigation";
import Footer from "../components/Footer";
import StationShowPage from "../components/StationShowPage";

const App = (props) => {
  return (
    <BrowserRouter>
      <header id="header">
        <img src="https://imgur.com/JQKEF1I.jpg" />
      </header>
      <Navigation />
      <div className="row medium-10 columns container">
        <Switch>
          <Route exact path="/stations" component={StationContainer} />
          <Route exact path="/stations/new" component={NewStation} />
          <Route exact path="/station/:id" component={StationShowPage} />
          <Route exact path="/users/new" component={NewUser} />
          <Route exact path="/login" component={Login} />
        </Switch>
      </div>
      <Footer />
    </BrowserRouter>
  );
};
export default App;
