import Data from "../src/data.json";
import "./ImageList.css";

function ImageList() {
  return (
    <div className="App">
      <div className="posts">
        {Data.map((product) => {
          return (
            <div key={product.id} className="products">
              <ul className="listContainer">
                <img className="imageContainer" src={product.image} />
                <p className="name">{product.name}</p>
                <p className="price">{product.price}</p>
                <div className="infoContainer">
                  <p className="quantity">In Stock: {product.quantity}</p>
                  <p className="serial">{product.serial}</p>
                  <form action="option">
                    <select className="optionSize">
                      <option value="S">S</option>
                      <option value="M">M</option>
                      <option value="L">L</option>
                    </select>
                  </form>
                  <button className="addCart">Add to Cart</button>
                </div>
              </ul>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default ImageList;
