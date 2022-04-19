package domain;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private boolean vip;
    private String fechaInicio;
    private Date fecha = new Date();
    private static int contadorCliente;

    public Cliente() {
    }

    public Cliente(boolean vip, String nombre, char genero, 
            int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaInicio = fecha.toString();
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", ").append(super.toString());

        return sb.toString();
    }

}
