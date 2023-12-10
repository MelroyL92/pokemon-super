public class Water extends Pokemon {

    private String waterAttack;
    private int specialHp;
    private String eats;


    public Water (String type, String name, int hp, String level, String move, String waterAttack, String eats) {
        super(type,name, hp, level, move);
        this.waterAttack = waterAttack;
        this.specialHp = hp * 2;
        this.eats = eats;
    }

    public String getWaterAttack() {
        return waterAttack;
    }

    public void setWaterAttack(String waterAttack) {
        this.waterAttack = waterAttack;
    }

    public int getSpecialHp() {
        return specialHp;
    }

    public void setSpecialHp(int specialHp) {
        this.specialHp = specialHp;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    @Override
    public String moves(String move){
        return name + " " + move + " towards the target to attack while diving under water to hide himself from the view of his opponent";
    }

    @Override
    public String toString() {
        return "Water{" +
                "waterAttack='" + waterAttack + '\'' +
                ", specialHp=" + specialHp +
                ", eats='" + eats + '\'' +
                ", level='" + level + '\'' +
                "} " + super.toString();
    }
}
