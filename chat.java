import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chat extends JFrame implements ActionListener{
  public static void main(String args[]){
    chat frame = new chat("タイトル");
    frame.setVisible(true);
  }

  chat(String title){
    setTitle(title);
    setBounds(0, 0, 900, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JButton btn = new JButton("Push");
    btn.addActionListener(this);

    p.add(btn);
    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    JLabel label = new JLabel("Push A Button");
    JOptionPane.showMessageDialog(this, label);
  }
}