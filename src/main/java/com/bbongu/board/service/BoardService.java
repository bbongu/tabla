package com.bbongu.board.service;

import com.bbongu.board.dto.BoardDto;
import com.bbongu.board.dto.BoardListDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    public List<BoardListDto> getBoardList() {
       List<BoardListDto> boardListDtos = new ArrayList<>();
       Long id = 0L;

       boardListDtos.add(BoardListDto.builder()
               .boardId(id)
               .title("temp")
               .userName("bbongu")
               .createDate(LocalDateTime.now())
               .updateDate(LocalDateTime.now())
               .build());
       return boardListDtos;
    }

    public BoardDto getArticleByBoardId(Long boardId) {
       // BoardDto boardDto = new BoardDto();

//        BoardDto boardDto = BoardDto.builder()
//                .boardId(boardId)
//                .title("하하")
//                .userName("봉구")
//                .createDate((LocalDateTime.now()))
//                .updateDate(LocalDateTime.now())
//                .build();
//
//        return boardDto;

        return BoardDto.builder()
                .boardId(boardId)
                .title("하하")
                .userName("봉구")
                .createDate((LocalDateTime.now()))
                .updateDate(LocalDateTime.now())
                .build();
    }

    public BoardDto saveArticle(BoardDto boardDto) {
        //Long boardId = 0L;



        return boardDto;
    }
}
