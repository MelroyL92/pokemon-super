public class Electric extends Pokemon{

    private String electricAttack;
    private String sound;
    private String accuracy;

    public Electric (int hp, String name, String level, String move,  String electricAttack, String accuracy) {
        super(hp, name, level,move);
        this.electricAttack = electricAttack;
        sound= pokemonSound();
        this.accuracy = accuracy;
    }

    public String getelectricAttack() {
        return electricAttack;
    }

    public void setelectricAttack(String electricAttack) {
        this.electricAttack = electricAttack;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }


    public  String pokemonSound(){
      return "screaming pika pika";
    }

    @Override
    public String moves(String move){
        return name + " " + move + " towards the target to attack while " + pokemonSound();
    }

    @Override
    public String toString() {
        return "Electric{" +
                "electricAttack='" + electricAttack + '\'' +
                ", sound='" + sound + '\'' +
                ", accuracy='" + accuracy + '\'' +
                "} " + super.toString();
    }
}
