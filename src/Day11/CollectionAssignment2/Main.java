package Day11.CollectionAssignment2;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IdCompare idCompare = new IdCompare();

        Set<Product> productSet = new TreeSet<>(idCompare);
        System.out.println("Enter Your Choice to sort the product:");
        System.out.println("1. Price Sort");
        System.out.println("2. Name Sort");
        int sortChoice = scan.nextInt();

        if(sortChoice == 1){
            PriceCompare priceCompare = new PriceCompare();
            productSet = new TreeSet<>(priceCompare);
        }
        else if(sortChoice == 2){
            NameCompare nameCompare = new NameCompare();
            productSet = new TreeSet<>(nameCompare);
        }

        System.out.println("Enter the Product Details:");
        System.out.println("============================");

        int count=1;
        while(true){
            System.out.println("Enter Details of Product "+count++);
            System.out.println("Enter Product Name:");
            String productName = scan.next();
            System.out.println("Enter Product price:");
            double productPrice = scan.nextDouble();
            System.out.println("Enter the Product Id:");
            int productId = scan.nextInt();
            productSet.add(new Product(productId,productName,productPrice));

            System.out.println("Do You Want to Continue?(Y/N):");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("n"))
                break;
        }

        //System.out.println(productSet);


        System.out.println(productSet);
        for (Product item:productSet){
            System.out.println("The Poduct details are");
            System.out.println("Name: "+item.getProductName());
            System.out.println("Product Id: "+item.getProductId());
            System.out.println("Produt Price: "+item.getProductPrice());
            System.out.println("--------------------------------");
        }

    }
}
