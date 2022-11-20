import java.util.Objects;

public class Recipe {
    private String title;
    private ProductList list;
    private double price = 0;

    public Recipe(String title) {
        this.title = title;
    }

    public void addProductList(ProductList productList) {
        this.list = productList;
        for (Food food : list.getProductList().keySet()) {
            this.price = this.price + (food.getPrice() * food.getQuantity());
        }
    }

    public String getTitle() {
        return title;
    }


    public ProductList getList() {
        return list;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(title, recipe.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Название: " + getTitle() + "\n" +
                "Стоимость продуктов: " + getPrice() + " руб.\n" +
                getList() + "\n";
    }
}
