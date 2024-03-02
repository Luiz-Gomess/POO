public class AlunoFlex {
    public double [] notas;

    public AlunoFlex (double ... notas){
            this.notas = notas;
    }

    public void imprimirNotas(){
        for(double nota : this.notas){
            System.out.println(nota);
        }
    }

    public static void main(String[] args) {
        AlunoFlex af1 = new AlunoFlex(10.0, 20.0, 30.0);
        af1.imprimirNotas();
    }
}