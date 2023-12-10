class Pokemon {

    private String type;
    protected String name;
    private int hp;
    protected String level;
    private String specialAttack;
    private String move;


    public Pokemon (String type, String name, int hp, String level, String specialAttack, String move) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.specialAttack = specialAttack(specialAttack);
        this.move = moves(move);
    }

    public Pokemon (String type, String name, int hp, String level, String move) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.move = moves(move);
    }


    public Pokemon (int hp, String name, String level, String move) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.move = moves(move);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String specialAttack(String specialAttack){
        return name + " attacks with " + specialAttack + " and does a critical hit!";
    }

    public String moves(String move) {
        return name + " " +  move + " towards the target!";
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Pokemon{");

        if (type != null) {
            result.append("type='").append(type).append('\'');
        }
        if (name != null) {
            result.append(", name='").append(name).append('\'');
        }
        result.append(", hp=").append(hp);
        if (level != null) {
            result.append(", level='").append(level).append('\'');
        }
        if (specialAttack != null) {
            result.append(", specialAttack='").append(specialAttack).append('\'');
        }
        if (move != null) {
            result.append(", moves='").append(move).append('\'');
        }

        result.append('}');

        return result.toString();
    }
}
