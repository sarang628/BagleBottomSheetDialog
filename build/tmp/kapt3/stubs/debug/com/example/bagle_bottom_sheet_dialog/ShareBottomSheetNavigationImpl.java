package com.example.bagle_bottom_sheet_dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/example/bagle_bottom_sheet_dialog/ShareBottomSheetNavigationImpl;", "Lcom/example/torang_core/navigation/ShareBottomSheetNavigation;", "()V", "show", "", "context", "Landroid/content/Context;", "ShareBottomSheetNavigationModule", "bagleBottomSheetDialog_debug"})
public final class ShareBottomSheetNavigationImpl implements com.example.torang_core.navigation.ShareBottomSheetNavigation {
    
    @javax.inject.Inject()
    public ShareBottomSheetNavigationImpl() {
        super();
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bagle_bottom_sheet_dialog/ShareBottomSheetNavigationImpl$ShareBottomSheetNavigationModule;", "", "()V", "go", "Lcom/example/torang_core/navigation/ShareBottomSheetNavigation;", "shareBottomSheetNavigationImpl", "Lcom/example/bagle_bottom_sheet_dialog/ShareBottomSheetNavigationImpl;", "bagleBottomSheetDialog_debug"})
    @dagger.Module()
    public static abstract class ShareBottomSheetNavigationModule {
        
        public ShareBottomSheetNavigationModule() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.example.torang_core.navigation.ShareBottomSheetNavigation go(@org.jetbrains.annotations.NotNull()
        com.example.bagle_bottom_sheet_dialog.ShareBottomSheetNavigationImpl shareBottomSheetNavigationImpl);
    }
}