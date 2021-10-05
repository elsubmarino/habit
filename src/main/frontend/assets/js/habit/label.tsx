import * as React from 'react';
import LabelList from "./labelList";
import axios from "axios";
import {useState} from "react";

const Label : React.FC =() =>{

    // const add = () => {
    //     axios({
    //         url:'/label/add',
    //         data:
    //     })
    // }
    const [labelList,setLabelList] = useState([]);

    const listAll = () =>{
        axios({
            url:'/label/listAll',
            method:'post',
        }).then((response)=>{
            setLabelList(response.data);
        }).catch((e)=>{
            alert("에러가 발생했습니다.");
        });
    }

    return(
        <div>
            <span>Label</span><span>+</span>
            <LabelList
                list={labelList}
            />
        </div>
    )
}

export default Label;
