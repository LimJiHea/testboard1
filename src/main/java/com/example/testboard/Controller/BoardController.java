package com.example.testboard.Controller;

import com.example.testboard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/board/**")
@RequiredArgsConstructor        //생성자주입
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello(){
        return "/boards/hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test",service.boardList());

        return "/boards/hello";

    }
}
