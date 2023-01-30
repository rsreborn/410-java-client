/* Class15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15_Sub2 extends Class15
{
    public static int anInt1755;
    public static int anInt1756;
    public boolean aBoolean1757;
    public static int anInt1758;
    public static int anInt1759;
    public static int anInt1760;
    public Class41 aClass41_1761;
    public static int anInt1762;
    public Class45 aClass45_1763;
    public static int anInt1764;
    public static int anInt1765;
    public int anInt1766;
    public static Class31 aClass31_1767;
    public static int[] anIntArray1768;
    public static Class31 aClass31_1769;
    public static int anInt1770;
    public static int[] anIntArray1771
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    public static Class31 aClass31_1772 = Class64.method992("Take @lre@", 255);
    public static int anInt1773;
    public static int anInt1774;
    public boolean aBoolean1775;
    public static Class31 aClass31_1776;
    public byte[] aByteArray1777;
    public static int anInt1778;
    
    public static Class31 method553(long arg0, byte arg1) {
	try {
	    anInt1770++;
	    if ((arg0 ^ 0xffffffffffffffffL) >= -1L
		|| (arg0 ^ 0xffffffffffffffffL) <= -6582952005840035282L)
		return null;
	    int i = -104 / ((58 - arg1) / 54);
	    if (arg0 % 37L == 0L)
		return null;
	    int i_0_ = 0;
	    long l = arg0;
	    while (l != 0L) {
		l /= 37L;
		i_0_++;
	    }
	    byte[] is = new byte[i_0_];
	    while (arg0 != 0L) {
		long l_1_ = arg0;
		arg0 /= 37L;
		is[--i_0_]
		    = Class34.aByteArray647[(int) (l_1_ + -(37L * arg0))];
	    }
	    Class31 class31 = new Class31();
	    class31.aByteArray1366 = is;
	    class31.anInt1403 = is.length;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "jc.F(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method536(int arg0) {
	anInt1765++;
	if (arg0 != 1)
	    method554(104);
    }
    
    public void method529(byte arg0, int arg1, int arg2) {
	try {
	    anInt1774++;
	    if (arg0 != -97)
		aBoolean1757 = true;
	    if (arg2 == 0)
		arg2 = 1;
	    int i = Class15.method533(arg2, (byte) 71) - arg1;
	    if (aClass41_1761 == null) {
		if (aBoolean1775) {
		    try {
			Class2.method49(arg0 + -18669,
					"midibox.volume=" + i + ";",
					aClass45_1763.anApplet836);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } else
		anInt1766 = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jc.D(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static void method554(int arg0) {
	try {
	    anInt1778++;
	    Class47.method787(100);
	    Class11_Sub10_Sub6.method348(116);
	    Class22.method577((byte) -122);
	    Class43.method754((byte) -14);
	    Class33.method665(false);
	    Class11.method105((byte) 103);
	    Class44.method767((byte) -55);
	    RuntimeException_Sub1.method997(-30989);
	    Class37.method708((byte) 100);
	    if (arg0 != 33554431)
		aClass31_1769 = null;
	    Class15.method527((byte) 116);
	    Class20.method571((byte) -95);
	    Class9.method101(123);
	    ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
		.method79(true);
	    Class15.aClass55_Sub1_307.method876(arg0 ^ 0x1ffffff);
	    Class11_Sub10_Sub6.aClass55_Sub1_2135.method876(0);
	    Class8.aClass55_Sub1_166.method876(0);
	    Class11_Sub8.aClass55_Sub1_1623.method876(arg0 + -33554431);
	    Class13.aClass55_Sub1_270.method876(0);
	    Class47.aClass55_Sub1_876.method876(arg0 ^ 0x1ffffff);
	    Class11_Sub10_Sub12.aClass55_Sub1_2270.method876(0);
	    Class43.aClass55_Sub1_780.method876(0);
	    Class11_Sub8.aClass55_Sub1_1620.method876(arg0 + -33554431);
	    Class42.aClass55_Sub1_766.method876(0);
	    Class33.aClass55_Sub1_618.method876(arg0 + -33554431);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jc.E(" + arg0 + ')');
	}
    }
    
    public void method534(int arg0) {
	anInt1773++;
	if (arg0 != 128)
	    anInt1764 = 98;
    }
    
    public void method537(int arg0) {
	try {
	    anInt1760++;
	    if (aClass41_1761 != null
		&& arg0 != (aClass41_1761.anInt749 ^ 0xffffffff)) {
		if (aClass41_1761.anInt749 == 1) {
		    Class5 class5 = (Class5) aClass41_1761.anObject751;
		    try {
			class5.method67((byte) -117, 0, aByteArray1777.length,
					aByteArray1777);
			class5.method66(-1);
			try {
			    Class2.method49(arg0 + -18765,
					    ("midibox.loop="
					     + (!aBoolean1757 ? "0"
						: "\"infinite\"")
					     + "; midibox.src=\""
					     + class5.method70(110).getPath
						   ().replace('\\', '/')
					     + "\"; midibox.volume="
					     + anInt1766 + ";"),
					    aClass45_1763.anApplet836);
			    aBoolean1775 = true;
			} catch (Throwable throwable) {
			    /* empty */
			}
		    } catch (Exception exception) {
			try {
			    class5.method66(arg0);
			} catch (Exception exception_2_) {
			    /* empty */
			}
		    }
		}
		aClass41_1761 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jc.H(" + arg0 + ')');
	}
    }
    
    public static int method555(int arg0, int arg1, int arg2, byte arg3) {
	try {
	    if (arg3 < 121)
		method555(86, -21, 62, (byte) -109);
	    anInt1755++;
	    if ((Class25.aByteArrayArrayArray481[arg2][arg1][arg0] & 0x8) != 0)
		return 0;
	    if (arg2 > 0
		&& (0x2 & Class25.aByteArrayArrayArray481[1][arg1][arg0]
		    ^ 0xffffffff) != -1)
		return arg2 + -1;
	    return arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jc.B(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public void method526(byte arg0) {
	try {
	    anInt1762++;
	    if (aBoolean1775) {
		try {
		    Class2.method49(-18766, "midibox.src=\"c:/silence.mid\";",
				    aClass45_1763.anApplet836);
		} catch (Throwable throwable) {
		    /* empty */
		}
		aBoolean1775 = false;
	    }
	    int i = 102 / ((-2 - arg0) / 57);
	    aClass41_1761 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jc.G(" + arg0 + ')');
	}
    }
    
    public void method535(boolean arg0, byte arg1, byte[] arg2, int arg3) {
	try {
	    if (arg1 == 2) {
		anInt1759++;
		aClass41_1761 = aClass45_1763.method768(0);
		if (aClass41_1761 != null) {
		    if (arg3 == 0)
			arg3 = 1;
		    anInt1766 = Class15.method533(arg3, (byte) 55);
		    aBoolean1757 = arg0;
		    aByteArray1777 = arg2;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jc.A(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public static void method556(int arg0, int arg1, Class11_Sub10_Sub14 arg2,
				 int arg3, int arg4) {
	try {
	    if (arg3 > 45) {
		anInt1756++;
		if (Class11_Sub7.anInt1597 < 400) {
		    if (arg2.anIntArray2317 != null)
			arg2 = arg2.method467((byte) -118);
		    if (arg2 != null && arg2.aBoolean2340) {
			Class31 class31 = arg2.aClass31_2341;
			if ((arg2.anInt2319 ^ 0xffffffff) != -1)
			    class31
				= (Class40.method744
				   (0,
				    (new Class31[]
				     { class31,
				       (Class15_Sub1.method545
					((Class48
					  .aClass11_Sub10_Sub4_Sub2_Sub1_899
					  .anInt2793),
					 (byte) 9, arg2.anInt2319)),
				       Class11.aClass31_223,
				       Class11_Sub11.method493(arg2.anInt2319,
							       (byte) -126),
				       Class50.aClass31_986 })));
			if (Class39.anInt721 != 1) {
			    if ((Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff)
				!= -2) {
				Class31[] class31s = arg2.aClass31Array2321;
				Class11_Sub10_Sub4_Sub1.anInt2457++;
				if (Class13.aBoolean269)
				    class31s
					= Class11_Sub10_Sub6
					      .method350((byte) 112, class31s);
				if (class31s != null) {
				    for (int i = 4; i >= 0; i--) {
					if (class31s[i] != null
					    && !(class31s[i].method653
						 (Class60.aClass31_1258,
						  true))) {
					    int i_3_ = 0;
					    if ((i ^ 0xffffffff) == -1)
						i_3_ = 56;
					    Class55.anInt1089++;
					    if (i == 1)
						i_3_ = 17;
					    if ((i ^ 0xffffffff) == -3)
						i_3_ = 8;
					    if (i == 3)
						i_3_ = 22;
					    if (i == 4)
						i_3_ = 31;
					    Class7.method80
						((Class40.method744
						  (0, (new Class31[]
						       { class31s[i],
							 Class64.aClass31_1343,
							 class31 }))),
						 i_3_, arg4, arg1, false,
						 arg0);
					}
				    }
				}
				if (class31s != null) {
				    for (int i = 4; i >= 0; i--) {
					if (class31s[i] != null
					    && (class31s[i].method653
						(Class60.aClass31_1258,
						 true))) {
					    Class11_Sub10_Sub4_Sub6
						.anInt2711++;
					    int i_4_ = 0;
					    if ((Class48
						 .aClass11_Sub10_Sub4_Sub2_Sub1_899
						 .anInt2793)
						< arg2.anInt2319)
						i_4_ = 2000;
					    int i_5_ = 0;
					    if (i == 0)
						i_5_ = 56 + i_4_;
					    if (i == 1)
						i_5_ = i_4_ + 17;
					    if ((i ^ 0xffffffff) == -3)
						i_5_ = 8 - -i_4_;
					    if (i == 3)
						i_5_ = 22 + i_4_;
					    if ((i ^ 0xffffffff) == -5)
						i_5_ = i_4_ + 31;
					    Class7.method80
						((Class40.method744
						  (0, (new Class31[]
						       { class31s[i],
							 Class64.aClass31_1343,
							 class31 }))),
						 i_5_, arg4, arg1, false,
						 arg0);
					}
				    }
				}
				Class7.method80
				    (Class40.method744(0,
						       (new Class31[]
							{ (Class11_Sub10_Sub2
							   .aClass31_1990),
							  class31 })),
				     1006, arg4, arg1, false, arg0);
			    } else if ((Class11_Sub10_Sub4_Sub5.anInt2676
					& 0x2)
				       == 2) {
				Class58.anInt1215++;
				Class7.method80((Class40.method744
						 (0, (new Class31[]
						      { Class44.aClass31_799,
							Class64.aClass31_1343,
							class31 }))),
						44, arg4, arg1, false, arg0);
			    }
			} else {
			    Class7.method80
				(Class40.method744(0, (new Class31[]
						       { Class8.aClass31_168,
							 (Class11_Sub10_Sub6
							  .aClass31_2146),
							 Class37.aClass31_683,
							 class31 })),
				 7, arg4, arg1, false, arg0);
			    Class11_Sub12.anInt1700++;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jc.C(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method557(boolean arg0) {
	try {
	    aClass31_1767 = null;
	    aClass31_1776 = null;
	    aClass31_1772 = null;
	    if (arg0 != true)
		method555(-111, -57, 50, (byte) 105);
	    aClass31_1769 = null;
	    anIntArray1768 = null;
	    anIntArray1771 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jc.K(" + arg0 + ')');
	}
    }
    
    public Class15_Sub2(Class45 arg0) {
	try {
	    aClass45_1763 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "jc.<init>(" + (arg0 != null ? "{...}"
						    : "null") + ')');
	}
    }
    
    static {
	aClass31_1767 = Class64.method992("Hidden", 255);
	aClass31_1776 = aClass31_1767;
	anIntArray1768 = new int[25];
	aClass31_1769 = Class64.method992("(U2", 255);
    }
}
