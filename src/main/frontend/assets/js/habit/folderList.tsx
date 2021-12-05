import * as React from 'react';

const FolderList : React.FC = (props) =>{

    return(
        <>
            {props.folderList.length > 0  ?
                props.folderList.map((d, index) =>
                    <div key={'rs'+index} id={d.id}>
                        <a href={"#"} onClick={(folder,page)=>props.getListByFolder(d.id,0)}>{d.title}</a>
                        <button onClick={()=>props.modify(d.id)}>수정</button>
                        <button onClick={()=>props.remove(d.id)}>삭제</button>
                    </div>
                )
                : ''
            }
        </>
    )
}

export default FolderList;