/*
 * Copyright 2018-2020 The JSpecify Authors.
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
package org.jspecify.nullness;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated type usage is considered to include {@code null} as a value. A "type
 * usage" is commonly a variable type or method return type; other cases are covered below as well.
 *
 * <p>Example usages:
 *
 * <ul>
 *   <li>{@code @Nullable String field;}
 *   <li>{@code @Nullable String getField() { return field; }}
 *   <li>void setField(@Nullable String value) { field = value; }}
 *   <li>{@code List<@Nullable String> getList() { ... }}
 * </ul>
 *
 * <p>For a guided introduction to JSpecify nullness annotations, please see the <a
 * href="https://jspecify.dev/user-guide.html">user guide</a>.
 *
 * <p><b>WARNING:</b> This annotation is under development, and <i>any</i> aspect of its naming,
 * location, or design may change before 1.0. <b>Do not release libraries using this annotation at
 * this time.</b>
 */
@Documented
@Target(TYPE_USE)
@Retention(RUNTIME)
public @interface Nullable {}
