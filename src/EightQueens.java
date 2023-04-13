package com.special.effect.javafxprojects;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EightQueens extends Application {
    public static final int SIZE = 8;
    private int[] queens = {-1, -1, -1, -1, -1, -1, -1, -1};

    @Override
    public void start(Stage stage) throws Exception {
        search();

        GridPane chessBoard = new GridPane();
        chessBoard.setAlignment(Pos.CENTER);
        Label[][] labels = new Label[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++)
            for(int j = 0; j < SIZE; j++){
                chessBoard.add(labels[i][j] = new Label(), j, i);
                labels[i][j].setStyle("-fx-border-color: black");
                labels[i][j].setPrefSize(55, 55);
            }
        Image image = new Image("C://Users//FAbdu//Downloads//queen2.png");
        Image icon = new Image("C://Users//FAbdu//Downloads//queen2.png");

        for(int i = 0; i < SIZE; i++)
            labels[i][queens[i]].setGraphic(new ImageView(image));

        Scene scene = new Scene(chessBoard, 55 * SIZE, 55 * SIZE);
        stage.setTitle("Eight Queens");
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.show();
    }
    private boolean search(){
        int k = 0;
        while(k >= 0 && k < SIZE){
            int j = findPosition(k);
            if(j < 0){
                queens[k] = -1;
                k--;
            }else{
                queens[k] = j;
                k++;
            }
        }
        if(k == -1)
            return false;
        else
            return true;
    }
    public int findPosition(int k){
        int start = queens[k] + 1;
        for(int j = start; j < SIZE; j++){
            if(isValid(k, j))
                return j;
        }
        return -1;
    }
    public boolean isValid(int row, int column){
        for(int i = 1; i <= row; i++)
            if(queens[row - i] == column
                || queens[row - i] == column - i
                || queens[row - i] == column + i)
                return false;
        return true;
    }
}
