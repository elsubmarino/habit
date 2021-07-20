import React from 'react';
import ReactDOM from 'react-dom';
class Test extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        return(
            <React.Fragment>
                <span>asdfsdf</span>
            </React.Fragment>
        )
    }


}

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Test />, e);
}
