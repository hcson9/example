/*
 * Copyright (c) 2024. - All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 *
 * Written by Hochan Son <hc.son9@gmail.com>
 * Created on 2024/5/7
 */

package example;

/**
 * create on 2024/05/07 create by IntelliJ IDEA.
 *
 * <p> New Project. </p>
 *
 * @author HoChan Son (hcson)
 * @version 1.0
 * @since 1.0
 */
public class Human extends Animal implements Omnivore {

  public Human(String name) {
    super(name);
  }

  @Override
  public void eat() {
    eatAll();
  }

  @Override
  public void eatMeat() {
    System.out.println(super.getName() + "이(가) 고기를 먹는다.");
  }

  @Override
  public void eatPlant() {
    System.out.println(super.getName() + "이(가) 풀을 먹는다.");
  }

}
