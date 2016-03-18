/*
Job of the class
 - it calculates the chance of getting some with given sample space
 - it calculates the chance of not getting some with given sample space
*/
public class Chance {
    private double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance create(double chance) throws InvalidChanceInput {
        if (chance < 0 || chance > 1)
            throw new InvalidChanceInput(chance);
        return new Chance(chance);
    }

    public Chance not() throws InvalidChanceInput {
        return create(1 - chance);
    }

    public Chance and(Chance otherChance) throws InvalidChanceInput {
        return Chance.create(this.chance * otherChance.chance);
    }

    public Chance or(Chance otherChance) throws InvalidChanceInput {
        return Chance.create(this.chance + otherChance.chance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance1 = (Chance) o;

        return Double.compare(chance1.chance, chance) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(chance);
        return (int) (temp ^ (temp >>> 32));
    }

}