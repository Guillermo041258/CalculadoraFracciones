/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PedirDatos  {
    
    
    public static void main(String[] args) throws IOException
    {
  int termA,termB,termC,termD;  
  String posicion;
 Scanner entrada = new Scanner(System.in);
 BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
 
 System.out.println("Dame el termino A");
termA = entrada.nextInt();

System.out.print("Dame el termino B");
termB = entrada.nextInt();

System.out.print("Dame el termino C");
termC = entrada.nextInt();

System.out.print("Dame el termino D");
termD = entrada.nextInt();

System.out.print("Escribe suma,resta,division, multiplicacion");
posicion = bc.readLine();



Operaciones envio = new Operaciones(termA,termB,termC,termD);

if(posicion.equalsIgnoreCase("Suma"))
envio.SumaDeFracciones();
else if(posicion.equalsIgnoreCase("Resta"))
 envio.RestadeFracciones();
else if(posicion.equalsIgnoreCase("Multiplicacion"))
envio.Multiplicacion();
else if(posicion.equalsIgnoreCase("Division"))
 envio.Division();



 
  
  
  
  
  
        
        
        
    }
    
}
