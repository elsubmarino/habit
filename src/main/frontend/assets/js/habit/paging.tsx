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
                props.pageList.length > 0 ?
                props.pageList.map(d=>{
                    return <li><a href={`/habit/list/${d.pageNumber}`}>{d.pageNumber+1}</a></li>
                })
                    :null
            }
        </>
    )
}

export default Paging;