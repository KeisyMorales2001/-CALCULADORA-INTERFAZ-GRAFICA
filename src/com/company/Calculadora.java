package com.company;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JButton btnsuma, btnresta,btnmulti, btndivi, btnlimpiar, btnsalir;
    private JTextField valor1, valor2, Camresul;
    JLabel label1,label2;

    public void operaciones(){
        Container contenedor =getContentPane();
        contenedor.setLayout(new FlowLayout());
        label1 =new JLabel("Número 1");
        contenedor.add(label1);
        valor1= new JTextField(10);
        contenedor.add(valor1);
        label2 =new JLabel("Número 2");
        contenedor.add(label2);
        valor2= new JTextField(10);
        contenedor.add(valor2);
        btnsuma= new JButton("+");
        contenedor.add(btnsuma);
        btnsuma.addActionListener(this);
        btnresta= new JButton("-");
        contenedor.add(btnresta);
        btnresta.addActionListener(this);
        btnmulti= new JButton("x");
        contenedor.add(btnmulti);
        btnmulti.addActionListener(this);
        btndivi= new JButton("/");
        contenedor.add(btndivi);
        btndivi.addActionListener(this);
        Camresul= new JTextField(10);
        contenedor.add(Camresul);
        btnlimpiar= new JButton("Limpiar");
        contenedor.add(btnlimpiar);
        btnsalir= new JButton("Salir");
        btnsalir.setBackground(Color.CYAN);
        contenedor.add(btnsalir);
        btnsalir.addActionListener(this);
    }

    public Calculadora (){
        super("Main");
        operaciones();
        setSize(380,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        double num1,num2,resu;
        String resultado;
        if (e.getSource()==btnsuma){
            if(valor1.getText().equals("")|| valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"los datos no estan completos",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else {
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1+num2;
                resultado=String.valueOf(resu);
                Camresul.setText(resultado);
            }
        }
        if (e.getSource()==btnresta){
            if(valor1.getText().equals("")|| valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"los datos no estan completos",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else {
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1-num2;
                resultado=String.valueOf(resu);
                Camresul.setText(resultado);
            }
        }
        if (e.getSource()==btnmulti){
            if(valor1.getText().equals("")|| valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"los datos no estan completos",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else {
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                resu=num1*num2;
                resultado=String.valueOf(resu);
                Camresul.setText(resultado);
            }
        }
        if (e.getSource()==btndivi){
            if(valor1.getText().equals("")|| valor2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"los datos no estan completos",
                        "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else {
                num1=Double.parseDouble(valor1.getText());
                num2=Double.parseDouble(valor2.getText());
                try {
                    resu=num1/num2;
                    resultado=String.valueOf(resu);
                    Camresul.setText(resultado);
                }
                catch (ArithmeticException ex){
                    JOptionPane.showMessageDialog(null,"División entre ceros no permitida",
                            "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }

        }
        if (e.getSource()==btnlimpiar){
            valor1.setText(" ");
            valor2.setText(" ");
            Camresul.setText(" ");
        }
        if (e.getSource()==btnsalir){
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Calculadora calculadora= new Calculadora();
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}