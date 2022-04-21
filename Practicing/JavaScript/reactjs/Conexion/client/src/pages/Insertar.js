import React, { useState } from 'react'
import Form from '../components/Form'
import { Fecha, Hora } from '../components/hooks/fechas'
import Axios from 'axios'
import Loading from '../components/Loading'

const Insertar = ({history}) => {

    const [ datos, setDatos ] = useState({
        producto: '',
        existencias: '',
        cantidades: '',
        precio: ''
    })

    const [ loading, setLoading ] = useState(false)

    const handleClick = (e) => {
        e.preventDefault()

        setLoading(true)

        async function insertData(datos){
            try {
                setLoading(true)
                const res = await Axios.post("http://localhost:9000/api/insertar", {
                    idProducto: 0,
                    idUsuario: 1,
                    nombreProducto: datos.producto,
                    bolsasActuales: datos.existencias,
                    cantidadBolsa: datos.cantidades,
                    precioIndividual: datos.precio,
                    fecha: Fecha(),
                    hora: Hora()
                })
                setLoading(false)
                history.push("/")
            } catch (error) {
                setLoading(false)
            }
        }

        insertData(datos)

    }

    const handleChange = (e) => {
        setDatos({
            ...datos,
            [e.target.name]: e.target.value
        })
    }

    if(loading)
        return (<Loading />)

    return (
        <Form 
            onSubmit={handleClick}
            onChange={handleChange}
        />
    )
}

export default Insertar