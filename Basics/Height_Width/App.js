import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View>
      <View style={{width: 400, height: 60, backgroundColor: '#F5A9A9', marginTop:24}} />
      <View style={{width: 400, height: 100, backgroundColor: '#F78181'}} />
      <View style={{width: 400, height: 150, backgroundColor: '#FA5858'}} />
      <View style={{width: 400, height: 150, backgroundColor: '#FE2E2E'}} />
      <View style={{width: 400, height: 100, backgroundColor: '#DF0101'}} />
      <View style={{width: 400, height: 60, backgroundColor: '#B40404'}} />
    </View>
    );
  }
}
;
