/**
 * StringBuffer
 * é uma classe que implementa um sequencia de caracteres (como uma String), porém é "thread safe", isto é
 * os métodos são sincronizados quando necessário, de forma que as operações em um determinado instante funcionam como se
 * fossem chamados em uma determinada ordem, consistente com a ordem chamada pelas diversas threads individuais
 * 
 * a sequencia é modificável (na String não)
 * o tamanho e conteúdo de um StringBuilder podem alterar pela chamada de seus métodos
 * as operações principais são os métodos append e insert
 * append --> insere o dado no final do buffer
 * insert --> insere o dado a partir de uma posição indicada
 * 
 * Existe uma implementação denominada StringBuilder que é similar a StringBuffer, porém não é thread safe
 */
class ConcatenacaoStringBuilder {
  
  public static void main(String[] args) {
    /**
     * criando os objetos
     */
    StringBuilder sb1 = new StringBuilder();   // cria o buffer com um tamanho default de 16 e sem caracteres
    System.out.printf("sb1[%d/%d]:%s\n",sb1.length(),sb1.capacity(),sb1);
    StringBuilder sb2 = new StringBuilder(200); // cria o buffer com um tamanho de 200 e sem caracteres
    System.out.printf("sb2[%d/%d]:%s\n",sb2.length(),sb2.capacity(),sb2);
    String s = "para colocar em sb3";
    /**
     * vamos criar um StringBuilder a partir de s
     */
    StringBuilder sb3 = new StringBuilder(s); // carrega a string no buffer
    System.out.printf("sb3[%d/%d]:%s\n",sb3.length(),sb3.capacity(),sb3); // note a capacidade que o Java cria automaticamente
    /**
     * vamos colocar um boolean em uma das nossas variáveis
     */
    sb2.append(new Boolean(false));
    System.out.printf("sb2[%d/%d]:%s\n",sb2.length(),sb2.capacity(),sb2);
    boolean b = true;
    sb2.append(b); // podemos usar uma das primitivas do Java
    System.out.printf("sb2[%d/%d]:%s\n",sb2.length(),sb2.capacity(),sb2);
    /**
     * vamos agora acrescentar um inteiro
     */
    sb2.append(new Integer(6543));
    System.out.printf("sb2[%d/%d]:%s\n",sb2.length(),sb2.capacity(),sb2);
    int i = 12345678;
    short i2 = 1234;
    byte i3 = 12;
    sb2.append("-").append(i).append("-").append(i2).append("-").append(i3); // perceberam o acréscimo?
    System.out.printf("sb2[%d/%d]:%s\n",sb2.length(),sb2.capacity(),sb2);
    /**
     * agora números de pontos flutuantes
     */
    sb1.append(new Double(65.43));
    System.out.printf("sb1[%d/%d]:%s\n",sb1.length(),sb1.capacity(),sb1);
    double d = 12.234;
    sb1.append("   ").append(d);
    System.out.printf("sb1[%d/%d]:%s\n",sb1.length(),sb1.capacity(),sb1);
    /**
     * acessando caracter a caracter
     * vamos fazer uma pirâmide
     */
    for(int m = 0; m<sb3.length(); m++) {
      for(int j = 0; j <=m; j++)
        System.out.print(sb3.charAt(j)); // usamos charAt(i)
      System.out.println();
    }
    /**
     * vamos ver como apagar caracteres
     */
    sb3.deleteCharAt(0);
    System.out.println(sb3+" <<---- sem o 1º caracter");
    /**
     * vamos apagar uma faixa
     */
    sb3.delete(1,5);
    System.out.println(sb3+" <<---- sem o caracter de 2 a 6");

    // quer ver exemplos com StringBuffer ????
    
    // isto mesmo --- é tudo igual
    
  }
  
}