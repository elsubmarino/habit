import * as React from 'react';
import * as ReactDOM from "react-dom";
import GoogleMap from 'google-map-react';
import GoogleMapReact from 'google-map-react';
import {useState} from "react";
import axios from "axios";
import Regist from "../login/regist";

const Maps:React.FC = () => {
    return(
        <div className={"map"}>
            <GoogleMap >

            </GoogleMap>
        </div>
    )
}


export default Maps;

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Maps/>, e);
}
