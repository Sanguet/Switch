package Clases;

import java.util.List;

/**
 *
 * @author ivan
 * Creacion de la cuenta corriente
 */
public class Cuenta_corriente {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private int id_cliente;
    private double monto;
    private int id_metodo_de_pago;
    private String comentario;
    
    //Constructors

    public Cuenta_corriente(int id, int id_cliente, double monto, int id_metodo_de_pago, String comentario) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.monto = monto;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.comentario = comentario;
    }

    public Cuenta_corriente(int id_cliente, double monto, int id_metodo_de_pago, String comentario) {
        this.id = -1;
        this.id_cliente = id_cliente;
        this.monto = monto;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.comentario = comentario;
    }

    public Cuenta_corriente(int id_cliente) {
        this.id = -1;
        this.id_cliente = id_cliente;
    }
    
    
    
    public Cuenta_corriente() {
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public double getMonto() {
        return monto;
    }

    public int getId_metodo_de_pago() {
        return id_metodo_de_pago;
    }

    public String getComentario() {
        return comentario;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setId_metodo_de_pago(int id_metodo_de_pago) {
        this.id_metodo_de_pago = id_metodo_de_pago;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarCuentasCorrientes(List<Cuenta_corriente> cuentas_corrientes){
        /*Este metodo  muestra la lista de las cuentas corrientes de pago sin el ID
        *Recibe como parametro una lista de tipo Cuenta_corriente
        *Devuelve un println con la lista
        */
        for (int i = 0; i < cuentas_corrientes.size(); i++){
                System.out.println("Id cliente = " + cuentas_corrientes.get(i).getId_cliente() + "Monto = " + cuentas_corrientes.get(i).getMonto() + "Id metodo de pago = " + cuentas_corrientes.get(i).getId_metodo_de_pago() + "Comentario = " + cuentas_corrientes.get(i).getComentario());
        }
    }
    
}
