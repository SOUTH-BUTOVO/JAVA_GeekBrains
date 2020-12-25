
// Задание для меня пока что сложновато, решение было подсмотренно, но я разбираюсь в коде и
// пробую самостоятельно его писать.

package ru.geekbrains;

import java.util.Random;
public abstract class Animals {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_WTF = -1;

    private String type;
    private String name;
    private float MaxRun;
    private float MaxSwim;
    private float MaxJump;
    private final Random random = new Random();

    Animals(String type, String name, float MaxRun, float MaxSwim, float MaxJump) {
        float runDiff = random.nextFloat() * 200 - 100;
        float swimDiff = random.nextFloat() * 5 - 2;
        float jumpDiff = random.nextFloat() * 5 - 1;


    this.type = type;
    this.name = name;
    this.MaxRun = MaxRun + runDiff;
    this.MaxSwim = MaxSwim + swimDiff;
    this.MaxJump = MaxJump + jumpDiff;

    }

    String getName() {return this.name;}

    String getType() {return this.type;}

    float getMaxRun() {return this.MaxRun;}

    float getMaxSwim() {return this.MaxSwim;}

    float getMaxJump() {return this.MaxJump;}

    protected boolean run(float distance) {
        return (distance <MaxRun);
    }
    protected int swim(float distance) {
        return (distance < MaxSwim) ? SWIM_OK : SWIM_WTF;
    }
    protected boolean jump(float height) {
        return (height < MaxJump);
    }
}
