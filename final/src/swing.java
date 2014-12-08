import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class swing extends JFrame {


private static final int Height=400;

private static final int Width=200;

private static JLabel Income, Rate, Term, PV, Debt, Blank;

private static JTextField IncomeField, DebtField, RateField, TermField, PVField;

private static JButton CalculateButton;

private static CalculateButtonHandler CalcHandler;





public static void swing(){

	Income = new JLabel("Income: ", SwingConstants.RIGHT);

	Rate = new JLabel("Interest: ", SwingConstants.RIGHT);

Term = new JLabel("Years: ", SwingConstants.RIGHT);

Debt = new JLabel("Debt: ", SwingConstants.RIGHT);

PV = new JLabel("Present Value: ",SwingConstants.RIGHT);

Blank = new JLabel("");



CalculateButton = new JButton("Calculate");

CalcHandler = new CalculateButtonHandler();

CalculateButton.addActionListener(CalcHandler);



JFrame frame = new JFrame();

frame.setBounds(Width, Width, Height, Height);

frame.setTitle("Calculator");

Container pane = frame.getContentPane();

pane.setLayout(new GridLayout(6,2));

	}
}
