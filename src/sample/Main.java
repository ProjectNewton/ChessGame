package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Game.Board;

import javax.swing.*;

public class Main extends Application {
    public static int round = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }



    public static void main(String[] args) {
        Board board = new Board();
        board.display(board.getPieceBoard());
        JOptionPane.showMessageDialog(null,
                "Rohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan");

        String name = JOptionPane.showInputDialog(null, "Hello World");
    }
}
