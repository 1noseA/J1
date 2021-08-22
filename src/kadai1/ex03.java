package kadai1;

public class ex03 {
	public static void main(String[] args) {
		String date = "2010/04/01";
    	int[] records = new int[3];
    	records[0] = 65000;
    	records[1] = 73000;
    	records[2] = 90000;

    	int total = 0;
    	for (int i = 0; i < records.length; i++) {
    		System.out.println("[" + i + "]total =>" + total);
    		total += records[i];
    	}

    	System.out.println("**" + date + "**");
    	System.out.println("合計：" + total);
    	System.out.println("平均：" + total / 3);
    }
}
