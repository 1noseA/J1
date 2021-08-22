package kadai2;

public class Exercise1 {
	public static void main(String[] args) {
        Section section1 = new Section();
        Section section2 = new Section();
        Section section3 = new Section();
        section1.setName("人事部");
        section2.setName("営業部");
        section3.setName("技術部");

        section1.printName(section1.getName());
        section2.printName(section2.getName());
        section3.printName(section3.getName());
    }
}
