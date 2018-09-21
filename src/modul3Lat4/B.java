package modul3Lat4;

public class B extends A {
    private int b;
    public void setB(int nilai)
    {
        b= nilai;
        
    }

    public int getB() {
        return b;
    }
    
    //melakukan ovveride terhadap method tampilkanNilai ()
    //yang terdapat pada kelas A
    
    public void tampilkanNilai()
    {
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b :"+getB());
    }
}
