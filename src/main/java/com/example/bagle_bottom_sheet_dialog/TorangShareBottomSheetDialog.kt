package com.example.bagle_bottom_sheet_dialog

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class TorangShareBottomSheetDialog(context: Context) : BottomSheetDialog(context) {
    init {
        setContentView(R.layout.layout_share)
        dismissWithAnimation = true

        val rv = findViewById<RecyclerView>(R.id.rv_share)
        if (rv != null) {
            rv.adapter = ShareDialogRvAdt()
        }
    }
}