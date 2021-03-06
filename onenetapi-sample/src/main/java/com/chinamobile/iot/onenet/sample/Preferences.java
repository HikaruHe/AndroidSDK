package com.chinamobile.iot.onenet.sample;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {

    // Preferences file name
    private static final String PREFERENCES_FILE = "one_net_api_sample_pref";

    private static Preferences sPreferences;

    private final SharedPreferences mShareferences;
    private final SharedPreferences.Editor mEditor;

    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    private static final String KEY_DEVICE_ID = "device_id";
    private static final String KEY_TRIGGER_ID = "trigger_id";
    private static final String KEY_API_KEY = "api_key";

    private Preferences(Context context) {
        mShareferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        mEditor = mShareferences.edit();
    }

    public static synchronized Preferences getInstance(Context context) {
        if (null == sPreferences) {
            sPreferences = new Preferences(context);
        }
        return sPreferences;
    }

    public void setUsername(String username) {
        mEditor.putString(KEY_USERNAME, username);
        mEditor.commit();
    }

    public String getUsername() {
        return mShareferences.getString(KEY_USERNAME, "");
    }

    public void setPassword(String password) {
        mEditor.putString(KEY_PASSWORD, password);
        mEditor.commit();
    }

    public String getPassword() {
        return mShareferences.getString(KEY_PASSWORD, "");
    }

    public void setDeviceId(String deviceId) {
        mEditor.putString(KEY_DEVICE_ID, deviceId);
        mEditor.commit();
    }

    public String getDeviceId() {
        return mShareferences.getString(KEY_DEVICE_ID, "");
    }

    public void deleteDeviceId() {
        mEditor.remove(KEY_DEVICE_ID);
        mEditor.commit();
    }

    public void setTriggerId(String triggerId) {
        mEditor.putString(KEY_TRIGGER_ID, triggerId);
        mEditor.commit();
    }

    public String getTriggerId() {
        return mShareferences.getString(KEY_TRIGGER_ID, "");
    }

    public void deleteTriggerId() {
        mEditor.remove(KEY_TRIGGER_ID);
        mEditor.commit();
    }

    public void setApiKey(String apiKey) {
        mEditor.putString(KEY_API_KEY, apiKey);
        mEditor.commit();
    }

    public String getApiKey() {
        return mShareferences.getString(KEY_API_KEY, "");
    }

    public void deleteApiKey() {
        mEditor.remove(KEY_API_KEY);
        mEditor.commit();
    }
}
