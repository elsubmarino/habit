import * as React from "react";
import * as ReactDOM from 'react-dom';
import MainSubList from "./mainSubList";
import {useEffect, useState} from "react";
import HabitList from "./habitList";
import Folder from "./folder";
import axios from "axios";
import Paging from "./paging";


const Main: React.FC = () => {
    const [schedule, setSchedule] = useState('');
    const [list, setList] = useState([]);

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


    const getList = () => {
        axios({
            url:'/habit/list',
            method:'post'
        }).then(res=>{
            //alert(JSON.stringify(res.data));
            setList(res.data);
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
                            list={list.content}
                            remove={(id)=>remove(id)}
                        />
                        <Paging
                           pageable = {list.pageable}
                           totalElements = {list.totalElements}
                           totalPages = {list.totalPages}
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
