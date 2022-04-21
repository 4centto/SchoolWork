import React, { useState, useEffect } from 'react'
import useFetch from '../components/hooks/useFetch'
import Loading from '../components/Loading'
import '../components/styles/Mostrar.css'

const Mostrar = () => {

    //Creamos un estado de tipo arreglo que contendra los productos
    const {data, loading} = useFetch("http://localhost:9000/api/imprimirProductos")

    if(loading)
        return <Loading />

    return (
        <div className="cont-tabla">
            <div className="tabla">
                <table>
                    <tr className="fila">
                        <td className="columna"><span>Producto</span></td>
                        <td className="columna"><span>Bolsas Existentes</span></td>
                        <td className="columna"><span>Precio Individual</span></td>
                    </tr>
                    {
                        data.map((value) => {
                            return (
                                <tr className="fila">
                                    <td className="columna"><p>{value.nombre_producto}</p></td>
                                    <td className="columna"><p>{value.bolsasactuales_producto}</p></td>
                                    <td className="columna"><p>{value.precioindividual_producto}</p></td>
                                </tr>
                            )
                        })
                    }
                </table>
            </div>
        </div>
    )

}

export default Mostrar