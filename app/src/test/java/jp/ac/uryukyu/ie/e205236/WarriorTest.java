package jp.ac.uryukyu.ie.e205236;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    
    @Test
    void attackTest(){
        int defaultattack = 10;
        Warrior demosuperHero = new Warrior("上位デモ勇者", 50, defaultattack);  
        Enemy slime = new Enemy("スライムもどき", 50, 3); 
        for(int i = 0; i < 3; i++){
            int nowHP = slime.hitPoint; 
            demosuperHero.attackWithWeponSkill(slime);
            assertEquals(defaultattack*1.5, nowHP - slime.hitPoint);
        }
    }
}