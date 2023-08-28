import { useEffect, useState } from "react";
import { Spinner } from "react-bootstrap";
import { Badge, Button, Col, Container, Form, Nav,Card, Navbar, NavDropdown, Row } from "react-bootstrap";
import Table from 'react-bootstrap/Table';
import { Link } from "react-router-dom";
import MySpinner from "../layout/MySpinner";
import Apis, { endpoints } from "../configs/Apis";
const Home = () => {
    const [city, setCity] = useState(null);
    const loadCity = async () => {
        let res = await Apis.get(endpoints['city'])
        setCity(res.data);
    }
    const [major, setMajor] = useState(null);
    const loadMajor = async () => {
        let res = await Apis.get(endpoints['major'])
        setMajor(res.data);
    }
    const [typeJob, setTypeJob] = useState(null);
    const loadTypeJob = async () => {
        let res = await Apis.get(endpoints['typeJob'])
        setTypeJob(res.data);
    }
    const [edu, setEdu] = useState(null);
    const loadEdu = async () => {
        let res = await Apis.get(endpoints['education'])
        setEdu(res.data);
    }
    const [job, setJob] = useState(null);
    const loadJob = async () => {
        try {
            let res = await Apis.get(endpoints['job'])
            setJob(res.data);
        } catch (error) {
            console.log(error);
        }
    }


    useEffect(() => {
        loadCity();
        loadMajor();
        loadTypeJob();
        loadEdu();
        loadJob();
    }, [])

    if (city === null || major === null || edu === null || typeJob === null || job === null)
        return <MySpinner />

    return (
        <>
            <Navbar expand="lg" className="bg-body-tertiary">
                <Container>

                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="me-auto">
                            <Link className="nav-link" to="/">Lọc</Link>
                            <NavDropdown title=" Thành phố" id="basic-nav-dropdown">
                                {city.map(c => {
                                    let h = `/?cityId=${c.id}`;
                                    return <Link className="dropdown-item" to={h} key={c.id}>{c.nameCity}</Link>
                                })}

                            </NavDropdown>
                            <NavDropdown title="Nghề nghiệp" id="basic-nav-dropdown">
                                {major.map(m => {
                                    let mj = `/?majorId=${m.id}`;
                                    return <Link className="dropdown-item" to={mj} key={m.id}>{m.nameMajor}</Link>
                                })}

                            </NavDropdown>
                            <NavDropdown title="Hình thức" id="basic-nav-dropdown">
                                {typeJob.map(m => {
                                    let mj = `/?typeJob=${m.id}`;
                                    return <Link className="dropdown-item" to={mj} key={m.id}>{m.nameType}</Link>
                                })}

                            </NavDropdown>
                            <NavDropdown title="Học vấn" id="basic-nav-dropdown">
                                {edu.map(m => {
                                    let mj = `/?edu=${m.id}`;
                                    return <Link className="dropdown-item" to={mj} key={m.id}>{m.typeEducation}</Link>
                                })}

                            </NavDropdown>
                        </Nav>
                    </Navbar.Collapse>

                </Container>

            </Navbar>


            <Container className="mt-5">
                <Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>Hình ảnh</th>
                            <th>Công việc</th>
                            <th>Mức lương</th>
                            <th>Số lượng</th>
                            <th>Ngành tuyển dụng</th>
                            <th>Nhà tuyển dụng</th>
                            <th>Ngày đăng</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        {Object.values(job).map(c => {
                            return <tr>
                                 <td>
                                 <Card style={{ width: '10rem' }}>
                                 <Card.Img variant="top" src={c.avatarJob} fluid rounded  />
                                 </Card>
                                 </td>
                               
                                <td>{c.nameJob}</td>
                                <td>{c.salary} VNĐ</td>
                                <td>{c.soLuongTuyenDung}</td>
                                <td>{c.employerID.nganhNghe}</td>
                                <td>{c.employerID.nameEmployer}</td>
                                <td>{c.createdDate}</td>
                               

                                <td>
                                    <Button variant="danger">Xoá</Button>
                                </td>
                            </tr>
                        })}
                    </tbody>
                </Table>
            </Container>

        </>
    )
}
export default Home;