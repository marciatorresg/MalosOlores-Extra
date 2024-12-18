/**
 * Ejemplo de solución para el mal olor "Switch Statements".
 * 
 * Fuente: ChatGPT. (2024). Ejemplo y solución para el mal olor "Switch Statements" en Java. OpenAI. 
 * Recuperado de https://chat.openai.com
 */
public class CalculadoraPrecio {
    public double calcularPrecio(String tipoProducto, double precioBase) {
        switch (tipoProducto) {
            case "Libro":
                return precioBase * 0.9;
            case "Electronico":
                return precioBase * 1.2; 
            case "Ropa":
                return precioBase; 
            default:
                throw new IllegalArgumentException("Tipo de producto desconocido");
        }
    }
}

// Solucion

public abstract class Producto {
    public abstract double calcularPrecio(double precioBase);
}
public class Libro extends Producto {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 0.9; 
    }
}

public class Electronico extends Producto {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 1.2; 
    }
}

public class Ropa extends Producto {
    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase; 
    }
}

