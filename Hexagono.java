public class Hexagono extends PoligonoRegular{
    //Nueva clase Hexagono  
    /**
     * @autor Manuel Urena Masegosa
     */
    private int longitudLado;

    public Hexagono(int numLados, int color, int longitudLado){
        super(numLados, color);
        this.longitudLado = longitudLado;
    }
}