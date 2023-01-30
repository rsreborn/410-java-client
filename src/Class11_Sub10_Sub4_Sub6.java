/* Class11_Sub10_Sub4_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub6 extends Class11_Sub10_Sub4
{
    public int anInt2693;
    public int anInt2694 = 0;
    public static int anInt2695;
    public boolean aBoolean2696 = false;
    public static int anInt2697;
    public static int anInt2698;
    public static int anInt2699;
    public static Class31 aClass31_2700;
    public static Buffer aBuffer_2701;
    public static int anInt2702;
    public static Class31 aClass31_2703 = Class64.method992("scrollbar", 255);
    public int anInt2704;
    public Class11_Sub10_Sub12 aClass11_Sub10_Sub12_2705;
    public static Class31 aClass31_2706;
    public static long aLong2707 = 0L;
    public int anInt2708;
    public int anInt2709;
    public int anInt2710;
    public static int anInt2711;
    public int anInt2712;
    public static Class11_Sub10_Sub13_Sub4[] aClass11_Sub10_Sub13_Sub4Array2713;
    public int anInt2714 = 0;
    public static int anInt2715;
    public static int anInt2716;
    public static Class31 aClass31_2717;
    public static Class31 aClass31_2718;
    public static Class31 aClass31_2719;
    public static int anInt2720;
    
    public static void method328(boolean arg0, boolean arg1, Class55 arg2,
				 Class55 arg3) {
	do {
	    try {
		Class11_Sub10_Sub10.aClass55_2236 = arg2;
		Class32.aClass55_589 = arg3;
		Class11_Sub10_Sub15.aBoolean2366 = arg1;
		anInt2699++;
		if (arg0 == true)
		    break;
		anInt2720 = -122;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					("u.B(" + arg0 + ',' + arg1 + ','
					 + (arg2 != null ? "{...}" : "null")
					 + ','
					 + (arg3 != null ? "{...}" : "null")
					 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    Class11_Sub10_Sub11 class11_sub10_sub11
		= Class11_Sub10_Sub1.method229((byte) 30, anInt2710);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4;
	    if (aBoolean2696)
		class11_sub10_sub4_sub4
		    = class11_sub10_sub11.method378((byte) -39, -1);
	    else
		class11_sub10_sub4_sub4
		    = class11_sub10_sub11.method378((byte) -39, anInt2714);
	    anInt2716++;
	    if (arg0 != 3)
		aClass31_2717 = null;
	    if (class11_sub10_sub4_sub4 == null)
		return null;
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "u.D(" + arg0 + ')');
	}
    }
    
    public void method329(int arg0, boolean arg1) {
	try {
	    anInt2695++;
	    if (!aBoolean2696) {
		if (arg1 != true)
		    aBoolean2696 = false;
		anInt2694 += arg0;
		while (anInt2694
		       > aClass11_Sub10_Sub12_2705.anIntArray2296[anInt2714]) {
		    anInt2694
			-= aClass11_Sub10_Sub12_2705.anIntArray2296[anInt2714];
		    anInt2714++;
		    if (anInt2714
			>= aClass11_Sub10_Sub12_2705.anIntArray2280.length) {
			aBoolean2696 = true;
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "u.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method330(int arg0) {
	try {
	    int i = -127 / ((-31 - arg0) / 46);
	    aClass31_2719 = null;
	    aBuffer_2701 = null;
	    aClass31_2703 = null;
	    aClass31_2700 = null;
	    aClass31_2706 = null;
	    aClass31_2718 = null;
	    aClass31_2717 = null;
	    aClass11_Sub10_Sub13_Sub4Array2713 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "u.A(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub6(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int arg6) {
	try {
	    anInt2693 = arg4;
	    anInt2712 = arg1;
	    anInt2708 = arg5 + arg6;
	    anInt2709 = arg2;
	    anInt2710 = arg0;
	    anInt2704 = arg3;
	    int i
		= Class11_Sub10_Sub1.method229((byte) 30, anInt2710).anInt2262;
	    if (i != -1) {
		aBoolean2696 = false;
		aClass11_Sub10_Sub12_2705 = NotActuallyBuffer.method600(i, 4867);
	    } else
		aBoolean2696 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("u.<init>(" + arg0 + ',' + arg1 + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ','
				     + arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	aClass31_2706 = Class64.method992("Drop", 255);
	aClass31_2700 = aClass31_2706;
	anInt2697 = 0;
	aClass11_Sub10_Sub13_Sub4Array2713
	    = new Class11_Sub10_Sub13_Sub4[1000];
	aBuffer_2701 = new Buffer(new byte[5000]);
	aClass31_2717 = Class64.method992("Login limit exceeded)3", 255);
	aClass31_2718
	    = (Class64.method992
	       ("Moderator option: Mute player for 48 hours: <OFF>", 255));
	aClass31_2719 = Class64.method992("mapedge", 255);
	anInt2720 = 0;
    }
}
