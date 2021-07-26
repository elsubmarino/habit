import * as React from 'react'
import * as ReactDOM from "react-dom";
import axios from "axios";
import {useState} from "react";

export default function Login() {
    const [id, setId] = useState('');
    const [password, setPassword] = useState('');

    const submit = () => {

        axios({
            method: 'POST',
            url: '/loginProgress',
            data: {id: id, password: password}
        }).then(() => {
            alert('asdfasdf');
        }).catch((err) => {
            alert(err);
        });
    }


    return (
        <React.Fragment>
            아이디: <input type={"text"} name={'id'}
                        onChange={(e) => setId(e.target.value)}/><br/>
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

