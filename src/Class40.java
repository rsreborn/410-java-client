/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class40
{
    public static int anInt722 = 0;
    public static int anInt723;
    public static int anInt724;
    public static int anInt725;
    public static Class37 aClass37_726;
    public static int anInt727;
    public static Class11_Sub5_Sub1 aClass11_Sub5_Sub1_728;
    public static Class61 aClass61_729;
    public static int anInt730;
    public static int anInt731 = 0;
    public static Class31 aClass31_732;
    public Class11_Sub10 aClass11_Sub10_733 = new Class11_Sub10();
    public static int anInt734;
    public static int anInt735 = 0;
    public static int anInt736;
    public static int anInt737;
    public static Class37 aClass37_738;
    public static int anInt739;
    public static int anInt740;
    public int anInt741;
    public Class34 aClass34_742;
    public Class32 aClass32_743 = new Class32();
    public int anInt744;
    public static Class41 aClass41_745;
    public static Class31 aClass31_746;
    
    public Class11_Sub10 method735(long arg0, byte arg1) {
	try {
	    anInt727++;
	    if (arg1 >= -71)
		anInt741 = -10;
	    Class11_Sub10 class11_sub10
		= (Class11_Sub10) aClass34_742.method677(124, arg0);
	    if (class11_sub10 != null)
		aClass32_743.method656(class11_sub10, (byte) 98);
	    return class11_sub10;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "qc.I(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static int method736(int arg0, int arg1, int arg2, int arg3,
				int arg4) {
	try {
	    int i
		= (-Class11_Sub10_Sub13_Sub1.anIntArray2721[arg0 * 1024 / arg3]
		   + 65536) >> arg1;
	    anInt734++;
	    return (((-i + 65536) * arg2 >> 933909168)
		    - -(i * arg4 >> 1288888880));
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("qc.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public void method737(int arg0, long arg1) {
	do {
	    try {
		if (arg0 != 1)
		    method743((byte) 70, null);
		anInt723++;
		Class11_Sub10 class11_sub10
		    = (Class11_Sub10) aClass34_742.method677(120, arg1);
		if (class11_sub10 == null)
		    break;
		class11_sub10.method107(0);
		class11_sub10.method227(arg0 ^ ~0x70);
		anInt744++;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					"qc.B(" + arg0 + ',' + arg1 + ')');
	    }
	    break;
	} while (false);
    }
    
    public static void method738(int arg0) {
	try {
	    aClass11_Sub5_Sub1_728 = null;
	    aClass41_745 = null;
	    aClass31_746 = null;
	    if (arg0 == -30466) {
		aClass31_732 = null;
		aClass61_729 = null;
		aClass37_726 = null;
		aClass37_738 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "qc.A(" + arg0 + ')');
	}
    }
    
    public static void method739(Class55 arg0, Class55 arg1, int arg2) {
	try {
	    Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2814 = arg0;
	    if (arg2 == -24414) {
		Class37_Sub1.aClass55_1792 = arg1;
		anInt739++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("qc.F("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public void method740(int arg0) {
	try {
	    if (arg0 != 4)
		method736(71, 87, -34, 78, 114);
	    anInt724++;
	    for (;;) {
		Class11_Sub10 class11_sub10
		    = aClass32_743.method657(arg0 + 26431);
		if (class11_sub10 == null)
		    break;
		class11_sub10.method107(0);
		class11_sub10.method227(-118);
	    }
	    anInt744 = anInt741;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "qc.D(" + arg0 + ')');
	}
    }
    
    public static void method741(byte arg0) {
	anInt730++;
	if (arg0 == 83) {
	    if (Class11_Sub10_Sub4_Sub5.anInt2681 == 1) {
		if ((Class61.anInt1266 ^ 0xffffffff) <= -7
		    && Class61.anInt1266 <= 106 && Class50.anInt995 >= 467
		    && (Class50.anInt995 ^ 0xffffffff) >= -500) {
		    Class20.aBoolean392 = true;
		    Class11_Sub10_Sub10.anInt2222
			= (1 + Class11_Sub10_Sub10.anInt2222) % 4;
		    Class31.anInt1386++;
		    Class32.aBoolean575 = true;
		    aClass11_Sub5_Sub1_728.method196(arg0 ^ 0x52, 132);
		    aClass11_Sub5_Sub1_728.writeByte(
					(Class11_Sub10_Sub10
						      .anInt2222));
		    aClass11_Sub5_Sub1_728.writeByte(Class59.anInt1236);
		    aClass11_Sub5_Sub1_728.writeByte(Class58.anInt1222);
		}
		if ((Class61.anInt1266 ^ 0xffffffff) <= -136
		    && (Class61.anInt1266 ^ 0xffffffff) >= -236
		    && (Class50.anInt995 ^ 0xffffffff) <= -468
		    && (Class50.anInt995 ^ 0xffffffff) >= -500) {
		    Class32.aBoolean575 = true;
		    Class20.aBoolean392 = true;
		    Class31.anInt1386++;
		    Class59.anInt1236 = (Class59.anInt1236 - -1) % 3;
		    aClass11_Sub5_Sub1_728.method196(1, 132);
		    aClass11_Sub5_Sub1_728
			.writeByte(Class11_Sub10_Sub10.anInt2222);
		    aClass11_Sub5_Sub1_728.writeByte(
					Class59.anInt1236);
		    aClass11_Sub5_Sub1_728.writeByte(Class58.anInt1222);
		}
		if ((Class61.anInt1266 ^ 0xffffffff) <= -274
		    && Class61.anInt1266 <= 373
		    && (Class50.anInt995 ^ 0xffffffff) <= -468
		    && (Class50.anInt995 ^ 0xffffffff) >= -500) {
		    Class58.anInt1222 = (Class58.anInt1222 + 1) % 3;
		    Class20.aBoolean392 = true;
		    Class31.anInt1386++;
		    Class32.aBoolean575 = true;
		    aClass11_Sub5_Sub1_728.method196(1, 132);
		    aClass11_Sub5_Sub1_728
			.writeByte(Class11_Sub10_Sub10.anInt2222);
		    aClass11_Sub5_Sub1_728.writeByte(Class59.anInt1236);
		    aClass11_Sub5_Sub1_728.writeByte(Class58.anInt1222);
		}
		if ((Class61.anInt1266 ^ 0xffffffff) <= -413
		    && (Class61.anInt1266 ^ 0xffffffff) >= -513
		    && Class50.anInt995 >= 467
		    && (Class50.anInt995 ^ 0xffffffff) >= -500) {
		    if ((Buffer.anInt1564 ^ 0xffffffff) != 0)
			Class11_Sub10_Sub4_Sub3.method288(0,
							  Class25.aClass31_461,
							  (Class53
							   .aClass31_1038),
							  true);
		    else {
			Class24.method584(arg0 + -211);
			if (Class11_Sub7.anInt1612 != -1) {
			    Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809 = false;
			    Class25.aClass31_465 = Class25.aClass31_461;
			    Class36.anInt667 = Buffer.anInt1564
				= Class11_Sub7.anInt1612;
			}
		    }
		}
	    }
	}
    }
    
    public void method742(int arg0, long arg1, Class11_Sub10 arg2) {
	try {
	    anInt737++;
	    if (anInt744 != 0)
		anInt744--;
	    else {
		Class11_Sub10 class11_sub10 = aClass32_743.method657(26435);
		class11_sub10.method107(0);
		class11_sub10.method227(52);
		if (class11_sub10 == aClass11_Sub10_733) {
		    class11_sub10 = aClass32_743.method657(26435);
		    class11_sub10.method107(0);
		    class11_sub10.method227(-47);
		}
	    }
	    if (arg0 <= -119) {
		aClass34_742.method682(126, arg2, arg1);
		aClass32_743.method656(arg2, (byte) 98);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("qc.J(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method743(byte arg0, Graphics arg1) {
	try {
	    Class12.aClass37_243.method704(0, arg1, 4, 4);
	    if (arg0 < -46)
		anInt736++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("qc.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static Class31 method744(int arg0, Class31[] arg1) {
	try {
	    if (arg0 != 0)
		anInt725 = 60;
	    anInt740++;
	    if ((arg1.length ^ 0xffffffff) > -3)
		throw new IllegalArgumentException();
	    return Class11_Sub4.method137(arg1, 0, arg0 + 8526, arg1.length);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("qc.G(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class40(int arg0) {
	try {
	    anInt744 = arg0;
	    anInt741 = arg0;
	    int i;
	    for (i = 1; i + i < arg0; i += i) {
		/* empty */
	    }
	    aClass34_742 = new Class34(i);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "qc.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_732 = Class64.method992(" (Xskill)2", 255);
	aClass11_Sub5_Sub1_728 = new Class11_Sub5_Sub1(5000);
	aClass31_746 = Class64.method992(")3", 255);
    }
}
