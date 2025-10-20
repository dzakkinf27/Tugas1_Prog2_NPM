public class Mahasiswa {
   String nama;
   int NPM;
   String Jurusan;
   
   public void setNama(String namaMahasiswa){
       nama=namaMahasiswa;
   }
   public void setNPM(int NPMMahasiswa){
       NPM=NPMMahasiswa;
   }
   public void setJurusan(String JurusanMahasiswa){
       Jurusan=JurusanMahasiswa;
   }
   
   public void tampil(){
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama : " + nama);
        
        System.out.println("NPM : " + NPM);
        
        System.out.println("Jurusan : " + Jurusan);
    }
}