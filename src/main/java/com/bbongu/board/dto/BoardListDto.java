package com.bbongu.board.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter

@ToString
public class BoardListDto {
    private Long boardId;
    private String title;
    private String userName;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime createDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime updateDate;

    @Builder
    public BoardListDto(Long boardId, String title, String userName, LocalDateTime createDate, LocalDateTime updateDate) {
        this.boardId = boardId;
        this.title = title;
        this.userName = userName;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
}
