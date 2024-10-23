package hospital;

import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

import java.sql.*;

public class Employee_Info extends JFrame {

    Employee_Info(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,490);
        panel.setLayout(null);
        panel.setBackground(new Color(90,156,163));
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,35,700,450);
        table.setBackground(new Color(109,164,170));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from empInfo";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }
        JLabel label1 = new JLabel("Name");
        label1.setBounds(25,9,70,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(155,9,50,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 = new JLabel("Phone No");
        label3.setBounds(325,9,150,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(435,9,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(605,9,150,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);     


        setSize(750,500);
        setLocation(250,150);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Employee_Info();
    }
}
