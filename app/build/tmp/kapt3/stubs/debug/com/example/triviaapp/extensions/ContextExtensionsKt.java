package com.example.triviaapp.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\u0002\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0004\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004\u001a&\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0004\u00a8\u0006\u0018"}, d2 = {"clearNotifications", "", "Landroid/content/Context;", "dpToPx", "", "dp", "isGpsEnabled", "", "locationPermissionAndGpsEnabled", "locationPermissionGranted", "longToast", "text", "", "resId", "openUrl", "url", "", "pxToDp", "px", "sendEmail", "recipient", "subject", "message", "shortToast", "app_debug"})
public final class ContextExtensionsKt {
    
    public static final void clearNotifications(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$clearNotifications) {
    }
    
    public static final void shortToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$shortToast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    public static final void shortToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$shortToast, @androidx.annotation.StringRes()
    int resId) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$longToast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$longToast, @androidx.annotation.StringRes()
    int resId) {
    }
    
    public static final int dpToPx(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$dpToPx, int dp) {
        return 0;
    }
    
    public static final int pxToDp(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$pxToDp, int px) {
        return 0;
    }
    
    public static final void sendEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$sendEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String recipient, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void openUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final boolean locationPermissionAndGpsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$locationPermissionAndGpsEnabled) {
        return false;
    }
    
    public static final boolean locationPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$locationPermissionGranted) {
        return false;
    }
    
    public static final boolean isGpsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGpsEnabled) {
        return false;
    }
}