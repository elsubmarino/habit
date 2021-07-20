import React from 'react';
import ReactDOM from 'react-dom';
import axios from "axios";
class Login extends React.Component{
    constructor(props) {
        super(props);
        this.state={
            id:'',
            password:''
        }
    }

    submit(){

        axios({
            method:'POST',
            url:'/login',
            data:{id:this.state.id,password:this.state.password}
        }).then(()=>{
           alert('asdfasdf');
        }).catch((err)=>{
           alert(err);
        });
    }

    handleChange(e){
        this.setState({
            [e.target.name]:e.target.value
        })
    }

    render(){
        return(
            <React.Fragment>
                아이디: <input type={"text"} name={'id'}
                    onChange={(e)=>this.handleChange(e)}/><br/>
                암호: <input type={"password"} name={'password'}
                    onChange={(e)=>this.handleChange(e)}/>
                <br/>
                <input type={"button"} id={"submit"} name={"submit"} value={"로그인"}
                onClick={()=>this.submit()}
                />
            </React.Fragment>
        )
    }


}

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Login />, e);
}
