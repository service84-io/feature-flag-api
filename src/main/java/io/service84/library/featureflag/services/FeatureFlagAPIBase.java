package io.service84.library.featureflag.services;

public abstract class FeatureFlagAPIBase implements FeatureFlagAPI {

  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    throw new UnsupportedOperationException();
  }
}
