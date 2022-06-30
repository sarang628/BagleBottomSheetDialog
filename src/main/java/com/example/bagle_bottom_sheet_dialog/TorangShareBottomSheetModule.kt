package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import com.example.torang_core.navigation.ShareBottomSheetNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class ShareBottomSheetNavigationImpl @Inject constructor() : ShareBottomSheetNavigation {
    override fun show(context: Context) {
        TorangShareBottomSheetDialog(context).show()
    }

    @Module
    @InstallIn(ActivityComponent::class)
    abstract class ShareBottomSheetNavigationModule {
        @Binds
        abstract fun go(
            shareBottomSheetNavigationImpl: ShareBottomSheetNavigationImpl
        ): ShareBottomSheetNavigation
    }
}