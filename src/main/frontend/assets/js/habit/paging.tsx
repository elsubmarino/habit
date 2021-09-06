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
                props.prevPage!==null?
                    <a href={'#'} onClick={()=>props.getList(props.prevPage.pageNumber)}>이전</a>
                    :null
            }
            {
                props.pageList.length > 0 ?
                props.pageList.map(d=>{
                    return <li><a href={'#'} onClick={()=>props.getList(d.pageNumber)}>{d.pageNumber+1}</a></li>
                })
                    :null
            }
            {
                props.nextPage!==null?
                    <a href={'#'} onClick={()=>props.getList(props.nextPage.pageNumber)}>이후</a>
                    :null
            }
        </>
    )
}

export default Paging;