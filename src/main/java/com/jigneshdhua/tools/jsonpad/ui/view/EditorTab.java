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
package com.jigneshdhua.tools.jsonpad.ui.view;

import javafx.scene.control.Tab;

import java.io.File;

import com.jigneshdhua.tools.jsonpad.controller.ui.EditorTabController;

public class EditorTab extends Tab {

    private File file;
    
    private EditorTabController editorTabController; 

    public EditorTab(File file, EditorTabController editorTabController) {
        super(file.getName());
        this.file = file;
        this.editorTabController = editorTabController;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        setText(file.getName());
    }

    public EditorTabController getEditorTabController() {
        return editorTabController;
    }

}
