import 'package:flutter/material.dart';

class CGScaffold {
  static Widget getScaffold({Widget? child}) {
    return Scaffold(
      body: SafeArea(
          child: Padding(
        padding: const EdgeInsets.only(left: 25.0, right: 25, top: 25),
        child: child!,
      )),
    );
  }
}
