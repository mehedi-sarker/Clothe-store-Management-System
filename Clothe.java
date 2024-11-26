package Entity;

public class Clothe {
    private String name;
    private String size;
    private String color;
    private String fabric;
    private String productId;    
    private int price;
    private int quantity;
	private String clotheType;
    
    public Clothe() {
        
    }
    
    public Clothe(String name, String size, String color, String fabric, String productId,String clotheType, int price, int quantity) {
        setName(name);
        setSize(size);
        setColor(color);
        setFabric(fabric);
        setProductId(productId);
        setPrice(price);
        setQuantity(quantity);
		setClotheType(clotheType);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    public String getFabric() {
        return fabric;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
	
	public void setClotheType(String clotheType) {
       this.clotheType = clotheType;
    }
    
   public String getClotheType() {
        return clotheType;
    }
 
   
    public String getClotheAsString(){
		
		String s =  "Clothe Id : "+productId+"\n"+
					"Clothe Name : "+name+"\n"+
                    "size :"+size+"\n"+
					"clothe fabric : "+fabric+"\n"+
					"clothe quantity: "+quantity+"\n"+
					"price : "+price+"\n"+
					"seasonal Collection : "+clotheType+"\n"+
					"color :"+color;
		return s;
	}
    public void addNewStokes(int x) {
        quantity += x;
    }
    
   /* public void showInfo() {
        System.out.println("---------------------------");
        System.out.println(" PRODUCT Name: " + name);
        System.out.println("Id: " + productId);
        System.out.println("COLOR: " + color);
        System.out.println("FABRIC: " + fabric);
        System.out.println("SIZE: " + size);
        System.out.println("QUANTITY: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }*/
}
