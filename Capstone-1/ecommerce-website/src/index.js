import React from "react";
import ReactDOM from "react-dom";
import NavBar from "./NavBar";
import SearchProduct from "./SearchProduct";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import ProductDetails from "./ProductDetails";

ReactDOM.render(
  <React.StrictMode>
    <Router>
      <NavBar />
      <Switch>
        <Route exact path="/">
          <SearchProduct />
        </Route>
        <Route path="/product/:id">
          <ProductDetails />
        </Route>
      </Switch>
    </Router>
  </React.StrictMode>,
  document.getElementById("root")
);
