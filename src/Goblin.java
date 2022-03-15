public class Goblin extends Enemy{
    private int gold;

    public Goblin(int hitPoints, int damage, int gold) {
        super(hitPoints, damage);
        this.gold = gold;
    }

    public void collectGold(int collected)
    {
        gold+=collected;
    }

    public int getGold() {
        return gold;
    }
}
