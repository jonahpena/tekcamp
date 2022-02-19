import { useParams } from "react-router-dom";
import JSONDATA from "./data.json";
import React, { Component } from "react";
import "./Stylesheets/SearchProduct.css";

const ProductDetails = (props) => {
  const { id } = useParams();
  const product = props.propsData.find((x) => x.id == id);
  console.log("child data", props);

  return (
    <div className="productDetails">
      <h2>{product.name}</h2>
      <img className="imageContainer" src={product.image} />
      <h1>{product.price}</h1>
      <p>{product.serial}</p>
      <button>Add to Cart</button>
    </div>
  );
};

export default ProductDetails;
