package OOPSample;

public class FamilyCreated {

    public static void main(String[] args) {
        Family familyMember=new Family("Hülya","Celal","Hediye") ;
        System.out.println(familyMember.anne);
        System.out.println(familyMember.baba);
        System.out.println(familyMember.cocuk);
        familyMember.printFamily();
        familyMember.anne="sdfg";
        familyMember.getAnneYas();
        familyMember.setAnneYas(47);
        System.out.println("anne yaşı: "+familyMember.getAnneYas());/**/
        System.out.println("Çocuk yaşı "+familyMember.getCocukYas());
        int aYas=familyMember.getAnneYas();
        System.out.println("Annenin yaşı "+aYas);
    }

}
