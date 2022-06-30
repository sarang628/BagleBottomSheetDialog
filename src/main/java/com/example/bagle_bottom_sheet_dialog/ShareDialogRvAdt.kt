package com.example.bagle_bottom_sheet_dialog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShareDialogRvAdt : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    enum class ShareDialogItemType {
        WRITE,
        SEARCH,
        CREATE,
        FRIEND
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (ShareDialogItemType.values()[viewType]) {
            ShareDialogItemType.WRITE -> return ShareDialogWriteVH.create(parent)
            ShareDialogItemType.CREATE -> return ShareDialogCreateVH.create(parent)
            ShareDialogItemType.SEARCH -> return ShareDialogSearchVH.create(parent)
            ShareDialogItemType.FRIEND -> return ShareDialogFriendVH.create(parent)
        }
        return ShareDialogWriteVH.create(parent)
    }

    override fun getItemViewType(position: Int): Int {
        when (position) {
            0 -> return ShareDialogItemType.WRITE.ordinal
            1 -> return ShareDialogItemType.SEARCH.ordinal
            2 -> return ShareDialogItemType.CREATE.ordinal
            else -> return ShareDialogItemType.FRIEND.ordinal
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}

class ShareDialogWriteVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun create(viewParent: ViewGroup): ShareDialogWriteVH {
            return ShareDialogWriteVH(
                LayoutInflater.from(viewParent.context)
                    .inflate(R.layout.item_write, viewParent, false)
            )
        }
    }
}

class ShareDialogSearchVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun create(viewParent: ViewGroup): ShareDialogWriteVH {
            return ShareDialogWriteVH(
                LayoutInflater.from(viewParent.context)
                    .inflate(R.layout.item_search, viewParent, false)
            )
        }
    }
}

class ShareDialogCreateVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun create(viewParent: ViewGroup): ShareDialogWriteVH {
            return ShareDialogWriteVH(
                LayoutInflater.from(viewParent.context)
                    .inflate(R.layout.item_create, viewParent, false)
            )
        }
    }
}

class ShareDialogFriendVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun create(viewParent: ViewGroup): ShareDialogWriteVH {
            return ShareDialogWriteVH(
                LayoutInflater.from(viewParent.context)
                    .inflate(R.layout.item_friend, viewParent, false)
            )
        }
    }
}