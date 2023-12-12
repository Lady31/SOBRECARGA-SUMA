public class Calculadora {


    public int sumar (int num1, int num2){
        return  num1 + num2;
    }
    public int sumar (int num1,int num2,int num3){
        return num1 + num2 + num3 + 5;

    }
    public double sumar (double num1,double num2){
        return num1 + num2 + 2;
    }


    public void imprimir (int num1, int num2){
        int total = sumar(num1,num2);
        System.out.println("EL TOTAL DE LA SUMA ES: "+total);
    }

    public void imprimir (int num1,int num2, int num3){
        int total =sumar(num1,num2,num3);
        System.out.println("EL TOTAL DE LA SUMA ES: "+total);
    }

    public void imprimir (double num1,double num2){
        double total =sumar(num1,num2);
        System.out.println("EL TOTAL DE LA SUMA ES: "+total);
    }

    public static  void main (String []args){

        Calculadora suma1 = new Calculadora();
        suma1.imprimir(8,10);
        suma1.imprimir(5,6,9);
        suma1.imprimir(25.12,15.99);

    }

}

