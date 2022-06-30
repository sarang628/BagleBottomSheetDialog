package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutMenuBinding
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedDialogEventAdapter
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog

class TorangMenuBottomSheetDialog(
    context: Context,
    feedDialogEventAdapter: FeedDialogEventAdapter,
    feed: Feed
) : BottomSheetDialog(context) {
    init {
        val binding = LayoutMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listener = feedDialogEventAdapter
        binding.feed = feed

        dismissWithAnimation = true
    }
}