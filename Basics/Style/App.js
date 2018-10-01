import React from 'react';
import { StyleSheet, Text, View,Image} from 'react-native';

export default class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {isShowingText: true};

    // Toggle the state every second
    setInterval(() => {
      this.setState(previousState => {
        return { isShowingText: !previousState.isShowingText };
      });
    }, 200);
  }

  render() {
    let pic = {
      uri: 'https://www.rover.com/blog/wp-content/uploads/2018/05/everything-you-need-to-know-about-doggo-lingo-HERO-960x540.jpg'
    };
    let display = this.state.isShowingText ? this.props.text : 'Esta imagen es de perritos *corregir linea*';

    return(
      <View style={styles.imageContainer}>
         <Image source={pic} style={{width: 355, height: 200}}/>
          <View style={styles.imageContainer}>
            <Text style={styles.descriptionText}>{display}</Text>
            <Text style={styles.secundaryText}>Soy estático</Text>
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
    fontSize: 24,
    color: 'rgba(96,100,109, 1)',
    lineHeight: 24,
    textAlign: 'center',
    color: 'red',
    fontWeight: 'bold',
  },
  secundaryText: {
    fontSize: 17,
    color: 'rgba(96,100,109, 1)',
    lineHeight: 24,
    textAlign: 'center',
    color: 'blue',
    marginTop:30,
  },
});
