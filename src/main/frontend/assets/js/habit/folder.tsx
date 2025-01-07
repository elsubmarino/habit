import * as React from 'react';
import {useEffect, useState} from "react";
import FolderList from "./folderList";
import axios from "cbxios";

const Folder : React.FC = (props) =>{
    const [folderList,setFolderList] = useState([]);
    const [value,setValue] = useState('');

    //useEffect(() => {
    //   return () => setLoading(false);
    // }, []);


    const add = () =>{
        addToDb(value);
        /*let list = [...folderList];
        list.push(value);
        setFolderList(list);*/
    }

    const getList = () =>{
        axios({
            url:'/folder/list',
            method:'post'
        }).then(response=>{
            setFolderList(response.data);
        }).catch(e=>{
           alert("에러가 발생했습니다.");
        });
    }



    const addToDb = (value) =>{

        axios({
            url:'/folder/create',
            data:{title:value},
            method:'post'
        }).then((response)=>{
            let list = [...folderList];
            list.push(response.data);
            setFolderList(list);
            props.getList(0);
        }).catch((e)=>{
            alert("에러가 발생했습니다.");
        });
    }

    // const remove = (index) =>{
    //     let list = [...folderList];
    //     setFolderList(
    //     list.filter((d,curIndex)=> curIndex !== index )
    //     );
    // }

    const remove = (id)=>{
        axios({
            url:`/folder/delete/${id}`,
            data:{title:value},
            method:'post'
        }).then((data)=>{
            let list = [...folderList];
            setFolderList(
                list.filter((d)=> d.id !== id )
            );``
        }).catch((e)=>{
            alert("에러가 발생했습니다.");
        });
    }

    useEffect(()=>{
        getList()
    },[]);

    useEffect(()=>{
        return()=> {setFolderList([]); setValue('');}
    },[]);


    return(
        <>
            <input type={'text'} name='folder' onChange={(e)=>setValue(e.target.value)} />
            <button onClick={(e)=>add()}>
                추가
            </button>
            <FolderList
                getListByFolder={(folder,page)=>props.getListByFolder(folder,page)}
                folderList={folderList}
                remove={(id)=>remove(id)}
            />
        </>
    )
}

export default Folder;