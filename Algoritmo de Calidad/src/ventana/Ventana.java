package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana {

	private JFrame frame;
	private ButtonGroup grupoFunA = new ButtonGroup();
	private ButtonGroup grupoEfiA = new ButtonGroup();
	private ButtonGroup grupoEfiB = new ButtonGroup();
	private ButtonGroup grupoFiaA = new ButtonGroup();
	private ButtonGroup grupoFiaB = new ButtonGroup();
	private ButtonGroup grupoManA = new ButtonGroup();
	private ButtonGroup grupoManB = new ButtonGroup();
	private ButtonGroup grupoManC = new ButtonGroup();
	private ButtonGroup grupoUsaA = new ButtonGroup();
	private ButtonGroup grupoUsaB = new ButtonGroup();
	private ButtonGroup grupoUsaC = new ButtonGroup();
	private ButtonGroup grupoPorA = new ButtonGroup();
	private ButtonGroup grupoPorB = new ButtonGroup();
	private ButtonGroup grupoFia_A = new ButtonGroup();
	private ButtonGroup grupoFia_B = new ButtonGroup();
	private ButtonGroup grupoUsa_A1 = new ButtonGroup();
	private ButtonGroup grupoUsa_A2 = new ButtonGroup();
	private ButtonGroup grupoUsa_A3 = new ButtonGroup();
	

	
	
	static int fun = 0;
	static int efi = 0;
	static int fia = 0;
	static int man = 0;
	static int usa = 0;
	static int por = 0;
	int msg;
	private JTextField textField_1A;
	private JTextField txt_2A;
	private JTextField txt_2B;
	private JTextField txt_3A;
	private JTextField txt_3B;
	private JTextField txt_4A;
	private JTextField txt_4B;
	private JTextField txt_4C;
	private JTextField txt_5;
	private JTextField txt_6A;
	private JTextField txt_6B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 720);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//JPANEL
		//JPANEL
		//JPANEL
		//JPANEL
		
		
		JPanel panel_Inicio = new JPanel();
		panel_Inicio.setBackground(SystemColor.menu);
		frame.getContentPane().add(panel_Inicio, "name_339191449322900");
		panel_Inicio.setVisible(true);
				
		JPanel panelFuncionalidad = new JPanel();
		frame.getContentPane().add(panelFuncionalidad, "name_339191454712400");
		panelFuncionalidad.setLayout(null);
		
		JPanel panelEficiencia = new JPanel();
		frame.getContentPane().add(panelEficiencia, "name_339191460697800");
		panelEficiencia.setLayout(null);
		
		JPanel panelFiabilidad = new JPanel();
		frame.getContentPane().add(panelFiabilidad, "name_339191465973800");
		panelFiabilidad.setLayout(null);
		
		
		JPanel panelMantenibilidad = new JPanel();
		frame.getContentPane().add(panelMantenibilidad, "name_339191471377000");
		panelMantenibilidad.setLayout(null);
		
		
		JPanel panelUsabilidad = new JPanel();
		frame.getContentPane().add(panelUsabilidad, "name_339191476933000");
		panelUsabilidad.setLayout(null);
				
		JPanel panelPortabilidad = new JPanel();
		frame.getContentPane().add(panelPortabilidad, "name_339191482263000");
		panelPortabilidad.setLayout(null);
				
		JPanel panelResultado = new JPanel();
		panelResultado.setOpaque(false);
		frame.getContentPane().add(panelResultado, "name_339191488128200");
		panelResultado.setLayout(null);
		panelResultado.setBackground(Color.WHITE);
		panelResultado.setVisible(false);
		
		///RESULTADO
		//RESULTADO
	
		JLabel lblRes_FUN = new JLabel("SATISFACTORIO");
		lblRes_FUN.setOpaque(true);
		lblRes_FUN.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes_FUN.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblRes_FUN.setBackground(new Color(144, 238, 144));
		lblRes_FUN.setBounds(237, 133, 306, 98);
		panelResultado.add(lblRes_FUN);
	
		JLabel label_Res_EFI  = new JLabel("SATISFACTORIO");
		label_Res_EFI.setOpaque(true);
		label_Res_EFI.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_EFI.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_Res_EFI.setBackground(new Color(144, 238, 144));
		label_Res_EFI.setBounds(237, 233, 306, 98);
		panelResultado.add(label_Res_EFI);
	
		JLabel label_Res_FIA  = new JLabel("SATISFACTORIO");
		label_Res_FIA.setOpaque(true);
		label_Res_FIA.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_FIA.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_Res_FIA.setBackground(new Color(144, 238, 144));
		label_Res_FIA.setBounds(237, 333, 306, 98);
		panelResultado.add(label_Res_FIA);
	
		JLabel label_Res_MAN  = new JLabel("SATISFACTORIO");
		label_Res_MAN.setOpaque(true);
		label_Res_MAN.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_MAN.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_Res_MAN.setForeground(Color.BLACK);
		label_Res_MAN.setBackground(new Color(144, 238, 144));
		label_Res_MAN.setBounds(967, 133, 294, 98);
		panelResultado.add(label_Res_MAN);
	
		JLabel label_Res_USA = new JLabel("SATISFACTORIO");
		label_Res_USA.setOpaque(true);
		label_Res_USA.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_USA.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_Res_USA.setBackground(new Color(144, 238, 144));
		label_Res_USA.setBounds(967, 233, 294, 98);
		panelResultado.add(label_Res_USA);
		
		JLabel label_Res_POR = new JLabel("SATISFACTORIO");
		label_Res_POR.setOpaque(true);
		label_Res_POR.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_POR.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_Res_POR.setBackground(new Color(144, 238, 144));
		label_Res_POR.setBounds(967, 333, 294, 98);
		panelResultado.add(label_Res_POR);
		

		JLabel label_Res_FINAL = new JLabel("SATISFACTORIO");
		label_Res_FINAL.setBackground(new Color(144, 238, 144));
		label_Res_FINAL.setOpaque(true);
		label_Res_FINAL.setForeground(Color.BLACK);
		label_Res_FINAL.setHorizontalAlignment(SwingConstants.CENTER);
		label_Res_FINAL.setFont(new Font("Tahoma", Font.PLAIN, 39));
		label_Res_FINAL.setBounds(607, 462, 358, 150);
		panelResultado.add(label_Res_FINAL);
		
		//INICIO
		//INICIO
		//INICIO
		//INICIO
		

		JButton btnComenzar = new JButton("INICIO");
		btnComenzar.setBounds(460, 421, 395, 162);
		btnComenzar.setToolTipText("");
		btnComenzar.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Inicio.setVisible(false);
				panelFuncionalidad.setVisible(true);
			}
		});
		panel_Inicio.setLayout(null);
		
		JLabel lblGrupo = new JLabel("Grupo 6");
		lblGrupo.setBounds(10, 203, 1254, 162);
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 48));
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Inicio.add(lblGrupo);
		
		JLabel lblTitulo = new JLabel("Algoritmo \r\nde \r\r\nCalidad");
		lblTitulo.setBounds(10, 11, 1254, 162);
		lblTitulo.setFont(new Font("Unispace", Font.BOLD, 56));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Inicio.add(lblTitulo);
		panel_Inicio.add(btnComenzar);
		
		//FUNCIONALIDAD
		//FUNCIONALIDAD
		//FUNCIONALIDAD
		//FUNCIONALIDAD
		
		
		JLabel lblFuncionalidad = new JLabel("FUNCIONALIDAD");
		lblFuncionalidad.setBackground(Color.WHITE);
		lblFuncionalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblFuncionalidad.setBounds(10, 11, 1254, 90);
		panelFuncionalidad.add(lblFuncionalidad);
		
		JLabel lblDescFuncionalidad = new JLabel("<html><body>Es la capacidad del producto software para proporcionar <br>los resultados con el grado de probabilidad de error permitido.</body></html>");
		lblDescFuncionalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescFuncionalidad.setBackground(Color.LIGHT_GRAY);
		lblDescFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDescFuncionalidad.setBounds(10, 232, 1254, 57);
		panelFuncionalidad.add(lblDescFuncionalidad);
		/*
		JRadioButton rdbtnExcelente1A = new JRadioButton("Excelente");
		rdbtnExcelente1A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnExcelente1A.setToolTipText("Probabilidad de error igual a 0. Siempre lleva a cabo la opci\u00F3n deseada\r\n");
		rdbtnExcelente1A.setBounds(559, 322, 130, 44);
		panelFuncionalidad.add(rdbtnExcelente1A);
		grupoFunA.add(rdbtnExcelente1A);
		
		JRadioButton rdbtnBuena1A = new JRadioButton("Buena");
		rdbtnBuena1A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnBuena1A.setToolTipText("Probabilidad de error menor a 0.05 menos de la mitad de las veces produce errores");
		rdbtnBuena1A.setBounds(559, 383, 130, 44);
		panelFuncionalidad.add(rdbtnBuena1A);
		grupoFunA.add(rdbtnBuena1A);
		
		JRadioButton rdbtnRegular1A = new JRadioButton("Regular");
		rdbtnRegular1A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnRegular1A.setToolTipText("Probabilidad de error entre 0.05 y 1. m\u00E1s de la mitad de las veces produce errores");
		rdbtnRegular1A.setBounds(559, 445, 130, 44);
		panelFuncionalidad.add(rdbtnRegular1A);
		grupoFunA.add(rdbtnRegular1A);
		
		JRadioButton rdbtnMala1A = new JRadioButton("Mala");
		rdbtnMala1A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnMala1A.setToolTipText("Probabilidad de error = 1.  Nunca lleva a cabo la opci\u00F3n deseada");
		rdbtnMala1A.setBounds(559, 508, 130, 44);
		panelFuncionalidad.add(rdbtnMala1A);
		rdbtnMala1A.setActionCommand("Mala");
		grupoFunA.add(rdbtnMala1A);
		*/
		textField_1A = new JTextField(3);
		textField_1A.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if(!(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE ){
					arg0.consume();
				}
			}
		});
		textField_1A.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1A.setBounds(600, 412, 55, 20);
		panelFuncionalidad.add(textField_1A);
		textField_1A.setColumns(10);
		
		JButton btnSiguiente1A = new JButton("Siguiente");
		btnSiguiente1A.setBounds(1100, 641, 164, 39);
		panelFuncionalidad.add(btnSiguiente1A);
		btnSiguiente1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_1A.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				if(Integer.parseInt(textField_1A.getText()) == 100) {
					fun++;
				}
				/*if(grupoFunA.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				if(grupoFunA.getSelection().getActionCommand() == "Mala") {
//					lblRes_FUN.setText("NO SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.red);
					fun++;
				}*/
				panelEficiencia.setVisible(true);
				panelFuncionalidad.setVisible(false);
				System.out.println("al final de la primera funcionalidad =" + fun);	
				
			}
		});
		
		JButton btnAtras1A = new JButton("Atras");
		btnAtras1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Inicio.setVisible(true);
				panelFuncionalidad.setVisible(false);
			}
		});
		btnAtras1A.setBounds(1107, 641, 157, 39);
		panelFuncionalidad.add(btnAtras1A);
		
		JButton btnCancelar1A = new JButton("Cancelar");
		btnCancelar1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
				panel_Inicio.setVisible(true);
				panelFuncionalidad.setVisible(false);}
			}
		});
		btnCancelar1A.setBounds(10, 641, 157, 39);
		panelFuncionalidad.add(btnCancelar1A);
		
		JLabel lblExactitudDeLos = new JLabel("Exactitud de los resultados");
		lblExactitudDeLos.setHorizontalAlignment(SwingConstants.CENTER);
		lblExactitudDeLos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblExactitudDeLos.setBounds(10, 147, 1254, 74);
		panelFuncionalidad.add(lblExactitudDeLos);
				
		
		JLabel lblPorcentajeDeVeces = new JLabel("<html><body>Porcentaje de veces que produce errores al realizar opreaciones</body><html>");
		lblPorcentajeDeVeces.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPorcentajeDeVeces.setBounds(417, 344, 405, 57);
		panelFuncionalidad.add(lblPorcentajeDeVeces);
			
		//EFICIENCIA
		//EFICIENCIA
		//EFICIENCIA
		
		JLabel labelEficiencia = new JLabel("EFICIENCIA");
		labelEficiencia.setBounds(0, 5, 1254, 90);
		labelEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		labelEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 60));
		labelEficiencia.setBackground(Color.WHITE);
		panelEficiencia.add(labelEficiencia);
		
		JLabel labelDescEficiencia_A = new JLabel("Utilización de recursos");
		labelDescEficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 50));
		labelDescEficiencia_A.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescEficiencia_A.setBounds(10, 106, 634, 119);
		panelEficiencia.add(labelDescEficiencia_A);
		/*
		JRadioButton radioExcelente_Eficiencia_A = new JRadioButton("Excelente");
		radioExcelente_Eficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_Eficiencia_A.setToolTipText("menos de 5% de uso de CPU");
		radioExcelente_Eficiencia_A.setBounds(212, 334, 206, 44);
		panelEficiencia.add(radioExcelente_Eficiencia_A);
		grupoEfiA.add(radioExcelente_Eficiencia_A);
		
		JRadioButton radioBuena_Eficiencia_A = new JRadioButton("Buena");
		radioBuena_Eficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_Eficiencia_A.setToolTipText("5% a 9% de uso de CPU.");
		radioBuena_Eficiencia_A.setBounds(212, 399, 130, 44);
		panelEficiencia.add(radioBuena_Eficiencia_A);
		grupoEfiA.add(radioBuena_Eficiencia_A);
		
		JRadioButton radioRegular_Eficiencia_A = new JRadioButton("Regular");
		radioRegular_Eficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_Eficiencia_A.setToolTipText("10% a 39% de uso de CPU.");
		radioRegular_Eficiencia_A.setBounds(212, 466, 130, 44);
		panelEficiencia.add(radioRegular_Eficiencia_A);
		grupoEfiA.add(radioRegular_Eficiencia_A);
		
		JRadioButton radioMala_Eficiencia_A = new JRadioButton("Mala");
		radioMala_Eficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_Eficiencia_A.setToolTipText("39% o m\u00E1s de uso de CPU.");
		radioMala_Eficiencia_A.setBounds(212, 536, 130, 44);
		radioMala_Eficiencia_A.setActionCommand("Mala");
		panelEficiencia.add(radioMala_Eficiencia_A);
		grupoEfiA.add(radioMala_Eficiencia_A);
		*/
		JLabel labelDescEficiencia_B = new JLabel("<html><body>Comportamiento frente<br>al tiempo</body></html>");
		labelDescEficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 50));
		labelDescEficiencia_B.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescEficiencia_B.setBounds(655, 106, 599, 101);
		panelEficiencia.add(labelDescEficiencia_B);
		/*
		JRadioButton radioMala_Eficiencia_B = new JRadioButton("Mala");
		radioMala_Eficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_Eficiencia_B.setToolTipText("El producto est\u00E1 m\u00E1s de 6 segundos para informar al usuario del estado de la operaci\u00F3n");
		radioMala_Eficiencia_B.setActionCommand("Mala");
		radioMala_Eficiencia_B.setBounds(883, 536, 130, 44);
		panelEficiencia.add(radioMala_Eficiencia_B);
		grupoEfiB.add(radioMala_Eficiencia_B);
		
		JRadioButton radioRegular_Eficiencia_B = new JRadioButton("Regular");
		radioRegular_Eficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_Eficiencia_B.setToolTipText("El producto est\u00E1 entre 4 y 6 segundos  para informar al usuario del estado de la operaci\u00F3n");
		radioRegular_Eficiencia_B.setBounds(883, 466, 130, 44);
		panelEficiencia.add(radioRegular_Eficiencia_B);
		grupoEfiB.add(radioRegular_Eficiencia_B);
				
		JRadioButton radioExcelente_Eficiencia_B = new JRadioButton("Excelente");
		radioExcelente_Eficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_Eficiencia_B.setToolTipText("El producto est\u00E1 menos de 2 segundo para informar al usuario del estado de la operaci\u00F3n");
		radioExcelente_Eficiencia_B.setBounds(883, 334, 163, 44);
		panelEficiencia.add(radioExcelente_Eficiencia_B);
		grupoEfiB.add(radioExcelente_Eficiencia_B);
		
		JRadioButton radioBuena_Eficiencia_B = new JRadioButton("Buena");
		radioBuena_Eficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_Eficiencia_B.setToolTipText("El producto est\u00E1 entre 2 y  menos de 4 segundos  para informar al usuario del estado de la operaci\u00F3n.");
		radioBuena_Eficiencia_B.setBounds(883, 399, 130, 44);
		panelEficiencia.add(radioBuena_Eficiencia_B);
		grupoEfiB.add(radioBuena_Eficiencia_B);
		*/
		
		JLabel lblporcentajeDeUso = new JLabel("<html><body>Porcentaje de uso de CPU utilizado</body><html>");
		lblporcentajeDeUso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblporcentajeDeUso.setBounds(91, 286, 405, 57);
		panelEficiencia.add(lblporcentajeDeUso);
		
		txt_2A = new JTextField(10);
		txt_2A.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_2A.setBounds(274, 354, 55, 20);
		panelEficiencia.add(txt_2A);
		
		JLabel lbltiempoEnSegundos = new JLabel("<html><body>Tiempo en segundos que demora en  informar el resultado</body><html>");
		lbltiempoEnSegundos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltiempoEnSegundos.setBounds(785, 305, 405, 57);
		panelEficiencia.add(lbltiempoEnSegundos);
		
		txt_2B = new JTextField(10);
		txt_2B.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_2B.setBounds(968, 373, 55, 20);
		panelEficiencia.add(txt_2B);
		
		
		JButton btnAtras_2A_ = new JButton("Atras");
		btnAtras_2A_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEficiencia.setVisible(false);
				panelFuncionalidad.setVisible(true);
				fun = 0;
