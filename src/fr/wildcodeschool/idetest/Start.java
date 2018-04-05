package fr.wildcodeschool.idetest;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiwgPjMxKUAH5_OhKLywcVeqL5leBZe3Q0ARd4f0yp3L0ZmH5rNg"))));
        jf.pack();
        jf.setVisible(true);
    }
}