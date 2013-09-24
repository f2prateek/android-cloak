/*
 * Copyright 2013 Prateek Srivastava (@f2prateek)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.f2prateek.cloak.sample;

import com.f2prateek.cloak.CloakedApplication;
import dagger.Module;
import java.util.ArrayList;
import java.util.List;

public class SampleApplication extends CloakedApplication {

  @Override
  protected List<Object> getModules() {
    ArrayList<Object> modules = new ArrayList<Object>(super.getModules());
    modules.add(new InjectionPointsModule());
    return modules;
  }

  @Module(
      injects = {
          SampleActivity.class
      },
      complete = false,
      library = true)
  /** A module to specify all injection points */
  public class InjectionPointsModule {
  }
}
