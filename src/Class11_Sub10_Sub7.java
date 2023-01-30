/* Class11_Sub10_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub7 extends Class11_Sub10
{
    public static Class31 aClass31_2147;
    public static boolean[] aBooleanArray2148 = new boolean[112];
    public int anInt2149;
    public static int anInt2150;
    public int[] anIntArray2151;
    public static int anInt2152;
    public boolean aBoolean2153 = false;
    public static int anInt2154;
    public static Class31 aClass31_2155;
    public static int anInt2156;
    public static int anInt2157;
    public static int anInt2158;
    public static int anInt2159;
    public static Class11_Sub10_Sub4_Sub2_Sub1[] aClass11_Sub10_Sub4_Sub2_Sub1Array2160;
    public static int anInt2161;
    public static int anInt2162;
    public int[] anIntArray2163 = { -1, -1, -1, -1, -1 };
    public static int anInt2164;
    public static int anInt2165;
    public static Class31 aClass31_2166;
    public int[] anIntArray2167;
    public static Class31 aClass31_2168;
    public int[] anIntArray2169;
    
    public Class11_Sub10_Sub4_Sub4 method351(byte arg0) {
	try {
	    anInt2150++;
	    if (anIntArray2167 == null)
		return null;
	    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
		= new Class11_Sub10_Sub4_Sub4[anIntArray2167.length];
	    for (int i = 0; anIntArray2167.length > i; i++)
		class11_sub10_sub4_sub4s[i]
		    = Class11_Sub10_Sub4_Sub4.method322(Class31.aClass55_1395,
							anIntArray2167[i], 0);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4;
	    if ((class11_sub10_sub4_sub4s.length ^ 0xffffffff) == -2)
		class11_sub10_sub4_sub4 = class11_sub10_sub4_sub4s[0];
	    else
		class11_sub10_sub4_sub4 = (new Class11_Sub10_Sub4_Sub4
					   (class11_sub10_sub4_sub4s,
					    class11_sub10_sub4_sub4s.length));
	    if (arg0 != 73)
		aClass31_2166 = null;
	    for (int i = 0; i < 6; i++) {
		if (anIntArray2151[i] == 0)
		    break;
		class11_sub10_sub4_sub4.method299(anIntArray2151[i],
						  anIntArray2169[i]);
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.I(" + arg0 + ')');
	}
    }
    
    public static void method352(int arg0) {
	try {
	    aClass31_2147 = null;
	    aClass31_2166 = null;
	    aClass31_2155 = null;
	    aBooleanArray2148 = null;
	    if (arg0 != 0)
		aClass11_Sub10_Sub4_Sub2_Sub1Array2160 = null;
	    aClass31_2168 = null;
	    aClass11_Sub10_Sub4_Sub2_Sub1Array2160 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.E(" + arg0 + ')');
	}
    }
    
    public static Class31 method353(int arg0, boolean arg1) {
	try {
	    anInt2159++;
	    if (arg1 != true)
		aClass31_2166 = null;
	    if ((arg0 ^ 0xffffffff) > -1000000000)
		return Class11_Sub11.method493(arg0, (byte) -125);
	    return Class3.aClass31_111;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "v.H(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public boolean method354(int arg0) {
	try {
	    anInt2165++;
	    if (anIntArray2167 == null)
		return true;
	    boolean bool = true;
	    int i = 0;
	    if (arg0 != -1000000000)
		return true;
	    for (/**/; anIntArray2167.length > i; i++) {
		if (!Class31.aClass55_1395.method883(50, 0, anIntArray2167[i]))
		    bool = false;
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.D(" + arg0 + ')');
	}
    }
    
    public static Class method355(int arg0, String arg1)
	throws ClassNotFoundException {
	try {
	    anInt2157++;
	    if (arg1.equals("B"))
		return Byte.TYPE;
	    if (arg1.equals("I"))
		return Integer.TYPE;
	    if (arg1.equals("S"))
		return Short.TYPE;
	    if (arg1.equals("J"))
		return Long.TYPE;
	    if (arg1.equals("Z"))
		return Boolean.TYPE;
	    if (arg1.equals("F"))
		return Float.TYPE;
	    if (arg0 != 29609)
		aClass31_2168 = null;
	    if (arg1.equals("D"))
		return Double.TYPE;
	    if (arg1.equals("C"))
		return Character.TYPE;
	    return Class.forName(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("v.J(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method356(int arg0) {
	try {
	    anInt2158++;
	    if (arg0 != -13559)
		method353(-94, true);
	    Class59.aClass36_1240 = new Class36();
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.C(" + arg0 + ')');
	}
    }
    
    public boolean method357(int arg0) {
	try {
	    anInt2152++;
	    boolean bool = true;
	    int i = 0;
	    if (arg0 < 85)
		method354(-51);
	    for (/**/; i < 5; i++) {
		if (anIntArray2163[i] != -1
		    && !Class31.aClass55_1395.method883(50, 0,
							anIntArray2163[i]))
		    bool = false;
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.F(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method358(int arg0) {
	try {
	    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
		= new Class11_Sub10_Sub4_Sub4[5];
	    int i = 0;
	    anInt2154++;
	    for (int i_0_ = 0; i_0_ < 5; i_0_++) {
		if (anIntArray2163[i_0_] != -1)
		    class11_sub10_sub4_sub4s[i++]
			= Class11_Sub10_Sub4_Sub4.method322((Class31
							     .aClass55_1395),
							    (anIntArray2163
							     [i_0_]),
							    0);
	    }
	    if (arg0 != -40)
		method352(-124);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s, i);
	    for (int i_1_ = 0; i_1_ < 6; i_1_++) {
		if ((anIntArray2151[i_1_] ^ 0xffffffff) == -1)
		    break;
		class11_sub10_sub4_sub4.method299(anIntArray2151[i_1_],
						  anIntArray2169[i_1_]);
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "v.B(" + arg0 + ')');
	}
    }
    
    public void method359(Buffer arg0, int arg1) {
	try {
	    if (arg1 == 18688) {
		anInt2162++;
		for (;;) {
		    int i = arg0.readUByte();
		    if ((i ^ 0xffffffff) == -1)
			break;
		    method360(arg0, i, -60);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("v.G(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public void method360(Buffer arg0, int arg1, int arg2) {
	anInt2156++;
	if ((arg1 ^ 0xffffffff) != -2) {
	    if (arg1 == 2) {
		int i = arg0.readUByte();
		anIntArray2167 = new int[i];
		for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++)
		    anIntArray2167[i_2_] = arg0.readUShortBE();
	    } else if (arg1 == 3)
		aBoolean2153 = true;
	    else if (arg1 < 40 || arg1 >= 50) {
		if ((arg1 ^ 0xffffffff) <= -51 && (arg1 ^ 0xffffffff) > -61)
		    anIntArray2169[arg1 - 50] = arg0.readUShortBE();
		else if ((arg1 ^ 0xffffffff) <= -61
			 && (arg1 ^ 0xffffffff) > -71)
		    anIntArray2163[-60 + arg1] = arg0.readUShortBE();
	    } else
		anIntArray2151[arg1 + -40]
		    = arg0.readUShortBE();
	} else
	    anInt2149 = arg0.readUByte();
	if (arg2 != -60)
	    method353(110, true);
    }
    
    public Class11_Sub10_Sub7() {
	anIntArray2151 = new int[6];
	anInt2149 = -1;
	anIntArray2169 = new int[6];
    }
    
    static {
	aClass31_2147
	    = Class64.method992("Invalid loginserver requested", 255);
	aClass11_Sub10_Sub4_Sub2_Sub1Array2160
	    = new Class11_Sub10_Sub4_Sub2_Sub1[2048];
	aClass31_2155 = Class64.method992("@gre@", 255);
	aClass31_2166 = Class64.method992("To ", 255);
	anInt2164 = 0;
	anInt2161 = 0;
	aClass31_2168 = Class64.method992("Connecting to update server", 255);
    }
}
