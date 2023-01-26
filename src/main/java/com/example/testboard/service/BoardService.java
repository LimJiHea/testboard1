package com.example.testboard.service;

import com.example.testboard.domain.Board;
import com.example.testboard.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor    //Mapper 생성자를 사용할 수 있게 함
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount(){
        return boardMapper.boardCount();    //게시글 수 반환
    }

    public List<Board> boardList(){
        return boardMapper.getList();   //게시글 리스트 반환
    }
}
