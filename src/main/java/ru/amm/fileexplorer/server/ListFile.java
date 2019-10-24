package ru.amm.fileexplorer.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
class ListFile {

    @Value("${filemanager.path-to-publish}")
    private String path;

    /*@GetMapping("/home")
    String home()
    {
        return "home";
    }*/

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("path" , path);
        OpenFile of = new OpenFile(path);
        model.addAttribute("files" , of.getNameFile());
        return "Home";
    }

   /* @RequestMapping("/")
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
    }*/
}
