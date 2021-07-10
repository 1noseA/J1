package j20210623;

public interface Process {
	void execute();

	static Process getInstance() {
		// return new SampleProcess();
		return new Sample2Process();
	}
}