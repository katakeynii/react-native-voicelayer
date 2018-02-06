
# react-native-voicelayer
Last night I discover VoiceLayer and I really loved it. 
So I started this library to used in some of my project. 

## Getting started

`$ npm install react-native-voicelayer --save`

### Mostly automatic installation

`$ react-native link react-native-voicelayer`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-voicelayer` and add `RNVoiceLayer.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNVoiceLayer.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.katakeynii.voicelayer.RNVoiceLayerPackage;` to the imports at the top of the file
  - Add `new RNVoiceLayerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-voicelayer'
  	project(':react-native-voicelayer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-voicelayer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-voicelayer')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNVoiceLayer.sln` in `node_modules/react-native-voicelayer/windows/RNVoiceLayer.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Voice.Layer.RNVoiceLayer;` to the usings at the top of the file
  - Add `new RNVoiceLayerPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNVoiceLayer from 'react-native-voicelayer';

// TODO: What to do with the module?
RNVoiceLayer;
```
  