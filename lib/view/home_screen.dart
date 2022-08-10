import 'package:career_guidance/widget/card.dart';
import 'package:career_guidance/widget/scaffold.dart';
import 'package:career_guidance/widget/text.dart';
import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return CGScaffold.getScaffold(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          CGText.headerText(text: 'we help you to choose\nyour career path'),
          const SizedBox(height: 20),
          CGText.bodyText(text: 'pick any one', opacity: 0.8, size: 20),
          const SizedBox(height: 20),
          Row(
            children: [
              CGCard.getOptionCard(
                  text: "Careers\non your\ninterests",
                  height: 160,
                  icon: Icons.people,
                  onPressed: () {
                    Navigator.pushNamed(context, '/interests');
                  }),
              const SizedBox(width: 20),
              CGCard.getOptionCard(
                  text: "Explore\nCareers\nafter 12th",
                  height: 160,
                  icon: Icons.donut_small_rounded,
                  onPressed: () {
                    Navigator.pushNamed(context, '/explore');
                  }),
            ],
          ),
          const SizedBox(height: 40),
          CGText.bodyText(text: 'are you confused?', opacity: 0.8, size: 20),
          const SizedBox(height: 20),
          Row(
            children: [
              CGCard.getOptionCard(
                  text: "Try taking a\nsimple Test to know\nyour interests!",
                  height: 160,
                  icon: Icons.star,
                  onPressed: () {
                    ScaffoldMessenger.of(context).showSnackBar(
                        const SnackBar(content: Text("Taking Test")));
                  }),
            ],
          ),
          const SizedBox(height: 25),
        ],
      ),
    );
  }
}
