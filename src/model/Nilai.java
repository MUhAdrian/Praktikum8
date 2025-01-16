package model;

public class Nilai {
    private int id;
    private String mahasiswaId;
    private String mataKuliah;
    private int semester;
    private float nilaiTugas;
    private float nilaiUTS;
    private float nilaiUAS;
    private float nilaiAkhir;
    private String grade;

    // Constructor
    public Nilai() {}

    public Nilai(int id, String mahasiswaId, String mataKuliah, int semester, float nilaiTugas, float nilaiUTS, float nilaiUAS, float nilaiAkhir, String grade) {
        this.id = id;
        this.mahasiswaId = mahasiswaId;
        this.mataKuliah = mataKuliah;
        this.semester = semester;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = nilaiAkhir;
        this.grade = grade;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMahasiswaId() {
        return mahasiswaId;
    }

    public void setMahasiswaId(String mahasiswaId) {
        this.mahasiswaId = mahasiswaId;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(float nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public float getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(float nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public float getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(float nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public float getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(float nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}