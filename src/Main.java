public class Main {
    public static void main(String[] args) {

        // Crea objeto de la clase Capacitación con el constructor con atributos )
        Capacitacion nueva_capacitacion = new Capacitacion(
        1 , "77.758.364-8" , "2023-06-15" , "20:00" , "Campus Bootcamp"
            , "30:30" , 31
        );

        // Crea segundo objeto de la clase Capacitación con el constructor sin atributos
        Capacitacion capacitacion2 = new Capacitacion();
        // Setea los valores del objeto con los métodos mutadores definidos de la clase
        capacitacion2.setIdentificador(2);
        capacitacion2.setRut_cliente("80.965.154-9");
        capacitacion2.setDia("2023-06-18");
        capacitacion2.setHora("21:30");
        capacitacion2.setLugar("Santiago Campus");
        capacitacion2.setDuracion("80:00");
        capacitacion2.setCantidad_asistentes(44);
        //Crea cliente usando método con atributos
        Cliente nuevo_cliente = new Cliente( 144568971 , "Juan" , "Perez Gonzalez" , 985587665 , "Capital" , 1 , "Los Arrayanes 1658",
              "Talca" , 45  );
        // Crea cliente con método sin atributos y le asigna valores con mutadores
        Cliente cliente2 = new Cliente();
        cliente2.setRut(17225365);
        cliente2.setNombres("José Pablo");
        cliente2.setApellidos("Errázuriz Goyenechea");
        cliente2.setSalud(2);
        cliente2.setEdad(34);
        cliente2.setComuna("Chicureo");
        cliente2.setDireccion("Los litres 4540");
        cliente2.setTelefono(96669966);
        cliente2.setAfp("Modelo");



        Usuario nuevo_usuario = new Usuario( "administraitor" , "1995-01-18" , "18.158.987-7" );
        Usuario usuario2 = new Usuario();
        usuario2.setRun("20.856.458-9");
        usuario2.setNombre("elPulento");
        usuario2.setFechaNacimiento("1992-12-21");


        System.out.println( nueva_capacitacion.toString());
        System.out.println( capacitacion2.toString());


        System.out.println( nuevo_cliente.toString());

        System.out.println( nuevo_usuario.toString());
        System.out.println( nuevo_usuario.mostrarEdad());

        nueva_capacitacion.setLugar("New Place");
        usuario2.setFechaNacimiento("1996-12-21");
        cliente2.setNombres("José Ignacio");

        //MUESTRA LOS DATOS DE LOS CLIENTES SIN MÉTODOS ACCESORES
        System.out.println( "Cliente 1: \n" + nuevo_cliente.obtenerNombre());
        System.out.println( "Sistema Salud :" + nuevo_cliente.obtenerSistemaSalud());
        System.out.println( "Cliente 2: \n" + cliente2.obtenerNombre());
        System.out.println( "Sistema Salud :" + cliente2.obtenerSistemaSalud());

        System.out.println( "Detalle de la Capacitación 1: \n" + nueva_capacitacion.mostrarDetalle() );
        System.out.println( "Detalle de la Capacitación 2: \n" + capacitacion2.mostrarDetalle() );

        System.out.println( "Usuario 1 : " + nuevo_usuario.getNombre() + " \n" + nuevo_usuario.mostrarEdad() );
        System.out.println( "Usuario 2 : " + usuario2.getNombre() + " \n" + usuario2.mostrarEdad() );


        //// IMPRIMIR LOS DATOS UTILIZANDO LOS MÉTODOS ACCESORES

        System.out.println("Primer Cliente");
        System.out.println("RUT       : " + nuevo_cliente.getRut());
        System.out.println("Nombres   : " + nuevo_cliente.getNombres());
        System.out.println("Apellidos : " + nuevo_cliente.getApellidos());
        System.out.println("Dirección : " + nuevo_cliente.getDireccion());
        System.out.println("Comuna    : " + nuevo_cliente.getComuna());
        System.out.println("Teléfono  : " + nuevo_cliente.getTelefono());
        System.out.println("Edad      : " + nuevo_cliente.getEdad());
        System.out.println("Salud     : " + nuevo_cliente.getSalud());
        System.out.println("AFP       : " + nuevo_cliente.getAfp());

        System.out.println("Segundo Cliente");
        System.out.println("RUT       : " + cliente2.getRut());
        System.out.println("Nombres   : " + cliente2.getNombres());
        System.out.println("Apellidos : " + cliente2.getApellidos());
        System.out.println("Dirección : " + cliente2.getDireccion());
        System.out.println("Comuna    : " + cliente2.getComuna());
        System.out.println("Teléfono  : " + cliente2.getTelefono());
        System.out.println("Edad      : " + cliente2.getEdad());
        System.out.println("Salud     : " + cliente2.getSalud());
        System.out.println("AFP       : " + cliente2.getAfp());


        // Imprime los valores del objeto Capacitación con métodos accesores
        System.out.println("Capacitación 1");
        System.out.println("id         : " + nueva_capacitacion.getIdentificador());
        System.out.println("RUT Cliente: " + nueva_capacitacion.getRut_cliente());
        System.out.println("Día         : " + nueva_capacitacion.getDia());
        System.out.println("Hora         : " + nueva_capacitacion.getHora());
        System.out.println("Lugar        : " + nueva_capacitacion.getLugar());
        System.out.println("Duración         : " + nueva_capacitacion.getDuracion());
        System.out.println("Cant. Asistentes         : " + nueva_capacitacion.getCantidad_asistentes());


        System.out.println("Capacitación 2");
        System.out.println("id         : "+capacitacion2.getIdentificador());
        System.out.println("RUT Cliente: "+capacitacion2.getRut_cliente());
        System.out.println("Día        : "+capacitacion2.getDia());
        System.out.println("Hora       : "+capacitacion2.getHora());
        System.out.println("Lugar      : "+capacitacion2.getLugar());
        System.out.println("Duración   : "+capacitacion2.getDuracion());
        System.out.println("Cant.Asiste: "+capacitacion2.getCantidad_asistentes());


        // Imprime los usuarios creados utilizando los metodos accesores

        System.out.println("Usuario 1");
        System.out.println("Nombre       : " + nuevo_usuario.getNombre() );
        System.out.println("RUN          : " + nuevo_usuario.getRun() );
        System.out.println("Fecha Nacimiento      : " + nuevo_usuario.getFechaNacimiento() );


        System.out.println("Usuario 2");
        System.out.println("Nombre      :"+usuario2.getNombre());
        System.out.println("RUN         :"+usuario2.getRun());
        System.out.println("Fecha Nac.  :"+usuario2.getFechaNacimiento());


    }
}