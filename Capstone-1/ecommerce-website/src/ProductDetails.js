import { useParams } from "react-router-dom";
import JSONDATA from "./data.json";
import React, { Component } from "react";
import "./Stylesheets/SearchProduct.css";
import "./Stylesheets/ProductDetails.css";
import { Link } from "react-router-dom";

const ProductDetails = (props) => {
  const { id } = useParams();
  const product = props.propsData.find((x) => x.id == id);
  const { onAdd } = props;

  return (
    <div className="productDetails">
      <h2>{product.name}</h2>
      <h6>({product.category})</h6>
      <img className="imageContainer" src={product.image} />
      <p className="productPrice">{product.price}.00</p>
      <p className="productSerial">serial: #{product.serial}</p>
      <p className="productStock">In Stock: {product.quantity}</p>
      <button onClick={() => onAdd(product)}>Add To Cart</button>
      <Link to={"/cart"}>
        <p className="doneShopping">done shopping?</p>
      </Link>
    </div>
  );
};

export default ProductDetails;
