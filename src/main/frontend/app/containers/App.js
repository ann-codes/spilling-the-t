import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import NewStation from "./NewStation";

const App = (props) => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/stations/new" component={NewStation} />
      </Switch>
    </BrowserRouter>
  );
};
export default App;
