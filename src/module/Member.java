package module;

public class Member {

    public boolean health;
    public Team brand;

    public Member() {
    }

    public Member(boolean health, Team brand) {
        this.health = health;
        this.brand = brand;
    }

    public boolean getHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public Team getBrand() {
        return brand;
    }

    public void setBrand(Team brand) {
        this.brand = brand;
    }
}
