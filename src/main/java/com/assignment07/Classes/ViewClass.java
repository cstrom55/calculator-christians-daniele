package com.assignment07.Classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
/**
 *	@author Christian Ström, Daniel Eriksson
 *	Methods for the GUI
 */
public class ViewClass extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	//JButtons
	public JButton additionButton = new JButton();
	public JButton subtractionButton = new JButton();
	public JButton multiplicationButton = new JButton();
	public JButton divisionButton = new JButton();
	public JButton powButton = new JButton();
	public JButton sqrtButton = new JButton();
	public JButton squareButton = new JButton();
	public JButton cubeButton = new JButton();
	public JButton logButton = new JButton();
	public JButton absoluteButton = new JButton();
	public JButton exitButton = new JButton();
	public JButton clearButton = new JButton();
	
	//JTextFields
	public JTextField resultWindow = new JTextField();
	public JTextField input1Window = new JTextField();
	public JTextField input2Window = new JTextField();

	//JLabels
	public JLabel input1WindowText = new JLabel();
	public JLabel input2WindowText = new JLabel();
	public JLabel resultWindowText = new JLabel();
	
	//creating 
	CalculatorAdvancedOperations CAO = new CalculatorAdvancedOperations();
	CalculatorBasicOperations CBO = new CalculatorBasicOperations();

	//input1/2 used to store inputvalues from the two textfields
	private double input1 = 0.0;
	private double input2 = 0.0;

	/**
	 * getter input1
	 * @return input1
	 */
	public double getInput1() {
		return input1;
	}
	/**
	 * setter input1
	 * @param input1
	 */
	public void setInput1(double input1) {
		this.input1 = input1;
	}
	/**
	 * getter input2
	 * @return input2
	 */
	public double getInput2() {
		return input2;
	}
	/**
	 * setter input2
	 * @param input2
	 */
	public void setInput2(double input2) {
		this.input2 = input2;
	}

	/**
	 * Method for creating the GUI and adding action listeners aswell as setting the default close operation to EXIT_ON_CLOSE
	 */
	public ViewClass(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createUI();
		addActionListeners();
	}
	
	
	/**
	 * createButtons configures the JButtons (sets position, text, adds them to the frame)
	 */
	private void createButtons(){

		exitButton.setText("Exit");
		exitButton.setBounds(10, 190, 210, 50);
		getContentPane().add(exitButton);

		clearButton.setText("Clear input");
		clearButton.setBounds(755, 25, 210, 23);
		getContentPane().add(clearButton);

		additionButton.setText("+");
		additionButton.setBounds(450, 25, 100, 50);
		getContentPane().add(additionButton);

		subtractionButton.setText("-");
		subtractionButton.setBounds(450, 80, 100, 50);
		getContentPane().add(subtractionButton);

		multiplicationButton.setText("*");
		multiplicationButton.setBounds(450, 135, 100, 50);
		getContentPane().add(multiplicationButton);

		divisionButton.setText("/");
		divisionButton.setBounds(450, 190, 100, 50);
		getContentPane().add(divisionButton);

		powButton.setText("<html><center>X<sup>Y</sup></center></html>"); 
		powButton.setBounds(10, 80, 210, 50);
		getContentPane().add(powButton);

		sqrtButton.setText("<html><center>\u221A x</center></html>"); 
		sqrtButton.setBounds(10, 25, 210, 50);
		getContentPane().add(sqrtButton);


		squareButton.setText("<html><center>X<sup>2</sup></center></html>"); 
		squareButton.setBounds(10, 135, 210, 50);
		getContentPane().add(squareButton);

		cubeButton.setText("<html><center>X<sup>3</sup></center></html>");
		cubeButton.setBounds(230, 80, 210, 50);
		getContentPane().add(cubeButton);

		logButton.setText("LOG");
		logButton.setBounds(230, 135, 210, 50);
		getContentPane().add(logButton);

		absoluteButton.setText("Absolute"); 
		absoluteButton.setBounds(230, 25, 210, 50);
		getContentPane().add(absoluteButton);
	}
	
	/**
	 * createLabels configures the JLabels (position, text, color and adds them to the window)
	 */
	private void createLabels(){
		resultWindow.setBackground(Color.WHITE);
		resultWindow.setForeground(Color.BLACK);
		resultWindow.setBounds(755, 179, 193, 36);
		resultWindow.setText("");
		getContentPane().add(resultWindow);

		input1Window.setEditable(true);
		input1Window.setBackground(Color.WHITE);
		input1Window.setForeground(Color.BLACK);
		input1Window.setBounds(735, 55, 240, 36);
		input1Window.setText("");
		getContentPane().add(input1Window);

		input2Window.setEditable(true);
		input2Window.setBackground(Color.WHITE);
		input2Window.setForeground(Color.BLACK);
		input2Window.setBounds(734, 100, 240, 36);
		input2Window.setText("");
		getContentPane().add(input2Window);

		resultWindowText.setBounds(560, 85, 240, 65);
		resultWindowText.setText("Enter your second value here:");
		getContentPane().add(resultWindowText);

		input1WindowText.setBounds(560, 55, 240, 36);
		input1WindowText.setText("Enter your first value here:");
		getContentPane().add(input1WindowText);

		input2WindowText.setBounds(706, 165, 39, 65);
		input2WindowText.setText("Result:");
		getContentPane().add(input2WindowText);
	}

	/**
	 * addActionListeners adds actionlistenders to the JButtons
	 */
	private void addActionListeners(){
		additionButton.addActionListener(this);
		subtractionButton.addActionListener(this);
		multiplicationButton.addActionListener(this);
		divisionButton.addActionListener(this);
		powButton.addActionListener(this);
		sqrtButton.addActionListener(this);
		squareButton.addActionListener(this);
		cubeButton.addActionListener(this);
		logButton.addActionListener(this);
		absoluteButton.addActionListener(this);
		exitButton.addActionListener(this);
		clearButton.addActionListener(this);
	}
	
	/**
	 * createUI sets the title of the window, the size of the window, the layout of the window(null), adds the buttons and the labels
	 */
	private void createUI(){
		setTitle("Teamwork makes the dream work!");
		setSize(1000, 300);
		getContentPane().setLayout(null);
		createButtons();
		createLabels();
	}
	
	/**
	 * actionPerformed takes an action event and the source and checks where it came from, and does things depending on what action triggered the ActionEvent
	 */
	public void actionPerformed(ActionEvent e) {
		try{
			if (e.getSource() == exitButton){
				dispose();
				//System.exit(0);
			}
			if (e.getSource() == clearButton){
				input1Window.setText("");
				input2Window.setText("");

			}
			if (e.getSource() == additionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((CBO.add(getInput1(), getInput2()))));
			}
			if (e.getSource() == subtractionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((CBO.subtract(getInput1(), getInput2()))));
			}
			if (e.getSource() == multiplicationButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((CBO.multiply(getInput1(), getInput2()))));
			}
			if (e.getSource() == divisionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((CBO.divide(getInput1(), getInput2()))));
				
			}
			if (e.getSource() == powButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((CAO.power(getInput1(), getInput2()))));

			}
			if (e.getSource() == sqrtButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((CAO.squareroot(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in Sqrt operation");
				}
			}
			if (e.getSource() == squareButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((CAO.squared(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in Square operation");
				}
			}
			if (e.getSource() == cubeButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((CAO.cubed(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in cube operation");
				}
			}
			if (e.getSource() == logButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((CAO.log(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in log operation");
				}
			}
			if (e.getSource() == absoluteButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((CAO.absolute(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in absolute operation");
				}
			}
		}
		catch(NumberFormatException error){
			//System.out.println(error);
			input2Window.setText("Please only use numbers in the calculator");
		}
	}




}