
public class ItemCarrito extends Producto {

	double ItemCPrecTotal;

	// CONSTRUCTOR
	
	public ItemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal) {

		super(ProdNombre, ProdCantidad, ProdPrecio);
		this.ItemCPrecTotal = ItemCPrecTotal;
	}

}
