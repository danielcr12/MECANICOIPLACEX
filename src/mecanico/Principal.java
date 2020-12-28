package mecanico;
import java.util.*;
public class Principal {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		Pedido pedido = new Pedido();
		int opcion, codigo, elin;
		String marca, nombre, transfer, elemento, marcaS;
		String sb;
		String sb1;
		
		do
		{
		System.out.println("Bienvenido al sistema de compras");
		System.out.println("1.- Agregar Repuesto");
		System.out.println("2.- Mostrar Todo");
		System.out.println("3.- Verificar Repuesto");
		System.out.println("4.- Eliminar Repuesto");
		System.out.println("5.- Mostrar Total por Marca");
		System.out.println("0.- Salir");
		opcion = read.nextInt();
		
		switch (opcion) {
			case 1:
				//Agregar
				System.out.println("Ingrese el Codigo");
				codigo = read.nextInt();
				System.out.println("Ingrese la Marca");
				marca = read.next();
				System.out.println("Ingrese el Nombre");
				nombre = read.next();
				System.out.println("Ingrese el Precio");
				String precio1 = read.next();
				double precio = Double.parseDouble(precio1);
				System.out.println("Ingrese la Cantidad");
				String cantidad1 = read.next();
				int cantidad = Integer.parseInt(cantidad1);
				transfer = pedido.agregarRepuesto(codigo, marca, nombre, precio, cantidad);
				System.out.println(transfer);
				break;

			case 2:
				//Mostar
				pedido.listarRepuestos();
				break;
			case 3:
				//Buscar
				System.out.println("Ingrese Marca a Buscar");
				String marcab = read.next();
				String busqueda = pedido.obtenerRepuestosMarca(marcab);
				System.out.println("Informacion del Repuesto");
				System.out.println(busqueda);
				break;
			case 4:
				//Eliminar
				System.out.println("Ingrese Codigo a Eliminar");
				elin = read.nextInt();
				sb = pedido.eliminarRepuesto(elin);
				System.out.println(sb);
				break;
			case 5:
				//Total
				System.out.println("Ingrese el Nombre de la Marca");
				String marcat = read.next();
				String totalmarca = pedido.totalProductos(marcat);
				System.out.println("El precio total de la Marca, es de: ");
				System.out.println(totalmarca);
				break;
			case 0:
				System.out.println("Adios");
		}
		} while (opcion != 0);
	}
}
