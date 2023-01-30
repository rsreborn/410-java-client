/* Class55_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class55_Sub1 extends Class55
{
    public static int anInt1841;
    public int anInt1842;
    public static int anInt1843;
    public static int anInt1844;
    public static int anInt1845;
    public Class64 aClass64_1846;
    public static Class37 aClass37_1847;
    public static int anInt1848;
    public static int anInt1849;
    public boolean aBoolean1850 = false;
    public int anInt1851 = -1;
    public static int anInt1852;
    public static int anInt1853;
    public static int anInt1854;
    public static int anInt1855;
    public int anInt1856;
    public static int anInt1857;
    public static int anInt1858;
    public static Class31 aClass31_1859;
    public static int anInt1860;
    public static int anInt1861;
    public static int anInt1862;
    public static int anInt1863 = 1;
    public static int anInt1864;
    public static int anInt1865;
    public Class64 aClass64_1866;
    public static Class31 aClass31_1867;
    public static int anInt1868;
    public volatile boolean aBoolean1869 = false;
    public volatile boolean[] aBooleanArray1870;
    public static int[] anIntArray1871;
    
    public static void method902(int arg0, Graphics arg1) {
	try {
	    anInt1848++;
	    if (arg0 >= -86)
		anInt1853 = -16;
	    Class25.aClass37_473.method704(0, arg1, 17, 357);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.A(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class55_Sub1(Class64 arg0, Class64 arg1, int arg2, boolean arg3,
			boolean arg4, boolean arg5) {
	super(arg3, arg4);
	try {
	    aBoolean1850 = arg5;
	    anInt1842 = arg2;
	    aClass64_1866 = arg0;
	    aClass64_1846 = arg1;
	    Class23.method582(127, this, anInt1842);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.<init>("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ','
				     + arg5 + ')'));
	}
    }
    
    public static int method903(int arg0, int arg1, int arg2) {
	try {
	    anInt1844++;
	    int i = (-128
		     + (Class61.method958(4, arg2 + 45365, 91923 + arg1, true)
			- -(Class61.method958(2, arg2 - -10294, 37821 + arg1,
					      true) + -128
			    >> -31358943))
		     + (-128 + Class61.method958(1, arg2, arg1, true)
			>> 1461882690));
	    i = arg0 + (int) ((double) i * 0.3);
	    if ((i ^ 0xffffffff) > -11)
		i = 10;
	    else if ((i ^ 0xffffffff) < -61)
		i = 60;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public void method881(byte arg0, int arg1) {
	try {
	    if (aClass64_1866 != null && aBooleanArray1870 != null
		&& aBooleanArray1870[arg1])
		Class11_Sub10_Sub5.method334(this, aClass64_1866, true, arg1);
	    else
		Class11_Sub10_Sub4.method257(arg1, arg0 ^ 0x5e, this,
					     anIntArray1135[arg1], (byte) 2,
					     true, anInt1842);
	    if (arg0 != 2)
		anInt1851 = 10;
	    anInt1865++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ad.J(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class11_Sub10_Sub13_Sub3[] method904
	(Class55 arg0, Class31 arg1, byte arg2, Class31 arg3) {
	try {
	    if (arg2 != -58)
		aClass31_1859 = null;
	    int i = arg0.method899((byte) -18, arg1);
	    int i_0_ = arg0.method891(false, arg3, i);
	    anInt1855++;
	    return Class34.method681(i_0_, arg0, i, 93);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.M("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method905(Class11_Sub8 arg0, int arg1) {
	try {
	    if (arg1 != 1196625736)
		aClass37_1847 = null;
	    int i = 0;
	    anInt1843++;
	    if ((arg0.anInt1626 ^ 0xffffffff) == -1)
		i = Class52.aClass49_1024.method842(arg0.anInt1614,
						    arg0.anInt1615,
						    arg0.anInt1619);
	    if (arg0.anInt1626 == 1)
		i = Class52.aClass49_1024.method802(arg0.anInt1614,
						    arg0.anInt1615,
						    arg0.anInt1619);
	    int i_1_ = -1;
	    if (arg0.anInt1626 == 2)
		i = Class52.aClass49_1024.method812(arg0.anInt1614,
						    arg0.anInt1615,
						    arg0.anInt1619);
	    int i_2_ = 0;
	    if (arg0.anInt1626 == 3)
		i = Class52.aClass49_1024.method841(arg0.anInt1614,
						    arg0.anInt1615,
						    arg0.anInt1619);
	    int i_3_ = 0;
	    if (i != 0) {
		i_1_ = (0x1fffccc7 & i) >> -1089137586;
		int i_4_ = Class52.aClass49_1024.method832(arg0.anInt1614,
							   arg0.anInt1615,
							   arg0.anInt1619, i);
		i_3_ = (0xcb & i_4_) >> 376669926;
		i_2_ = 0x1f & i_4_;
	    }
	    arg0.anInt1618 = i_1_;
	    arg0.anInt1629 = i_3_;
	    arg0.anInt1636 = i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ad.I(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public void method875(int arg0, int arg1) {
	try {
	    if (arg1 != -28304)
		method875(-33, 56);
	    Class61.method964(anInt1842, 1171938384, arg0);
	    anInt1841++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ad.N(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public int method906(byte arg0) {
	try {
	    if (arg0 <= 19)
		method915((byte) 44);
	    anInt1864++;
	    int i = 0;
	    int i_5_ = 0;
	    for (int i_6_ = 0; i_6_ < aByteArrayArray1102.length; i_6_++) {
		if ((anIntArray1124[i_6_] ^ 0xffffffff) < -1) {
		    i += 100;
		    i_5_ += method907(i_6_, (byte) -11);
		}
	    }
	    if ((i ^ 0xffffffff) == -1)
		return 100;
	    int i_7_ = i_5_ * 100 / i;
	    return i_7_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ad.O(" + arg0 + ')');
	}
    }
    
    public int method907(int arg0, byte arg1) {
	try {
	    anInt1854++;
	    int i = -18 / ((49 - arg1) / 33);
	    if (aByteArrayArray1102[arg0] != null)
		return 100;
	    if (aBooleanArray1870[arg0])
		return 100;
	    return Class11_Sub6.method206(anInt1842, arg0, 1365004144);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ad.K(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public int method908(byte arg0) {
	try {
	    anInt1861++;
	    if (arg0 < 37)
		anInt1851 = -76;
	    if (aBoolean1869)
		return 100;
	    if (aByteArrayArray1102 != null)
		return 99;
	    int i = Class11_Sub6.method206(255, anInt1842, 1365004144);
	    if (i >= 100)
		i = 99;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ad.D(" + arg0 + ')');
	}
    }
    
    public void method909(byte arg0) {
	aBooleanArray1870 = new boolean[aByteArrayArray1102.length];
	for (int i = 0; aBooleanArray1870.length > i; i++)
	    aBooleanArray1870[i] = false;
	anInt1852++;
	if (aClass64_1866 == null)
	    aBoolean1869 = true;
	else {
	    anInt1851 = -1;
	    for (int i = 0; aBooleanArray1870.length > i; i++) {
		if ((anIntArray1124[i] ^ 0xffffffff) < -1) {
		    Canvas_Sub1.method41(i, (byte) 55, this, aClass64_1866);
		    anInt1851 = i;
		}
	    }
	    if (arg0 < 70)
		method875(-90, 47);
	    if (anInt1851 == -1)
		aBoolean1869 = true;
	}
    }
    
    public void method910(byte[] arg0, boolean arg1, boolean arg2, int arg3,
			  int arg4) {
	try {
	    anInt1860++;
	    if (!arg2) {
		arg0[-2 + arg0.length]
		    = (byte) (anIntArray1088[arg3] >> 1196625736);
		arg0[arg0.length - 1] = (byte) anIntArray1088[arg3];
		if (aClass64_1866 != null) {
		    Class44.method765(arg0, 20165, arg3, aClass64_1866);
		    aBooleanArray1870[arg3] = true;
		}
		if (arg1)
		    aByteArrayArray1102[arg3] = arg0;
	    } else {
		if (aBoolean1869)
		    throw new RuntimeException();
		if (aClass64_1846 != null)
		    Class44.method765(arg0, 20165, anInt1842, aClass64_1846);
		this.method885(arg0, 0);
		method909((byte) 94);
	    }
	    int i = -4 % ((57 - arg4) / 52);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ','
				     + arg4 + ')'));
	}
    }
    
    public void method911(boolean arg0, int arg1) {
	try {
	    anInt1858++;
	    anInt1856 = arg1;
	    if (arg0 != true)
		method903(7, -42, 37);
	    if (aClass64_1846 != null)
		Class11_Sub10_Sub5.method334(this, aClass64_1846, arg0,
					     anInt1842);
	    else
		Class11_Sub10_Sub4.method257(anInt1842, 102, this, anInt1856,
					     (byte) 0, true, 255);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ad.F(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static int method912(int arg0, int arg1, int arg2) {
	try {
	    anInt1849++;
	    int i = arg0 - -(arg1 * 57);
	    i ^= i << -1289074163;
	    int i_8_ = 0x7fffffff & arg2 + (789221 + i * (i * 15731)) * i;
	    return i_8_ >> -1218882861 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public static Class31 method913(Class11_Sub10_Sub5 arg0, Class31 arg1,
				    int arg2) {
	try {
	    if ((arg1.method654(Class22.aClass31_411, (byte) 95) ^ 0xffffffff)
		!= 0) {
		for (;;) {
		    int i = arg1.method654(Class33.aClass31_616, (byte) 95);
		    if (i == -1)
			break;
		    arg1
			= Class40.method744(0, (new Class31[]
						{ arg1.method634(i, -32, 0),
						  (Class11_Sub10_Sub7.method353
						   (Class61.method963(0, 22562,
								      arg0),
						    true)),
						  arg1.method639(28418,
								 i - -2) }));
		}
		for (;;) {
		    int i = arg1.method654(Class15_Sub2.aClass31_1769,
					   (byte) 95);
		    if (i == -1)
			break;
		    arg1
			= Class40.method744(0, (new Class31[]
						{ arg1.method634(i, -32, 0),
						  (Class11_Sub10_Sub7.method353
						   (Class61.method963(1, 22562,
								      arg0),
						    true)),
						  arg1.method639(28418,
								 i + 2) }));
		}
		for (;;) {
		    int i = arg1.method654(Applet_Sub1.aClass31_6, (byte) 95);
		    if ((i ^ 0xffffffff) == 0)
			break;
		    arg1 = Class40.method744(arg2 ^ 0x4,
					     (new Class31[]
					      { arg1.method634(i, arg2 + -36,
							       0),
						(Class11_Sub10_Sub7.method353
						 (Class61.method963(2, 22562,
								    arg0),
						  true)),
						arg1.method639(28418,
							       i - -2) }));
		}
		for (;;) {
		    int i = arg1.method654(Class54.aClass31_1086, (byte) 95);
		    if (i == -1)
			break;
		    arg1
			= Class40.method744(0, (new Class31[]
						{ arg1.method634(i, -32, 0),
						  (Class11_Sub10_Sub7.method353
						   (Class61.method963(3, 22562,
								      arg0),
						    true)),
						  arg1.method639(28418,
								 2 + i) }));
		}
		for (;;) {
		    int i = arg1.method654(Class11_Sub12.aClass31_1696,
					   (byte) 95);
		    if (i == -1)
			break;
		    arg1
			= Class40.method744(0, (new Class31[]
						{ arg1.method634(i, -32, 0),
						  (Class11_Sub10_Sub7.method353
						   (Class61.method963(4, 22562,
								      arg0),
						    true)),
						  arg1.method639(arg2 + 28414,
								 2 + i) }));
		}
	    }
	    if (arg2 != 4)
		return null;
	    anInt1845++;
	    return arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ad.P("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public void method914(Class64 arg0, int arg1, byte[] arg2, byte arg3,
			  boolean arg4) {
	do {
	    try {
		anInt1868++;
		if (arg0 != aClass64_1846) {
		    if (!arg4
			&& (anInt1851 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
			aBoolean1869 = true;
		    if (arg2 == null || (arg2.length ^ 0xffffffff) >= -3) {
			aBooleanArray1870[arg1] = false;
			if (aBoolean1850 || arg4)
			    Class11_Sub10_Sub4.method257(arg1, arg3 + 95, this,
							 anIntArray1135[arg1],
							 (byte) 2, arg4,
							 anInt1842);
			break;
		    }
		    Class42.aCRC32_760.reset();
		    Class42.aCRC32_760.update(arg2, 0, -2 + arg2.length);
		    int i = (int) Class42.aCRC32_760.getValue();
		    int i_9_
			= ((0xff & arg2[-1 + arg2.length])
			   + ((arg2[-2 + arg2.length] & 0xff) << 1394343944));
		    if (i != anIntArray1135[arg1]
			|| anIntArray1088[arg1] != i_9_) {
			aBooleanArray1870[arg1] = false;
			if (aBoolean1850 || arg4)
			    Class11_Sub10_Sub4.method257(arg1, 73, this,
							 anIntArray1135[arg1],
							 (byte) 2, arg4,
							 anInt1842);
			break;
		    }
		    aBooleanArray1870[arg1] = true;
		    if (arg4)
			aByteArrayArray1102[arg1] = arg2;
		} else {
		    if (aBoolean1869)
			throw new RuntimeException();
		    if (arg2 == null) {
			Class11_Sub10_Sub4.method257(anInt1842, 80, this,
						     anInt1856, (byte) 0, true,
						     255);
			break;
		    }
		    Class42.aCRC32_760.reset();
		    Class42.aCRC32_760.update(arg2, 0, arg2.length);
		    int i = (int) Class42.aCRC32_760.getValue();
		    if (anInt1856 != i) {
			Class11_Sub10_Sub4.method257(anInt1842, arg3 + 107,
						     this, anInt1856, (byte) 0,
						     true, 255);
			break;
		    }
		    this.method885(arg2, 0);
		    method909((byte) 76);
		}
		if (arg3 == 2)
		    break;
		aClass31_1867 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					("ad.G("
					 + (arg0 != null ? "{...}" : "null")
					 + ',' + arg1 + ','
					 + (arg2 != null ? "{...}" : "null")
					 + ',' + arg3 + ',' + arg4 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method915(byte arg0) {
	aClass37_1847 = null;
	anIntArray1871 = null;
	aClass31_1867 = null;
	aClass31_1859 = null;
	if (arg0 <= 71)
	    method903(-120, -15, 43);
    }
    
    static {
	anInt1853 = 0;
	aClass31_1859 = Class64.method992("backright2", 255);
	aClass31_1867 = Class64.method992(" @whi@", 255);
	anInt1862 = -1;
    }
}
