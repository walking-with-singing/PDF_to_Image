import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TRY {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea jta=new JTextArea();
//		jta.setPreferredSize(new Dimension(200,200));
		jta.setLineWrap(true);
		JScrollPane jsp=new JScrollPane() ;
//		jsp.setSize(new Dimension(200, 200));
		jsp.setViewportView(jta);
		jf.add(jsp,"North");
		jf.setVisible(true);
	}
}
