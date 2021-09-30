package science;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Luck {
	private List<Person> people = new ArrayList<Person>();
	private List<Person> selectedPeople = new ArrayList<Person>();
	private List<SkilledPerson> skilledPeople = new ArrayList<SkilledPerson>();
	private List<SkilledPerson> selectedSkilledPeople = new ArrayList<SkilledPerson>();
	
	private final int participants = 200;
	private int nextId = 0;
	
	private void generatePeople() {
		for (int i=0; i<this.participants; i++) {
			Person x = new Person(this.nextId);
			this.people.add(x);
			SkilledPerson y = new SkilledPerson(this.nextId, x.getSkill(), x.getLuck());
			skilledPeople.add(y);
			this.nextId++;
		}
	}
	
	public void listPeople() {
		for (int i=0; i<100; i++) {
			System.out.println(this.people.get(i).getWeightedScore());
		}
	}
	
	public void listSelectedPeople() {
		for (int i=0; i<selectedPeople.size(); i++) {
			System.out.print(this.selectedPeople.get(i).display());
			System.out.println(this.selectedSkilledPeople.get(i).display());
		}
	}
	
	private void selectPeople() {
		Collections.sort(this.people, Collections.reverseOrder());
		this.selectedPeople = this.people.subList(0, 10);
	}
	
	private void selectBySkill() {
		Collections.sort(this.skilledPeople, Collections.reverseOrder());
		this.selectedSkilledPeople = this.skilledPeople.subList(0,  10);
	}
	
	public int countMistakes() {
		for (int i=0; i<this.selectedSkilledPeople.size(); i++) {
			
		}
		return 0;
	}
	
	public void setupExp() {
		this.generatePeople();
		this.selectPeople();
		this.selectBySkill();
	}
	

	public static void main(String[] args) {
		Luck luckExp = new Luck();
		luckExp.setupExp();
		luckExp.listSelectedPeople();
	}

}
