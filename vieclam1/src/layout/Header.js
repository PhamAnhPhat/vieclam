import { useEffect, useState } from "react";
import { Spinner } from "react-bootstrap";
import { Badge, Button, Col, Container, Form, Nav, Navbar, NavDropdown, Row } from "react-bootstrap";
import { Link } from "react-router-dom";
import Apis, { endpoints } from "../configs/Apis";
const Header = () => {
    return (<>
        <Navbar expand="lg" className="bg-body-tertiary">
            <Container>
                <Navbar.Brand href="#home">&#128178;WORK</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        <Link className="nav-link" to="/"> Trang chủ</Link>
                        <Link className="nav-link" to="/"> Hồ sơ</Link>
                        <Link className="nav-link" to="/"> Quản trị</Link>
                        <Link className="nav-link" to="/"> Thống kê</Link>
                        <Link className="nav-link" to="/"> Đăng ký nhà tuyển dụng</Link>
                        <Link className="nav-link" to="/"> Tìm kiếm ứng viên</Link>
                        <Link className="nav-link" to="/"> Đánh giá</Link>

                        <Link className="nav-link" to="/"> Đăng nhập</Link>
                        <Link className="nav-link" to="/"> Đăng ký</Link>
                        <Link className="nav-link" to="/"> Đăng xuất</Link>
                        
                    </Nav>
                </Navbar.Collapse>
                
            </Container>
            
        </Navbar>
        
    </>)
}
export default Header; 