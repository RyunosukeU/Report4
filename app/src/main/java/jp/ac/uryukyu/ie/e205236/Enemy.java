package jp.ac.uryukyu.ie.e205236;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */

public class Enemy extends LivingThing{
    
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
// public class Enemy {
//     private String name;
//     private int hitPoint;
//     private int attack;
//     private boolean dead;

//     /**
//      * コンストラクタ。名前、最大HP、攻撃力を指定する。
//      * @param name モンスター名
//      * @param maximumHP モンスターのHP
//      * @param attack モンスターの攻撃力
//      */
//     public Enemy (String name, int maximumHP, int attack) {
//         this.name = name;
//         hitPoint = maximumHP;
//         this.attack = attack;
//         dead = false;
//         System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
//     }

//     /**
//      * Heroへ攻撃するメソッド。
//      * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
//      * @param hero 攻撃対象
//      */
//     public void attack(Hero hero){
//         if (dead=false){
//             int damage = (int)(Math.random() * attack);
//             System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage); 
//             hero.wounded(damage);
//         }
//         else{
//             int damage = (int)(0 * attack);
//             System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
//             hero.wounded(damage);
//         }
//     }

//     /**
//      * 自身へ攻撃されたときのダメージ処理をするメソッド。
//      * 指定されたダメージを hitPoint から引き、死亡判定を行う。
//      * @param damage 受けたダメージ
//      */
//     public void wounded(int damage){
//         hitPoint -= damage;
//         if( hitPoint < 0 ) {
//             dead = true;
//             System.out.printf("モンスター%sは倒れた。\n", name);
//         }
//     }
    
//     /**
//      * 名前取得メソッド
//      * @return モンスター名
//      */
//     public String getName(){
//         return name;
//     }

//     /**
//      * ヒットポイント取得メソッド
//      * @return モンスターのヒットポイント
//      */
//     public int getHitPoint(){
//         return hitPoint;
//     }

//     /**
//      * 攻撃力取得メソッド
//      * @return モンスター攻撃力
//      */
//     public int getAttack(){
//         return attack;
//     }

//     /**
//      * 生存状態取得メソッド
//      * @return モンスター生存状態
//      */
//     public boolean isDead(){
//         return dead;
//     }

//     /**
//      * 名前設定メソッド
//      * @return name　モンスター名
//      */
//     public void setName(String name){
//         this.name = name;
//     }

//     /**
//      * ヒットポイント設定メソッド
//      * @return hitPoint モンスターのヒットポイント
//      */
//     public void setHitPoint(int hitPoint){
//         this.hitPoint = hitPoint;
//     }

//     /**
//      * 攻撃力設定メソッド
//      * @return attack モンスター攻撃力
//      */
//     public void setAttack(int attack){
//         this.attack = attack;
//     }

//     /**
//      * 生存状態設定メソッド
//      * @return dead モンスターの生存状態
//      */
//     public void setDead(boolean dead){
//         this.dead = dead;
//     }
// }