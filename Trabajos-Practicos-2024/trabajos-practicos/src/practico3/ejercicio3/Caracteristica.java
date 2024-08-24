package practico3.ejercicio3;

public class Caracteristica {
        //se mide por niveles ejemplo velocidad 200
        private int visionNoctura;
        private int fuerza;
        private int peso;
        private int altura;
        private int edad;
        public Caracteristica(int visionNoctura, int fuerza, int peso, int altura, int edad) {
            this.visionNoctura = visionNoctura;
            this.fuerza = fuerza;
            this.peso = peso;
            this.altura = altura;
            this.edad = edad;
        }
        public int getVisionNoctura() {
            return visionNoctura;
        }
        public void setVisionNoctura(int visionNoctura) {
            this.visionNoctura = visionNoctura;
        }
        public int getFuerza() {
            return fuerza;
        }
        public void setFuerza(int fuerza) {
            this.fuerza = fuerza;
        }
        public int getPeso() {
            return peso;
        }
        public void setPeso(int peso) {
            this.peso = peso;
        }
        public int getAltura() {
            return altura;
        }
        public void setAltura(int altura) {
            this.altura = altura;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        
}
