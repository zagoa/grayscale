# Grayscale
Grayscale is a quick settings tile that can toggle your display between full color and grayscale.
![Demo](http://f.dtkav.com/grayscale/demo.gif)

# Why this app?
Normally this setting exists in  
`Settings -> System -> Developer Options -> Simulate color space -> Monochromacy`.
This can be a pain to change quickly by hand! Grayscale is a quick settings tile that allows you to toggle this setting.

# How to install
1. install adb ([guide](https://www.xda-developers.com/install-adb-windows-macos-linux/))
2. download [the app](http://f.dtkav.com/grayscale/grayscale-1.0.apk) (right click to save as..)
3. install the app
    ```
    adb install grayscale-1.0.apk
    ```
4. grant secure settings permissions
    ```
    adb -d shell pm grant com.dtkav.grayscale android.permission.WRITE_SECURE_SETTINGS
    ```

# Additional Informaition
## App Permissions
Developer options cannot be changed by apps without special permission, so you have to grant special permissions to Grayscale in order to use it.
The `secure settings` permission flag is broad, so it's a good idea to review the code first!
I've compiled the APK without obfuscation, so you can analyze it with Android Studio if you like.

If your phone is rooted, check out the next section, otherwise skip to `adb`.

### Rooted Phone
If your phone is rooted, you can grant permissions directly on your phone.

### abd
If you phone isn't rooted, then you need to use adb (Android Debug Bridge) to grant the app special permission.
This can be done with the following command:
```
 adb -d shell pm grant com.dtkav.grayscale android.permission.WRITE_SECURE_SETTINGS
```

## Manually setting your phone to grayscale (no app required)
You can manually set your phone to grayscale (this app is just a quick toggle) in developer options.
You can enable on-device developer options by following [these instructions](https://developer.android.com/studio/debug/dev-options.html).
Once you have developer options, the setting exists in  
`Settings -> System -> Developer Options -> Simulate color space -> Monochromacy`.

# Fork Notes
This was forked from fei-ke because I didn't want to grant broad permissions to a random app on the play store.
I've also changed to the US spelling of "grayscale", as well as add more detailed instructions in the README.

You can find fei-ke's app [Greyscale](https://play.google.com/store/apps/details?id=com.fei_ke.greyscale) on google play.
