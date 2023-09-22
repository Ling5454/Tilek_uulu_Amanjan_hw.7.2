public class Main {


    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] heroesAttackType = {magic, medic, warrior};

        for (int i = 0; i < heroesAttackType.length; i++) {
            heroesAttackType[i].applySuperAbility();
        if (heroesAttackType[i] instanceof Medic){
            Medic medic1 = (Medic)heroesAttackType[i];
            medic1.increaseExperience();

        }
        }
    }
}
