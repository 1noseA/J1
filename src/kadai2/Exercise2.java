package kadai2;

public class Exercise2 {
	public static void main(String[] args) {
		Partner partner = new Partner();
		partner.modifyPartnerInfo("1125", "中田", "東京都", "03-0000-2222");
		System.out.println(partner.getPartnerString());
	}
}
