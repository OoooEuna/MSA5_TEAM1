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

public class ReadController{
    
    @FXML
    private TextField boardNo;

    @FXML
    private TextArea tContent;

    @FXML
    private TextField tTtile;

    @FXML
    private TextField tWriter;

    private BoardService boardService = new BoardServiceImpl();

    @FXML
    void clickRead(ActionEvent event) throws IOException {
        int no = Integer.parseInt(boardNo.getText());
        read(no);
    }

    @FXML
    void moveToInsert(ActionEvent event) throws IOException {
        App.setRoot("board/insert");
    }

    @FXML
    void moveToList(ActionEvent event) throws IOException {
        App.setRoot("board/list");
    }

    @FXML
    void moveToUpdate(ActionEvent event) throws IOException {
        App.setRoot("board/update");
    }

    public void read(int no) {
        Board board = boardService.select(no);
        tTtile.setText(board.getTitle());
        tWriter.setText(board.getWriter());
        tContent.setText(board.getContent());
    }

}
