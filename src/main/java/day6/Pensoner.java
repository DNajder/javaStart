package dey6;

import java.math.BigDecimal;

public class Pensoner extends Person {
    private BigDecimal pension;

    public Pensoner(String firstName, String lastName, Integer identity, Integer age, BigDecimal pension) {
        super(firstName, lastName, identity, age);
        this.pension = pension;
    }

    public Pensoner(String firstName, String lastName, Integer identity, Integer age) {
        super(firstName, lastName, identity, age);

    }


    public void introductionInner(){
        super.intoduction();
        System.out.println("Ale też emerycik");
    }

    @Override
    public BigDecimal showIncome() {
        return pension;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }
}
