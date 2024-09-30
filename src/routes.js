import {
  BrowserRouter as Router,
  Route,
  Routes as ReactRoutes,
  Navigate,
} from 'react-router-dom';
import { SignUp } from './pages/SignUp/SignUp';
import { Login } from './pages/Login/Login';
import { Main } from './pages/Main/Main';

const Routes = () => (
  <Router>
    <ReactRoutes>
      <Route path='/signup' element={<SignUp />} />
      <Route path='/login' element={<Login />} />
      <Route path='/main' element={<Main />} />
      <Route path='*' element={<Navigate to='/login' />} />
      {/* Rota de fallback */}
    </ReactRoutes>
  </Router>
);

export default Routes;
