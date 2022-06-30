package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import android.content.Intent
import com.example.torang_core.navigation.TorangShare
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class TorangShareImpl @Inject constructor() : TorangShare {
    override fun shareLink(context: Context, url: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, url)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        context.startActivity(shareIntent)
    }
}

@Module
@InstallIn(ActivityComponent::class)
abstract class TorangShareModule {
    @Binds
    abstract fun provideTorangShare(torangShareImpl: TorangShareImpl): TorangShare
}