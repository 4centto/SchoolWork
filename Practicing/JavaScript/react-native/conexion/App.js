import React, { useEffect, useState } from 'react'
import { View, StyleSheet, Text, Dimensions } from 'react-native'
import { widthPercentageToDP as wp, heightPercentageToDP as hp } from 'react-native-responsive-screen' // Libreria para porcentajes de responsividad
import Axios from 'axios'

const App = () => {

  const [ datos, setDatos ] = useState([])
  const [ loading, setLoading ] = useState(false)

  useEffect(() => {
    const func = async () => {
      setLoading(true)

      try{
        const response = await Axios.get("https://proof-server.herokuapp.com/get")
        setDatos(response.data)

        setLoading(false)
      } catch(err){
        setLoading(false)
      }

    }

    func()
  }, [])

  if(loading)
    return (<View style={styles.container}><Text style={styles.text}>LOADING...</Text></View>)

  return (
    <View style={styles.container}>
      <View style={styles.main}>
        {
          datos.map((value) => {
            return (
              <View key={value.id} style={styles.row}>
                <View style={styles.colTitle}>
                  <Text style={styles.text}>{value.nombre}</Text>
                </View>
                <View style={styles.col}>
                  <Text style={styles.text}>{value.cantidad}</Text>
                </View>
                <View style={styles.col}>
                  <Text style={styles.text}>{value.precio}</Text>
                </View>
              </View>
            )
          })
        }
      </View>
    </View>
  )

}

const styles = StyleSheet.create({
  container: {
    backgroundColor: "#000",
    flex: 1,
    display: "flex",
    textAlign: "center",
    justifyContent: 'center',
    alignItems: 'center'
  },
  text: {
    color: "white",
    fontSize: 20
  },
  main: {
    backgroundColor: "#111111",
    width: wp(90),
    height: hp(90),
    display: "flex",
    flexDirection: "column",
    textAlign: "center",
    alignItems: "center",
    borderRadius: 10,
    padding: 10,
    overflow: "scroll",
  },
  row: {
    backgroundColor: "#222",
    width: wp(85),
    display: "flex",
    flexDirection: "row",
    textAlign: "center",
    alignItems: "center",
    justifyContent: "center",
    borderRadius: 10,
    margin: 5
  },
  col: {
    backgroundColor: "#777",
    margin: 5,
    width: 50,
    display: "flex",
    textAlign: "center",
    alignItems: "center",
    justifyContent: "center",
    borderRadius: 5
  },
  colTitle: {
    paddingLeft: 10,
    backgroundColor: "#777",
    margin: 5,
    width: 150,
    borderRadius: 5
  }
})

export default App