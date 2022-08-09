import 'package:flutter/material.dart';

class CGTheme {
  static ThemeData themeData({bool? isDarkTheme}) {
    return ThemeData(
        backgroundColor: Colors.black,
        brightness: Brightness.dark,
        scaffoldBackgroundColor: Colors.black);
  }

  static const Color accentColor = Color(0xFFFFE280);
}
