import 'package:cached_network_image/cached_network_image.dart';
import 'package:career_guidance/widget/scaffold.dart';
import 'package:career_guidance/widget/text.dart';
import 'package:flutter/material.dart';
import 'package:flutter_staggered_grid_view/flutter_staggered_grid_view.dart';

import '../widget/theme.dart';

class InterestsScreen extends StatelessWidget {
  const InterestsScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return CGScaffold.getScaffold(
        child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        CGText.headerText(text: "Choose your interests"),
        const SizedBox(height: 10),
        CGText.bodyText(
            text: 'select one/more interests if you want',
            opacity: 0.8,
            size: 20),
        const SizedBox(height: 20),
        Expanded(
          child: MasonryGridView.count(
              physics: const BouncingScrollPhysics(),
              crossAxisCount: 2,
              itemCount: 20,
              crossAxisSpacing: 10,
              mainAxisSpacing: 10,
              itemBuilder: (context, i) {
                return ClipRRect(
                  borderRadius: BorderRadius.circular(6),
                  child: SizedBox(
                    height: (i % 1.5 + 1) * 100,
                    child: Stack(
                      fit: StackFit.expand,
                      children: [
                        CachedNetworkImage(
                          fit: BoxFit.cover,
                          imageUrl:
                              "https://prod-discovery.edx-cdn.org/media/course/image/0e575a39-da1e-4e33-bb3b-e96cc6ffc58e-8372a9a276c1.small.png",
                          placeholder: (context, url) =>
                              const Center(child: CircularProgressIndicator()),
                        ),
                        Container(
                          height: (i % 1.5 + 1) * 100,
                          decoration: const BoxDecoration(
                              gradient: LinearGradient(
                                  colors: [Colors.transparent, Colors.black],
                                  begin: Alignment.topCenter,
                                  end: Alignment.bottomCenter)),
                          child: Align(
                              alignment: Alignment.bottomLeft,
                              child: Padding(
                                padding: const EdgeInsets.only(
                                    left: 8.0, bottom: 8.0),
                                child: CGText.bodyText(text: "Maths", size: 20),
                              )),
                        ),
                        Material(
                          color: Colors.transparent,
                          child: InkWell(
                            borderRadius:
                                const BorderRadius.all(Radius.circular(3)),
                            splashColor: CGTheme.accentColor.withOpacity(0.3),
                            onTap: () {
                              Navigator.pushNamed(context, "/domain");
                            },
                          ),
                        ),
                      ],
                    ),
                  ),
                );
              }),
        )
      ],
    ));
  }
}
