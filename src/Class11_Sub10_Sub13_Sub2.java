/* Class11_Sub10_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class11_Sub10_Sub13_Sub2 extends Class11_Sub10_Sub13
{
    public static Class31 aClass31_2741;
    public static Class31 aClass31_2742;
    public static Class31 aClass31_2743;
    public int[] anIntArray2744;
    public static Class31 aClass31_2745;
    public static Class31 aClass31_2746 = Class64.method992("gr2", 255);
    public static Class31 aClass31_2747;
    public static Class31 aClass31_2748;
    public static Class31 aClass31_2749;
    public int[] anIntArray2750;
    public static Class31 aClass31_2751;
    public static Class31 aClass31_2752;
    public static Class31 aClass31_2753;
    public Random aRandom2754;
    public static Class31 aClass31_2755;
    public static Class31 aClass31_2756;
    public static Class31 aClass31_2757;
    public byte[][] aByteArrayArray2758;
    public int anInt2759 = 0;
    public static Class31 aClass31_2760;
    public static Class31 aClass31_2761;
    public static Class31 aClass31_2762;
    public static Class31 aClass31_2763;
    public int[] anIntArray2764;
    public boolean aBoolean2765;
    
    public void method424(Class31 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    arg1 -= method428(arg0) / 2;
	    arg2 -= anInt2759;
	    for (int i = 0; i < arg0.anInt1403; i++) {
		int i_0_ = arg0.aByteArray1366[i] & 0xff;
		if (i_0_ != 32)
		    method429(aByteArrayArray2758[i_0_], arg1,
			      (arg2 + anIntArray2744[i_0_]
			       + (int) (Math.sin((double) i / 2.0
						 + (double) arg4 / 5.0)
					* 5.0)),
			      anIntArray2764[i_0_], anIntArray2750[i_0_],
			      arg3);
		arg1 += anIntArray2764[i_0_];
	    }
	}
    }
    
    public void method425(int[] arg0, byte[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_1_ = -arg6; i_1_ < 0; i_1_++) {
	    for (int i_2_ = i; i_2_ < 0; i_2_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_3_ = arg5; i_3_ < 0; i_3_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method426(Class31 arg0, int arg1, int arg2, int arg3) {
	method435(arg0, arg1 - method428(arg0) / 2, arg2, arg3);
    }
    
    public void method427(int[] arg0, byte[] arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6, int arg7, int arg8,
			  int arg9) {
	arg2 = ((arg2 & 0xff00ff) * arg9 & ~0xff00ff) + ((arg2 & 0xff00) * arg9
							 & 0xff0000) >> 8;
	arg9 = 256 - arg9;
	for (int i = -arg6; i < 0; i++) {
	    for (int i_4_ = -arg5; i_4_ < 0; i_4_++) {
		if (arg1[arg3++] != 0) {
		    int i_5_ = arg0[arg4];
		    arg0[arg4++] = ((((i_5_ & 0xff00ff) * arg9 & ~0xff00ff)
				     + ((i_5_ & 0xff00) * arg9 & 0xff0000))
				    >> 8) + arg2;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public int method428(Class31 arg0) {
	if (arg0 == null)
	    return 0;
	int i = 0;
	for (int i_6_ = 0; i_6_ < arg0.anInt1403; i_6_++)
	    i += anIntArray2764[arg0.aByteArray1366[i_6_] & 0xff];
	return i;
    }
    
    public void method429(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	int i = arg1 + arg2 * Class11_Sub10_Sub13.anInt2306;
	int i_7_ = Class11_Sub10_Sub13.anInt2306 - arg3;
	int i_8_ = 0;
	int i_9_ = 0;
	if (arg2 < Class11_Sub10_Sub13.anInt2305) {
	    int i_10_ = Class11_Sub10_Sub13.anInt2305 - arg2;
	    arg4 -= i_10_;
	    arg2 = Class11_Sub10_Sub13.anInt2305;
	    i_9_ += i_10_ * arg3;
	    i += i_10_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg2 + arg4 > Class11_Sub10_Sub13.anInt2304)
	    arg4 -= arg2 + arg4 - Class11_Sub10_Sub13.anInt2304;
	if (arg1 < Class11_Sub10_Sub13.anInt2303) {
	    int i_11_ = Class11_Sub10_Sub13.anInt2303 - arg1;
	    arg3 -= i_11_;
	    arg1 = Class11_Sub10_Sub13.anInt2303;
	    i_9_ += i_11_;
	    i += i_11_;
	    i_8_ += i_11_;
	    i_7_ += i_11_;
	}
	if (arg1 + arg3 > Class11_Sub10_Sub13.anInt2302) {
	    int i_12_ = arg1 + arg3 - Class11_Sub10_Sub13.anInt2302;
	    arg3 -= i_12_;
	    i_8_ += i_12_;
	    i_7_ += i_12_;
	}
	if (arg3 > 0 && arg4 > 0)
	    method425(Class11_Sub10_Sub13.anIntArray2307, arg0, arg5, i_9_, i,
		      arg3, arg4, i_7_, i_8_);
    }
    
    public void method430(Class31 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    arg1 -= method428(arg0) / 2;
	    arg2 -= anInt2759;
	    for (int i = 0; i < arg0.method623(42); i++) {
		int i_13_ = arg0.aByteArray1366[i] & 0xff;
		if (i_13_ != 32)
		    method429(aByteArrayArray2758[i_13_],
			      arg1 + (int) (Math.sin((double) i / 5.0
						     + (double) arg4 / 5.0)
					    * 5.0),
			      (arg2 + anIntArray2744[i_13_]
			       + (int) (Math.sin((double) i / 3.0
						 + (double) arg4 / 5.0)
					* 5.0)),
			      anIntArray2764[i_13_], anIntArray2750[i_13_],
			      arg3);
		arg1 += anIntArray2764[i_13_];
	    }
	}
    }
    
    public static void method431() {
	aClass31_2751 = null;
	aClass31_2742 = null;
	aClass31_2755 = null;
	aClass31_2743 = null;
	aClass31_2749 = null;
	aClass31_2752 = null;
	aClass31_2763 = null;
	aClass31_2760 = null;
	aClass31_2756 = null;
	aClass31_2745 = null;
	aClass31_2761 = null;
	aClass31_2757 = null;
	aClass31_2747 = null;
	aClass31_2748 = null;
	aClass31_2762 = null;
	aClass31_2746 = null;
	aClass31_2753 = null;
	aClass31_2741 = null;
    }
    
    public void method432(Class31 arg0, int arg1, int arg2, int arg3) {
	method435(arg0, arg1 - method428(arg0), arg2, arg3);
    }
    
    public void method433(byte[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	int i = arg1 + arg2 * Class11_Sub10_Sub13.anInt2306;
	int i_14_ = Class11_Sub10_Sub13.anInt2306 - arg3;
	int i_15_ = 0;
	int i_16_ = 0;
	if (arg2 < Class11_Sub10_Sub13.anInt2305) {
	    int i_17_ = Class11_Sub10_Sub13.anInt2305 - arg2;
	    arg4 -= i_17_;
	    arg2 = Class11_Sub10_Sub13.anInt2305;
	    i_16_ += i_17_ * arg3;
	    i += i_17_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg2 + arg4 > Class11_Sub10_Sub13.anInt2304)
	    arg4 -= arg2 + arg4 - Class11_Sub10_Sub13.anInt2304;
	if (arg1 < Class11_Sub10_Sub13.anInt2303) {
	    int i_18_ = Class11_Sub10_Sub13.anInt2303 - arg1;
	    arg3 -= i_18_;
	    arg1 = Class11_Sub10_Sub13.anInt2303;
	    i_16_ += i_18_;
	    i += i_18_;
	    i_15_ += i_18_;
	    i_14_ += i_18_;
	}
	if (arg1 + arg3 > Class11_Sub10_Sub13.anInt2302) {
	    int i_19_ = arg1 + arg3 - Class11_Sub10_Sub13.anInt2302;
	    arg3 -= i_19_;
	    i_15_ += i_19_;
	    i_14_ += i_19_;
	}
	if (arg3 > 0 && arg4 > 0)
	    method427(Class11_Sub10_Sub13.anIntArray2307, arg0, arg5, i_16_, i,
		      arg3, arg4, i_14_, i_15_, arg6);
    }
    
    public void method434(Class31 arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	aBoolean2765 = false;
	int i = arg1;
	if (arg0 != null) {
	    arg2 -= anInt2759;
	    for (int i_20_ = 0; i_20_ < arg0.anInt1403; i_20_++) {
		if (arg0.aByteArray1366[i_20_] == 64
		    && i_20_ + 4 < arg0.anInt1403
		    && arg0.aByteArray1366[i_20_ + 4] == 64) {
		    int i_21_
			= method439(arg0.method634(i_20_ + 4, -32, i_20_ + 1));
		    if (i_21_ != -1)
			arg3 = i_21_;
		    i_20_ += 4;
		} else {
		    int i_22_ = arg0.aByteArray1366[i_20_] & 0xff;
		    if (i_22_ != 32) {
			if (arg4)
			    method429(aByteArrayArray2758[i_22_], arg1 + 1,
				      arg2 + anIntArray2744[i_22_] + 1,
				      anIntArray2764[i_22_],
				      anIntArray2750[i_22_], 0);
			method429(aByteArrayArray2758[i_22_], arg1,
				  arg2 + anIntArray2744[i_22_],
				  anIntArray2764[i_22_], anIntArray2750[i_22_],
				  arg3);
		    }
		    arg1 += anIntArray2764[i_22_];
		}
	    }
	    if (aBoolean2765)
		Class11_Sub10_Sub13.method395(i,
					      arg2 + (int) ((double) anInt2759
							    * 0.7),
					      arg1 - i, 8388608);
	}
    }
    
    public void method435(Class31 arg0, int arg1, int arg2, int arg3) {
	if (arg0 != null) {
	    arg2 -= anInt2759;
	    for (int i = 0; i < arg0.anInt1403; i++) {
		int i_23_ = arg0.aByteArray1366[i] & 0xff;
		if (i_23_ != 32)
		    method429(aByteArrayArray2758[i_23_], arg1,
			      arg2 + anIntArray2744[i_23_],
			      anIntArray2764[i_23_], anIntArray2750[i_23_],
			      arg3);
		arg1 += anIntArray2764[i_23_];
	    }
	}
    }
    
    public int method436(Class31 arg0) {
	if (arg0 == null)
	    return 0;
	int i = 0;
	for (int i_24_ = 0; i_24_ < arg0.anInt1403; i_24_++) {
	    if (arg0.aByteArray1366[i_24_] == 64 && i_24_ + 4 < arg0.anInt1403
		&& arg0.aByteArray1366[i_24_ + 4] == 64)
		i_24_ += 4;
	    else
		i += anIntArray2764[arg0.aByteArray1366[i_24_] & 0xff];
	}
	return i;
    }
    
    public void method437(Class31 arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg0 != null) {
	    double d = 7.0 - (double) arg5 / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    arg1 -= method428(arg0) / 2;
	    arg2 -= anInt2759;
	    for (int i = 0; i < arg0.method623(45); i++) {
		int i_25_ = arg0.aByteArray1366[i] & 0xff;
		if (i_25_ != 32)
		    method429(aByteArrayArray2758[i_25_], arg1,
			      (arg2 + anIntArray2744[i_25_]
			       + (int) (Math.sin((double) i / 1.5
						 + (double) arg4)
					* d)),
			      anIntArray2764[i_25_], anIntArray2750[i_25_],
			      arg3);
		arg1 += anIntArray2764[i_25_];
	    }
	}
    }
    
    public void method438(Class31 arg0, int arg1, int arg2, int arg3,
			  boolean arg4) {
	method434(arg0, arg1 - method436(arg0) / 2, arg2, arg3, arg4);
    }
    
    public int method439(Class31 arg0) {
	if (arg0.method638(-10, aClass31_2751))
	    return 16711680;
	if (arg0.method638(-10, aClass31_2742))
	    return 65280;
	if (arg0.method638(-10, aClass31_2755))
	    return 255;
	if (arg0.method638(-10, aClass31_2743))
	    return 16776960;
	if (arg0.method638(-10, aClass31_2749))
	    return 65535;
	if (arg0.method638(-10, aClass31_2752))
	    return 16711935;
	if (arg0.method638(-10, aClass31_2763))
	    return 16777215;
	if (arg0.method638(-10, aClass31_2760))
	    return 0;
	if (arg0.method638(-10, aClass31_2756))
	    return 16748608;
	if (arg0.method638(-10, aClass31_2745))
	    return 8388608;
	if (arg0.method638(-10, aClass31_2761))
	    return 128;
	if (arg0.method638(-10, aClass31_2757))
	    return 16756736;
	if (arg0.method638(-10, aClass31_2747))
	    return 16740352;
	if (arg0.method638(-10, aClass31_2748))
	    return 16723968;
	if (arg0.method638(-10, aClass31_2762))
	    return 12648192;
	if (arg0.method638(-10, aClass31_2746))
	    return 8453888;
	if (arg0.method638(-10, aClass31_2753))
	    return 4259584;
	if (arg0.method638(-10, aClass31_2741))
	    aBoolean2765 = true;
	return -1;
    }
    
    public void method440(Class31 arg0, int arg1, int arg2, int arg3,
			  boolean arg4, int arg5) {
	if (arg0 != null) {
	    aRandom2754.setSeed((long) arg5);
	    int i = 192 + (aRandom2754.nextInt() & 0x1f);
	    arg2 -= anInt2759;
	    for (int i_26_ = 0; i_26_ < arg0.anInt1403; i_26_++) {
		if (arg0.aByteArray1366[i_26_] == 64
		    && i_26_ + 4 < arg0.anInt1403
		    && arg0.aByteArray1366[i_26_ + 4] == 64) {
		    int i_27_
			= method439(arg0.method634(i_26_ + 4, -32, i_26_ + 1));
		    if (i_27_ != -1)
			arg3 = i_27_;
		    i_26_ += 4;
		} else {
		    int i_28_ = arg0.aByteArray1366[i_26_] & 0xff;
		    if (i_28_ != 32) {
			if (arg4)
			    method433(aByteArrayArray2758[i_28_], arg1 + 1,
				      arg2 + anIntArray2744[i_28_] + 1,
				      anIntArray2764[i_28_],
				      anIntArray2750[i_28_], 0, 192);
			method433(aByteArrayArray2758[i_28_], arg1,
				  arg2 + anIntArray2744[i_28_],
				  anIntArray2764[i_28_], anIntArray2750[i_28_],
				  arg3, i);
		    }
		    arg1 += anIntArray2764[i_28_];
		    if ((aRandom2754.nextInt() & 0x3) == 0)
			arg1++;
		}
	    }
	}
    }
    
    public Class11_Sub10_Sub13_Sub2(int[] arg0, int[] arg1, int[] arg2,
				    int[] arg3, byte[][] arg4) {
	aByteArrayArray2758 = new byte[256][];
	aRandom2754 = new Random();
	aBoolean2765 = false;
	anIntArray2744 = arg0;
	anIntArray2764 = arg1;
	anIntArray2750 = arg2;
	byte i = 0;
	for (int i_29_ = 1; i_29_ < arg3.length; i_29_++) {
	    if (arg3[i_29_] == 1)
		i = (byte) i_29_;
	}
	aByteArrayArray2758 = arg4;
	for (int i_30_ = 0; i_30_ < 256; i_30_++) {
	    byte[] is = aByteArrayArray2758[i_30_];
	    int i_31_ = is.length;
	    for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
		is[i_32_] = is[i_32_] == i ? (byte) 0 : (byte) 1;
	}
	anInt2759 = anIntArray2744[32] + anIntArray2750[32];
    }
    
    static {
	aClass31_2745 = Class64.method992("dre", 255);
	aClass31_2742 = Class64.method992("gre", 255);
	aClass31_2743 = Class64.method992("yel", 255);
	aClass31_2741 = Class64.method992("str", 255);
	aClass31_2752 = Class64.method992("mag", 255);
	aClass31_2747 = Class64.method992("or2", 255);
	aClass31_2757 = Class64.method992("or1", 255);
	aClass31_2760 = Class64.method992("bla", 255);
	aClass31_2748 = Class64.method992("or3", 255);
	aClass31_2751 = Class64.method992("red", 255);
	aClass31_2749 = Class64.method992("cya", 255);
	aClass31_2756 = Class64.method992("lre", 255);
	aClass31_2761 = Class64.method992("dbl", 255);
	aClass31_2763 = Class64.method992("whi", 255);
	aClass31_2755 = Class64.method992("blu", 255);
	aClass31_2753 = Class64.method992("gr3", 255);
	aClass31_2762 = Class64.method992("gr1", 255);
    }
}
