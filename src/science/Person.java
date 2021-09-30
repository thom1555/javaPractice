package science;

/**
 * Holds constants for experiment and calculates weighted score
 * @author ianthompson
 *
 */
class Person implements Comparable<Person> {
	private final int maxLuckScore = 100;
	private final int maxSkillScore = 100;
	private final double luckWeight = .2;
	
	private int id;
	private int luckScore;
	private int skillScore;
	
	public Person(int id) {
		this.id = id;
		this.luckScore = (int) Math.round(Math.random() * maxLuckScore);
		this.skillScore = (int) Math.round(Math.random() * maxSkillScore);
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getLuck() {
		return this.luckScore;
	}
	
	public int getSkill() {
		return this.skillScore;
	}
	
	public double getWeightedScore() {
		return this.skillScore + (this.luckScore * this.luckWeight);
	}
	
	public String display() {
		String toDisplay = "Skill: " + this.getSkill();
		toDisplay = toDisplay + " Luck: " + this.getLuck();
		toDisplay = toDisplay + " Total: " + this.getWeightedScore();
		return toDisplay;
	}

	@Override
	public int compareTo(Person o) {
		return Double.compare(this.getWeightedScore(), o.getWeightedScore());
	}
}