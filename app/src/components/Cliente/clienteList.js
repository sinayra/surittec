import React, { Component } from 'react';
import Cliente from './cliente'
import axios from '../../commom/axios-local';

class ClienteList extends Component {
    state = {
        clientes: []
    }

    componentDidMount() {

        axios.get('http://localhost:8080/surittec/cliente/').then(res => {
            console.log(res.data.clientes);
            this.setState({ clientes: res.data.clientes });
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
        let clientesElems = this.state.clientes.map(c => {
            return (
                <Cliente key={c.id} cliente={c} />
            );
        }
        );

        return (
            <div>
                {clientesElems}
            </div>
        );
    }
}

export default ClienteList;