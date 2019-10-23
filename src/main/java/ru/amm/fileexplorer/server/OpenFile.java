package ru.amm.fileexplorer.server;


import java.io.File;

public class OpenFile extends File {

    public OpenFile(String name) {
        super(name);
    }

    public String[] getNameFile() {
        return this.list();
    }
}
