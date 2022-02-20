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
      {JSONDATA.filter((val) => {
        if (searchTerm == "") {
          return val;
        } else if (val.name.toLowerCase().includes(searchTerm.toLowerCase())) {
          return val;
        }
      }).map((val, key) => {
        return (
          <div className="product" key={key}>
            <div className="infoContainer">
              <img className="imageContainer" src={val.image} />
              <Link to={"/product/" + val.id}>
                <p className="productName">{val.name}</p>
              </Link>
              <p className="productPrice">{val.price}</p>
              <button onClick={() => onAdd(product)}>Add To Cart</button>
            </div>
          </div>
        );
      })}
    </div>
  );
}

export default SearchProduct;
