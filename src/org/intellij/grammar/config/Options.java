/*
 * Copyright 2011-present Greg Shrago
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.grammar.config;

import com.intellij.openapi.util.Getter;

/**
 * @author gregsh
 */
public interface Options {

  Getter<String> GEN_DIR = Option.strOption("grammar.kit.gen.dir", "gen");
  Getter<String> GEN_JFLEX_ARGS = Option.strOption("grammar.kit.gen.jflex.args", "");

  Getter<Integer> GPUB_MAX_LEVEL = Option.intOption("grammar.kit.gpub.max.level", 1000);

  Getter<Boolean> INJECT_JAVA_IN_JFLEX = Option.boolOption("grammar.kit.inject.java", true);
  Getter<Boolean> BNF_INJECT_REGEXP_IN_BNF = Option.boolOption("grammar.kit.inject.regexp", true);
}
