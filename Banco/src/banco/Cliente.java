package banco;

public class Cliente {
		private  String cod_cliente;
		private String nombre;
		
		
		public Cliente(  ) {
		}
		
		public void crearCliente(String cod_cliente, String nombre) {
			this.cod_cliente = cod_cliente;
			this.nombre = nombre;
		}
		
		public void verCliente(String cod_cliente, String nombre) {
			System.out.println( "Codigo Cliente" +cod_cliente  );
			System.out.println( "Nombre Cliente"+nombre );
		}
}
