package kadai1;

public class ex05 {
	public static void main(String[] args) {
		String date = "2010/04/02";
    	int[] records = new int[3];
    	records[0] = 82000;
    	records[1] = 46000;
    	records[2] = 65000;

    	int total = 0;
    	for (int i = 0; i < records.length; i++) {
    		System.out.println("[" + i + "]total => " + total);
    		total += records[i];
    	}

    	System.out.println("**" + date + "**");
    	System.out.println("合計：" + total);
    	System.out.println("平均：" + getAverage(total, records.length));
    }

	public static double getAverage(int total, int length) {
		return (double)total / (double)length;
	}
}
