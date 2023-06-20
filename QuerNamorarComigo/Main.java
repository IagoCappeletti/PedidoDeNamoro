package QuerNamorarComigo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serial;
import java.util.Random;

public class Main extends JFrame implements KeyListener, MouseListener {
    @Serial
    private static final long serialVersionUID = 1L;
    public Random rand;
    private final JButton jButtonYes = new JButton("Sim");
    private final JButton jButtonNot = new JButton("Não");

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public Main() {
        rand = new Random();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, WIDTH, HEIGHT);
        jPanel.setBackground(new Color(174, 143, 186));

        // jButtonYes
        jButtonYes.setForeground(new Color(242, 231, 210));
        jButtonYes.setBackground(new Color(247, 158, 177));
        jButtonYes.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
        jButtonYes.setBounds(190, 150, 70, 25);
        jButtonYes.setBorderPainted(false);
        jButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYesActionPerformed();
            }
        });

        // jButtonNot
        jButtonNot.setForeground(new Color(242, 231, 210));
        jButtonNot.setBackground(new Color(247, 158, 177));
        jButtonNot.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
        jButtonNot.setBounds(290, 150, 70, 25);
        jButtonNot.setBorderPainted(false);
        jButtonNot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNotEntered();
            }
        });

        // jLabel
        JLabel jLabel = new JLabel("Quer namorar comigo?");
        jLabel.setForeground(new Color(242, 231, 210));
        jLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
        jLabel.setBounds(140, 80, 350, 50);

        jPanel.add(jButtonYes);
        jPanel.add(jButtonNot);
        jPanel.add(jLabel);

        this.add(jPanel);
        setTitle("Developed by @Iago.Cappeletti");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        rand = new Random();
        this.addMouseListener(this);
        this.addKeyListener(this);
    }

    private void jButtonNotEntered() {
        System.out.println("Entrou");
        int x = rand.nextInt(530);
        int y = rand.nextInt(320);
        if (x == 0 && y == 0) {
            return;
        }
        if ((x >= 190 && x <= 260) && (y >= 150 && y <= 175)) {
            return;
        }
        jButtonNot.setBounds(x, y, 70, 25);
        System.out.println("X: " + x + " Y: " + y);
    }

    private void jButtonYesActionPerformed() {
        new Home().setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_TAB) {
            System.out.println("oi");
            jButtonYes.requestFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}

class Home extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    private JLabel jLabel = new JLabel("Te Amo <3");
    private JPanel jPanel = new JPanel();
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public Home() {
        jPanel.setLayout(null);
        jPanel.setBounds(0, 0, WIDTH, HEIGHT);
        jPanel.setBackground(new Color(174, 143, 186));

        // jLabel
        jLabel.setForeground(new Color(242, 231, 210));
        jLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 32));
        jLabel.setBounds(180, 80, 350, 80);

        jPanel.add(jLabel);
        this.add(jPanel);
        setTitle("O amor é lindo...!");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
