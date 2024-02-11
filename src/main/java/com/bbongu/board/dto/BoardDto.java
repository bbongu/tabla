package com.bbongu.board.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter

public class BoardDto {

    private Long boardId;

    private String title;
    private String content;
    private String userName;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime createDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime updateDate;

    @Builder
    public BoardDto (Long boardId, String title, String content, String userName, LocalDateTime createDate, LocalDateTime updateDate) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
