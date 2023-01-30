/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class19
{
    public Class16 aClass16_357;
    public Class16 aClass16_358;
    public int[] anIntArray359;
    public static int[] anIntArray360;
    public int anInt361 = 0;
    public static int[] anIntArray362 = new int[32768];
    public static int[] anIntArray363;
    public int[] anIntArray364;
    public Class27 aClass27_365;
    public Class16 aClass16_366;
    public Class16 aClass16_367;
    public int anInt368 = 100;
    public Class16 aClass16_369;
    public Class16 aClass16_370;
    public Class16 aClass16_371;
    public static int[] anIntArray372;
    public static int[] anIntArray373;
    public static int[] anIntArray374;
    public Class16 aClass16_375;
    public int anInt376;
    public int anInt377;
    public static int[] anIntArray378;
    public static int[] anIntArray379;
    public Class16 aClass16_380;
    public int[] anIntArray381;
    
    public int method566(int arg0, int arg1, int arg2) {
	if (arg2 == 1) {
	    if ((arg0 & 0x7fff) < 16384)
		return arg1;
	    return -arg1;
	}
	if (arg2 == 2)
	    return anIntArray360[arg0 & 0x7fff] * arg1 >> 14;
	if (arg2 == 3)
	    return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
	if (arg2 == 4)
	    return anIntArray362[arg0 / 2607 & 0x7fff] * arg1;
	return 0;
    }
    
    public static void method567() {
	anIntArray363 = null;
	anIntArray362 = null;
	anIntArray360 = null;
	anIntArray374 = null;
	anIntArray378 = null;
	anIntArray372 = null;
	anIntArray373 = null;
	anIntArray379 = null;
    }
    
    public void method568(Buffer arg0) {
	aClass16_369 = new Class16();
	aClass16_369.method560(arg0);
	aClass16_358 = new Class16();
	aClass16_358.method560(arg0);
	int i = arg0.method168(255);
	if (i != 0) {
	    arg0.position--;
	    aClass16_380 = new Class16();
	    aClass16_380.method560(arg0);
	    aClass16_366 = new Class16();
	    aClass16_366.method560(arg0);
	}
	i = arg0.method168(255);
	if (i != 0) {
	    arg0.position--;
	    aClass16_357 = new Class16();
	    aClass16_357.method560(arg0);
	    aClass16_367 = new Class16();
	    aClass16_367.method560(arg0);
	}
	i = arg0.method168(255);
	if (i != 0) {
	    arg0.position--;
	    aClass16_371 = new Class16();
	    aClass16_371.method560(arg0);
	    aClass16_375 = new Class16();
	    aClass16_375.method560(arg0);
	}
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    int i_1_ = arg0.method158(true);
	    if (i_1_ == 0)
		break;
	    anIntArray364[i_0_] = i_1_;
	    anIntArray381[i_0_] = arg0.method159((byte) 44);
	    anIntArray359[i_0_] = arg0.method158(true);
	}
	anInt377 = arg0.method158(true);
	anInt368 = arg0.method158(true);
	anInt376 = arg0.method164(127);
	anInt361 = arg0.method164(127);
	aClass27_365 = new Class27();
	aClass16_370 = new Class16();
	aClass27_365.method604(arg0, aClass16_370);
    }
    
    public int[] method569(int arg0, int arg1) {
	for (int i = 0; i < arg0; i++)
	    anIntArray363[i] = 0;
	if (arg1 < 10)
	    return anIntArray363;
	double d = (double) arg0 / ((double) arg1 + 0.0);
	aClass16_369.method558();
	aClass16_358.method558();
	int i = 0;
	int i_2_ = 0;
	int i_3_ = 0;
	if (aClass16_380 != null) {
	    aClass16_380.method558();
	    aClass16_366.method558();
	    i = (int) ((double) (aClass16_380.anInt321 - aClass16_380.anInt324)
		       * 32.768 / d);
	    i_2_ = (int) ((double) aClass16_380.anInt324 * 32.768 / d);
	}
	int i_4_ = 0;
	int i_5_ = 0;
	int i_6_ = 0;
	if (aClass16_357 != null) {
	    aClass16_357.method558();
	    aClass16_367.method558();
	    i_4_ = (int) ((double) (aClass16_357.anInt321
				    - aClass16_357.anInt324)
			  * 32.768 / d);
	    i_5_ = (int) ((double) aClass16_357.anInt324 * 32.768 / d);
	}
	for (int i_7_ = 0; i_7_ < 5; i_7_++) {
	    if (anIntArray364[i_7_] != 0) {
		anIntArray374[i_7_] = 0;
		anIntArray378[i_7_] = (int) ((double) anIntArray359[i_7_] * d);
		anIntArray372[i_7_] = (anIntArray364[i_7_] << 14) / 100;
		anIntArray373[i_7_]
		    = (int) ((double) (aClass16_369.anInt321
				       - aClass16_369.anInt324)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) anIntArray381[i_7_])
			     / d);
		anIntArray379[i_7_]
		    = (int) ((double) aClass16_369.anInt324 * 32.768 / d);
	    }
	}
	for (int i_8_ = 0; i_8_ < arg0; i_8_++) {
	    int i_9_ = aClass16_369.method561(arg0);
	    int i_10_ = aClass16_358.method561(arg0);
	    if (aClass16_380 != null) {
		int i_11_ = aClass16_380.method561(arg0);
		int i_12_ = aClass16_366.method561(arg0);
		i_9_ += method566(i_3_, i_12_, aClass16_380.anInt322) >> 1;
		i_3_ += (i_11_ * i >> 16) + i_2_;
	    }
	    if (aClass16_357 != null) {
		int i_13_ = aClass16_357.method561(arg0);
		int i_14_ = aClass16_367.method561(arg0);
		i_10_ = i_10_ * ((method566(i_6_, i_14_, aClass16_357.anInt322)
				  >> 1)
				 + 32768) >> 15;
		i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
	    }
	    for (int i_15_ = 0; i_15_ < 5; i_15_++) {
		if (anIntArray364[i_15_] != 0) {
		    int i_16_ = i_8_ + anIntArray378[i_15_];
		    if (i_16_ < arg0) {
			anIntArray363[i_16_]
			    += method566(anIntArray374[i_15_],
					 i_10_ * anIntArray372[i_15_] >> 15,
					 aClass16_369.anInt322);
			anIntArray374[i_15_] += (i_9_ * anIntArray373[i_15_]
						 >> 16) + anIntArray379[i_15_];
		    }
		}
	    }
	}
	if (aClass16_371 != null) {
	    aClass16_371.method558();
	    aClass16_375.method558();
	    int i_17_ = 0;
	    boolean bool = false;
	    boolean bool_18_ = true;
	    for (int i_19_ = 0; i_19_ < arg0; i_19_++) {
		int i_20_ = aClass16_371.method561(arg0);
		int i_21_ = aClass16_375.method561(arg0);
		int i_22_;
		if (bool_18_)
		    i_22_ = aClass16_371.anInt324 + (((aClass16_371.anInt321
						       - aClass16_371.anInt324)
						      * i_20_)
						     >> 8);
		else
		    i_22_ = aClass16_371.anInt324 + (((aClass16_371.anInt321
						       - aClass16_371.anInt324)
						      * i_21_)
						     >> 8);
		i_17_ += 256;
		if (i_17_ >= i_22_) {
		    i_17_ = 0;
		    bool_18_ = !bool_18_;
		}
		if (bool_18_)
		    anIntArray363[i_19_] = 0;
	    }
	}
	if (anInt377 > 0 && anInt368 > 0) {
	    int i_23_ = (int) ((double) anInt377 * d);
	    for (int i_24_ = i_23_; i_24_ < arg0; i_24_++)
		anIntArray363[i_24_]
		    += anIntArray363[i_24_ - i_23_] * anInt368 / 100;
	}
	if (aClass27_365.anIntArray499[0] > 0
	    || aClass27_365.anIntArray499[1] > 0) {
	    aClass16_370.method558();
	    int i_25_ = aClass16_370.method561(arg0 + 1);
	    int i_26_ = aClass27_365.method607(0, (float) i_25_ / 65536.0F);
	    int i_27_ = aClass27_365.method607(1, (float) i_25_ / 65536.0F);
	    if (arg0 >= i_26_ + i_27_) {
		int i_28_ = 0;
		int i_29_ = i_27_;
		if (i_29_ > arg0 - i_26_)
		    i_29_ = arg0 - i_26_;
		for (/**/; i_28_ < i_29_; i_28_++) {
		    int i_30_ = (int) (((long) anIntArray363[i_28_ + i_26_]
					* (long) Class27.anInt493)
				       >> 16);
		    for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
			i_30_ += (int) (((long) (anIntArray363
						 [i_28_ + i_26_ - 1 - i_31_])
					 * (long) (Class27.anIntArrayArray497
						   [0][i_31_]))
					>> 16);
		    for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
			i_30_
			    -= (int) (((long) anIntArray363[i_28_ - 1 - i_32_]
				       * (long) (Class27.anIntArrayArray497[1]
						 [i_32_]))
				      >> 16);
		    anIntArray363[i_28_] = i_30_;
		    i_25_ = aClass16_370.method561(arg0 + 1);
		}
		i_29_ = 128;
		for (;;) {
		    if (i_29_ > arg0 - i_26_)
			i_29_ = arg0 - i_26_;
		    for (/**/; i_28_ < i_29_; i_28_++) {
			int i_33_ = (int) (((long) anIntArray363[i_28_ + i_26_]
					    * (long) Class27.anInt493)
					   >> 16);
			for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
			    i_33_
				+= (int) (((long) (anIntArray363
						   [i_28_ + i_26_ - 1 - i_34_])
					   * (long) (Class27.anIntArrayArray497
						     [0][i_34_]))
					  >> 16);
			for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
			    i_33_
				-= (int) (((long) (anIntArray363
						   [i_28_ - 1 - i_35_])
					   * (long) (Class27.anIntArrayArray497
						     [1][i_35_]))
					  >> 16);
			anIntArray363[i_28_] = i_33_;
			i_25_ = aClass16_370.method561(arg0 + 1);
		    }
		    if (i_28_ >= arg0 - i_26_)
			break;
		    i_26_
			= aClass27_365.method607(0, (float) i_25_ / 65536.0F);
		    i_27_
			= aClass27_365.method607(1, (float) i_25_ / 65536.0F);
		    i_29_ += 128;
		}
		for (/**/; i_28_ < arg0; i_28_++) {
		    int i_36_ = 0;
		    for (int i_37_ = i_28_ + i_26_ - arg0; i_37_ < i_26_;
			 i_37_++)
			i_36_ += (int) (((long) (anIntArray363
						 [i_28_ + i_26_ - 1 - i_37_])
					 * (long) (Class27.anIntArrayArray497
						   [0][i_37_]))
					>> 16);
		    for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
			i_36_
			    -= (int) (((long) anIntArray363[i_28_ - 1 - i_38_]
				       * (long) (Class27.anIntArrayArray497[1]
						 [i_38_]))
				      >> 16);
		    anIntArray363[i_28_] = i_36_;
		    i_25_ = aClass16_370.method561(arg0 + 1);
		}
	    }
	}
	for (int i_39_ = 0; i_39_ < arg0; i_39_++) {
	    if (anIntArray363[i_39_] < -32768)
		anIntArray363[i_39_] = -32768;
	    if (anIntArray363[i_39_] > 32767)
		anIntArray363[i_39_] = 32767;
	}
	return anIntArray363;
    }
    
    public Class19() {
	anIntArray359 = new int[5];
	anIntArray364 = new int[5];
	anInt376 = 500;
	anInt377 = 0;
	anIntArray381 = new int[5];
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    anIntArray362[i] = (random.nextInt() & 0x2) - 1;
	anIntArray360 = new int[32768];
	for (int i = 0; i < 32768; i++)
	    anIntArray360[i]
		= (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	anIntArray363 = new int[220500];
	anIntArray372 = new int[5];
	anIntArray374 = new int[5];
	anIntArray373 = new int[5];
	anIntArray378 = new int[5];
	anIntArray379 = new int[5];
    }
}
