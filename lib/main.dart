import 'package:career_guidance/routes.dart';
import 'package:career_guidance/widget/theme.dart';
import 'package:flutter/material.dart';

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
      initialRoute: '/',
      routes: Routes.getRoutes(),
      // ),
    );
  }
}
