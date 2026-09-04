/* GetSystemProoerties.java
TEcnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 16:
Fecha: 1 de Septiembre 2026
*/

 package Tarea22;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Map;
import java.util.Set;
 
public class GetSystemProperties {
    public static void main(String[] args) {
        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
 
        Map<String, String> systemProperties = runtimeBean.getSystemProperties();
        Set<String> keys = systemProperties.keySet();
        for (String key : keys) {
            String value = systemProperties.get(key);
            System.out.printf("[%s] = %s.\n", key, value);
        }
    }
}
