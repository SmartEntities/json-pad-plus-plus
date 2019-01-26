/**
 * Copyright 2018 Jignesh Dhua.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jigneshdhua.tools.jsonpad.utils;

import javafx.scene.control.Alert;

import java.io.File;

public final class Utils {

    private final static String TAG = Utils.class.getSimpleName();

    public static void showErrorDialog(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static String getExtension(File file) {
        String name = file.getName();
        int i = file.getName().lastIndexOf('.');
        if (i >= 0 && name.length() >= i + 1) {
            return file.getName().substring(i + 1).toLowerCase();
        } else {
            return "";
        }
    }

}