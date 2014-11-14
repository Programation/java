package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.ScrollPane;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JInternalFrame;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;

import business.Person;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class RegisterCandidates extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// private Dimension dim;
	private JTable table;
	private DefaultTableModel tableModel;
	private Object[] fila;
	private int filasel, pos1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JPanel panel;
	private JComboBox comboBox_1;
	private ArrayList<Person> persons;

	public RegisterCandidates() {
		setBounds(7, 55, 1290, 600);
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		// dim = super.,getToolkit().getScreenSize();
		// super.setSize(dim);
		// setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setVerticalAlignment(SwingConstants.BOTTOM);
		lblId.setBounds(10, 11, 68, 14);
		contentPanel.add(lblId);

		textField = new JTextField();
		textField.setBounds(106, 8, 124, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JLabel lblName = new JLabel("Name:");
			lblName.setHorizontalAlignment(SwingConstants.TRAILING);
			lblName.setVerticalAlignment(SwingConstants.BOTTOM);
			lblName.setBounds(10, 73, 68, 14);
			contentPanel.add(lblName);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(106, 70, 124, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblLastName = new JLabel("Last name:");
			lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
			lblLastName.setVerticalAlignment(SwingConstants.BOTTOM);
			lblLastName.setBounds(10, 104, 68, 14);
			contentPanel.add(lblLastName);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(106, 101, 124, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblPersonalData = new JLabel("Personal data:");
			lblPersonalData.setBounds(20, 36, 220, 14);
			contentPanel.add(lblPersonalData);
		}
		{
			JLabel lblBornDate = new JLabel("Born date:");
			lblBornDate.setHorizontalAlignment(SwingConstants.TRAILING);
			lblBornDate.setBounds(10, 132, 68, 20);
			contentPanel.add(lblBornDate);
		}
		{
			JLabel lblNacionality = new JLabel("Nacionality:");
			lblNacionality.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNacionality.setBounds(10, 163, 68, 20);
			contentPanel.add(lblNacionality);
		}
		{
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Afghan", "American", "Argentinian",
					"Australian", "Austrian", "Belgian", "Bolivian",
					"Brazilian", "British", "Bulgarian", "Canadian", "Chilean",
					"Chinese", "Colombian", "Costa Rican", "Cuban", "Czech",
					"Danish", "Dominican", "Dutch", "Ecuadorean", "Egyptian",
					"English", "Filipino ", "Finnish ", "French ", "German ",
					"Greek ", "Greenlander ", "Guatemalan ", "Haitian ",
					"Hawaiian ", "Honduran ", "Hungarian ", "Icelandic ",
					"Indian ", "Indonesian ", "Iranian ", "Iraqui ", "Irish ",
					"Israeli ", "Italian ", "Jamaican ", "Japanese ",
					"korean ", "Lebanese ", "Malaysian ", "Maltese ",
					"Mexican ", "Moroccan ", "Nepalese ", "New Zealander ",
					"Nicaraguan ", "Nigerian ", "Norwegian ", "Pakistani ",
					"Palestinian ", "Panamanian", "Paraguayan ", "Peruvian ",
					"Polish ", "Portuguese ", "Puerto Rican ", "Rumanian ",
					"Russian ", "Saudi Arabian ", "Scottish ", "Singaporean ",
					"Spanish ", "Swedish ", "Swiss ", "Syrian ", "Tahitian ",
					"Thai ", "Tunisian ", "Turkish ", "Ukrainian ",
					"Uruguayan ", "Venezuelan ", "Vietnamese ", "Welsh ",
					"Yugoslavian " }));
			comboBox_1.setBounds(106, 163, 124, 20);
			contentPanel.add(comboBox_1);
		}
		{
			JLabel lblSex = new JLabel("Sex:");
			lblSex.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSex.setBounds(10, 191, 68, 20);
			contentPanel.add(lblSex);
		}
		{
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Female", "Male" }));
			comboBox_1.setBounds(106, 191, 124, 20);
			contentPanel.add(comboBox_1);
		}
		{
			JLabel lblCivilState = new JLabel("Civil state:");
			lblCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCivilState.setBounds(10, 222, 68, 20);
			contentPanel.add(lblCivilState);
		}
		{
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Single", "Married", "Dirvorced", "Widowed",
					"Engaged", "Other" }));
			comboBox_1.setBounds(106, 222, 124, 20);
			contentPanel.add(comboBox_1);
		}

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "#", "ID", "Name", "Last name", "Born date",
				"Nacionality", "Sex", "Civil state" };
		tableModel.setColumnIdentifiers(columnNames);
		loadCandidate();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1343, 267, -1331, 428);
		contentPanel.add(scrollPane);
		{
			JSeparator separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(319, 63, 2, 210);
			contentPanel.add(separator);
		}
		{
			JLabel lblContact = new JLabel("Contact:");
			lblContact.setBounds(329, 39, 182, 14);
			contentPanel.add(lblContact);
		}
		{
			JLabel lblEmail = new JLabel("E-mail:");
			lblEmail.setVerticalAlignment(SwingConstants.BOTTOM);
			lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
			lblEmail.setBounds(329, 104, 68, 14);
			contentPanel.add(lblEmail);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(427, 101, 130, 20);
			contentPanel.add(textField_3);
		}
		{
			JLabel lblCellphone = new JLabel("Cell-phone:");
			lblCellphone.setVerticalAlignment(SwingConstants.BOTTOM);
			lblCellphone.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCellphone.setBounds(331, 135, 68, 14);
			contentPanel.add(lblCellphone);
		}
		{
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(427, 132, 130, 20);
			contentPanel.add(textField_4);
		}
		{
			JLabel lblTelephone = new JLabel("Telephone:");
			lblTelephone.setVerticalAlignment(SwingConstants.BOTTOM);
			lblTelephone.setHorizontalAlignment(SwingConstants.TRAILING);
			lblTelephone.setBounds(578, 101, 88, 14);
			contentPanel.add(lblTelephone);
		}
		{
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(676, 98, 130, 20);
			contentPanel.add(textField_5);
		}
		{
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(676, 129, 130, 20);
			contentPanel.add(textField_6);
		}
		{
			JLabel lblPostalCode = new JLabel("Postal code:");
			lblPostalCode.setVerticalAlignment(SwingConstants.BOTTOM);
			lblPostalCode.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPostalCode.setBounds(580, 132, 86, 14);
			contentPanel.add(lblPostalCode);
		}
		{
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(427, 222, 130, 20);
			contentPanel.add(textField_7);
		}
		{
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(427, 191, 130, 20);
			contentPanel.add(textField_8);
		}
		{
			JLabel label = new JLabel("Number:");
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(329, 225, 68, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Street:");
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(329, 194, 68, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Address:");
			label.setVerticalAlignment(SwingConstants.BOTTOM);
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(329, 156, 68, 14);
			contentPanel.add(label);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBounds(329, 181, 477, 2);
			contentPanel.add(separator);
		}
		{
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(676, 216, 130, 20);
			contentPanel.add(textField_9);
		}
		{
			JLabel lblCity = new JLabel("City:");
			lblCity.setVerticalAlignment(SwingConstants.BOTTOM);
			lblCity.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCity.setBounds(578, 222, 88, 14);
			contentPanel.add(lblCity);
		}
		{
			JLabel lblSector = new JLabel("Sector:");
			lblSector.setVerticalAlignment(SwingConstants.BOTTOM);
			lblSector.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSector.setBounds(578, 191, 88, 14);
			contentPanel.add(lblSector);
		}
		{
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(676, 185, 130, 20);
			contentPanel.add(textField_10);
		}
		{
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(676, 250, 130, 20);
			contentPanel.add(textField_11);
		}
		{
			JLabel lblRegion = new JLabel("Region:");
			lblRegion.setVerticalAlignment(SwingConstants.BOTTOM);
			lblRegion.setHorizontalAlignment(SwingConstants.TRAILING);
			lblRegion.setBounds(580, 253, 86, 14);
			contentPanel.add(lblRegion);
		}
		{
			JLabel lblCountry = new JLabel("Country:");
			lblCountry.setVerticalAlignment(SwingConstants.BOTTOM);
			lblCountry.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCountry.setBounds(329, 256, 68, 14);
			contentPanel.add(lblCountry);
		}
		{
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Afghanistan ", "Albania ", "Algeria ",
					"American Samoa ", "Andorra ", "Angola", "Anguilla ",
					"Antarctica ", "Antigua and Barbuda ", "Argentina ",
					"Armenia ", "Aruba ", "Australia ", "Austria ",
					"Azerbaijan  ", "Bahamas ", "Bahrain ", "Bangladesh ",
					"Barbados ", "Belarus ", "Belgium ", "Belize ", "Benin ",
					"Bermuda ", "Bhutan", "Bolivia ",
					"Bosnia and Herzegovina ", "Botswana ", "Brazil ",
					"Brunei Darussalam", "Bulgaria ", "Burkina Faso ",
					"Burundi ", "Cambodia ", "Cameroon ", "Canada ",
					"Cape Verde ", "Cayman Islands ",
					"Central African Republic ", "Chad ", "Chile ", "China ",
					"Christmas Island ", "Cocos (Keeling) Islands ",
					"Colombia ", "Comoros ",
					"Democratic Republic of the Congo (Kinshasa) ",
					"Congo, Republic of (Brazzaville) ", "Cook Islands ",
					"Costa Rica ", "Ivory Coast (Cote d'Ivoire) ", "Croatia ",
					"Cuba ", "Cyprus ", "Czech Republic ", "Denmark ",
					"Djibouti ", "Dominica ", "Dominican Republic ",
					"East Timor Timor-Leste ", "Ecuador ", "Egypt ",
					"El Salvador ", "Equatorial Guinea ", "Eritrea ",
					"Estonia ", "Ethiopia ", "Falkland Islands ",
					"Faroe Islands ", "Fiji ", "Finland ", "France ",
					"French Guiana ", "French Polynesia ",
					"French Southern Territories ", "Gabon ", "Gambia ",
					"Georgia ", "Germany ", "Ghana ", "Gibraltar ",
					"Great Britain ", "Greece ", "Greenland ", "Grenada ",
					"Guadeloupe ", "Guam ", "Guatemala ", "Guinea ",
					"Guinea-Bissau ", "Guyana ", "Haiti ", "Holy See ",
					"Honduras ", "Hong Kong ", "Hungary ", "Iceland ",
					"India ", "Indonesia ", "Iran (Islamic Republic of) ",
					"Iraq", "Ireland ", "Israel ", "Italy ", "Jamaica ",
					"Japan ", "Jordan ", "Kazakhstan ", "Kenya ", "Kiribati",
					"Korea, Democratic People's Rep. (North Korea)",
					"Korea, Republic of (South Korea)", "Kosovo", "Kuwait ",
					"Kyrgyzstan", "Lao, People's Democratic Republic",
					"Latvia", "Lebanon", "Lesotho", "Liberia", "Libya",
					"Liechtenstein", "Lithuania", "Luxembourg", "Macao",
					"Macedonia, Rep. of", "Madagascar", "Malawi", "Malaysia",
					"Maldives", "Mali", "Malta", "Marshall Islands",
					"Martinique", "Mauritania", "Mauritius", "Mayotte",
					"Mexico", "Micronesia, Federal States of",
					"Moldova, Republic of", "Monaco", "Mongolia", "Montenegro",
					"Montserrat", "Morocco", "Mozambique", "Myanmar, Burma",
					"Namibia", "Nauru ", "Nepal", "Netherlands",
					"Netherlands Antilles", "New Caledonia", "New Zealand",
					"Nicaragua", "Niger", "Nigeria", "Niue",
					"Northern Mariana Islands", "Norway", "Oman", "Pakistan",
					"Palau", "Palestinian territories", "Panama",
					"Papua New Guinea", "Paraguay", "Peru", "Philippines",
					"Pitcairn Island", "Poland", "Portugal", "Puerto Rico",
					"Qatar", "Reunion Island", "Romania", "Russian Federation",
					"Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
					"Saint Vincent and the Grenadines", "Samoa", "San Marino",
					"Saint Tome and Principe ", "Saudi Arabia", "Senegal",
					"Serbia", "Seychelles", "Sierra Leone", "Singapore",
					"Slovakia (Slovak Republic)", "Slovenia",
					"Solomon Islands", "Somalia", "South Africa",
					"South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname",
					"Swaziland", "Sweden", "Switzerland", "Syria",
					"Taiwan (Republic of China)", "Tajikistan", "Tanzania",
					"Thailand", "Tibet", "Timor-Leste (East Timor)", "Togo",
					"Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia",
					"Turkey ", "Turkmenistan", "Turks and Caicos Islands",
					"Tuvalu", "Uganda", "Ukraine", "United Arab Emirates",
					"United Kingdom", "United States", "Uruguay", "Uzbekistan",
					"Vanuatu", "Vatican City State (Holy See)", "Venezuela",
					"Vietnam", "Virgin Islands (British)",
					"Virgin Islands (U.S.)", "Wallis and Futuna Islands",
					"Western Sahara", "Yemen", "Zambia", "Zimbabwe" }));
			comboBox_1.setBounds(427, 253, 130, 20);
			contentPanel.add(comboBox_1);
		}

		JSeparator separator = new JSeparator();
		separator.setBounds(319, 273, 499, 1);
		contentPanel.add(separator);

		JLabel lblSyudyLevel = new JLabel("Study level:");
		lblSyudyLevel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSyudyLevel.setBounds(10, 253, 82, 14);
		contentPanel.add(lblSyudyLevel);

		panel = new JPanel();
		panel.setBounds(381, 284, 349, 231);
		contentPanel.add(panel);
		panel.setVisible(false);
		panel.setLayout(null);
		{
			JLabel lblPu = new JLabel("Grade:");
			lblPu.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPu.setBounds(10, 5, 107, 14);
			panel.add(lblPu);
		}

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"<Select>",
								"Business adm. mention operations",
								"Business adm. mention finance",
								"Business adm. mention strategy",
								"Business adm. mention creation and development of new business",
								"Business adm. mention human gestion",
								"Business adm. mention international business",
								"Hotel management mention food and drink",
								"Hotel management mention hotel marketing",
								"Architecture",
								"Social communication mention audiovisual production",
								"Social communication mention corporate communication",
								"Law",
								"Design and interior",
								"Ecology and environmental management",
								"Economy",
								"Education",
								"Nursing",
								"Stomatology",
								"Phylosophy",
								"Financial management and auditing",
								"Civil Engineering",
								"Electromechanical Engineering mention mechanical",
								"Electronechanical Engineerin mention electric",
								"Industrial Engineering",
								"System and computer Engineering",
								"Electronic Engineering",
								"Telematic Engineering", "Medicine",
								"Marketing", "Nutrition and dietetics",
								"Psychology", "Physical therapy" }));
		comboBox_2.setBounds(127, 5, 219, 20);
		panel.add(comboBox_2);

		JLabel lblPostgrade = new JLabel("Post-grade:");
		lblPostgrade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPostgrade.setBounds(10, 30, 107, 14);
		panel.add(lblPostgrade);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"<Select>",
								"Executive Master in Strategic Human Resources",
								"Master of Strategic Management",
								"MBA in Insurance Programs",
								"LLM in Economic Regulation",
								"Master of Labour Law and Social Security",
								"MSc in Real Estate",
								"Master of Intellectual Property and New Technologies",
								"Master of Law in Corporate Business",
								"Master of International Relations",
								"Master of Public Policy",
								"Master of Business Economics",
								"Executive Master in Supply Chain Management",
								"Architectural Design Master of Interior Architecture Concentration",
								"Architectural Design Master of Architecture mention Tourist Accommodation",
								"Specialization in Applied Mathematics in Education",
								"Specialization in Mathematics Education Basic Level" }));
		comboBox_3.setBounds(127, 30, 219, 20);
		panel.add(comboBox_3);
		{
			JLabel lblCertified = new JLabel("Certified:");
			lblCertified.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCertified.setBounds(10, 58, 107, 14);
			panel.add(lblCertified);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Human resource management",
									"Surveying and Geomatics for real estate development",
									"Atmosphere of premises: Creating and composing styles environments",
									"Basic Statistical Analysis",
									"Culinary arts",
									"Financial audit",
									"Library and information science",
									"Chocolate and confectionery",
									"Configuring and Deploying Windows Server 2008",
									"Financial accounting",
									"Address and business management",
									"Design and development of business models",
									"Strategic Finance:",
									"Optimization of resources and investment projection",
									"Administrative management for executive assistants",
									"Risk management of information security",
									"Strategic management of family businesses",
									"Integrated project management (DIGIP) in real estate and construction in DR",
									"Management and strategic direction of human capital",
									"Corporate Taxes: New Trends and tax regulations",
									"Corporate Intelligence",
									"Intermediate English",
									"Measurement, redesign and process improvements",
									"Supply chain management",
									"Techniques of computer assisted audit (TAAC'S)" }));
			comboBox_4.setBounds(127, 58, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblSpecializedCourses = new JLabel(
					"Specialized \r\ncourses:");
			lblSpecializedCourses
					.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSpecializedCourses.setBounds(10, 83, 107, 22);
			panel.add(lblSpecializedCourses);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Knowing the stock market DR",
									"Cost control for food and beverage operations",
									"IT network essential",
									"Effective management of social networks",
									"Sales Forecast",
									"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
			comboBox_4.setBounds(127, 85, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblTechnicalCollege = new JLabel("Technical college:");
			lblTechnicalCollege.setHorizontalAlignment(SwingConstants.TRAILING);
			lblTechnicalCollege.setBounds(10, 108, 107, 22);
			panel.add(lblTechnicalCollege);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(new String[] {
							"<Select>", "Small and medium enterprises",
							"Advertising", "Market aspects", "Graphic design",
							"Programming information systems",
							"Computerized accounting",
							"Financial and tax accounting" }));
			comboBox_4.setBounds(127, 110, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblDoctorate = new JLabel("Doctorate:");
			lblDoctorate.setHorizontalAlignment(SwingConstants.TRAILING);
			lblDoctorate.setBounds(10, 136, 107, 22);
			panel.add(lblDoctorate);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Constitutional Law and Fundamental Rights",
									"Democratic Society, State and Law",
									"Education (and/or in leadership or in pedagogical sciencies)",
									"Business studies",
									"Cooperation and Social Intervention",
									"Educational Psychology and Human Development",
									"Economy", "Sociology",
									"Philosophy for a Global World" }));
			comboBox_4.setBounds(127, 138, 219, 20);
			panel.add(comboBox_4);
		}

		JLabel lblJob = new JLabel("Job:");
		lblJob.setHorizontalAlignment(SwingConstants.TRAILING);
		lblJob.setBounds(10, 162, 107, 22);
		panel.add(lblJob);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "<Select>",
				"Accountant", "Actor / Actress", "Air hostess",
				"Archaeologist", "Astronaut", "Baker", "Biologist",
				"Bricklayer", "Bus driver", "Businessman", "Businesswoman",
				"Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner",
				"Clown", "Cobbler", "Consultant", "Cook", "Counselor", "Chef",
				"Chemist", "Dancer", "Decorator", "Dentist", "Designer",
				"Dressmaker", "Dustman", "Economist", "Electrician", "Farmer",
				"Fireman", "FIsherman", "Florist", "Fruiterer",
				"Garbage collector", "Gardener", "Hairdresser", "Housewife",
				"Hunter", "Jeweller", "Judge", "Lawyer", "Librarian",
				"Life guard", "Lorry driver", "Mailman", "Mechanic",
				"Meteorologist", "Miner", "Model", "Monk", "Nanny", "Nun",
				"Nurse", "Nursemaid", "Office worker", "Painter",
				"Pastry cook", "Pharmacist", "Photographer", "Physicist",
				"Plumber", "Policeman / Policewoman", "Politician", "Porter",
				"Postman", "Priest", "Professor", "Programmer", "Psychiatrist",
				"Psychologist", "Receptionist", "Researcher", "Sailor",
				"Salesman", "Scientist", "Secretary", "Secretary", "Shoemaker",
				"Shop assistant", " Singer", "Social worker", "Surgeon",
				"Taxi driver", "Teacher", "Telephone operator", "Travel agent",
				"Truck driver", "Vet", "Veterinarian", "Waiter", "Waitress",
				"Window cleaner", "Writer" }));
		comboBox_4.setBounds(127, 164, 219, 20);
		panel.add(comboBox_4);

		{

			comboBox_1 = new JComboBox();
			comboBox_1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					if (comboBox_1.getSelectedItem() == "Universitary")
						panel.setVisible(true);
					else
						panel.setVisible(false);
				}
			});
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Universitary", "Technical", "Other" }));
			comboBox_1.setBounds(100, 253, 130, 20);
			contentPanel.add(comboBox_1);
			{
				JSeparator separator_1 = new JSeparator();
				separator_1.setOrientation(SwingConstants.VERTICAL);
				separator_1.setBounds(816, 63, 2, 210);
				contentPanel.add(separator_1);
			}

			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerDateModel(new Date(-946756800000L),
					new Date(-946756800000L), new Date(915163200000L),
					Calendar.DAY_OF_YEAR));
			spinner.setBounds(106, 132, 124, 20);
			contentPanel.add(spinner);

			JPanel panel_1 = new JPanel();
			panel_1.setBounds(25, 284, 346, 230);
			contentPanel.add(panel_1);

			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				{
					JButton btnDelete = new JButton("Delete");
					buttonPane.add(btnDelete);
				}
				{
					JButton btnUpdate = new JButton("Update");
					buttonPane.add(btnUpdate);
				}

				JButton btnRegister = new JButton("Register");
				buttonPane.add(btnRegister);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void loadCandidate() {
		// TODO Auto-generated method stub
		// Equipo[] equipos1;
		// equipos1 = new Equipo[12];
		// equipos1 = Delegacy1.getEquipos();
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
		// for (int i = 0, j = 1; i < Delegacy1.getCant(); i++, j++) {

		// fila[0] = j;
		// fila[1] = equipos1[i].getNombre();
		// fila[2] = equipos1[i].isIndividual();
		// fila[3] = equipos1[i].getCanthombres();
		// fila[4] = equipos1[i].getCantmujeres();
		// fila[5] = equipos1[i].getCantmedoro();
		// fila[6] = equipos1[i].getCantmedplata();
		// fila[7] = equipos1[i].getCantmedbronce();
		// tableModel.addRow(fila);
		// }

		table.setModel(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(150);
		columnModel.getColumn(2).setPreferredWidth(150);
		columnModel.getColumn(3).setPreferredWidth(150);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(150);
		columnModel.getColumn(6).setPreferredWidth(150);
		columnModel.getColumn(7).setPreferredWidth(150);
	}
}
