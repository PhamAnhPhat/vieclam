import axios from "axios";


export const endpoints = {
    "city":"/QLViecLam/api/GetCity/",
    "job":"/QLViecLam/api/createJob/",
    "major":"/QLViecLam/api/GetMajor/",
    "typeJob":"/QLViecLam/api/GetTypeJob/",
    "education":"/QLViecLam/api/GetEducation/"
}

export default axios.create({
    baseURL:"http://localhost:8080"
});