class Palavra {

  String palavra;
  int nDeLetras;

  Palavra(String plv , int nLetras){
    palavra = plv;
    nDeLetras = nLetras;
  }
  
  String getPalavra(){
    System.out.println("|| palavra: " + palavra + "");
  }

  int getNDeLetra(){
    System.out.println("|| nDeLetras: " + nDeLetras + "");
  }
}