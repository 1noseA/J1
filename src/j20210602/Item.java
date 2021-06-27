package j20210602;

import java.util.Objects;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		// Item型と互換性のある型かどうかを確認
		// 互換性がない場合
		if (obj instanceof Item == false) {
			return false;
		}

		// 互換性があるから型変換をする(objをItemniキャスト)
		Item target = (Item) obj;
		return this.name.equals(target.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


//	// 全てのフィールド突合したい場合は自動生成できる
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		// 参照先がないかどうか判定
//		if (obj == null)
//			return false;
//		// 同じクラスかどうか判定
//		if (getClass() != obj.getClass())
//			return false;
//		// ダウンキャスト
//		Item other = (Item) obj;
//		// 名前がnullでなかったら相手の名前と比較する
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (price != other.price)
//			return false;
//		return true;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + price;
//		return result;
//	}
}
