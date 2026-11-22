class Item{
String item = " book";
int price = 23000;
public static void main(String args[]){
Item set = new Item();
System.out.println(" Starting fot buying ");
set.details();
}
public void details(){
System.out.println(" Item Name " + item);
System.out.println(" item price " + price);
}
}