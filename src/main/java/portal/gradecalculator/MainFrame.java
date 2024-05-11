package portal.gradecalculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class MainFrame extends JFrame {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel lblStudentName, lblStudentNo, lblQuiz1, lblQuiz2, lblQuiz3;
    private JTextField txtStudentName, txtStudentNo, txtQuiz1, txtQuiz2, txtQuiz3;
    private JButton calculate;
    
    
    public MainFrame()
    {
        initialize();
    }
    
    
    public void initialize()
    {
        
        // *** Initiating Main Frame Start *** //
        frame = new JFrame();
        frame.setTitle("Grade Calculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // *** Initiating Main Frame End *** //
        
        
        
        // *** Initiating Variables Start *** //
        lblStudentName = new JLabel("Student Name: ");
        txtStudentName = new JTextField(30);
        
        lblStudentNo = new JLabel("Student Number: ");
        txtStudentNo = new JTextField(30);
        
        lblQuiz1 = new JLabel("Quiz 1: ");
        txtQuiz1 = new JTextField(10);
        
        lblQuiz2 = new JLabel("Quiz 2: ");
        txtQuiz2 = new JTextField(10);
        
        lblQuiz3 = new JLabel("Quiz 3: ");
        txtQuiz3 = new JTextField(10);
        
        calculate = new JButton("Calculate");
        // *** Initiating Variables End *** //
        
        
        
        // *** Initiating Panel Start *** //
        panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
        // *** Initiating Panel End *** //
        
        
        
        // *** Adding Components to Panel Start *** //
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblStudentNo);
        panel.add(txtStudentNo);
        panel.add(lblQuiz1);
        panel.add(txtQuiz1);
        panel.add(lblQuiz2);
        panel.add(txtQuiz2);
        panel.add(lblQuiz3);
        panel.add(txtQuiz3);
        panel.add(calculate);
        // *** Adding Components to Panel End *** //
        
        
        
        // *** Setting Layout Start *** //
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblQuiz1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblQuiz2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblQuiz3, 6, SpringLayout.WEST, panel);
        
        layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
        layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
        layout.putConstraint(SpringLayout.NORTH, lblQuiz1, 10, SpringLayout.SOUTH, lblStudentNo);
        layout.putConstraint(SpringLayout.NORTH, txtQuiz1, 6, SpringLayout.SOUTH, txtStudentNo);
        layout.putConstraint(SpringLayout.NORTH, lblQuiz2, 10, SpringLayout.SOUTH, lblQuiz1);
        layout.putConstraint(SpringLayout.NORTH, txtQuiz2, 6, SpringLayout.SOUTH, txtQuiz1);
        layout.putConstraint(SpringLayout.NORTH, lblQuiz3, 10, SpringLayout.SOUTH, lblQuiz2);
        layout.putConstraint(SpringLayout.NORTH, txtQuiz3, 6, SpringLayout.SOUTH, txtQuiz2);
        
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtQuiz1, 51, SpringLayout.EAST, lblQuiz1);
        layout.putConstraint(SpringLayout.WEST, txtQuiz2, 51, SpringLayout.EAST, lblQuiz2);
        layout.putConstraint(SpringLayout.WEST, txtQuiz3, 51, SpringLayout.EAST, lblQuiz3);
        
        layout.putConstraint(SpringLayout.NORTH, calculate, 6, SpringLayout.SOUTH, txtQuiz3);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculate, 0, SpringLayout.HORIZONTAL_CENTER, panel);
        
        frame.add(panel);
        // *** Setting Layout End *** //
        
        
        
        // *** calculate Function (Button) Start *** //
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Instantiate Student class
                Student stud = new Student();
               
                // Assign textfield values to stud object
                stud.setStudentName(txtStudentName.getText());
                stud.setStudentNumber(txtStudentNo.getText());
                stud.setQuiz1(Float.parseFloat(txtQuiz1.getText()));
                stud.setQuiz2(Float.parseFloat(txtQuiz2.getText()));
                stud.setQuiz3(Float.parseFloat(txtQuiz3.getText()));
               
                // Instantiate and call GradeOutput class
                GradeOutput output = new GradeOutput(stud);
                output.setVisible(true);
            }
        });
        // *** calculate Function (Button) End *** //
        
    }
    
}
