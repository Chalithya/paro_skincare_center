import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.List;

public class UiDoctorTable {
	
	public UiDoctorTable(List<Doctor> doctors) {

		// Create a new JTable Object
		JTable table = new JTable();

		// Create the DefaultTableModel
		DefaultTableModel model = new DefaultTableModel();

		// Set Column Titles to the Table Model
		model.setColumnIdentifiers(new Object[] { 
			"Name", 
			"Surname", 
			"Date of Birth", 
			"Mobile Number", 
			"Medical Licence No."  
		});

		// Set the Table Model data to the JTable
		table.setModel(model);

		// Disable table
		table.setEnabled(false);

		// Iterate through the array and add the data to the table model
		for (Doctor doc : doctors) {
			if (doc != null) {
				model.addRow(new Object[] { 
					doc.getName(), 
					doc.getSurname(),
					doc.getDateOfBirth(),
				 	doc.getMobileNumber(),
					doc.getMedicalLicenceNumber()
				});
			}
		}

		// Display the Table
		JFrame frame = new JFrame("Doctors List");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(new JScrollPane(table));
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null); 
		frame.pack();
		frame.setVisible(true);
	}

}
