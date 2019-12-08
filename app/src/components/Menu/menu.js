import React from 'react';

const menu = (props) => {
    let menu = ["", "", "", ""];
    menu[props.atual] = "active";

    console.log(menu);

    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <a className="navbar-brand" href="#">Clientes Surittec</a>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
            <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
                <ul className="navbar-nav">
                    <li className={`nav-item ${menu[0]}`}>
                    <a className="nav-link" href="#">Listar  <span className="sr-only">(Página atual)</span></a>
                    </li>
                    <li className={`nav-item ${menu[1]}`}>
                    <a className="nav-link" href="#">Adicionar</a>
                    </li>
                    <li className={`nav-item ${menu[2]}`}>
                    <a className="nav-link" href="#">Atualizar</a>
                    </li>
                    <li className={`nav-item ${menu[3]}`}>
                    <a className="nav-link" href="#">Remover</a>
                    </li>
                </ul>
            </div>
      </nav>
    );
}

export default menu;