class CompareString {
  //http://www.java2s.com/Tutorial/Java/0040__Data-Type/equalsvs.htm  
  
  public static void main(String args[]) {
    String s1 = "Hello";
    String s2 = new String(s1);
    // compara os valores
    System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
    // compara os objetos
    System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
  }
  
  
}