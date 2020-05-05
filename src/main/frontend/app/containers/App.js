import React from "react";
import { BrowserRouter, Switch, Route } from "react-router-dom";
import UsersNew from "../components/UsersNew";

const App = (props) => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/" component={UsersNew} />
        <Route exact path="/accounts-new" component={UsersNew} />
      </Switch>
    </BrowserRouter>
  );
};
export default App;
