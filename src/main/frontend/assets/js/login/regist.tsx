import * as React from 'react';
import {useState} from 'react';
import axios from "axios";

const Regist: React.FC = () =>{
    const [id,setId] = useState('');
    const [password,setPassword] = useState('');
    const [email,setEmail] = useState('');

    const submit = () => {
        axios({
            url:'',

        }).then().catch();
    }1

    return(
        <>
         <table>
             <tbody>
                <tr>
                    <td>아이디</td>
                    <td>
                        <input type={"text"} name={"id"} id={"id"} onChange={(e)=>setId(e.target.value)}/>
                    </td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td>
                        <input type={"password"} name={"password"} id={"passsword"} onChange={(e)=>setPassword(e.target.value)}/>
                    </td>
                </tr>
                <tr>
                    <td>이메일 주소</td>
                    <td>
                        <input type={"email"} name={"email"} id={"email"} onChange={(e)=>setEmail(e.target.value)}/>
                    </td>
                </tr>
             </tbody>
         </table>
            <input type={"text"} name={"submit"} id={"submit"} onClick={()=>submit()} value={"가입"}/>
        </>
    )
}

export default Regist;