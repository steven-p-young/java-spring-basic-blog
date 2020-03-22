package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    public String listPosts(ModelMap mMap){
        @RequestMapping("/")
        mMap.put("title","Blog Post 1");
        return "home";
    }
}