//				lblRes_FUN.setText("SATISFACTORIO");
//				lblRes_FUN.setBackground(Color.GREEN);
			}
		});
		btnAtras_2A_.setBounds(166, 641, 147, 39);
		panelEficiencia.add(btnAtras_2A_);
		
		JButton btnSiguiente_2A_ = new JButton("Siguiente");
		btnSiguiente_2A_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txt_2A.getText().isEmpty() || txt_2B.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				if(Integer.parseInt(txt_2A.getText()) >= 39) {
					efi++;
				}
				if(Integer.parseInt(txt_2B.getText()) > 6) {
					efi++;
				}
				
					/*if(grupoEfiA.isSelected(null) || grupoEfiB.isSelected(null)){
						JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
					}
					else {
				if(grupoEfiA.getSelection().getActionCommand() == "Mala") {
					efi++;
//					label_Res_EFI.setText("NO SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.RED);
				}
				if(grupoEfiB.getSelection().getActionCommand() == "Mala") {
//					label_Res_EFI.setText("NO SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.RED);
					efi++;
				}*/
				panelEficiencia.setVisible(false);
				panelFiabilidad.setVisible(true);
				//System.out.println("al final de la segunda funcionalidad =" + fun);
				//System.out.println("al final de la segunda eficiencia =" +efi);
			//}
			}
		});
		btnSiguiente_2A_.setBounds(1107, 641, 157, 39);
		panelEficiencia.add(btnSiguiente_2A_);
		
		JButton btnCancelar_2A = new JButton("Cancelar");
		btnCancelar_2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
