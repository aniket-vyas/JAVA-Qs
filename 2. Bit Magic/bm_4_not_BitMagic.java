// NOT Bit Magic

// Formula :- { (2)^32 - 1 - x }

// Ex : 1
public class bm_4_not_BitMagic {
	public static void main(String[] args) {
		int x = 1;
		System.out.println(~ x);    
    // = (2)^32 - 1 - 1
    // = (2)^32 - 2
    // OUTPUT : -2 
	}
}

// Ex : 2
public class bm_4_not_BitMagic {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(~x);     
    // = (2)^32 - 1 - 5
    // = (2)^32 - 6
    // OUTPUT : -6
	}
}
