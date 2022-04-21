const date = new Date()

const Fecha = () => {

    const dia = date.getDate()
    const mes = date.getMonth() + 1
    const annio = date.getFullYear()

    return dia + "/" + mes + "/" + annio

}

const Hora = () => {

    const horas = date.getHours()
    const minutos = date.getMinutes()

    return horas + ":" + minutos

}

export { Fecha, Hora }