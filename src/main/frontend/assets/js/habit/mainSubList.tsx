import * as React from "react";
import * as ReactDOM from 'react-dom';


const MainSubList: React.FC = (props) => {

    const change = (id,description) =>{
        let list = [...props.list];
        let item = list.filter(data => data.id === id)[0];
        item.description = description;
        props.setList(list);
    }

    return (
        <div>
            {
                props.list.length > 0 ?
                    props.list.map((d, index) =>
                        <div key={`key-${index}`}>
                            <input type={'text'} key={`rs-${index}`} id={d.id} contentEditable={true} onChange={(e)=>change(d.id,e.target.value)}
                            value={d.description}/>
                            <button onClick={()=>props.modify(d.id)}>수정</button>
                            <button onClick={()=>props.remove(d.id)}>삭제</button>
                            <br/>
                        </div>
                    )

                    : null
            }
        </div>
    );
}

export default MainSubList;

