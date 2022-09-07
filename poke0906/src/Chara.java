public class Chara {
  String name = "ヒトカゲ";
  int hp = 20;


  //コンストラクタ　ニックネームが付けられてもいい
  public Chara(String name) {
	  this.name = name;
	  System.out.println(this.name + "は尻尾を振ってるよ");
  }

  public void hinoko() {
	  System.out.println(this.name + "の　ひのこ！");

  }
  public void nakigoe() {
	  System.out.println(this.name + "の　なきごえ！");

  }


  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}
