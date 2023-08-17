public class midtest {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("chair");
        p.setPrice(500.0);
        p.showDetails();
        Eletronics e = new Eletronics();
        e.setName("Television");
        e.setPrice(20000.0);
        e.setBrand("Samsung");
        e.setModel("Neo QLED");
        e.showDetails();
        Smartphone s = new Smartphone();
        s.setName("Iphone");
        s.setPrice(40000.0);
        s.setBrand("Apple");
        s.setModel("Iphone 99");
        s.setOperatingSystem("ios");
        s.showDetails();
        Book b = new Book();
        b.setName("OOP Programming");
        b.setPrice(250.0);
        b.setAuthor("John Doe");
        b.setPages(300);
        b.showDetails();
    }
}
class Product{
    public String name;
    public double price;
    Product(){
        name = "name";
        price = 0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void showDetails(){
        System.out.println("Product Name : " +name);
        System.out.println("Product Price : " +price);
        System.out.println("****************************************");
    }
}
class Book extends Product{
    public String author;
    public int pages;
    Book(){
        author = "author";
        int pages = 0;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPages(int newPages){
        this.pages = newPages;
    }
    public void showDetails(){
        System.out.println("Product Name : " +name);
        System.out.println("Product Price : " +price);
        System.out.println("Author : " +author);
        System.out.println("Number of Pages : " +pages);
        System.out.println("****************************************");
    }
}
class Eletronics extends Product{
    public String brand;
    public String model;
    Eletronics(){
        brand = "brand";
        model = "model";
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void showDetails(){
        System.out.println("Product Name : " +name);
        System.out.println("Product Price : " +price);
        System.out.println("Brand : " +brand);
        System.out.println("Model : " +model);
        System.out.println("****************************************");
    }
}
class Smartphone extends Eletronics{
    public String OperatingSystem;
    Smartphone(){
        OperatingSystem = "OperatingSystem";
    }
    public String getOperatingSystem(){
        return this.OperatingSystem;
    }
    public void setOperatingSystem(String newOperatingSystem){
        this.OperatingSystem = newOperatingSystem;
    }
    public void showDetails(){
        System.out.println("Product Name : " +name);
        System.out.println("Product Price : " +price);
        System.out.println("Brand : " +brand);
        System.out.println("Model : " +model);
        System.out.println("Operating System : " +OperatingSystem);
        System.out.println("****************************************");
    }
}

