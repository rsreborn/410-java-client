/* Class11_Sub10_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub3 extends Class11_Sub10
{
    public static int anInt2013;
    public static Class31 aClass31_2014 = Class64.method992("@gre@World", 255);
    public int anInt2015 = 0;
    public static int anInt2016;
    public static int anInt2017;
    public static Class31 aClass31_2018
	= Class64.method992("Welcome to RuneScape", 255);
    public static Class37 aClass37_2019;
    public static Class46 aClass46_2020;
    public static Class31 aClass31_2021;
    public static Class31 aClass31_2022;
    public static int anInt2023;
    public static int anInt2024;
    public static int anInt2025;
    public static Class31 aClass31_2026;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array2027;
    public static int anInt2028;
    public static Class31 aClass31_2029;
    
    public static void method248(boolean arg0, int arg1) {
	anInt2028++;
	if (Class11.aClass14_222 != null) {
	    try {
		Buffer buffer = new Buffer(4);
		buffer.writeByte(arg0 ? 2 : 3);
		buffer.method148((byte) -48, 0);
		Class11.aClass14_222.method521(buffer.payload, 4,
					       0, true);
	    } catch (java.io.IOException ioexception) {
		try {
		    Class11.aClass14_222.method520(-9098);
		} catch (Exception exception) {
		    /* empty */
		}
		Class11.aClass14_222 = null;
		Class57.anInt1158++;
	    }
	    if (arg1 != -23689)
		method248(false, -88);
	}
    }
    
    public void method249(Buffer arg0, boolean arg1) {
	for (;;) {
	    int i = arg0.method168(255);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method250(arg0, -6, i);
	}
	anInt2025++;
	if (arg1 != false)
	    anInt2023 = -96;
    }
    
    public void method250(Buffer arg0, int arg1, int arg2) {
	anInt2017++;
	if (arg1 == (arg2 ^ 0xffffffff))
	    anInt2015 = arg0.method164(127);
    }
    
    public static void method251(int arg0) {
	try {
	    aClass37_2019 = null;
	    aClass31_2022 = null;
	    aClass31_2026 = null;
	    if (arg0 == 29737) {
		aClass11_Sub10_Sub13_Sub4Array2027 = null;
		aClass31_2029 = null;
		aClass46_2020 = null;
		aClass31_2018 = null;
		aClass31_2014 = null;
		aClass31_2021 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ic.C(" + arg0 + ')');
	}
    }
    
    static {
	anInt2013 = 0;
	aClass31_2021 = Class64.method992("cross", 255);
	anInt2024 = 0;
	anInt2016 = 0;
	aClass31_2026 = Class64.method992("shake:", 255);
	aClass31_2022 = Class64.method992(" with)3)3)3", 255);
	aClass31_2029 = Class64.method992("(U(Y", 255);
    }
}
