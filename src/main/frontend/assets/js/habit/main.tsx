import * as React from "react";
import * as ReactDOM from 'react-dom';
import MainSubList from "./mainSubList";
import {useState} from "react";
import HabitList from "./habitList";
import Folder from "./folder";


const Main: React.FC = () => {
    const [schedule, setSchedule] = useState('');
    const [list, setList] = useState({});

    const add = () =>
    {
        let list_ = [...list];
        list_.push(schedule);
        setList(list_);
    }

    const remove = (currIndex) =>{
        const list_ = [...list];
        setList(
        list_.filter((d,index)=>index!==currIndex));
    }

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
                            remove={(index)=>remove(index)}
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
