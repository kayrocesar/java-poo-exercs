import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Double> notas;
	private String status;

	public Student() {

	}

	public Student(String name, ArrayList<Double> notas) {
		this.name = name;
		this.notas = notas;
		this.status = StatusAluno.NOT_EVALUATED;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus() {
		double final_score = Calculate();
		if (final_score > 60.0) {
			this.status = StatusAluno.PASS;
		} else {
			this.status = StatusAluno.FAILED;
		}
	}

	public double Calculate() {

		double finalScore = 0.0;

		for (Double nota : this.notas) {
			finalScore += nota;
		}
		return finalScore;
	}

		@Override
	public String toString() {
		if (status.equals(StatusAluno.PASS)) {
			return "Student [name=" + name + ", FINAL GRADE=" + Calculate() + ", status=" + status + "]";
		} else if (this.status.equals(StatusAluno.FAILED)) {
			status += String.format(" MISSING %.2f POINTS", 60 -Calculate());
		}
		return "Student [name=" + name + ", FINAL GRADE=" + Calculate() + ", status=" + status + "]";
	}

}
