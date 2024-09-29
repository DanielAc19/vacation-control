
package parcial;

/**
 *
 * @author danie
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4,label5;
  private JButton boton1;
  public static String texto = "";  

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(0x00BCD4));
    setIconImage(new ImageIcon(getClass().getResource("/images/icon.jpg")).getImage());

    ImageIcon imagen = new ImageIcon(getClass().getResource("/images/logo.png"));
    label1 = new JLabel(imagen); 
    label1.setBounds(0, 15, 150, 100);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(100, 135, 400, 30);
    label2.setFont(new Font("Comic Sans MS", 3, 22));
    label2.setForeground(new Color(255, 255, 255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(185, 212, 200, 30);
    label3.setFont(new Font("Comic Sans MS", 2, 16));
    label3.setForeground(new Color(255, 255, 255));
    add(label3);

    label4 = new JLabel("Veterinaria Vidas Peludas|Daniela Carrillo|Programación II|Sección D");
    label4.setBounds(50, 385, 600, 30);
    label4.setFont(new Font("Comic Sans MS", 1, 13));
    label4.setForeground(new Color(255, 255, 255));
    add(label4);
    
    ImageIcon imagen2 = new ImageIcon(getClass().getResource("/images/imagenabajo.png"));
    label5 = new JLabel(imagen2); 
    label5.setBounds(400, 300, 150, 100);
    add(label5);

    textfield1 = new JTextField();
    textfield1.setBounds(128, 240, 255, 25);     
    textfield1.setBackground(new Color(224, 224, 224));
    textfield1.setFont(new Font("Comic Sans MS", 1, 14));
    textfield1.setForeground(new Color(0x0097a7));
    add(textfield1);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(210, 300, 100, 30);
    boton1.setBackground(new Color(255, 255, 255));
    boton1.setFont(new Font("Comic Sans MS", 1, 14));
    boton1.setForeground(new Color(0x0097a7));
    boton1.addActionListener(this);
    add(boton1);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == boton1) {
      texto = textfield1.getText().trim();
      if (texto.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
      } else {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0,0,600,470);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String args[]) {
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,550,470);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);
  }
}