//					lblRes_FUN.setText("SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.GREEN);
					fun = 0;
					panel_Inicio.setVisible(true);
					panelEficiencia.setVisible(false);}		
			}
		});
		btnCancelar_2A.setBounds(10, 641, 157, 39);
		panelEficiencia.add(btnCancelar_2A);
		
		JLabel lblNewLabel = new JLabel("<html><body>Se evaluar\u00E1 la eficiencia del producto software de acuerdo al porcentaje de uso de CPU.</body></html>\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 220, 634, 55);
		panelEficiencia.add(lblNewLabel);
		
		JLabel lblseEvaluarEl = new JLabel("<html><body>Se evaluar\u00E1 el tiempo que el producto software tarde en informarle al usuario el resultado de la operaci\u00F3n.</body></html>\r\n");
		lblseEvaluarEl.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblseEvaluarEl.setBounds(654, 218, 610, 57);
		panelEficiencia.add(lblseEvaluarEl);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(642, 93, 2, 534);
		panelEficiencia.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 93, 1274, 2);
		panelEficiencia.add(separator_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(0, 628, 1274, 2);
		panelEficiencia.add(separator_5);
						
		// FIABILIDAD
		// FIABILIDAD
		// FIABILIDAD
		// FIABILIDAD
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setBounds(0, 5, 1254, 90);
		lblFiabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblFiabilidad.setBackground(Color.WHITE);
		panelFiabilidad.add(lblFiabilidad);
		
		JLabel labelDescFiaA = new JLabel("Tolerancia a fallos");
		labelDescFiaA.setBounds(10, 106, 634, 119);
		labelDescFiaA.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescFiaA.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panelFiabilidad.add(labelDescFiaA);
		
		JLabel labelDescFiaB = new JLabel("<html><body>Capacidad de recuperaci\u00F3n de errores</body></html>");
		labelDescFiaB.setBounds(655, 106, 634, 104);
		labelDescFiaB.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescFiaB.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panelFiabilidad.add(labelDescFiaB);
		/*
		JRadioButton radioExcelente_3A = new JRadioButton("Excelente");
		radioExcelente_3A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_3A.setToolTipText("Cumple con las 2  caracter\u00EDsticas.");
		radioExcelente_3A.setBounds(212, 334, 206, 44);
		panelFiabilidad.add(radioExcelente_3A);
		grupoFiaA.add(radioExcelente_3A);
		
		JRadioButton radioBuena_3A = new JRadioButton("Buena");
		radioBuena_3A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_3A.setToolTipText("se protegen los datos en su totalidad");
		radioBuena_3A.setBounds(212, 399, 206, 44);
		panelFiabilidad.add(radioBuena_3A);
		grupoFiaA.add(radioBuena_3A);
		
		JRadioButton radioRegular_3A = new JRadioButton("Regular");
		radioRegular_3A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_3A.setToolTipText("se protegen menos del 100% de los datos, pero no en su totalidad");
		radioRegular_3A.setBounds(212, 466, 206, 44);
		panelFiabilidad.add(radioRegular_3A);
		grupoFiaA.add(radioRegular_3A);
		
		JRadioButton radioMala_3A = new JRadioButton("Mala");
		radioMala_3A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_3A.setToolTipText("No cumple con alguna caracter\u00EDstica.");
		radioMala_3A.setBounds(212, 536, 206, 44);
		radioMala_3A.setActionCommand("Mala");
		panelFiabilidad.add(radioMala_3A);
		grupoFiaA.add(radioMala_3A);
		
		JRadioButton radioExcelente_3B = new JRadioButton("Excelente");
		radioExcelente_3B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_3B.setToolTipText("Reanuda sus actividades m\u00E1s de un 80%  y vuelve al estado en que estaba.");
		radioExcelente_3B.setBounds(883, 334, 206, 44);
		panelFiabilidad.add(radioExcelente_3B);
		grupoFiaB.add(radioExcelente_3B);
				
		JRadioButton radioBuena_3B = new JRadioButton("Buena");
		radioBuena_3B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_3B.setToolTipText("Reanuda sus actividades m\u00E1s de un 80% si se produce una falla cr\u00EDtica");
		radioBuena_3B.setBounds(883, 399, 130, 44);
		panelFiabilidad.add(radioBuena_3B);
		grupoFiaB.add(radioBuena_3B);
		
		JRadioButton radioMala_3B = new JRadioButton("Mala");
		radioMala_3B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_3B.setToolTipText("No reanuda las actividades.");
		radioMala_3B.setBounds(883, 536, 130, 44);
		radioMala_3B.setActionCommand("Mala");
		panelFiabilidad.add(radioMala_3B);
		grupoFiaB.add(radioMala_3B);
		
		JRadioButton radioRegular_3B = new JRadioButton("Regular");
		radioRegular_3B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_3B.setToolTipText("El sistema reanuda las actividades  80% o menos de la veces si se produce una falla cr\u00EDtica.");
		radioRegular_3B.setBounds(883, 466, 130, 44);
		panelFiabilidad.add(radioRegular_3B);
		grupoFiaB.add(radioRegular_3B);
		*/

		JLabel lblporcentajeDeDatos = new JLabel("<html><body>Porcentaje de datos que se protegen</body><html>");
		lblporcentajeDeDatos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblporcentajeDeDatos.setBounds(138, 343, 405, 57);
		panelFiabilidad.add(lblporcentajeDeDatos);
		
		txt_3A = new JTextField(10);
		txt_3A.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_3A.setBounds(321, 411, 55, 20);
		panelFiabilidad.add(txt_3A);
		
		JLabel lblporcentajeDeVeces = new JLabel("<html><body>Porcentaje de veces en las que reanuda sus actividades luego producirse una falla</body><html>");
		lblporcentajeDeVeces.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblporcentajeDeVeces.setBounds(754, 343, 405, 57);
		panelFiabilidad.add(lblporcentajeDeVeces);
		
		txt_3B = new JTextField(10);
		txt_3B.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_3B.setBounds(937, 411, 55, 20);
		panelFiabilidad.add(txt_3B);
		
		JLabel lblrealizaUnLog = new JLabel("<html><body>\u00BFRealiza un log de actividades en el sistema?</body><html>");
		lblrealizaUnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblrealizaUnLog.setBounds(138, 442, 405, 57);
		panelFiabilidad.add(lblrealizaUnLog);
		
		JRadioButton rdbtnSi = new JRadioButton("SI");
		rdbtnSi.setBounds(148, 506, 109, 23);
		panelFiabilidad.add(rdbtnSi);
		grupoFia_A.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBounds(375, 506, 109, 23);
		rdbtnNo.setActionCommand("Mala");
		panelFiabilidad.add(rdbtnNo);
		grupoFia_A.add(rdbtnNo);
		
		JRadioButton radioButton = new JRadioButton("NO");
		radioButton.setBounds(973, 506, 109, 23);
		panelFiabilidad.add(radioButton);
		radioButton.setActionCommand("Mala");
		grupoFia_B.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("SI");
		radioButton_1.setBounds(746, 506, 109, 23);
		panelFiabilidad.add(radioButton_1);
		grupoFia_B.add(radioButton_1);
		
		JLabel lblvuelveASu = new JLabel("<html><body>\u00BFVuelve a su estado anterior?</body><html>");
		lblvuelveASu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblvuelveASu.setBounds(736, 442, 405, 57);
		panelFiabilidad.add(lblvuelveASu);
		
		JButton btnAtras_3 = new JButton("Atras");
		btnAtras_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelFiabilidad.setVisible(false);
				panelEficiencia.setVisible(true);
//				label_Res_EFI.setText("SATISFACTORIO");
//				label_Res_EFI.setBackground(Color.GREEN);
				efi = 0;
			}
		});
		btnAtras_3.setBounds(166, 641, 147, 39);
		panelFiabilidad.add(btnAtras_3);
		
		JButton btnSiguiente_3 = new JButton("Siguiente");
		btnSiguiente_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_3A.getText().isEmpty() || txt_3B.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				if(Integer.parseInt(txt_3A.getText()) <= 100 || grupoFia_A.getSelection().getActionCommand() == "Mala") {
					fia++;
				}
				if(Integer.parseInt(txt_2B.getText()) == 0) {
					fia++;
				}
				/*if(grupoFiaA.isSelected(null) || grupoFiaB.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoFiaA.getSelection().getActionCommand() == "Mala") {
//				label_Res_FIA.setText("NO SATISFACTORIO");
//				label_Res_FIA.setBackground(Color.red);

				fia++;
			}
			if(grupoFiaB.getSelection().getActionCommand() == "Mala") {
//				label_Res_FIA.setText("NO SATISFACTORIO");
//				label_Res_FIA.setBackground(Color.red);
				fia++;
			}*/
			panelMantenibilidad.setVisible(true);
			panelFiabilidad.setVisible(false);
			/*System.out.println("al final de la tercera funcionalidad =" +fun);
			System.out.println("al final de la tercera eficiencia =" +efi);
			System.out.println("al final de la tercera fiabilidad =" + fia);*/
				
			}
		//	}
		});
		btnSiguiente_3.setBounds(1107, 641, 157, 39);
		panelFiabilidad.add(btnSiguiente_3);
		
		JButton btnCancelar_3 = new JButton("Cancelar");
		btnCancelar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
