package com.example.android.camerax.video.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camerax.video.R;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CaptureFragmentDirections {
  private CaptureFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCaptureToPermissions() {
    return new ActionOnlyNavDirections(R.id.action_capture_to_permissions);
  }

  @NonNull
  public static ActionCaptureToVideoViewer actionCaptureToVideoViewer(@NonNull Uri uri) {
    return new ActionCaptureToVideoViewer(uri);
  }

  public static class ActionCaptureToVideoViewer implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCaptureToVideoViewer(@NonNull Uri uri) {
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("uri", uri);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCaptureToVideoViewer setUri(@NonNull Uri uri) {
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("uri", uri);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("uri")) {
        Uri uri = (Uri) arguments.get("uri");
        if (Parcelable.class.isAssignableFrom(Uri.class) || uri == null) {
          __result.putParcelable("uri", Parcelable.class.cast(uri));
        } else if (Serializable.class.isAssignableFrom(Uri.class)) {
          __result.putSerializable("uri", Serializable.class.cast(uri));
        } else {
          throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_capture_to_video_viewer;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Uri getUri() {
      return (Uri) arguments.get("uri");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCaptureToVideoViewer that = (ActionCaptureToVideoViewer) object;
      if (arguments.containsKey("uri") != that.arguments.containsKey("uri")) {
        return false;
      }
      if (getUri() != null ? !getUri().equals(that.getUri()) : that.getUri() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUri() != null ? getUri().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCaptureToVideoViewer(actionId=" + getActionId() + "){"
          + "uri=" + getUri()
          + "}";
    }
  }
}
