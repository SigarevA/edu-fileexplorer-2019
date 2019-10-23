package ru.amm.fileexplorer.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ListFile {

    @Value("${filemanager.path-to-publish}")
    private String path;

    @RequestMapping("/")
    String home() {
        return "Hello World!" + path;
    }
}
