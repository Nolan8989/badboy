package nolan.array;

public class Student {
	private int id;
	private String name;
	
	private int[]  score;
	//score[0],score[1],...

	public Student(String name) {
		super();
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
	
	
	
	
}