//					label_Res_EFI.setText("SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.GREEN);
//					lblRes_FUN.setText("SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.GREEN);
					fun = efi = 0;
					panel_Inicio.setVisible(true);
					panelFiabilidad.setVisible(false);}		
			}
		});
		btnCancelar_3.setBounds(10, 641, 157, 39);
		panelFiabilidad.add(btnCancelar_3);
		
		JLabel lblesLaCapacidad = new JLabel("<html><body>Es la capacidad del producto software de mantener la integridad de los datos cuando se producen fallas del sistema.<br>Caracter\u00EDsticas a medir:<br>\u2022 Cuando sucede un error se protegen los datos procesados.<br>\u2022 Se realiza un log de actividades que el sistema estaba haciendo.</body></html>\r\n");
		lblesLaCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblesLaCapacidad.setBounds(10, 211, 634, 99);
		panelFiabilidad.add(lblesLaCapacidad);
		
		JLabel lblesLaCapacidad_1 = new JLabel("<html><body>Es la capacidad del sistema de volver a sus actividades cuando se producen errores cr\u00EDticos.<br>Caracter\u00EDsticas a medir:<br>\u2022El sistema vuelve a sus actividades<br>\u2022 vuelve al estado en que estaba.</body></html>\r\n");
		lblesLaCapacidad_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblesLaCapacidad_1.setBounds(654, 218, 610, 92);
		panelFiabilidad.add(lblesLaCapacidad_1);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.BLACK);
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(642, 92, 2, 534);
		panelFiabilidad.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(0, 92, 1274, 2);
		panelFiabilidad.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setBackground(Color.BLACK);
		separator_8.setBounds(0, 627, 1274, 2);
		panelFiabilidad.add(separator_8);
		
		
		//MANTENIBILIDAD
		//MANTENIBILIDAD
		//MANTENIBILIDAD
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblMantenibilidad.setBackground(Color.WHITE);
		lblMantenibilidad.setBounds(0, 5, 1254, 90);
		panelMantenibilidad.add(lblMantenibilidad);
		
		JLabel lblDescMantenibilidad_A = new JLabel("<html><body>Capacidad del c\u00F3digo de ser analizado</body></html>");
		lblDescMantenibilidad_A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescMantenibilidad_A.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDescMantenibilidad_A.setBounds(10, 106, 426, 100);
		panelMantenibilidad.add(lblDescMantenibilidad_A);
		
		JLabel lblparaEvaluarLa = new JLabel("<html><body>Para evaluar la capacidad que tiene el c\u00F3digo para ser analizado se tiene en cuenta el porcentaje de comentarios que posee el c\u00F3digo por cada m\u00E9todo y en general.</body></html>\r\n");
		lblparaEvaluarLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblparaEvaluarLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblparaEvaluarLa.setBounds(10, 206, 426, 90);
		panelMantenibilidad.add(lblparaEvaluarLa);
		/*
		JRadioButton radioExcelente_4A = new JRadioButton("Excelente");
		radioExcelente_4A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_4A.setToolTipText("m\u00E1s del 55% del c\u00F3digo comentado");
		radioExcelente_4A.setBounds(166, 333, 147, 44);
		panelMantenibilidad.add(radioExcelente_4A);
		grupoManA.add(radioExcelente_4A);
		
		JRadioButton radioBuena_4A = new JRadioButton("Buena");
		radioBuena_4A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_4A.setToolTipText("Entre de 30 y 55% del c\u00F3digo comentado");
		radioBuena_4A.setBounds(166, 393, 130, 44);
		panelMantenibilidad.add(radioBuena_4A);
		grupoManA.add(radioBuena_4A);
		
		JRadioButton radioRegular_4A = new JRadioButton("Regular");
		radioRegular_4A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_4A.setToolTipText("Entre 20 y 35% del c\u00F3digo comentado.");
		radioRegular_4A.setBounds(166, 453, 130, 44);
		panelMantenibilidad.add(radioRegular_4A);
		grupoManA.add(radioRegular_4A);
		
		JRadioButton radioMala_4A = new JRadioButton("Mala");
		radioMala_4A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_4A.setToolTipText("menos del 20% del c\u00F3digo comentado.");
		radioMala_4A.setActionCommand("Mala");
		radioMala_4A.setBounds(166, 513, 130, 45);
		panelMantenibilidad.add(radioMala_4A);
		grupoManA.add(radioMala_4A);
			*/
		JLabel lblDescMantenibilidad_B = new JLabel("<html><body>Capacidad del codigo para ser cambiado</body></html>");
		lblDescMantenibilidad_B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescMantenibilidad_B.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDescMantenibilidad_B.setBounds(437, 106, 426, 100);
		panelMantenibilidad.add(lblDescMantenibilidad_B);
		
		JLabel lblparaEvaluarLa_1 = new JLabel("<html><body>Para evaluar la capacidad que tiene el c\u00F3digo para ser cambiado se tomar\u00E1 en cuenta la complejidad ciclom\u00E1tica del m\u00E9todo.</body></html>\r\n");
		lblparaEvaluarLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblparaEvaluarLa_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblparaEvaluarLa_1.setBounds(437, 206, 426, 90);
		panelMantenibilidad.add(lblparaEvaluarLa_1);
		/*
		JRadioButton radioExcelente_4B = new JRadioButton("Excelente");
		radioExcelente_4B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_4B.setToolTipText("La complejidad ciclom\u00E1tica es menor o igual a 5.");
		radioExcelente_4B.setBounds(590, 333, 147, 45);
		panelMantenibilidad.add(radioExcelente_4B);
		grupoManB.add(radioExcelente_4B);
		
		JRadioButton radioBuena_4B = new JRadioButton("Buena");
		radioBuena_4B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_4B.setToolTipText("La complejidad ciclom\u00E1tica es entre 5 y 10.");
		radioBuena_4B.setBounds(592, 393, 130, 45);
		panelMantenibilidad.add(radioBuena_4B);
		grupoManB.add(radioBuena_4B);
		
		JRadioButton radioRegular_4B = new JRadioButton("Regular");
		radioRegular_4B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_4B.setToolTipText("La complejidad ciclom\u00E1tica es entre 11 y 20");
		radioRegular_4B.setBounds(592, 453, 130, 44);
		panelMantenibilidad.add(radioRegular_4B);
		grupoManB.add(radioRegular_4B);
		
		JRadioButton radioMala_4B = new JRadioButton("Mala");
		radioMala_4B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_4B.setToolTipText("La complejidad ciclom\u00E1tica es mayor o igual a 21.");
		radioMala_4B.setActionCommand("Mala");
		radioMala_4B.setBounds(592, 513, 130, 44);
		panelMantenibilidad.add(radioMala_4B);
		grupoManB.add(radioMala_4B);
			*/	
		JLabel lblestabilidad = new JLabel("<html><body>Estabilidad</body></html>");
		lblestabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblestabilidad.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblestabilidad.setBounds(863, 106, 426, 100);
		panelMantenibilidad.add(lblestabilidad);
		
		JLabel lblparaDeterminarLa = new JLabel("<html><body>Para determinar la estabilidad del software se eval\u00FAa el promedio de fallas que presenta el producto por prueba.</body></html>\r\n");
		lblparaDeterminarLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblparaDeterminarLa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblparaDeterminarLa.setBounds(863, 206, 426, 90);
		panelMantenibilidad.add(lblparaDeterminarLa);
		/*
		JRadioButton radioExcelente_4C = new JRadioButton("Excelente");
		radioExcelente_4C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_4C.setToolTipText("El software presenta un promedio entre 0 y 2 errores por prueba.");
		radioExcelente_4C.setBounds(1018, 333, 147, 45);
		panelMantenibilidad.add(radioExcelente_4C);
		grupoManC.add(radioExcelente_4C);
		
		JRadioButton radioBuena_4C = new JRadioButton("Buena");
		radioBuena_4C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_4C.setToolTipText("El software presenta un promedio entre 3 y 5 errores por prueba.");
		radioBuena_4C.setBounds(1018, 393, 130, 45);
		panelMantenibilidad.add(radioBuena_4C);
		grupoManC.add(radioBuena_4C);
		
		JRadioButton radioMala_4C = new JRadioButton("Mala");
		radioMala_4C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_4C.setToolTipText("El software presenta un promedio 5 o m\u00E1s errores por prueba.");
		radioMala_4C.setActionCommand("Mala");
		radioMala_4C.setBounds(1018, 513, 130, 44);
		panelMantenibilidad.add(radioMala_4C);
		grupoManC.add(radioMala_4C);
		
		JRadioButton radioRegular_4C = new JRadioButton("Regular");
		radioRegular_4C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_4C.setToolTipText("El software presenta un promedio entre 6 y 7 errores por prueba.");
		radioRegular_4C.setBounds(1018, 453, 130, 44);
		panelMantenibilidad.add(radioRegular_4C);
		grupoManC.add(radioRegular_4C);
			*/
		

		txt_4A = new JTextField(10);
		txt_4A.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_4A.setBounds(193, 408, 55, 20);
		panelMantenibilidad.add(txt_4A);
		
		JLabel lblcomplejidadCiclomatica = new JLabel("<html><body>Complejidad Ciclomatica</body><html>");
		lblcomplejidadCiclomatica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcomplejidadCiclomatica.setBounds(437, 340, 405, 57);
		panelMantenibilidad.add(lblcomplejidadCiclomatica);
		
		txt_4B = new JTextField(10);
		txt_4B.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_4B.setBounds(620, 408, 55, 20);
		panelMantenibilidad.add(txt_4B);
		
		JLabel lblcantidadDeFallas = new JLabel("<html><body>Cantidad de fallas por prueba</body><html>");
		lblcantidadDeFallas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcantidadDeFallas.setBounds(863, 340, 405, 57);
		panelMantenibilidad.add(lblcantidadDeFallas);
		
		txt_4C = new JTextField(10);
		txt_4C.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_4C.setBounds(1046, 408, 55, 20);
		panelMantenibilidad.add(txt_4C);
		
		JLabel lblporcentajeDeComentarios = new JLabel("<html><body>Porcentaje de comentarios en el codigo</body><html>");
		lblporcentajeDeComentarios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblporcentajeDeComentarios.setBounds(10, 340, 405, 57);
		panelMantenibilidad.add(lblporcentajeDeComentarios);
		
		JButton btnCancelar_4 = new JButton("Cancelar");
		btnCancelar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
