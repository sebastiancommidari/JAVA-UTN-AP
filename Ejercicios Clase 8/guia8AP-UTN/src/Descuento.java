
public class Descuento extends ItemCarrito {
    double DescuentoDesc;

    // CONSTRUCTOR
    
    public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc){
        super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal);
        this.DescuentoDesc = DescuentoDesc;
    }


}
