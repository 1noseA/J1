package kadai2;

public class Partner {
	String number;
	String name;
	String address;
	String tel;

	public void modifyPartnerInfo(String number, String name, String address, String tel) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getPartnerString() {
		return "会員番号：" + number + " 氏名：" + name + " 住所：" + address + " 電話番号：" + tel;
	}
}
