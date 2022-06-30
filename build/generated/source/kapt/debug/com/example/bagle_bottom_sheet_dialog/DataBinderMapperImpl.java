package com.example.bagle_bottom_sheet_dialog;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutMenuBindingImpl;
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutMyMenuBindingImpl;
import com.example.bagle_bottom_sheet_dialog.databinding.LayoutNotLoggedInMenuBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_LAYOUTMENU = 1;

  private static final int LAYOUT_LAYOUTMYMENU = 2;

  private static final int LAYOUT_LAYOUTNOTLOGGEDINMENU = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bagle_bottom_sheet_dialog.R.layout.layout_menu, LAYOUT_LAYOUTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bagle_bottom_sheet_dialog.R.layout.layout_my_menu, LAYOUT_LAYOUTMYMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bagle_bottom_sheet_dialog.R.layout.layout_not_logged_in_menu, LAYOUT_LAYOUTNOTLOGGEDINMENU);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_LAYOUTMENU: {
          if ("layout/layout_menu_0".equals(tag)) {
            return new LayoutMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMYMENU: {
          if ("layout/layout_my_menu_0".equals(tag)) {
            return new LayoutMyMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_my_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNOTLOGGEDINMENU: {
          if ("layout/layout_not_logged_in_menu_0".equals(tag)) {
            return new LayoutNotLoggedInMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_not_logged_in_menu is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.torang_core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "feed");
      sKeys.put(2, "listener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/layout_menu_0", com.example.bagle_bottom_sheet_dialog.R.layout.layout_menu);
      sKeys.put("layout/layout_my_menu_0", com.example.bagle_bottom_sheet_dialog.R.layout.layout_my_menu);
      sKeys.put("layout/layout_not_logged_in_menu_0", com.example.bagle_bottom_sheet_dialog.R.layout.layout_not_logged_in_menu);
    }
  }
}
