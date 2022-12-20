
import java.awt.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class Main {




    public static void main(String[] args)  {

        //ДЗ 1.1

        Product banana = new Product("банан", 100, 0.5);
        Product apple = new Product("яблоко", 70, 0.5);
        Product yogurt = new Product("йогурт", 230, 0.2);
        //  Product cinnamon = new Product("", 2000, 0.03);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(apple);
        productList.addProduct(apple);
        productList.addProduct(yogurt);
        System.out.println(productList);
        productList.addProduct(apple);
        productList.removeProduct(apple);
        productList.removeProduct(apple);

        //ДЗ 2.1
        Recipe recipe1 = new Recipe("Фруктовый салат", productList);
        recipe1.addProduct(banana);
        System.out.println(recipe1);

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        recipeList.addRecipe(recipe1);
        System.out.println(recipeList);


        //ДЗ 2.2
        int max = 1000;
        int size = 20;
        Set<Integer> intSet = new HashSet<>();
        Random random = new Random();
        while (intSet.size()<size){
            intSet.add(random.nextInt(max + 1));
        } //могут быть повторы, поэтому не for, a while

         Iterator<Integer>iterator=intSet.iterator();
        while (iterator.hasNext()){
            if (iterator.next()%2!=0){iterator.remove();}
        }
        System.out.println(intSet);


        //ДЗ 3.2
        Set<Task> tasks = new HashSet<>();
        while (tasks.size()<15){
            Task task = new Task(random.nextInt(8)+2,random.nextInt(8)+2);
            tasks.add(task);
        }
        for (Task task: tasks) {
            System.out.println(task);
        }


       //ДЗ 3.3
        Passport pass1 = new Passport(12345678,
                "Ivanov","Ivan", "Ivanovoch",
                LocalDate.now().minusYears(42));
        Passport pass2 = new Passport(87654321,
                "Ivanov","Mikel", null,
                LocalDate.now().minusYears(34));
        Passport pass3 = new Passport(12345678,
                "Рetrov","Semen", "Ivanovoch",
                LocalDate.now().minusYears(29));

        Set<Passport> passports =new HashSet<>();
        passports.add(pass1);
        PassportList passportList1 = new PassportList(passports);


       passportList1.addPassport(pass2);
        System.out.println(passportList1);
        passportList1.addPassport(pass3);
        System.out.println(passportList1);

        System.out.println(passportList1.searchPassport(12345678));
       System.out.println(passportList1.searchPassport(12345675));

    }
}