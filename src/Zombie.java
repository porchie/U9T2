public class Zombie extends Enemy{
    private boolean hasDied;

    public Zombie(int hitPoints, int damage, boolean hasDied) {
        super(hitPoints, damage);
        this.hasDied = hasDied;
    }

    public boolean isHasDied() {
        return hasDied;
    }

    @Override
    public void takeDmg(int dmg)
    {
        super.setHp(super.getHp()-dmg);
        if(isDead())
        {
            if(!hasDied)
            {
                super.setHp(5);
                hasDied = true;
            }
            else
            {
               super.setHp(0);
            }

        }

    }

}
