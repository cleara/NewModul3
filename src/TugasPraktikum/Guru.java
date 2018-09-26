package TugasPraktikum;


public class Guru {
    String nama;
    String matapelajaran;
    
    //konstruktor
    public Guru (String nama, String matapelajaran){
        this.nama = nama;
        this.matapelajaran = matapelajaran ;
        
    } 
        //Methode
        public void info()
        {
            System.out.println("Nama:"+this.nama);
            System.out.println("Mata Pelajaran:"+this.matapelajaran);
        }
}


    
    
   
    
    
    
