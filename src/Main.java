public class Main {

    //Het lastige in dit geval vond ik niet de code schrijven, maar het logisch maken van de code door middel van het bepalen
    // wat in de super class kwam en wat in de instances van die klasse kwamen te staan. Sommige hadden net zo goed in de super kunnen staan
    // en dan door middel van override toegepast kunnen worden op de specifieke instances (denk ik). Ben ook maar een beginner.
    // Had het nog iets uitgebreider willen maken, maar ik heb 5 dagen gewerkt en werd deze week onhandig ingepland waardoor ik het ook maandag niet goed af kon maken.

    public static void main(String[] args) {
        Electric electricPokemon = new Electric(200, "Pikachu","150","sprints","thunderbolt", "99%");
        System.out.println(electricPokemon);
        Grass grassPokemon = new Grass(250, "Metapod", "30", "sits","80cm", "10kg", true);
        System.out.println(grassPokemon);
        System.out.println(grassPokemon.evolvingPokemon());
        Water waterPokemon = new Water("water","Blastoice", 400,"65","Swims", "Hydropump","num num num");
        System.out.println(waterPokemon);
        System.out.println(waterPokemon.getSpecialHp() + " is the hp after gaining double the normal hp of " + Water.getName());
        Fire firePokemon = new Fire(600,"Charizard", "level 200","flies with the speed of the wind", "Flamethrower","Dragon tail");
        System.out.println(firePokemon);

    }
}
