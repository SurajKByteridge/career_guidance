import 'package:cached_network_image/cached_network_image.dart';
import 'package:career_guidance/widget/card.dart';
import 'package:career_guidance/widget/text.dart';
import 'package:flutter/material.dart';

class DemoDomain {
  static List<Tab> tabs = [
    const Tab(
      text: "B.Tech",
    ),
    const Tab(
      text: "B.Arch",
    ),
    const Tab(
      text: "B.Pharm",
    ),
    const Tab(
      text: "B.Sc",
    ),
    const Tab(
      text: "B.Com",
    ),
    const Tab(
      text: "B.A",
    ),
  ];
  static List<Widget> tabviews = List.generate(
    6,
    (index) => SingleChildScrollView(
      physics: const BouncingScrollPhysics(),
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Mechanical Engineering",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "CSE",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Civil Engineering",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Biotechnology",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Electronics & Communication",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Electrical Engineering",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Row(
              children: [
                CGCard.getBranchCard(
                    branchName: "Automobile Engineering",
                    duration: "4 Years",
                    height: 100,
                    onPressed: () {},
                    imgurl: ''),
              ],
            ),
          ),
        ],
      ),
    ),
  );
}