//					lblRes_FUN.setText("SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.GREEN);
//					label_Res_FIA.setText("SATISFACTORIO");
//					label_Res_FIA.setBackground(Color.GREEN);
//					label_Res_EFI.setText("SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.GREEN);
					fun = efi = fia = 0;
					panel_Inicio.setVisible(true);
					panelMantenibilidad.setVisible(false);}		
			}
		});
		btnCancelar_4.setBounds(10, 641, 157, 39);
		panelMantenibilidad.add(btnCancelar_4);
		
		JButton btnAtras_4 = new JButton("Atras");
		btnAtras_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFiabilidad.setVisible(true);
				panelMantenibilidad.setVisible(false);
//				label_Res_FIA.setText("SATISFACTORIO");
//				label_Res_FIA.setBackground(Color.GREEN);
				fia = 0;
			}
		});
		btnAtras_4.setBounds(166, 641, 147, 39);
		panelMantenibilidad.add(btnAtras_4);
		
		JButton BtnSiguiente_4 = new JButton("Siguiente");
		BtnSiguiente_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_4A.getText().isEmpty() || txt_4B.getText().isEmpty() || txt_4C.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				if(Integer.parseInt(txt_4A.getText()) <= 20){
					man++;
				}
				if(Integer.parseInt(txt_4B.getText()) >= 21) {
					man++;
				}
				if(Integer.parseInt(txt_4C.getText()) >= 5) {
					man++;
				}
				
				/*if(grupoManA.isSelected(null) || grupoManB.isSelected(null) || grupoManC.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoManA.getSelection().getActionCommand() == "Mala") {
//				label_Res_MAN.setText("NO SATISFACTORIO");
//				label_Res_MAN.setBackground(Color.red);
				man++;
			}
			if(grupoManB.getSelection().getActionCommand() == "Mala") {
//				label_Res_MAN.setText("NO SATISFACTORIO");
//				label_Res_MAN.setBackground(Color.red);
				man++;
			}
			if(grupoManC.getSelection().getActionCommand() == "Mala") {
//				label_Res_MAN.setText("NO SATISFACTORIO");
//				label_Res_MAN.setBackground(Color.red);
				man++;
			}*/
			panelMantenibilidad.setVisible(false);
			panelUsabilidad.setVisible(true);
			//}
			}
		});
		BtnSiguiente_4.setBounds(1107, 641, 157, 39);
		panelMantenibilidad.add(BtnSiguiente_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 93, 1274, 2);
		panelMantenibilidad.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(0, 628, 1274, 2);
		panelMantenibilidad.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(426, 93, 2, 535);
		panelMantenibilidad.add(separator_4);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(Color.BLACK);
		separator_12.setBackground(Color.BLACK);
		separator_12.setBounds(852, 95, 2, 535);
		panelMantenibilidad.add(separator_12);
		
		
		//USABILIDAD
		//USABILIDAD
		//USABILIDAD
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblUsabilidad.setBackground(Color.WHITE);
		lblUsabilidad.setBounds(0, 5, 1254, 90);
		panelUsabilidad.add(lblUsabilidad);
		
		JLabel lblDescUsab_A = new JLabel("<html><body>Capacidad de ser entendido</body></html>");
		lblDescUsab_A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_A.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDescUsab_A.setBounds(10, 106, 426, 100);
		panelUsabilidad.add(lblDescUsab_A);
		
		JLabel lblcapacidadQuePosee = new JLabel("<html><body>Capacidad que posee el software, para ayudar a los usuarios ante una determinada situaci\u00F3n donde se necesite asistencia.<br>Caracter\u00EDsticas a medir:<br>\u2022 Posee ayuda contextual sobre men\u00FAs y botones de acci\u00F3n.<br>\u2022 Manual de usuario incorporado al sistema como un men\u00FA dedicado.</body></html>\r\n");
		lblcapacidadQuePosee.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblcapacidadQuePosee.setBounds(10, 206, 411, 100);
		panelUsabilidad.add(lblcapacidadQuePosee);
		/*
		JRadioButton radioBuena_5A = new JRadioButton("Buena");
		radioBuena_5A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_5A.setToolTipText("Cumple con 2 caracter\u00EDsticas.");
		radioBuena_5A.setBounds(166, 393, 147, 44);
		panelUsabilidad.add(radioBuena_5A);
		grupoUsaA.add(radioBuena_5A);
		
		JRadioButton radioMala_5A = new JRadioButton("Mala");
		radioMala_5A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_5A.setToolTipText("No cumple con alguna caracter\u00EDstica.");
		radioMala_5A.setActionCommand("Mala");
		radioMala_5A.setBounds(166, 513, 147, 44);
		panelUsabilidad.add(radioMala_5A);
		grupoUsaA.add(radioMala_5A);
		
		JRadioButton radioRegular_5A = new JRadioButton("Regular");
		radioRegular_5A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_5A.setToolTipText(" Cumple con 1 caracter\u00EDstica.");
		radioRegular_5A.setBounds(166, 453, 147, 44);
		panelUsabilidad.add(radioRegular_5A);
		grupoUsaA.add(radioRegular_5A);
		
		JRadioButton radioExcelente_5A = new JRadioButton("Excelente");
		radioExcelente_5A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_5A.setToolTipText("posee ayudas complementarias aparte de las dos anteriores");
		radioExcelente_5A.setBounds(166, 333, 147, 44);
		panelUsabilidad.add(radioExcelente_5A);
		grupoUsaA.add(radioExcelente_5A);
		
		
		JRadioButton radioExcelente_5B = new JRadioButton("Excelente");
		radioExcelente_5B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_5B.setToolTipText("El usuario opera el producto software sin asistencia.");
		radioExcelente_5B.setBounds(592, 333, 147, 44);
		panelUsabilidad.add(radioExcelente_5B);
		grupoUsaB.add(radioExcelente_5B);
		
		JRadioButton radioRegular_5B = new JRadioButton("Regular");
		radioRegular_5B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_5B.setToolTipText("El usuario requiere ayuda contextual y manual de uso para operar el producto\r\nsoftware.\r\n");
		radioRegular_5B.setBounds(592, 453, 147, 44);
		panelUsabilidad.add(radioRegular_5B);
		grupoUsaB.add(radioRegular_5B);
		
		JRadioButton radioMala_5B = new JRadioButton("Mala");
		radioMala_5B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_5B.setToolTipText("El usuario requiere consultar a personal especializado para operar el producto software.");
		radioMala_5B.setActionCommand("Mala");
		radioMala_5B.setBounds(592, 513, 147, 44);
		panelUsabilidad.add(radioMala_5B);
		grupoUsaB.add(radioMala_5B);
		
		
		JRadioButton radioBuena_5B = new JRadioButton("Buena");
		radioBuena_5B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_5B.setToolTipText("El usuario requiere solo ayuda contextual para operar el producto\r\nsoftware.\r\n");
		radioBuena_5B.setBounds(592, 393, 147, 44);
		panelUsabilidad.add(radioBuena_5B);
		grupoUsaB.add(radioBuena_5B);
		*/
		JLabel lblesLaCapacidad_2 = new JLabel("<html><body>Es la Capacidad del producto software de ser utilizado sin asistencia adicional. Se val\u00FAa que requiere el usuario para operar correctamente el producto.</body></html>\r\n");
		lblesLaCapacidad_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblesLaCapacidad_2.setBounds(437, 206, 426, 90);
		panelUsabilidad.add(lblesLaCapacidad_2);
		
		JLabel lblDescUsab_B = new JLabel("<html><body>Capacidad para ser operado</body></html>");
		lblDescUsab_B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_B.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDescUsab_B.setBounds(437, 106, 426, 100);
		panelUsabilidad.add(lblDescUsab_B);
		
		JLabel lblDescUsab_C = new JLabel("<html><body>Capacidad de ser atractivo para el usuario</body></html>");
		lblDescUsab_C.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_C.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblDescUsab_C.setBounds(863, 106, 426, 100);
		panelUsabilidad.add(lblDescUsab_C);
		
		JLabel lblesLaAgrupacin = new JLabel("<html><body>Es la agrupaci\u00F3n correcta de funcionalidad del producto software en su interfaz gr\u00E1fica, desde su agrupaci\u00F3n l\u00F3gica hasta el n\u00FAmero promedio de pasos para alcanzar una funci\u00F3n o contenido espec\u00EDfico.</body></html>\r\n");
		lblesLaAgrupacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblesLaAgrupacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblesLaAgrupacin.setBounds(863, 206, 401, 90);
		panelUsabilidad.add(lblesLaAgrupacin);
		/*
		JRadioButton radioRegular_5C = new JRadioButton("Regular");
		radioRegular_5C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_5C.setToolTipText("Entre 6 y 8 pasos promedio y distribuidos en categor\u00EDas.");
		radioRegular_5C.setBounds(1018, 453, 147, 44);
		panelUsabilidad.add(radioRegular_5C);
		grupoUsaC.add(radioRegular_5C);
		
		JRadioButton radioMala_5C = new JRadioButton("Mala");
		radioMala_5C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_5C.setToolTipText("m\u00E1s de 8 pasos promedio sin organizaci\u00F3n de categor\u00EDa.");
		radioMala_5C.setActionCommand("Mala");
		radioMala_5C.setBounds(1018, 513, 147, 44);
		panelUsabilidad.add(radioMala_5C);
		grupoUsaC.add(radioMala_5C);
		
		JRadioButton radioBuena_5C = new JRadioButton("Buena");
		radioBuena_5C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_5C.setToolTipText("Entre 3 y 5 pasos promedio y distribuidos en categor\u00EDas.");
		radioBuena_5C.setBounds(1018, 393, 147, 44);
		panelUsabilidad.add(radioBuena_5C);
		grupoUsaC.add(radioBuena_5C);
		
		JRadioButton radioExcelente_5C = new JRadioButton("Excelente");
		radioExcelente_5C.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_5C.setToolTipText("1 o 2 pasos promedio y distribuidos en categor\u00EDas.");
		radioExcelente_5C.setBounds(1018, 333, 147, 44);
		panelUsabilidad.add(radioExcelente_5C);
		grupoUsaC.add(radioExcelente_5C);
		*/
		JLabel label_1 = new JLabel("<html><body>Porcentaje de comentarios en el codigo</body><html>");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(437, 358, 405, 57);
		panelUsabilidad.add(label_1);
		
		JLabel lblpasosRequeridosPor = new JLabel("<html><body>Cantidad de pasos para realizar una operaci\u00F3n</body><html>");
		lblpasosRequeridosPor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblpasosRequeridosPor.setBounds(863, 435, 405, 57);
		panelUsabilidad.add(lblpasosRequeridosPor);
		
		txt_5 = new JTextField(10);
		txt_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_5.setBounds(1018, 500, 55, 20);
		panelUsabilidad.add(txt_5);
		
		JLabel lblposeeAyudaContextual = new JLabel("<html><body>\u00BFPosee ayuda contextual sobre men\u00FAs y botones de acci\u00F3n?</body><html>");
		lblposeeAyudaContextual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblposeeAyudaContextual.setBounds(10, 328, 405, 57);
		panelUsabilidad.add(lblposeeAyudaContextual);
		
		JRadioButton rbtn_5A_1_SI = new JRadioButton("SI");
		rbtn_5A_1_SI.setBounds(20, 392, 109, 23);
		panelUsabilidad.add(rbtn_5A_1_SI);
		grupoUsa_A1.add(rbtn_5A_1_SI);
		
		JRadioButton rbtn_5A_1_NO = new JRadioButton("NO");
		rbtn_5A_1_NO.setActionCommand("Mala");
		rbtn_5A_1_NO.setBounds(247, 392, 109, 23);
		panelUsabilidad.add(rbtn_5A_1_NO);
		grupoUsa_A1.add(rbtn_5A_1_NO);
		
		JRadioButton rbtn_5A_2_SI = new JRadioButton("SI");
		rbtn_5A_2_SI.setBounds(26, 497, 109, 23);
		panelUsabilidad.add(rbtn_5A_2_SI);
		grupoUsa_A2.add(rbtn_5A_2_SI);
		
		JRadioButton rbtn_5A_2_NO = new JRadioButton("NO");
		rbtn_5A_2_NO.setActionCommand("Mala");
		rbtn_5A_2_NO.setBounds(253, 497, 109, 23);
		panelUsabilidad.add(rbtn_5A_2_NO);
		grupoUsa_A2.add(rbtn_5A_2_NO);
		
		JLabel lblposeeManualDe = new JLabel("<html><body>\u00BFPosee Manual de usuario incorporado al sistema como un men\u00FA dedicado?</body><html>");
		lblposeeManualDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblposeeManualDe.setBounds(16, 433, 405, 57);
		panelUsabilidad.add(lblposeeManualDe);
		
		JLabel lblposeeAyudasComplementarias = new JLabel("<html><body>\u00BFposee ayudas complementarias aparte de las dos anteriores?</body><html>");
		lblposeeAyudasComplementarias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblposeeAyudasComplementarias.setBounds(10, 523, 405, 57);
		panelUsabilidad.add(lblposeeAyudasComplementarias);
		
		JRadioButton rbtn_5A_3_SI = new JRadioButton("SI");
		rbtn_5A_3_SI.setBounds(20, 587, 109, 23);
		panelUsabilidad.add(rbtn_5A_3_SI);
		grupoUsa_A3.add(rbtn_5A_3_SI);
		
		JRadioButton rbtn_5A_3_NO = new JRadioButton("NO");
		rbtn_5A_3_NO.setActionCommand("Mala");
		rbtn_5A_3_NO.setBounds(247, 587, 109, 23);
		panelUsabilidad.add(rbtn_5A_3_NO);
		grupoUsa_A3.add(rbtn_5A_3_NO);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.addItem("El usuario opera el producto software sin asistencia.");
		comboBox.addItem("El usuario requiere solo ayuda contextual para operar el producto software.");
		comboBox.addItem("El usuario requiere ayuda contextual y manual de uso para operar el producto.");
		comboBox.addItem("El usuario requiere consultar a personal especializado para operar el producto.");
		comboBox.setSelectedIndex(-1);
		comboBox.setBounds(437, 443, 405, 47);
		panelUsabilidad.add(comboBox);	
		
		JLabel lbllaInstalacionEsta = new JLabel("<html><body>\u00BFLa interfaz grafica presenta categorias?</body><html>");
		lbllaInstalacionEsta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbllaInstalacionEsta.setBounds(863, 317, 405, 57);
		panelUsabilidad.add(lbllaInstalacionEsta);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setSelectedIndex(-1);
		comboBox.addItem("SI");
		comboBox.addItem("NO");
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox_1.setBounds(1018, 386, 69, 33);
		panelUsabilidad.add(comboBox_1);
		
		
		JButton btn_Cancelar_5 = new JButton("Cancelar");
		btn_Cancelar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
