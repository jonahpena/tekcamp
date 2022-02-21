import React, { Component } from "react";
import "./Stylesheets/SearchProduct.css";
import { useState } from "react";
import JSONDATA from "./data.json";
import { Link } from "react-router-dom";
import Product from "./components/Product";

function SearchProduct(props) {
  const [searchTerm, setSearchTerm] = useState("");
  const { product, onAdd } = props;
  return (
    <div className="searchContainer">
      <form>
        <input
          onChange={(event) => {
            setSearchTerm(event.target.value);
          }}
          placeholder="Search"
          className="inputText"
          type="text"
        />
      </form>
      {JSONDATA.filter((product) => {
        if (searchTerm == "") {
          return product;
        } else if (
          product.name.toLowerCase().includes(searchTerm.toLowerCase())
        ) {
          return product;
        }
      }).map((product, key) => {
        return (
          <div className="product" key={key}>
            <div className="infoContainer">
              <img className="imageContainer" src={product.image} />
              <Link to={"/product/" + product.id}>
                <p className="productName">{product.name}</p>
              </Link>
              <p className="productPrice">{product.price}</p>
              <button onClick={() => onAdd(product)}>Add To Cart</button>
            </div>
          </div>
        );
      })}
    </div>
  );
}

export default SearchProduct;
