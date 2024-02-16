package hangman.model.Implementation;
import java.lang.Math;
public class PowerScore {

    /**
     * Este metodo calcula si el puntaje de acuerdo con las letras correctas e incorrectas.
     *
     * @pre Inicia con 0 puntos.
     * @post El puntaje maximo es 500 puntos, si sobrepasa sera 500 punto igualmente.
     * @param correctCount Cantidad de letras acertadas .
     * @param incorrectCount Cantidad de letras incorrectas.
     * @return retorna un entero con el puntaje obtenido y La $i-ésima$ letra correcta se bonifica con $5^i$ y
     * y penalización de 8 puntos por cada letra incorrecta.
     */
    public int calculateScore(int correctCount, int incorrectCount){
        int score = (int) (Math.pow(5, correctCount) - incorrectCount * 8);
        if (score < 0){
            score = 0;
        } else if (score > 500) {
            score = 500;
        }
        return score;
    }
}
