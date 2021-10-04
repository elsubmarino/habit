import * as React from 'react';
import LabelList from "./labelList";
import axios from "axios";

const Label : React.FC =() =>{

    const add = () => {
        axios({
            url:'/'
        })
    }

    return(
        <div>
            <span>Label</span><span>+</span>
            <LabelList/>
        </div>
    )
}

export default Label;
