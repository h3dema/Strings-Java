public class AchaSubstring {
  
  public static void main(String[] args) {
    // trecho de "Nós vamos invadir sua praia" - Ultraje a rigor
    String stringAPesquisar = "Daqui do morro dá pra ver tão legal "+
      "O que acontece aí no seu litoral "+
      "Nós gostamos de tudo, nós queremos é mais "+
      "Do alto da cidade até a beira do cais "+
      "Mais do que um bom bronzeado "+
      "Nós queremos estar do seu lado";
    String procurar = "Nós";
    /**
     * destacamos as variáveis n e m para ficar mais simples
     * a declaração no loop for para as referências destes tamanhos
     */
    int n = stringAPesquisar.length();
    int m = procurar.length();
    boolean achou = false;
    /**
     * notem a construção da condição de parada no loop for
     * além de verificar a variável contador, também verificamos se achou
     */
    for (int i = 0; i <= (n - m) || achou; i++) {
      /**
       * vamos achar todos os locais onde existe a string
       */
      if (stringAPesquisar.regionMatches(i, procurar, 0, m)) {
        achou = true;
        System.out.printf("Achou: %s [%d, %d]\n",stringAPesquisar.substring(i, i + m), i, i+m);
      }
    }
    if (!achou)
      System.out.printf("Não achou \"%s\".", procurar);
  }
  
}