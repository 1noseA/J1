package kadai1;

public class ex08 {
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
    	System.out.println("最高：" + getMaxValue(records));
    	System.out.println("最低：" + getMinValue(records));
    }

	public static double getAverage(int total, int length) {
		return (double)total / (double)length;
	}

	public static int getMaxValue(int[] records) {
		int max = 0;
		for (int i = 0; i < records.length; i++) {
			if (max < records[i]) {
				max = records[i];
			}
		}
		return max;
	}

	public static int getMinValue(int[] records) {
		int min = records[0];
		for (int i = 0; i < records.length; i++) {
			if(min > records[i]) {
				min = records[i];
			}
		}
		return min;
	}
}
