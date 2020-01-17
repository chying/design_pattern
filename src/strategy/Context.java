package strategy;

public class Context {
    Weapon weapon;
    
    public Context(Weapon weapon) { //���캯��
        super();
        this.weapon = weapon;
    }
    
    public Weapon getWeapon() { //get����
        return weapon;
    }
    
    public void setWeapon(Weapon weapon) { //set����
        this.weapon = weapon;
    }
    
    public void gun() {
        weapon.gun();
    }
}