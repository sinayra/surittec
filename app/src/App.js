import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import ClienteList from './components/Cliente/clienteList.js'
import Menu from './components/Menu/menu.js'

function App() {
  return (
    <div>
      <Menu atual={0} />
      <div className="container-fluid">
        <ClienteList/>
      </div>
    </div>
  );
}

export default App;
