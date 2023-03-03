package com.example.android.camerax.video.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camerax.video.R;

public class PermissionsFragmentDirections {
  private PermissionsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionPermissionsToCapture() {
    return new ActionOnlyNavDirections(R.id.action_permissions_to_capture);
  }
}
