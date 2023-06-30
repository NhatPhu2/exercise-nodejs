package Ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private String name;
    private Integer id;
    private String phone;
    private Map<Integer,Order> listOrder = new HashMap();
    private Integer orderId = 1;
    public Customer() {
    }

    public Customer(String name, Integer id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void order(List<Product> product){
        Order newOrder = new Order();
        product.forEach(newOrder::addProduct);
        listOrder.put(orderId++,newOrder);
    }

    public void showCart(){
        listOrder.forEach((k,value) ->{
            System.out.println("Order: " + k);
            value.getProducts().forEach((key,val) ->{
                System.out.println("ProductId: " + key);
                System.out.println("ProductName: " + val.getName());
                System.out.println("ProductPrice: " + val.getPrice());
                System.out.println("ProductQuantity: " + val.getQuantity());
                System.out.println();
            });
            System.out.println("**************************************************");
            System.out.println();
        });
    }
}
