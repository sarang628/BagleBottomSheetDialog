package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutNotLoggedInMenuBinding
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog

class TorangNotLoggedInMenuBottomSheetDialog(
    context: Context,
    myDialogEventAdapter: NotLoggedInFeedDialogEventAdapter,
    feed: Feed
) : BottomSheetDialog(context) {
    init {
        val binding = LayoutNotLoggedInMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listener = myDialogEventAdapter
        binding.feed = feed

        dismissWithAnimation = true
    }
}