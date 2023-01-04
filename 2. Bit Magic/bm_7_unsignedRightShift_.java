// Unsigned Right Shift

// Ex :-

// int x = -2 : 111....10
//    x >>> 1 : 011....11
// In x >>> 1 , first 0 is for +ve and remaing are (2)^31 - 1
public class bm_7_unsignedRightShift_{
  public static void main(String[] args){
    int x = -2;
    System.out.println(x >>> 1);    // OUTPUT : 2147483647 
  }
}

// Ex :-

// int x = -2 : 111....10
//    x >>> 2 : 001....11
// In x >>> 2 , first two 0's is for +ve and remaing are (2)^30 - 1
public class bm_7_unsignedRightShift_{
  public static void main(String[] args){
    int x = -2;
    System.out.println(x >>> 2);    // OUTPUT : 1073741823
  }
}
