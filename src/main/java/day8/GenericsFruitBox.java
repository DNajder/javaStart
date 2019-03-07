package Day8;

public class GenericsFruitBox<T extends Fruti> {// zwyczajwo zminna T,E,R określa typ generyczny
    private T fruti;

    public GenericsFruitBox(T fruti){
        this.fruti = fruti;
    }

    public T getFruti() {
        return fruti;
    }
}
