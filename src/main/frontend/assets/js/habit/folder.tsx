import * as React from 'react';
import {useState} from "react";
import FolderList from "./folderList";
import axios from "axios";

const Folder : React.FC = () =>{
    const [folderList,setFolderList] = useState([]);
    const [value,setValue] = useState('');

    const add = () =>{
        let list = [...folderList];
        list.push(value);
        setFolderList(list);
    }

    const addToDb = () =>{
        axios({
            url:'',
            method:'post'
        })
    }

    const remove = (index) =>{
        let list = [...folderList];
        setFolderList(
        list.filter((d,curIndex)=> curIndex !== index )
        );
    }


    return(
        <>
            <input type={'text'} name='folder' onChange={(e)=>setValue(e.target.value)} />
            <button onClick={(e)=>add()}>
                추가
            </button>
            <FolderList
                folderList={folderList}
                remove={(index)=>remove(index)}
            />
        </>
    )
}

export default Folder;