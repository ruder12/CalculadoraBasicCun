package Model;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



//Clase principal con la interfaz gráfica
public class CalculadoraGUI {
	
 public static void main(String[] args) {
     JFrame frame = new JFrame("Calculadora POO");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400, 300);
     frame.setLayout(new GridLayout(4, 2));
     frame.setLocationRelativeTo(null);
     
     JTextField campo1 = new JTextField();
     JTextField campo2 = new JTextField();
     JComboBox<String> operaciones = new JComboBox<>(new String[]{"Suma", "Resta", "Multiplicación", "División", "Potenciación", "Radicación"});
     JButton calcularBtn = new JButton("Calcular");
     JLabel resultadoLabel = new JLabel("Resultado: ");
     
     calcularBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             try {
                 double num1 = Double.parseDouble(campo1.getText());
                 double num2 = Double.parseDouble(campo2.getText());
                 Operacion operacion;
                 
                 switch (operaciones.getSelectedItem().toString()) {
                     case "Suma": operacion = new Suma(num1, num2); break;
                     case "Resta": operacion = new Resta(num1, num2); break;
                     case "Multiplicación": operacion = new Multiplicacion(num1, num2); break;
                     case "División": operacion = new Division(num1, num2); break;
                     case "Potenciación": operacion = new Potenciacion(num1, num2); break;
                     case "Radicación": operacion = new Radicacion(num1, num2); break;
                     default: throw new IllegalStateException("Operación desconocida");
                 }
                 
                 resultadoLabel.setText("Resultado: " + operacion.calcular());
             } catch (Exception ex) {
                 resultadoLabel.setText("Error: " + ex.getMessage());
             }
         }
     });
     
     frame.add(new JLabel("Número 1:"));
     frame.add(campo1);
     frame.add(new JLabel("Número 2:"));
     frame.add(campo2);
     frame.add(operaciones);
     frame.add(calcularBtn);
     frame.add(resultadoLabel);
     
     frame.setVisible(true);
 }
}