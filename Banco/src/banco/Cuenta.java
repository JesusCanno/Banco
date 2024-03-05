package banco;

public class Cuenta {

	private String cod_cuenta;
	
	private String  cod_cliente;
	
	private double saldo;
	
	
	public Cuenta( String cod_cliente, String cod_cuenta, double saldo) {
		this.cod_cuenta = cod_cuenta; 
		this.cod_cliente = cod_cliente;
		this.saldo = saldo;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public void sacar(double cantidad) {
		saldo -= cantidad;
	}
	
	public void verCuenta() {
		System.out.println("Codigo Cuenta" +cod_cuenta);
		System.out.println("Codigo Cliente " +cod_cliente);
		System.out.println("Saldo" +saldo);
	}
	

}
