package com.kalengo.weathermeida.plugins;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
public class KalengoPlugin extends CordovaPlugin{
	public static String SETTING = "setting";
	public boolean execute(String action, JSONArray data,
			CallbackContext callbackContext) throws JSONException {
        if (SETTING.equals(action)) {
          
        	setting("hah", 0, callbackContext);
        }
        return false;
	    }
	public synchronized void setting(final String message, final int length,
            CallbackContext callbackContext) {
        final CordovaInterface cordova = this.cordova;
//        Runnable runnable = new Runnable() {
//            public void run() {
//                Toast.makeText(cordova.getActivity(), message,length).show();
//            }
//        };
//         this.cordova.getActivity().runOnUiThread(runnable);
         Intent intent = new Intent();
         intent.setAction(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
         cordova.getActivity().startActivity(intent);
    }
}
