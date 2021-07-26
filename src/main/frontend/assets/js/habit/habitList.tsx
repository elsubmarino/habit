import * as React from 'react';
import * as PropTypes from "prop-types";


const HabitList: React.FC = (props) => {


    return (
        <div>
            {
                props.list.length > 0 ?
                    props.list.map((d, index) =>
                        <div key={index}>{d}</div>
                    )

                    : null
            }
        </div>
    )
}

HabitList.propTypes={
    props:PropTypes.object.isRequired
}

export default HabitList;