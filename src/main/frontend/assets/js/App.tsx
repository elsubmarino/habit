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
const App: React.FC = () => {
  return (
      <div>
          <Link to="/regist">회원가입</Link>
          <Link to="/login2">로그인</Link>
          <a href={"/oauth2/authorization/google"}>구글 로그인</a>
          <Switch>
              <Route path="/login2" component={Login}/>
              <Route path="/regist" component={Regist}/>
              <Route path={"/main"} component={Main}/>
          </Switch>
      </div>
);
}

export default App;