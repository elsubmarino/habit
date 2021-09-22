import * as React from 'react';
import Login from './login/login';
import Main from'./habit/main';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from 'react-router-dom';
import Regist from "./login/regist";
import Map from "./map/map";
const App: React.FC = () => {
  return (
      <div>
          <Link to="/map">현재위치</Link>
          <Link to="/regist">회원가입</Link>
          <Link to="/login2">로그인</Link>
          <a href={"/oauth2/authorization/google"}>구글 로그인</a>
          <Switch>
              <Route path="/login2" component={Login}/>
              <Route path="/regist" component={Regist}/>
              <Route path={"/main"} component={Main}/>
              <Route path={"/map"} component={Map}/>
          </Switch>
      </div>
);
}

export default App;