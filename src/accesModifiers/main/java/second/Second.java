package second;

import first.First;

public class Second {
   public static void main(String[] args) {
       First first = new First("Kodluyoruz");
       System.out.println(first.str);
       //başka bir packageden erişmek için public
   }
}
