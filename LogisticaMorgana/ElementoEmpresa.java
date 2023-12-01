package LogisticaMorgana;

import java.time.LocalDate;

public abstract class ElementoEmpresa {
    private String id_alfa_num;
    private String destino_determinado;
    private LocalDate fecha_de_partida;
    protected double costo_de_envio;
    private double valor_asegurado;
    protected double valor;
    public ElementoEmpresa(String id_alfa_num, String destino_determinado,LocalDate fecha_de_partida,
            double costo_de_envio, double valor_asegurado, double valor) {
        this.id_alfa_num = id_alfa_num;
        this.destino_determinado = destino_determinado;
        this.fecha_de_partida = fecha_de_partida;
        this.costo_de_envio = costo_de_envio;
        this.valor_asegurado = valor_asegurado;
        this.valor = valor;
    }
    
    public abstract double getValor();
}
