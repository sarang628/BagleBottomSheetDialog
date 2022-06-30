package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutMyMenuBinding
import com.example.torang_core.data.model.Feed
import com.example.torang_core.dialog.FeedMyDialogEventAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog

class TorangMyMenuBottomSheetDialog(
    context: Context,
    myDialogEventAdapter: FeedMyDialogEventAdapter,
    feed: Feed
) : BottomSheetDialog(context) {
    init {
        val binding = LayoutMyMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listener = myDialogEventAdapter
        binding.feed = feed

        dismissWithAnimation = true
    }
}