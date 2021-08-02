import * as React from 'react';
import Login from './login/login';
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
          <Link to="/login">로그인</Link>
          <Switch>
              <Route path="/login" component={Login}/>
              <Route path="/regist" component={Regist}/>
          </Switch>
      </div>
);
}

export default App;