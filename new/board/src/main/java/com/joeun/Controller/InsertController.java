package com.joeun.Controller;

import java.io.IOException;

import com.joeun.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {
    
    @FXML
    private TextArea tContent;

    @FXML
    private TextField tTtile;

    @FXML
    private TextField tWriter;

    @FXML
    void insert(ActionEvent event) {
        
    }

    @FXML
    void moveToList(ActionEvent event) throws IOException {
        App.setRoot("board/list");
    }

}
