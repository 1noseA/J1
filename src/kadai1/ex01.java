package kadai1;

public class ex01 {
    public static void main(String[] args) {
    	String date = "2010/04/01";
    	int  tokyo = 65000;
    	int osaka = 73000;
    	int nagoya = 90000;

    	int total = tokyo + osaka + nagoya;
    	int average = total / 3;

    	System.out.println("**" + date + "**");
    	System.out.println("合計：" + total);
    	System.out.println("平均：" + average);
    }
}
