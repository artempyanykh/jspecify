/*
 * Copyright 2022 The JSpecify Authors.
 *
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

import org.jspecify.nullness.NullMarked;
import org.jspecify.nullness.Nullable;
import org.jspecify.nullness.NullnessUnspecified;

@NullMarked
abstract class ExtendsSameType {
  interface Foo {}

  interface Lib<T> {}

  interface Supplier<T extends @Nullable Object> {}

  abstract void use(Lib<Supplier<? extends Foo>> l);

  abstract void useUnspec(Lib<Supplier<? extends @NullnessUnspecified Foo>> l);

  abstract void useUnionNull(Lib<Supplier<? extends @Nullable Foo>> l);

  void client(Lib<Supplier<? extends Foo>> l) {
    use(l);
    // jspecify_nullness_not_enough_information
    useUnspec(l);
    // jspecify_nullness_mismatch
    useUnionNull(l);
  }

  void clientUnspec(Lib<Supplier<? extends @NullnessUnspecified Foo>> l) {
    // jspecify_nullness_not_enough_information
    use(l);
    // jspecify_nullness_not_enough_information
    useUnspec(l);
    // jspecify_nullness_not_enough_information
    useUnionNull(l);
  }

  void clientUnionNull(Lib<Supplier<? extends @Nullable Foo>> l) {
    // jspecify_nullness_mismatch
    use(l);
    // jspecify_nullness_not_enough_information
    useUnspec(l);
    useUnionNull(l);
  }
}
