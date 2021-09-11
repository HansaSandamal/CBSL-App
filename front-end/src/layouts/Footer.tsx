import React from "react";
import Container from 'react-bootstrap/Container'
import {Col, Row} from "react-bootstrap";

const Footer: React.FC =() => {
    return (
        <div className="footer-body">
            <footer>
                <Container>
                    <Row>

                        <Col className='p-3'>
                            <span style={{fontWeight:"bold"}}>CENTRAL BANK SRI LANKA</span><br/>
                            No 25, Galle Face Center Rd, Colombo 80000
                        </Col>
                        <Col className='p-3'>
                    <span style={{fontWeight:"bold"}}>Follow Us On</span><br/>
                            <a className="social-media" href="https://www.facebook.com/TajSamudraColombo/"><i className="feather-facebook"/></a>
                            <a className="social-media" href="https://www.instagram.com/tajsamudracolombo/"><i className="feather-instagram"/></a>
                            <a className="social-media" href="https://www.twitter.com/tajsamudracolombo/"><i className="feather-twitter"/></a>
                            <a className="social-media" href="https://www.youtube.com/tajsamudracolombo/"><i className="feather-youtube"/></a>
                            <br/>

                    <span>&copy; CBSL.</span>
                        </Col>

                    <Col className='p-3'>
                    <span style={{fontWeight:"bold"}}>Contact Us</span> <br/>
                        TELEPHONE : +94113478291<br/>
                        WHATSAPP  : +94781234567<br/>
                        FAX       : +94113478291<br/>
                        EMAIL     : info@cbsl.com


                    </Col>
                    </Row>
                </Container>
            </footer>
        </div>

    )
}
export default Footer;