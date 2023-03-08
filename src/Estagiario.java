import java.util.Scanner;

public class Estagiario extends Funcionario
{
    double horasSemanais;
    double totalMeses;

    public double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public double getTotalMeses() {
        return totalMeses;
    }

    public void setTotalMeses(double totalMeses) {
        this.totalMeses = totalMeses;
    }

    public double totalHoras()
    {
        double totalHoras = horasSemanais * totalMeses;
        return totalHoras;
    }
}
