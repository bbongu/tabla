package com.bbongu.board.service;

import com.bbongu.board.dto.BoardListDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
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
}
