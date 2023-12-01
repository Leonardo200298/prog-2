package LogisticaMorgana;

import java.time.LocalDate;

public class Paquete extends ElementoEmpresa{

    public Paquete(String id_alfa_num, String destino_determinado,LocalDate fecha_de_partida, double costo_de_envio, double valor_asegurado,
            double valor) {
        super(id_alfa_num, destino_determinado,fecha_de_partida, costo_de_envio, valor_asegurado, valor);
        
    }

    @Override
    public double getValor() {
        return this.valor;
    }
    
}
