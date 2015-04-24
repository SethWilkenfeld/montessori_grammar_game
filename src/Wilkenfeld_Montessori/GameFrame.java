/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wilkenfeld_Montessori;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Seth Wilkenfeld
 */
public class GameFrame extends JFrame {
    String username = null;

    String[] words0 = {"The", "black", "bear", "jumped", "up", "and", "growled", "loudly", "at", "me."};
    String[] words1 = {"The", "red", "pickup", "truck", "has", "six", "milk", "cans", "on", "it."};
    String[] words2 = {"My", "grumpy", "old", "grandfather", "likes", "to", "shout", "at", "the", "birds."};

    /**
     * Creates new form PlayFrame
     */
    public GameFrame() {
        JPanel playPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        playPanel.setPreferredSize(new Dimension(1000, 750));
        playPanel.setBackground(new Color(240,240,232)); // or Color.RED

        JPanel toolPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 18, 18));
        toolPanel.setPreferredSize(new Dimension(100, 730));
        toolPanel.setBackground(new Color(255, 255, 255));
        toolPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel targetPanel = new JPanel(new GridLayout(4, 5, 10, 10));
        targetPanel.setPreferredSize(new Dimension(870, 730));
        targetPanel.setBackground(new Color(255, 255, 255));
        targetPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        Icon adjectiveIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/adjectiveThumb.PNG"));
        Icon nounIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/nounThumb.PNG"));
        Icon verbIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/verbThumb.PNG"));
        Icon adverbIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/adverbThumb.PNG"));
        Icon articleIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/articleThumb.PNG"));
        Icon conjunctionIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/conjunctionThumb.PNG"));
        Icon interjectionIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/interjectionThumb.PNG"));
        Icon prepositionIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/prepositionThumb.PNG"));
        Icon pronounIcon = new ImageIcon(GameFrame.class.getResource("/Shapes/pronounThumb.PNG"));

        JLabel verbShape  = new JLabel(verbIcon, JLabel.CENTER);
        JLabel adjectiveShape  = new JLabel(adjectiveIcon, JLabel.CENTER);
        JLabel nounShape = new JLabel(nounIcon, JLabel.CENTER);
        JLabel adverbShape = new JLabel(adverbIcon, JLabel.CENTER);
        JLabel articleShape = new JLabel(articleIcon, JLabel.CENTER);
        JLabel conjunctionShape = new JLabel(conjunctionIcon, JLabel.CENTER);
        JLabel interjectionShape = new JLabel(interjectionIcon, JLabel.CENTER);
        JLabel prepositionShape = new JLabel(prepositionIcon, JLabel.CENTER);
        JLabel pronounShape = new JLabel(pronounIcon, JLabel.CENTER);

        MouseListener listener = (MouseListener) new DragMouseAdapter();
        verbShape.addMouseListener(listener);
        adjectiveShape.addMouseListener(listener);
        nounShape.addMouseListener(listener);
        adverbShape.addMouseListener(listener);
        articleShape.addMouseListener(listener);
        conjunctionShape.addMouseListener(listener);
        interjectionShape.addMouseListener(listener);
        prepositionShape.addMouseListener(listener);
        pronounShape.addMouseListener(listener);

        verbShape.setTransferHandler(new TransferHandler("icon"));
        adjectiveShape.setTransferHandler(new TransferHandler("icon"));
        nounShape.setTransferHandler(new TransferHandler("icon"));
        adverbShape.setTransferHandler(new TransferHandler("icon"));
        articleShape.setTransferHandler(new TransferHandler("icon"));
        conjunctionShape.setTransferHandler(new TransferHandler("icon"));
        interjectionShape.setTransferHandler(new TransferHandler("icon"));
        prepositionShape.setTransferHandler(new TransferHandler("icon"));
        pronounShape.setTransferHandler(new TransferHandler("icon"));

        JButton target0 = new JButton();
        JButton target1 = new JButton();
        JButton target2 = new JButton();
        JButton target3 = new JButton();
        JButton target4 = new JButton();
        JButton target5 = new JButton();
        JButton target6 = new JButton();
        JButton target7 = new JButton();
        JButton target8 = new JButton();
        JButton target9 = new JButton();

        target0.setFocusable(false);
        target1.setFocusable(false);
        target2.setFocusable(false);
        target3.setFocusable(false);
        target4.setFocusable(false);
        target5.setFocusable(false);
        target6.setFocusable(false);
        target7.setFocusable(false);
        target8.setFocusable(false);
        target9.setFocusable(false);

        target0.setTransferHandler(new TransferHandler("icon"));
        target1.setTransferHandler(new TransferHandler("icon"));
        target2.setTransferHandler(new TransferHandler("icon"));
        target3.setTransferHandler(new TransferHandler("icon"));
        target4.setTransferHandler(new TransferHandler("icon"));
        target5.setTransferHandler(new TransferHandler("icon"));
        target6.setTransferHandler(new TransferHandler("icon"));
        target7.setTransferHandler(new TransferHandler("icon"));
        target8.setTransferHandler(new TransferHandler("icon"));
        target9.setTransferHandler(new TransferHandler("icon"));

        toolPanel.add(verbShape);
        toolPanel.add(adjectiveShape);
        toolPanel.add(nounShape);
        toolPanel.add(adverbShape);
        toolPanel.add(articleShape);
        toolPanel.add(conjunctionShape);
        toolPanel.add(interjectionShape);
        toolPanel.add(prepositionShape);
        toolPanel.add(pronounShape);

        add(playPanel);
        playPanel.add(toolPanel);
        playPanel.add(targetPanel);

        targetPanel.add(target0);
        targetPanel.add(target1);
        targetPanel.add(target2);
        targetPanel.add(target3);
        targetPanel.add(target4);
        targetPanel.add(target5);
        targetPanel.add(target6);
        targetPanel.add(target7);
        targetPanel.add(target8);
        targetPanel.add(target9);

        targetPanel.add(target0);
        targetPanel.add(target1);
        targetPanel.add(target2);
        targetPanel.add(target3);
        targetPanel.add(target4);
        targetPanel.add(target5);
        targetPanel.add(target6);
        targetPanel.add(target7);
        targetPanel.add(target8);
        targetPanel.add(target9);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void setUsername(String u) {
        username = u;
    }

    class DragMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}