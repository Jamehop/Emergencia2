package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Dao.*;
import Copiao.*;

public class JavaSwing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwing window = new JavaSwing();
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
	public JavaSwing() {
		initialize();
		this.frame.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static DAO<Trabajador> trabjadorDao = new TrabajadorDAO();
	JavaSwing ventanaJavaSwing;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JRadioButton rdbtnNewRadioButton1 = new JRadioButton("Ambulancias");
		rdbtnNewRadioButton1.setBounds(20, 27, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton1);

		JRadioButton rdbtnNewRadioButton2 = new JRadioButton("Policias");
		rdbtnNewRadioButton2.setBounds(141, 27, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton2);

		JRadioButton rdbtnNewRadioButton3 = new JRadioButton("Bomberos");
		rdbtnNewRadioButton3.setBounds(287, 27, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton3);

		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(rdbtnNewRadioButton1);
		grupoBotones.add(rdbtnNewRadioButton2);
		grupoBotones.add(rdbtnNewRadioButton3);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(123, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(123, 139, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(203, 98, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(203, 136, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton1.isSelected()) {
					int id = Integer.parseInt(textField.getText());
					int contador = 0;
					for (int x = 0; x < ventanaJavaSwing.trabjadorDao.getAll().size(); x++) {
						if (id == ventanaJavaSwing.trabjadorDao.getAll().get(x).getId_trabajador()) {
							System.out.println("Trabajador de ambulancia borrado");
							ventanaJavaSwing.trabjadorDao.delete(ventanaJavaSwing.trabjadorDao.getAll().get(x));
							contador++;
						}
					}
					if (contador == 0) {
						System.out.println("ERROR: Trabajador de baja o no encontrado");
					}

					if (rdbtnNewRadioButton2.isSelected()) {
						System.out.println("Policias de baja");
					}
					if (rdbtnNewRadioButton3.isSelected()) {
						System.out.println("Bomberos de baja");
					}
				}
			}
		});
		btnNewButton.setBounds(159, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
