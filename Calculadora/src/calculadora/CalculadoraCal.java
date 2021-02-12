package calculadora;

import java.util.Scanner;

/**
 *
 * @author Diepi
 */
public class CalculadoraCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        System.out.println("Elija una opcion e ingrese el numero");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Seno");
        System.out.println("6. Coseno");
        System.out.println("7. Tangente");
        System.out.println("8. Raiz");    
        System.out.println("9. Potencia");
        System.out.println("10. IVA");
        
        int opcion=entrada.nextInt();
        
        switch(opcion){
            
            case 1:
                
                     System.out.println("ingrese el primer numero");
               int num1=entrada.nextInt();              
                     System.out.println("ingrese el segundo numero");
               int num2=entrada.nextInt();
               int y=num1+num2;
               
                System.out.println(y);
                
                break;
            case 2:
                
                     System.out.println("ingrese el primer numero");
               int num3 =entrada.nextInt();
                     System.out.println("ingrese el segundo numero");
               int num4 =entrada.nextInt();
               int yy=num3-num4;
               
                System.out.println(yy);
                
                break;    
            case 3:
                
                     System.out.println("ingrese el primer numero");
               int num5 =entrada.nextInt();
                     System.out.println("ingrese el segundo numero");
               int num6 =entrada.nextInt();
               int yyy=num5*num6;
               
                System.out.println(yyy);
                
                break;   
            case 4:
                
                     System.out.println("ingrese el primer numero");
               int num7 =entrada.nextInt();
                     System.out.println("ingrese el segundo numero");
               int num8 =entrada.nextInt();
               
               
               if(num7==0||num8==0){
                   System.out.println("Syntaxis Error");   
                   
               }
               else{
                   
                 int yyyy=num7/num8;  
                   System.out.println(yyyy);
               }
            
               break;
                
            case 5:
                
                     System.out.println("ingrese el numero");
               int num9 =entrada.nextInt();
               double z=Math.sin(num9);
               
                System.out.println(z);
                
                break;
            case 6:
                
                     System.out.println("ingrese el numero");
               int num10 =entrada.nextInt();
               double zz=Math.cos(num10);
               
                System.out.println(zz);
                
                break;
            case 7:
                
                     System.out.println("ingrese el numero");
               int num11 =entrada.nextInt();
              
               
                if(num11==90||num11==-90){
                    
                System.out.println("Syntaxis Error");
            }
            else {
                   double zzz=Math.tan(num11);  
                System.out.println(zzz);
            }
                
                
                break;     
            case 8:
                
                     System.out.println("ingrese la base");
               int num12 =entrada.nextInt();
                     System.out.println("ingrese del exponente");
               int num16 =entrada.nextInt();
               
               
               if(num12==0||num16==0){
                 System.out.println("Syntaxis Error");   
               }
               else{
                   double zzzz=Math.pow(num12,num16);
                    System.out.println(zzzz);
               }
               
               
                
                break;
            case 9:
                
                     System.out.println("ingrese el valor de la base");
               int num13 =entrada.nextInt();
               System.out.println("ingrese el valor del exponente");
               int num14 =entrada.nextInt();

                   double zzzzz=Math.pow(num13,num14);
                   
                   System.out.println(zzzzz);
               
            break;
            case 10:
                
                     System.out.println("ingrese el valor a calcular IVA");
               double num15 =entrada.nextInt();
              
               double yz= num15*0.19;
               double xyz= num15+yz;
                System.out.println("valor del IVA" +yz);
                System.out.println("Valor total con IVA incluidow" +xyz);
                break; 
            
            default:
                System.out.println("Syntax error");
                break;
        }
        
        
    }
    
}
