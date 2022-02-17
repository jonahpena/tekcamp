import React from "react";
import "./Stylesheets/SearchBar.css";
import { useState } from "react";
import JSONDATA from "./data.json";
import { Link } from "react-router-dom";

function SearchProduct() {
  const [searchTerm, setSearchTerm] = useState("");
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
              <Link to={`/product/:${val.id}`}>
                <p className="productName">{val.name}</p>
                <p className="productPrice">{val.price}</p>
              </Link>
            </div>
          </div>
        );
      })}
    </div>
  );
}

export default SearchProduct;
