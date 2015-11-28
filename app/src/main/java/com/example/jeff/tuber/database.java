package com.example.jeff.tuber;
import android.app.Application;

import com.parse.Parse;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.parse.ParseInstallation;

/**
 * Created by 1 on 28.11.2015.
 */
public class database extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "LTMmNYruiHWZXuxU0zz2RJKrPEPTj7JlhjvyD4K6", "zajyFctNhiIgZjHSkl6fnmoXM8PIRlkdl18ujUpL");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}

