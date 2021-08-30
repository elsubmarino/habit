import * as React from "react";
import * as ReactDOM from 'react-dom';
import MainSubList from "./mainSubList";
import {useEffect, useState} from "react";
import HabitList from "./habitList";
import Folder from "./folder";
import axios from "axios";

const Paging : React.FC = (props) => {


    return(
        <>
            {
                [...Array(props.totalPages)].map((n,index)=>{
                    return <li>
                        <a href={`/habit/list/${index+1}`}>
                        {index+1}
                        </a>
                    </li>
                })
            }
        </>
    )
}

export default Paging;