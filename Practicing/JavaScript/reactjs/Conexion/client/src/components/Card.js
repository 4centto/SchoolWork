import React from 'react'
import './styles/Card.css'

const Card = ({nombre, onClick}) => {

    return (
        <div className="card" onClick={onClick} id={nombre}>
            <p className="nombre" id={nombre}>{nombre}</p>
            <p className="hover" id={nombre}>Eliminar</p>
        </div>
    )

}

export default Card