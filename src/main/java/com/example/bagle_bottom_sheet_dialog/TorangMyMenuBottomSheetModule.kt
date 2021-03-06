package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.example.torang_core.navigation.MenuBottomSheetNavigation
import com.example.torang_core.navigation.MyMenuBottomSheetNavigation
import com.example.torang_core.navigation.ShareBottomSheetNavigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class MyMenuBottomSheetNavigationImpl @Inject constructor() : MyMenuBottomSheetNavigation {

    var dialog: BottomSheetDialog? = null

    override fun show(
        context: Context,
        myDialogEventAdapter: FeedMyDialogEventAdapter,
        feed: Feed
    ) {
        dialog = TorangMyMenuBottomSheetDialog(context, myDialogEventAdapter, feed)
        dialog?.show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }

    /*@Module
    @InstallIn(ActivityComponent::class)
    abstract class MyMenuBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            menuBottomSheetNavigationImpl: MyMenuBottomSheetNavigationImpl
        ): MyMenuBottomSheetNavigation
    }*/
}