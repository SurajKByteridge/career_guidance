import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class CGText {
  static Text headerText({String? text, double? opacity = 1}) => Text(text!,
      style: GoogleFonts.philosopher(
          color: Colors.white.withOpacity(opacity!),
          fontSize: 27,
          fontWeight: FontWeight.bold));
  static Text bodyText({String? text, double? size, double? opacity = 1}) =>
      Text(text!,
          overflow: TextOverflow.ellipsis,
          style: GoogleFonts.philosopher(
              color: Colors.white.withOpacity(opacity!),
              fontSize: size!,
              fontWeight: FontWeight.normal));
}
