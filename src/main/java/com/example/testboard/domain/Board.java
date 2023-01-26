package com.example.testboard.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
   private Long boardId;      //게시판 번호
   private String title;      //제목
   private String content;    //내용
   private String name;       //이름
   private LocalDateTime creatDate;    //게시글 작성일
   private int read;       //조회수
   private Long memberId;     //회원 아이디
}
