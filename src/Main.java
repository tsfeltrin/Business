import java.util.Scanner;

public class Main
{    //Criar uma aplicação que permite ao usuário escolher qual tipo de funcionário o usuário deseja cadastrar:
    //1) GERENTE
    //2) ADMINISTRATIVO
    //3) ESTAGIÁRIO
    //
    //O gerente deve, além de cadastrar os seus dados, calcular quantas horas a mais ele trabalhou na semana, considerando um valor de horas como entrada e a semana como 44 horas.
    //
    //O administrativo deve calcular o seu salário, com base em horas trabalhadas, horas extras e o valor da hora trabalhada.
    //
    //O estagiário entra com as horas de estágio na semana, q
    //O estagiário entra com as horas de estágio na semana, quantos meses ele estagiou  e calcula-se quantas horas ele estagiou
    //Mostrar na tela todos os dados inseridos e calculados. Criar, além do menu principal, a opção do usuário SAIR
    //
    //GERENTE: nome, idade, bairro, horasMais
    //ADMINISTRATIVO: horasTrab, horasEx, valorHora
    //ESTAGIARIO: horasEst, mesesEst, HorasT
    //
    //FUNCIONARIO: nome, idade, bairro
    //GERENTE: horasTrab, horasMais
    //ADMINISTRATIVO: horasTrab, horasEx, valorHora
    //ESTAGIARIO: horasEst, mesesEst,
    //ESTAGIARIO: horasEst, mesesEst, HorasT
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        int op = 0;

        while (op != 4)
        {
            System.out.println("Qual opção você deseja? ");
            System.out.println(" 1-Gerente: \n 2-Administrativo: \n 3-Estagiario: \n 4-Sair");
            op = (Integer.parseInt(leitura.nextLine()));
            if (op==1)
            {
                Gerente gerente = new Gerente();
                System.out.println("Informe o seu nome: ");
                gerente.setNome(leitura.nextLine());
                System.out.println("Informe seu bairro: ");
                gerente.setBairro(leitura.nextLine());
                System.out.println("Informe sua Idade: ");
                gerente.setIdade(Integer.parseInt(leitura.nextLine()));

                System.out.println("Informe quantas horas foram trabalhadas: ");
                gerente.setHorasTrab(Integer.parseInt(leitura.nextLine()));
                System.out.println("Quantas horas extras foram feito: ");
                gerente.setHorasMais(Integer.parseInt(leitura.nextLine()));

                System.out.println("Funcionario: " + gerente.getNome() + "Horas extras: " + gerente.getHorasMais());

            }
            else if (op==2)
            {
               Administrativo adm = new Administrativo();
                System.out.println("Informe o seu nome: ");
                adm.setNome(leitura.nextLine());
                System.out.println("Informe seu bairro: ");
                adm.setBairro(leitura.nextLine());
                System.out.println("Informe sua Idade: ");
                adm.setIdade(Integer.parseInt(leitura.nextLine()));

                System.out.println("Informe quantas horas extras foram trabalhadas: ");
                adm.setHorasExtras(Integer.parseInt(leitura.nextLine())); // fazer com todos que tem int
                System.out.println("Quantas horas foram feito: ");
                adm.setHorasTrabalhadas(Integer.parseInt(leitura.nextLine()));
                System.out.println("Qual o valor da hora de trabalho? ");
                adm.setValorHora(Integer.parseInt(leitura.nextLine()));

                System.out.println("Funcionario: " + adm.getNome() + "Salário: " + adm.calculoSalario());
            }

            else if (op==3)
            {
                Estagiario est = new Estagiario();
                System.out.println("Informe o seu nome: ");
                est.setNome(leitura.nextLine());
                System.out.println("Informe seu bairro: ");
                est.setBairro(leitura.nextLine());
                System.out.println("Informe sua Idade: ");
                est.setIdade(Integer.parseInt(leitura.nextLine()));

                System.out.println("Informe total de horas semanais: ");
                est.setHorasSemanais(Integer.parseInt(leitura.nextLine())); // fazer com todos que tem int
                System.out.println("Informe o total de meses trabalhado: ");
                est.setTotalMeses(Integer.parseInt(leitura.nextLine()));

                System.out.println("Estagiário: " + est.getNome() + "Total de Horas Estagiado: " + est.totalHoras());
            }
        }
    }
}