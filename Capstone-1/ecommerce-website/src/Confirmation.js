import "bootstrap/dist/css/bootstrap.min.css";
import { Form, FormGroup, Label, Input, Button, Row, Col } from "reactstrap";
import { Link } from "react-router-dom";
import "./Stylesheets/checkout.css";
import "./Stylesheets/confirmation.css";

function Confirmation() {
  return (
    <div className="confirmation">
      <h1>Order #239478014571956 Confirmed</h1>
    </div>
  );
}

export default Confirmation;
