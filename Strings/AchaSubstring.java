public class AchaSubstring {
  
  public static void main(String[] args) {
    // trecho de "N�s vamos invadir sua praia" - Ultraje a rigor
    String stringAPesquisar = "Daqui do morro d� pra ver t�o legal "+
      "O que acontece a� no seu litoral "+
      "N�s gostamos de tudo, n�s queremos � mais "+
      "Do alto da cidade at� a beira do cais "+
      "Mais do que um bom bronzeado "+
      "N�s queremos estar do seu lado";
    String procurar = "N�s";
    /**
     * destacamos as vari�veis n e m para ficar mais simples
     * a declara��o no loop for para as refer�ncias destes tamanhos
     */
    int n = stringAPesquisar.length();
    int m = procurar.length();
    boolean achou = false;
    /**
     * notem a constru��o da condi��o de parada no loop for
     * al�m de verificar a vari�vel contador, tamb�m verificamos se achou
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
      System.out.printf("N�o achou \"%s\".", procurar);
  }
  
}