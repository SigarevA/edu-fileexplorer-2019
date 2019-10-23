package ru.amm.fileexplorer.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ListFile {

    @Value("${filemanager.path-to-publish}")
    private String path;

    @RequestMapping("/")
    String home() {
        OpenFile dir = new OpenFile(path);
        String str = "";
        if(dir.isDirectory()) {
            String[] name_files = dir.getNameFile();
            str = "<h1>Hello World!</h1><p>" + path + "<br/>";
            for (String name_file : name_files) {
                str += name_file + "<br/>";
            }
            str += "</p>";
        }
        return str+ path;
    }
}
