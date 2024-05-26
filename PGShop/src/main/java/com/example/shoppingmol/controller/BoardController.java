package com.example.shoppingmol.controller;

import com.example.shoppingmol.dto.BoardDTO;
import com.example.shoppingmol.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO){
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }
}
