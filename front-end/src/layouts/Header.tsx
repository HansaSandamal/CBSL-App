import React from "react";
import {Nav, Navbar, NavDropdown} from "react-bootstrap";
 

const Header: React.FC = () => {
    return (
        <Navbar className='font-link' collapseOnSelect expand="lg" bg="dark" variant="dark">
            <Navbar.Brand href="/"> <span className="p-3">CBSL</span></Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav"/>
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav className="mr-auto">
                    <Nav.Link href="/">HOME</Nav.Link>

                    <NavDropdown title="SERVICES" id="collapsible-nav-dropdown">
                        <NavDropdown.Item href="/persons">Person Details</NavDropdown.Item>

                        <NavDropdown.Divider/>
                        <NavDropdown.Item href="/banks">Banks Details</NavDropdown.Item>
                    </NavDropdown>
                    <Nav.Link href="/about">ABOUT US</Nav.Link>
                </Nav>
                <Nav>
                    
                    <Nav.Link eventKey={2} href="/contacts">
                        CONTACTS
                    </Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    )
}
export default Header;
