package main; 


import controller.MahasiswaController; 
import view.FormMahasiswa; 

public class Main {
    public static void main(String[] args) {
      
        FormMahasiswa formMahasiswa = new FormMahasiswa();
        
       
        MahasiswaController controller = new MahasiswaController(formMahasiswa);
        
      
        formMahasiswa.setVisible(true);
    }
}