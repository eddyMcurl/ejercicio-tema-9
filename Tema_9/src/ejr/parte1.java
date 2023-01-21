package ejr;

public class parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setEdad(24);
		nuevoCliente.setTelefono(987123456);
		nuevoCliente.setNombre("Jorge");
		nuevoCliente.setCredito(12);
		System.out.println("CLIENTE");
		System.out.println("EDAD "+nuevoCliente.getEdad());
		System.out.println("TELEFONO "+nuevoCliente.getTelefono());
		System.out.println("NOMBRE "+nuevoCliente.getNombre());
		System.out.println("CREDITO "+nuevoCliente.getCredito());
		System.out.println();
		Trabajador nuevoTrabajador = new Trabajador();
		nuevoTrabajador.setEdad(24);
		nuevoTrabajador.setTelefono(987123654);
		nuevoTrabajador.setNombre("JOSE");
		nuevoTrabajador.setSalario(123.4);
		System.out.println("TRABAJADOR");
		System.out.println("EDAD "+nuevoTrabajador.getEdad());
		System.out.println("TELEFONO "+nuevoTrabajador.getTelefono());
		System.out.println("NOMBRE "+nuevoTrabajador.getNombre());
		System.out.println("CREDITO "+nuevoTrabajador.getSalario());
		
	}

}
class Persona  {
	private int edad;
	private String nombre;
	private int telefono;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}

class Cliente extends Persona {
	

	private double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
}

class Trabajador extends Persona {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}