import * as React from 'react';
import * as ReactDOM from 'react-dom';
import HabitList from "./habitList";
import * as PropTypes from "prop-types";
import {useEffect, useState} from "react";
import axios from "axios";


const Habit: React.FC = () => {
    const [schedule, setSchedule] = useState('');
    const [list, setList] = useState([]);

    const add = () =>
    {
        let list_ = [...list];
        list_.push(schedule);
        setList(list_);
    }





    return (
        <div>
            <input type={'text'} name={'schedule'} onChange={(e)=>setSchedule(e.target.value)}/>
            <input type={'button'} onClick={(e) => add()}/>
            <div>
                <HabitList
                    list={list}
                />
            </div>
        </div>
    );
}

Habit.propTypes={
    schedule:PropTypes.number,
    list:PropTypes.array
}

export default Habit;




const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Habit/>, e);
}
