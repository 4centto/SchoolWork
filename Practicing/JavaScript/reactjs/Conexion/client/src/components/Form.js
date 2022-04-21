import React from 'react'
import './styles/Form.css'

const Form = ({onSubmit, onChange}) => {

    return (
        <div className="cont-form">
            <div className="form">
                <form autoComplete="off" onSubmit={onSubmit}>
                    <div className="entrada">
                        <input type="text" placeholder="Producto" name="producto" id="producto" onChange={onChange}/>
                    </div>
                    <div className="entrada">
                        <input type="number" placeholder="Bolsas existentes" name="existencias" id="existencias" onChange={onChange} />
                    </div>
                    <div className="entrada">
                        <input type="number" placeholder="Cant. por bolsa" name="cantidades" id="cantidades" onChange={onChange} />
                    </div>
                    <div className="entrada">
                        <input type="number" placeholder="Precio individual" name="precio" id="precio" onChange={onChange} />
                    </div>
                    <div className="entrada">
                        <input type="submit" name="enviar" id="enviar" value="AGREGAR" />
                    </div>
                </form>
            </div>
        </div>
    )

}

export default Form