import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RAAN {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Application");
        frame.setSize(600, 400);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu menuHelloCli = new JMenu("HelloCli");
        JMenuItem itemHelloEn=new JMenuItem("HelloEn");
        menuHelloCli.add(itemHelloEn);
        menu.add(menuHelloCli);
         itemHelloEn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello,world");
            }
        });


        frame.setJMenuBar(menu);

    }
}
