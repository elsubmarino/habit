import * as React from 'react';
import * as ReactDOM from "react-dom";
import GoogleMap from "google-map-react";

const Maps: React.FC = () => {
    return (
        <div className={"map"}>
            <GoogleMap
                bootstrapURLKeys={{key: 'AIzaSyBTS0xCGQKFcUMRH0LQO6sYRHliLhLlZGA'}}
                defaultZoom={15}
                defaultCenter={{lat: 37.5, lng: 127}}>
            </GoogleMap>
        </div>
    )
}


export default Maps;

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Maps/>, e);
}
