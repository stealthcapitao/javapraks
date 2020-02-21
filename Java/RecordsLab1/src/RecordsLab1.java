package ru.ulstu.vt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bruh {

	private JFrame frame;
	private JTextField pr;
	private JTextField prep;
	private JTextField lab;
	private JTextField clab;
	private JButton button;
	private JLabel Predmet;
	private JLabel Prepod;
	private JLabel labs;
	private JLabel copletelabs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bruh window = new bruh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bruh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u041F\u0440\u0435\u0434\u043C\u0435\u0442");
		label.setBounds(33, 11, 56, 16);
		frame.getContentPane().add(label);
		
		pr = new JTextField();
		pr.setBounds(174, 9, 190, 20);
		frame.getContentPane().add(pr);
		pr.setColumns(10);
		
		JLabel label_1 = new JLabel("\u041F\u0440\u0435\u043F\u043E\u0434\u043E\u0432\u0430\u0442\u0435\u043B\u044C:");
		label_1.setBounds(33, 52, 98, 14);
		frame.getContentPane().add(label_1);
		
		prep = new JTextField();
		prep.setBounds(174, 49, 190, 20);
		frame.getContentPane().add(prep);
		prep.setColumns(10);
		
		JLabel label_2 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u043B\u0430\u0431. \u0440\u0430\u0431.:");
		label_2.setBounds(33, 91, 131, 14);
		frame.getContentPane().add(label_2);
		
		lab = new JTextField();
		lab.setBounds(174, 88, 190, 20);
		frame.getContentPane().add(lab);
		lab.setColumns(10);
		
		JLabel label_3 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0441\u0434\u0430\u043D\u043D\u044B\u0445:");
		label_3.setBounds(33, 130, 131, 14);
		frame.getContentPane().add(label_3);
		
		clab = new JTextField();
		clab.setBounds(174, 127, 190, 20);
		frame.getContentPane().add(clab);
		clab.setColumns(10);
		
		button = new JButton("\u0412\u044B\u0432\u0435\u0441\u0442\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String a,b;
		        int c,d;
		        a=String.valueOf(pr.getText());
		        b=String.valueOf(prep.getText());
		        c=Integer.valueOf(lab.getText());
		        d=Integer.valueOf(clab.getText());
		        
		   
		        Predmet.setText("Предмет: "+(a));
		        Prepod.setText("Преподователь:"+(b));
		        labs.setText("Лабораторных: "+Integer.toString(c));
		        copletelabs.setText("Сделано лаб. : "+Integer.toString(d));
		        }
		        catch(Exception g){
		        	Predmet.setText("ТыОшибка введи все поля!!!!!");
		        }
				
			}
		});
		button.setBounds(33, 167, 89, 25);
		frame.getContentPane().add(button);
		
		Predmet = new JLabel("");
		Predmet.setBounds(33, 213, 331, 14);
		frame.getContentPane().add(Predmet);
		
		Prepod = new JLabel("");
		Prepod.setBounds(33, 238, 331, 14);
		frame.getContentPane().add(Prepod);
		
		labs = new JLabel("");
		labs.setBounds(33, 263, 331, 14);
		frame.getContentPane().add(labs);
		
		copletelabs = new JLabel("");
		copletelabs.setBounds(33, 288, 331, 14);
		frame.getContentPane().add(copletelabs);

	}
}
