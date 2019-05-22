public class UsoTrim {

  public static void main(String[] arg) {

    String s = "   Esta string tem espaços no início e final   ";
    String t = s.trim();
    
    System.out.println(">"+s+"<");
    System.out.println(">"+t+"<");
  }

}