public class Grass extends Pokemon{

    private String height;
    private String weight;
    private boolean evolve;

    public Grass (int hp, String name, String level, String move, String height, String weight, boolean evolve) {
        super(hp, name, level, move);
        this.height = height;
        this.weight = weight;
        this.evolve = evolve;
        evolvingPokemon();
    }

    public String getHeight(){
        return height;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String evolvingPokemon(){
        if (evolve) {
            return name + "reached level " + level + " and is evolving to butterfree!";
        } else {
            return name + " is not able to evolve yet";
        }
    }

    @Override
    public String moves(String move){
        return name + " " +  move + " and cant move towards the target because he is the most useless pokemon there is";
    }

    @Override
    public String toString() {
        return "Grass{" +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}' +
                super.toString();
    }
}
