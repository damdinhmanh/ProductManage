import java.util.ArrayList;

public class Store {
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void displayStoreInfors() {
        System.out.println("Show product list infors:");
        System.out.printf(productList.toString());
    }

    public Product findProductByName(String name) {
        for (Product product : productList) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void removeProductById(String removeId) {
        for (int idx = 0; idx < productList.size(); idx++) {
            if(productList.get(idx).getId().equals(removeId)) {
                productList.remove(idx);
                break;
            }
        }
    }

    public void updateProductNumberById(String findId, int updateNumber) {
        for (Product product : productList) {
            if (product.getId().equals(findId)) {
                product.setNumber(updateNumber);
                break;
            }
        }
    }

    public void findProductNumberUnder(int underVal) {
        System.out.printf("-------------\n\n");

        for (Product product : productList) {
            if (product.getNumber() < underVal) {
                System.out.println("Find product has number under than: " + underVal + " -> " + product.toString());
            }
        }
    }

    public void findProductPriceSmallerThan(int findVal) {
        System.out.printf("--------------\n\n");

        for (Product product : productList) {
            if (product.getPrice() < findVal) {
                System.out.println("Find product has price smaller than: " + findVal + " -> " + product.toString());
            }
        }
    }


    public void findProductPriceGreaterThan(int findVal) {
        System.out.printf("--------------\n\n");

        for (Product product : productList) {
            if (product.getPrice() > findVal) {
                System.out.println("Find product has price greater than: " + findVal + " -> " + product.toString());
            }
        }
    }

    public void findProductPriceInRange(int startVal, int endVal) {
        System.out.printf("--------------\n\n");

        for (Product product : productList) {
            if (product.getPrice() >= startVal && product.getPrice() <= endVal) {
                System.out.println("Find product has price in range [" + startVal + "-" + endVal + "] -> " + product.toString());
            }
        }
    }
}
