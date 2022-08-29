public class EjercicioCap8 {
    public static void main(String[] args){

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(24);
        persona1.setTelefono(45678);

        System.out.println("La persona seleccionada se llama " + persona1.getNombre() + " tiene " + persona1.getEdad() + " y su numero es " + persona1.getTelefono() + " ");
    }
    public static class Persona{
        private String nombre;
        private int edad;
        private int telefono;


        //   get y set de nombre
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        //  get y set edad
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }

        // get y set telefono
        public int getTelefono() {
            return telefono;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
    }
}
