import * as React from 'react';
import * as ReactDOM from "react-dom";
import GoogleMapReact from 'google-map-react';
import {useState} from "react";
import axios from "axios";
import Regist from "../login/regist";

const Map:React.FC = () => {
    return(
        <>

        </>
    )
}


export default Map;

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Map/>, e);
}
