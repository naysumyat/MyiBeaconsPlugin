package me.habel.IBeacon;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

import com.radiusnetworks.ibeacon.IBeaconConsumer;
import com.radiusnetworks.ibeacon.IBeaconManager;

import org.apache.cordova.*;
import org.apache.cordova.api.*;
import org.json.JSONArray;
import org.json.JSONException;

public class IBeacon extends CordovaPlugin implements IBeaconConsumer {
    private static String DEBUG_TAG = "iBeacon :: DEBUG => ";
    public static final String ACTION_VERIFY_BT = "verifyBluetooth";
    private IBeaconManager iBeaconManager = IBeaconManager
            .getInstanceForApplication(this.cordova.getActivity().getApplicationContext());

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
            throws JSONException {
        try {
            if (action.equalsIgnoreCase(ACTION_VERIFY_BT)) {
                verifyBluetooth();
                callbackContext.success();
                return true;
            }
        } catch (Exception e) {
            System.out.println(DEBUG_TAG + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        }
        return false;
    }

    private void verifyBluetooth() {

    }
}
