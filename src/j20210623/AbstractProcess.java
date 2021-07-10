package j20210623;

abstract class AbstractProcess implements Process {
	@Override
	public void execute() {
		System.out.println("start");
		peform();
		System.out.println("end");
	}

	protected abstract void peform();
}
