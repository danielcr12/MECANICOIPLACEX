package mecanico;
import java.util.*;
import static java.util.Collections.frequency;
public class Pedido {
	private String nombreCliente;
	private final ArrayList<Repuesto> listaRepuestos;
	private String Nombre;
	
public Pedido ()

{
	listaRepuestos = new ArrayList <Repuesto>();
}

public String agregarRepuesto(int codigo, String marca, String nombre, double precio, int cantidad)
{
	Repuesto repu = new Repuesto();
	repu.setCodigo(codigo);
	repu.setMarca(marca);
	repu.setNombre(nombre);
	repu.setPrecio(precio);
	repu.setCantidad(cantidad);
	listaRepuestos.add(repu);
	return "Pedido Ingresado";	
}

public String listarRepuestos()
{
	int i = 1;
	StringBuilder sb = new StringBuilder();
	for (Repuesto repu : listaRepuestos)
	{
		sb.append("Lista de Repuestos").append(i).append("\n");
		sb.append("-----------------------------------------").append("\n");
		sb.append("Codigo: ").append(repu.getCodigo()).append("\n");
		sb.append("Marca: ").append(repu.getMarca()).append("\n");
		sb.append("Nombre: ").append(repu.getNombre()).append("\n");
		sb.append("Precio: ").append(repu.getPrecio()).append("\n");
		sb.append("Cantidad: ").append(repu.getCantidad()).append("\n");
		i++;
	}
		System.out.println (sb.toString());
		return sb.toString();
}
public String obtenerRepuestosMarca(String marca)
{
	StringBuilder sb1 = new StringBuilder();
	listaRepuestos.stream().filter(repu -> (repu.getMarca().equals(marca))).map(repu -> {
		sb1.append("Codigo: ").append(repu.getCodigo()).append("\n");
			return repu;
		}).map(repu -> {
			sb1.append("Marca: ").append(repu.getMarca()).append("\n");
			return repu;
		}).map(repu -> {
			sb1.append("Nombre: ").append(repu.getNombre()).append("\n");
			return repu;
		}).map(repu -> {
			sb1.append("Precio: ").append(repu.getPrecio()).append("\n");
			return repu;
		}).forEachOrdered(repu -> {
			sb1.append("Cantidad: ").append(repu.getCantidad()).append("\n");
		});
		return sb1.toString();
}

public String eliminarRepuesto(int codigo)
{
	String msj = "No se encontro el repuesto";
	for (Repuesto repu : listaRepuestos)
	{
		if (codigo == repu.getCodigo())
		{
		listaRepuestos.remove(repu);
		msj = "Repuesto eliminado";
		}
	}
	return msj;
}

public String totalProductos (String marca)
{
	double precioTotal = 0.00;

	for(Repuesto repu : listaRepuestos)
	{
		precioTotal += repu.getPrecio();
	}

	System.out.println(precioTotal);
		return "";
}
}
