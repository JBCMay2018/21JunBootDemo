package me.afua.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("mypingpongball","<strong>This is my ping pong ball</strong>");
      return "index";
    }


    @GetMapping("/addsong")
    public String loadFormPage(Model model)
    {
        model.addAttribute("aSong",new Song());
        return  "songform";
    }

    @PostMapping("/addsong")
    public String saveForm(@ModelAttribute("aSong") Song theSong, Model model)
    {
        model.addAttribute("aSong",theSong);
        return "confirmsong";
    }

}
