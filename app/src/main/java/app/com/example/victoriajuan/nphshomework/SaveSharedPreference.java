package app.com.example.victoriajuan.nphshomework;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;

public class SaveSharedPreference {
    static final String PREF_USER_NAME = "username";
    static final String DAY = "0";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String userName) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_NAME, userName);
        editor.commit();
    }

    public static String getUserName(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME, "");
    }

    public static void setDay(Context ctx, int day) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putInt(DAY, day);
        editor.commit();
    }

    public static String getDay(Context ctx) {
        return getSharedPreferences(ctx).getString(DAY, "");
    }

}