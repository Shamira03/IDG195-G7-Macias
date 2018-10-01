import React from 'react';
import { StyleSheet, Text, View,Image} from 'react-native';

export default class App extends React.Component {
  render() {
    let pic = {
      uri: 'https://www.rover.com/blog/wp-content/uploads/2018/05/everything-you-need-to-know-about-doggo-lingo-HERO-960x540.jpg'
    };
    return(
      <View style={styles.imageContainer}>
         <Image source={pic} style={{width: 355, height: 200}}/>
          <View style={styles.imageContainer}>
            <Text style={styles.descriptionText}>Esta imagen es de perritos</Text>
          </View>
      </View>
      )
  
  }
}

const styles = StyleSheet.create({
  imageContainer: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  descriptionContainer: {
    alignItems: 'center',
    marginHorizontal: 50,
    marginTop: 180,
  },
  descriptionText: {
    fontSize: 17,
    color: 'rgba(96,100,109, 1)',
    lineHeight: 24,
    textAlign: 'center',
  },
});
