package com.linusu.flutter_web_auth_example

import android.net.Uri
import android.os.Bundle
import com.linusu.flutter_web_auth.FlutterWebAuthPlugin

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
  }

  override fun onResume() {
    if(FlutterWebAuthPlugin.tabOpened){
      FlutterWebAuthPlugin.callbacks.remove(FlutterWebAuthPlugin.urlScheme)?.success("fail")
    }
    super.onResume()
  }
}
