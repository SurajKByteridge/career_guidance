import 'package:career_guidance/widget/text.dart';
import 'package:career_guidance/widget/theme.dart';
import 'package:flutter/material.dart';

class CGCard {
  static Widget getOptionCard({double? height, String? text, IconData? icon}) =>
      Expanded(
        child: Container(
          height: height!,
          decoration: BoxDecoration(
              color: Colors.white12,
              border: Border.all(color: Colors.white12, width: 3),
              borderRadius: const BorderRadius.all(Radius.circular(6))),
          child: Stack(
            children: [
              Padding(
                padding: const EdgeInsets.all(22.0),
                child: Align(
                  alignment: Alignment.topRight,
                  child: Icon(
                    icon!,
                    color: CGTheme.accentColor,
                    size: 35,
                  ),
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(22.0),
                child: Align(
                    alignment: Alignment.bottomLeft,
                    child: CGText.bodyText(text: text!, size: 20, opacity: 1)),
              ),
              Material(
                color: Colors.transparent,
                child: InkWell(
                  borderRadius: const BorderRadius.all(Radius.circular(3)),
                  splashColor: CGTheme.accentColor.withOpacity(0.3),
                  onTap: () {},
                ),
              )
            ],
          ),
        ),
      );
}
