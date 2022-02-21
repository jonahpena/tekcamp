import React from "react";
import ReactDOM from "react-dom";
import NavBar from "./NavBar";
import ProductDetails from "./ProductDetails";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import JSONDATA from "./data.json";
import { useState } from "react";
import Basket from "./components/Basket";
import Header from "./components/Header";
import Main from "./components/Main";
import Checkout from "./Checkout";

function Home() {
  const [myData, setMyData] = useState(JSONDATA);
  const [cartItems, setCartItems] = useState([]);

  const onAdd = (product) => {
    const exist = cartItems.find((x) => x.id === product.id);

    if (exist) {
      setCartItems(
        cartItems.map((x) =>
          x.id === product.id ? { ...exist, quantity: exist.quantity + 1 } : x
        )
      );
    } else {
      setCartItems([...cartItems, { ...product, quantity: 1 }]);
    }
  };
  const onRemove = (product) => {
    const exist = cartItems.find((x) => x.id === product.id);

    if (exist.quantity === 1) {
      setCartItems(cartItems.filter((x) => x.id !== product.id));
    } else {
      setCartItems(
        cartItems.map((x) =>
          x.id === product.id ? { ...exist, quantity: exist.quantity - 1 } : x
        )
      );
    }
  };
  return (
    <div>
      <Router>
        <Header countCartItems={cartItems.length} />

        <Switch>
          <Route exact path="/">
            <Main products={myData} onAdd={onAdd} />
          </Route>
          <Route exact path="/cart">
            <Basket onRemove={onRemove} onAdd={onAdd} cartItems={cartItems} />
          </Route>
          <Route exact path="/cart/checkout">
            <Basket onRemove={onRemove} onAdd={onAdd} cartItems={cartItems} />
            <Checkout />
          </Route>
          <Route path="/product/:id" component={ProductDetails}>
            <ProductDetails onAdd={onAdd} propsData={myData} />
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default Home;
