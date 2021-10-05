package Hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Hotel {

	private JFrame frame;
	private JTextField txtDisplay;
	private JTextField txtFriedRice;
	private JTextField txtShawarma;
	private JTextField txtChicken;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

 double Nigerian_Naira = 360.00;
 double Kenyan_Shilling = 101.00;
 double Chinese_Yuan = 6.29;
double Indian_Rupee = 65.02;

private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void datetime()
	{
		Thread datetime = new Thread()
				{
			      public void run()
			      {
			    	  try 
			    	  
			    	  {
			    		  for(;;)
			    		  {
			    			  Calendar cal = new GregorianCalendar();
			    			  int day = cal.get(Calendar.DAY_OF_MONTH);
			    			  int month = cal.get(Calendar.MONTH);
			    			  int year = cal.get(Calendar.YEAR);
			    			  
			    			 
			    			  int second = cal.get(Calendar.SECOND);
			    			  int minute = cal.get(Calendar.MINUTE);
			    			  int hour = cal.get(Calendar.HOUR);
			    			  
			    			  lblClock.setText("Time" + hour + ":"+ minute + ":" + second +" " + " Date" + year + "/" + month + "/" + day);
			    			  
			    			  sleep(1000);
			    		  }
			    	  }
			    	  catch(Exception e)
			    	  {
			    		  
			    	  }
			      }
			      
				};
		datetime.start();
	}
	/**
	/**
	 * Create the application.
	 */
	public Hotel() {
		initialize();
		datetime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(0, 46, 466, 682);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 440, 660);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 50));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(0, 0, 435, 62);
		panel_2.add(txtDisplay);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtDisplay.getText().length()>0)
				{
					String backspace = null;
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnbackspace.setFont(new Font("Dialog", Font.BOLD, 60));
		btnbackspace.setBounds(0, 84, 100, 100);
		panel_2.add(btnbackspace);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnclear.setBounds(115, 84, 100, 100);
		panel_2.add(btnclear);
		
		JButton btnmodulus = new JButton("%");
		btnmodulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			  firstnum  = Double.parseDouble(txtDisplay.getText());
			  txtDisplay.setText("");
			  operations ="%";
			   
			}
		});
		btnmodulus.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnmodulus.setBounds(225, 84, 100, 100);
		panel_2.add(btnmodulus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				firstnum  = Double.parseDouble(txtDisplay.getText());
				  txtDisplay.setText("");
				  operations ="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnPlus.setBounds(335, 84, 100, 100);
		panel_2.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum  = Double.parseDouble(txtDisplay.getText());
				  txtDisplay.setText("");
				  operations ="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnMinus.setBounds(335, 195, 100, 100);
		panel_2.add(btnMinus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn9.setBounds(225, 195, 100, 100);
		panel_2.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn8.setBounds(115, 195, 100, 100);
		panel_2.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn7.setBounds(0, 195, 100, 100);
		panel_2.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn4.setBounds(0, 311, 100, 100);
		panel_2.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn5.setBounds(115, 311, 100, 100);
		panel_2.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn6.setBounds(225, 311, 100, 100);
		panel_2.add(btn6);
		
		JButton btnx = new JButton("X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum  = Double.parseDouble(txtDisplay.getText());
				  txtDisplay.setText("");
				  operations ="X";
			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnx.setBounds(335, 311, 100, 100);
		panel_2.add(btnx);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum  = Double.parseDouble(txtDisplay.getText());
				  txtDisplay.setText("");
				  operations ="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 70));
		btndivide.setBounds(335, 434, 100, 100);
		panel_2.add(btndivide);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn3.setBounds(225, 434, 100, 100);
		panel_2.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn2.setBounds(115, 434, 100, 100);
		panel_2.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn1.setBounds(0, 434, 100, 100);
		panel_2.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 70));
		btn0.setBounds(0, 559, 100, 73);
		panel_2.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterValue = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterValue);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnDot.setBounds(115, 559, 100, 73);
		panel_2.add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusminus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				plusminus = plusminus*(-1);
				txtDisplay.setText(String.valueOf(plusminus));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnPM.setBounds(225, 559, 100, 73);
		panel_2.add(btnPM);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				secondnum =Double.parseDouble(txtDisplay.getText());
				
				if(operations =="+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum -secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "X")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 70));
		btnequal.setBounds(335, 559, 100, 73);
		panel_2.add(btnequal);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea ReceiptArea = new JTextArea();
		ReceiptArea.setBounds(10, 11, 415, 599);
		panel_3.add(ReceiptArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1.setBounds(470, 133, 1014, 339);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(20, 11, 106, 31);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Qty");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_1.setBounds(204, 11, 106, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Price $");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_2.setBounds(389, 11, 106, 31);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnFriedRice.setBounds(20, 53, 126, 45);
		panel_1.add(btnFriedRice);
		
		JLabel btnShawarma = new JLabel("Shawarma");
		btnShawarma.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnShawarma.setBounds(20, 88, 126, 45);
		panel_1.add(btnShawarma);
		
		JLabel btnChicken = new JLabel("Chicken");
		btnChicken.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChicken.setBounds(20, 126, 126, 45);
		panel_1.add(btnChicken);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFriedRice.setBounds(224, 71, 86, 27);
		panel_1.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtShawarma = new JTextField();
		txtShawarma.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtShawarma.setColumns(10);
		txtShawarma.setBounds(224, 106, 86, 27);
		panel_1.add(txtShawarma);
		
		txtChicken = new JTextField();
		txtChicken.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtChicken.setColumns(10);
		txtChicken.setBounds(224, 144, 86, 27);
		panel_1.add(txtChicken);
		
		JLabel lblNewLabel_2_3 = new JLabel("5.676");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(369, 53, 126, 45);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("3.987");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_4.setBounds(369, 88, 92, 45);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("11.452");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_5.setBounds(369, 126, 126, 45);
		panel_1.add(lblNewLabel_2_5);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coca Cola", "Heineken", "Pepsi"}));
		btnChooseDrink.setBounds(20, 170, 194, 45);
		panel_1.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtChooseDrink.setColumns(10);
		txtChooseDrink.setBounds(224, 181, 86, 27);
		panel_1.add(txtChooseDrink);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("_");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_5_1.setBounds(392, 157, 53, 45);
		panel_1.add(lblNewLabel_2_5_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(521, 11, 16, 317);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 226, 498, 2);
		panel_1.add(separator_3);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "101", "201", "VIP"}));
		btnChooseRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnChooseRoom.setBounds(20, 226, 194, 45);
		panel_1.add(btnChooseRoom);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDelivery.setBounds(17, 278, 197, 23);
		panel_1.add(btnDelivery);
		
		
		
		
		JLabel lblNewLabel_1_3 = new JLabel("Currency Converter");
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1_3.setBounds(570, 11, 378, 31);
		panel_1.add(lblNewLabel_1_3);
		
		JComboBox btnSelectCountry = new JComboBox();
		btnSelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Country", "Nigeria", "Kenya", "China", "India"}));
		btnSelectCountry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSelectCountry.setBounds(590, 53, 343, 45);
		panel_1.add(btnSelectCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(590, 131, 343, 39);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCurrencyOutput .setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCurrencyOutput.setBounds(590, 204, 343, 44);
		panel_1.add(txtCurrencyOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
				
				 if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
				{
				 String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
				 txtCurrencyOutput.setText(Naira);
				 }
				
				if (btnSelectCountry.getSelectedItem().equals("Kenya"))
				 {
				String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
				 txtCurrencyOutput.setText(Shilling);
				 }
				
				if (btnSelectCountry.getSelectedItem().equals("China"))
				{
				 String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
				 txtCurrencyOutput.setText(Yuan);
				 }
				
				 if (btnSelectCountry.getSelectedItem().equals("India"))
				 {
				 String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
				 txtCurrencyOutput.setText(Rupee);
				 }
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnConvert.setBounds(590, 269, 180, 44);
		panel_1.add(btnConvert);
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);;
				btnSelectCountry.setSelectedItem("Country");
				
			}
		});
		btnReset2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset2.setBounds(767, 269, 166, 44);
		panel_1.add(btnReset2);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTax.setBounds(17, 305, 197, 23);
		panel_1.add(btnTax);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel_1_1.setBounds(470, 483, 1014, 245);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel btnTotalCostOfMeal = new JLabel("Total Cost Of Meal");
		btnTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTotalCostOfMeal.setBounds(25, 18, 268, 45);
		panel_1_1.add(btnTotalCostOfMeal);
		
		JLabel btnTotalCostOfDrink = new JLabel("Total Cost Of Drink");
		btnTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTotalCostOfDrink.setBounds(25, 72, 268, 45);
		panel_1_1.add(btnTotalCostOfDrink);
		
		JLabel txtTotalCostOfMeal = new JLabel("");
		txtTotalCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTotalCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfMeal.setBounds(324, 27, 233, 36);
		panel_1_1.add(txtTotalCostOfMeal);
		
		JLabel txtTotalCostOfDrink = new JLabel("");
		txtTotalCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTotalCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalCostOfDrink.setBounds(324, 74, 233, 36);
		panel_1_1.add(txtTotalCostOfDrink);
		
		JLabel txtCostOfDelivery = new JLabel("");
		txtCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfDelivery.setBounds(324, 128, 233, 36);
		panel_1_1.add(txtCostOfDelivery);
		
		JLabel txtCostOfRoom = new JLabel("");
		txtCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtCostOfRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCostOfRoom.setBounds(324, 184, 233, 36);
		panel_1_1.add(txtCostOfRoom);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(582, 11, 15, 209);
		panel_1_1.add(separator_4);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTax1.setBounds(624, 59, 90, 45);
		panel_1_1.add(btnTax1);
		
		JLabel btnSubTotal = new JLabel("Sub total");
		btnSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSubTotal.setBounds(624, 115, 120, 45);
		panel_1_1.add(btnSubTotal);
		
		JLabel btnTotal = new JLabel("Total");
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTotal.setBounds(624, 171, 134, 45);
		panel_1_1.add(btnTotal);
		
		JLabel txtTax = new JLabel("");
		txtTax.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTax.setBounds(771, 60, 182, 44);
		panel_1_1.add(txtTax);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtSubTotal.setBounds(771, 117, 182, 44);
		panel_1_1.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotal.setBounds(771, 172, 182, 44);
		panel_1_1.add(txtTotal);
		
		JLabel btnCostOfDelivery = new JLabel("Cost Of Delivery");
		btnCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCostOfDelivery.setBounds(25, 119, 268, 45);
		panel_1_1.add(btnCostOfDelivery);
		
		JLabel btnCostOfRoom = new JLabel("Cost Of Room");
		btnCostOfRoom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCostOfRoom.setBounds(25, 171, 268, 45);
		panel_1_1.add(btnCostOfRoom);
		
		lblClock = new JLabel("Clock");
		 lblClock.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClock.setBounds(624, 21, 317, 38);
		 panel_1_1.add(lblClock);
		
		
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(471, 40, 1013, 115);
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1564, 35);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Receipt");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double Invoice1 = Double.parseDouble(txtFriedRice.getText());
				 Double Invoice2 = Double.parseDouble(txtShawarma.getText());
				Double Invoice3 = Double.parseDouble(txtChicken.getText());
				 Double Invoice4 = Double.parseDouble(txtChooseDrink.getText());
				
				 ReceiptArea.append("\t\nHotel Management System:\n"
			
				 + "\nFried Rice: \t\t" + Invoice1
				 + "\nShawarma: \t\t" + Invoice2
				 + "\nChicken : \t\t" + Invoice3
				 + "\n" + btnChooseDrink.getSelectedItem() + " :\t\t" + Invoice4
				 +"\nTotal : \t\t" + txtTotal.getText()
				 + "\n\nWelcome and Thank you for your patronage"
				 );

			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null);
				 txtShawarma.setText(null);
				 txtChicken.setText(null);
			     txtChooseDrink.setText(null);
				 txtTotalCostOfMeal.setText(null);
				 txtTotalCostOfDrink.setText(null);
				 txtCostOfDelivery.setText(null);
				 txtCostOfRoom.setText(null);
				 txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				 txtEnterCurrency.setText(null);
				 txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				 btnChooseDrink.setSelectedItem("Choose a drink");
				 btnChooseRoom.setSelectedItem("Choose a room");
				 btnSelectCountry.setSelectedItem("Country");
				 ReceiptArea.setText(null);
			}
		});
		mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu_1.add(mntmReset);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Convert");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double USA_Dollar = Double.parseDouble(txtEnterCurrency.getText());
				
				 if (btnSelectCountry.getSelectedItem().equals("Nigeria"))
				{
				 String Naira = String.format("N %.2f", USA_Dollar*Nigerian_Naira);
				 txtCurrencyOutput.setText(Naira);
				 }
				
				if (btnSelectCountry.getSelectedItem().equals("Kenya"))
				 {
				String Shilling = String.format("KS %.2f", USA_Dollar*Kenyan_Shilling);
				 txtCurrencyOutput.setText(Shilling);
				 }
				
				if (btnSelectCountry.getSelectedItem().equals("China"))
				{
				 String Yuan = String.format("CY %.2f", USA_Dollar*Chinese_Yuan);
				 txtCurrencyOutput.setText(Yuan);
				 }
				
				 if (btnSelectCountry.getSelectedItem().equals("India"))
				 {
				 String Rupee = String.format("INR %.2f", USA_Dollar*Indian_Rupee);
				 txtCurrencyOutput.setText(Rupee);
				 }
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Total");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Refresh");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null);
				 txtShawarma.setText(null);
				 txtChicken.setText(null);
			     txtChooseDrink.setText(null);
				 txtTotalCostOfMeal.setText(null);
				 txtTotalCostOfDrink.setText(null);
				 txtCostOfDelivery.setText(null);
				 txtCostOfRoom.setText(null);
				 txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				 txtEnterCurrency.setText(null);
				 txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				 btnChooseDrink.setSelectedItem("Choose a drink");
				 btnChooseRoom.setSelectedItem("Choose a room");
				 btnSelectCountry.setSelectedItem("Country");
				 ReceiptArea.setText(null);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setForeground(Color.RED);
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_3 = new JMenu("Convert");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Total");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Reset");
		mnNewMenu_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFriedRice.setText(null);
				 txtShawarma.setText(null);
				 txtChicken.setText(null);
			     txtChooseDrink.setText(null);
				 txtTotalCostOfMeal.setText(null);
				 txtTotalCostOfDrink.setText(null);
				 txtCostOfDelivery.setText(null);
				 txtCostOfRoom.setText(null);
				 txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				 txtEnterCurrency.setText(null);
				 txtCurrencyOutput.setText(null);
				txtDisplay.setText(null);
				 btnChooseDrink.setSelectedItem("Choose a drink");
				 btnChooseRoom.setSelectedItem("Choose a room");
				 btnSelectCountry.setSelectedItem("Country");
				 ReceiptArea.setText(null);
			}
		});
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Receipt");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("Exit");
		mnNewMenu_7.setFont(new Font("Segoe UI", Font.BOLD, 25));
		menuBar.add(mnNewMenu_7);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//======================================Drink====================================================
				double Drinks = Double.parseDouble(txtChooseDrink.getText());
				 double CocaCola = 0.957*Drinks;
				double Heineken = 2.432*Drinks;
				 double Pepsi = 1.674*Drinks;
				
				 if(btnChooseDrink.getSelectedItem().equals("Coca Cola"))
				 {
				 String pCoca_Cola = String.format("%.3f", CocaCola);
				 txtTotalCostOfDrink.setText(pCoca_Cola);
				 }
				
				 if(btnChooseDrink.getSelectedItem().equals("Heineken"))
				 {
				 String pHeineken = String.format("%.3f", Heineken);
				 txtTotalCostOfDrink.setText(pHeineken);
				 }
				
				 if(btnChooseDrink.getSelectedItem().equals("Pepsi"))
				
				{
			     String pPepsi = String.format("%.3f", Pepsi);
				txtTotalCostOfDrink.setText(pPepsi);
				 }
				
				 if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
				 {
				 txtTotalCostOfDrink.setText("0.000");
				 }
				 //==============================Meal===============================================
				 double FriedRice = Double.parseDouble(txtFriedRice.getText());
				  double pFriedRice = 5.676;
				 double getFriedRice; 
				 getFriedRice = (FriedRice * pFriedRice);
				  String TotalFriedRice = String.format("%.3f", getFriedRice);
				  txtTotalCostOfMeal.setText(TotalFriedRice);
				 
				  double Shawarma = Double.parseDouble(txtShawarma.getText());
				  double pShawarma = 3.987;
				  double getShawarma; 
				  getShawarma = (Shawarma * pShawarma);
				  String TotalShawarma = String.format("%.3f", getShawarma + getFriedRice);
				  txtTotalCostOfMeal.setText(TotalShawarma);
				 
				  double Chicken = Double.parseDouble(txtChicken.getText());
				  double pChicken = 9.452;
				  double getChicken; 
				  getChicken = (Chicken * pChicken);
				  String TotalChicken = String.format("%.3f", getChicken + getShawarma + 
				 getFriedRice);
				  txtTotalCostOfMeal.setText(TotalChicken);
      //===========================Delivery================================================
				  double cDelivery = 4.50; 
				  if(btnDelivery.isSelected())
				   {
				   String pDelivery = String.format("%.3f", cDelivery);
				   txtCostOfDelivery.setText(pDelivery);
				   }
				   else
				   {
				   txtCostOfDelivery.setText("0.000");
				  }
				 
				  //=======================Tax=====================================
				  
				   double pTotal1 = Double.parseDouble(txtTotalCostOfMeal.getText());
				   double pTotal2 = Double.parseDouble(txtTotalCostOfDrink.getText());
				  double pTotal3 = Double.parseDouble(txtCostOfDelivery.getText());
				  double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;
				  
				  if(btnTax.isSelected())
				   {
				  
				  String xTotal = String.format("%.3f", cTotal);
				   txtTax.setText(xTotal);
				  }
				  
				  //===========================Total=================================
				  double pTotal4 = Double.parseDouble(txtTax.getText());
				  
				   String zTaxTotal = String.format("$%.3f", pTotal4);
				   txtTax.setText(zTaxTotal);
				  
				  double SubTotal = (pTotal1 + pTotal2 + pTotal3);
				   String pSubTotal = String.format("$%.3f", SubTotal);
				   txtSubTotal.setText(pSubTotal);
				  
				   double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
				   String yTotal = String.format("$%.3f", xTotal);
				   txtTotal.setText(yTotal);

			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSubmit.setBounds(237, 257, 138, 44);
		panel_1.add(btnSubmit);
		
		JButton btnReset1 = new JButton("Reset");
		btnReset1.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0) {
		 txtFriedRice.setText(null);
		 txtShawarma.setText(null);
		 txtChicken.setText(null);
	     txtChooseDrink.setText(null);
		 txtTotalCostOfMeal.setText(null);
		 txtTotalCostOfDrink.setText(null);
		 txtCostOfDelivery.setText(null);
		 txtCostOfRoom.setText(null);
		 txtTax.setText(null);
		txtSubTotal.setText(null);
		txtTotal.setText(null);
		 txtEnterCurrency.setText(null);
		 txtCurrencyOutput.setText(null);
		txtDisplay.setText(null);
		 btnChooseDrink.setSelectedItem("Choose a drink");
		 btnChooseRoom.setSelectedItem("Choose a room");
		 btnSelectCountry.setSelectedItem("Country");
		 ReceiptArea.setText(null);
		 }
		 });
		 btnReset1.setBounds(369, 257, 126, 44);
		btnReset1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(btnReset1);
	}
}

	

