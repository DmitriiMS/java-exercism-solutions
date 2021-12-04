abstract class Fighter {

    protected boolean isVulnerable = false;
    boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getName();
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean preparedSpell = false;

    @Override
    boolean isVulnerable() {
        isVulnerable = !preparedSpell;
        return isVulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return preparedSpell ? 12 : 3;
    }

    void prepareSpell() {
        preparedSpell = true;
    }

}
