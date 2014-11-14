package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private RegisterCandidates registerCandidates;
	private Dimension dim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Bag jobs M^3");
		 Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/business/Bolsa_de_trabajo.jpg"));
	        setIconImage(icon);
	 setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);

		JMenu mnRegister = new JMenu("Register");
		menuBar.add(mnRegister);

		JMenuItem mntmNewCandidate = new JMenuItem("New candidate");
		mntmNewCandidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registerCandidates = new RegisterCandidates();
				registerCandidates.setVisible(true);
			}
		});
		mnRegister.add(mntmNewCandidate);

		JMenuItem mntmNewEmployee = new JMenuItem("New employee");
		mnRegister.add(mntmNewEmployee);

		JMenuItem mntmNewRequest = new JMenuItem("New request");
		mnRegister.add(mntmNewRequest);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		JMenuItem mntmRequests = new JMenuItem("Requests");
		mnView.add(mntmRequests);

		JMenuItem mntmCandidates = new JMenuItem("Candidates");
		mnView.add(mntmCandidates);

		JMenuItem mntmEmployees = new JMenuItem("Employees");
		mnView.add(mntmEmployees);
	}
}
