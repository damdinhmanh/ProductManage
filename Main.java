import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Store
        Store store = new Store();
        //Test Push Dam.manh
        //Create Products
        Product product1 = new Product("001", "Milk", "Beverage", 100, 20000, "Bottle");
        Product product2 = new Product("002", "Wine", "Beverage", 20, 25000, "Bottle");
        Product product3 = new Product("003", "Table", "Interior", 2, 55000, "pcs");
        Product product4 = new Product("004", "TV", "Electronic", 1, 2000000, "pcs");

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        //add store product
        store.setProductList(productList);

        //1.View all product infors
        store.displayStoreInfors();

        //2. Find by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nInput product name to find: ");
        String nameFind = scanner.nextLine();
    
        System.out.printf("\nFind product:");
        System.out.println(store.findProductByName(nameFind));


        //3. Update product by ID
        //remove by ID
        System.out.print("\n\nInput product ID to remove: ");
        String removeId = scanner.nextLine();
        store.removeProductById(removeId);

        //update product num by ID
        System.out.print("\n\nInput product ID to update: ");
        String updateProdId = scanner.nextLine();
        System.out.print("\n\nInput product Number to update: ");
        int updateProdNum = scanner.nextInt();
        store.updateProductNumberById(updateProdId, updateProdNum);

        store.displayStoreInfors();

        //4. find product number under than 5
        store.findProductNumberUnder(5);

        //5. Tìm sản phẩm theo mức giá:
        // 5.1: Dưới 50.000
        // 5.2: Từ 50.000 đến dưới 100.000
        // 5.3: Từ 100.000 trở lên

        store.findProductPriceSmallerThan(50000);
        store.findProductPriceInRange(50000, 100000);
        store.findProductPriceGreaterThan(100000);

        scanner.close();
    }
}
