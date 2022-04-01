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

import io.service84.library.featureflag.model.FlagPage;

public interface FeatureFlagAPI {
  public FlagPage getFlags(String cursor, Integer limit);

  /*
   * @deprecated Use getValue instead
   */
  @Deprecated(since = "1.3.0")
  public Boolean getFlag(String flagName, String user, Boolean defaultValue);

  public Boolean getValue(String flagName, String user);

  public Boolean getValue(String flagName, String user, Boolean defaultValue);

  public void setValue(String flagName, Boolean value);

  public void setValue(String flagName, String user, Boolean value);

  public void clearValue(String flagName);

  public void clearValue(String flagName, String user);
}
