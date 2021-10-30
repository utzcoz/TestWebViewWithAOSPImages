# Test WebView with AOSP images

We can run those commands to test `WebView` with AOSP images for different SDKs.

```shell
./gradlew -Pandroid.sdk.channel=3 nexusOneApi25DebugAndroidTest
./gradlew -Pandroid.sdk.channel=3 nexusOneApi26DebugAndroidTest
./gradlew -Pandroid.sdk.channel=3 nexusOneApi27DebugAndroidTest
./gradlew -Pandroid.sdk.channel=3 nexusOneApi28DebugAndroidTest
./gradlew -Pandroid.sdk.channel=3 nexusOneApi29DebugAndroidTest
./gradlew -Pandroid.sdk.channel=3 nexusOneApi30DebugAndroidTest
```

The test named `WebViewTest` will fail when running tests with AOSP images for SDK 26. There
are failed information:

```
SEVERE: Execute com.utzcoz.test.webview.with.aosp.images.WebViewTest.getCookie_doesNotReturnAttributes: FAILED
android.webkit.WebViewFactory$MissingWebViewPackageException: android.util.AndroidRuntimeException: android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed
        at android.webkit.WebViewFactory.getProviderClass(WebViewFactory.java:438)
        at android.webkit.WebViewFactory.getProvider(WebViewFactory.java:211)
        at android.webkit.CookieManager.getInstance(CookieManager.java:39)
        at com.utzcoz.test.webview.with.aosp.images.WebViewTest.getCookie_doesNotReturnAttributes(WebViewTest.java:17)
        ... 31 trimmed
Caused by: android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed
        at android.webkit.WebViewFactory.getWebViewContextAndSetProvider(WebViewFactory.java:334)
        at android.webkit.WebViewFactory.getProviderClass(WebViewFactory.java:398)
        ... 35 more
android.util.AndroidRuntimeException: android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed
        at android.webkit.WebViewFactory.getProviderClass(WebViewFactory.java:438)
        at android.webkit.WebViewFactory.getProvider(WebViewFactory.java:211)
        at android.webkit.CookieManager.getInstance(CookieManager.java:39)
        at com.utzcoz.test.webview.with.aosp.images.WebViewTest.getCookie_doesNotReturnAttributes(WebViewTest.java:17)
        ... 31 trimmed
Caused by: android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed
        at android.webkit.WebViewFactory.getWebViewContextAndSetProvider(WebViewFactory.java:334)
        at android.webkit.WebViewFactory.getProviderClass(WebViewFactory.java:398)
        ... 35 more
```