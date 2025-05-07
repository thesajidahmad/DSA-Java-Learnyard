public class file04_operators {
  public static void main(String[] args){

    //  operators 
    // '+' '-' '*' '/' '%'
    int a=5, b=2, c=6;
    int d= a*b + c;
    System.out.println(d);

    System.out.println(5-2);     // print = 3
    System.out.println(5*2);     // print = 10
    System.out.println(5/2);     // print = 2 this is wrong bcz actual ans is 2.5 that is flot so we have to change to float    System.out.println(4/2);     // print = 2
    System.out.println(13/5.0);  // print = 2.6
    System.out.println(12%5);    // print = 2
    System.out.println(-12%5);   // print = -2  wrong 


    // assignment operator (=)
        int x = 5;
        int y = 6;


    // Relational Operators
    // == !=  < > <=  >=  
    System.out.println(x == y);  // false
    System.out.println(x != y);  // true
    System.out.println(x > y);   // false
    System.out.println(x < y);   // true
    System.out.println(x <= y);  // true
    System.out.println(x >= y);  // false



    // Logical Operator
    //  && => AND operator
    //  || => OR  operator
    // !   => NOT operator

    System.out.println(8 > 9 && 9 > 10);  // false && false = false
    System.out.println(8 < 9 && 9 < 10);  // true && true = true
    System.out.println(8 < 9 || 9 > 10);  // true || false = true
    System.out.println(!(8 > 10));        // !(false) = true

    
  }
}
