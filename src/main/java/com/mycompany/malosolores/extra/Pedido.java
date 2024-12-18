
/**
 * Ejemplo de solución para el mal olor "Primitive Obsession".
 * 
 * Fuente: ChatGPT. (2024). Ejemplo y solución para el mal olor "Primitive Obsession" en Java. OpenAI. 
 * Recuperado de https://chat.openai.com
 */
public class Pedido {
    private String direccionEntrega;

    public Pedido(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
}
public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public class Pedido {
        private Direccion direccionEntrega;
    }
}
