import React, { useEffect, useState } from 'react'
import Loading from '../components/Loading'
import Axios from 'axios'
import Card from '../components/Card'
import '../components/styles/Eliminar.css'

const Eliminar = ({history}) => {

    const [ loading, setLoading ] = useState(false)
    const [ data, setData ] = useState([])

    useEffect(() => {
        setLoading(true)
        const func = async () => {

            try{
                const resp = await Axios.get("http://localhost:9000/api/imprimirProductos")
                const datos = resp.data
                setData(datos)

                setLoading(false)

            } catch(err){
                setLoading(false)
            }

        }

        func()
    }, [])

    const handleClick = (e) => {
        const elemento = e.target.getAttribute("id")

        setLoading(true)
        const func = async (elemento) => {

            const resp = await Axios.post("http://localhost:9000/api/eliminarProducto", {
                nombreProducto: elemento
            })

            setLoading(false)

            history.push("/")

        }

        func(elemento)

    }

    if(loading)
        return (<Loading />)

    return (
        <div className="cont-cards">
            <div className="cards">
                {
                    data.map((value) => {
                        
                        return ( <Card
                                    key={value.nombre_producto}
                                    nombre={value.nombre_producto}
                                    onClick={handleClick}
                                /> )
                    })
                }
            </div>
        </div>
    )

}

export default Eliminar