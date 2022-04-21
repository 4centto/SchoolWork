import React from 'react'
import Button from '../components/Button'
import '../components/styles/Main.css'

const Main = () => {

    return (
        <div className="cont-main">
            <div className="main">
                <Button  
                    to="/productos"
                    text="MOSTRAR"
                />
                <Button  
                    to="/insertar"
                    text="INSERTAR"
                />
                <Button  
                    to="/eliminar"
                    text="BORRAR"
                />
            </div>
        </div>
    )

}

export default Main