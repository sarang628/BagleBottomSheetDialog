package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.navigation.MenuBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class MenuBottomSheetNavigationImpl @Inject constructor() : MenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        feedDialogEventAdapter: FeedDialogEventAdapter,
        feed: Feed
    ) {
        dialog = TorangMenuBottomSheetDialog(context, feedDialogEventAdapter, feed)
        dialog?.show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class MenuBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            menuBottomSheetNavigationImpl: MenuBottomSheetNavigationImpl
        ): MenuBottomSheetNavigation
    }
}