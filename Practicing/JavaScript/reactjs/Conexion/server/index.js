const express = require('express')
const mysql = require('mysql')
const cors = require('cors')
const bodyParser = require('body-parser')

const app = express()

//Creacion a nuestra base de datos
const db = mysql.createPool({
    host: "bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com",
    user: "ucn78cjcfakruihj",
    database: "bcszt5zxhmw2paaell6r",
    password: "VxUWRWcAk7GKO4pt5XIS"
})

//Creacion de conversores
app.use(cors())
app.use(express.json())
app.use(bodyParser.urlencoded( { extended: true } ) )

//Link para obtener los productos
app.get("/api/imprimirProductos", (req, res) => {
    db.query("SELECT * FROM productos", (err, result) => {
        res.send(result)
    })
})

//Link para insertar un nuevo producto
app.post("/api/insertar", (req, res) => {

    const idProducto = req.body.idProducto
    const idUsuario = req.body.idUsuario
    const nombreProducto = req.body.nombreProducto
    const bolsasActuales = req.body.bolsasActuales
    const cantidadBolsa = req.body.cantidadBolsa
    const precioIndividual = req.body.precioIndividual
    const fecha = req.body.fecha
    const hora = req.body.hora

    db.query("INSERT INTO productos VALUES(?,?,?,?,?,?,?,?)", [idProducto, idUsuario, nombreProducto, bolsasActuales, cantidadBolsa, precioIndividual, fecha, hora], (err, response) => {
        res.send(response)  
    })
})

//Link para poder eliminar los productos
app.post("/api/eliminarProducto", (req, res) => {
    const nombreProducto = req.body.nombreProducto
    db.query("DELETE FROM productos WHERE nombre_producto = ? AND id_usuario = 1", [nombreProducto], (err, response) => {
        res.send(response)
    })
})

//Listener
const port = process.env.PORT || 9000

app.listen(port, () => {
    console.log("Running on port: " + port)
})