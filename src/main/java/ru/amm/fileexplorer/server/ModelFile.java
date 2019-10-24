package ru.amm.fileexplorer.server;

import java.io.Serializable;

public class ModelFile implements Serializable {

    private String name;
    private Boolean directory;

    public Boolean isDirectory() {
        return directory;
    }

    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelFile(String name, boolean directory) {
        this.name = name;
        this.directory = directory;
    }
}
