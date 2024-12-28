# Forkicons contributing guide

Welcome to the Forkicons contributing guide! This file will tell you what you need to know to contribute to Forkicons.

Before you start, please [fork](https://github.com/k4ustu3h/forkicons/fork) the project and clone it to your machine. Afterwards, you can either contribute icons or code.

## Contributing icons

For beginners, it is faster to create icons [in Figma](https://www.figma.com/), although [Inkscape](https://inkscape.org/) and similar software will do. A file explorer, a text editor, and a terminal window will also be useful.

### TL;DR on icon design

> [!NOTE]
> Upload no more than 10 icons at a time.

The canvas is `192×192px`. The content area for most icons is `160×160px`, meaning the long side of an icon should be `160px`. Square icons should be `154×154px`. All shapes should be black `#000`. Avoid noticable black spots, close distances between shapes. Simplify details, but don't lose originality. Provide original and localized names, so the icons can be found. The icon should be an identical but a monotone variant of the original icon.

To avoid rework, save time and understand the limitations of the guidelines, it is worth reading reviews (e.g., [+8 icons, +1 link, +4 updates](https://github.com/LawnchairLauncher/lawnicons/pull/1865)) and creating 5-10 icons in the first contribution.

### Canvas & Sizes

![](docs/images/creating-icons-1-artboard.png)

#### Canvas

The canvas size should be `192×192px` so that there is a safe zone around the icons to control consistency.

#### Content area for all but square

All but square icons must fit the `160×160px` content area size. Be careful with abstract icons: the long side should be `160px`, but the other side can be smaller.

#### Content area for squares

Square icons must fit the `154×154px` content area size. Icons that mostly fit in a square are considered square. If the icon is kinda square and kinda not, choose a size based on density: `154×154px` for dense icons, `160×160px` for the rest. Examples: [GitHub](docs/images/creating-icons-6-sample-icons.png).

### Foundation

#### Color

All shapes must have black color `#000000`. The shapes can have tranparency, but should be visible enough.

### Details

![](docs/images/creating-icons-3-detail.png)

When designing icons, it's important to strike a balance with the level of detail. While some icons can be highly detailed, it's acceptable to remove certain details as long as the icon remains recognizable and stays true to its original concept. In some cases, you may need to completely rethink the icon to achieve a minimalist design.

A great example of this is the Subway Surfers icon as seen in the example above. It was reimagined by using the graffiti-styled "S" from the game's logo instead of depicting the character, which would have required intricate shapes.

![](docs/images/creating-icons-3-balance.png)

In contrary, it's also important to avoid too few details, as they may not be easily recognizable. Take the Headspace icon, for instance, which consists only of a circle. This may pose a problem for users since Forkicons are not colored, and a simple circle on its own is not easily identifiable. Whenever possible, incorporate additional details that align with the app's design language.

In the Headspace example above, the circles usually have a face representing mood. By adding one of those faces to the circle, you can make the icon more recognizable.

## Naming

To make it easier to find icons, you should keep the original names. Arabic, Chinese or Japanese names need to be supplemented with an English version. If you are adding a link to an existing icon, keep (or complement) the existing app and drawable names.

### App name

Should be the same as in Google Play, F-Droid or the official name. If the name in the source is too long, it's acceptable to remove the second part of the name without loss of recognition.

```
Wrong • Google Play name: "Zoom - One Platform to Connect"
<item component="..." drawable="zoom" name="Zoom - One Platform to Connect" />
```

```
Correct • Edited name: "Zoom"
<item component="..." drawable="zoom" name="Zoom" />
```

Names in different languages are separated via `~~`. If the app name is localized, then the first name should be the one most commonly spoken by the people who will be searching for the icon (if in doubt, in English).

```
Wrong
<item component="..." drawable="hulu" name="フールー ~~ Hulu" />
```

```
Correct
<item component="..." drawable="hulu" name="Hulu ~~ フールー" />
```

If the first `3` characters of the app name contain letters not from the English alphabet, then it's worth adding the transliterated name.

```
Wrong
<item component="..." drawable="lansforsakringar" name="Länsförsäkringar" />
```

```
Correct
<item component="..." drawable="lansforsakringar" name="Länsförsäkringar ~~ Lansforsakringar" />
```

### Drawable

Should contain letters from the English alphabet and repeat the app name if possible.

```
Wrong
<item component="..." drawable="itaú" name="Itaú" />
```

```
Correct
<item component=..." drawable="itau" name="Itaú" />
```

If the app name starts with a digit, then the drawable should start with `_`.

```
Wrong
<item component="..." drawable="ninegag" name="9GAG" />
```

```
Correct
<item component="..." drawable="_9gag" name="9GAG" />
```

## Adding an icon to Forkicons

### Prerequisites

-   A fork of the Forkicons repository.
-   Your icon in the SVG format, adhering to [the above guidelines](#contributing-icons). The filename must use snake case (e.g. `spck_editor.svg`).
-   The package and activity name of the app.

### Via `icontool.py`

Please check [the icon tool guide](/docs/icontool_guide.md) for more information.

### Via manual process

1. Add the ready SVG to the `svgs` directory. If you want to add a link to an existing SVG, you will need its name.

2. Add a new line to `app/assets/appfilter.xml` (in alphabetical order, by the `name` attribute), and map the new icon to a package name and app's activity.

    **Example**

    - the app name: `Spck Editor`;
    - the svg (drawable) name: `spck_editor`;
    - the package and activity of the app: `io.spck/io.spck.EditorActivity`.

    **The new line**

    ```xml
    <item component="ComponentInfo{io.spck/io.spck.EditorActivity}" drawable="spck_editor" name="Spck Editor" />
    ```

    **General template**

    ```xml
    <item component="ComponentInfo{[PACKAGE_NAME]/[APP_ACIVITY_NAME]}" drawable="[DRAWABLE NAME]" name="[APP NAME]" />
    ```

3. Done! You're ready to open a pull request. Please set `main` as the base branch.

## Finding the package and activity name of an app

<!--
### Using Forkicons
1. Install and open [Forkicons 2.10+](https://github.com/k4ustu3h/forkicons/releases).
2. Tap "Request icons". After that, our request form will open with a response ready to be submit.
3. Submit the response. You can copy the submitted activities [from our table](https://docs.google.com/spreadsheets/d/1AXc9EDXA6udZeGROtB5nuABjM33VluGY_V24tIzHaKc/edit?resourcekey=&gid=1039095616#gid=1039095616) (sorted by date).
-->

### Using `adb`

1. Connect your Android device or emulator to your laptop/desktop PC that has `adb` installed (see [this tutorial](https://www.xda-developers.com/install-adb-windows-macos-linux/) for more information) and open the app whose details you want to inspect, e.g. Telegram.
2. Open a new Command Prompt or Terminal window and input `adb devices`.
3. Finally, type the below-given command to get the information about the currently open application.

    **For Mac or Linux**:

```console
adb shell dumpsys window | grep 'mCurrentFocus'
```

**For Windows**:

```console
adb shell dumpsys window | findstr "mCurrentFocus"
```

![](docs/images/contributing-image-3.png)

The part before the `/` character in the above image, i.e. `org.telegram.messenger`, is the package name (`[PACKAGE_NAME]`). The part after it, i.e. `org.telegram.messenger.DefaultIcon`, is the activity name (`[APP_ACIVITY_NAME]`).

### Using 3rd-party apps

#### IconRequest app

1. Download IconRequest: [Google Play](https://play.google.com/store/apps/details?id=de.kaiserdragon.iconrequest) • [GitHub](https://github.com/Kaiserdragon2/IconRequest/releases).
2. Launch IconRequest and tap one of the options:

-   UPDATE EXISTING — to copy packages with activities.
-   REQUEST NEW — to save icon images and packages with activities. This option is better if you are creating icons.

3. Use the app toolbar to select the apps for which youʼd like to request or make icons.
4. Copy, save or share.

#### Icon Pusher app

1. Download the [Icon Pusher app](https://play.google.com/store/apps/details?id=dev.southpaw.iconpusher&hl=en&gl=US).
2. Launch the app.
3. Select the icon(s) you want to upload or select all by pressing the square in the top right. Then press "Send".
4. View the packages with the activities for each app on the [Icon Pusher website](https://iconpusher.com/). Please make sure the `drawable="[DRAWABLE NAME]"` matches the icon SVG file name.

## Contributing code

While adding icons is the main focus for most contributors, code-related contributions are welcome.

To build Forkicons, select the `appDebug` build variant.

Here are a few contribution tips:

-   [The `app` module](https://github.com/k4ustu3h/forkicons/tree/main/app) contains most of Forkicons' core code, while [the `svg-processor` module](https://github.com/k4ustu3h/forkicons/tree/main/svg-processor) contains the code that converts the SVGs inside the `svgs` folder into Android Drawables. Generally, the `app` module is where you should make most of your contributions.
-   You can use either Java or, preferably, Kotlin.
-   Make sure your code is logical and well formatted. If using Kotlin, see ["Coding conventions"](https://kotlinlang.org/docs/coding-conventions.html) in the Kotlin documentation.
-   Set `main` as the base branch for pull requests.
