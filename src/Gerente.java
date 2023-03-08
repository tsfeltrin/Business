import java.util.Scanner;

public class Gerente extends Funcionario
{
    private int horasTrab;
    private int horasMais;
    public int getHorasTrab()
    {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab)
    {
        this.horasTrab = horasTrab;
    }

    public int getHorasMais()
    {
        return horasMais;
    }

    public void setHorasMais(int horasMais)
    {
        this.horasMais = horasMais;
    }

    public int calculoHoras(){
        horasMais = horasTrab -44;
        return horasMais;
    }
}
