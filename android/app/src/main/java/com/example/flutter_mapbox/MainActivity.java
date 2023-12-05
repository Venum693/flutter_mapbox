package com.example.flutter_mapbox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodChannel;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends FlutterActivity {
    private static final String CHANNEL = "navigation_channel";

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
                .setMethodCallHandler(
                        (call, result) -> {
                            if (call.method.equals("launchMapScreen")) {
                                launchMapScreen();
                            } else {
                                result.notImplemented();
                            }
                        }
                );
    }

    private void launchMapScreen() {
        Intent intent = new Intent(this, YourNewActivity.class);
        intent.putExtra("textToShow", "hi");
        startActivity(intent);
    }
}


