package com.example.testboard.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/board/**")
@RequiredArgsConstructor        //생성자주입
public class BoardController {

    @GetMapping("/hello")
    public String Hello(){
        return "/boards/hello";
    }

}
