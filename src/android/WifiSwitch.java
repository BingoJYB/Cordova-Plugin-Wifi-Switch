package android.plugin;

import android.content.Context;
import android.net.wifi.WifiManager;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;

public class WifiSwitch extends CordovaPlugin {
    private WifiManager wifiManager;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        wifiManager = (WifiManager) cordova.getActivity().getSystemService(Context.WIFI_SERVICE);
    }

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("setWifiEnabled")) {
            boolean state = data.getBoolean(0);
            wifiManager.setWifiEnabled(state);
            return true;
        }
        else if (action.equals("isWifiEnabled")) {
            boolean isEnabled = wifiManager.isWifiEnabled();
            PluginResult result = new PluginResult(PluginResult.Status.OK, isEnabled);
            result.setKeepCallback(true);
            callbackContext.sendPluginResult(result);
            return true;
        }
        else {
            return false;
        }
    }
}
