package j20210616;

public interface Sample {
	// インターフェイスはpublicになるので書いても書かなくてもよい
	// 抽象メソッドしか定義できなかった
	// 今はstaticなメソッドなら作れる
	void hello();

	// これでFactoryクラスいらなくなった
	public static Sample create() {
		return new SampleImple();
	}
}
