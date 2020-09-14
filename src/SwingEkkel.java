package testEkkel;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 * User: A.Maslennikov
 * Date: 10.09.2020
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */

public class SwingEkkel {
    static Normaldy ny;
    public static void main(String[] args) throws InterruptedException {
        //doFrame();
//        JButton button = new JButton("Knopko");r.enikeev@reph.ru
//        frame.add(button);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ny = new Normaldy();
            }
        });
        TimeUnit.SECONDS.sleep(3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ny.label.setText("ONONO KAK");
            }
        });
    }
    static void doFrame() throws InterruptedException {
        JFrame frame = new JFrame("frame number oneee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
        final JLabel label = new JLabel("lebel odnako");
        frame.add(label);
        TimeUnit.SECONDS.sleep(3);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Lebel dvoyako");
            }
        });
    }

}

class Normaldy extends JFrame {
    JLabel label;
    public Normaldy() {
        JFrame frame = new JFrame("frame number oneee");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        label = new JLabel("lebel odnako");
        frame.add(label);
    }
    public void setLabel(String str) {
        label.setText(str);
    }

}
