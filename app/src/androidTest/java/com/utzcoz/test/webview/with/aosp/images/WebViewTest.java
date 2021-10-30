package com.utzcoz.test.webview.with.aosp.images;

import static com.google.common.truth.Truth.assertThat;

import android.webkit.CookieManager;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class WebViewTest {
    @Test
    public void getCookie_doesNotReturnAttributes() {
        final String httpsUrl = "https://robolectric.org/";
        final CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(httpsUrl, "ID=test-id; Path=/; Domain=.robolectric.org");
        String cookie = cookieManager.getCookie(httpsUrl);
        assertThat(cookie).isEqualTo("ID=test-id");
    }
}