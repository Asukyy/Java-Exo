package javaOld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Morpion extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private int[][] grille;
    private int currentPlayer;

    public Morpion() {
        grille = new int[3][3];
        currentPlayer = 1;

        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        setLayout(new GridLayout(3, 3));
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttonClicked == buttons[i][j] && grille[i][j] == 0) {
                    if (currentPlayer == 1) {
                        grille[i][j] = 1;
                        buttonClicked.setText("X");
                    } else {
                        grille[i][j] = 2;
                        buttonClicked.setText("O");
                    }

                    currentPlayer = 3 - currentPlayer; // Change le joueur

                    int gagnant = verifierGagnant();
                    if (gagnant != 0) {
                        JOptionPane.showMessageDialog(this, "Le joueur " + gagnant + " a gagné !");
                        resetGame();
                    } else if (estMatchNul()) {
                        JOptionPane.showMessageDialog(this, "Match nul !");
                        resetGame();
                    }
                }
            }
        }
    }

    private int verifierGagnant() {
    // vérifier les lignes
    for (int i = 0; i < 3; i++) {
        if (grille[i][0] != 0 && grille[i][0] == grille[i][1] && grille[i][1] == grille[i][2]) {
            return grille[i][0];
        }
    }

    // vérifier les colonnes
    for (int j = 0; j < 3; j++) {
        if (grille[0][j] != 0 && grille[0][j] == grille[1][j] && grille[1][j] == grille[2][j]) {
            return grille[0][j];
        }
    }

    // vérifier les diagonales
    if (grille[0][0] != 0 && grille[0][0] == grille[1][1] && grille[1][1] == grille[2][2]) {
        return grille[0][0];
    }
    if (grille[0][2] != 0 && grille[0][2] == grille[1][1] && grille[1][1] == grille[2][0]) {
        return grille[0][2];
    }

    return 0;
}


    private boolean estMatchNul() {
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == 0 || grille[i][1] == 0 || grille[i][2] == 0) {
                return false;
            }
        }
        return true;
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                grille[i][j] = 0;
            }
        }
        currentPlayer = 1;
    }

    public static void main(String[] args) {
        new Morpion();
    }
}