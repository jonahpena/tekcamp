import { useParams } from "react-router-dom";
import JSONDATA from "./data.json";
import React, { Component } from "react";

const ProductDetails = (props) => {
  const { id } = useParams();
  console.log("child data", props);

  const productFilter = props.propsData.map((product) => {
    return (
      <div>
        <p>{product.id}</p>
        <img
          className="imageContainer"
          src={product.image}
          alt={product.name}
        />
        <p>{product.name}</p>
        <p>{product.price}</p>
      </div>
    );
  });

  return (
    <div className="product-details">
      <h2>Product Details - {id} </h2>
      {productFilter}
    </div>
  );
};

export default ProductDetails;
