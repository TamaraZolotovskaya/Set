import java.util.HashSet;
import java.util.Set;

public class ProductList {

    private Set<Product> productSet = new HashSet<>();


    public void addProduct(Product product) {

            if (productSet.contains(product)) {
                try {
                    throw new IllegalArgumentException("Такой продукт " + product.getName() + " уже есть в списке");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                this.productSet.add(product);
                System.out.println("Продукт " + product.getName() + " добавлен в список");
            }
        }


    public void removeProduct(Product product) {
        if (!productSet.contains(product)) {
            System.out.println("Продукта " + product.getName() + " нет в списке");
        } else {
            productSet.remove(product);
            System.out.println("Продукт " + product.getName() + " удалён из списока");
        }
    }

    public void buyProduct(Product product) {
        if (!productSet.contains(product)) {
            System.out.println("Продукта " + product.getName() + " нет в списке");
        } else {
            product.setFlag(true);
            System.out.println("Продукт " + product.getName() + " куплен");
        }
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + productSet;
    }
}
