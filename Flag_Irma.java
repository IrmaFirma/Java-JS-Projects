package flag_irma;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Flag_Irma extends JPanel{
static int FLAG_WIDTH = 900;
    static int FLAG_HEIGHT = 600;
    JButton flag1Button = new JButton("France");
    JButton flag2Button = new JButton("Austria");
    JButton flag3Button = new JButton("Laos");
    JPanel buttons = new JPanel();
    String selectedFlag = "Flag1";

    public void DrawAustriaFlag(Graphics g) {
        
        // THIS IS JUST TO SET THE ENTIRE THING TO RED AS A START
        g.setColor(new Color(224, 42, 29));
        g.fillRect(0, 0, FLAG_WIDTH, FLAG_HEIGHT);
        
        // THIS IS TO PAINT A WHITE RECTANGLE ON TOP OF THE RED RECTANGLE
        g.setColor(Color.white);
        g.fillRect(0, FLAG_HEIGHT / 3, FLAG_WIDTH, (2 * FLAG_HEIGHT) / 5);
        
    }

    public void DrawFranceFlag(Graphics g) {
        
        int rect1_left_X = 0;
        int rect1_top_Y = 0;
        int rect1_width = FLAG_WIDTH / 3;
        int rect1_height = FLAG_HEIGHT;
        
        int rect2_left_X = FLAG_WIDTH / 3;
        int rect2_top_Y = 0;
        int rect2_width = FLAG_WIDTH / 3;
        int rect2_height = FLAG_HEIGHT;
        
        int rect3_left_X = 2 * (FLAG_WIDTH / 3);
        int rect3_top_Y = 0;
        int rect3_width = FLAG_WIDTH / 3;
        int rect3_height = FLAG_HEIGHT;
        
        //BLUE
        g.setColor(new Color(35, 60, 99));
        g.fillRect(rect1_left_X, rect1_top_Y, rect1_width, rect1_height);
        
        //WHITE
        g.setColor(Color.white);
        g.fillRect(rect2_left_X, rect2_top_Y, rect2_width, rect2_height);
        
        //RED
        g.setColor(new Color(222, 27, 27));
        g.fillRect(rect3_left_X, rect3_top_Y, rect3_width, rect3_height);
    }

    public void DrawLaosFlag(Graphics g) {
        
        // THIS IS JUST TO SET THE ENTIRE THING TO DARK RED AS A START
        g.setColor(new Color(140, 25, 25));
        g.fillRect(0, 0, FLAG_WIDTH, FLAG_HEIGHT);
        
        // THIS IS TO PAINT A DARK BLUE RECTANGLE ON TOP OF THE DARK RED RECTANGLE
        g.setColor(new Color(34, 41, 110));
        g.fillRect(0, FLAG_HEIGHT / 5, FLAG_WIDTH, (3 * FLAG_HEIGHT) / 5);

        // THIS IS THE WHITE CIRCLE ON TOP OF THE DARK BLUE RECTANGLE
        g.setColor(Color.white);
        g.fillOval(FLAG_HEIGHT / 2, FLAG_HEIGHT / 4, FLAG_HEIGHT / 2, FLAG_HEIGHT / 2);
      
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, FLAG_WIDTH, FLAG_HEIGHT + 100);
        if (this.selectedFlag.equals("Flag1")) {
            DrawFranceFlag(g);
        }
        if (this.selectedFlag.equals("Flag2")) {
            DrawAustriaFlag(g);
        }
        if (this.selectedFlag.equals("Flag3")) {
            DrawLaosFlag(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final Flag_Irma graphic = new Flag_Irma();
        frame.getContentPane().add(graphic);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FLAG_WIDTH, FLAG_HEIGHT + 100);
        graphic.flag1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graphic.selectedFlag = "Flag1";
                graphic.repaint();
            }
        });
        graphic.flag2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graphic.selectedFlag = "Flag2";
                graphic.repaint();
            }
        });
        graphic.flag3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graphic.selectedFlag = "Flag3";
                graphic.repaint();
            }
        });
        graphic.buttons.add(graphic.flag1Button);
        graphic.buttons.add(graphic.flag2Button);
        graphic.buttons.add(graphic.flag3Button);

        frame.add(graphic.buttons, BorderLayout.SOUTH);
        graphic.revalidate();
        graphic.repaint();
        frame.setVisible(true);

    }
    
}
//Irma Preldzic