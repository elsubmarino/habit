
import React from 'react';
import ReactDOM from 'react-dom';
import HabitList from "./habitList";

class Habit extends React.Component{
    constructor(props) {
        super(props);
        this.state={
            schedule:'',
            list:[]
        }
    }

    add(e){
        let list_ = [...this.state.list];
        list_.push(this.state.schedule);
        this.setState({
            list:list_
        })
    }

    handleChange(e){
        this.setState({
            [e.target.name]:e.target.value
        })
    }

    componentDidMount() {

    }

    render() {
        return (
            <div>
                <input type={'text'} name={'text'} name={'schedule'} onChange={(e)=>this.handleChange(e)} />
                <input type={'button'} onClick={(e)=>this.add(e)}/>
                <div>
                   <HabitList
                    list = {this.state.list}
                   />
                </div>
            </div>
        );
    }
}
const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Habit />, e);
}
