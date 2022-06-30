package com.example.bagle_bottom_sheet_dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/bagle_bottom_sheet_dialog/MenuBottomSheetNavigationImpl;", "Lcom/example/torang_core/navigation/MenuBottomSheetNavigation;", "()V", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "dismiss", "", "show", "context", "Landroid/content/Context;", "feedDialogEventAdapter", "Lcom/example/torang_core/dialog/FeedDialogEventAdapter;", "feed", "Lcom/example/torang_core/data/model/Feed;", "MenuBottomSheetNavigationModule", "bagleBottomSheetDialog_debug"})
public final class MenuBottomSheetNavigationImpl implements com.example.torang_core.navigation.MenuBottomSheetNavigation {
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    
    @javax.inject.Inject()
    public MenuBottomSheetNavigationImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.dialog.FeedDialogEventAdapter feedDialogEventAdapter, @org.jetbrains.annotations.NotNull()
    com.example.torang_core.data.model.Feed feed) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/bagle_bottom_sheet_dialog/MenuBottomSheetNavigationImpl$MenuBottomSheetNavigationModule;", "", "()V", "go", "Lcom/example/torang_core/navigation/MenuBottomSheetNavigation;", "menuBottomSheetNavigationImpl", "Lcom/example/bagle_bottom_sheet_dialog/MenuBottomSheetNavigationImpl;", "bagleBottomSheetDialog_debug"})
    @dagger.Module()
    public static abstract class MenuBottomSheetNavigationModule {
        
        public MenuBottomSheetNavigationModule() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.example.torang_core.navigation.MenuBottomSheetNavigation go(@org.jetbrains.annotations.NotNull()
        com.example.bagle_bottom_sheet_dialog.MenuBottomSheetNavigationImpl menuBottomSheetNavigationImpl);
    }
}