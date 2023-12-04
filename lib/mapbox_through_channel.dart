import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class NavgationFromAndroid extends StatefulWidget {
  const NavgationFromAndroid({super.key});


  @override
  State<NavgationFromAndroid> createState() => _NavgationFromAndroidState();
}

class _NavgationFromAndroidState extends State<NavgationFromAndroid> {

  static const platform = MethodChannel('navigation_channel');

  Future<void> launchMapScreen() async {
    try {
      await platform.invokeMethod('launchMapScreen');
    } on PlatformException catch (e) {
      print("Error: ${e.message}");
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: ElevatedButton(
          onPressed: () {
            launchMapScreen();
          },
          child: Text("Press "),
        ),
      ),
    );
  }
}
