
// Imports
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * RPN Calculator GUI
<p>
 * @author      
 * @version     2.0
 * @since       2017-05-22
<p>
 * This class creates a GUI that implements a RPN calculator
 * based upon the ForthStack class
 */
public class RPN {

	private JFrame frameMain; // Main frame
	private JTextField txtEntry; // Entry textbox
	private JTextField txtResult; // Result display
	private JTextField txtError; // Error display
	private JTextField txtStack0;
	private JTextField txtStack1;
	private JTextField txtStack3;
	private JTextField txtStack2;
	private JTextField txtStack7;
	private JTextField txtStack6;
	private JTextField txtStack5;
	private JTextField txtStack4;
	private JTextField txtStack9;
	private JTextField txtStack8;

	/**
	 * This is the main entry point for the class.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		// Create the event queue
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPN window = new RPN();
					// Show the main frame
					window.frameMain.setVisible(true);
				} catch (Exception e) {
					// Exception handler for the frame
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This method will create the calculator window
	 */
	public RPN() {
		initialize();
	}
	
	// Initialize the contents of the frame
	private void initialize() {
		// Create the RPN stack that will hold at most 4 elements
		ForthStack rpnStack = new ForthStack();
		rpnStack.ArrayClass(10);
		
		// Define the frame
		frameMain = new JFrame();
		frameMain.setTitle("RPN Calculator");
		frameMain.setBounds(100, 100, 799, 499);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		// Entry textbox label
		JLabel lblEntry = new JLabel("ENTRY:");
		lblEntry.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEntry.setBounds(15, 16, 107, 44);
		frameMain.getContentPane().add(lblEntry);	
		// Entry textbox field
		txtEntry = new JTextField();
		txtEntry.setBackground(Color.WHITE);
		txtEntry.setForeground(Color.BLACK);
		txtEntry.setHorizontalAlignment(SwingConstants.TRAILING);
		txtEntry.setFont(new Font("Lucida Console", Font.BOLD, 28));
		txtEntry.setBounds(137, 13, 500, 47);
		frameMain.getContentPane().add(txtEntry);
		txtEntry.setColumns(10);
		
		// Result display label
		JLabel lblResult = new JLabel("RESULT:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblResult.setBounds(15, 79, 107, 44);
		frameMain.getContentPane().add(lblResult);
		// Result display field
		txtResult = new JTextField();
		txtResult.setBackground(Color.BLACK);
		txtResult.setForeground(Color.GREEN);
		// Make uneditable
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Lucida Console", Font.BOLD, 28));
		txtResult.setHorizontalAlignment(SwingConstants.TRAILING);
		txtResult.setBounds(137, 79, 500, 47);
		frameMain.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		// Error display label
		JLabel lblError = new JLabel("ERROR:");
		lblError.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblError.setBounds(15, 141, 107, 47);
		frameMain.getContentPane().add(lblError);
		// Error display field
		txtError = new JTextField();
		txtError.setHorizontalAlignment(SwingConstants.TRAILING);
		txtError.setForeground(Color.GREEN);
		txtError.setFont(new Font("Lucida Console", Font.BOLD, 28));
		// Make uneditable
		txtError.setEditable(false);
		txtError.setColumns(10);
		txtError.setBackground(Color.BLACK);
		txtError.setBounds(137, 137, 500, 47);
		frameMain.getContentPane().add(txtError);
		
		// CLR button.  Calls the clear method when pressed.
		JButton btnClear = new JButton("CLR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Clear the stack and the displays
				rpnStack.clear();
				txtError.setText(null);
				txtResult.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnClear.setBounds(15, 390, 622, 47);
		frameMain.getContentPane().add(btnClear);
		
		// DUP button.  Calls the dup method when pressed.
		JButton btnDup = new JButton("DUP");
		btnDup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the dupe
					rpnStack.dup();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the dup method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnDup.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDup.setBounds(15, 327, 300, 47);
		frameMain.getContentPane().add(btnDup);
		
		// 2DUP button.  Calls the twoDup method when pressed.
		JButton btn2Dup = new JButton("2DUP");
		btn2Dup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the dupe
					rpnStack.twoDup();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the twoDup method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}	
			}
		});
		btn2Dup.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2Dup.setBounds(337, 327, 300, 47);
		frameMain.getContentPane().add(btn2Dup);
		
		// + button.  Calls the add method when pressed.
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the add
					rpnStack.add();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the add method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAdd.setBounds(15, 204, 135, 44);
		frameMain.getContentPane().add(btnAdd);
		
		// PUSH button.  Calls the push method when pressed.
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Get the value in the entry box
				String entryValue = txtEntry.getText();
				try {
					// Convert the value to a double
					double value = Double.parseDouble(entryValue);
					// Push the value to the stack
					rpnStack.push(value);
					// Clear the error box and the entry box
					txtError.setText(null);
					txtEntry.setText(null);
					// Set the display to the top of the stack
					double peekedValue = rpnStack.peek();
					txtResult.setText(String.valueOf(peekedValue));
					
					for(int i=0; i < rpnStack.length; i++) { 
						//ltxtStack0[i+1] = stack[i];
					}
					
					
				}
				// This will catch any attempt by the user to enter
				// a value that is not a number
				catch (NumberFormatException nfe) {
					txtError.setText("INVALID ENTRY!");
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the push method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnPush.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPush.setBounds(15, 264, 300, 47);
		frameMain.getContentPane().add(btnPush);
		
		// POP button.  Calls the pop method when pressed.
		JButton btnPop = new JButton("POP");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// Pop the stack
					rpnStack.pop();
					// Clear the error box
					txtError.setText(null);
					// Set the display to the top of the stack
					double peekedValue = rpnStack.peek();
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the pop method.
				catch (RuntimeException re) {
					// Clear the displays
					txtError.setText(null);
					txtResult.setText(null);
				}
			}
		});
		btnPop.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPop.setBounds(337, 264, 300, 47);
		frameMain.getContentPane().add(btnPop);
		
		// - button.  Calls the sub method when pressed.
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the subtraction
					rpnStack.sub();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the sub method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSub.setBounds(180, 204, 135, 44);
		frameMain.getContentPane().add(btnSub);
		
		// * button.  Calls the mult method when pressed.
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the multiplication
					rpnStack.mult();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the mult method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMult.setBounds(337, 204, 135, 44);
		frameMain.getContentPane().add(btnMult);
		
		// - button.  Calls the div method when pressed.
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Perform the division
					rpnStack.div();
					// Get the result
					double peekedValue = rpnStack.peek();
					// Show the result
					txtResult.setText(String.valueOf(peekedValue));
				}
				// Exception handler.  Sets the text of the error
				// display to be what is returned by the throw
				// defined in the div method.
				catch (RuntimeException re) {
					txtError.setText(re.getMessage());
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDiv.setBounds(502, 205, 135, 44);
		frameMain.getContentPane().add(btnDiv);
		
		JLabel lblTheStack = new JLabel("The Stack");
		lblTheStack.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTheStack.setBounds(683, 79, 73, 14);
		frameMain.getContentPane().add(lblTheStack);
		
		txtStack0 = new JTextField();
		txtStack0.setEditable(false);
		txtStack0.setBounds(683, 102, 63, 20);
		frameMain.getContentPane().add(txtStack0);
		txtStack0.setColumns(10);
		txtStack0.setText(""+ stack0 +"");
		
		txtStack1 = new JTextField();
		txtStack1.setEditable(false);
		txtStack1.setColumns(10);
		txtStack1.setBounds(683, 128, 63, 20);
		frameMain.getContentPane().add(txtStack1);
		
		txtStack3 = new JTextField();
		txtStack3.setEditable(false);
		txtStack3.setColumns(10);
		txtStack3.setBounds(683, 180, 63, 20);
		frameMain.getContentPane().add(txtStack3);
		
		txtStack2 = new JTextField();
		txtStack2.setEditable(false);
		txtStack2.setColumns(10);
		txtStack2.setBounds(683, 154, 63, 20);
		frameMain.getContentPane().add(txtStack2);
		
		txtStack7 = new JTextField();
		txtStack7.setEditable(false);
		txtStack7.setColumns(10);
		txtStack7.setBounds(683, 286, 63, 20);
		frameMain.getContentPane().add(txtStack7);
		
		txtStack6 = new JTextField();
		txtStack6.setEditable(false);
		txtStack6.setColumns(10);
		txtStack6.setBounds(683, 260, 63, 20);
		frameMain.getContentPane().add(txtStack6);
		
		txtStack5 = new JTextField();
		txtStack5.setEditable(false);
		txtStack5.setColumns(10);
		txtStack5.setBounds(683, 234, 63, 20);
		frameMain.getContentPane().add(txtStack5);
		
		txtStack4 = new JTextField();
		txtStack4.setEditable(false);
		txtStack4.setColumns(10);
		txtStack4.setBounds(683, 208, 63, 20);
		frameMain.getContentPane().add(txtStack4);
		
		txtStack9 = new JTextField();
		txtStack9.setEditable(false);
		txtStack9.setColumns(10);
		txtStack9.setBounds(683, 340, 63, 20);
		frameMain.getContentPane().add(txtStack9);
		
		txtStack8 = new JTextField();
		txtStack8.setEditable(false);
		txtStack8.setColumns(10);
		txtStack8.setBounds(683, 314, 63, 20);
		frameMain.getContentPane().add(txtStack8);
		
		
	}
	private void showStack(){
		double peekedValue = rpnStack.peek(0);
		// Show the result
		txtResult.setText(String.valueOf(peekedValue));
	}
}
