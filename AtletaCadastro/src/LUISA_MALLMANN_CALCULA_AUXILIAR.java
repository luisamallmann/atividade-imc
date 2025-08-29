public class LUISA_MALLMANN_CALCULA_AUXILIAR {
    float result = 0;

    public float calculaIMC (float weight, float height){
        result = weight / (height * height);
        return result;
    }
}
