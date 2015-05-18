package ee.tlu;

import java.awt.*;
import javax.swing.*;

public class Control extends JFrame {



private Board GameBoard;
private Tools TButtons; 

Control() {

    setLayout(new BorderLayout());

    GameBoard = new Board();
    TButtons = new Tools();

    TButtons.SetObject(GameBoard);

    add(GameBoard, BorderLayout.CENTER);
    add(TButtons, BorderLayout.SOUTH);

    setVisible(true);
    setSize(350, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}