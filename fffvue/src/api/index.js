import axios from 'axios'

const API_ROOT = 'http://localhost:8080/api/'

axios.defaults.baseURL = API_ROOT

axios.defaults.headers.Accept = 'application/json'

export default {
    getVideosByTag(tag)
    {
        return axios.get("/getVideosByTag?tag="+tag)
    }
}