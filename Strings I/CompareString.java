class CompareString {
  
  public static void main(String args[]) {
    String s1 = "String a comparar";
    String s2 = new String(s1);
    // compara os valores
    System.out.println(s1 + " é igual " + s2 + " -> " + s1.equals(s2));
    // compara os objetos
    System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
  }
  
  
}