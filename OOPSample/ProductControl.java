package OOPSample;

import java.util.Scanner;

public class ProductControl {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("SKU girin");
        String sku=scanner.nextLine();

        System.out.println("name girin");
        String name=scanner.nextLine();

        System.out.println("price girin");
       Double price=scanner.nextDouble();

       Product product=new Product(sku,name,price);
        System.out.println(product.getProductName());

        double productPrice=product.getPrice();
        System.out.println(product);

        productPrice=productPrice-300;
        product.setPrice(productPrice);
        System.out.println(product.getPrice());

    }
}
