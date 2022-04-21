import React from 'react'
import './styles/Button.css'
import { Link } from 'react-router-dom'

const Button = () => {

    return (
        <Link to="/consultas" className="cont-button">
            <button>CAMBIAR</button>
        </Link>
    )

}

export default Button