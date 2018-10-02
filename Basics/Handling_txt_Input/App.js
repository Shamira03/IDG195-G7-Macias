import React, { Component } from 'react';
import { AppRegistry, Text, TextInput, View, Image } from 'react-native';

export default class App extends Component {
  constructor(props) {
    super(props);
    this.state = {text: ''};
  }

  render() {
    let pic = {
      uri: 'https://www.rover.com/blog/wp-content/uploads/2018/05/everything-you-need-to-know-about-doggo-lingo-HERO-960x540.jpg'
    };
    return (

      <View style={{padding: 10, marginTop:100}}>
        <Image source={pic} style={{width: 355, height: 200}}/>
        <TextInput
          style={{height: 100}}
          placeholder="Escribe y habrá pizza!!!"
          onChangeText={(text) => this.setState({text})}
        />
        <Text style={{padding: 10, fontSize: 42}}>
          {this.state.text.split(' ').map((word) => word && '🍕').join(' ')}
        </Text>
      </View>
    );
  }
}
