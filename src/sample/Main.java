package sample;
import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Game.Board;
import sample.Players.HumanPlyr;

import javax.swing.*;
import java.awt.*;

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
        final JPanel panel = new JPanel();
        panel.add(new JButton(new AbstractAction("Instructions") {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "*Add Instrustions Here*");
            }
        }
        ));
        JOptionPane.showMessageDialog(null, panel);

        Board board = new Board();
        System.out.println(board);
        HumanPlyr Player1 = new HumanPlyr();


        //JOptionPane.showMessageDialog(null, board);
        //JButton[][] thing = new JButton[3][3];
        //JOptionPane.showMessageDialog();
        /*JOptionPane.showMessageDialog(null,
                "Rohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan" +
                "\nRohan                   rohan");

        String name = JOptionPane.showInputDialog(null, "Hello World");*/

    }
}
