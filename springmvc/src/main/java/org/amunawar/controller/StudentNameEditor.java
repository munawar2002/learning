package org.amunawar.controller;

import java.beans.PropertyEditorSupport;

/**
 * Created by sheik on 7/28/2018.
 */

public class StudentNameEditor extends PropertyEditorSupport{

    @Override
    public void setAsText(String name) throws IllegalArgumentException {
        if(name.contains("Ms.") || name.contains("Mr.")){
            setValue(name);
        }else {
            name = "Ms."+name;
            setValue(name);
        }
    }
}
