package oit.is.z0031.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {
  String player;
  String result;

  @PostMapping("lec02")
  public String lec02(@RequestParam String name1, ModelMap model) {
    model.addAttribute("name1", name1);
    return "lec02.html";
  }

  @GetMapping("lec02/{te}")
  public String gu(@PathVariable String te, ModelMap model) {
    model.addAttribute("player", te);
    if (te.equals("gu")) {
      result = "Draw!";
    } else if (te.equals("choki")) {
      result = "You Lose!";
    } else {
      result = "You Win!";
    }
    model.addAttribute("result", result);
    return "lec02.html";
  }

}
