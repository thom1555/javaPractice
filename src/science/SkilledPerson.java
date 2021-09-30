package science;

public class SkilledPerson implements Comparable<SkilledPerson>{
	
	private int id;
	private int luck;
	private int skill;

	public SkilledPerson(int id, int luck, int skill) {
		this.id = id;
		this.luck = luck;
		this.skill = skill;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getLuck() {
		return this.luck;
	}
	
	public int getSkill() {
		return this.skill;
	}
	
	public String display() {
		String toDisplay = " - By skill: " + this.getSkill();
		toDisplay = toDisplay + " Luck: " + this.getLuck();
		return toDisplay;
	}
	
	
	
	@Override
	public int compareTo(SkilledPerson o) {
		return Integer.compare(this.getSkill(), o.getSkill());
	}

}
