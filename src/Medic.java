public class Medic extends Hero {
    private int healPoints;
    public void increaseExperience(){
        healPoints += healPoints/10;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Mediс применил суперспособность SUPER HIELING");
    }
}
