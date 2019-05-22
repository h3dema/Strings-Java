/*
 * vamos ver como funciona a concatena��o de strings
 * String.concat() concatena (une no final d) a string original com a nova string passada como par�metro.
 */
class StringConcatenacao {

  public static void main(String[] args) {
    String s2 = ", this new string.";
    String s1 = "Concatenates to the end of this string";
    
    String s3 = s1.concat(s2);
    System.out.println("s1 :"+s1);
    System.out.println("s2 :"+s2);
    System.out.println("s3 :"+s3);
    /**
     * note que � gerada uma nova string, as strings originais n�o s�o alteradas
     */    
  }

}
