public class Main {

    public static void main(String[] args) {
        Electric electricPokemon = new Electric(200, "Pikachu","150","sprints","thunderbolt", "99%");
        System.out.println(electricPokemon);
        Grass metapod = new Grass(250, "Metapod", "30", "sits","80cm", "10kg", false);
        System.out.println(metapod);
        System.out.println(metapod.evolvingPokemon());
        Water blastoice = new Water("water","Blastoice", 400,"65","Swims", "Hydropump",400,"num num num");
        System.out.println(blastoice);

    }
}
