package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FormNilai extends JFrame {
    public JTextField txtId, txtMahasiswaId, txtMataKuliah, txtSemester;
    public JTextField txtNilaiTugas, txtNilaiUTS, txtNilaiUAS, txtNilaiAkhir, txtGrade;
    public JButton btnSave, btnDelete, btnClear;
    public JTable tableNilai;
    public DefaultTableModel tableModel;

    public FormNilai() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Form Nilai Mahasiswa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(9, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtId = new JTextField();
        txtId.setEditable(false);

        txtMahasiswaId = new JTextField();
        txtMataKuliah = new JTextField();
        txtSemester = new JTextField();
        txtNilaiTugas = new JTextField();
        txtNilaiUTS = new JTextField();
        txtNilaiUAS = new JTextField();
        txtNilaiAkhir = new JTextField();
        txtNilaiAkhir.setEditable(false);

        txtGrade = new JTextField();
        txtGrade.setEditable(false);

        formPanel.add(new JLabel("ID:"));
        formPanel.add(txtId);
        formPanel.add(new JLabel("Mahasiswa ID:"));
        formPanel.add(txtMahasiswaId);
        formPanel.add(new JLabel("Mata Kuliah:"));
        formPanel.add(txtMataKuliah);
        formPanel.add(new JLabel("Semester:"));
        formPanel.add(txtSemester);
        formPanel.add(new JLabel("Nilai Tugas:"));
        formPanel.add(txtNilaiTugas);
        formPanel.add(new JLabel("Nilai UTS:"));
        formPanel.add(txtNilaiUTS);
        formPanel.add(new JLabel("Nilai UAS:"));
        formPanel.add(txtNilaiUAS);
        formPanel.add(new JLabel("Nilai Akhir:"));
        formPanel.add(txtNilaiAkhir);
        formPanel.add(new JLabel("Grade:"));
        formPanel.add(txtGrade);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        btnSave = new JButton("Save");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear");

        buttonPanel.add(btnSave);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnClear);

        // Table
        String[] columns = {"ID", "Mahasiswa ID", "Mata Kuliah", "Semester", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Nilai Akhir", "Grade"};
        tableModel = new DefaultTableModel(columns, 0);
        tableNilai = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableNilai);

        // Add components to frame
        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }
}