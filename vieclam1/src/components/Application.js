import { useContext, useRef, useState } from "react";
import { Alert, Button, Form } from "react-bootstrap";
import { useNavigate } from "react-router-dom";
import Apis, { endpoints } from "../configs/Apis";
import MySpinner from "../layout/MySpinner";
import { MyUserContext } from "../App";


const Application = () => {
    const [user,] = useContext(MyUserContext);
    const avatar = useRef();
    const [err, setErr] = useState(null);
    const [loading, setLoading] = useState(false);
    const nav = useNavigate();
    const [application, SetApplication] = useState({
        "ho": "",
        "ten": "",
        "email": "",
        "sdt": "",
        "NgheNghiep": "",
        "trinhDoHocVan": "",
        "addressUser": "",
        "NamKinhNghiem": "",
        "Tuoi": "",
    });

    const applications = (evt) => {
        evt.preventDefault();

        const process = async () => {
            let form = new FormData();

            form.append("fileCV", avatar.current.files[0]);

            setLoading(true)
            let res = await Apis.post(endpoints['application'], form);
            if (res.status === 201) {
                nav("/login");
            } else
            setErr("Hệ thống bị lỗi!");
        }
            process();
    }
    

    const change = (evt, field) => {
        // setUser({...user, [field]: evt.target.value})
        SetApplication(current => {
            return {...current, [field]: evt.target.value}
        })
    }

    return <>
        <h1 className="text-center text-info mt-2"> ĐĂNG KÝ NGƯỜI DÙNG</h1>
        {err === null?"":<Alert variant="danger">{err}</Alert>}
        <Form onSubmit={applications}>
        <Form.Group className="mb-3">
                <Form.Label>Họ</Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "ho")} placeholder="Nhập họ.." required />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Tên</Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "ten")} placeholder="Tên" required />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Email</Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "email")} placeholder="email" required />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Nghề nghiệp</Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "NgheNghiep")} placeholder="NgheNghiep" />
            </Form.Group>

            <Form.Group className="mb-3">
                <Form.Label>Số điện thoại </Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "sdt")} placeholder="Số điện thoại" />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Trình độ học vấn </Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "trinhDoHocVan")} placeholder="Trình độ học vấn" />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Địa chỉ nhà </Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "addressUser")} placeholder="Địa chỉ nhà" />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Năm kinh nghiệm </Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "NamKinhNghiem")} placeholder="Số năm kinh nghiệm" />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Tuổi tác </Form.Label>
                <Form.Control type="text" onChange={(e) => change(e, "Tuoi")} placeholder="Tuổi tác" />
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Ảnh đại diện</Form.Label>
                <Form.Control type="file" ref={avatar} />
            </Form.Group>

            <Form.Group className="mb-3">
                <Button variant="info" type="submit">
                    Nộp đơn
                </Button>

            </Form.Group>
        </Form>
    </>
}

export default Application;