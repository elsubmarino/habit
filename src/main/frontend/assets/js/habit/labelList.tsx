import * as React from 'react';

const LabelList : React.FC = (props)=>{
    return(
        <div>
            {
                props.list.length != 0 ?
                  props.list.map(d=>{
                      <div>d.name</div>
                  })
                    : null
            }
        </div>
    )
}

export default LabelList;