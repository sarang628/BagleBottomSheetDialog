package com.example.bagle_bottom_sheet_dialog.databinding;
import com.example.bagle_bottom_sheet_dialog.R;
import com.example.bagle_bottom_sheet_dialog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutNotLoggedInMenuBindingImpl extends LayoutNotLoggedInMenuBinding implements com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 2);
        sViewsWithIds.put(R.id.textView13, 3);
        sViewsWithIds.put(R.id.textView8, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNotLoggedInMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private LayoutNotLoggedInMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView20.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.feed == variableId) {
            setFeed((com.example.torang_core.data.model.Feed) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFeed(@Nullable com.example.torang_core.data.model.Feed Feed) {
        this.mFeed = Feed;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.feed);
        super.requestRebind();
    }
    public void setListener(@Nullable com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.torang_core.data.model.Feed feed = mFeed;
        com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter listener = mListener;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView20.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // feed.review_id
        int feedReviewId = 0;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // feed
        com.example.torang_core.data.model.Feed feed = mFeed;
        // listener
        com.example.torang_core.dialog.NotLoggedInFeedDialogEventAdapter listener = mListener;
        // feed != null
        boolean feedJavaLangObjectNull = false;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            feedJavaLangObjectNull = (feed) != (null);
            if (feedJavaLangObjectNull) {


                feedReviewId = feed.getReview_id();

                listener.report2(feedReviewId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feed
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}