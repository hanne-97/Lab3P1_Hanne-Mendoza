/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_hannemendoza;
import java.util.Scanner;
public class Lab3P1_HanneMendoza {
    public static void main(String[] args) {
        Scanner kore = new Scanner(System.in);
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.println("Ingrese su opción: ");
        int opcion= kore.nextInt();
        
        while(opcion>0 || opcion<4){
            switch(opcion){
                
                case 1:
                    System.out.print("Ingrese su número inicial: ");
                    int inicial = kore.nextInt();
                    System.out.print("Ingrese la diferencia: ");
                    int diferencia = kore.nextInt();
                    System.out.print("Cantidad: ");
                    int cantidad = kore.nextInt();
                    
                    for(int i =0; i<cantidad; i++){
                        System.out.print(inicial + ",");
                        inicial+=diferencia;
                        diferencia++;
                        }
                    System.out.println("\nQue número desea ver más adelante en la sucesión? ");
                    int sucesion = kore.nextInt();
                    for(int n =0; n<sucesion; n++){
                    }
                    System.out.println("El número sería: " + sucesion*diferencia);
                    break;    
            
                
                    case 3:
                        System.out.println("Ingrese un número impar y mayor a 7: ");
                        int n = kore.nextInt();
                        int medio = (n/2)+1;
                        System.out.println("medio" + medio);
                        int pos1 = 2;
                        int pos2 = n-1;
                        int pos3 = pos1;
                        System.out.println("pos1: "+ pos1);
                        System.out.println("pos2: " + pos2);
                        if(!(n%2==0) && (n>=7)){
                            System.out.println("Nmero valido");
                        }else{
                            System.out.println("Numero invalido"); 
                        }
                        for(int i =1 ; i<=n; i++){
                            
                          for(int j=1; j<=n; j++){
                             /* System.out.print("pos3 " + pos3);
                              System.out.print("pos2 " + pos2); */
                                if(i==1 || i==n || j==1 || j==n){
                                
                                    System.out.print("* ");
                                } else{
                                    System.out.print(" ");
                                
                                    if(j==medio){
                                        System.out.print("|");
                                    }
                                    
                                    
                                    if((j==pos1)&&(i==pos1)){
                                        if(j!=medio){
                                            System.out.print(">");
                                        }                                        
                                    pos1++;    
                                    }
                                    
                                    
                                    if((i==pos3) && (j==pos2)){
                                        
                                        if(j!=medio){
                                            System.out.print(">");
                                        }
                                       pos2--;
                                       pos3++;
                                        
                                    } 
                                    
                                    
                                    
                                    
                                }
                            }
                             
                            
                            System.out.println();
                        }
                    break;
                   
            }
        System.out.println("1. Sucesiones y más sucesiones!");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterisco en casa!");
        System.out.println("Ingrese su opción: ");
        opcion= kore.nextInt();
        
        }
    }
}
                    
                    
                 
                            
        
    
            
            
        
        
        
        
        
        
    
    

    
