import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {

    private JButton helloButton;
    private JPanel panel;
    private JTextField textField;

    static int num;

    public App()
    {

        helloButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

                int userNum = Integer.parseInt(textField.getText());
                if (userNum > num)
                    JOptionPane.showMessageDialog(null, "Число меньше");
                else if (userNum < num)
                    JOptionPane.showMessageDialog(null, "Число больше");
                else
                    JOptionPane.showMessageDialog(null, "Вы угадали");

            }
        });
    }

    public static void main(String[] args)
    {
        num = (int)Math.floor(Math.random() * 10);

        JFrame frame = new JFrame("cheburek");
        frame.setContentPane(new App().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
