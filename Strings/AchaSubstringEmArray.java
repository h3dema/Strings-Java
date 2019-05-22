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
    
    // find the min and max string lengths; this avoids checking to make
    // sure we are not exceeding the length of the string each time through
    // the bottom loop.
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
      // we compared all of the characters up to the length of the
      // shortest string and didn't find a match, but the string lengths
      // vary, so return the length of the shortest string.
      return tamMaiorString;
    }
    return diferenca;
  }
  
  public static void main(String[] args) {
    String[] pesquisar = {"Nós gostamos de tudo, nós queremos é mais ",
      "Nós queremos estar do seu lado"};
    int n = indiceDiffString(pesquisar);
    if (n >= 0) {
      System.out.printf("As strings \"%s\" e \"%s\" começam a diferir na posição %d\n", pesquisar[0], pesquisar[1], n);
    }    
  }
  
  
}