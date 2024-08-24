public class Empleado {
    public double calcularBono(double salario) {
        return salario * 0.10;
    }
}

class Gerente extends Empleado {
    @Override
    public double calcularBono(double salario) {
        return salario * 0.20;
    }
}

class Becado extends Empleado {
    @Override
    public double calcularBono(double salario) {
        return salario * 0.05;
    }
}