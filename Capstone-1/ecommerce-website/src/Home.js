import React from "react";
import ReactDOM from "react-dom";
import NavBar from "./NavBar";
import SearchProduct from "./SearchProduct";
import ProductDetails from "./ProductDetails";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import JSONDATA from "./data.json";
import { Component } from "react";

export class Home extends Component {
  state = {
    myData: JSONDATA,
  };

  render() {
    console.log("from header", JSONDATA);
    return (
      <div>
        <Router>
          <NavBar />
          <Switch>
            <Route exact path="/">
              <SearchProduct />
            </Route>
            <Route path="/product/:id" component={ProductDetails}>
              <ProductDetails propsData={this.state.myData} />
            </Route>
          </Switch>
        </Router>
      </div>
    );
  }
}

export default Home;

/* function Home() {
  state = {
    myData: JSONDATA,
  };

  return (
    <div>
      <Router>
        <NavBar />
        <Switch>
          <Route exact path="/">
            <SearchProduct />
          </Route>
          <Route path="/product/:id" component={ProductDetails}>
            <ProductDetails propsData={this.state.myData} />
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default Home; */

/* function Home() {


  return (
    <div>
      <Router>
        <NavBar />
        <Switch>
          <Route exact path="/">
            <SearchProduct />
          </Route>
          <Route path="/product/:id" component={ProductDetails}>
            <ProductDetails/>
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default Home; */
