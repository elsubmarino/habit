import * as React from 'react'
import * as ReactDOM from "react-dom";
import axios from "axios";
import {useState} from "react";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from 'react-router-dom';

export default function Login() {
    const [loginId, setLoginId] = useState('');
    const [password, setPassword] = useState('');

    const submit = () => {
        axios({
            method: 'POST',
            url: '/loginProgress',
            data: {loginId: loginId, password: password}
        }).then(response => {
            if(response.status === 200)
                location.assign("/main");
            else
                alert("아이디 혹은 비밀번호가 올바르지 않습니다.");
        }).catch((err) => {
            alert("잘못된 요청입니다.");
        });
    }


    return (
        <React.Fragment>
            아이디: <input type={"text"} name={'id'}
                        onChange={(e) => setLoginId(e.target.value)}/><br/>
            암호: <input type={"password"} name={'password'}
                       onChange={(e) => setPassword(e.target.value)}/>
            <br/>
            <input type={"button"} id={"submit"} name={"submit"} value={"로그인"}
                   onClick={()=>submit()}
            />
        </React.Fragment>
    )
}

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Login/>, e);
}

