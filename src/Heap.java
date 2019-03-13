import java.util.ArrayList;

public class Heap {

	ArrayList<Student> data = new ArrayList<Student>();

	public int size() {
		return this.data.size();
	}

	public void add(Student item) {
		this.data.add(item);
		upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (isLarger(this.data.get(ci), this.data.get(pi)) > 0) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int ci, int pi) {
		Student ith = this.data.get(ci);
		Student jth = this.data.get(pi);

		this.data.set(ci, jth);
		this.data.set(pi, ith);

	}

	private int isLarger(Student s, Student o) {

		return s.compareTo(o);
	}

	public Student remove() {
		swap(0, this.data.size() - 1);
		Student rs = this.data.remove(this.data.size() - 1);
		downheapify(0);
		return rs;
	}

	private void downheapify(int pi) {
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		if (lci < this.data.size()
				&& isLarger(this.data.get(lci), this.data.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < this.data.size()
				&& isLarger(this.data.get(rci), this.data.get(mini)) > 0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public boolean isEmpty() {
		return this.data.size() == 0;
	}

}
