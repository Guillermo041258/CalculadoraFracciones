/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author USER
 */
public class Operaciones {

    private int termA, termB, termC, termD, min1, min2, mcm;
    private int division1, division2;
    public int suma,resta;
    
    
    public Operaciones(int termA, int termB, int termC, int termD) {
        this.termA = termA;
        this.termB = termB;
        this.termC = termC;
        this.termD = termD;
    }


 private int MCM() {
        int min;

        min = Math.min(termB, termD);

        for (int i = 1; i < min; i++) {
            if (termB % i == 0 && termD % i == 0) {
                int mcd = i;
                mcm = (termB * termD) / mcd;

            }
        }
        return mcm;
    }
    
    
     public int SumaDeFracciones() {
         MCM();      
       division1 = mcm/ termB;
       min1 = division1 * termA;
      division2 = mcm /termD;
      min2 = division2 * termC;
      suma = min1 + min2;
      
      
     System.out.print(suma + "/ " + mcm);  
return suma;
    }
   public int  RestadeFracciones()
   {
       MCM();
       
       
      division1 = mcm/ termB;
       min1 = division1 * termA;
      division2 = mcm /termD;
      min2 = division2 * termC;
      resta = min1 - min2;   
      System.out.print(resta + "/ " + mcm);
     return resta;   
   }
   public void Multiplicacion()
   {
  int resultado,resultado2;
   resultado = termA * termC;
   resultado2 = termB * termD;
   
 System.out.print("El resultado tiene " + resultado + "/ " + resultado2);
   }
   
   public void Division()
   {
  int resultado,resultado2;
   resultado = termA * termD;
   resultado2 = termB * termC;
   
 System.out.print("El resultado tiene " + resultado + "/ " + resultado2);
       
       
   }
     

}
