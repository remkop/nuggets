/*
 *    Copyright 2016 by Dimitar Dimitrov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.ddimitrov.nuggets;

class TextTableJavaDemo {
    public static TextTable tableForArrayData(TextTable.LayoutBuilder b) {
        return b.withData().rows(
            new Object[] {"abc", 123, ""},
            new Object[] {"foobar", "bazqux", "whatever blah"}
        ).buildTable();
    }
}
