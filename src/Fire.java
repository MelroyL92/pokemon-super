 class Fire extends Pokemon{

    private String fireAttack;
    private String specialAttack;

    public Fire (int hp, String name, String level,String move, String fireAttack, String specialAttack) {
        super(hp , name, level, move);
        this.fireAttack = fireAttack;
        this.specialAttack = specialAttack;
    }

    public String getFireAttack() {
        return fireAttack;
    }

    public String getSpecialAttack(){
        return specialAttack;
    }

    public void setFireAttack (String fireAttack) {
        this.fireAttack = fireAttack;
    }

    public void setSpecialAttack (String specialAttack) {
        this.specialAttack = specialAttack;
    }
}
