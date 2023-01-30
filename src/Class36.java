/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class36
{
    public static int anInt653;
    public static int anInt654;
    public static byte[][][] aByteArrayArrayArray655;
    public static int anInt656;
    public static int anInt657;
    public static int anInt658;
    public static Class31 aClass31_659;
    public static int anInt660;
    public Class11 aClass11_661 = new Class11();
    public static int anInt662;
    public static int anInt663;
    public static Class31 aClass31_664;
    public static int anInt665;
    public static int anInt666;
    public static int anInt667;
    public static Class31 aClass31_668
	= Class64.method992("Login server offline)3", 255);
    public static int anInt669;
    public static boolean aBoolean670;
    public static Class35[] aClass35Array671;
    public static int anInt672;
    public static Class31 aClass31_673;
    public static int anInt674;
    public Class11 aClass11_675;
    public static int anInt676;
    public static int anInt677;
    public static int anInt678;
    public static int anInt679;
    public static int anInt680;
    
    public Class11 method688(boolean arg0) {
	try {
	    anInt680++;
	    if (arg0 != false)
		method693(64, null, null);
	    Class11 class11 = aClass11_661.aClass11_226;
	    if (aClass11_661 == class11)
		return null;
	    class11.method107(0);
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.M(" + arg0 + ')');
	}
    }
    
    public static void method689(int arg0) {
	try {
	    if (arg0 == -19737) {
		aClass31_659 = null;
		aClass31_664 = null;
		aClass31_668 = null;
		aByteArrayArrayArray655 = null;
		aClass35Array671 = null;
		aClass31_673 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.H(" + arg0 + ')');
	}
    }
    
    public Class11 method690(int arg0) {
	try {
	    Class11 class11 = aClass11_661.aClass11_233;
	    anInt674++;
	    if (aClass11_661 == class11)
		return null;
	    class11.method107(0);
	    if (arg0 != -20575)
		method696((byte) -2);
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.E(" + arg0 + ')');
	}
    }
    
    public void method691(byte arg0, Class11 arg1) {
	try {
	    anInt657++;
	    if (arg1.aClass11_226 != null)
		arg1.method107(arg0 + 98);
	    arg1.aClass11_233 = aClass11_661;
	    if (arg0 != -98)
		method690(1);
	    arg1.aClass11_226 = aClass11_661.aClass11_226;
	    arg1.aClass11_226.aClass11_233 = arg1;
	    arg1.aClass11_233.aClass11_226 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("od.G(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void method692(int arg0) {
	try {
	    anInt660++;
	    if (arg0 != -9707)
		method696((byte) 90);
	    for (;;) {
		Class11 class11 = aClass11_661.aClass11_233;
		if (aClass11_661 == class11)
		    break;
		class11.method107(0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.K(" + arg0 + ')');
	}
    }
    
    public void method693(int arg0, Class11 arg1, Class11 arg2) {
	do {
	    try {
		anInt658++;
		if (arg2.aClass11_226 != null)
		    arg2.method107(0);
		arg2.aClass11_233 = arg1;
		arg2.aClass11_226 = arg1.aClass11_226;
		arg2.aClass11_226.aClass11_233 = arg2;
		arg2.aClass11_233.aClass11_226 = arg2;
		if (arg0 < -21)
		    break;
		method689(-110);
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					("od.J(" + arg0 + ','
					 + (arg1 != null ? "{...}" : "null")
					 + ','
					 + (arg2 != null ? "{...}" : "null")
					 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public Class11 method694(byte arg0) {
	try {
	    anInt654++;
	    Class11 class11 = aClass11_661.aClass11_233;
	    if (arg0 > -110)
		return null;
	    if (class11 == aClass11_661) {
		aClass11_675 = null;
		return null;
	    }
	    aClass11_675 = class11.aClass11_233;
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.L(" + arg0 + ')');
	}
    }
    
    public Class11 method695(int arg0) {
	try {
	    anInt662++;
	    if (arg0 >= -85)
		method699((byte) 37, null);
	    Class11 class11 = aClass11_675;
	    if (class11 == aClass11_661) {
		aClass11_675 = null;
		return null;
	    }
	    aClass11_675 = class11.aClass11_226;
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.I(" + arg0 + ')');
	}
    }
    
    public Class11 method696(byte arg0) {
	try {
	    anInt653++;
	    Class11 class11 = aClass11_661.aClass11_226;
	    if (aClass11_661 == class11) {
		aClass11_675 = null;
		return null;
	    }
	    if (arg0 != -68)
		return null;
	    aClass11_675 = class11.aClass11_226;
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.B(" + arg0 + ')');
	}
    }
    
    public static void method697(int arg0) {
	try {
	    for (int i = arg0; i < Class32.anInt581; i++) {
		int i_0_ = Class11_Sub10_Sub5.anIntArray2063[i];
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_0_];
		if (class11_sub10_sub4_sub2_sub2 != null)
		    Class51.method851(class11_sub10_sub4_sub2_sub2,
				      (class11_sub10_sub4_sub2_sub2
				       .aClass11_Sub10_Sub14_2828.anInt2308),
				      64);
	    }
	    anInt679++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.F(" + arg0 + ')');
	}
    }
    
    public static boolean method698(int arg0, int arg1) {
	try {
	    anInt677++;
	    if ((arg0 ^ 0xffffffff) > -33)
		return false;
	    if (arg1 == arg0)
		return false;
	    if (arg0 >= 129 && arg0 <= 159)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "od.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class36() {
	try {
	    aClass11_661.aClass11_226 = aClass11_661;
	    aClass11_661.aClass11_233 = aClass11_661;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.<init>(" + ')');
	}
    }
    
    public void method699(byte arg0, Class11 arg1) {
	try {
	    anInt669++;
	    if (arg1.aClass11_226 != null)
		arg1.method107(0);
	    arg1.aClass11_226 = aClass11_661;
	    if (arg0 > -102)
		method700(93);
	    arg1.aClass11_233 = aClass11_661.aClass11_233;
	    arg1.aClass11_226.aClass11_233 = arg1;
	    arg1.aClass11_233.aClass11_226 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("od.N(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method700(int arg0) {
	try {
	    Class12.aClass37_243.method706(-90);
	    Class59.anIntArray1231
		= Class11_Sub10_Sub13_Sub1.method417(Class59.anIntArray1231);
	    if (arg0 == 25085)
		anInt665++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.C(" + arg0 + ')');
	}
    }
    
    public Class11 method701(int arg0) {
	try {
	    anInt676++;
	    Class11 class11 = aClass11_675;
	    if (class11 == aClass11_661) {
		aClass11_675 = null;
		return null;
	    }
	    if (arg0 != 0)
		method693(13, null, null);
	    aClass11_675 = class11.aClass11_233;
	    return class11;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "od.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_664 = Class64.method992("@or2@", 255);
	aClass35Array671 = new Class35[50];
	aClass31_673 = Class64.method992("Trade)4compete", 255);
	aBoolean670 = true;
	aClass31_659 = Class64.method992("Loading textures )2 ", 255);
	anInt667 = -1;
    }
}
