package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class FormMahasiswa extends JFrame{
    private JPanel formPanel, buttonPanel, tablePanel;
    public JTextField txtNim, txtNama, txtJurusan, txtAngkatan;
    public JButton btnSave, btnUpdate, btnDelete;
    public JTable tblMahasiswa;

    public FormMahasiswa() {
        setTitle("CRUD Data Mahasiswa");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("Nim"));
        txtNim = new JTextField(40);
        formPanel.add(txtNim);
        formPanel.add(new JLabel("Nama"));
        txtNama = new JTextField(40);
        formPanel.add(txtNama);
        formPanel.add(new JLabel("Jurusan"));
        txtJurusan = new JTextField(40);
        formPanel.add(txtJurusan);
        formPanel.add(new JLabel("Angkatan"));
        txtAngkatan = new JTextField(40);
        formPanel.add(txtAngkatan);

        btnSave = new JButton("Save");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(btnSave);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        tblMahasiswa = new JTable();
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID",
        "Nim", "Nama", "Jurusan", "Angkatan"}, 0 );
        tblMahasiswa.setModel(model);
        
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(new JScrollPane(tblMahasiswa), BorderLayout.CENTER);
    }

}
