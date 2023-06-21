import java.time.LocalDate;
import java.time.Period;
public class Usuario {
        public String nombre;
        public String fechaNacimiento;
        public String run;

        public Usuario(String nombre, String fechaNacimiento, String run) {
                this.nombre = nombre;
                this.fechaNacimiento = fechaNacimiento;
                this.run = run;
        }

        public Usuario() {
        }

        public String toString() {
                return "Usuario{" +
                        "nombre='" + nombre + '\'' +
                        ", fechaNacimiento='" + fechaNacimiento + '\'' +
                        ", run='" + run + '\'' +
                        '}';
        }

        public String mostrarEdad(){
                LocalDate fechaActual = LocalDate.now();

                LocalDate fn = LocalDate.parse(this.fechaNacimiento);

                int edad = Period.between(fn, fechaActual).getYears();

                return "El usuario tiene " + edad + " años";
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getFechaNacimiento() {
                return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
        }

        public String getRun() {
                return run;
        }

        public void setRun(String run) {
                this.run = run;
        }
}
