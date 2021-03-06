package Game;

public class Prison extends MapBox {

    private int id;
    private String name;

    Prison(int id,String name){

        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getId() {

        return id;
    }

    @Override
    public void doAction(Player player) {

        player.nextTurn();
        System.out.print(player.getName() + " is in the Prison");

    }
}
