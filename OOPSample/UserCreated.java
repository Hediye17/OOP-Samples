package OOPSample;

public class UserCreated {


    public static void main(String[] args) {
        UserInfo user=new UserInfo("Hediye17","Hediye kartal","189624",25);
        System.out.println(user.userName);
        System.out.println(user.name);
        System.out.println(user.getPassword());
        System.out.println("Bir yıl sonraki yaşı: "+user.getYas());
        user.setYas(24);
        System.out.println("Bugün ki yaşı: "+user.getYas());
    }
}