//					lblRes_FUN.setText("SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.GREEN);
//					label_Res_FIA.setText("SATISFACTORIO");
//					label_Res_FIA.setBackground(Color.GREEN);
//					label_Res_EFI.setText("SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.GREEN);
//					label_Res_MAN.setText("SATISFACTORIO");
//					label_Res_MAN.setBackground(Color.GREEN);
					fun = efi = fia = man =0;
					panel_Inicio.setVisible(true);
					panelUsabilidad.setVisible(false);}		
			}
		});
		btn_Cancelar_5.setBounds(10, 641, 157, 39);
		panelUsabilidad.add(btn_Cancelar_5);
		
		JButton btn_Atras_5 = new JButton("Atras");
		btn_Atras_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsabilidad.setVisible(false);
				panelMantenibilidad.setVisible(true);
//				label_Res_MAN.setText("SATISFACTORIO");
//				label_Res_MAN.setBackground(Color.GREEN);
				man = 0;
			}
		});
		btn_Atras_5.setBounds(166, 641, 147, 39);
		panelUsabilidad.add(btn_Atras_5);
		
		JButton btn_Sigueinte_5 = new JButton("Siguiente");
		btn_Sigueinte_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grupoUsa_A1.isSelected(null) || grupoUsa_A2.isSelected(null) || grupoUsa_A3.isSelected(null) || comboBox.getSelectedIndex() < 0 || txt_5.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				else {if(grupoUsa_A1.getSelection().getActionCommand() == "Mala" && grupoUsa_A2.getSelection().getActionCommand() == "Mala"){
					usa++;
				}
				if(comboBox.getSelectedItem() == "El usuario requiere consultar a personal especializado para operar el producto.") {
					usa++;
				}	
				if(Integer.parseInt(txt_5.getText()) > 8) {
					usa++;
				}
				/*if(grupoUsaA.isSelected(null) || grupoUsaB.isSelected(null) || grupoUsaC.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoUsaA.getSelection().getActionCommand() == "Mala") {
//				label_Res_USA.setText("NO SATISFACTORIO");
//				label_Res_USA.setBackground(Color.RED);
				usa++;
			}
			if(grupoUsaB.getSelection().getActionCommand() == "Mala") {
//				label_Res_USA.setText("NO SATISFACTORIO");
//				label_Res_USA.setBackground(Color.RED);
				usa++;
			}
			if(grupoUsaC.getSelection().getActionCommand() == "Mala") {
//				label_Res_USA.setText("NO SATISFACTORIO");
//				label_Res_USA.setBackground(Color.RED);
				usa++;
			}*/
			panelPortabilidad.setVisible(true);
			panelUsabilidad.setVisible(false);
			}
			}
		});
		btn_Sigueinte_5.setBounds(1107, 641, 157, 39);
		panelUsabilidad.add(btn_Sigueinte_5);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setForeground(Color.BLACK);
		separator_13.setBackground(Color.BLACK);
		separator_13.setBounds(0, 93, 1274, 2);
		panelUsabilidad.add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setForeground(Color.BLACK);
		separator_14.setBackground(Color.BLACK);
		separator_14.setBounds(0, 628, 1274, 2);
		panelUsabilidad.add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setForeground(Color.BLACK);
		separator_15.setBackground(Color.BLACK);
		separator_15.setBounds(426, 93, 2, 535);
		panelUsabilidad.add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setOrientation(SwingConstants.VERTICAL);
		separator_16.setForeground(Color.BLACK);
		separator_16.setBackground(Color.BLACK);
		separator_16.setBounds(852, 95, 2, 535);
		panelUsabilidad.add(separator_16);
		
		
		
		//PORTABILIDAD
		//PORTABILIDAD
		//PORTABILIDAD
		
		JLabel labelPortabilidad = new JLabel("PORTABILIDAD");
		labelPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		labelPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 60));
		labelPortabilidad.setBackground(Color.WHITE);
		labelPortabilidad.setBounds(10, 5, 1254, 90);
		panelPortabilidad.add(labelPortabilidad);
		
		JLabel lblDesc_6B = new JLabel("<html><body>Instalabilidad</body></html>");
		lblDesc_6B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc_6B.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblDesc_6B.setBounds(655, 106, 634, 119);
		panelPortabilidad.add(lblDesc_6B);
		
		JLabel lblelProductoSoftware = new JLabel("<html><body>El producto software debe poder ser instalado en una cantidad m\u00EDnima de pasos.</body></html>\r\n");
		lblelProductoSoftware.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblelProductoSoftware.setBounds(655, 220, 609, 55);
		panelPortabilidad.add(lblelProductoSoftware);
		
		JLabel lblesLaCapacidad_3 = new JLabel("<html><body>Es la capacidad del producto software de adaptarse a diferentes sistemas operativos sin cambiar su estructura interna.</body></html>\r\n");
		lblesLaCapacidad_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblesLaCapacidad_3.setBounds(10, 220, 634, 55);
		panelPortabilidad.add(lblesLaCapacidad_3);
		
		JLabel lblDesc_6A = new JLabel("Adaptabilidad");
		lblDesc_6A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc_6A.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblDesc_6A.setBounds(10, 106, 634, 119);
		panelPortabilidad.add(lblDesc_6A);
		/*
		JRadioButton radioExcelente_6A = new JRadioButton("Excelente");
		radioExcelente_6A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_6A.setToolTipText("compatible con 4 o m\u00E1s sistemas operativos");
		radioExcelente_6A.setBounds(212, 334, 206, 44);
		panelPortabilidad.add(radioExcelente_6A);
		grupoPorA.add(radioExcelente_6A);
		
		JRadioButton radioBuena_6A = new JRadioButton("Buena");
		radioBuena_6A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_6A.setToolTipText("Compatible con 3 sistemas operativos.");
		radioBuena_6A.setBounds(212, 399, 130, 44);
		panelPortabilidad.add(radioBuena_6A);
		grupoPorA.add(radioBuena_6A);
		
		JRadioButton radioRegular_6A = new JRadioButton("Regular");
		radioRegular_6A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_6A.setToolTipText("Compatible con 2 sistemas operativos.");
		radioRegular_6A.setBounds(212, 466, 130, 44);
		panelPortabilidad.add(radioRegular_6A);
		grupoPorA.add(radioRegular_6A);
		
		JRadioButton radioMala_6A = new JRadioButton("Mala");
		radioMala_6A.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_6A.setToolTipText("Compatible con 1 sistema operativo.");
		radioMala_6A.setActionCommand("Mala");
		radioMala_6A.setBounds(212, 536, 130, 44);
		panelPortabilidad.add(radioMala_6A);
		grupoPorA.add(radioMala_6A);
		
		JRadioButton radioMala_6B = new JRadioButton("Mala");
		radioMala_6B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioMala_6B.setToolTipText("El producto se instala en m\u00E1s de 7 pasos.");
		radioMala_6B.setActionCommand("Mala");
		radioMala_6B.setBounds(883, 536, 130, 44);
		panelPortabilidad.add(radioMala_6B);
		grupoPorB.add(radioMala_6B);
		
		JRadioButton radioRegular_6B = new JRadioButton("Regular");
		radioRegular_6B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioRegular_6B.setToolTipText("El producto se instala entre 5 y 7 pasos.");
		radioRegular_6B.setBounds(883, 466, 130, 44);
		panelPortabilidad.add(radioRegular_6B);
		grupoPorB.add(radioRegular_6B);
		
		JRadioButton radioBuena_6B = new JRadioButton("Buena");
		radioBuena_6B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioBuena_6B.setToolTipText("El producto se instala entre 2 y 4 pasos.");
		radioBuena_6B.setBounds(883, 399, 130, 44);
		panelPortabilidad.add(radioBuena_6B);
		grupoPorB.add(radioBuena_6B);
		
		JRadioButton radioExcelente_6B = new JRadioButton("Excelente");
		radioExcelente_6B.setFont(new Font("Tahoma", Font.PLAIN, 26));
		radioExcelente_6B.setToolTipText("El producto se instala en menos de 2 pasos");
		radioExcelente_6B.setBounds(883, 334, 206, 44);
		panelPortabilidad.add(radioExcelente_6B);
		grupoPorB.add(radioExcelente_6B);
		*/
		JButton btn_Siguiente_6 = new JButton("Siguiente");
		btn_Siguiente_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_6A.getText().isEmpty() || txt_6B.getText().isEmpty())
					JOptionPane.showMessageDialog(panelFuncionalidad, "Ingrese un valor");
				if(Integer.parseInt(txt_6A.getText()) == 1) {
					por++;
				}
				if(Integer.parseInt(txt_2B.getText()) > 7) {
					por++;
				}
				
			/*	if(grupoPorA.isSelected(null) || grupoPorB.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoPorA.getSelection().getActionCommand() == "Mala") {
//				label_Res_POR.setText(" NO SATISFACTORIO");
//				label_Res_POR.setBackground(Color.RED);
				por++;
			}
			if(grupoPorB.getSelection().getActionCommand() == "Mala") {
//				label_Res_POR.setText("NO SATISFACTORIO");
//				label_Res_POR.setBackground(Color.RED);
				por++;
			}*/
			panelPortabilidad.setVisible(false);
			panelResultado.setVisible(true);
			//System.out.println(fun);
			//}
				//asigno el resultado final
				if(fun>0) {
					lblRes_FUN.setText("NO SATISFACTORIO");
					lblRes_FUN.setBackground(new Color(220, 20, 60));		
				}
				if(efi>0){
					label_Res_EFI.setText("NO SATISFACTORIO");
					label_Res_EFI.setBackground(new Color(220, 20, 60));
				}
				if(fia>0) {
					label_Res_FIA.setText("NO SATISFACTORIO");
					label_Res_FIA.setBackground(new Color(220, 20, 60));
				}
				if(man>0) {
					label_Res_MAN.setText("NO SATISFACTORIO");
					label_Res_MAN.setBackground(new Color(220, 20, 60));
				}
				if(usa>0) {
					label_Res_USA.setText("NO SATISFACTORIO");
					label_Res_USA.setBackground(new Color(220, 20, 60));
				}
				if(por>0) {
					label_Res_POR.setText("NO SATISFACTORIO");
					label_Res_POR.setBackground(new Color(220, 20, 60));
				}
				if(fun >0 || efi>0 || fia >0 || man>0 || usa>0 || por>0) {
					label_Res_FINAL.setText("NO SATISFACTORIO");
					label_Res_FINAL.setBackground(new Color(220, 20, 60));
				}
			}
		});
		btn_Siguiente_6.setBounds(1107, 641, 157, 39);
		panelPortabilidad.add(btn_Siguiente_6);
		
		JButton btn_Cancelar_6 = new JButton("Cancelar");
		btn_Cancelar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
