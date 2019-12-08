import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import ClienteList from './components/Cliente/clienteList.js'
import Menu from './components/Menu/menu.js'
import { BrowserRouter, Route } from 'react-router-dom'

function App() {
  return (

    <BrowserRouter>
      <div>
        <Menu/>
      </div>
      <div className="container-fluid">
        <Route path='/' exact component={ClienteList} />
        <Route path='/add' component={ClienteList} />
      </div>
    </BrowserRouter>
    

  );
}

export default App;
