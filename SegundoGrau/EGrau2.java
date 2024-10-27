package SegundoGrau;

public class EGrau2 {

public double a, b, c;

public EGrau2 (double a, double b, double c){

     this.a = a; 
     this.b = b; 
     this.c = c; 

}

public double delta (){

     double delta;

     delta = (Math.pow(b, 2)) - 4 * a * c; 

     return delta; 
}

public double calculaX1 (double delta){

     double x1;

     x1 = (-b + Math.sqrt(delta)) / (2*a);

     return x1;
}

public double calculaX2 (double delta){

     double x2;

     x2 = (-b - Math.sqrt(delta)) / (2*a);

     return x2;

}
     
}