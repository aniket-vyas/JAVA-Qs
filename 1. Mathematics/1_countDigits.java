public class 1_countDigits{
  public static void main (String[] args){
    int countDigits (int x){
      int result = 0;
      while(x > 0){
        x = x / 10;
        result ++;
      }
      return result;
    }
  }
}
