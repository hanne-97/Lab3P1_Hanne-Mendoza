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
                    System.out.println("El número sería: " + sucesion*n);
                    }
                    break;    
                    
                    
                /*case 2: 
                    System.out.println("Que modo de pelea desea jugar? ");
                    System.out.println("1. Hasta la muerte");
                    System.out.println("2. Por rondas");
                    int modo = kore.nextInt();
                    System.out.println("Estadísticas de los pokemones");
                    System.out.println("Sylveon" + " Vida: 280" + " Ataque:80" + " Defensa:15%");
                    System.out.println("Gyarados" + " Vida: 300" + " Ataque:50" + " Defensa:10%");
                    System.out.println("Giratina" + " Vida: 300" + " Ataque:70" + " Defensa:25%");
                    System.out.println("Dragonite" + " Vida: 250" + " Ataque:75" + " Defensa:20%");
                    System.out.println("Ingrese una pelea determinada: ");
                    System.out.println("1. Sylveon vrs Dragonite");
                    System.out.println("2. Gyarados vrs Giratina");
                    System.out.println("3. Dragonite vrs Giratina");
                    System.out.println("4. Giratina vrs Sylveon");
                    int pelea = kore.nextInt();
                    int vida1 = 280; vida2 =300; vida3=
                    
                    switch(pelea){
                        case 1:
                            
                        case 2:
                            
                            System.out.println("---------------Ronda 1---------------");    
                            System.out.println("Vida de pokemon 1: " );
                            System.out.println("Vida de pokemon 2: " );
                            
                            System.out.println("Pokemon 1 Ha atacado!");
                            System.out.println("Pokemon 2 Ha atacado!");
                            System.out.println("Vida de pokemon 1: " );
                            System.out.println("Vida de pokemon 2: " );
                            
                            
                    }*/
                    
                    
                    
                    
                case 3:
                    System.out.println("Ingrese un número impar y mayor a 7: ");
                    int num =kore.nextInt();
                    
                    if(num>=7){
                    for(int i =0 ; i<=num ; i++){
                        if(i==0 || i==num ){
                            System.out.print("* ");
                            }else{
                               System.out.print(" ");
                            }
                        
                        for(int j =0 ; j<=num ; j++){  
                            if(j==1 || i==1){
                             System.out.print(">");   
                            }else{
                             System.out.print(" ");   
                            }
                            if(j==num/2){
                              System.out.print("|");  
                            }else{
                             System.out.print(" ");   
                            } 
                        System.out.println(); 
                        }    
                    
                    break;
                    
                    }
                    }
            }
        }
            
            
            }
        
        
        
        
        
        
    }
    

    
