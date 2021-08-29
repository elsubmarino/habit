import * as React from 'react';

const FolderList : React.FC = (props) =>{


    return(
        <>
            {props.folderList !== ""  ?
                props.folderList.map((d, index) =>
                    <div key={'rs'+index} id={d.id}>
                        <a href=''>{d.title}</a>
                        <button key={'key'+index} onClick={()=>props.remove(d.id)}>삭제</button>
                    </div>
                )
                : ''
            }
        </>
    )
}

export default FolderList;