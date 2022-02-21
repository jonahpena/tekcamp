import React from "react";
import "../Stylesheets/Basket.css";
import { Form, FormGroup, Label, Input, Button, Row, Col } from "reactstrap";

import { Link } from "react-router-dom";
export default function Basket(props) {
  const { cartItems, onAdd, onRemove, itemQuantity } = props;
  const itemsPrice = cartItems.reduce((a, c) => a + c.quantity * c.price, 0);
  const taxPrice = itemsPrice * 0.14;
  const shippingPrice = itemsPrice > 2000 ? 0 : 20;
  const totalPrice = itemsPrice + taxPrice + shippingPrice;
  return (
    <aside className="cartItemsContainer">
      <div>
        <h2 className="flexCart">Shopping Cart</h2>
      </div>

      <div>
        {cartItems.length === 0 && (
          <div className="flexCart">Cart is empty</div>
        )}
        {cartItems.map((item) => (
          <div key={item.id} className="checkoutDetailsContainer">
            <div className="productName">{item.name}</div>
            <img
              className="imageContainerCart"
              src={item.image}
              alt={item.name}
            />
            <div className="addRemoveButtonContainer">
              <button onClick={() => onRemove(item)} className="remove">
                -
              </button>{" "}
              <button onClick={() => onAdd(item)} className="add">
                +
              </button>
            </div>

            <div className="productPrice">
              {item.quantity} * ${item.price.toFixed(2)}
            </div>
          </div>
        ))}

        {cartItems.length !== 0 && (
          <>
            <hr></hr>
            <div className="receiptInfo">
              <div>Item Total:</div>
              <div>${itemsPrice.toFixed(2)}</div>
            </div>
            <div className="receiptInfo">
              <div>Tax:</div>
              <div>${taxPrice.toFixed(2)}</div>
            </div>

            <div className="receiptInfo">
              <div>Shipping:</div>
              <div>${shippingPrice.toFixed(2)}</div>
            </div>

            <div className="receiptInfo">
              <div>
                <strong>Total:</strong>
              </div>
              <div>
                <strong>${totalPrice.toFixed(2)}</strong>
              </div>
            </div>
            <hr />
            <div>
              <Link className="checkout" to={"/cart/checkout"}>
                <Form>
                  <div>
                    <Button>Checkout</Button>
                  </div>
                </Form>
              </Link>
            </div>
          </>
        )}
      </div>
    </aside>
  );
}
