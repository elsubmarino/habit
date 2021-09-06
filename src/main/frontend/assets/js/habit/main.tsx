import * as React from "react";
import * as ReactDOM from 'react-dom';
import MainSubList from "./mainSubList";
import {useEffect, useState} from "react";
import HabitList from "./habitList";
import Folder from "./folder";
import axios from "axios";
import Paging from "./paging";


const Main: React.FC = () => {
    //CherryPickRemoved
    const [schedule, setSchedule] = useState('');
    const [list, setList] = useState([]);
    const [pageList, setPageList] = useState([]);
    const [prevPage,setPrevPage] = useState('');
    const [nextPage,setNextPage] = useState('');

    const add = () =>
    {
        axios({
            url:'/habit/create',
            data:{description:schedule},
            method:'post'
        }).then((response)=>{
            let list_ = [...list];
            list_.push(response.data);
            setList(list_);
        }).catch((e)=>{
            alert("에러가 발생했습니다.");
        });
        // let list_ = [...list];
        // list_.push(schedule);
        // setList(list_);
    }

    const remove = (id) =>{

        axios({
            url:`/habit/delete/${id}`,
            data:{id:id},
            method:'post'
        }).then((res)=>{
            const list_ = [...list];
            setList(
                 list_.filter((d)=> d.id !== id )
            );
        }).catch((e)=>{
            alert("에러가 발생했습니다.");
        });
    }


    const getList = (page) => {
        page=(page==undefined?0:page);

        axios({
            url:`/habit/list/${page}`,
            method:'post'
        }).then(res=>{
            setPageList(res.data.pageList);
            setList(res.data.result.content);
            setPrevPage(res.data.prevPage);
            setNextPage(res.data.nextPage);
        }).catch(e=>{
            alert("에러가 발생했습니다.");
        })
    }

    useEffect(()=>{
        getList();
    },[]);


    return (
        <div>
            <div style={{width:"30%",float:'left'}}>
                <div>
                    <Folder/>
                </div>
            </div>
            <div style={{width:"70%",float:'right'}}>
                <div>
                    <input type={'text'} name={'schedule'} onChange={(e)=>setSchedule(e.target.value)}/>
                    <input type={'button'} onClick={(e) => add()}/>
                    <div>
                        <MainSubList
                            list={list}
                            remove={(id)=>remove(id)}
                        />
                        <Paging
                           pageList = {pageList}
                           nextPage = {nextPage}
                           prevPage = {prevPage}
                           getList={(page)=>getList(page)}
                        />
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Main;




const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Main/>, e);
}
