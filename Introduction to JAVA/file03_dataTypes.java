public class file03_dataTypes {
  public static void main(String[] args){
    
    // there are many types of data types
    // short  --> 2bytes (16bits)
    // int  --> 1bytes (8bits)
    // long  -->  4bytes (32bits) ==> in long by default it take number as an integer but we have to write "l" in the last of number to behave like as long integer
    int age = 1853;
    System.out.println(age);

    short age1 = 200;
    System.out.println(age1);

    long age2 = 254545151654l;
    System.out.println(age2);

    // for DECIMAL
    // float  --> we have to write "f" in the last of number to behave like as float
    // double --> instead of float use double, in this we don't reqired to write any extra word 
    double num = 10.24;
    System.out.println(num);
    
    float num1 = 99.57f;
    System.out.println(num1);

    // boolean
    // it can store any two value either 0 or 1 (True or False)
    boolean val = true;
    System.out.println(val);

    boolean val1 = false;
    System.out.println(val1);

    //char  -->char store any Character variable

    char char_var = '$';
    System.out.println(char_var);


  }
}
