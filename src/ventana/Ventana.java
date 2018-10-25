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

	
	
	/*static int fun = 0;
	static int efi = 0;
	static int fia = 0;
	static int man = 0;
	static int usa = 0;
	static int por = 0;*/
	int msg;

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
		frame.setBounds(100, 100, 700, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//JPANEL
		//JPANEL
		//JPANEL
		//JPANEL
		
		
		JPanel panel_Inicio = new JPanel();
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
		frame.getContentPane().add(panelResultado, "name_339191488128200");
		panelResultado.setLayout(null);
		panelResultado.setVisible(false);
		
		///RESULTADO
		//RESULTADO
	
		JLabel lblRes_FUN = new JLabel("SATISFACTORIO");
		lblRes_FUN.setBackground(Color.GREEN);
		lblRes_FUN.setBounds(142, 73, 101, 70);
		panelResultado.add(lblRes_FUN);
	
		JLabel label_Res_EFI  = new JLabel("SATISFACTORIO");
		label_Res_EFI.setBackground(Color.GREEN);
		label_Res_EFI.setBounds(142, 148, 101, 70);
		panelResultado.add(label_Res_EFI);
	
		JLabel label_Res_FIA  = new JLabel("SATISFACTORIO");
		label_Res_FIA.setBackground(Color.GREEN);
		label_Res_FIA.setBounds(142, 219, 101, 70);
		panelResultado.add(label_Res_FIA);
	
		JLabel label_Res_MAN  = new JLabel("SATISFACTORIO");
		label_Res_MAN.setBackground(Color.GREEN);
		label_Res_MAN.setBounds(486, 73, 101, 70);
		panelResultado.add(label_Res_MAN);
	
		JLabel label_Res_USA = new JLabel("SATISFACTORIO");
		label_Res_USA.setBackground(Color.GREEN);
		label_Res_USA.setBounds(486, 148, 101, 70);
		panelResultado.add(label_Res_USA);
		
		JLabel label_Res_POR = new JLabel("SATISFACTORIO");
		label_Res_POR.setBackground(Color.GREEN);
		label_Res_POR.setBounds(486, 219, 101, 70);
		panelResultado.add(label_Res_POR);
		
		//INICIO
		//INICIO
		//INICIO
		//INICIO
		

		JButton btnComenzar = new JButton("INICIO");
		btnComenzar.setBounds(233, 310, 229, 81);
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
		lblGrupo.setBounds(10, 153, 664, 96);
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Inicio.add(lblGrupo);
		
		JLabel lblTitulo = new JLabel("Algoritmo \r\nde \r\r\nCalidad");
		lblTitulo.setBounds(10, 22, 664, 74);
		lblTitulo.setFont(new Font("Unispace", Font.BOLD, 38));
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
		lblFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblFuncionalidad.setBounds(10, 11, 664, 44);
		panelFuncionalidad.add(lblFuncionalidad);
		
		JLabel lblDescFuncionalidad = new JLabel("<html><body>Es la capacidad del producto software para proporcionar <br>los resultados con el grado de probabilidad de error permitido.</body></html>");
		lblDescFuncionalidad.setBackground(Color.LIGHT_GRAY);
		lblDescFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescFuncionalidad.setBounds(10, 139, 348, 57);
		panelFuncionalidad.add(lblDescFuncionalidad);
		
		JRadioButton rdbtnExcelente1A = new JRadioButton("Excelente");
		rdbtnExcelente1A.setToolTipText("Probabilidad de error igual a 0. Siempre lleva a cabo la opci\u00F3n deseada\r\n");
		rdbtnExcelente1A.setBounds(27, 204, 130, 44);
		panelFuncionalidad.add(rdbtnExcelente1A);
		grupoFunA.add(rdbtnExcelente1A);
		
		JRadioButton rdbtnBuena1A = new JRadioButton("Buena");
		rdbtnBuena1A.setToolTipText("Probabilidad de error menor a 0.05 menos de la mitad de las veces produce errores");
		rdbtnBuena1A.setBounds(27, 249, 130, 44);
		panelFuncionalidad.add(rdbtnBuena1A);
		grupoFunA.add(rdbtnBuena1A);
		
		JRadioButton rdbtnRegular1A = new JRadioButton("Regular");
		rdbtnRegular1A.setToolTipText("Probabilidad de error entre 0.05 y 1. m\u00E1s de la mitad de las veces produce errores");
		rdbtnRegular1A.setBounds(27, 296, 130, 44);
		panelFuncionalidad.add(rdbtnRegular1A);
		grupoFunA.add(rdbtnRegular1A);
		
		JRadioButton rdbtnMala1A = new JRadioButton("Mala");
		rdbtnMala1A.setToolTipText("Probabilidad de error = 1.  Nunca lleva a cabo la opci\u00F3n deseada");
		rdbtnMala1A.setBounds(27, 341, 130, 44);
		panelFuncionalidad.add(rdbtnMala1A);
		rdbtnMala1A.setActionCommand("Mala");
		grupoFunA.add(rdbtnMala1A);
		
		JButton btnSiguiente1A = new JButton("Siguiente");
		btnSiguiente1A.setBounds(562, 467, 112, 23);
		panelFuncionalidad.add(btnSiguiente1A);
		btnSiguiente1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(grupoFunA.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				if(grupoFunA.getSelection().getActionCommand() == "Mala") {
					lblRes_FUN.setText("NO SATISFACTORIO");
					lblRes_FUN.setBackground(Color.red);
					//fun++;
				}
				panelEficiencia.setVisible(true);
				panelFuncionalidad.setVisible(false);
				//System.out.println("al final de la primera funcionalidad =" + fun);	
				
			}
		});
		
		JButton btnAtras1A = new JButton("Atras");
		btnAtras1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Inicio.setVisible(true);
				panelFuncionalidad.setVisible(false);
			}
		});
		btnAtras1A.setBounds(132, 467, 100, 23);
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
		btnCancelar1A.setBounds(10, 467, 112, 23);
		panelFuncionalidad.add(btnCancelar1A);
		
		JLabel lblExactitudDeLos = new JLabel("Exactitud de los resultados");
		lblExactitudDeLos.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblExactitudDeLos.setBounds(10, 99, 380, 44);
		panelFuncionalidad.add(lblExactitudDeLos);
			
		//EFICIENCIA
		//EFICIENCIA
		//EFICIENCIA
		
		JLabel labelEficiencia = new JLabel("EFICIENCIA");
		labelEficiencia.setBounds(0, 5, 674, 39);
		labelEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		labelEficiencia.setFont(new Font("Tahoma", Font.PLAIN, 44));
		labelEficiencia.setBackground(Color.WHITE);
		panelEficiencia.add(labelEficiencia);
		
		JLabel labelDescEficiencia_A = new JLabel("Utilización de recursos");
		labelDescEficiencia_A.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelDescEficiencia_A.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescEficiencia_A.setBounds(0, 90, 332, 30);
		panelEficiencia.add(labelDescEficiencia_A);
		
		JRadioButton radioExcelente_Eficiencia_A = new JRadioButton("Excelente");
		radioExcelente_Eficiencia_A.setToolTipText("menos de 5% de uso de CPU");
		radioExcelente_Eficiencia_A.setBounds(22, 218, 130, 44);
		panelEficiencia.add(radioExcelente_Eficiencia_A);
		grupoEfiA.add(radioExcelente_Eficiencia_A);
		
		JRadioButton radioBuena_Eficiencia_A = new JRadioButton("Buena");
		radioBuena_Eficiencia_A.setToolTipText("5% a 9% de uso de CPU.");
		radioBuena_Eficiencia_A.setBounds(22, 261, 130, 44);
		panelEficiencia.add(radioBuena_Eficiencia_A);
		grupoEfiA.add(radioBuena_Eficiencia_A);
		
		JRadioButton radioRegular_Eficiencia_A = new JRadioButton("Regular");
		radioRegular_Eficiencia_A.setToolTipText("10% a 39% de uso de CPU.");
		radioRegular_Eficiencia_A.setBounds(22, 308, 130, 44);
		panelEficiencia.add(radioRegular_Eficiencia_A);
		grupoEfiA.add(radioRegular_Eficiencia_A);
		
		JRadioButton radioMala_Eficiencia_A = new JRadioButton("Mala");
		radioMala_Eficiencia_A.setToolTipText("39% o m\u00E1s de uso de CPU.");
		radioMala_Eficiencia_A.setBounds(22, 355, 130, 44);
		radioMala_Eficiencia_A.setActionCommand("Mala");
		panelEficiencia.add(radioMala_Eficiencia_A);
		grupoEfiA.add(radioMala_Eficiencia_A);
		
		JLabel labelDescEficiencia_B = new JLabel("<html><body>Comportamiento frente<br>al tiempo</body></html>");
		labelDescEficiencia_B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDescEficiencia_B.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescEficiencia_B.setBounds(342, 90, 332, 50);
		panelEficiencia.add(labelDescEficiencia_B);
		
		JRadioButton radioMala_Eficiencia_B = new JRadioButton("Mala");
		radioMala_Eficiencia_B.setToolTipText("El producto est\u00E1 m\u00E1s de 6 segundos para informar al usuario del estado de la operaci\u00F3n");
		radioMala_Eficiencia_B.setActionCommand("Mala");
		radioMala_Eficiencia_B.setBounds(387, 355, 130, 44);
		panelEficiencia.add(radioMala_Eficiencia_B);
		grupoEfiB.add(radioMala_Eficiencia_B);
		
		JRadioButton radioRegular_Eficiencia_B = new JRadioButton("Regular");
		radioRegular_Eficiencia_B.setToolTipText("El producto est\u00E1 entre 4 y 6 segundos  para informar al usuario del estado de la operaci\u00F3n");
		radioRegular_Eficiencia_B.setBounds(387, 308, 130, 44);
		panelEficiencia.add(radioRegular_Eficiencia_B);
		grupoEfiB.add(radioRegular_Eficiencia_B);
				
		JRadioButton radioExcelente_Eficiencia_B = new JRadioButton("Excelente");
		radioExcelente_Eficiencia_B.setToolTipText("El producto est\u00E1 menos de 2 segundo para informar al usuario del estado de la operaci\u00F3n");
		radioExcelente_Eficiencia_B.setBounds(387, 218, 130, 44);
		panelEficiencia.add(radioExcelente_Eficiencia_B);
		grupoEfiB.add(radioExcelente_Eficiencia_B);
		
		JRadioButton radioBuena_Eficiencia_B = new JRadioButton("Buena");
		radioBuena_Eficiencia_B.setToolTipText("El producto est\u00E1 entre 2 y  menos de 4 segundos  para informar al usuario del estado de la operaci\u00F3n.");
		radioBuena_Eficiencia_B.setBounds(387, 261, 130, 44);
		panelEficiencia.add(radioBuena_Eficiencia_B);
		grupoEfiB.add(radioBuena_Eficiencia_B);
		
		JButton btnAtras_2A_ = new JButton("Atras");
		btnAtras_2A_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEficiencia.setVisible(false);
				panelFuncionalidad.setVisible(true);
				//fun = 0;
				lblRes_FUN.setText("SATISFACTORIO");
				lblRes_FUN.setBackground(Color.GREEN);
			}
		});
		btnAtras_2A_.setBounds(128, 467, 100, 23);
		panelEficiencia.add(btnAtras_2A_);
		
		JButton btnSiguiente_2A_ = new JButton("Siguiente");
		btnSiguiente_2A_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if(grupoEfiA.isSelected(null) || grupoEfiB.isSelected(null)){
						JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
					}
					else {
				if(grupoEfiA.getSelection().getActionCommand() == "Mala") {
					//efi++;
					label_Res_EFI.setText("NO SATISFACTORIO");
					label_Res_EFI.setBackground(Color.RED);
				}
				if(grupoEfiB.getSelection().getActionCommand() == "Mala") {
					label_Res_EFI.setText("NO SATISFACTORIO");
					label_Res_EFI.setBackground(Color.RED);
					//efi++;
				}
				panelEficiencia.setVisible(false);
				panelFiabilidad.setVisible(true);
				//System.out.println("al final de la segunda funcionalidad =" + fun);
				//System.out.println("al final de la segunda eficiencia =" +efi);
			}}
		});
		btnSiguiente_2A_.setBounds(562, 467, 112, 23);
		panelEficiencia.add(btnSiguiente_2A_);
		
		JButton btnCancelar_2A = new JButton("Cancelar");
		btnCancelar_2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
					lblRes_FUN.setText("SATISFACTORIO");
					lblRes_FUN.setBackground(Color.GREEN);
					//fun = 0;
					panel_Inicio.setVisible(true);
					panelEficiencia.setVisible(false);}		
			}
		});
		btnCancelar_2A.setBounds(10, 467, 112, 23);
		panelEficiencia.add(btnCancelar_2A);
		
		JLabel lblNewLabel = new JLabel("<html><body>Se evaluar\u00E1 la eficiencia del producto software de acuerdo al porcentaje de uso de CPU.</body></html>\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 139, 332, 55);
		panelEficiencia.add(lblNewLabel);
		
		JLabel lblseEvaluarEl = new JLabel("<html><body>Se evaluar\u00E1 el tiempo que el producto software tarde en informarle al usuario el resultado de la operaci\u00F3n.</body></html>\r\n");
		lblseEvaluarEl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblseEvaluarEl.setBounds(342, 139, 332, 55);
		panelEficiencia.add(lblseEvaluarEl);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(330, 82, 2, 380);
		panelEficiencia.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(22, 82, 652, 1);
		panelEficiencia.add(separator_1);
				
		// FIABILIDAD
		// FIABILIDAD
		// FIABILIDAD
		// FIABILIDAD
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setBounds(10, 3, 664, 44);
		lblFiabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblFiabilidad.setBackground(Color.WHITE);
		panelFiabilidad.add(lblFiabilidad);
		
		JLabel labelDescFiaA = new JLabel("Tolerancia a fallos");
		labelDescFiaA.setBounds(10, 59, 332, 44);
		labelDescFiaA.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescFiaA.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panelFiabilidad.add(labelDescFiaA);
		
		JLabel labelDescFiaB = new JLabel("<html><body>Capacidad de recuperaci\u00F3n de errores</body></html>");
		labelDescFiaB.setBounds(342, 59, 332, 44);
		labelDescFiaB.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescFiaB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelFiabilidad.add(labelDescFiaB);
		
		JRadioButton radioExcelente_3A = new JRadioButton("Excelente");
		radioExcelente_3A.setToolTipText("Cumple con las 2  caracter\u00EDsticas.");
		radioExcelente_3A.setBounds(10, 191, 130, 44);
		panelFiabilidad.add(radioExcelente_3A);
		grupoFiaA.add(radioExcelente_3A);
		
		JRadioButton radioBuena_3A = new JRadioButton("Buena");
		radioBuena_3A.setToolTipText("se protegen los datos en su totalidad");
		radioBuena_3A.setBounds(10, 254, 130, 44);
		panelFiabilidad.add(radioBuena_3A);
		grupoFiaA.add(radioBuena_3A);
		
		JRadioButton radioRegular_3A = new JRadioButton("Regular");
		radioRegular_3A.setToolTipText("se protegen menos del 100% de los datos, pero no en su totalidad");
		radioRegular_3A.setBounds(10, 317, 130, 44);
		panelFiabilidad.add(radioRegular_3A);
		grupoFiaA.add(radioRegular_3A);
		
		JRadioButton radioMala_3A = new JRadioButton("Mala");
		radioMala_3A.setToolTipText("No cumple con alguna caracter\u00EDstica.");
		radioMala_3A.setBounds(10, 378, 130, 45);
		radioMala_3A.setActionCommand("Mala");
		panelFiabilidad.add(radioMala_3A);
		grupoFiaA.add(radioMala_3A);
		
		JRadioButton radioExcelente_3B = new JRadioButton("Excelente");
		radioExcelente_3B.setToolTipText("Reanuda sus actividades m\u00E1s de un 80%  y vuelve al estado en que estaba.");
		radioExcelente_3B.setBounds(342, 191, 130, 45);
		panelFiabilidad.add(radioExcelente_3B);
		grupoFiaB.add(radioExcelente_3B);
				
		JRadioButton radioBuena_3B = new JRadioButton("Buena");
		radioBuena_3B.setToolTipText("Reanuda sus actividades m\u00E1s de un 80% si se produce una falla cr\u00EDtica");
		radioBuena_3B.setBounds(342, 254, 130, 45);
		panelFiabilidad.add(radioBuena_3B);
		grupoFiaB.add(radioBuena_3B);
		
		JRadioButton radioMala_3B = new JRadioButton("Mala");
		radioMala_3B.setToolTipText("No reanuda las actividades.");
		radioMala_3B.setBounds(342, 378, 130, 44);
		radioMala_3B.setActionCommand("Mala");
		panelFiabilidad.add(radioMala_3B);
		grupoFiaB.add(radioMala_3B);
		
		JRadioButton radioRegular_3B = new JRadioButton("Regular");
		radioRegular_3B.setToolTipText("El sistema reanuda las actividades  80% o menos de la veces si se produce una falla cr\u00EDtica.");
		radioRegular_3B.setBounds(342, 317, 130, 44);
		panelFiabilidad.add(radioRegular_3B);
		grupoFiaB.add(radioRegular_3B);
		
		
		JButton btnAtras_3 = new JButton("Atras");
		btnAtras_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelFiabilidad.setVisible(false);
				panelEficiencia.setVisible(true);
				label_Res_EFI.setText("SATISFACTORIO");
				label_Res_EFI.setBackground(Color.GREEN);
				//efi = 0;
			}
		});
		btnAtras_3.setBounds(126, 467, 100, 23);
		panelFiabilidad.add(btnAtras_3);
		
		JButton btnSiguiente_3 = new JButton("Siguiente");
		btnSiguiente_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grupoFiaA.isSelected(null) || grupoFiaB.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoFiaA.getSelection().getActionCommand() == "Mala") {
				label_Res_FIA.setText("NO SATISFACTORIO");
				label_Res_FIA.setBackground(Color.red);

				//fia++;
			}
			if(grupoFiaB.getSelection().getActionCommand() == "Mala") {
				label_Res_FIA.setText("NO SATISFACTORIO");
				label_Res_FIA.setBackground(Color.red);
			}
			panelMantenibilidad.setVisible(true);
			panelFiabilidad.setVisible(false);
			/*System.out.println("al final de la tercera funcionalidad =" +fun);
			System.out.println("al final de la tercera eficiencia =" +efi);
			System.out.println("al final de la tercera fiabilidad =" + fia);*/
				
			}
			}});
		btnSiguiente_3.setBounds(562, 467, 112, 23);
		panelFiabilidad.add(btnSiguiente_3);
		
		JButton btnCancelar_3 = new JButton("Cancelar");
		btnCancelar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
					label_Res_EFI.setText("SATISFACTORIO");
					label_Res_EFI.setBackground(Color.GREEN);
					lblRes_FUN.setText("SATISFACTORIO");
					lblRes_FUN.setBackground(Color.GREEN);
					//fun = efi = 0;
					panel_Inicio.setVisible(true);
					panelFiabilidad.setVisible(false);}		
			}
		});
		btnCancelar_3.setBounds(10, 467, 112, 23);
		panelFiabilidad.add(btnCancelar_3);
		
		JLabel lblesLaCapacidad = new JLabel("<html><body>Es la capacidad del producto software de mantener la integridad de los datos cuando se producen fallas del sistema.<br>Caracter\u00EDsticas a medir:<br>\u2022 Cuando sucede un error se protegen los datos procesados.<br>\u2022 Se realiza un log de actividades que el sistema estaba haciendo.</body></html>\r\n");
		lblesLaCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblesLaCapacidad.setBounds(10, 99, 332, 85);
		panelFiabilidad.add(lblesLaCapacidad);
		
		JLabel lblesLaCapacidad_1 = new JLabel("<html><body>Es la capacidad del sistema de volver a sus actividades cuando se producen errores cr\u00EDticos.<br>Caracter\u00EDsticas a medir:<br>\u2022El sistema vuelve a sus actividades<br>\u2022 vuelve al estado en que estaba.</body></html>\r\n");
		lblesLaCapacidad_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblesLaCapacidad_1.setBounds(342, 99, 332, 85);
		panelFiabilidad.add(lblesLaCapacidad_1);
		
		//MANTENIBILIDAD
		//MANTENIBILIDAD
		//MANTENIBILIDAD
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenibilidad.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblMantenibilidad.setBackground(Color.WHITE);
		lblMantenibilidad.setBounds(10, 0, 664, 44);
		panelMantenibilidad.add(lblMantenibilidad);
		
		JLabel lblDescMantenibilidad_A = new JLabel("<html><body>Capacidad del c\u00F3digo de ser analizado</body></html>");
		lblDescMantenibilidad_A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescMantenibilidad_A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDescMantenibilidad_A.setBounds(10, 62, 332, 44);
		panelMantenibilidad.add(lblDescMantenibilidad_A);
		
		JLabel lblparaEvaluarLa = new JLabel("<html><body>Para evaluar la capacidad que tiene el c\u00F3digo para ser analizado se tiene en cuenta el porcentaje de comentarios que posee el c\u00F3digo por cada m\u00E9todo y en general.</body></html>\r\n");
		lblparaEvaluarLa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblparaEvaluarLa.setBounds(10, 106, 332, 60);
		panelMantenibilidad.add(lblparaEvaluarLa);
		
		JRadioButton radioExcelente_4A = new JRadioButton("Excelente");
		radioExcelente_4A.setToolTipText("m\u00E1s del 55% del c\u00F3digo comentado");
		radioExcelente_4A.setBounds(10, 172, 130, 44);
		panelMantenibilidad.add(radioExcelente_4A);
		grupoManA.add(radioExcelente_4A);
		
		JRadioButton radioBuena_4A = new JRadioButton("Buena");
		radioBuena_4A.setToolTipText("Entre de 30 y 55% del c\u00F3digo comentado");
		radioBuena_4A.setBounds(142, 172, 130, 44);
		panelMantenibilidad.add(radioBuena_4A);
		grupoManA.add(radioBuena_4A);
		
		JRadioButton radioRegular_4A = new JRadioButton("Regular");
		radioRegular_4A.setToolTipText("Entre 20 y 35% del c\u00F3digo comentado.");
		radioRegular_4A.setBounds(10, 219, 130, 44);
		panelMantenibilidad.add(radioRegular_4A);
		grupoManA.add(radioRegular_4A);
		
		JRadioButton radioMala_4A = new JRadioButton("Mala");
		radioMala_4A.setToolTipText("menos del 20% del c\u00F3digo comentado.");
		radioMala_4A.setActionCommand("Mala");
		radioMala_4A.setBounds(142, 219, 130, 45);
		panelMantenibilidad.add(radioMala_4A);
		grupoManA.add(radioMala_4A);
			
		JLabel lblDescMantenibilidad_B = new JLabel("<html><body>Capacidad del codigo para ser cambiado</body></html>");
		lblDescMantenibilidad_B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescMantenibilidad_B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescMantenibilidad_B.setBounds(342, 62, 332, 44);
		panelMantenibilidad.add(lblDescMantenibilidad_B);
		
		JLabel lblparaEvaluarLa_1 = new JLabel("<html><body>Para evaluar la capacidad que tiene el c\u00F3digo para ser cambiado se tomar\u00E1 en cuenta la complejidad ciclom\u00E1tica del m\u00E9todo.</body></html>\r\n");
		lblparaEvaluarLa_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblparaEvaluarLa_1.setBounds(342, 102, 332, 69);
		panelMantenibilidad.add(lblparaEvaluarLa_1);
		
		JRadioButton radioExcelente_4B = new JRadioButton("Excelente");
		radioExcelente_4B.setToolTipText("La complejidad ciclom\u00E1tica es menor o igual a 5.");
		radioExcelente_4B.setBounds(342, 172, 130, 45);
		panelMantenibilidad.add(radioExcelente_4B);
		grupoManB.add(radioExcelente_4B);
		
		JRadioButton radioBuena_4B = new JRadioButton("Buena");
		radioBuena_4B.setToolTipText("La complejidad ciclom\u00E1tica es entre 5 y 10.");
		radioBuena_4B.setBounds(474, 172, 130, 45);
		panelMantenibilidad.add(radioBuena_4B);
		grupoManB.add(radioBuena_4B);
		
		JRadioButton radioRegular_4B = new JRadioButton("Regular");
		radioRegular_4B.setToolTipText("La complejidad ciclom\u00E1tica es entre 11 y 20");
		radioRegular_4B.setBounds(342, 219, 130, 44);
		panelMantenibilidad.add(radioRegular_4B);
		grupoManB.add(radioRegular_4B);
		
		JRadioButton radioMala_4B = new JRadioButton("Mala");
		radioMala_4B.setToolTipText("La complejidad ciclom\u00E1tica es mayor o igual a 21.");
		radioMala_4B.setActionCommand("Mala");
		radioMala_4B.setBounds(474, 219, 130, 44);
		panelMantenibilidad.add(radioMala_4B);
		grupoManB.add(radioMala_4B);
				
		JLabel lblestabilidad = new JLabel("<html><body>Estabilidad</body></html>");
		lblestabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblestabilidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblestabilidad.setBounds(10, 269, 664, 44);
		panelMantenibilidad.add(lblestabilidad);
		
		JLabel lblparaDeterminarLa = new JLabel("<html><body>Para determinar la estabilidad del software se eval\u00FAa el promedio de fallas que presenta el producto por prueba.</body></html>\r\n");
		lblparaDeterminarLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblparaDeterminarLa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblparaDeterminarLa.setBounds(10, 324, 664, 53);
		panelMantenibilidad.add(lblparaDeterminarLa);
		
		JRadioButton radioExcelente_4C = new JRadioButton("Excelente");
		radioExcelente_4C.setToolTipText("El software presenta un promedio entre 0 y 2 errores por prueba.");
		radioExcelente_4C.setBounds(10, 379, 130, 45);
		panelMantenibilidad.add(radioExcelente_4C);
		grupoManC.add(radioExcelente_4C);
		
		JRadioButton radioBuena_4C = new JRadioButton("Buena");
		radioBuena_4C.setToolTipText("El software presenta un promedio entre 3 y 5 errores por prueba.");
		radioBuena_4C.setBounds(162, 379, 130, 45);
		panelMantenibilidad.add(radioBuena_4C);
		grupoManC.add(radioBuena_4C);
		
		JRadioButton radioMala_4C = new JRadioButton("Mala");
		radioMala_4C.setToolTipText("El software presenta un promedio 5 o m\u00E1s errores por prueba.");
		radioMala_4C.setActionCommand("Mala");
		radioMala_4C.setBounds(487, 379, 130, 44);
		panelMantenibilidad.add(radioMala_4C);
		grupoManC.add(radioMala_4C);
		
		JRadioButton radioRegular_4C = new JRadioButton("Regular");
		radioRegular_4C.setToolTipText("El software presenta un promedio entre 6 y 7 errores por prueba.");
		radioRegular_4C.setBounds(321, 379, 130, 44);
		panelMantenibilidad.add(radioRegular_4C);
		grupoManC.add(radioRegular_4C);
			
		JButton btnCancelar_4 = new JButton("Cancelar");
		btnCancelar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
					lblRes_FUN.setText("SATISFACTORIO");
					lblRes_FUN.setBackground(Color.GREEN);
					label_Res_FIA.setText("SATISFACTORIO");
					label_Res_FIA.setBackground(Color.GREEN);
					label_Res_EFI.setText("SATISFACTORIO");
					label_Res_EFI.setBackground(Color.GREEN);
					//fun = efi = fia = 0;
					panel_Inicio.setVisible(true);
					panelMantenibilidad.setVisible(false);}		
			}
		});
		btnCancelar_4.setBounds(10, 468, 112, 23);
		panelMantenibilidad.add(btnCancelar_4);
		
		JButton btnAtras_4 = new JButton("Atras");
		btnAtras_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelFiabilidad.setVisible(true);
				panelMantenibilidad.setVisible(false);
				label_Res_FIA.setText("SATISFACTORIO");
				label_Res_FIA.setBackground(Color.GREEN);
				//fia = 0;
			}
		});
		btnAtras_4.setBounds(126, 468, 100, 23);
		panelMantenibilidad.add(btnAtras_4);
		
		JButton BtnSiguiente_4 = new JButton("Siguiente");
		BtnSiguiente_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grupoManA.isSelected(null) || grupoManB.isSelected(null) || grupoManC.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoManA.getSelection().getActionCommand() == "Mala") {
				label_Res_MAN.setText("NO SATISFACTORIO");
				label_Res_MAN.setBackground(Color.red);
				//man++;
			}
			if(grupoManB.getSelection().getActionCommand() == "Mala") {
				label_Res_MAN.setText("NO SATISFACTORIO");
				label_Res_MAN.setBackground(Color.red);
				//man++;
			}
			if(grupoManC.getSelection().getActionCommand() == "Mala") {
				label_Res_MAN.setText("NO SATISFACTORIO");
				label_Res_MAN.setBackground(Color.red);
				//man++;
			}
			panelMantenibilidad.setVisible(false);
			panelUsabilidad.setVisible(true);
			}
			}
		});
		BtnSiguiente_4.setBounds(562, 468, 112, 23);
		panelMantenibilidad.add(BtnSiguiente_4);
		
		//USABILIDAD
		//USABILIDAD
		//USABILIDAD
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsabilidad.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblUsabilidad.setBackground(Color.WHITE);
		lblUsabilidad.setBounds(10, 0, 664, 44);
		panelUsabilidad.add(lblUsabilidad);
		
		JLabel lblDescUsab_A = new JLabel("<html><body>Capacidad de ser entendido</body></html>");
		lblDescUsab_A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_A.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDescUsab_A.setBounds(10, 55, 332, 44);
		panelUsabilidad.add(lblDescUsab_A);
		
		JLabel lblcapacidadQuePosee = new JLabel("<html><body>Capacidad que posee el software, para ayudar a los usuarios ante una determinada situaci\u00F3n donde se necesite asistencia.<br>Caracter\u00EDsticas a medir:<br>\u2022 Posee ayuda contextual sobre men\u00FAs y botones de acci\u00F3n.<br>\u2022 Manual de usuario incorporado al sistema como un men\u00FA dedicado.</body></html>\r\n");
		lblcapacidadQuePosee.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblcapacidadQuePosee.setBounds(10, 102, 332, 69);
		panelUsabilidad.add(lblcapacidadQuePosee);
		
		JRadioButton radioBuena_5A = new JRadioButton("Buena");
		radioBuena_5A.setToolTipText("Cumple con 2 caracter\u00EDsticas.");
		radioBuena_5A.setBounds(142, 172, 130, 44);
		panelUsabilidad.add(radioBuena_5A);
		grupoUsaA.add(radioBuena_5A);
		
		JRadioButton radioMala_5A = new JRadioButton("Mala");
		radioMala_5A.setToolTipText("No cumple con alguna caracter\u00EDstica.");
		radioMala_5A.setActionCommand("Mala");
		radioMala_5A.setBounds(142, 219, 130, 45);
		panelUsabilidad.add(radioMala_5A);
		grupoUsaA.add(radioMala_5A);
		
		JRadioButton radioRegular_5A = new JRadioButton("Regular");
		radioRegular_5A.setToolTipText(" Cumple con 1 caracter\u00EDstica.");
		radioRegular_5A.setBounds(10, 219, 130, 44);
		panelUsabilidad.add(radioRegular_5A);
		grupoUsaA.add(radioRegular_5A);
		
		JRadioButton radioExcelente_5A = new JRadioButton("Excelente");
		radioExcelente_5A.setToolTipText("posee ayudas complementarias aparte de las dos anteriores");
		radioExcelente_5A.setBounds(10, 172, 130, 44);
		panelUsabilidad.add(radioExcelente_5A);
		grupoUsaA.add(radioExcelente_5A);
		
		
		JRadioButton radioExcelente_5B = new JRadioButton("Excelente");
		radioExcelente_5B.setToolTipText("El usuario opera el producto software sin asistencia.");
		radioExcelente_5B.setBounds(342, 172, 130, 45);
		panelUsabilidad.add(radioExcelente_5B);
		grupoUsaB.add(radioExcelente_5B);
		
		JRadioButton radioRegular_5B = new JRadioButton("Regular");
		radioRegular_5B.setToolTipText("El usuario requiere ayuda contextual y manual de uso para operar el producto\r\nsoftware.\r\n");
		radioRegular_5B.setBounds(342, 219, 130, 44);
		panelUsabilidad.add(radioRegular_5B);
		grupoUsaB.add(radioRegular_5B);
		
		JRadioButton radioMala_5B = new JRadioButton("Mala");
		radioMala_5B.setToolTipText("El usuario requiere consultar a personal especializado para operar el producto software.");
		radioMala_5B.setActionCommand("Mala");
		radioMala_5B.setBounds(474, 219, 130, 44);
		panelUsabilidad.add(radioMala_5B);
		grupoUsaB.add(radioMala_5B);
		
		
		JRadioButton radioBuena_5B = new JRadioButton("Buena");
		radioBuena_5B.setToolTipText("El usuario requiere solo ayuda contextual para operar el producto\r\nsoftware.\r\n");
		radioBuena_5B.setBounds(474, 172, 130, 45);
		panelUsabilidad.add(radioBuena_5B);
		grupoUsaB.add(radioBuena_5B);
		
		JLabel lblesLaCapacidad_2 = new JLabel("<html><body>Es la Capacidad del producto software de ser utilizado sin asistencia adicional. Se val\u00FAa que requiere el usuario para operar correctamente el producto.</body></html>\r\n");
		lblesLaCapacidad_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblesLaCapacidad_2.setBounds(342, 102, 332, 69);
		panelUsabilidad.add(lblesLaCapacidad_2);
		
		JLabel lblDescUsab_B = new JLabel("<html><body>Capacidad para ser operado</body></html>");
		lblDescUsab_B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescUsab_B.setBounds(342, 62, 332, 44);
		panelUsabilidad.add(lblDescUsab_B);
		
		JLabel lblDescUsab_C = new JLabel("<html><body>Capacidad de ser atractivo para el usuario</body></html>");
		lblDescUsab_C.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescUsab_C.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescUsab_C.setBounds(10, 269, 664, 44);
		panelUsabilidad.add(lblDescUsab_C);
		
		JLabel lblesLaAgrupacin = new JLabel("<html><body>Es la agrupaci\u00F3n correcta de funcionalidad del producto software en su interfaz gr\u00E1fica, desde su agrupaci\u00F3n l\u00F3gica hasta el n\u00FAmero promedio de pasos para alcanzar una funci\u00F3n o contenido espec\u00EDfico.</body></html>\r\n");
		lblesLaAgrupacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblesLaAgrupacin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblesLaAgrupacin.setBounds(10, 324, 664, 53);
		panelUsabilidad.add(lblesLaAgrupacin);
		
		JRadioButton radioRegular_5C = new JRadioButton("Regular");
		radioRegular_5C.setToolTipText("Entre 6 y 8 pasos promedio y distribuidos en categor\u00EDas.");
		radioRegular_5C.setBounds(321, 379, 130, 44);
		panelUsabilidad.add(radioRegular_5C);
		grupoUsaC.add(radioRegular_5C);
		
		JRadioButton radioMala_5C = new JRadioButton("Mala");
		radioMala_5C.setToolTipText("m\u00E1s de 8 pasos promedio sin organizaci\u00F3n de categor\u00EDa.");
		radioMala_5C.setActionCommand("Mala");
		radioMala_5C.setBounds(487, 379, 130, 44);
		panelUsabilidad.add(radioMala_5C);
		grupoUsaC.add(radioMala_5C);
		
		JRadioButton radioBuena_5C = new JRadioButton("Buena");
		radioBuena_5C.setToolTipText("Entre 3 y 5 pasos promedio y distribuidos en categor\u00EDas.");
		radioBuena_5C.setBounds(162, 379, 130, 45);
		panelUsabilidad.add(radioBuena_5C);
		grupoUsaC.add(radioBuena_5C);
		
		JRadioButton radioExcelente_5C = new JRadioButton("Excelente");
		radioExcelente_5C.setToolTipText("1 o 2 pasos promedio y distribuidos en categor\u00EDas.");
		radioExcelente_5C.setBounds(10, 379, 130, 45);
		panelUsabilidad.add(radioExcelente_5C);
		grupoUsaC.add(radioExcelente_5C);
		
		JButton btn_Cancelar_5 = new JButton("Cancelar");
		btn_Cancelar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
					lblRes_FUN.setText("SATISFACTORIO");
					lblRes_FUN.setBackground(Color.GREEN);
					label_Res_FIA.setText("SATISFACTORIO");
					label_Res_FIA.setBackground(Color.GREEN);
					label_Res_EFI.setText("SATISFACTORIO");
					label_Res_EFI.setBackground(Color.GREEN);
					label_Res_MAN.setText("SATISFACTORIO");
					label_Res_MAN.setBackground(Color.GREEN);
					//fun = efi = fia = man =0;
					panel_Inicio.setVisible(true);
					panelUsabilidad.setVisible(false);}		
			}
		});
		btn_Cancelar_5.setBounds(10, 468, 112, 23);
		panelUsabilidad.add(btn_Cancelar_5);
		
		JButton btn_Atras_5 = new JButton("Atras");
		btn_Atras_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsabilidad.setVisible(false);
				panelMantenibilidad.setVisible(true);
				label_Res_MAN.setText("SATISFACTORIO");
				label_Res_MAN.setBackground(Color.GREEN);
				//man = 0;
			}
		});
		btn_Atras_5.setBounds(126, 468, 100, 23);
		panelUsabilidad.add(btn_Atras_5);
		
		JButton btn_Sigueinte_5 = new JButton("Siguiente");
		btn_Sigueinte_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grupoUsaA.isSelected(null) || grupoUsaB.isSelected(null) || grupoUsaC.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoUsaA.getSelection().getActionCommand() == "Mala") {
				label_Res_USA.setText("NO SATISFACTORIO");
				label_Res_USA.setBackground(Color.RED);
				//usa++;
			}
			if(grupoUsaB.getSelection().getActionCommand() == "Mala") {
				label_Res_USA.setText("NO SATISFACTORIO");
				label_Res_USA.setBackground(Color.RED);
				//usa++;
			}
			if(grupoUsaC.getSelection().getActionCommand() == "Mala") {
				label_Res_USA.setText("NO SATISFACTORIO");
				label_Res_USA.setBackground(Color.RED);
				//usa++;
			}
			panelPortabilidad.setVisible(true);
			panelUsabilidad.setVisible(false);
			}
			}
		});
		btn_Sigueinte_5.setBounds(562, 468, 112, 23);
		panelUsabilidad.add(btn_Sigueinte_5);
		
		//PORTABILIDAD
		//PORTABILIDAD
		//PORTABILIDAD
		
		JLabel labelPortabilidad = new JLabel("PORTABILIDAD");
		labelPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		labelPortabilidad.setFont(new Font("Tahoma", Font.PLAIN, 44));
		labelPortabilidad.setBackground(Color.WHITE);
		labelPortabilidad.setBounds(10, 0, 664, 44);
		panelPortabilidad.add(labelPortabilidad);
		
		JLabel lblDesc_6B = new JLabel("<html><body>Instalabilidad</body></html>");
		lblDesc_6B.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc_6B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDesc_6B.setBounds(342, 56, 332, 44);
		panelPortabilidad.add(lblDesc_6B);
		
		JLabel lblelProductoSoftware = new JLabel("<html><body>El producto software debe poder ser instalado en una cantidad m\u00EDnima de pasos.</body></html>\r\n");
		lblelProductoSoftware.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblelProductoSoftware.setBounds(342, 96, 332, 85);
		panelPortabilidad.add(lblelProductoSoftware);
		
		JLabel lblesLaCapacidad_3 = new JLabel("<html><body>Es la capacidad del producto software de adaptarse a diferentes sistemas operativos sin cambiar su estructura interna.</body></html>\r\n");
		lblesLaCapacidad_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblesLaCapacidad_3.setBounds(10, 96, 332, 85);
		panelPortabilidad.add(lblesLaCapacidad_3);
		
		JLabel lblDesc_6A = new JLabel("Adaptabilidad");
		lblDesc_6A.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc_6A.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDesc_6A.setBounds(10, 56, 332, 44);
		panelPortabilidad.add(lblDesc_6A);
		
		JRadioButton radioExcelente_6A = new JRadioButton("Excelente");
		radioExcelente_6A.setToolTipText("compatible con 4 o m\u00E1s sistemas operativos");
		radioExcelente_6A.setBounds(10, 188, 130, 44);
		panelPortabilidad.add(radioExcelente_6A);
		grupoPorA.add(radioExcelente_6A);
		
		JRadioButton radioBuena_6A = new JRadioButton("Buena");
		radioBuena_6A.setToolTipText("Compatible con 3 sistemas operativos.");
		radioBuena_6A.setBounds(10, 251, 130, 44);
		panelPortabilidad.add(radioBuena_6A);
		grupoPorA.add(radioBuena_6A);
		
		JRadioButton radioRegular_6A = new JRadioButton("Regular");
		radioRegular_6A.setToolTipText("Compatible con 2 sistemas operativos.");
		radioRegular_6A.setBounds(10, 314, 130, 44);
		panelPortabilidad.add(radioRegular_6A);
		grupoPorA.add(radioRegular_6A);
		
		JRadioButton radioMala_6A = new JRadioButton("Mala");
		radioMala_6A.setToolTipText("Compatible con 1 sistema operativo.");
		radioMala_6A.setActionCommand("Mala");
		radioMala_6A.setBounds(10, 375, 130, 45);
		panelPortabilidad.add(radioMala_6A);
		grupoPorA.add(radioMala_6A);
		
		JRadioButton radioMala_6B = new JRadioButton("Mala");
		radioMala_6B.setToolTipText("El producto se instala en m\u00E1s de 7 pasos.");
		radioMala_6B.setActionCommand("Mala");
		radioMala_6B.setBounds(342, 375, 130, 44);
		panelPortabilidad.add(radioMala_6B);
		grupoPorB.add(radioMala_6B);
		
		JRadioButton radioRegular_6B = new JRadioButton("Regular");
		radioRegular_6B.setToolTipText("El producto se instala entre 5 y 7 pasos.");
		radioRegular_6B.setBounds(342, 314, 130, 44);
		panelPortabilidad.add(radioRegular_6B);
		grupoPorB.add(radioRegular_6B);
		
		JRadioButton radioBuena_6B = new JRadioButton("Buena");
		radioBuena_6B.setToolTipText("El producto se instala entre 2 y 4 pasos.");
		radioBuena_6B.setBounds(342, 251, 130, 45);
		panelPortabilidad.add(radioBuena_6B);
		grupoPorB.add(radioBuena_6B);
		
		JRadioButton radioExcelente_6B = new JRadioButton("Excelente");
		radioExcelente_6B.setToolTipText("El producto se instala en menos de 2 pasos");
		radioExcelente_6B.setBounds(342, 188, 130, 45);
		panelPortabilidad.add(radioExcelente_6B);
		grupoPorB.add(radioExcelente_6B);
		
		JButton btn_Siguiente_6 = new JButton("Siguiente");
		btn_Siguiente_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(grupoPorA.isSelected(null) || grupoPorB.isSelected(null)){
					JOptionPane.showMessageDialog(panelFuncionalidad, "seleccion una opción");
				}
				else {
			if(grupoPorA.getSelection().getActionCommand() == "Mala") {
				label_Res_POR.setText(" NO SATISFACTORIO");
				label_Res_POR.setBackground(Color.RED);
				//por++;
			}
			if(grupoPorB.getSelection().getActionCommand() == "Mala") {
				label_Res_POR.setText("NO SATISFACTORIO");
				label_Res_POR.setBackground(Color.RED);
				//		por++;
			}
			panelPortabilidad.setVisible(false);
			panelResultado.setVisible(true);
			//System.out.println(fun);
			}
			}
		});
		btn_Siguiente_6.setBounds(562, 464, 112, 23);
		panelPortabilidad.add(btn_Siguiente_6);
		
		JButton btn_Cancelar_6 = new JButton("Cancelar");
		btn_Cancelar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = JOptionPane.showConfirmDialog(frame, "¿Seguro que desea abortar la operación?", "Cancelar", 2);
				if(msg == JOptionPane.YES_OPTION) {
					lblRes_FUN.setText("SATISFACTORIO");
					lblRes_FUN.setBackground(Color.GREEN);
					label_Res_FIA.setText("SATISFACTORIO");
					label_Res_FIA.setBackground(Color.GREEN);
					label_Res_EFI.setText("SATISFACTORIO");
					label_Res_EFI.setBackground(Color.GREEN);
					label_Res_MAN.setText("SATISFACTORIO");
					label_Res_MAN.setBackground(Color.GREEN);
					label_Res_USA.setText("SATISFACTORIO");
					label_Res_USA.setBackground(Color.GREEN);
					//fun = efi = fia = man = usa = 0;
					panel_Inicio.setVisible(true);
					panelUsabilidad.setVisible(false);}	
			}
		});
		btn_Cancelar_6.setBounds(10, 464, 112, 23);
		panelPortabilidad.add(btn_Cancelar_6);
		
		JButton btn_Atras_6 = new JButton("Atras");
		btn_Atras_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUsabilidad.setVisible(true);
				panelPortabilidad.setVisible(false);
				label_Res_USA.setText("SATISFACTORIO");
				label_Res_USA.setBackground(Color.GREEN);
				//usa = 0;
			}
		});
		btn_Atras_6.setBounds(126, 464, 100, 23);
		panelPortabilidad.add(btn_Atras_6);
		
		//RESULTADO
		//RESULTADO
		//RESULTADO
		
		//System.out.println("al final de todo FUNCIONALIDAD =" +fun);
		JLabel lblResultado = new JLabel("RESULTADO FINAL");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblResultado.setBackground(Color.WHITE);
		lblResultado.setBounds(10, 0, 664, 44);
		panelResultado.add(lblResultado);
		
		JLabel lblFuncionalidad_1 = new JLabel("FUNCIONALIDAD");
		lblFuncionalidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionalidad_1.setBackground(SystemColor.menu);
		lblFuncionalidad_1.setBounds(31, 73, 101, 70);
		panelResultado.add(lblFuncionalidad_1);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEficiencia.setBackground(SystemColor.menu);
		lblEficiencia.setBounds(31, 148, 101, 70);
		panelResultado.add(lblEficiencia);
		
		JLabel lblFiabilidad_1 = new JLabel("FIABILIDAD");
		lblFiabilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiabilidad_1.setBounds(31, 219, 101, 70);
		panelResultado.add(lblFiabilidad_1);
		
		JLabel lblMantenibilidad_1 = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMantenibilidad_1.setBounds(375, 73, 101, 70);
		panelResultado.add(lblMantenibilidad_1);
		
		JLabel lblUsabilidad_1 = new JLabel("USABILIDAD");
		lblUsabilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsabilidad_1.setBounds(375, 148, 101, 70);
		panelResultado.add(lblUsabilidad_1);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortabilidad.setBounds(375, 219, 101, 70);
		panelResultado.add(lblPortabilidad);
		
		
	}
}
