
package TugasPraktikum;


public class MataPelajaran extends Guru{
    
    private int noGuru;
    
    //konstruktor
    public MataPelajaran(String nama, String matapelajaran )
    {
        super(nama,matapelajaran);
        this.noGuru = noGuru;
    }

  
    //metode
    public void info (){
        System.out.println("No Guru : "+this.noGuru);
        super.info();
    }
}

