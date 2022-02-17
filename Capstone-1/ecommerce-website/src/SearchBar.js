import React from "react";
import "./SearchBar.css";
import { useState } from "react";
import JSONDATA from "./data.json";

function SearchBar() {
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
              <p className="productName">{val.name}</p>
              <p className="productPrice">{val.price}</p>
            </div>
          </div>
        );
      })}
    </div>
  );
}

export default SearchBar;
