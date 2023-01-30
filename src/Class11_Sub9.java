/* Class11_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub9 extends Class11
{
    public int[] anIntArray1641;
    public static int[] anIntArray1642;
    public boolean aBoolean1643;
    public int anInt1644;
    public int[] anIntArray1645;
    public int anInt1646;
    public int[] anIntArray1647;
    public boolean aBoolean1648 = false;
    public int[] anIntArray1649;
    public int[] anIntArray1650;
    public int anInt1651;
    
    public void method220(int arg0) {
	if (anIntArray1641 != null) {
	    if (anInt1644 == 1 || anInt1644 == 3) {
		if (anIntArray1642 == null
		    || anIntArray1642.length < anIntArray1641.length)
		    anIntArray1642 = new int[anIntArray1641.length];
		int i;
		if (anIntArray1641.length == 16384)
		    i = 64;
		else
		    i = 128;
		int i_0_ = anIntArray1641.length / 4;
		int i_1_ = i * arg0 * anInt1651;
		int i_2_ = i_0_ - 1;
		if (anInt1644 == 1)
		    i_1_ = -i_1_;
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
		    int i_4_ = i_3_ + i_1_ & i_2_;
		    anIntArray1642[i_3_] = anIntArray1641[i_4_];
		    anIntArray1642[i_3_ + i_0_] = anIntArray1641[i_4_ + i_0_];
		    anIntArray1642[i_3_ + i_0_ + i_0_]
			= anIntArray1641[i_4_ + i_0_ + i_0_];
		    anIntArray1642[i_3_ + i_0_ + i_0_ + i_0_]
			= anIntArray1641[i_4_ + i_0_ + i_0_ + i_0_];
		}
		int[] is = anIntArray1641;
		anIntArray1641 = anIntArray1642;
		anIntArray1642 = is;
	    }
	    if (anInt1644 == 2 || anInt1644 == 4) {
		if (anIntArray1642 == null
		    || anIntArray1642.length < anIntArray1641.length)
		    anIntArray1642 = new int[anIntArray1641.length];
		int i;
		if (anIntArray1641.length == 16384)
		    i = 64;
		else
		    i = 128;
		int i_5_ = anIntArray1641.length / 4;
		int i_6_ = arg0 * anInt1651;
		int i_7_ = i - 1;
		if (anInt1644 == 2)
		    i_6_ = -i_6_;
		for (int i_8_ = 0; i_8_ < i_5_; i_8_ += i) {
		    for (int i_9_ = 0; i_9_ < i; i_9_++) {
			int i_10_ = i_8_ + i_9_;
			int i_11_ = i_8_ + (i_9_ + i_6_ & i_7_);
			anIntArray1642[i_10_] = anIntArray1641[i_11_];
			anIntArray1642[i_10_ + i_5_]
			    = anIntArray1641[i_11_ + i_5_];
			anIntArray1642[i_10_ + i_5_ + i_5_]
			    = anIntArray1641[i_11_ + i_5_ + i_5_];
			anIntArray1642[i_10_ + i_5_ + i_5_ + i_5_]
			    = anIntArray1641[i_11_ + i_5_ + i_5_ + i_5_];
		    }
		}
		int[] is = anIntArray1641;
		anIntArray1641 = anIntArray1642;
		anIntArray1642 = is;
	    }
	}
    }
    
    public static void method221() {
	anIntArray1642 = null;
    }
    
    public void method222() {
	anIntArray1641 = null;
    }
    
    public Class11_Sub9(Buffer arg0) {
	anInt1646 = arg0.method164(127);
	aBoolean1643 = arg0.method168(255) == 1;
	int i = arg0.method168(255);
	if (i < 1 || i > 4)
	    throw new RuntimeException();
	anIntArray1649 = new int[i];
	for (int i_12_ = 0; i_12_ < i; i_12_++)
	    anIntArray1649[i_12_] = arg0.method164(127);
	if (i > 1) {
	    anIntArray1650 = new int[i - 1];
	    for (int i_13_ = 0; i_13_ < i - 1; i_13_++)
		anIntArray1650[i_13_] = arg0.method168(255);
	}
	if (i > 1) {
	    anIntArray1647 = new int[i - 1];
	    for (int i_14_ = 0; i_14_ < i - 1; i_14_++)
		anIntArray1647[i_14_] = arg0.method168(255);
	}
	anIntArray1645 = new int[i];
	for (int i_15_ = 0; i_15_ < i; i_15_++)
	    anIntArray1645[i_15_] = arg0.method188((byte) 105);
	anInt1644 = arg0.method168(255);
	anInt1651 = arg0.method168(255);
	anIntArray1641 = null;
    }
    
    public boolean method223(double arg0, int arg1, Class55 arg2) {
	for (int i = 0; i < anIntArray1649.length; i++) {
	    if (arg2.method880(-124, anIntArray1649[i]) == null)
		return false;
	}
	int i = arg1 * arg1;
	anIntArray1641 = new int[i * 4];
	for (int i_16_ = 0; i_16_ < anIntArray1649.length; i_16_++) {
	    Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		= Class23.method583(anIntArray1649[i_16_], 15090, arg2);
	    class11_sub10_sub13_sub3.method447();
	    byte[] is = class11_sub10_sub13_sub3.aByteArray2768;
	    int[] is_17_ = class11_sub10_sub13_sub3.anIntArray2773;
	    int i_18_ = anIntArray1645[i_16_];
	    if ((i_18_ & ~0xffffff) == 50331648) {
		int i_19_ = i_18_ & 0xff00ff;
		int i_20_ = i_18_ >> 8 & 0xff;
		for (int i_21_ = 0; i_21_ < is_17_.length; i_21_++) {
		    int i_22_ = is_17_[i_21_];
		    if ((i_22_ & 0xffff) == i_22_ >> 8) {
			i_22_ &= 0xff;
			is_17_[i_21_] = (i_19_ * i_22_ >> 8 & 0xff00ff
					 | i_20_ * i_22_ & 0xff00);
		    }
		}
	    }
	    for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++)
		is_17_[i_23_]
		    = Class11_Sub10_Sub13_Sub1.method413(is_17_[i_23_], arg0);
	    int i_24_;
	    if (i_16_ == 0)
		i_24_ = 0;
	    else
		i_24_ = anIntArray1650[i_16_ - 1];
	    if (i_24_ == 0) {
		if (class11_sub10_sub13_sub3.anInt2766 == arg1) {
		    for (int i_25_ = 0; i_25_ < i; i_25_++)
			anIntArray1641[i_25_] = is_17_[is[i_25_] & 0xff];
		} else if (class11_sub10_sub13_sub3.anInt2766 == 64
			   && arg1 == 128) {
		    int i_26_ = 0;
		    for (int i_27_ = 0; i_27_ < arg1; i_27_++) {
			for (int i_28_ = 0; i_28_ < arg1; i_28_++)
			    anIntArray1641[i_26_++]
				= is_17_[(is[(i_28_ >> 1) + (i_27_ >> 1 << 6)]
					  & 0xff)];
		    }
		} else if (class11_sub10_sub13_sub3.anInt2766 == 128
			   && arg1 == 64) {
		    int i_29_ = 0;
		    for (int i_30_ = 0; i_30_ < arg1; i_30_++) {
			for (int i_31_ = 0; i_31_ < arg1; i_31_++)
			    anIntArray1641[i_29_++]
				= is_17_[(is[(i_31_ << 1) + (i_30_ << 1 << 7)]
					  & 0xff)];
		    }
		} else
		    throw new RuntimeException();
	    }
	}
	for (int i_32_ = 0; i_32_ < i; i_32_++) {
	    anIntArray1641[i_32_] &= 0xf8f8ff;
	    int i_33_ = anIntArray1641[i_32_];
	    anIntArray1641[i_32_ + i] = i_33_ - (i_33_ >>> 3) & 0xf8f8ff;
	    anIntArray1641[i_32_ + i + i] = i_33_ - (i_33_ >>> 2) & 0xf8f8ff;
	    anIntArray1641[i_32_ + i + i + i]
		= i_33_ - (i_33_ >>> 2) - (i_33_ >>> 3) & 0xf8f8ff;
	}
	return true;
    }
}
