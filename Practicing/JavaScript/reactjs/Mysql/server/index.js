const express = require('express')
const app = express()
const mysql = require('mysql')
const bodyParser = require('body-parser')
const cors = require('cors')

const db = mysql.createPool({
    host: "localhost",
    user: "root",
    password: "",
    database: "react"
});

app.use(cors())
app.use(express.json())
app.use(bodyParser.urlencoded({extended: true}))

app.post('/api/insert', (req, res) => {

    /*
    const id = req.body.variableRecibida //Recibir parametros
    db.query("INSERT INTO productos VALUES(?, ?, ?, ?)", [id, producto, cantidad, precio], (err, resp) => {
    });
    */

    db.query("SELECT * FROM productos", (err, resp) => {
        console.log(resp);
    });
});

app.listen(3001, () => {
    console.log("Running on port 3001");
});

