package com.example.testboard.mapper;

import com.example.testboard.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount(); //곧 생성할 BoardMapper.xml 첫 번째 sql문의 id와 같다

    List<Board> getList();
}
