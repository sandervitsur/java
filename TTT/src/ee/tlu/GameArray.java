package ee.tlu;

import javax.swing.*;

public class GameArray {



private Board Brd;
private int GameArr[][];
private boolean Turn;
private JButton Pressed;

GameArray(Board B) {

    GameArr = new int[3][3];

    Brd = B;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            GameArr[i][j] = 0;
        }
    }

}

public void ArrayInitialize(int i, int j, int Marker) {

  

    GameArr[i][j] = Marker;
    WinCheck(Marker);
}


public void WinCheck(int Marker) {

    

    if ((GameArr[0][0] == Marker && GameArr[0][1] == Marker && GameArr[0][2] == Marker) || (GameArr[1][0] == Marker && GameArr[1][1] == Marker && GameArr[1][2] == Marker) || (GameArr[2][0] == Marker && GameArr[2][1] == Marker && GameArr[2][2] == Marker)) {

        if (Marker == 1) {

            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 1 Võitis");

        } else if (Marker == 2) {

            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 2 Võitis");

        }

        Brd.DisableAll(false);

    } else if ((GameArr[0][0] == Marker && GameArr[1][0] == Marker && GameArr[2][0] == Marker) || (GameArr[0][1] == Marker && GameArr[1][1] == Marker && GameArr[2][1] == Marker) || (GameArr[0][2] == Marker && GameArr[1][2] == Marker && GameArr[2][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 1 Võitis");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 2 Võitis");

        }

        Brd.DisableAll(false);

    } else if ((GameArr[0][0] == Marker && GameArr[1][1] == Marker && GameArr[2][2] == Marker) || (GameArr[2][0] == Marker && GameArr[1][1] == Marker && GameArr[0][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 1 Võitis ");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "Õnnitlused ! : Mängija 2 Võitis");

        }
        Brd.DisableAll(false);

    }

}

}