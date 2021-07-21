import React from 'react';

export default class HabitList extends React.Component{
    constructor(props) {
        super(props);
    }



    render() {
        return(
            <div>
                {
                    this.props.list.length > 0 ?
                        this.props.list.map((d,index)=>
                            <div key={index}>{d}</div>
                        )

                        :null
                }
            </div>
        )
    }
}