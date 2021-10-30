package io.service84.library.featureflag.services;

import java.util.List;

public abstract class FeatureFlagAPIBase implements FeatureFlagAPI {
  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Boolean getValue(String flagName, String user, Boolean defaultValue) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<String> getFlags(Integer page, Integer limit) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setValue(String flagName, Boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setValue(String flagName, String user, Boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void clearValue(String flagName) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void clearValue(String flagName, String user) {
    throw new UnsupportedOperationException();
  }
}
