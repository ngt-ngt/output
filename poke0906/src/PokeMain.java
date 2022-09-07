import scene.Scene;

public class PokeMain {
	public static void main(String[] args) {
		Timer time = new Timer();
		Scene scene = new Scene();

		scene.scene1();
		time.waitTime(2000);

		Chara c1 = new Chara("ヒトカゲ");
		time.waitTime(3000);
		scene.scene2();




	}


}
