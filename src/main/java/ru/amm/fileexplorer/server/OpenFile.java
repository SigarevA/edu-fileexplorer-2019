package ru.amm.fileexplorer.server;


import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class OpenFile extends File {

    public OpenFile(String name) {
        super(name);
    }

    public LinkedList<ModelFile> getNameFile() {
        var list = new LinkedList<ModelFile>();
        for(File file : this.listFiles())
        {
            list.add(new ModelFile(file.getName(), file.isDirectory()));
        }
        return list;
    }
}
