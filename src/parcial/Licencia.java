
package parcial;

/**
 *
 * @author danie
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("/images/icon.jpg")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;

    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(195,5,300,30);
    label1.setFont(new Font("Comic Sans MS", 1, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Comic Sans MS", 0, 11));   
    textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
               "\n\n          A. PROHIBIDA LA DISTRIBUCIÓN DE CUALQUIER MATERIAL SIN AUTORIZACIÓN DE VIDAS PELUDAS." +
               "\n          B. PROHIBIDA LA ALTERACIÓN DE LOS PROCEDIMIENTOS O DIRECTRICES ESTABLECIDAS POR EL PERSONAL MÉDICO." +
               "\n          C. VIDAS PELUDAS NO SE HACE RESPONSABLE DEL MAL USO DE LOS MEDICAMENTOS O RECOMENDACIONES." +
               "\n\n        LOS SIGUIENTES ACUERDOS LEGALES RIGEN EL USO DE LOS SERVICIOS Y PRODUCTOS DE VIDAS PELUDAS." +
               "\n        VIDAS PELUDAS NO SE RESPONSABILIZA DEL USO INCORRECTO DE LOS SERVICIOS." + 
               "\n        PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)." +
               "\n        SI NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE LOS SERVICIOS." + 
               "\n\n        PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, VISITE NUESTRA PÁGINA WEB.");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,50,575,280);
    add(scrollpane1);   

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(10,340,300,40);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,390,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,390,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);
    
    ImageIcon imagen2 = new ImageIcon(getClass().getResource("/images/imagenabajo.png"));
    label2 = new JLabel(imagen2); 
    label2.setBounds(470, 333, 100, 90);
    add(label2);

  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
       boton1.setEnabled(true);
       boton2.setEnabled(false);
    } else {
       boton1.setEnabled(false);
       boton2.setEnabled(true);
    }
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,650,550);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
        
    } else if(e.getSource() == boton2){
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0,0,550,470);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    } 
    this.setVisible(false);   
  }       

  public static void main(String args[]){
   Licencia ventanalicencia = new Licencia();
   ventanalicencia.setBounds(0,0,600,470);
   ventanalicencia.setVisible(true);
   ventanalicencia.setResizable(false);
   ventanalicencia.setLocationRelativeTo(null);
 }
}