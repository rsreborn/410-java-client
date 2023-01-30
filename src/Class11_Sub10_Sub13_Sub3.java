/* Class11_Sub10_Sub13_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub13_Sub3 extends Class11_Sub10_Sub13
{
    public int anInt2766;
    public int anInt2767;
    public byte[] aByteArray2768;
    public int anInt2769;
    public int anInt2770;
    public int anInt2771;
    public int anInt2772;
    public int[] anIntArray2773;
    
    public void method441() {
	byte[] is = new byte[anInt2766 * anInt2772];
	int i = 0;
	for (int i_0_ = 0; i_0_ < anInt2772; i_0_++) {
	    for (int i_1_ = anInt2766 - 1; i_1_ >= 0; i_1_--)
		is[i++] = aByteArray2768[i_1_ + i_0_ * anInt2766];
	}
	aByteArray2768 = is;
	anInt2769 = anInt2771 - anInt2766 - anInt2769;
    }
    
    public Class11_Sub10_Sub13_Sub3 method442() {
	Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
	    = new Class11_Sub10_Sub13_Sub3(anInt2766, anInt2772,
					   anIntArray2773.length);
	class11_sub10_sub13_sub3.anInt2771 = anInt2771;
	class11_sub10_sub13_sub3.anInt2770 = anInt2770;
	class11_sub10_sub13_sub3.anInt2769 = anInt2769;
	class11_sub10_sub13_sub3.anInt2767 = anInt2767;
	int i = aByteArray2768.length;
	for (int i_2_ = 0; i_2_ < i; i_2_++)
	    class11_sub10_sub13_sub3.aByteArray2768[i_2_]
		= aByteArray2768[i_2_];
	i = anIntArray2773.length;
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    class11_sub10_sub13_sub3.anIntArray2773[i_3_]
		= anIntArray2773[i_3_];
	return class11_sub10_sub13_sub3;
    }
    
    public void method443(int arg0, int arg1) {
	arg0 += anInt2769;
	arg1 += anInt2767;
	int i = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	int i_4_ = 0;
	int i_5_ = anInt2772;
	int i_6_ = anInt2766;
	int i_7_ = Class11_Sub10_Sub13.anInt2306 - i_6_;
	int i_8_ = 0;
	if (arg1 < Class11_Sub10_Sub13.anInt2305) {
	    int i_9_ = Class11_Sub10_Sub13.anInt2305 - arg1;
	    i_5_ -= i_9_;
	    arg1 = Class11_Sub10_Sub13.anInt2305;
	    i_4_ += i_9_ * i_6_;
	    i += i_9_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg1 + i_5_ > Class11_Sub10_Sub13.anInt2304)
	    i_5_ -= arg1 + i_5_ - Class11_Sub10_Sub13.anInt2304;
	if (arg0 < Class11_Sub10_Sub13.anInt2303) {
	    int i_10_ = Class11_Sub10_Sub13.anInt2303 - arg0;
	    i_6_ -= i_10_;
	    arg0 = Class11_Sub10_Sub13.anInt2303;
	    i_4_ += i_10_;
	    i += i_10_;
	    i_8_ += i_10_;
	    i_7_ += i_10_;
	}
	if (arg0 + i_6_ > Class11_Sub10_Sub13.anInt2302) {
	    int i_11_ = arg0 + i_6_ - Class11_Sub10_Sub13.anInt2302;
	    i_6_ -= i_11_;
	    i_8_ += i_11_;
	    i_7_ += i_11_;
	}
	if (i_6_ > 0 && i_5_ > 0)
	    method446(Class11_Sub10_Sub13.anIntArray2307, aByteArray2768,
		      anIntArray2773, i_4_, i, i_6_, i_5_, i_7_, i_8_);
    }
    
    public void method444(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray2773.length; i++) {
	    int i_12_ = anIntArray2773[i] >> 16 & 0xff;
	    i_12_ += arg0;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
	    int i_13_ = anIntArray2773[i] >> 8 & 0xff;
	    i_13_ += arg1;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 255)
		i_13_ = 255;
	    int i_14_ = anIntArray2773[i] & 0xff;
	    i_14_ += arg2;
	    if (i_14_ < 0)
		i_14_ = 0;
	    else if (i_14_ > 255)
		i_14_ = 255;
	    anIntArray2773[i] = (i_12_ << 16) + (i_13_ << 8) + i_14_;
	}
    }
    
    public void method445() {
	byte[] is = new byte[anInt2766 * anInt2772];
	int i = 0;
	for (int i_15_ = anInt2772 - 1; i_15_ >= 0; i_15_--) {
	    for (int i_16_ = 0; i_16_ < anInt2766; i_16_++)
		is[i++] = aByteArray2768[i_16_ + i_15_ * anInt2766];
	}
	aByteArray2768 = is;
	anInt2767 = anInt2770 - anInt2772 - anInt2767;
    }
    
    public static void method446(int[] arg0, byte[] arg1, int[] arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_17_ = -arg6; i_17_ < 0; i_17_++) {
	    for (int i_18_ = i; i_18_ < 0; i_18_++) {
		int i_19_ = arg1[arg3++];
		if (i_19_ != 0)
		    arg0[arg4++] = arg2[i_19_ & 0xff];
		else
		    arg4++;
		i_19_ = arg1[arg3++];
		if (i_19_ != 0)
		    arg0[arg4++] = arg2[i_19_ & 0xff];
		else
		    arg4++;
		i_19_ = arg1[arg3++];
		if (i_19_ != 0)
		    arg0[arg4++] = arg2[i_19_ & 0xff];
		else
		    arg4++;
		i_19_ = arg1[arg3++];
		if (i_19_ != 0)
		    arg0[arg4++] = arg2[i_19_ & 0xff];
		else
		    arg4++;
	    }
	    for (int i_20_ = arg5; i_20_ < 0; i_20_++) {
		int i_21_ = arg1[arg3++];
		if (i_21_ != 0)
		    arg0[arg4++] = arg2[i_21_ & 0xff];
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class11_Sub10_Sub13_Sub3() {
	/* empty */
    }
    
    public Class11_Sub10_Sub13_Sub3(int arg0, int arg1, int arg2) {
	anInt2771 = anInt2766 = arg0;
	anInt2770 = anInt2772 = arg1;
	anInt2769 = anInt2767 = 0;
	aByteArray2768 = new byte[arg0 * arg1];
	anIntArray2773 = new int[arg2];
    }
    
    public void method447() {
	if (anInt2766 != anInt2771 || anInt2772 != anInt2770) {
	    byte[] is = new byte[anInt2771 * anInt2770];
	    int i = 0;
	    for (int i_22_ = 0; i_22_ < anInt2772; i_22_++) {
		for (int i_23_ = 0; i_23_ < anInt2766; i_23_++)
		    is[i_23_ + anInt2769 + (i_22_ + anInt2767) * anInt2771]
			= aByteArray2768[i++];
	    }
	    aByteArray2768 = is;
	    anInt2766 = anInt2771;
	    anInt2772 = anInt2770;
	    anInt2769 = 0;
	    anInt2767 = 0;
	}
    }
}
