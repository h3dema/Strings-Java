import java.util.Date;

class StringFormatacao {
  
  /**
   * String.format() é um método estático
   * retorna uma nova string utilizando um formato informado onde são aplicados argumentos
   * o método padrão utiliza o locale retornado por Locale.getDefault()
   * é possível definir um locale especial, mas não apresentaremos esta opção
   */
  public static void main(String[] args) {
    /**
     * booleanos %b %B
     */
    Boolean b = true;
    System.out.println(String.format("Valor booleano %b", b)); // escreve em minúsculas
    System.out.println(String.format("Valor booleano %B", b)); // maiúsculas
    
    /**
     * ponteiros
     */
    System.out.println(String.format("Ponteiros %h", b)); // retorna HASH CODE de b
    System.out.println(String.format("Ponteiros %H", b)); // retorna HASH CODE de b --> hexa em maiúsculas
    b = null;
    System.out.println(String.format("Ponteiros %h", b)); // se ponteiro é nulo retorna em minúsculas
    System.out.println(String.format("Ponteiros %H", b)); // em maiúsculas
    
    /**
     * decimais %d %o %x %X
     */
    int i = 10;
    System.out.println(String.format("Valores decimais %d", i));   // mostra o inteiro
    System.out.println(String.format("Valores decimais %3d", i));  // usa x espaços - no nosso exemplo são 3
    System.out.println(String.format("Valores decimais %03d", i)); // preenche antes com zeros
    System.out.println(String.format("Valores octais %o", i));   // mostra o inteiro como octal --> 10 = 8 + 2, logo 12 em octal
    System.out.println(String.format("Valores hexa %x", i));   // mostra o inteiro como hexa --> 10 = A em hexa
    System.out.println(String.format("Valores hexa %02x", i));   // mostra o inteiro como hexa, com 2 digitos e preenche com zeros a esquerda
    System.out.println(String.format("Valores hexa %02X", i));   // mostra o inteiro como hexa, só que em maiúsculas
    
    /**
     * ponto flutuante %f --> existem outros tipos, mas este e o mais comum (veja %e e %g)
     */
    double f = 10.2345;
    System.out.println(String.format("Valores double %f",f)); // formato de saída padrão
    System.out.println(String.format("Valores double %5f",f)); // mostra com 5 posições (não considera parte decimal
    System.out.println(String.format("Valores double %8.2f",f)); // mostra com 8 posições
    System.out.println(String.format("Valores double %08.3f",f)); // preenche com zeros, obs: note que arredonda na casa decimal 0,2345 virou 0,235
    
    /**
     * formatação de datas
     */
    Date d = new Date();
    System.out.println(d);
    System.out.println(String.format("%tH:%tM:%tS",d,d,d)); // hora:minutos:segundos --> note que temos que passar 3 parâmetros
    System.out.println(String.format("%tI:%tM:%tS",d,d,d)); // hora:minutos:segundos --> note que temos que passar 3 parâmetros
    System.out.println(String.format("%td/%tm/%tY",d,d,d)); // dia/mes/ano --> note que temos que passar 3 parâmetros
    System.out.println(String.format("%td/%tm/%ty",d,d,d)); // dia/mes/ano (2 digitos)
    System.out.println(String.format("%tD",d)); // dia (depende do locale) no meu caso mes/dia/ano (2 digitos)
    
    /**
     * formatação de strings
     */
    String s1 = "henrique";
    String s2 = "blogspot";
    System.out.println(String.format("%s - h3dema.%s.com",s1,s2)); // tem 2 %s quer dizer que recebe 2 parâmetros
    
  }
  
}