import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {

    public static void main(String[] args) {
        Picture gui = new Picture();
        gui.go();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = new ImageIcon("img.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
