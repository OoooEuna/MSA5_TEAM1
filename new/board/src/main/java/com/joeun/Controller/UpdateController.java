package com.joeun.Controller;

import java.io.IOException;
import com.joeun.App;
import com.joeun.DTO.Board;
import com.joeun.Service.BoardService;
import com.joeun.Service.BoardServiceImpl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateController{
    
    @FXML
    private TextArea tContent;

    @FXML
    private TextField tTtile;

    @FXML
    private TextField tWriter;

    private BoardService boardService = new BoardServiceImpl();

    int boardNo;

    @FXML
    void moveToInsert(ActionEvent event) throws IOException {
        App.setRoot("board/insert");
    }

    @FXML
    void moveToList(ActionEvent event) throws IOException {
        App.setRoot("board/list");
    }

    @FXML
    void moveToRead(ActionEvent event) throws IOException {
        App.setRoot("board/read");
    }

}
