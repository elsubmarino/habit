import * as React from 'react';

const FolderList : React.FC = (props) =>{


    return(
        <>
            {props.folderList.length > 0 ?
                props.folderList.map((d, index) =>
                    <div key={'rs'+index}>
                        <a href='' onClick={}>{d}</a>
                        <button key={'key'+index} onClick={()=>props.remove(index)}>삭제</button>
                    </div>
                )

                : ''
            }
        </>
    )
}

export default FolderList;