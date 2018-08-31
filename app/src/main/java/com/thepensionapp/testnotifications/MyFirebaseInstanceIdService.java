package com.thepensionapp.testnotifications;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ekaranja on 6/19/18.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static  final String REG_TOKEN="REG_TOKEN";
    @Override
    public void onTokenRefresh() {
       // super.onTokenRefresh();

        String recentToken= FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recentToken);
    }
}
