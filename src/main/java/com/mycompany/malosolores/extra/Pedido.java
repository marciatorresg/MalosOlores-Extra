public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private String direccionEntrega;
    private String metodoPago;
    private boolean esUrgente;

    public Pedido(String cliente, String producto, int cantidad, double precioUnitario, 
                  String direccionEntrega, String metodoPago, boolean esUrgente) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.direccionEntrega = direccionEntrega;
        this.metodoPago = metodoPago;
        this.esUrgente = esUrgente;
    }
}

// Solución
public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private String direccionEntrega;
    private String metodoPago;
    private boolean esUrgente;

    // Constructor privado
    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.producto = builder.producto;
        this.cantidad = builder.cantidad;
        this.precioUnitario = builder.precioUnitario;
        this.direccionEntrega = builder.direccionEntrega;
        this.metodoPago = builder.metodoPago;
        this.esUrgente = builder.esUrgente;
    }
    // Builder
    public static class Builder {
        private String cliente;
        private String producto;
        private int cantidad;
        private double precioUnitario;
        private String direccionEntrega;
        private String metodoPago;
        private boolean esUrgente;

        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder producto(String producto) {
            this.producto = producto;
            return this;
        }

        public Builder cantidad(int cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder precioUnitario(double precioUnitario) {
            this.precioUnitario = precioUnitario;
            return this;
        }

        public Builder direccionEntrega(String direccionEntrega) {
            this.direccionEntrega = direccionEntrega;
            return this;
        }

        public Builder metodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
            return this;
        }

        public Builder esUrgente(boolean esUrgente) {
            this.esUrgente = esUrgente;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}
