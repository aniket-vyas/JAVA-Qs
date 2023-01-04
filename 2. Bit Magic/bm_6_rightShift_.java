// Right Shift

// int x = 33 : 00....100001
//     x >> 1 : 00....010000
//     x >> 2 : 00....001000

// Ex :-
public class bm_6_rightShift {
  public static void main(String[] args) {
    int x = 33;
    System.out.println(x >> 1);   // OUTPUT : 16
  }
}

// Ex :-
public class bm_6_rightShift {
  public static void main(String[] args) {
    int x = 33;
    System.out.println(x >> 2);   // OUTPUT : 8
  }
}

// Ex :-
public class bm_6_rightShift {
  public static void main(String[] args) {
    int x = -2;
    System.out.println(x >> 1);   // OUTPUT : -1
  }
}
