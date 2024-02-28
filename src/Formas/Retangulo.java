package Formas;

public class Retangulo {
    public int id;
    public double largura;
    public double comprimento;


    public Retangulo(int id, double largura, double comprimento){
        this.id = id;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public static double calcularAreaStatic(double x, double y){
        return x * y;
    }

    public double calcularArea(){
        return largura * comprimento;
    }

    public void enquadrar (){
        double media = (largura + comprimento)/2;
        largura = media;
        comprimento = media; 
    }

    public boolean ehQuadrado(){
        return comprimento == largura ? true : false;   
    }

    



    public static void main(String[] args) {
        // Retangulo ret = new Retangulo(1, 20, 10);
        // System.out.println(ret.calcularArea());

        Retangulo ret2 = new Retangulo(1, 3,5);
        System.out.println(ret2.calcularArea());
        System.out.println(ret2.ehQuadrado());
        ret2.enquadrar();
        System.out.println(ret2.ehQuadrado());
        System.out.println(ret2.calcularArea());

    }
}


