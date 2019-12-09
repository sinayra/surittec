import React, { Component } from 'react';
import axios from 'axios';

class Cliente extends Component {
    
    handleDelete = (event) =>{
        
        axios.delete('http://localhost:8080/surittec/cliente/deletecliente/', {data: this.props.cliente}).then(res => {
            this.props.onDelete();

        }).catch(error => {
            if (error.response) {
                console.log(error.response.data);
                console.log(error.response.status);
                console.log(error.response.headers);
            } else if (error.request) {
                console.log(error.request);
            } else {
                // Something happened in setting up the request and triggered an Error
                console.log('Error', error.message);
            }
            console.log(error);
        });
    }

    render() {
        let cliente = this.props.cliente;
        return (
            <div className="row">
                <div className="col-sm border">{cliente.nome}</div>
                <div className="col-sm border">{cliente.cpf}</div>
                <div className="col-sm border border-white"><button type="button" className="btn btn-danger" onClick={this.handleDelete}>Excluir</button></div>
            </div>

        );
    }
}

export default Cliente;