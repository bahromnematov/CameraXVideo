package com.example.android.camerax.video.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VideoViewerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VideoViewerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private VideoViewerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VideoViewerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VideoViewerFragmentArgs __result = new VideoViewerFragmentArgs();
    bundle.setClassLoader(VideoViewerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("uri")) {
      Uri uri;
      if (Parcelable.class.isAssignableFrom(Uri.class) || Serializable.class.isAssignableFrom(Uri.class)) {
        uri = (Uri) bundle.get("uri");
      } else {
        throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("uri", uri);
    } else {
      throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VideoViewerFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    VideoViewerFragmentArgs __result = new VideoViewerFragmentArgs();
    if (savedStateHandle.contains("uri")) {
      Uri uri;
      uri = savedStateHandle.get("uri");
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("uri", uri);
    } else {
      throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Uri getUri() {
    return (Uri) arguments.get("uri");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("uri")) {
      Uri uri = (Uri) arguments.get("uri");
      if (Parcelable.class.isAssignableFrom(Uri.class) || uri == null) {
        __result.set("uri", Parcelable.class.cast(uri));
      } else if (Serializable.class.isAssignableFrom(Uri.class)) {
        __result.set("uri", Serializable.class.cast(uri));
      } else {
        throw new UnsupportedOperationException(Uri.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VideoViewerFragmentArgs that = (VideoViewerFragmentArgs) object;
    if (arguments.containsKey("uri") != that.arguments.containsKey("uri")) {
      return false;
    }
    if (getUri() != null ? !getUri().equals(that.getUri()) : that.getUri() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUri() != null ? getUri().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VideoViewerFragmentArgs{"
        + "uri=" + getUri()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull VideoViewerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Uri uri) {
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("uri", uri);
    }

    @NonNull
    public VideoViewerFragmentArgs build() {
      VideoViewerFragmentArgs result = new VideoViewerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUri(@NonNull Uri uri) {
      if (uri == null) {
        throw new IllegalArgumentException("Argument \"uri\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("uri", uri);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Uri getUri() {
      return (Uri) arguments.get("uri");
    }
  }
}
