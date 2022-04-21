import React, { useState } from 'react'
import { Text, View, StyleSheet, Image, Alert, TouchableOpacity} from 'react-native' //Aqui importamos los componentes de rext-native
import Foto from './assets/minimalist.png'
import * as ImagePicker from 'expo-image-picker' //expo install expo-image-picker
import * as Sharing from 'expo-sharing' //expo install expo-sharing
/*
  Deploy apps whith React Native
  Android:
  expo build:android
*/


const App = () => {

  const [ image, setImagen ] = useState("")

  const openImagePicker = async () => {
    const res = await ImagePicker.requestMediaLibraryPermissionsAsync()
    
    if(res.granted === false){
      Alert.alert("Permission denied")
      return;
    }

    const imagen = await ImagePicker.launchImageLibraryAsync();
    
    if(imagen.cancelled === true){
      return;
    } else {
      setImagen(imagen.uri)
    }

  }

  const openShareDialog = async () => {
    if(!(await Sharing.isAvailableAsync())){
      alert("Sharing is not available on your platform");
      return;
    }

    await Sharing.shareAsync(image)

  }

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Hello World!</Text>
      <TouchableOpacity onPress={openImagePicker}>
        {
          image ?
            <Image
              source={{uri: image}}
              style={styles.image}
            />
          :
            <Image
              source={Foto}
              style={styles.image}
            />
        }
      </TouchableOpacity>
      {
        image ? 
        <TouchableOpacity onPress={openShareDialog} style={styles.button}>
          <Text style={{color: "black", fontSize: 25}}>Share</Text>
        </TouchableOpacity>
        : <View></View>
      }
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1, 
    justifyContent: 'center', 
    alignItems: 'center', 
    backgroundColor: '#292929'
  },
  title: {
    fontSize: 30, 
    color: '#fff',
    marginBottom: 10
  },
  image: {
    height: 200, 
    width: 200,
    borderRadius: 100,
    marginTop: 10
    //resizeMode: "contain"
  }, 
  button: {
    backgroundColor: "white",
    width: 200,
    height: 50,
    display: "flex",
    textAlign: "center",
    alignItems: "center",
    justifyContent: "center",
    marginTop: 30,
    borderRadius: 30
  }
})

export default App