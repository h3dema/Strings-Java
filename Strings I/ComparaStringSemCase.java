public class ComparaStringSemCase {

  public static void main(String[] arg) {
    
    String a = "aaa";
    String b = "AAA";
    
    if(a.equalsIgnoreCase(b)){
      System.out.println("String a == b");
    }else{
      System.out.println("String a != b");   
    }
  }
  
}