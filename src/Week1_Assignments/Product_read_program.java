package Week1_Assignments;


import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
 
public class Product_read_program  {
	
    private String category;
    private double rating;
    private String name;
    private int price;
  
 
    public Product_read_program(String name, int price, String category, double rating) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public double getRating() {
        return rating;
    }
    public String getData(){
        return "Product1 --> Name: "+this.name+" price: "+this.price+" category: "+this.category+" rating: "+this.rating;
    }
 
    
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br;
 
        List<Product_read_program> productList = new ArrayList<>();
 
        try{
            FileReader fr  =new FileReader("C:\\Training\\Wiley\\JAVA\\day1_21_04_23\\wiley_core_java\\Product1.csv");
            br  = new BufferedReader(fr);
 
            String i;
            while((i= br.readLine())!=null){
                String[] productInfo = i.split(",");
                
                String name  = productInfo[0];
                int price = Integer.parseInt(productInfo[1]);
                String category  = productInfo[2];
                double rating  = Double.parseDouble(productInfo[3]);
                
                Product_read_program product = new Product_read_program(name,price,category,rating);
                productList.add(product);
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        for (Product_read_program product: productList) {
            System.out.println(product.getData());
        }
    }
}