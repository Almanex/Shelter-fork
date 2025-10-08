Shelter
===

Shelter is a Free and Open-Source (FOSS) app that leverages the "Work Profile" feature of Android to provide an isolated space that you can install or clone apps into.

**🆕 Android 16 Ready**: This fork has been specifically adapted for Android 16 (API 36) with full support for Pixel 9a and modern Android features including Edge-to-Edge UI and Predictive Back Navigation.



Features
===

- Installing apps inside a work profile for isolation
- "Freeze" apps inside the work profile to prevent them from running or being woken up when you are not actively using them
- Installing two copies of the same app on the same device

Android 16 Enhancements
===

This fork includes specific optimizations for Android 16 (API 36) and Pixel 9a:

### 🎨 Modern UI
- **Edge-to-Edge Design**: Full support for Android 16's mandatory edge-to-edge UI
- **Material You Integration**: Enhanced theming with dynamic colors
- **Adaptive Icons**: Support for Android 16's adaptive icon system

### 🔄 Navigation Improvements
- **Predictive Back Navigation**: Smooth back gesture animations
- **Gesture Navigation**: Optimized for modern Android navigation patterns

### 📱 Pixel 9a Optimization
- **Display Compatibility**: Optimized for 6.3" display (2424×1080 resolution)
- **Performance Tuning**: Enhanced for Pixel 9a hardware specifications
- **Battery Optimization**: Improved power management for extended usage


Caveats & Known Issues
===

- Some caveats and known issues are discussed during the setup process of Shelter. __Please read through text in the setup wizard carefully__.
- Shelter is only as safe as the Work Profile implementation of the Android OS you are using. For details, see <https://support.google.com/work/android/answer/6191949?hl=en>

### Android 16 Specific Notes
- **Minimum Requirements**: This fork requires Android 16 (API 36) or later
- **Edge-to-Edge UI**: Some older custom ROMs may not fully support the new edge-to-edge requirements
- **Predictive Back**: Custom launchers may need updates to support the new back navigation system

State of the Project, Feature Requests, etc.
===

Since Shelter simply makes use of the Work Profile APIs exposed by Android, there is a limited set of features that are possible to implement via the app. As we do not intend on leveraging (or "abusing") adb privileges, the features of Shelter can only be a strict subset of the exposed, unprivileged APIs.

As a result, we do not intend on adding a lot of new features to Shelter going forward, unless there is to be big changes in the capabilities of work profile APIs. Shelter is currently in an effective **maintenance mode**. Nevertheless, the author is still committed to regularly **adapting Shelter to all new Android versions as soon as possible after they are released** -- this includes upgrading the target SDK level, adapting to any new features or restrictions introduced by the new Android version, updating all dependencies, and so on. The author still relies on Shelter for his daily life, so Shelter will **not** become abandonware in the forseeable future.

### Android 16 Fork Status
This fork represents a **proactive adaptation** for Android 16 (API 36), implementing:
- ✅ **Target SDK 36**: Full compatibility with Android 16 requirements
- ✅ **Edge-to-Edge UI**: Mandatory design compliance
- ✅ **Predictive Back**: Modern navigation patterns
- ✅ **Pixel 9a Support**: Hardware-specific optimizations

The fork maintains full backward compatibility while embracing Android 16's new capabilities and requirements.


Uninstalling
===

To uninstall Shelter, please delete the work profile first in Settings -> Accounts, and then uninstall the Shelter app normally.