//					lblRes_FUN.setText("SATISFACTORIO");
//					lblRes_FUN.setBackground(Color.GREEN);
//					label_Res_FIA.setText("SATISFACTORIO");
//					label_Res_FIA.setBackground(Color.GREEN);
//					label_Res_EFI.setText("SATISFACTORIO");
//					label_Res_EFI.setBackground(Color.GREEN);
//					label_Res_MAN.setText("SATISFACTORIO");
//					label_Res_MAN.setBackground(Color.GREEN);
//					label_Res_USA.setText("SATISFACTORIO");
//					label_Res_USA.setBackground(Color.GREEN);
					fun = efi = fia = man = usa = 0;
					panel_Inicio.setVisible(true);
					panelUsabilidad.setVisible(false);}	
			}
		});
		btn_Cancelar_6.setBounds(10, 641, 157, 39);
		panelPortabilidad.add(btn_Cancelar_6);
		
		JButton btn_Atras_6 = new JButton("Atras");
		btn_Atras_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsabilidad.setVisible(true);
				panelPortabilidad.setVisible(false);
//				label_Res_USA.setText("SATISFACTORIO");
//				label_Res_USA.setBackground(Color.GREEN);
				usa = 0;
			}
		});
		btn_Atras_6.setBounds(166, 641, 147, 39);
		panelPortabilidad.add(btn_Atras_6);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(Color.BLACK);
		separator_9.setBackground(Color.BLACK);
		separator_9.setBounds(642, 93, 2, 534);
		panelPortabilidad.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setBackground(Color.BLACK);
		separator_10.setBounds(0, 93, 1274, 2);
		panelPortabilidad.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBackground(Color.BLACK);
		separator_11.setBounds(0, 628, 1274, 2);
		panelPortabilidad.add(separator_11);
		
		JLabel lblcantidadDeSistemas = new JLabel("<html><body>Cantidad de Sistemas operativos en los cuales es compatible</body><html>");
		lblcantidadDeSistemas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcantidadDeSistemas.setBounds(110, 352, 405, 57);
		panelPortabilidad.add(lblcantidadDeSistemas);
		
		txt_6A = new JTextField(10);
		txt_6A.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_6A.setBounds(293, 420, 55, 20);
		panelPortabilidad.add(txt_6A);
		
		JLabel lblcantidadDePasos = new JLabel("<html><body>Cantidad de pasos necesarios para la instalaci\u00F3n</body><html>");
		lblcantidadDePasos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblcantidadDePasos.setBounds(780, 352, 405, 57);
		panelPortabilidad.add(lblcantidadDePasos);
		
		txt_6B = new JTextField(10);
		txt_6B.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_6B.setBounds(963, 420, 55, 20);
		panelPortabilidad.add(txt_6B);
		
		//RESULTADO
		//RESULTADO
		//RESULTADO
		System.out.println("HOLA");
		//System.out.println("al final de todo FUNCIONALIDAD =" +fun);
		JLabel lblResultado = new JLabel("RESULTADO FINAL");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblResultado.setBackground(Color.WHITE);
		lblResultado.setBounds(10, 5, 1254, 117);
		panelResultado.add(lblResultado);
		
		JLabel lblFuncionalidad_1 = new JLabel("FUNCIONALIDAD");
		lblFuncionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFuncionalidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionalidad_1.setBackground(SystemColor.menu);
		lblFuncionalidad_1.setBounds(10, 147, 227, 70);
		panelResultado.add(lblFuncionalidad_1);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEficiencia.setBackground(SystemColor.menu);
		lblEficiencia.setBounds(10, 233, 227, 97);
		panelResultado.add(lblEficiencia);
		
		JLabel lblFiabilidad_1 = new JLabel("FIABILIDAD");
		lblFiabilidad_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFiabilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiabilidad_1.setBounds(10, 333, 227, 98);
		panelResultado.add(lblFiabilidad_1);
		
		JLabel lblMantenibilidad_1 = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMantenibilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenibilidad_1.setBounds(740, 133, 227, 98);
		panelResultado.add(lblMantenibilidad_1);
		
		JLabel lblUsabilidad_1 = new JLabel("USABILIDAD");
		lblUsabilidad_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblUsabilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsabilidad_1.setBounds(740, 233, 227, 97);
		panelResultado.add(lblUsabilidad_1);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortabilidad.setBounds(740, 333, 227, 98);
		panelResultado.add(lblPortabilidad);
		
		JLabel lblFinal = new JLabel("RESULTADO");
		lblFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinal.setFont(new Font("Tahoma", Font.PLAIN, 41));
		lblFinal.setBounds(357, 461, 238, 153);
		panelResultado.add(lblFinal);
		
		JButton finalizar = new JButton("Finalizar");
		finalizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		finalizar.setBounds(538, 625, 227, 55);
		panelResultado.add(finalizar);
				
		JSeparator separator_17 = new JSeparator();
		separator_17.setBackground(Color.BLACK);
		separator_17.setForeground(Color.BLACK);
		separator_17.setBounds(8, 431, 535, 2);
		panelResultado.add(separator_17);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setForeground(Color.BLACK);
		separator_18.setBackground(Color.BLACK);
		separator_18.setBounds(10, 131, 535, 2);
		panelResultado.add(separator_18);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setBackground(Color.BLACK);
		separator_19.setForeground(Color.BLACK);
		separator_19.setOrientation(SwingConstants.VERTICAL);
		separator_19.setBounds(543, 131, 2, 301);
		panelResultado.add(separator_19);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setOrientation(SwingConstants.VERTICAL);
		separator_20.setForeground(Color.BLACK);
		separator_20.setBackground(Color.BLACK);
		separator_20.setBounds(728, 131, 2, 301);
		panelResultado.add(separator_20);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setOrientation(SwingConstants.VERTICAL);
		separator_21.setForeground(Color.BLACK);
		separator_21.setBackground(Color.BLACK);
		separator_21.setBounds(235, 130, 2, 301);
		panelResultado.add(separator_21);
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setOrientation(SwingConstants.VERTICAL);
		separator_22.setForeground(Color.BLACK);
		separator_22.setBackground(Color.BLACK);
		separator_22.setBounds(965, 131, 2, 301);
		panelResultado.add(separator_22);
		
		JSeparator separator_23 = new JSeparator();
		separator_23.setOrientation(SwingConstants.VERTICAL);
		separator_23.setForeground(Color.BLACK);
		separator_23.setBackground(Color.BLACK);
		separator_23.setBounds(10, 131, 2, 301);
		panelResultado.add(separator_23);
		
		JSeparator separator_24 = new JSeparator();
		separator_24.setOrientation(SwingConstants.VERTICAL);
		separator_24.setForeground(Color.BLACK);
		separator_24.setBackground(Color.BLACK);
		separator_24.setBounds(1261, 131, 2, 301);
		panelResultado.add(separator_24);
		
		JSeparator separator_25 = new JSeparator();
		separator_25.setForeground(Color.BLACK);
		separator_25.setBackground(Color.BLACK);
		separator_25.setBounds(10, 231, 535, 2);
		panelResultado.add(separator_25);
		
		JSeparator separator_26 = new JSeparator();
		separator_26.setForeground(Color.BLACK);
		separator_26.setBackground(Color.BLACK);
		separator_26.setBounds(10, 331, 535, 2);
		panelResultado.add(separator_26);
		
		JSeparator separator_27 = new JSeparator();
		separator_27.setForeground(Color.BLACK);
		separator_27.setBackground(Color.BLACK);
		separator_27.setBounds(728, 131, 535, 2);
		panelResultado.add(separator_27);
		
		JSeparator separator_28 = new JSeparator();
		separator_28.setForeground(Color.BLACK);
		separator_28.setBackground(Color.BLACK);
		separator_28.setBounds(728, 231, 535, 2);
		panelResultado.add(separator_28);
		
		JSeparator separator_29 = new JSeparator();
		separator_29.setForeground(Color.BLACK);
		separator_29.setBackground(Color.BLACK);
		separator_29.setBounds(728, 331, 535, 2);
		panelResultado.add(separator_29);
		
		JSeparator separator_30 = new JSeparator();
		separator_30.setForeground(Color.BLACK);
		separator_30.setBackground(Color.BLACK);
		separator_30.setBounds(728, 431, 535, 2);
		panelResultado.add(separator_30);
		
		JSeparator separator_31 = new JSeparator();
		separator_31.setBackground(Color.BLACK);
		separator_31.setForeground(Color.BLACK);
		separator_31.setBounds(357, 612, 608, 2);
		panelResultado.add(separator_31);
		
		JSeparator separator_32 = new JSeparator();
		separator_32.setForeground(Color.BLACK);
		separator_32.setBackground(Color.BLACK);
		separator_32.setBounds(357, 460, 608, 2);
		panelResultado.add(separator_32);
		
		JSeparator separator_33 = new JSeparator();
		separator_33.setBackground(Color.BLACK);
		separator_33.setForeground(Color.BLACK);
		separator_33.setOrientation(SwingConstants.VERTICAL);
		separator_33.setBounds(357, 461, 2, 153);
		panelResultado.add(separator_33);
		
		JSeparator separator_34 = new JSeparator();
		separator_34.setOrientation(SwingConstants.VERTICAL);
		separator_34.setForeground(Color.BLACK);
		separator_34.setBackground(Color.BLACK);
		separator_34.setBounds(605, 461, 2, 153);
		panelResultado.add(separator_34);
		
		JSeparator separator_35 = new JSeparator();
		separator_35.setOrientation(SwingConstants.VERTICAL);
		separator_35.setForeground(Color.BLACK);
		separator_35.setBackground(Color.BLACK);
		separator_35.setBounds(965, 461, 2, 153);
		panelResultado.add(separator_35);
		
		
	}
}
