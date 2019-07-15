public class HealthyBurger extends Hamburger{

String brr[]=new String[6];
public HealthyBurger(String breadroll){
    super();
    //this.breadroll="brown rye bread roll";
}
public void additions() {
    for (int i = 0; i < 4; i++) {
        brr[i] = arr[i];
    }
    brr[4] = "cabbage";
    brr[5]="" ;
}
public float choose() {
    int n = sc.nextInt();
    for (int j = 0; j < n; j++) {
        String s = sc.nextLine();
        list.add(s);
    }
    price=baseprice+price*10;
    return price;
}
}
