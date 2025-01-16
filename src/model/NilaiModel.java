package model;

import classes.BaseModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class NilaiModel extends BaseModel<Nilai> {
    public NilaiModel() {
        super("nilai", Arrays.asList("id", "mahasiswa_id", "mata_kuliah", "semester", "nilai_tugas", "nilai_uts", "nilai_uas", "nilai_akhir", "grade"));
    }

    @Override
    protected boolean isNewRecord(Nilai nilai) {
        return nilai.getId() == 0;
    }

    @Override
    protected Nilai mapRow(ResultSet rs) throws SQLException {
        return new Nilai(
            rs.getInt("id"),
            rs.getString("mahasiswa_id"),
            rs.getString("mata_kuliah"),
            rs.getInt("semester"),
            rs.getFloat("nilai_tugas"),
            rs.getFloat("nilai_uts"),
            rs.getFloat("nilai_uas"),
            rs.getFloat("nilai_akhir"),
            rs.getString("grade")
        );
    }

    @Override
    protected Object[] getValues(Nilai nilai, boolean includeId) {
        if (includeId) {
            return new Object[]{
                nilai.getMahasiswaId(),
                nilai.getMataKuliah(),
                nilai.getSemester(),
                nilai.getNilaiTugas(),
                nilai.getNilaiUTS(),
                nilai.getNilaiUAS(),
                nilai.getNilaiAkhir(),
                nilai.getGrade(),
                nilai.getId()
            };
        } else {
            return new Object[]{
                nilai.getMahasiswaId(),
                nilai.getMataKuliah(),
                nilai.getSemester(),
                nilai.getNilaiTugas(),
                nilai.getNilaiUTS(),
                nilai.getNilaiUAS(),
                nilai.getNilaiAkhir(),
                nilai.getGrade()
            };
        }
    }
}
