
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


abstract class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo;
    }
}

class CuentaCorriente extends Cuenta {
    public CuentaCorriente(double saldo) {
        super(saldo);
    }
}

class CuentaFija extends Cuenta {
    public CuentaFija(double saldo) {
        super(saldo);
    }
}

class CuentaTemporal extends Cuenta {
    public CuentaTemporal(double saldo) {
        super(saldo);
    }

    @Override
    public boolean retirar(double monto) {
        if (super.retirar(monto)) {
            if (saldo == 0) {
                deshabilitarCuenta();
            }
            return true;
        }
        return false;
    }

    private void deshabilitarCuenta() {
        System.out.println("La cuenta temporal ha sido deshabilitada debido a saldo 0.");
    }
}


abstract class Tarjeta {
    protected Cuenta cuenta;

    public Tarjeta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public abstract boolean retirar(double monto);
}

class TarjetaCredito extends Tarjeta {
    private double limiteCredito;

    public TarjetaCredito(Cuenta cuenta, double limiteCredito) {
        super(cuenta);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= limiteCredito) {
            limiteCredito -= monto;
            return true;
        }
        return false;
    }
}

class TarjetaDebito extends Tarjeta {
    public TarjetaDebito(Cuenta cuenta) {
        super(cuenta);
    }

    @Override
    public boolean retirar(double monto) {
        return cuenta.retirar(monto);
    }
}

class TarjetaPrePago extends Tarjeta {
    public TarjetaPrePago(CuentaTemporal cuenta) {
        super(cuenta);
    }

    @Override
    public boolean retirar(double monto) {
        return cuenta.retirar(monto);
    }
}


class Banco {
    private Map<String, Cuenta> cuentas = new HashMap<>();
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public void agregarCuenta(String id, Cuenta cuenta) {
        cuentas.put(id, cuenta);
    }

    public Cuenta obtenerCuenta(String id) {
        return cuentas.get(id);
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public boolean realizarRetiro(String id, double monto) {
        Cuenta cuenta = obtenerCuenta(id);
        if (cuenta != null) {
            return cuenta.retirar(monto);
        }
        return false;
    }
}


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        
        CuentaCorriente cuenta1 = new CuentaCorriente(500);
        CuentaFija cuenta2 = new CuentaFija(100);
        CuentaTemporal cuenta3 = new CuentaTemporal(100);

        banco.agregarCuenta("1", cuenta1);
        banco.agregarCuenta("2", cuenta2);
        banco.agregarCuenta("3", cuenta3);

        
        TarjetaDebito targeta2 = new TarjetaDebito(cuenta2);
        TarjetaDebito targeta1 = new TarjetaDebito(cuenta1);
        TarjetaDebito targeta3 = new TarjetaDebito(cuenta3);

        banco.agregarTarjeta(targeta1);
        banco.agregarTarjeta(targeta2);
        banco.agregarTarjeta(targeta3);

        
        System.out.println("");
        System.out.println("Saldo de cuenta: " + cuenta1.saldo);
        System.out.println("Retiro con tarjeta de débito: " + targeta1.retirar(50));
        System.out.println("Saldo de cuenta: " + cuenta1.saldo);
        System.out.println("");

        System.out.println("");
        System.out.println("Saldo de cuenta: " + cuenta2.saldo);
        System.out.println("Retiro con tarjeta de débito: " + targeta2.retirar(50));
        System.out.println("Saldo de cuenta: " + cuenta2.saldo);
        System.out.println("");

        System.out.println("");
        System.out.println("Saldo de cuenta: " + cuenta3.saldo);
        System.out.println("Retiro con tarjeta de débito: " + targeta3.retirar(100));
        System.out.println("Saldo de cuenta: " + cuenta3.saldo);
        System.out.println("");

    }
}
