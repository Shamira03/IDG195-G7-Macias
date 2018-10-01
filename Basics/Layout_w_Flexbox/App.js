import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View style={{flex: 1, flexDirection: 'row'}}>
      <View style={{width: 90, height: 700, backgroundColor: '#F5A9A9', marginTop:24}} />
      <View style={{width: 90, height: 700, backgroundColor: '#F78181', marginTop:24}} />
      <View style={{width: 90, height: 700, backgroundColor: '#FA5858', marginTop:24}} />
      <View style={{width: 90, height: 700, backgroundColor: '#FE2E2E', marginTop:24}} />
    </View>
    );
  }
};
