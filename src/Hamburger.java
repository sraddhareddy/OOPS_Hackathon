import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamburger{
    String breadroll;
    String type;
    String meat;
    float price;
    float baseprice=100;
    String arr[]=new String[]{"lettuce","carrot","tomato","cheese"};
    Scanner sc=new Scanner(System.in);
    List<String> list=new ArrayList<String>();
    public Hamburger(String breadroll,String meat,float price,String type){
        this.breadroll=breadroll;
        this.meat=meat;
        this.price=price;
        this.type=type;
    }

    public Hamburger(String breadroll) {

    }

    public Hamburger() {

    }

    public float checking(){
        if(type.equals("healthyburger")){
            HealthyBurger healthyBurger=new HealthyBurger("brown rye bread roll");
            float price=healthyBurger.choose();
        }
        else if(type.equals("deluxeburger")){
            DeluxeBurger deluxeBurger=new DeluxeBurger("chips");
            float price=deluxeBurger.check();
        }
        else{
            System.out.println("Enter additional items count");
            int k=sc.nextInt();
            for(int m=0;m<k;m++){
                String f=sc.nextLine();
                list.add(f);
                price=baseprice+10*k;
            }
        }
        return price;
    }
        }