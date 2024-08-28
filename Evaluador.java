import java.util.Scanner;

public class Evaluador {
    public static String evaluarMateria(int calificacion){
        String resultado = "";
        if (calificacion <= 3) {
            resultado = "No Aprobado";
        }else if (calificacion>3&& calificacion<=5) {
            resultado = "Insuficiente";
        }else if (calificacion>5&& calificacion<=8) {
            resultado = "Aceptable";
        }else if (calificacion==10) {
            resultado = "Excelente";
        }else if (calificacion>10 || calificacion <0)
        return resultado = "Entrada invalida";
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Calificaciones de estudiantes
        System.out.println("Ingrese la calificacion de Materia 1");
        int calificacion1 = scanner.nextInt();
        System.out.println("Ingrese la calificacion de Materia 2");
        int calificacion2 = scanner.nextInt();
        System.out.println("Ingrese la calificacion de Materia 3");
        int calificacion3 = scanner.nextInt();
        //Evaluacion de cada materia
        System.out.println("Materia 1" + evaluarMateria(calificacion1));
        System.out.println("Materia 2" + evaluarMateria(calificacion2));
        System.out.println("Materia 3" + evaluarMateria(calificacion3));



                }
            }



