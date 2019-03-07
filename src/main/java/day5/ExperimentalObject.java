package day5;

public class ExperimentalObject {
    private Integer notFinalImmutable;//mozna zmienic referecji czyli mozna podmiec wartosci na inna a Itiger jest nie zmienialny dlatego podmieniamy wartosci
    private final Integer finalImmutable; // nie mozna zmienic referecji czyli nie mozna podmiec wartosci na inna
    private final TestPerson finalMutable;

    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, TestPerson finalMutable){
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.finalMutable = finalMutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }
}
