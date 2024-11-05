import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa a = new Aluno();
        Professor p = new Professor();
        Pessoa c = new Coordenador();
        TransformacaoPolimorfica t = new TransformacaoPolimorfica();

        p.responsabilidade();
        p.calcSalario();
        t.polimorfismo_interface(p);

        p.calcularSalario();
    }
}
