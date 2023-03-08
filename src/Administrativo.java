import java.util.Scanner;

public class Administrativo extends Funcionario
{
    //Scanner entrada = new Scanner(System.in);
    private double horasTrabalhadas;
    private double horasExtras;
    private double valorHora;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calculoSalario()
    {
       double calcHoras = (horasTrabalhadas * valorHora) + (horasExtras + valorHora);

        if(horasTrabalhadas > 44)
        {
            System.out.println("O total de horas trabalhadas é: " + calcHoras);
        }
        else
        {
            return calcHoras;
        }
        return calcHoras;
    }
}
