package interfaces;

public class PizzaBase implements IPreparable
{
 private String nombre;
 private double price;
 public PizzaBase(String n, double p)
 {
     this.nombre=n;
     this.price=p;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void prepare ()
 {
     System.out.println("Preparando la pizza...");
     System.out.println("La pizza esta lista!!!");
 }



}
