
package parcial;

/**
 *
 * @author danie
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Principal extends JFrame implements ActionListener{
  
    private JMenuBar mb;
    private JMenu menuOpciones,menuCalcular,menuFondo;
    private JMenuItem miCalculo,miCeleste,miVerde, miLila,miSalir,miNuevo;
    private JLabel labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
                   labelDepartamento,labelAntiguedad,labelResultado,labelfooter, label1;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;
    String nombre = "";

    public Principal() {
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Pantalla principal");
      getContentPane().setBackground(new Color(0x00BCD4));
      setIconImage(new ImageIcon(getClass().getResource("/images/icon.jpg")).getImage());
      Bienvenida ventanaBienvenida = new Bienvenida();
      nombre = ventanaBienvenida.texto;

      mb = new JMenuBar();
      mb.setBackground(new Color(0x00BCD4));
      setJMenuBar(mb);

      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(0x0097a7));
      menuOpciones.setFont(new Font("Comic Sans MS", 1, 14));
      menuOpciones.setForeground(new Color(255, 255, 255));
      mb.add(menuOpciones);
      
      menuFondo = new JMenu("Color de fondo");
      menuFondo.setFont(new Font("Comic Sans MS", 1, 14));
      menuFondo.setForeground(new Color(0x0097a7));
     // mb.add(menuFondo);
      menuOpciones.add(menuFondo);

      menuCalcular = new JMenu("Calcular");
      menuCalcular.setBackground(new Color(0x0097a7));
      menuCalcular.setFont(new Font("Comic Sans MS", 1, 14));
      menuCalcular.setForeground(new Color(255, 255, 255));
      mb.add(menuCalcular);


      miCalculo = new JMenuItem("Vacaciones");
      miCalculo.setFont(new Font("Comic Sans MS", 1, 14));
      miCalculo.setForeground(new Color(0x0097a7));
      menuCalcular.add(miCalculo);
      miCalculo.addActionListener(this);
      
      miCeleste = new JMenuItem("Celeste");
      miCeleste.setFont(new Font("Comic Sans MS", 1, 14));
      miCeleste.setForeground(new Color(0x0097a7));
      menuFondo.add(miCeleste);
      miCeleste.addActionListener(this);

      miVerde = new JMenuItem("Verde");
      miVerde.setFont(new Font("Comic Sans MS", 1, 14));
      miVerde.setForeground(new Color(0x0097a7));
      menuFondo.add(miVerde);
      miVerde.addActionListener(this);

      miLila = new JMenuItem("Lila");
      miLila.setFont(new Font("Comic Sans MS", 1, 14));
      miLila.setForeground(new Color(0x0097a7));
      menuFondo.add(miLila);
      miLila.addActionListener(this);


      miNuevo = new JMenuItem("Nuevo");
      miNuevo.setFont(new Font("Comic Sans MS", 1, 14));
      miNuevo.setForeground(new Color(0x0097a7));
      menuOpciones.add(miNuevo);
      miNuevo.addActionListener(this);

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Comic Sans MS", 1, 14));
      miSalir.setForeground(new Color(0x0097a7));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);

      labelBienvenido = new JLabel("Bienvenido " + nombre);  
      labelBienvenido.setBounds(160,30,300,50);
      labelBienvenido.setFont(new Font("Comic Sans MS", 1, 32));
      labelBienvenido.setForeground(new Color(255, 255, 255));
      add(labelBienvenido);
      
      ImageIcon imagen1 = new ImageIcon(getClass().getResource("/images/logo.png"));
      label1 = new JLabel(imagen1); 
      label1.setBounds(0, 15, 150, 100);
      add(label1);

      labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
      labelTitle.setBounds(45,125,900,35);
      labelTitle.setFont(new Font("Comic Sans MS", 0, 24));
      labelTitle.setForeground(new Color(255, 255, 255));
      add(labelTitle);

      labelNombre = new JLabel("Nombre:");
      labelNombre.setBounds(25,188,180,25);
      labelNombre.setFont(new Font("Comic Sans MS", 2, 13));
      labelNombre.setForeground(new Color(255, 255, 255));
      add(labelNombre);

    
      txtNombreTrabajador = new JTextField();
      txtNombreTrabajador.setBounds(25,213,152,28);
      txtNombreTrabajador.setBackground(new Color(224, 224, 224));
      txtNombreTrabajador.setFont(new Font("Comic Sans MS",2, 14));
      txtNombreTrabajador.setForeground(new Color(0x0097a7));
      txtNombreTrabajador.setText(nombre);
      add(txtNombreTrabajador);

      labelAPaterno = new JLabel("Apellido Paterno:");
      labelAPaterno.setBounds(25,248,180,25);
      labelAPaterno.setFont(new Font("Comic Sans MS",10, 13));
      labelAPaterno.setForeground(new Color(255, 255, 255));
      add(labelAPaterno);

      txtAPaternoTrabajador = new JTextField();
      txtAPaternoTrabajador.setBounds(25,273,152,28);
      txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
      txtAPaternoTrabajador.setFont(new Font("Comic Sans MS", 2, 14));
      txtAPaternoTrabajador.setForeground(new Color(0x0097a7));
      add(txtAPaternoTrabajador);

      labelAMaterno = new JLabel("Apellido Materno:");
      labelAMaterno.setBounds(25,308,180,25);
      labelAMaterno.setFont(new Font("Comic Sans MS", 2, 13));
      labelAMaterno.setForeground(new Color(255, 255, 255));
      add(labelAMaterno);

      txtAMaternoTrabajador = new JTextField();
      txtAMaternoTrabajador.setBounds(25,334,152,28);
      txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
      txtAMaternoTrabajador.setFont(new Font("Comic Sans MS", 2, 14));
      txtAMaternoTrabajador.setForeground(new Color(0x0097a7));
      add(txtAMaternoTrabajador);

      labelDepartamento = new JLabel("Selecciona el Departamento:");
      labelDepartamento.setBounds(220,188,190,25);
      labelDepartamento.setFont(new Font("Comic Sans MS", 2, 13));
      labelDepartamento.setForeground(new Color(255, 255, 255));
      add(labelDepartamento);

      comboDepartamento = new JComboBox();
      comboDepartamento.setBounds(220,213,220,25);
      comboDepartamento.setBackground(new Color(224, 224, 224));
      comboDepartamento.setFont(new Font("Comic Sans MS", 1, 14));
      comboDepartamento.setForeground(new Color(0x0097a7));
      add(comboDepartamento);
      comboDepartamento.addItem("");
      comboDepartamento.addItem("Atención al Cliente");
      comboDepartamento.addItem("Departamento de Logística");
      comboDepartamento.addItem("Departamento de Gerencia");

      labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
      labelAntiguedad.setBounds(220,248,180,25);
      labelAntiguedad.setFont(new Font("Comic Sans MS", 2, 13));
      labelAntiguedad.setForeground(new Color(255, 255, 255));
      add(labelAntiguedad);
      
      comboAntiguedad = new JComboBox();
      comboAntiguedad.setBounds(220,273,220,25);
      comboAntiguedad.setBackground(new Color(224, 224, 224));
      comboAntiguedad.setFont(new Font("Comic Sans MS", 1, 14));
      comboAntiguedad.setForeground(new Color(0x0097a7));
      add(comboAntiguedad);
      comboAntiguedad.addItem("");
      comboAntiguedad.addItem("1 año de servicio");
      comboAntiguedad.addItem("2 a 6 años de servicio");
      comboAntiguedad.addItem("7 años o más de servicio");

      labelResultado = new JLabel("Cálculo vacaciones:");
      labelResultado.setBounds(220,307,180,25);
      labelResultado.setFont(new Font("Comic Sans MS", 2, 14));
      labelResultado.setForeground(new Color(255, 255, 255));
      add(labelResultado);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224, 224, 224));
      textarea1.setFont(new Font("Comic Sans MS", 2, 12));
      textarea1.setForeground(new Color(0x0097a7));
      textarea1.setText("\n   Aquí aparecerá el resultado del cálculo de las vacaciones.");
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(220,333,385,90);
      add(scrollpane1); 

      labelfooter = new JLabel("Veterinaria Vidas Peludas|Daniela Carrillo|Programación II|Sección D");
      labelfooter.setBounds(75,445,600,30);
      labelfooter.setFont(new Font("Comic Sans MS", 1, 13));
      labelfooter.setForeground(new Color(255, 255, 255));
      add(labelfooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {

	    String nombreTrabajador = txtNombreTrabajador.getText();
	    String AP = txtAPaternoTrabajador.getText();
	    String AM = txtAMaternoTrabajador.getText();
	    String Departamento = comboDepartamento.getSelectedItem().toString();
	    String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
               Departamento.equals("") || Antiguedad.equals("")){
               
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");

            } else {

                if(Departamento.equals("Atención al Cliente")){

                                if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 6 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 14 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
                     
                }
	        if(Departamento.equals("Departamento de Logística")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 7 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 15 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 22 días de vacaciones.");
				}
	    	}
	    	if(Departamento.equals("Departamento de Gerencia")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 10 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 30 días de vacaciones.");
				}
	    		}
            }

        }
        if (e.getSource() == miCeleste){
            mb.setBackground(new Color(0x00BCD4));
            getContentPane().setBackground(new Color(0x00BCD4));
        }
        if (e.getSource() == miVerde){
            mb.setBackground(new Color(0x00E676));
            getContentPane().setBackground(new Color(0x00E676));
        }
	if (e.getSource() == miLila){
            mb.setBackground(new Color(0xE040FB));
            getContentPane().setBackground(new Color(0xE040FB));
        }
        
        if (e.getSource() == miNuevo){	

	    txtNombreTrabajador.setText("");
	    txtAPaternoTrabajador.setText("");
	    txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
	    comboAntiguedad.setSelectedIndex(0);
	    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");	 
   
        }
	if (e.getSource() == miSalir){

   	    Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,550,470);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);

	}
    }

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,650,550);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    } 
}
