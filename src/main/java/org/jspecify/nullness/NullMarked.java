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

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated element and the code transitively <a
 * href="https://docs.oracle.com/en/java/javase/18/docs/api/java.compiler/javax/lang/model/element/Element.html#getEnclosedElements()">enclosed</a>
 * within it is <b>null-marked code</b>: type usages are generally considered to exclude {@code
 * null} as a value unless specified otherwise (special cases to be covered below). Using this
 * annotation avoids the need to write {@link NonNull @NonNull} many times throughout your code.
 *
 * <p><b>WARNING:</b> This annotation is under development, and <i>any</i> aspect of its naming,
 * location, or design may change before 1.0. <b>Do not release libraries using this annotation at
 * this time.</b>
 */
@Documented
@Target({TYPE, METHOD, CONSTRUCTOR, PACKAGE, MODULE})
@Retention(RUNTIME)
public @interface NullMarked {}
