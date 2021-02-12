package calculadora;
public class CalculadoraCalculo {
    private String cadena;
    private double resultado;
    private boolean suma, resta, multiplicacion, division, raiz, sen, cos, tan, potencia,IVA,c;
    
    public CalculadoraCalculo(){
        cadena="";
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        raiz=false;
        sen=false;
        cos=false;
        tan=false;
        potencia=false;
        IVA=false;
        c=false;
    }
    
    public String concatenamiento (String cadena){
        this.cadena=this.cadena+cadena;
        return this.cadena;
        
    }
    public void suma(String cadena){
        this.resultado=Double.parseDouble(cadena);
        suma=true;
        this.cadena="";
        
    }
    public void resta(String cadena){
        this.resultado=Double.parseDouble(cadena);
        resta=true;
        this.cadena="";
    }
    public void multiplicacion(String cadena){
        this.resultado=Double.parseDouble(cadena);
        multiplicacion=true;
        this.cadena="";
    }
    public void division(String cadena){
        this.resultado=Double.parseDouble(cadena);
        division=true;
        this.cadena="";
    }
    public void raiz(String cadena){
        this.resultado=Double.parseDouble(cadena);
        raiz=true;
        this.cadena="";
    }
    public void sen(String cadena){
        this.resultado=Double.parseDouble(cadena);
        sen=true;
        this.cadena="";
    }
    public void cos(String cadena){
        this.resultado=Double.parseDouble(cadena);
        cos=true;
        this.cadena="";
    }
    public void tan(String cadena){
        this.resultado=Double.parseDouble(cadena);
        tan=true;
        this.cadena="";
    }
    public void potencia(String cadena){
        this.resultado=Double.parseDouble(cadena);
        potencia=true;
        this.cadena="";
    }
    public void IVA(String cadena){
        this.resultado=Double.parseDouble(cadena);
        IVA=true;
        this.cadena="";
    }
    public void c(String cadena){
        this.resultado=Double.parseDouble(cadena);
        c=true;
        this.cadena=""; 
    }
  
    public double resultado(String numero){
        if(suma==true){
            resultado=resultado+Double.parseDouble(numero);
          
        }
        else if(resta==true){
            resultado=resultado-Double.parseDouble(numero); 
        }
        else if(multiplicacion==true){
            resultado=resultado*Double.parseDouble(numero);
        }
        else if(division==true){
            
            if(resultado==0){
                System.out.println("Syntaxis Error");
            }
            else{
                resultado=resultado/Double.parseDouble(numero);
            }
        }
        else if (raiz==true){
            
            if(resultado==0){
                System.out.println("Syntaxis Error");
            }
            else{
                resultado=Math.pow(resultado, (1/Double.parseDouble(numero)));
            }
        }
        else if (sen==true){
            double sen=Math.toRadians(resultado);
            resultado=Math.sin(sen);
        }
         else if (cos==true){
            double cos=Math.toRadians(resultado);
            resultado=Math.cos(cos);
        }
         else if (tan==true){
            
            if(resultado==90||resultado==-90){
                System.out.println("Syntaxis Error");
            }
            else {
                double tan=Math.toRadians(resultado);
            resultado=Math.tan(tan);
            }
        }
         else if (potencia==true){
             resultado=Math.pow(resultado,Double.parseDouble(numero));
         }
         else if (IVA==true){
             resultado=Double.parseDouble(numero)*0.19;
         }
         else if (c==true){
             resultado=0;
         }
        cadena="";
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        raiz=false;
        sen=false;
        cos=false;
        tan=false;    
        potencia=false;
        IVA=false;
        c=false;
        return resultado;
    }

}
