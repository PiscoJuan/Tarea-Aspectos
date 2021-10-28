package tarea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame{
	
	public static String colorActual="Rojo";
	public static JLabel correccion= new JLabel();
	
	public static void main(String[] args) {
		
	    JFrame f=new JFrame("Button Example");
	    f.setTitle("Soy Un Titulo");
	    f.getContentPane().setBackground(Color.RED);
	    f.setSize(500,500);
	    f.setLayout(null);
	    botonesColocar(f);
	    f.setVisible(true);
	}
	public static void botonesColocar(JFrame f) {
		//Botones de colores
		JButton ba=new JButton("Cyan");
	    JButton bb=new JButton("Magenta");
	    JButton bc=new JButton("Amarillo");
	    
	    ba.setBounds(50,50,95,30);
	    bb.setBounds(50,100,95,30);
	    bc.setBounds(50,150,95,30);
	    f.add(ba);
	    f.add(bb);
	    f.add(bc);
	    
	    ba.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	method1(f);
	        }});
	    bb.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	method2(f);
	        }});
	    bc.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	method3(f);
	        }});
	    
	    
	    //Funcionalidad Extra
	    JLabel indicacion = new JLabel("Porfavor, escriba el color del fondo. Ejemplo: Verde");
	    indicacion.setBounds(180,150,300, 30);
	    JTextField field= new JTextField();
	    field.setBounds(270,200,95,30);
	    JButton input=new JButton("Intro");
	    input.setBounds(270,250,95,30);
	    correccion.setBounds(240,300,300,30);
	    f.add(indicacion);
	    f.add(field);
	    f.add(input);
	    f.add(correccion);
	    
	    input.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	correccion.setText(" ");
	        	if(field.getText().equals(colorActual)) {
	        		intro(f);
	        	}else {
	        		correccion.setText("ese no es el color correcto");
	        	}
	        }});
	}
	
	public static void method1(JFrame f) {
		f.getContentPane().setBackground(Color.CYAN);
		colorActual="Cyan";
		correccion.setText(" ");
	}
	
	public static void method2(JFrame f) {
		f.getContentPane().setBackground(Color.MAGENTA);
		colorActual="Magenta";
		correccion.setText(" ");
	}
	
	public static void method3(JFrame f) {
		f.getContentPane().setBackground(Color.YELLOW);
		colorActual="Amarillo";
		correccion.setText(" ");
	}
	
	public static void intro(JFrame f) {
		f.getContentPane().setBackground(Color.RED);
		colorActual="Rojo";
		correccion.setText(" ");
	}
}
