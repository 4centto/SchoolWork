import React from 'react'
import { Link } from 'react-router-dom'
import './styles/Button.css'

const Button = (props) => {
    return (
        <Link to={props.to} className="cont-button">
            <div className="button">
                <button>{props.text}</button>
            </div>
        </Link>
    )
}

export default Button