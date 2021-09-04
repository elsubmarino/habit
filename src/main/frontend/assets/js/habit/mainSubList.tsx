import * as React from "react";
import * as ReactDOM from 'react-dom';


const MainSubList: React.FC = (props) => {



    return (
        <div>
            {
                props.list.length > 0 ?
                    props.list.map((d, index) =>
                        <>
                            <div key={`rs-${index}`} id={d.id}>{d.description}</div>
                            <button key={index} onClick={()=>props.remove(d.id)}>삭제</button>
                        </>
                    )

                    : null
            }
        </div>
    );
}

export default MainSubList;

