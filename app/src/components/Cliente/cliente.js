import React from 'react';

const cliente = (props) => {
    let cliente = props.cliente;

    return (
        <div>
            <span>{cliente.nome}</span>
            <span>{cliente.cpf}</span>
        </div>
    );
}

export default cliente;