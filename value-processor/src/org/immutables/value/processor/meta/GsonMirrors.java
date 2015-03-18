/*
    Copyright 2015 Immutables Authors and Contributors

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.immutables.value.processor.meta;

import org.immutables.mirror.Mirror;

public final class GsonMirrors {
  private GsonMirrors() {}

  @Mirror.Annotation("org.immutables.gson.Gson.TypeAdapters")
  public @interface TypeAdapters {
    boolean fieldNamingStrategy() default false;

    boolean emptyAsNulls() default false;
  }

  @Mirror.Annotation("org.immutables.gson.Gson.ExpectedSubtypes")
  public @interface ExpectedSubtypes {
    Class<?>[] value() default {};
  }

  @Mirror.Annotation("org.immutables.gson.Gson.Named")
  public @interface Named {
    String value();
  }

  @Mirror.Annotation("org.immutables.gson.Gson.Ignore")
  public @interface Ignore {}
}
