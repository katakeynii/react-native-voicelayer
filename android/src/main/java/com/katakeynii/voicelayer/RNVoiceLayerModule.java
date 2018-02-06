
package com.katakeynii.voicelayer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import io.voicelayer.voicelayerSdk.VoiceLayerChannel;
import io.voicelayer.voicelayerSdk.VoiceLayerClient;
import io.voicelayer.voicelayerSdk.VoiceLayerMessage;
import io.voicelayer.voicelayerSdk.VoiceLayerUser;
import io.voicelayer.voicelayerSdk.interfaces.VoiceLayerChannelEventListener;
import io.voicelayer.voicelayerSdk.interfaces.VoiceLayerChannelUsersEventListener;
import io.voicelayer.voicelayerSdk.interfaces.VoiceLayerMessageEventListener;
import io.voicelayer.voicelayerSdk.interfaces.VoiceLayerLoginCallback;
import io.voicelayer.voicelayerSdk.VoiceLayerMessagePlayer;
import io.voicelayer.voicelayerSdk.exceptions.VoiceLayerException;

import android.content.ServiceConnection;
import android.util.Log;

import java.net.MalformedURLException;


public class RNVoiceLayerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private ServiceConnection mConnection   = null;
  public static String TAG = "RN-VoiceLayer";

  public RNVoiceLayerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    // Configure VoiceLayer
    try {
        VoiceLayerClient.Initialize(reactContext, new VoiceLayerConfiguration(
                "AlbouriTest",
                "9df4bd07feb1f49e92643009a65529b7",
                "032f92300ed274116f61877a1c9f2f5c"
        ));
        Log.d(TAG, "Voicelayer initialized successfully");
    } catch (MalformedURLException e) {
        throw new RuntimeException("Unable to initialize client.");
    }
  }
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    return constants;
  }
  @Override
  public String getName() {
    return "RNVoiceLayer";
  }

  @ReactMethod
  public void getClient(Callback errorCallback, Callback successCallback) {
  	successCallback.invoke(VoiceLayerClient.getInstance());
  }

}