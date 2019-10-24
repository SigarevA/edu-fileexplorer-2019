package ru.amm.fileexplorer.server;

import java.io.Serializable;

public class ModelFile implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelFile(String name) {
        this.name = name;
    }
}
