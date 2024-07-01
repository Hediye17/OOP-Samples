package OOPSample;

public class Family {
   public String anne;
   private  int anneYas;

    public int getAnneYas() {
        return anneYas;
    }

    public void setAnneYas(int anneYas) {
        this.anneYas = anneYas;
    }
    public  String baba;
    public int babayas;

   public String cocuk;
   private  int cocukYas;

    public int getCocukYas() {
        return cocukYas;
    }

    public void setCocukYas(int cocukYas) {
        this.cocukYas = cocukYas;
    }

    public Family(String anne, String baba, String cocuk){
       this.anne=anne;
       this.baba=baba;
       this.cocuk=cocuk;

   }
   public  void printFamily(){
       System.out.println("anne"+" "+anne+" baba"+" "+baba+" Çocuk"+" " +cocuk);
   }
}
