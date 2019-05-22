class AchaSubstringEmArray {
  
  public static int indiceDiffString(String[] strs) {
    if (strs == null || strs.length <= 1) { 
      return -1; // não existem strings para comparar
    }
    boolean algumaStringNula = false;
    boolean todasNulas = true;
    int n = strs.length; // tamanho do array de strings a serem comparadas
    int tamMenorString = Integer.MAX_VALUE;
    int tamMaiorString = 0;
    
    /**
     * acha o tamanho da maior e da menor string
     * evita que o procedimento de verificação não exceda o tamanho das strings durante a comparação
     */
    for (int i = 0; i < n; i++) {
      if (strs[i] == null) {
        algumaStringNula = true;
        tamMenorString = 0;
      } else {
        todasNulas = false;
        tamMenorString = Math.min(strs[i].length(), tamMaiorString);
        tamMaiorString = Math.max(strs[i].length(), tamMaiorString);
      }
    }    
    // Se todas as strings são nulas ou tem tamanho zero
    if (todasNulas || (tamMaiorString == 0 && !algumaStringNula)) {
      return -1;
    }    
    // se existe uma string de tamanho 0 (não nula), obviamente a diferença começa aí
    if (tamMenorString == 0) {
      return 0;
    }
    
    /**
     * acha a posição onde inicia a diferença entre as strings
     */
    int diferenca = -1;
    for (int posicao = 0; posicao < tamMenorString; posicao++) {
      char c = strs[0].charAt(posicao);
      for (int p = 1; p < n; p++) {
        if (strs[p].charAt(posicao) != c) {
          diferenca = posicao;
          break;
        }
      }
      if (diferenca != -1) break;
    }
    
    if ((diferenca == -1) && (tamMenorString != tamMaiorString)) {
      /**
       * comparamos os caracteres até o tamanho da menor string
       * e não encontramos o valor, como os tamanhos diferem, devemos retornar o tamanho
       * da menor string
       */
      return tamMenorString;
    }
    return diferenca;
  }
  
  /**
   * procedimento principal
   */
  public static void main(String[] args) {
    String[] pesquisar = {"Nós qostamos de tudo, nós queremos é mais ",
                          "Nós queremos estar do seu lado"};
    int n = indiceDiffString(pesquisar);
    if (n >= 0) {
      System.out.printf("As strings:\n\t\"%s\" e \n\t\"%s\" \ncomeçam a diferir na posição %d\n", pesquisar[0], pesquisar[1], n);
    }    
  }
  
  
}