import React from 'react'
import '../components/styles/Consultas.css'
import Axios from 'axios'

class Consultas extends React.Component{

    componentDidMount(){
        Axios.post('http://localhost:3001/api/insert').then(() => {
            alert("Successful insert");
        })
    }

    render(){
        return (
            <div className="cont-consultas">
                <div className="consultas">

                </div>
            </div>
        )
    }

}

export default Consultas