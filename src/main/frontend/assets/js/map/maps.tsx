import * as React from 'react';
import * as ReactDOM from "react-dom";
import GoogleMap from "google-map-react";
const Maps: React.FC = () => {

    const watchId = navigator.geolocation.watchPosition((position) => {
        console.log(JSON.stringify(position));
        // Create the object to update this.state.mapRegion through the onRegionChange function
        latitude:       position.coords.latitude
        longitude:      position.coords.longitude
    }, (error)=>console.log(error));

    return(
        <div style={{width:'500px',height:'500px'}}>
            <GoogleMap
                bootstrapURLKeys = {{ key:process.env.REACT_APP_GOOGLE_API_KEY }}
                defaultZoom={15}
                defaultCenter={{ lat: 33, lng: 100 }}
                ></GoogleMap>
        </div>
    );
}


export default Maps;

const e = document.querySelector('div#container');
if (e != null) {
    ReactDOM.render(<Maps/>, e);
}
