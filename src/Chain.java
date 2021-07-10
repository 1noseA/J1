import com.test.Process;
import com.test.Task;
import com.test.Type;

public class Chain {
	public static void main(String[] args) {
		Process p = Process.getInstance();
		p.execute(new Task(Type.D, "Hello"));
	}
}
