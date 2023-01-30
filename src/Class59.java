/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
    public static int[] anIntArray1231;
    public static int anInt1232;
    public static int anInt1233;
    public static int anInt1234;
    public static Class31 aClass31_1235;
    public static int anInt1236 = 0;
    public static int anInt1237;
    public static int anInt1238;
    public static Class31 aClass31_1239;
    public static Class36 aClass36_1240;
    public static Class11_Sub10_Sub13_Sub4 aClass11_Sub10_Sub13_Sub4_1241;
    public static int anInt1242;
    public static int[] anIntArray1243;
    
    public static void method947(int arg0) {
	try {
	    aClass36_1240 = null;
	    anIntArray1231 = null;
	    if (arg0 != -1)
		anIntArray1243 = null;
	    aClass11_Sub10_Sub13_Sub4_1241 = null;
	    anIntArray1243 = null;
	    aClass31_1239 = null;
	    aClass31_1235 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "wa.A(" + arg0 + ')');
	}
    }
    
    public static void method948(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt1232++;
	    if ((arg1 ^ 0xffffffff) > -129 || (arg2 ^ 0xffffffff) > -129
		|| arg1 > 13056 || (arg2 ^ 0xffffffff) < -13057) {
		Class3.anInt130 = -1;
		Class39_Sub1.anInt1838 = -1;
	    } else {
		int i = (Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82,
							   arg1, 3, arg2)
			 - arg0);
		arg1 -= Class15_Sub2.anInt1764;
		arg2 -= Class15_Sub1.anInt1748;
		int i_0_ = (Class11_Sub10_Sub4_Sub4.anIntArray2632
			    [Class11_Sub8.anInt1628]);
		int i_1_ = (Class11_Sub10_Sub4_Sub4.anIntArray2654
			    [Class11_Sub8.anInt1628]);
		i -= Class42.anInt761;
		int i_2_
		    = Class11_Sub10_Sub4_Sub4.anIntArray2632[Class8.anInt180];
		int i_3_
		    = Class11_Sub10_Sub4_Sub4.anIntArray2654[Class8.anInt180];
		int i_4_ = i_2_ * arg2 - -(arg1 * i_3_) >> -39756080;
		arg2 = i_3_ * arg2 + -(i_2_ * arg1) >> 604294192;
		arg1 = i_4_;
		i_4_ = -(arg2 * i_0_) + i * i_1_ >> 69228048;
		arg2 = i * i_0_ - -(arg2 * i_1_) >> -2023032240;
		if (arg3 != -1)
		    anIntArray1231 = null;
		i = i_4_;
		if ((arg2 ^ 0xffffffff) > -51) {
		    Class39_Sub1.anInt1838 = -1;
		    Class3.anInt130 = -1;
		} else {
		    Class39_Sub1.anInt1838 = 167 + (i << 1895549865) / arg2;
		    Class3.anInt130 = (arg1 << 160113897) / arg2 + 256;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("wa.B(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    static {
	aClass31_1235 = Class64.method992("m", 255);
	aClass31_1239
	    = Class64.method992("RuneScape is loading )2 please wait)3)3)3",
				255);
	aClass36_1240 = new Class36();
	anInt1242 = 0;
	anIntArray1243
	    = (new int[]
	       { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1,
		 -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1,
		 -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1,
		 -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1,
		 -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54,
		 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37,
		 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225,
		 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7,
		 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 });
    }
}
