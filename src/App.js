import React, { useState } from 'react';
import './App.css';

function App() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [message, setMessage] = useState('');
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  const handleLogin = () => {
    console.log('Log deve ser mantido! - alteração deverá ser descartada!');
    if (email === 'eduardo.lino@pucpr.br' && password === '123456') {
      setMessage('Acessado com sucesso!');
      setIsAuthenticated(true);
    } else {
      setMessage('Usuário ou senha incorretos!');
      setIsAuthenticated(false);
    }
    console.log('Log QUE deve ser descartado!');
  };

  return (
    <div className='login'>
      <h3 className='login__title'>
        Login ALTERAÇÃO QUE DEVERÁ SER DESCARTADA!!!!!!!
      </h3>

      <div className='login__form test'>
        <input
          type='email'
          placeholder='Email'
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          className='login__input'
        />
        <input
          type='password'
          placeholder='Senha'
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          className='login__input'
        />
      </div>

      <button onClick={handleLogin} className='login__button'>
        Acessar
      </button>
      {message && (
        <p
          className={`login__mesage login__message--${
            isAuthenticated ? 'success' : 'error'
          }`}
        >
          {message}
        </p>
      )}
    </div>
  );
}

export default App;
