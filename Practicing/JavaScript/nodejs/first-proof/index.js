const express = require('express')
const mysql = require('mysql')

const app = express()

const db = mysql.createPool({
    host: "bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com",
    user: "ucn78cjcfakruihj",
    database: "bcszt5zxhmw2paaell6r",
    password: "VxUWRWcAk7GKO4pt5XIS"
})

app.get("/get", (req, res) => {
    db.query("SELECT * FROM productos", (err, response) => {
        res.send(response)
    })
})

const port = process.env.PORT || 9000

app.listen(port, () => {
    console.log("Running on port: " + port)
})