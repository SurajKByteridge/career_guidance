import 'package:career_guidance/model/demo_degree.dart';
import 'package:career_guidance/widget/scaffold.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import '../widget/text.dart';

class ExploreScreen extends StatelessWidget {
  const ExploreScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return CGScaffold.getScaffold(
        child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        CGText.headerText(text: "Degree After 12th"),
        const SizedBox(height: 20),
        Expanded(
          child: DefaultTabController(
              length: DemoDomain.tabs2.length,
              child: Scaffold(
                appBar: AppBar(
                  toolbarHeight: 0,
                  automaticallyImplyLeading: false,
                  backgroundColor: Colors.transparent,
                  bottom: TabBar(
                    isScrollable: true,
                    labelStyle: GoogleFonts.philosopher(
                        fontWeight: FontWeight.bold, fontSize: 18),
                    indicator: BoxDecoration(
                      // border: Border.all(color: CGTheme.accentColor,width: 3),
                      color: const Color(0xFF2F8A5F),
                      borderRadius: BorderRadius.circular(6),
                    ),
                    tabs: DemoDomain.tabs2
                  ),
                ),
                body: Padding(
                  padding: const EdgeInsets.only(top:10.0),
                  child: TabBarView(
                    physics: const BouncingScrollPhysics(),
                    children: DemoDomain.tabviews2
                  ),
                ),
              )),
        )
      ],
    ));
  }
}
