package com.d5.entorno;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;
import android.util.Log;

public class EntornoApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
   // ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(this, "iUmRAwcpLYZGRQEtrED0XcAXHXDT7kmRSAJQoxmi", "daVwbQKr90i90QTv2dwy0kPJ7p8URphgXM65ujAj");
    Log.i("Inicializacion Parse	","OK");

    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
