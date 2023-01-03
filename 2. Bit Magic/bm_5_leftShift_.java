// Left Shift 

public class bm_5_leftShift_ {
	public static void main(String[] args) {
		int x = 3;
		System.out.println(x << 1);   // OUTPUT : 6
		System.out.println(x << 2);   // OUTPUT : 12
		int y = 4;
		int z = (x << y);
		System.out.println(z);        // OUTPUT : 48
	}
}


// Logic :
//  int x= 3 : 000.......0011
//  (x << 1) : 000.......0110
//  (x << 2) : 000......01100
//  (x << 4) : 000....0110000
