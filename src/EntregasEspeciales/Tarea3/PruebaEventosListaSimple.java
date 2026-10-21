package EntregasEspeciales.Tarea3;
/* PruebaEventosListaSimple.java
Tecnologico Nacional de Mexico
Instituto Tecnologico de Leon
Ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Tarea 3
Fecha: 20 de octubre del 2026
*/
public class PruebaEventosListaSimple {
    EventosListaSimple obj;
    //1.- META
    public void Goal() {
        String meta = "Programa simple que pretende poner a prueba";

        meta += " el manejo de eventos producidos por un componente ";
        meta += " de la clase list";
        System.out.println(meta);
    }
    //2.-DATOS - NO SE MANEJAN EN ESTE EJERCICIO
    // 3.-PROCESOS - NO SE MANEJAN EN ESTE EJERCICIO
    // 4.-SALIDAS - SE MANEJAN EN LA CLASE EventosListaSimple Y SE DELEGA A LA NAVEGABILIDAD
    // 5.-NAVEGAVILIDAD
    private void navegabilidad() {
        obj = new EventosListaSimple();
        obj.forma();
    }

    public static void main(String args[]) {
        PruebaEventosListaSimple prueba = new PruebaEventosListaSimple();

        prueba.Goal();
        prueba.navegabilidad();
    }
}