package controller;

import model.Nilai;
import model.NilaiModel;
import view.FormNilai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NilaiController {
    private FormNilai formNilai;
    private NilaiModel nilaiModel;

    public NilaiController(FormNilai formNilai) {
        this.formNilai = formNilai;
        this.nilaiModel = new NilaiModel();
        initController();
        loadData();
    }

    private void initController() {
        formNilai.btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveNilai();
            }
        });

        formNilai.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteNilai();
            }
        });

        formNilai.btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
    }

    private void saveNilai() {
        Nilai n = new Nilai();
        n.setId(formNilai.txtId.getText().isEmpty() ? 0 : Integer.parseInt(formNilai.txtId.getText()));
        n.setMahasiswaId(formNilai.txtMahasiswaId.getText());
        n.setMataKuliah(formNilai.txtMataKuliah.getText());
        n.setSemester(Integer.parseInt(formNilai.txtSemester.getText()));
        n.setNilaiTugas(Float.parseFloat(formNilai.txtNilaiTugas.getText()));
        n.setNilaiUTS(Float.parseFloat(formNilai.txtNilaiUTS.getText()));
        n.setNilaiUAS(Float.parseFloat(formNilai.txtNilaiUAS.getText()));

        float nilaiAkhir = (n.getNilaiTugas() + n.getNilaiUTS() + n.getNilaiUAS()) / 3;
        n.setNilaiAkhir(nilaiAkhir);
        n.setGrade(nilaiAkhir >= 80 ? "A" : nilaiAkhir >= 60 ? "B" : "C");

        if (nilaiModel.save(n)) {
            JOptionPane.showMessageDialog(formNilai, "Data berhasil disimpan!");
            loadData();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(formNilai, "Gagal menyimpan data!");
        }
    }

    private void deleteNilai() {
        int selectedRow = formNilai.tableNilai.getSelectedRow();
        if (selectedRow >= 0) {
            int id = Integer.parseInt(formNilai.tableModel.getValueAt(selectedRow, 0).toString());
            if (nilaiModel.delete(id)) {
                JOptionPane.showMessageDialog(formNilai, "Data berhasil dihapus!");
                loadData();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(formNilai, "Gagal menghapus data!");
            }
        } else {
            JOptionPane.showMessageDialog(formNilai, "Pilih data yang ingin dihapus.");
        }
    }

    private void clearForm() {
        formNilai.txtId.setText("");
        formNilai.txtMahasiswaId.setText("");
        formNilai.txtMataKuliah.setText("");
        formNilai.txtSemester.setText("");
        formNilai.txtNilaiTugas.setText("");
        formNilai.txtNilaiUTS.setText("");
        formNilai.txtNilaiUAS.setText("");
        formNilai.txtNilaiAkhir.setText("");
        formNilai.txtGrade.setText("");
    }

    private void loadData() {
        formNilai.tableModel.setRowCount(0); // Clear existing data in the table
        for (Nilai n : nilaiModel.find()) {
            formNilai.tableModel.addRow(new Object[]{
                    n.getId(),
                    n.getMahasiswaId(),
                    n.getMataKuliah(),
                    n.getSemester(),
                    n.getNilaiTugas(),
                    n.getNilaiUTS(),
                    n.getNilaiUAS(),
                    n.getNilaiAkhir(),
                    n.getGrade()
            });
        }
    }
}