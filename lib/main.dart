import 'package:career_guidance/provider.dart';
import 'package:career_guidance/view/home_screen.dart';
import 'package:career_guidance/widget/theme.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return 
    // MultiProvider(
    //   providers: CGProvider.providers,
      // child: 
      MaterialApp(
        title: 'Career Guidance',
        theme: CGTheme.themeData(isDarkTheme: true),
        home: const HomeScreen(),
      // ),
    );
  }
}
