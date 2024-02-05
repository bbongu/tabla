package com.bbongu.board.controller;


import com.bbongu.board.dto.BoardListDto;
import com.bbongu.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/boards")
    public ResponseEntity<List<BoardListDto>> getList() {

        return ResponseEntity.ok().body(boardService.getBoardList());
    }
}
