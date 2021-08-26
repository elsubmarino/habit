import * as React from "react";
import * as ReactDOM from 'react-dom';


const MainSubList: React.FC = (props) => {



    return (
        <div>
            {
                props.list.length > 0 ?
                    props.list.map((d, index) =>
                        <>
                            <div key={`rs-${index}`}>{d}</div>
                            <button key={index} onClick={()=>props.remove(index)}>삭제</button>
                        </>
                    )

                    : null
            }
        </div>
    );
}

export default MainSubList;

