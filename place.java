class PlaceOrder{
public void orderItem(){
String itemName = " Mobile";
int many = 4;
System.out.println(" Order placed for " + many + " " + itemName);
}
public static void main(String args[]){
PlaceOrder set = new PlaceOrder();
set.orderItem();
}
}