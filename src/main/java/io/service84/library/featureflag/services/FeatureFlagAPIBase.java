/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.service84.library.featureflag.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.service84.library.featureflag.model.FlagPage;

public abstract class FeatureFlagAPIBase implements FeatureFlagAPI {
  private static final Logger logger = LoggerFactory.getLogger(FeatureFlagAPIBase.class);

  @Override
  public void createFlag(String flagName) {
    logger.debug("createFlag");
    throw new UnsupportedOperationException();
  }

  @Override
  public FlagPage getFlags(String cursor, Integer limit) {
    logger.debug("getFlags");
    throw new UnsupportedOperationException();
  }

  /*
   * @deprecated Use getValue instead
   */
  @Deprecated(since = "1.3.0")
  @Override
  public Boolean getFlag(String flagName, String user, Boolean defaultValue) {
    logger.debug("getFlag");
    throw new UnsupportedOperationException();
  }

  @Override
  public Boolean getValue(String flagName, String user) {
    logger.debug("getValue");
    return getValue(flagName, user, Boolean.TRUE);
  }

  @Override
  public Boolean getValue(String flagName, String user, Boolean defaultValue) {
    logger.debug("getValue");
    return getFlag(flagName, user, defaultValue);
  }

  @Override
  public void setValue(String flagName, Boolean value) {
    logger.debug("setValue");
    throw new UnsupportedOperationException();
  }

  @Override
  public void setValue(String flagName, String user, Boolean value) {
    logger.debug("setValue");
    throw new UnsupportedOperationException();
  }

  @Override
  public void clearAllUserValues(String flagName) {
    logger.debug("clearAllUserValues");
    throw new UnsupportedOperationException();
  }

  @Override
  public void clearValue(String flagName) {
    logger.debug("clearValue");
    throw new UnsupportedOperationException();
  }

  @Override
  public void clearValue(String flagName, String user) {
    logger.debug("clearValue");
    throw new UnsupportedOperationException();
  }
}
