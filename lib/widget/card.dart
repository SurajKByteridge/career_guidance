import 'package:cached_network_image/cached_network_image.dart';
import 'package:career_guidance/widget/text.dart';
import 'package:career_guidance/widget/theme.dart';
import 'package:flutter/material.dart';

class CGCard {
  static Widget getOptionCard(
          {double? height,
          String? text,
          IconData? icon,
          Function()? onPressed}) =>
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
                  onTap: onPressed!,
                ),
              )
            ],
          ),
        ),
      );
  static Widget getBranchCard(
          {double? height,
          String? imgurl,
          String? branchName,
          String? duration,
          Function()? onPressed}) =>
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
          padding: const EdgeInsets.all(5.0),
          child: Row(children: [
            ClipRRect(
              borderRadius: BorderRadius.circular(6),
              child: SizedBox(
                height: 80,
                width: 100,
                child: CachedNetworkImage(
                  imageUrl:
                      "https://play-lh.googleusercontent.com/y5cmaOfuNBjodN5TzXgHSHF8hQKDfwKlMuCfSytQaEMt0xDSFjjgfw-ag1c3sypkcw=w240-h480-rw",
                  fit: BoxFit.cover,
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(left: 15.0),
              child: SizedBox(
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    SizedBox(
                      width: 210,
                      child: CGText.bodyText(text: branchName!, size: 18),
                    ),
                    CGText.bodyText(text: duration!, size: 16),
                  ],
                ),
              ),
            )
          ]),
        ),
        Material(
          color: Colors.transparent,
          child: InkWell(
            borderRadius: const BorderRadius.all(Radius.circular(3)),
            splashColor: CGTheme.accentColor.withOpacity(0.3),
            onTap: onPressed!,
          ),
        )
              ],
            ),
          ),
      );
}
