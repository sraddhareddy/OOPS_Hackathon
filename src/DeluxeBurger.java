public class DeluxeBurger extends Hamburger {
    String deluxeadd;
  public  DeluxeBurger(String deluxeadd){
      super();
        this.deluxeadd=deluxeadd;
    }
    public float check(){
        if(deluxeadd.equals("chips")){
            list.add("chips");
            price=baseprice+10;
        }
        else if(deluxeadd.equals("drink")){
            list.add("drink");
            price=baseprice+10;
        }
        else if(deluxeadd.equals("both")){
            list.add("chips");
            list.add("drink");
            price=baseprice+20;
        }
        return price;
    }
}
