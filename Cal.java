import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Cal {
    static int i=0;
    static String pLabelTest = "Enable TextField :";
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("calculator");
        frame.setBounds(600,150,350,550);
        frame.setResizable(false);

        //Label
        JLabel pLabel = new JLabel("Enable TextField :0");
        pLabel.setBounds(10, 10, 700, 30);
        JLabel label1 =new JLabel("Enter first number");
        label1.setBounds(10, 40, 700, 30);
        JLabel label2 =new JLabel("Enter second number");
        label2.setBounds(10, 120, 700, 30);
        JLabel label3 =new JLabel("Ans:-");
        label3.setBounds(15, 210, 700, 30);

        //TextField
        JTextField entry1 = new JTextField();
        entry1.setBounds(10,70,320,50);
        JTextField entry2 = new JTextField();
        entry2.setBounds(10,150,320,50);
        JTextField entry3 = new JTextField("00.00");
        entry3.setBounds(90,200,240,50);

        //ActionButton's
        JButton buttonA1 =new JButton("+");
        buttonA1.setBounds(250, 400, 80, 50);
        JButton buttonA2 =new JButton("-");
        buttonA2.setBounds(250, 350, 80, 50);
        JButton buttonA3 =new JButton("x");
        buttonA3.setBounds(250, 300, 80, 50);
        JButton buttonA4 =new JButton("/");
        buttonA4.setBounds(250, 250, 80, 50);
        JButton buttonA5 =new JButton("1&2");
        buttonA5.setBounds(250, 450, 80, 50);
        JButton buttonA6 =new JButton("+/-");
        buttonA6.setBounds(10, 450, 80, 50);
        JButton buttonA7 =new JButton(".");
        buttonA7.setBounds(170, 450, 80, 50);
        JButton buttonA8 =new JButton("C");
        buttonA8.setBounds(170, 250, 80, 50);
        JButton buttonA9 =new JButton("CE");
        buttonA9.setBounds(90, 250, 80, 50);
        JButton buttonA10 =new JButton("%");
        buttonA10.setBounds(10, 250, 80, 50);
        
        //EntryButton's
        JButton button0 =new JButton("0");
        button0.setBounds(90,450,80,50);
        JButton button1 =new JButton("1");
        button1.setBounds(10,400,80,50);
        JButton button2 =new JButton("2");
        button2.setBounds(90,400,80,50);
        JButton button3 =new JButton("3");
        button3.setBounds(170,400,80,50);
        JButton button4 =new JButton("4");
        button4.setBounds(10,350,80,50);
        JButton button5 =new JButton("5");
        button5.setBounds(90,350,80,50);
        JButton button6 =new JButton("6");
        button6.setBounds(170,350,80,50);
        JButton button7 =new JButton("7");
        button7.setBounds(10,300,80,50);
        JButton button8 =new JButton("8");
        button8.setBounds(90,300,80,50);
        JButton button9 =new JButton("9");
        button9.setBounds(170,300,80,50);
        
        //add in frame
        frame.add(pLabel);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(entry1);
        frame.add(entry2);
        frame.add(entry3);
        frame.add(buttonA1);
        frame.add(buttonA2);
        frame.add(buttonA3);
        frame.add(buttonA4);
        frame.add(buttonA5);
        frame.add(buttonA6);
        frame.add(buttonA7);
        frame.add(buttonA8);
        frame.add(buttonA9);
        frame.add(buttonA10);
        
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        button0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "0";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "0";
                entry2.setText(value);
               }
            }
        });
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "1";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "1";
                entry2.setText(value);
               }
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "2";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "2";
                entry2.setText(value);
               }
            }
        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "3";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "3";
                entry2.setText(value);
               }
            }
        });
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "4";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "4";
                entry2.setText(value);
               }
            }
        });
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "5";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "5";
                entry2.setText(value);
               }
            }
        });
        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "6";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "6";
                entry2.setText(value);
               }
            }
        });
        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "7";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "7";
                entry2.setText(value);
               }
            }
        });
        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "8";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "8";
                entry2.setText(value);
               }
            }
        });
        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value =entry1.getText();
                    value = value + "9";
                    entry1.setText(value);
                }
               else{
                String value =entry2.getText();
                value = value + "9";
                entry2.setText(value);
               }
            }
        });
        buttonA1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String ogvalue = entry3.getText();
                Double ogvalue1 = Double.parseDouble(ogvalue);

                String value1 = entry1.getText();
                Double value1_1 =Double.parseDouble(value1);

                String value2 = entry2.getText();
                Double value2_1= Double.parseDouble(value2);
                if(ogvalue1 != 0){
                    entry1.setText(ogvalue);
                    Double ans = ogvalue1 + value2_1;
                    entry3.setText(String.valueOf(ans));
                }
                else{
                    Double ans = value1_1 + value2_1;
                    entry3.setText(String.valueOf(ans));
                }
            }
        });
        buttonA2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String ogvalue = entry3.getText();
                Double ogvalue1 = Double.parseDouble(ogvalue);

                String value1 = entry1.getText();
                Double value1_1 =Double.parseDouble(value1);

                String value2 = entry2.getText();
                Double value2_1= Double.parseDouble(value2);
                if (ogvalue1 != 0) {
                    entry1.setText(ogvalue);
                    Double ans = ogvalue1 - value2_1;
                    entry3.setText(String.valueOf(ans));
                }
                else{
                    Double ans = value1_1 - value2_1;
                    entry3.setText(String.valueOf(ans));
                }
            }
        });
        buttonA3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String ogvalue = entry3.getText();
                Double ogvalue1 = Double.parseDouble(ogvalue);

                String value1 = entry1.getText();
                Double value1_1 =Double.parseDouble(value1);

                String value2 = entry2.getText();
                Double value2_1= Double.parseDouble(value2);
                if (ogvalue1 != 0) {
                    entry1.setText(ogvalue);
                    Double ans = ogvalue1 * value2_1;
                    entry3.setText(String.valueOf(ans));
                }
                else{
                    Double ans = value1_1 * value2_1;
                    entry3.setText(String.valueOf(ans));
                }
            }
        });
        buttonA4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String ogValue=entry3.getText();
                Double ogValue1=Double.parseDouble(ogValue);
                
                String value1 = entry1.getText();
                Double value1_1 =Double.parseDouble(value1);

                String value2 = entry2.getText();
                Double value2_1= Double.parseDouble(value2);

                Double ans = value1_1 / value2_1;
                if (ogValue1!=0) {
                    entry1.setText(ogValue);
                    Double ans1 = ogValue1 / value2_1;
                    entry3.setText(String.valueOf(ans1));
                }
                else{
                    entry3.setText(String.valueOf(ans));
                }
            }
        });
        buttonA5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if (i==0) {
                    i=1;
                }
                else if(i==1){
                    i=0;
                }
                pLabel.setText(pLabelTest+String.valueOf(i));
            }
        });
        buttonA6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value = entry1.getText();
                    
                    if (value.charAt(0) == '+') {
                        value = value.replace("+", "-");
                        entry1.setText(value);
                    }
                    else if (value.charAt(0) == '-') {
                        value = value.replace("-", "+");
                        entry1.setText(value);
                    }
                    else{
                        entry1.setText("-" + value);
                    }
                }
                else{
                    String value = entry2.getText();
                    
                    if (value.charAt(0) == '+') {
                        value = value.replace("+", "-");
                        entry2.setText(value);
                    }
                    else if (value.charAt(0) == '-') {
                        value = value.replace("-", "+");
                        entry2.setText(value);
                    }
                    else{
                        entry2.setText("-" + value);
                    }
                }
            }
        });
        buttonA7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (i==0) {
                    String value = entry1.getText();
                    entry1.setText(value+".");
                }
                else{
                    String value = entry2.getText();
                    entry2.setText(value+".");
                }
            }
        });
        buttonA8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                entry3.setText("00.00");
            }
        });
        buttonA9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                entry1.setText(null);
                entry2.setText(null);
                entry3.setText("00.00");
            }
        });
        buttonA10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String value1 = entry1.getText();
                Double value1_1 =Double.parseDouble(value1);

                String value2 = entry2.getText();
                Double value2_1= Double.parseDouble(value2);

                Double ans = value1_1 % value2_1;
                entry3.setText(String.valueOf(ans));

            }
        });
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
