/* Class11_Sub10_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class11_Sub10_Sub5 extends Class11_Sub10
{
    public int anInt2047;
    public int anInt2048;
    public static Class31 aClass31_2049 = Class64.method992("null", 255);
    public boolean aBoolean2050;
    public static int anInt2051;
    public static int anInt2052;
    public int anInt2053;
    public boolean aBoolean2054;
    public boolean aBoolean2055 = false;
    public int anInt2056;
    public int anInt2057;
    public static int anInt2058;
    public boolean aBoolean2059;
    public static int anInt2060;
    public int anInt2061;
    public int anInt2062;
    public static int[] anIntArray2063 = new int[16384];
    public static Class31 aClass31_2064;
    public int anInt2065;
    public int anInt2066 = 0;
    public Class31 aClass31_2067;
    public int[] anIntArray2068;
    public static int anInt2069;
    public int[][] anIntArrayArray2070;
    public int anInt2071;
    public static Class31 aClass31_2072
	= Class64.method992("Loaded sprites", 255);
    public int[] anIntArray2073;
    public int anInt2074;
    public int anInt2075;
    public int[] anIntArray2076;
    public Class31 aClass31_2077;
    public int anInt2078;
    public int anInt2079;
    public int anInt2080;
    public int anInt2081;
    public int anInt2082;
    public int anInt2083;
    public static int anInt2084;
    public int anInt2085;
    public Class31[] aClass31Array2086;
    public Class31 aClass31_2087;
    public int anInt2088;
    public static Class31[] aClass31Array2089;
    public int anInt2090;
    public static int anInt2091;
    public static int anInt2092;
    public boolean aBoolean2093;
    public Class31 aClass31_2094;
    public static int anInt2095;
    public int anInt2096;
    public int anInt2097;
    public int[] anIntArray2098;
    public static int anInt2099;
    public static Class31 aClass31_2100;
    public int anInt2101;
    public int anInt2102;
    public static int anInt2103;
    public int anInt2104;
    public int anInt2105;
    public int[] anIntArray2106;
    public boolean aBoolean2107;
    public static int anInt2108;
    public int anInt2109;
    public int[] anIntArray2110;
    public static Class31 aClass31_2111;
    public int[] anIntArray2112;
    public static int anInt2113;
    public Class31 aClass31_2114;
    public int anInt2115;
    public int anInt2116;
    public int anInt2117;
    public static int anInt2118;
    public int anInt2119;
    public int anInt2120;
    public static Class31 aClass31_2121;
    public boolean aBoolean2122;
    public boolean aBoolean2123;
    public int anInt2124;
    public int anInt2125;
    public int anInt2126;
    public static int anInt2127;
    
    public void method331(Buffer arg0, int arg1) {
	anInt2103++;
	anInt2119 = arg0.method168(255);
	anInt2061 = arg0.method168(255);
	anInt2116 = arg0.method164();
	anInt2056 = anInt2071 = arg0.method161((byte) -126);
	anInt2125 = anInt2081 = arg0.method161((byte) -125);
	anInt2105 = arg0.method164();
	anInt2115 = arg0.method164();
	anInt2104 = arg0.method168(255);
	anInt2117 = arg0.method164();
	if ((anInt2117 ^ 0xffffffff) == -65536)
	    anInt2117 = -1;
	anInt2090 = arg0.method164();
	if ((anInt2090 ^ 0xffffffff) == -65536)
	    anInt2090 = -1;
	int i = arg0.method168(255);
	if (i > 0) {
	    anIntArray2110 = new int[i];
	    anIntArray2112 = new int[i];
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_0_++) {
		anIntArray2110[i_0_] = arg0.method168(255);
		anIntArray2112[i_0_] = arg0.method164();
	    }
	}
	int i_1_ = arg0.method168(arg1 ^ 0x7c58);
	if ((i_1_ ^ 0xffffffff) < -1) {
	    anIntArrayArray2070 = new int[i_1_][];
	    for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = arg0.method164();
		anIntArrayArray2070[i_2_] = new int[i_3_];
		for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
		    anIntArrayArray2070[i_2_][i_4_]
			= arg0.method164();
		    if (anIntArrayArray2070[i_2_][i_4_] == 65535)
			anIntArrayArray2070[i_2_][i_4_] = -1;
		}
	    }
	}
	if (anInt2119 == 0) {
	    anInt2101 = arg0.method164();
	    aBoolean2054 = (arg0.method168(255) ^ 0xffffffff) == -2;
	}
	if (arg1 != 31911)
	    method338(-100);
	if (anInt2119 == 1) {
	    arg0.method164();
	    arg0.method168(255);
	}
	if ((anInt2119 ^ 0xffffffff) == -3) {
	    anIntArray2068 = new int[anInt2115 * anInt2105];
	    anIntArray2106 = new int[anInt2105 * anInt2115];
	    aBoolean2107 = (arg0.method168(255) ^ 0xffffffff) == -2;
	    aBoolean2093 = arg0.method168(255) == 1;
	    aBoolean2122 = (arg0.method168(arg1 + -31656) ^ 0xffffffff) == -2;
	    aBoolean2055 = (arg0.method168(255) ^ 0xffffffff) == -2;
	    anInt2053 = arg0.method168(255);
	    anInt2066 = arg0.method168(arg1 + -31656);
	    anIntArray2073 = new int[20];
	    anIntArray2076 = new int[20];
	    anIntArray2098 = new int[20];
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -21; i_5_++) {
		int i_6_ = arg0.method168(255);
		if ((i_6_ ^ 0xffffffff) == -2) {
		    anIntArray2073[i_5_] = arg0.method161((byte) -121);
		    anIntArray2098[i_5_] = arg0.method161((byte) -124);
		    anIntArray2076[i_5_] = arg0.method188((byte) 105);
		} else
		    anIntArray2076[i_5_] = -1;
	    }
	    aClass31Array2086 = new Class31[5];
	    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -6; i_7_++) {
		aClass31Array2086[i_7_] = arg0.method181((byte) 127);
		if ((aClass31Array2086[i_7_].method623(127) ^ 0xffffffff)
		    == -1)
		    aClass31Array2086[i_7_] = null;
	    }
	}
	if (anInt2119 == 3)
	    aBoolean2123 = (arg0.method168(255) ^ 0xffffffff) == -2;
	if ((anInt2119 ^ 0xffffffff) == -5 || anInt2119 == 1) {
	    aBoolean2050 = arg0.method168(255) == 1;
	    anInt2047 = arg0.method168(arg1 ^ 0x7c58);
	    aBoolean2059 = (arg0.method168(255) ^ 0xffffffff) == -2;
	}
	if ((anInt2119 ^ 0xffffffff) == -5) {
	    aClass31_2077 = arg0.method181((byte) 127);
	    aClass31_2094 = arg0.method181((byte) 127);
	}
	if (anInt2119 == 1 || anInt2119 == 3 || anInt2119 == 4)
	    anInt2075 = arg0.method188((byte) 105);
	if (anInt2119 == 3 || anInt2119 == 4) {
	    anInt2082 = arg0.method188((byte) 105);
	    anInt2124 = arg0.method188((byte) 105);
	    anInt2074 = arg0.method188((byte) 105);
	}
	if (anInt2119 == 5) {
	    anInt2078 = arg0.method188((byte) 105);
	    anInt2096 = arg0.method188((byte) 105);
	}
	if (anInt2119 == 6) {
	    anInt2109 = 1;
	    anInt2102 = arg0.method164();
	    anInt2083 = 1;
	    if ((anInt2102 ^ 0xffffffff) == -65536)
		anInt2102 = -1;
	    anInt2062 = arg0.method164();
	    if (anInt2062 == 65535)
		anInt2062 = -1;
	    anInt2057 = arg0.method164();
	    if ((anInt2057 ^ 0xffffffff) == -65536)
		anInt2057 = -1;
	    anInt2085 = arg0.method164();
	    if ((anInt2085 ^ 0xffffffff) == -65536)
		anInt2085 = -1;
	    anInt2079 = arg0.method164();
	    anInt2065 = arg0.method164();
	    anInt2120 = arg0.method164();
	}
	if ((anInt2119 ^ 0xffffffff) == -8) {
	    anIntArray2068 = new int[anInt2115 * anInt2105];
	    anIntArray2106 = new int[anInt2105 * anInt2115];
	    aBoolean2050 = arg0.method168(255) == 1;
	    anInt2047 = arg0.method168(255);
	    aBoolean2059 = arg0.method168(arg1 ^ 0x7c58) == 1;
	    anInt2075 = arg0.method188((byte) 105);
	    anInt2053 = arg0.method161((byte) -127);
	    anInt2066 = arg0.method161((byte) -121);
	    aBoolean2093 = (arg0.method168(255) ^ 0xffffffff) == -2;
	    aClass31Array2086 = new Class31[5];
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -6; i_8_++) {
		aClass31Array2086[i_8_] = arg0.method181((byte) 127);
		if (aClass31Array2086[i_8_].method623(119) == 0)
		    aClass31Array2086[i_8_] = null;
	    }
	}
	if ((anInt2119 ^ 0xffffffff) == -9)
	    aClass31_2077 = arg0.method181((byte) 127);
	if ((anInt2061 ^ 0xffffffff) == -3 || (anInt2119 ^ 0xffffffff) == -3) {
	    aClass31_2114 = arg0.method181((byte) 127);
	    aClass31_2067 = arg0.method181((byte) 127);
	    anInt2097 = arg0.method164();
	}
	if ((anInt2061 ^ 0xffffffff) == -2 || (anInt2061 ^ 0xffffffff) == -5
	    || anInt2061 == 5 || (anInt2061 ^ 0xffffffff) == -7) {
	    aClass31_2087 = arg0.method181((byte) 127);
	    if ((aClass31_2087.method623(124) ^ 0xffffffff) == -1) {
		if ((anInt2061 ^ 0xffffffff) == -2)
		    aClass31_2087 = Class37_Sub1.aClass31_1783;
		if (anInt2061 == 4)
		    aClass31_2087 = Class48.aClass31_907;
		if (anInt2061 == 5)
		    aClass31_2087 = Class48.aClass31_907;
		if ((anInt2061 ^ 0xffffffff) == -7)
		    aClass31_2087 = Class29.aClass31_534;
	    }
	}
    }
    
    public void method332(int arg0, boolean arg1, int arg2) {
	try {
	    if (arg1 != true)
		method333((byte) -92);
	    int i = anIntArray2106[arg2];
	    anIntArray2106[arg2] = anIntArray2106[arg0];
	    anInt2058++;
	    anIntArray2106[arg0] = i;
	    i = anIntArray2068[arg2];
	    anIntArray2068[arg2] = anIntArray2068[arg0];
	    anIntArray2068[arg0] = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("mc.K(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method333(byte arg0) {
	try {
	    if (arg0 != 35)
		aClass31_2049 = null;
	    Class32.method663(false, 0, 0, null);
	    anInt2127++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "mc.A(" + arg0 + ')');
	}
    }
    
    public static void method334(Class55_Sub1 arg0, Class64 arg1, boolean arg2,
				 int arg3) {
	try {
	    anInt2108++;
	    byte[] is = null;
	    synchronized (Class39_Sub1.aClass36_1822) {
		for (Class11_Sub11 class11_sub11
			 = ((Class11_Sub11)
			    Class39_Sub1.aClass36_1822.method694((byte) -113));
		     class11_sub11 != null;
		     class11_sub11 = (Class11_Sub11) Class39_Sub1
							 .aClass36_1822
							 .method701(0)) {
		    if ((((long) arg3 ^ 0xffffffffffffffffL)
			 == (class11_sub11.aLong231 ^ 0xffffffffffffffffL))
			&& arg1 == class11_sub11.aClass64_1689
			&& (class11_sub11.anInt1686 ^ 0xffffffff) == -1) {
			is = class11_sub11.aByteArray1682;
			break;
		    }
		}
	    }
	    if (is != null)
		arg0.method914(arg1, arg3, is, (byte) 2, true);
	    else {
		if (arg2 != true)
		    aClass31_2064 = null;
		byte[] is_9_ = arg1.method996(arg3, 87);
		arg0.method914(arg1, arg3, is_9_, (byte) 2, true);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("mc.J("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method335
	(int arg0, Class11_Sub10_Sub12 arg1, boolean arg2, Class24 arg3,
	 int arg4) {
	try {
	    if (arg0 < 103)
		anInt2105 = -29;
	    anInt2099++;
	    Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = false;
	    int i;
	    int i_10_;
	    if (arg2) {
		i = anInt2083;
		i_10_ = anInt2062;
	    } else {
		i = anInt2109;
		i_10_ = anInt2102;
	    }
	    if (i == 0)
		return null;
	    if (i == 1 && i_10_ == -1)
		return null;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class50.aClass40_1002.method735((long) ((i << -1144251088)
							   + i_10_),
						   (byte) -122));
	    if (class11_sub10_sub4_sub4 == null) {
		if (i == 1) {
		    class11_sub10_sub4_sub4
			= Class11_Sub10_Sub4_Sub4
			      .method322(Class43.aClass55_790, i_10_, 0);
		    if (class11_sub10_sub4_sub4 == null) {
			Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
			return null;
		    }
		    class11_sub10_sub4_sub4.method319();
		    class11_sub10_sub4_sub4.method312(64, 768, -50, -10, -50,
						      true);
		}
		if (i == 2) {
		    class11_sub10_sub4_sub4
			= Class13.method512(106, i_10_).method471(-2);
		    if (class11_sub10_sub4_sub4 == null) {
			Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
			return null;
		    }
		    class11_sub10_sub4_sub4.method319();
		    class11_sub10_sub4_sub4.method312(64, 768, -50, -10, -50,
						      true);
		}
		if ((i ^ 0xffffffff) == -4) {
		    if (arg3 == null)
			return null;
		    class11_sub10_sub4_sub4 = arg3.method585(-1);
		    if (class11_sub10_sub4_sub4 == null) {
			Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
			return null;
		    }
		    class11_sub10_sub4_sub4.method319();
		    class11_sub10_sub4_sub4.method312(64, 768, -50, -10, -50,
						      true);
		}
		if (i == 4) {
		    Class11_Sub10_Sub15 class11_sub10_sub15
			= Class60.method950(-35, i_10_);
		    class11_sub10_sub4_sub4
			= class11_sub10_sub15.method476(-10, 10, false);
		    if (class11_sub10_sub4_sub4 == null) {
			Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
			return null;
		    }
		    class11_sub10_sub4_sub4.method319();
		    class11_sub10_sub4_sub4.method312
			(class11_sub10_sub15.anInt2393 + 64,
			 768 - -class11_sub10_sub15.anInt2391, -50, -10, -50,
			 true);
		}
		Class50.aClass40_1002.method742(-120,
						(long) ((i << -42769136)
							- -i_10_),
						class11_sub10_sub4_sub4);
	    }
	    if (arg1 != null)
		class11_sub10_sub4_sub4
		    = arg1.method384(arg4, 65535, class11_sub10_sub4_sub4);
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("mc.I(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ','
				     + (arg3 != null ? "{...}" : "null") + ','
				     + arg4 + ')'));
	}
    }
    
    public static void method336(int arg0) {
	aClass31_2064 = null;
	aClass31Array2089 = null;
	anIntArray2063 = null;
	aClass31_2100 = null;
	aClass31_2049 = null;
	aClass31_2111 = null;
	aClass31_2121 = null;
	aClass31_2072 = null;
	if (arg0 != 3)
	    aClass31_2121 = null;
    }
    
    public static String method337(Throwable arg0, byte arg1)
	throws IOException {
	try {
	    String string;
	    if (arg0 instanceof RuntimeException_Sub1) {
		RuntimeException_Sub1 runtimeexception_sub1
		    = (RuntimeException_Sub1) arg0;
		arg0 = runtimeexception_sub1.aThrowable1350;
		string = runtimeexception_sub1.aString1353 + " | ";
	    } else
		string = "";
	    StringWriter stringwriter = new StringWriter();
	    PrintWriter printwriter = new PrintWriter(stringwriter);
	    anInt2092++;
	    arg0.printStackTrace(printwriter);
	    if (arg1 >= -50)
		return null;
	    printwriter.close();
	    String string_11_ = stringwriter.toString();
	    BufferedReader bufferedreader
		= new BufferedReader(new StringReader(string_11_));
	    String string_12_ = bufferedreader.readLine();
	    for (;;) {
		String string_13_ = bufferedreader.readLine();
		if (string_13_ == null)
		    break;
		int i = string_13_.indexOf('(');
		int i_14_ = string_13_.indexOf(')', i + 1);
		if ((i ^ 0xffffffff) <= -1 && (i_14_ ^ 0xffffffff) <= -1) {
		    String string_15_ = string_13_.substring(1 + i, i_14_);
		    int i_16_ = string_15_.indexOf(".java:");
		    if (i_16_ >= 0) {
			string_15_ = (string_15_.substring(0, i_16_)
				      + string_15_.substring(i_16_ - -5));
			string += string_15_ + ' ';
			continue;
		    }
		    string_13_ = string_13_.substring(0, i);
		}
		string_13_ = string_13_.trim();
		string_13_
		    = string_13_.substring(1 + string_13_.lastIndexOf(' '));
		string_13_
		    = string_13_.substring(1 + string_13_.lastIndexOf('\t'));
		string += string_13_ + ' ';
	    }
	    string += "| " + (String) string_12_;
	    return string;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method338(int arg0) {
	anInt2091++;
	if (Class48.anInt896 == 0) {
	    if (arg0 != -24)
		anIntArray2063 = null;
	    int i = Class11_Sub10_Sub4_Sub5.anInt2681;
	    if (Class11_Sub10_Sub11.anInt2269 == 1 && Class61.anInt1266 >= 516
		&& Class50.anInt995 >= 160
		&& (Class61.anInt1266 ^ 0xffffffff) >= -766
		&& (Class50.anInt995 ^ 0xffffffff) >= -206)
		i = 0;
	    if (!Class11_Sub4.aBoolean1491) {
		if ((i ^ 0xffffffff) == -2
		    && (Class11_Sub7.anInt1597 ^ 0xffffffff) < -1) {
		    int i_17_ = (Class11_Sub10_Sub4_Sub2_Sub1.anIntArray2794
				 [Class11_Sub7.anInt1597 - 1]);
		    if ((i_17_ ^ 0xffffffff) == -53 || i_17_ == 55
			|| (i_17_ ^ 0xffffffff) == -48 || i_17_ == 39
			|| (i_17_ ^ 0xffffffff) == -27 || i_17_ == 4
			|| i_17_ == 27 || (i_17_ ^ 0xffffffff) == -47
			|| i_17_ == 53 || (i_17_ ^ 0xffffffff) == -24
			|| (i_17_ ^ 0xffffffff) == -2 || i_17_ == 1002) {
			int i_18_ = (Class11_Sub8.anIntArray1627
				     [-1 + Class11_Sub7.anInt1597]);
			int i_19_ = (Class13.anIntArray267
				     [Class11_Sub7.anInt1597 - 1]);
			Class11_Sub10_Sub5 class11_sub10_sub5
			    = Class42.method750(i_19_, 694);
			if (class11_sub10_sub5.aBoolean2107
			    || class11_sub10_sub5.aBoolean2055) {
			    Class64.anInt1347 = Class61.anInt1266;
			    Class1.anInt91 = 0;
			    Class48.anInt896 = 2;
			    if ((Buffer.anInt1564 ^ 0xffffffff)
				== (i_19_ >> -1081554576 ^ 0xffffffff))
				Class48.anInt896 = 1;
			    if ((Class47.anInt881 ^ 0xffffffff)
				== (i_19_ >> -374271280 ^ 0xffffffff))
				Class48.anInt896 = 3;
			    anInt2052 = Class50.anInt995;
			    Class11_Sub10_Sub4_Sub6.anInt2720 = i_18_;
			    Class40.anInt722 = i_19_;
			    Class31.aBoolean1377 = false;
			    return;
			}
		    }
		}
		if ((i ^ 0xffffffff) == -2
		    && (Class62.anInt1305 == 1
			|| Class11_Sub8.method218(Class11_Sub7.anInt1597 + -1,
						  (byte) -7))
		    && Class11_Sub7.anInt1597 > 2)
		    i = 2;
		if ((i ^ 0xffffffff) == -2
		    && (Class11_Sub7.anInt1597 ^ 0xffffffff) < -1)
		    Class11_Sub10_Sub4_Sub2_Sub2
			.method281((byte) 101, Class11_Sub7.anInt1597 - 1);
		if (i == 2 && (Class11_Sub7.anInt1597 ^ 0xffffffff) < -1)
		    Class9.method102(false);
	    } else {
		if (i != 1) {
		    int i_20_ = Class11_Sub6.anInt1590;
		    int i_21_ = Class11_Sub10_Sub7.anInt2161;
		    if ((Class1.anInt95 ^ 0xffffffff) == -1) {
			i_20_ -= 4;
			i_21_ -= 4;
		    }
		    if ((Class1.anInt95 ^ 0xffffffff) == -2) {
			i_21_ -= 205;
			i_20_ -= 553;
		    }
		    if ((Class1.anInt95 ^ 0xffffffff) == -3) {
			i_20_ -= 17;
			i_21_ -= 357;
		    }
		    if ((i_20_ ^ 0xffffffff) > (-10 + Class15_Sub2.anInt1758
						^ 0xffffffff)
			|| i_20_ > (Class15_Sub2.anInt1758
				    - (-Class15_Sub1.anInt1736 + -10))
			|| ((Class61.anInt1262 + -10 ^ 0xffffffff)
			    < (i_21_ ^ 0xffffffff))
			|| ((i_21_ ^ 0xffffffff)
			    < (Class61.anInt1262 + (Class55.anInt1142 + 10)
			       ^ 0xffffffff))) {
			if (Class1.anInt95 == 1)
			    Class11_Sub10_Sub14.aBoolean2352 = true;
			Class11_Sub4.aBoolean1491 = false;
			if ((Class1.anInt95 ^ 0xffffffff) == -3)
			    Class32.aBoolean575 = true;
		    }
		}
		if ((i ^ 0xffffffff) == -2) {
		    int i_22_ = Class15_Sub2.anInt1758;
		    int i_23_ = Class61.anInt1262;
		    int i_24_ = Class15_Sub1.anInt1736;
		    int i_25_ = Class50.anInt995;
		    int i_26_ = Class61.anInt1266;
		    if ((Class1.anInt95 ^ 0xffffffff) == -1) {
			i_25_ -= 4;
			i_26_ -= 4;
		    }
		    int i_27_ = -1;
		    if ((Class1.anInt95 ^ 0xffffffff) == -2) {
			i_26_ -= 553;
			i_25_ -= 205;
		    }
		    if ((Class1.anInt95 ^ 0xffffffff) == -3) {
			i_25_ -= 357;
			i_26_ -= 17;
		    }
		    for (int i_28_ = 0; Class11_Sub7.anInt1597 > i_28_;
			 i_28_++) {
			int i_29_
			    = 31 + (i_23_
				    + ((-i_28_ + (-1 + Class11_Sub7.anInt1597))
				       * 15));
			if ((i_26_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)
			    && (i_24_ + i_22_ ^ 0xffffffff) < (i_26_
							       ^ 0xffffffff)
			    && (i_25_ ^ 0xffffffff) < (-13 + i_29_
						       ^ 0xffffffff)
			    && (i_25_ ^ 0xffffffff) > (i_29_ - -3
						       ^ 0xffffffff))
			    i_27_ = i_28_;
		    }
		    if (i_27_ != -1)
			Class11_Sub10_Sub4_Sub2_Sub2.method281((byte) 85,
							       i_27_);
		    if ((Class1.anInt95 ^ 0xffffffff) == -3)
			Class32.aBoolean575 = true;
		    Class11_Sub4.aBoolean1491 = false;
		    if ((Class1.anInt95 ^ 0xffffffff) == -2)
			Class11_Sub10_Sub14.aBoolean2352 = true;
		}
	    }
	}
    }
    
    public Class11_Sub10_Sub13_Sub4 method339(boolean arg0, int arg1) {
	try {
	    anInt2095++;
	    int i;
	    if (arg0)
		i = anInt2096;
	    else
		i = anInt2078;
	    Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = false;
	    if (i == arg1)
		return null;
	    Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4
		= ((Class11_Sub10_Sub13_Sub4)
		   Class11_Sub10_Sub14.aClass40_2326.method735((long) i,
							       (byte) -103));
	    if (class11_sub10_sub13_sub4 != null)
		return class11_sub10_sub13_sub4;
	    class11_sub10_sub13_sub4
		= Class14.method522((byte) -128, Class22.aClass55_409, i, 0);
	    if (class11_sub10_sub13_sub4 != null)
		Class11_Sub10_Sub14.aClass40_2326
		    .method742(-128, (long) i, class11_sub10_sub13_sub4);
	    else
		Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
	    return class11_sub10_sub13_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "mc.H(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method340(long arg0, int arg1) {
	try {
	    anInt2069++;
	    if (arg0 != 0L) {
		if ((Buffer.anInt1573 ^ 0xffffffff) <= -101
		    && (Class11_Sub10_Sub15.anInt2371 ^ 0xffffffff) != -2)
		    Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461,
						      (Class11_Sub5_Sub1
						       .aClass31_1910),
						      true);
		else if (Buffer.anInt1573 >= 200)
		    Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461,
						      (Class11_Sub5_Sub1
						       .aClass31_1910),
						      true);
		else {
		    Class31 class31 = Class15_Sub2.method553
					  (arg0, (byte) 122).method621(true);
		    for (int i = 0; Buffer.anInt1573 > i; i++) {
			if (arg0 == Class7.aLongArray1423[i]) {
			    Class11_Sub10_Sub4_Sub3.method288
				(0, Class25.aClass31_461,
				 Class40.method744(0, (new Class31[]
						       { class31,
							 (Class54
							  .aClass31_1070) })),
				 true);
			    return;
			}
		    }
		    for (int i = 0; i < Class55.anInt1143; i++) {
			if ((Class46.aLongArray845[i] ^ 0xffffffffffffffffL)
			    == (arg0 ^ 0xffffffffffffffffL)) {
			    Class11_Sub10_Sub4_Sub3.method288
				(0, Class25.aClass31_461,
				 Class40.method744(0,
						   (new Class31[]
						    { Canvas_Sub1.aClass31_65,
						      class31,
						      Class7.aClass31_1432 })),
				 true);
			    return;
			}
		    }
		    if (!class31.method638(-10,
					   (Class48
					    .aClass11_Sub10_Sub4_Sub2_Sub1_899
					    .aClass31_2800))) {
			Class33.anInt611++;
			Canvas_Sub1.aClass31Array63[Buffer.anInt1573]
			    = class31;
			Class7.aLongArray1423[Buffer.anInt1573] = arg0;
			NotActuallyBuffer.anIntArray484[Buffer.anInt1573] = 0;
			Class11_Sub10_Sub14.aBoolean2352 = true;
			if (arg1 > -77)
			    method340(-46L, 6);
			Buffer.anInt1573++;
			Class40.outBuffer.method196(1, 98);
			Class40.outBuffer.method140(-24628, arg0);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "mc.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class11_Sub10_Sub13_Sub4 method341(int arg0, boolean arg1) {
	try {
	    anInt2051++;
	    Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = arg1;
	    if ((arg0 ^ 0xffffffff) > -1
		|| (arg0 ^ 0xffffffff) <= (anIntArray2076.length ^ 0xffffffff))
		return null;
	    int i = anIntArray2076[arg0];
	    if (i == -1)
		return null;
	    Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4
		= ((Class11_Sub10_Sub13_Sub4)
		   Class11_Sub10_Sub14.aClass40_2326.method735((long) i,
							       (byte) -91));
	    if (class11_sub10_sub13_sub4 != null)
		return class11_sub10_sub13_sub4;
	    class11_sub10_sub13_sub4
		= Class14.method522((byte) -128, Class22.aClass55_409, i, 0);
	    if (class11_sub10_sub13_sub4 != null)
		Class11_Sub10_Sub14.aClass40_2326
		    .method742(-127, (long) i, class11_sub10_sub13_sub4);
	    else
		Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798 = true;
	    return class11_sub10_sub13_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "mc.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class11_Sub10_Sub5() {
	anInt2048 = 0;
	anInt2053 = 0;
	anInt2088 = 0;
    }
    
    static {
	anInt2052 = 0;
	aClass31Array2089 = new Class31[100];
	aClass31_2100 = Class64.method992("Loaded config", 255);
	aClass31_2121 = Class64.method992("wave:", 255);
	aClass31_2064 = Class64.method992("title)3jpg", 255);
	anInt2118 = 0;
	aClass31_2111 = Class64.method992("Loaded wordpack", 255);
    }
}
