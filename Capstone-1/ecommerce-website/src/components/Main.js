import React from "react";
import SearchProduct from "../SearchProduct";

export default function Main(props) {
  const { onAdd } = props;
  return (
    <div className="row">
      <SearchProduct onAdd={onAdd}></SearchProduct>
    </div>
  );
}
