import * as React from "react";
import * as ReactDOM from 'react-dom';
import MainSubList from "./mainSubList";
import {useEffect, useState} from "react";
import HabitList from "./habitList";
import Folder from "./folder";
import axios from "axios";

const Paging : React.FC = (props) => {
    const rendered = () =>{
        let items = [];
        if(props.pageable !== undefined) {
            for (let i = props.pageable.pageNumber; i < props.pageable.pageSize; i++) {
                items.push(<li>{i+1}</li>);
            }
        }
        return items;
    }

    return(
        <>
            {
                rendered()
            }
        </>
    )
}

export default Paging;