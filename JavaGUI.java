import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JavaGUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel output;
		
	public JavaGUI() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.magenta);;
		
		label = new JLabel();
		label.setText("Enter number");
		output = new JLabel();
		output.setText("~~~~~~~~~");
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button1 = new JButton ("Find Product");
		button1.addActionListener( this);
		
		button2 = new JButton ("Find Sum");
		button2.addActionListener(this);
		
		button3 = new JButton ("Find Quotient");
		button3.addActionListener(this);
		
		button4 = new JButton ("Find Difference");
		button4.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(output);
		
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField1.getText());
		
		if(e.getSource() == button1){
			double product = num1*num2;
			output.setText(String.valueOf(product));
		}
		
		else if (e.getSource() == button2){
			double sum = num1+num2;
			output.setText(String.valueOf(sum));
		}
		
		else if (e.getSource() == button3){
			double quotient = num1/num2;
			output.setText(String.valueOf(quotient));
		}
		
		else if (e.getSource() == button4){
			double difference = num1-num2;
			output.setText(String.valueOf(difference));
		}
		
	}
			
}
