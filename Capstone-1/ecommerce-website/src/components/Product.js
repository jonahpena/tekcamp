import React from "react";
import "../Stylesheets/SearchProduct.css";

export default function Product(props) {
  const { product, onAdd } = props;
  return (
    <div>
      <img className="imageContainer" src={product.image} alt={product.name} />
      <h3>{product.name}</h3>

      <div>${product.price}</div>
      <div>
        <button onClick={() => onAdd(product)}>Add To Cart</button>
      </div>
    </div>
  );
}
