package com.bbongu.board.controller;


import com.bbongu.board.dto.BoardDto;
import com.bbongu.board.dto.BoardListDto;
import com.bbongu.board.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/boards")
    public ResponseEntity<List<BoardListDto>> getList() {
        return ResponseEntity.ok().body(boardService.getBoardList());
    }

    @GetMapping("/board")
    public ResponseEntity<BoardDto> getArticle(@RequestParam("boardId") Long boardId){
        return ResponseEntity.ok().body(boardService.getArticleByBoardId(boardId));
    }

    @GetMapping("/board/{boardId}")
    public ResponseEntity<BoardDto> getArtible(@PathVariable("boardId") Long boardId) {
        return ResponseEntity.ok().body(boardService.getArticleByBoardId(boardId));
    }

    @PostMapping("/board")
    public BoardDto saveArticle(@RequestBody BoardDto boardDto) {
        return boardService.saveArticle(boardDto);
    }
}
