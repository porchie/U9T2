public class Enemy {
    private int hitPoints;
    private int damage;

    public Enemy(int hitPoints, int damage) {
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public boolean isDead()
    {
        if (hitPoints < 1)
        {
            return true;
        }
        return false;
    }

    public void setDmg(int dmg)
    {
        damage = dmg;
    }

    public void setHp(int hp)
    {
        hitPoints = hp;
    }

    public int getHp()
    {
        return hitPoints;
    }

    public int getDmg()
    {
        return damage;
    }
    public void takeDmg(int dmg)
    {
        hitPoints -= dmg;
        if(isDead())
        {
            hitPoints = 0;
        }

    }
}
