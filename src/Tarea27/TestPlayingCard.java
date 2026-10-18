package Tarea27;
/* TestPlayingCard.java
Tecnologico Nacional de Mexico
Instituto Tecnologico de Leon
ingenieria en Sistemas Computacionales
Topicos Avanzados de programacion
Alumno: Maximo Javier Villagomez Magaña
Ejercicio 27:
Fecha: 4 de Septiembre 2026
*/
public class TestPlayingCard {
  public static void main(String[] args) {

    PlayingCard card1
      = new PlayingCard(Suit.SPADES, 2);
    System.out.println("card 1 is the " + card1.getRank()
                       + " of " + card1.getSuit().getName());

    // NewPlayingCard card2 = new NewPlayingCard(47, 2);
    // This will not compile.
  }
}
