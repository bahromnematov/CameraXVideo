package com.example.android.camerax.video.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camerax.video.R;

public class VideoViewerFragmentDirections {
  private VideoViewerFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionVideoViewerToCapture() {
    return new ActionOnlyNavDirections(R.id.action_video_viewer_to_capture);
  }
}
