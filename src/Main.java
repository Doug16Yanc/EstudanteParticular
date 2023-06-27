
public class Main
{
    public static void main(String[] args)
    {
        EstudanteBolsista  estudanteBolsista = new EstudanteBolsista("Júlia Oliveira", "222-22-2222", "3045", 3 );
        EstudanteGeral  estudanteGeral = new EstudanteGeral("Samuel Cavalcante", "333-33-3333", "4678", 1600.00);
        VestibularMedicina vestibularMedicina = new VestibularMedicina("Levi de Souza", "444-44-4444", "5032", 2000.00, 4.0);
        EstudanteMilitar estudanteMilitar = new EstudanteMilitar("Artur Freitas", "555-55-5555", "6321", 2300.00, 9.0, 7.5, 8.1);

        System.out.println("Bem-vindo(a) ao programa Java que mostra dados de estudantes de maneira polimórfica.");

        System.out.printf("%s%n%s %n%n", estudanteBolsista, "Isento de mensalidade.", "Número de ingresso", estudanteBolsista.calculadoraDeMensalidades());
        System.out.printf("%s%n%s : R$%,.2f%n%n", estudanteGeral, "Valor da mensalidade: ", estudanteGeral.calculadoraDeMensalidades());
        System.out.printf("%s%n%s : R$%,.2f%n%n", vestibularMedicina, "Valor da mensalidade: ", vestibularMedicina.calculadoraDeMensalidades());
        System.out.printf("%s%n%s : R$%,.2f%n%n", estudanteMilitar, "Valor da mensalidade: ", estudanteMilitar.calculadoraDeMensalidades());
    }
}
