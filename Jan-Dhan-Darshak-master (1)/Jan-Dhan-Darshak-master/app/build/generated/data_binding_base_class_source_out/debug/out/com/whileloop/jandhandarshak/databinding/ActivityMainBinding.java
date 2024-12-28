// Generated by view binder compiler. Do not edit!
package com.whileloop.jandhandarshak.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mikepenz.materialdrawer.widget.MaterialDrawerSliderView;
import com.whileloop.jandhandarshak.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final ImageButton closeCard;

  @NonNull
  public final MaterialButton distance;

  @NonNull
  public final EditText editTextQuery;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final TextView markerAdd;

  @NonNull
  public final CardView markerDetails;

  @NonNull
  public final MaterialButton markerDirections;

  @NonNull
  public final TextView markerName;

  @NonNull
  public final TextView markerOpen;

  @NonNull
  public final TextView markerType;

  @NonNull
  public final ImageButton menu;

  @NonNull
  public final MaterialButton openNow;

  @NonNull
  public final MaterialButton relevance;

  @NonNull
  public final RecyclerView resultList;

  @NonNull
  public final DrawerLayout root;

  @NonNull
  public final RelativeLayout searchBar;

  @NonNull
  public final ProgressBar searchProgress;

  @NonNull
  public final ImageButton searchResultBack;

  @NonNull
  public final ImageButton searchResultClose;

  @NonNull
  public final TextView searchResultText;

  @NonNull
  public final LinearLayout searchResultbar;

  @NonNull
  public final ImageButton searchText;

  @NonNull
  public final MaterialButton showMap;

  @NonNull
  public final MaterialButton showResult;

  @NonNull
  public final MaterialDrawerSliderView slider;

  @NonNull
  public final SwipeRefreshLayout swipeRefresh;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ImageButton voiceSearch;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull AppBarLayout appbar,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull ImageButton closeCard,
      @NonNull MaterialButton distance, @NonNull EditText editTextQuery,
      @NonNull FloatingActionButton fab, @NonNull TextView markerAdd,
      @NonNull CardView markerDetails, @NonNull MaterialButton markerDirections,
      @NonNull TextView markerName, @NonNull TextView markerOpen, @NonNull TextView markerType,
      @NonNull ImageButton menu, @NonNull MaterialButton openNow, @NonNull MaterialButton relevance,
      @NonNull RecyclerView resultList, @NonNull DrawerLayout root,
      @NonNull RelativeLayout searchBar, @NonNull ProgressBar searchProgress,
      @NonNull ImageButton searchResultBack, @NonNull ImageButton searchResultClose,
      @NonNull TextView searchResultText, @NonNull LinearLayout searchResultbar,
      @NonNull ImageButton searchText, @NonNull MaterialButton showMap,
      @NonNull MaterialButton showResult, @NonNull MaterialDrawerSliderView slider,
      @NonNull SwipeRefreshLayout swipeRefresh, @NonNull Toolbar toolbar,
      @NonNull ImageButton voiceSearch) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.bottomNavigationView = bottomNavigationView;
    this.closeCard = closeCard;
    this.distance = distance;
    this.editTextQuery = editTextQuery;
    this.fab = fab;
    this.markerAdd = markerAdd;
    this.markerDetails = markerDetails;
    this.markerDirections = markerDirections;
    this.markerName = markerName;
    this.markerOpen = markerOpen;
    this.markerType = markerType;
    this.menu = menu;
    this.openNow = openNow;
    this.relevance = relevance;
    this.resultList = resultList;
    this.root = root;
    this.searchBar = searchBar;
    this.searchProgress = searchProgress;
    this.searchResultBack = searchResultBack;
    this.searchResultClose = searchResultClose;
    this.searchResultText = searchResultText;
    this.searchResultbar = searchResultbar;
    this.searchText = searchText;
    this.showMap = showMap;
    this.showResult = showResult;
    this.slider = slider;
    this.swipeRefresh = swipeRefresh;
    this.toolbar = toolbar;
    this.voiceSearch = voiceSearch;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.closeCard;
      ImageButton closeCard = ViewBindings.findChildViewById(rootView, id);
      if (closeCard == null) {
        break missingId;
      }

      id = R.id.distance;
      MaterialButton distance = ViewBindings.findChildViewById(rootView, id);
      if (distance == null) {
        break missingId;
      }

      id = R.id.editTextQuery;
      EditText editTextQuery = ViewBindings.findChildViewById(rootView, id);
      if (editTextQuery == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.markerAdd;
      TextView markerAdd = ViewBindings.findChildViewById(rootView, id);
      if (markerAdd == null) {
        break missingId;
      }

      id = R.id.markerDetails;
      CardView markerDetails = ViewBindings.findChildViewById(rootView, id);
      if (markerDetails == null) {
        break missingId;
      }

      id = R.id.markerDirections;
      MaterialButton markerDirections = ViewBindings.findChildViewById(rootView, id);
      if (markerDirections == null) {
        break missingId;
      }

      id = R.id.markerName;
      TextView markerName = ViewBindings.findChildViewById(rootView, id);
      if (markerName == null) {
        break missingId;
      }

      id = R.id.markerOpen;
      TextView markerOpen = ViewBindings.findChildViewById(rootView, id);
      if (markerOpen == null) {
        break missingId;
      }

      id = R.id.markerType;
      TextView markerType = ViewBindings.findChildViewById(rootView, id);
      if (markerType == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageButton menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.openNow;
      MaterialButton openNow = ViewBindings.findChildViewById(rootView, id);
      if (openNow == null) {
        break missingId;
      }

      id = R.id.relevance;
      MaterialButton relevance = ViewBindings.findChildViewById(rootView, id);
      if (relevance == null) {
        break missingId;
      }

      id = R.id.resultList;
      RecyclerView resultList = ViewBindings.findChildViewById(rootView, id);
      if (resultList == null) {
        break missingId;
      }

      DrawerLayout root = (DrawerLayout) rootView;

      id = R.id.searchBar;
      RelativeLayout searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.searchProgress;
      ProgressBar searchProgress = ViewBindings.findChildViewById(rootView, id);
      if (searchProgress == null) {
        break missingId;
      }

      id = R.id.searchResultBack;
      ImageButton searchResultBack = ViewBindings.findChildViewById(rootView, id);
      if (searchResultBack == null) {
        break missingId;
      }

      id = R.id.searchResultClose;
      ImageButton searchResultClose = ViewBindings.findChildViewById(rootView, id);
      if (searchResultClose == null) {
        break missingId;
      }

      id = R.id.searchResultText;
      TextView searchResultText = ViewBindings.findChildViewById(rootView, id);
      if (searchResultText == null) {
        break missingId;
      }

      id = R.id.searchResultbar;
      LinearLayout searchResultbar = ViewBindings.findChildViewById(rootView, id);
      if (searchResultbar == null) {
        break missingId;
      }

      id = R.id.searchText;
      ImageButton searchText = ViewBindings.findChildViewById(rootView, id);
      if (searchText == null) {
        break missingId;
      }

      id = R.id.showMap;
      MaterialButton showMap = ViewBindings.findChildViewById(rootView, id);
      if (showMap == null) {
        break missingId;
      }

      id = R.id.showResult;
      MaterialButton showResult = ViewBindings.findChildViewById(rootView, id);
      if (showResult == null) {
        break missingId;
      }

      id = R.id.slider;
      MaterialDrawerSliderView slider = ViewBindings.findChildViewById(rootView, id);
      if (slider == null) {
        break missingId;
      }

      id = R.id.swipeRefresh;
      SwipeRefreshLayout swipeRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeRefresh == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.voiceSearch;
      ImageButton voiceSearch = ViewBindings.findChildViewById(rootView, id);
      if (voiceSearch == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, appbar, bottomNavigationView,
          closeCard, distance, editTextQuery, fab, markerAdd, markerDetails, markerDirections,
          markerName, markerOpen, markerType, menu, openNow, relevance, resultList, root, searchBar,
          searchProgress, searchResultBack, searchResultClose, searchResultText, searchResultbar,
          searchText, showMap, showResult, slider, swipeRefresh, toolbar, voiceSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}