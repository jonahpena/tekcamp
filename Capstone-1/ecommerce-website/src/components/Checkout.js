import "bootstrap/dist/css/bootstrap.min.css";
import { Form, FormGroup, Label, Input, Button, Row, Col } from "reactstrap";
import { Link } from "react-router-dom";

function Checkout() {
  return (
    <Form>
      <Row className="formContainer">
        <Col>
          <FormGroup>
            <Label for="exampleEmail">Email</Label>
            <Input
              id="exampleEmail"
              name="email"
              placeholder="with a placeholder"
              type="email"
            />
          </FormGroup>
        </Col>
        <Col md={6}>
          <FormGroup>
            <Label for="examplePassword">Password</Label>
            <Input
              id="examplePassword"
              name="password"
              placeholder="password placeholder"
              type="password"
            />
          </FormGroup>
        </Col>
      </Row>
      <FormGroup className="formContainer">
        <Label for="exampleAddress">Address</Label>
        <Input id="exampleAddress" name="address" placeholder="1234 Main St" />
      </FormGroup>
      <FormGroup className="formContainer">
        <Label for="exampleAddress2">Card #</Label>
        <Input id="exampleAddress2" name="address2" placeholder="Card #" />
      </FormGroup>
      <Row className="formContainer">
        <Col md={6}>
          <FormGroup>
            <Label for="exampleCity">City</Label>
            <Input id="exampleCity" name="city" />
          </FormGroup>
        </Col>
        <Col md={4}>
          <FormGroup>
            <Label for="exampleState">State</Label>
            <Input id="exampleState" name="state" />
          </FormGroup>
        </Col>
        <Col md={2}>
          <FormGroup>
            <Label for="exampleZip">Zip</Label>
            <Input id="exampleZip" name="zip" />
          </FormGroup>
        </Col>
      </Row>

      <Link className="checkout" to={"/cart/checkout/confirmation"}>
        <h1>
          <Button>Confirm Order</Button>
        </h1>
      </Link>
    </Form>
  );
}

export default Checkout;
