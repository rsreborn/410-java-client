/* Class11_Sub10_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub6 extends Class11_Sub10
{
    public static int anInt2128;
    public static int anInt2129;
    public static int anInt2130;
    public static int anInt2131;
    public static int anInt2132;
    public static int anInt2133;
    public static int anInt2134;
    public static Class55_Sub1 aClass55_Sub1_2135;
    public static int anInt2136;
    public static Class39 aClass39_2137;
    public static int anInt2138 = 0;
    public static int anInt2139;
    public Class18[] aClass18Array2140;
    public static int anInt2141;
    public static Class31 aClass31_2142;
    public static int anInt2143;
    public static int anInt2144;
    public static int anInt2145 = 0;
    public static Class31 aClass31_2146;
    
    public static void method342(byte arg0) {
	try {
	    anInt2134++;
	    Class34.aClass37_624.method706(-65);
	    Class15_Sub1.aClass11_Sub10_Sub13_Sub3_1746.method443(0, 0);
	    if (arg0 >= 25)
		Class23.anIntArray432 = Class11_Sub10_Sub13_Sub1
					    .method417(Class23.anIntArray432);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sb.A(" + arg0 + ')');
	}
    }
    
    public static void method343(Class33 arg0, int arg1) {
	try {
	    Class11_Sub4.aClass33_1503 = arg0;
	    if (arg1 >= -103)
		method347(126);
	    anInt2136++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "sb.G(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method344(byte arg0) {
	try {
	    if (arg0 <= 45)
		method347(86);
	    aClass55_Sub1_2135 = null;
	    aClass31_2146 = null;
	    aClass31_2142 = null;
	    aClass39_2137 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sb.B(" + arg0 + ')');
	}
    }
    
    public static int method345(int arg0, int arg1) {
	try {
	    return arg0 | arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "sb.H(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static boolean method346(boolean arg0, int arg1, Class45 arg2,
				    boolean arg3) {
	try {
	    anInt2130++;
	    if (arg0 != true)
		method344((byte) -91);
	    if (!Class10.method104(arg2, arg3, (byte) 117))
		return false;
	    if (arg1 > 0)
		Class11_Sub10_Sub15.aClass40_2404 = new Class40(arg1);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("sb.D(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public static void method347(int arg0) {
	try {
	    anInt2132++;
	    int i = -45 / ((arg0 - -47) / 50);
	    Class11_Sub10_Sub1.aBoolean1946 = true;
	    method342((byte) 35);
	    if (Class28.anInt512 != -1) {
		boolean bool = Class7.method81(0, -1, Class28.anInt512, 1, 0,
					       261, 0, 190, 2);
		if (!bool)
		    Class11_Sub10_Sub14.aBoolean2352 = true;
	    } else if (Class12.anIntArray237[NotActuallyBuffer.anInt483] != -1) {
		boolean bool
		    = Class7.method81(0, -1,
				      Class12.anIntArray237[NotActuallyBuffer.anInt483],
				      1, 0, 261, 0, 190, 2);
		if (!bool)
		    Class11_Sub10_Sub14.aBoolean2352 = true;
	    }
	    if (Class11_Sub4.aBoolean1491
		&& (Class1.anInt95 ^ 0xffffffff) == -2)
		Class11_Sub10_Sub10.method377(30307);
	    Class32.method662(44, Class11_Sub10_Sub11.aGraphics2261);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "sb.E(" + arg0 + ')');
	}
    }
    
    public static void method348(int arg0) {
	Class6.aClass40_159.method740(4);
	anInt2144++;
	if (arg0 <= 109)
	    aClass31_2146 = null;
    }
    
    public boolean method349(int arg0, int arg1) {
	try {
	    if (arg0 <= 108)
		aClass31_2146 = null;
	    anInt2131++;
	    return aClass18Array2140[arg1].aBoolean354;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "sb.I(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class31[] method350(byte arg0, Class31[] arg1) {
	try {
	    Class31[] class31s = new Class31[5];
	    if (arg0 != 112)
		return null;
	    anInt2129++;
	    for (int i = 0; i < 5; i++) {
		class31s[i]
		    = Class40.method744(0, (new Class31[]
					    { Class11_Sub11
						  .method493(i, (byte) -125),
					      Class1.aClass31_97 }));
		if (arg1 != null && arg1[i] != null)
		    class31s[i]
			= Class40.method744(0, new Class31[] { class31s[i],
							       arg1[i] });
	    }
	    return class31s;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("sb.C(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class11_Sub10_Sub6(Class55 arg0, Class55 arg1, int arg2,
			      boolean arg3) {
	try {
	    Class36 class36 = new Class36();
	    int i = arg0.method895(arg2, (byte) 120);
	    aClass18Array2140 = new Class18[i];
	    int[] is = arg0.method900((byte) -75, arg2);
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
		 i_0_++) {
		byte[] is_1_ = arg0.method887((byte) -118, is[i_0_], arg2);
		int i_2_ = (is_1_[0] & 0xff) << -1573722648 | 0xff & is_1_[1];
		Class11_Sub6 class11_sub6 = null;
		for (Class11_Sub6 class11_sub6_3_
			 = (Class11_Sub6) class36.method694((byte) -115);
		     class11_sub6_3_ != null;
		     class11_sub6_3_ = (Class11_Sub6) class36.method701(0)) {
		    if (class11_sub6_3_.anInt1582 == i_2_) {
			class11_sub6 = class11_sub6_3_;
			break;
		    }
		}
		if (class11_sub6 == null) {
		    byte[] is_4_;
		    if (!arg3)
			is_4_ = arg1.method879(i_2_, 0, -1);
		    else
			is_4_ = arg1.method879(0, i_2_, -1);
		    class11_sub6 = new Class11_Sub6(i_2_, is_4_);
		    class36.method691((byte) -98, class11_sub6);
		}
		aClass18Array2140[is[i_0_]] = new Class18(is_1_, class11_sub6);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("sb.<init>("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    static {
	aClass31_2142
	    = Class64.method992("Last password change:*6n@gre@Never changed",
				255);
	aClass31_2146 = null;
    }
}
