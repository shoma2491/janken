package oit.is.z0031.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {
  @PostMapping("lec02")
  public String lec02(@RequestParam String name1, ModelMap model) {
    model.addAttribute("name1", name1);
    return "lec02.html";
  }
}
