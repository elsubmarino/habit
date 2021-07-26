import * as React from 'react';
import Login from './login/login';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from 'react-router-dom';
const App: React.FC = () => {
  return (
      <div>
          <Link to="/login">로그인</Link>
          <Switch>
              <Route path="/login" component={Login}/>
          </Switch>
      </div>
);
}

export default App;