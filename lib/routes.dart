import 'package:career_guidance/view/home_screen.dart';
import 'package:career_guidance/view/interest_screen.dart';
import 'package:flutter/cupertino.dart';

class Routes {
  static Map<String, Widget Function(BuildContext)> getRoutes() => {
        '/': (context) => const HomeScreen(),
        '/interests': (context) => const InterestsScreen()
      };
}
