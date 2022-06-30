package com.example.bagle_bottom_sheet_dialog.databinding;
import com.example.bagle_bottom_sheet_dialog.R;
import com.example.bagle_bottom_sheet_dialog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutMyMenuBindingImpl extends LayoutMyMenuBinding implements com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 8);
        sViewsWithIds.put(R.id.textView13, 9);
        sViewsWithIds.put(R.id.textView8, 10);
        sViewsWithIds.put(R.id.textView7, 11);
        sViewsWithIds.put(R.id.textView9, 12);
        sViewsWithIds.put(R.id.textView10, 13);
        sViewsWithIds.put(R.id.textView11, 14);
        sViewsWithIds.put(R.id.textView21, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutMyMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private LayoutMyMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        this.textView2.setTag(null);
        this.textView20.setTag(null);
        this.textView3.setTag(null);
        this.textView4.setTag(null);
        this.textView5.setTag(null);
        this.textView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.bagle_bottom_sheet_dialog.generated.callback.OnClickListener(this, 1);
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
            setListener((com.example.torang_core.dialog.FeedMyDialogEventAdapter) variable);
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
    public void setListener(@Nullable com.example.torang_core.dialog.FeedMyDialogEventAdapter Listener) {
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
        com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.textView.setOnClickListener(mCallback1);
            this.textView2.setOnClickListener(mCallback2);
            this.textView20.setOnClickListener(mCallback7);
            this.textView3.setOnClickListener(mCallback4);
            this.textView4.setOnClickListener(mCallback3);
            this.textView5.setOnClickListener(mCallback5);
            this.textView6.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.lockReply(feedReviewId);
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    listener.modify(feed);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.store(feedReviewId);
                    }
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.report(feedReviewId);
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.hideLikeCount(feedReviewId);
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.delete(feedReviewId);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // feed.review_id
                int feedReviewId = 0;
                // listener != null
                boolean listenerJavaLangObjectNull = false;
                // feed
                com.example.torang_core.data.model.Feed feed = mFeed;
                // listener
                com.example.torang_core.dialog.FeedMyDialogEventAdapter listener = mListener;
                // feed != null
                boolean feedJavaLangObjectNull = false;



                listenerJavaLangObjectNull = (listener) != (null);
                if (listenerJavaLangObjectNull) {



                    feedJavaLangObjectNull = (feed) != (null);
                    if (feedJavaLangObjectNull) {


                        feedReviewId = feed.getReview_id();

                        listener.postOtherApp(feedReviewId);
                    }
                }
                break;
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