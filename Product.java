public class Product {
    private String id;
    private String name;
    private String description;
    private int number;
    private int price;
    private String unit;

    public Product(String id, String name, String description, int number, int price, String unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.number = number;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product [description=" + description + ", id=" + id + ", name=" + name + ", number=" + number
                + ", price=" + price + ", unit=" + unit + "]\n";
    }
}