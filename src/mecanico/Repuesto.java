package mecanico;
import java.util.*;
public class Repuesto 
{
	private int codigo;
	private String marca;
	private String nombre;
	private double precio;
	private int cantidad;
	
public Repuesto() {
	
	}
public  Repuesto (int codigo, String marca, String nombre, double precio, int cantidad)
{
	this.codigo = codigo;
	this.marca = marca;
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}

public int getCodigo()
{
return codigo;
}
public String getMarca()
{
return marca;	
}
public String getNombre()
{
return nombre;	
}
public double getPrecio()
{
return precio;	
}
public int getCantidad()
{
return cantidad;
}
	
public void setCodigo(int codigo)
{
this.codigo = codigo;
}
public void setMarca(String marca)
{
this.marca = marca;
}
public void setNombre(String nombre)
{
this.nombre = nombre;
}
public void setPrecio(double precio)
{
this.precio = precio;
}
public void setCantidad(int cantidad)
{
this.cantidad = cantidad;
}

	@Override
	public String toString()
{
	return "Repuesto: " + "Codigo: " + codigo + "Marca: " + marca + "Nombre: " + nombre + "Precio: " + precio + "Cantidad: " + cantidad;
}
}
