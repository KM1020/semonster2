
import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare,5:motoko rare,6:Moririn rare,7:Monkey rare

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(8);
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
