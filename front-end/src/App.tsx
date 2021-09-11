import React from 'react';

import './App.css';
import Header from './layouts/Header';
import 'bootstrap/dist/css/bootstrap.min.css';
import Footer from './layouts/Footer';
import './assets/style_sheets/Main.scss';
import Home from './view/Home';
function App() {
  return (
    <div className="App">
      <Header/>
      <Home/>
      <Footer/>
    </div>
  );
}

export default App;
