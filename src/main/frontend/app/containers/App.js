import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import NewStation from "./NewStation";
import NewUser from "./NewUser"
import Station from "./Station"
import Navigation from "../components/Navigation";
import Footer from "../components/Footer"

const App = (props) => {
  return (
    <BrowserRouter>
      <header>
        <h1>Spilling the T</h1>
      </header>
      <Navigation />
      <div className="row medium-10 columns">
        <Switch>
          <Route exact path="/stations" component={Station} />
          <Route exact path="/stations/new" component={NewStation} />
          <Route exact path="/users/new" component={NewUser} />
        </Switch>
      </div>
      <Footer />
    </BrowserRouter>
  );
};
export default App;