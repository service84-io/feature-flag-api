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

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FeatureFlagAPIBase implements FeatureFlagAPI {
  private static final Logger logger = LoggerFactory.getLogger(FeatureFlagAPIBase.class);

  @Override
  public List<String> getFlags(Integer page, Integer limit) {
    logger.debug("getFlags");
    throw new UnsupportedOperationException();
  }

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
