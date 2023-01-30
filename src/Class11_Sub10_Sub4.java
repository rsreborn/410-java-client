/* Class11_Sub10_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class11_Sub10_Sub4 extends Class11_Sub10
{
    public static int anInt2030;
    public static Class31 aClass31_2031 = Class64.method992(":duelreq:", 255);
    public static int anInt2032;
    public static int anInt2033;
    public static Class11_Sub10_Sub13_Sub2[] aClass11_Sub10_Sub13_Sub2Array2034;
    public static int anInt2035;
    public static int anInt2036;
    public static int anInt2037;
    public static Class11_Sub10_Sub13_Sub3[] aClass11_Sub10_Sub13_Sub3Array2038;
    public static int anInt2039;
    public static int anInt2040;
    public static Class31 aClass31_2041;
    public static int anInt2042;
    public static int anInt2043;
    public static int anInt2044;
    public static int anInt2045;
    public int anInt2046 = 1000;
    
    public static void method252(int arg0) {
	if (arg0 != -1)
	    aClass11_Sub10_Sub13_Sub2Array2034 = null;
	anInt2040++;
	if (Class32.aClass20_577 != null) {
	    synchronized (Class32.aClass20_577) {
		Class32.aClass20_577 = null;
	    }
	}
    }
    
    public static void method253(int arg0) {
	try {
	    if (arg0 != -16711936)
		method254(null, 42, 32, -105);
	    aClass11_Sub10_Sub13_Sub2Array2034 = null;
	    aClass31_2041 = null;
	    aClass31_2031 = null;
	    aClass11_Sub10_Sub13_Sub3Array2038 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jd.K(" + arg0 + ')');
	}
    }
    
    public static boolean method254(byte[] arg0, int arg1, int arg2,
				    int arg3) {
	try {
	    anInt2044++;
	    if (arg2 != 0)
		aClass31_2031 = null;
	    boolean bool = true;
	    int i = -1;
	    Buffer buffer = new Buffer(arg0);
	    for (;;) {
		int i_0_ = buffer.method158(true);
		if ((i_0_ ^ 0xffffffff) == -1)
		    break;
		int i_1_ = 0;
		i += i_0_;
		boolean bool_2_ = false;
		for (;;) {
		    if (!bool_2_) {
			int i_3_ = buffer.method158(true);
			if ((i_3_ ^ 0xffffffff) == -1)
			    break;
			i_1_ += i_3_ + -1;
			int i_4_ = i_1_ & 0x3f;
			int i_5_ = 0x3f & i_1_ >> 1109130502;
			int i_6_ = i_5_ + arg1;
			int i_7_ = buffer.method168(255) >> -106509182;
			int i_8_ = i_4_ - -arg3;
			if ((i_6_ ^ 0xffffffff) < -1 && i_8_ > 0
			    && (i_6_ ^ 0xffffffff) > -104 && i_8_ < 103) {
			    Class11_Sub10_Sub2 class11_sub10_sub2
				= Class51.method853((byte) -125, i);
			    if (i_7_ != 22 || !Class1.aBoolean94
				|| ((class11_sub10_sub2.anInt1998 ^ 0xffffffff)
				    != -1)
				|| class11_sub10_sub2.aBoolean1952) {
				if (!class11_sub10_sub2.method243((byte) 76)) {
				    Class29.anInt530++;
				    bool = false;
				}
				bool_2_ = true;
			    }
			}
		    } else {
			int i_9_ = buffer.method158(true);
			if (i_9_ == 0)
			    break;
			buffer.method168(255);
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jd.O("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    if (arg0 != 3)
		aClass31_2041 = null;
	    anInt2037++;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "jd.D(" + arg0 + ')');
	}
    }
    
    public static int method256(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt2035++;
	    if (arg2 <= 94)
		return -113;
	    int i = -arg1 + 256;
	    return (((arg1 * (0xff00ff & arg3) + (0xff00ff & arg0) * i
		      & ~0xff00ff)
		     - -(0xff0000
			 & (0xff00 & arg0) * i - -((0xff00 & arg3) * arg1)))
		    >> 562845896);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jd.N(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public static void method257(int arg0, int arg1, Class55_Sub1 arg2,
				 int arg3, byte arg4, boolean arg5, int arg6) {
	try {
	    long l = (long) ((arg6 << 677151056) + arg0);
	    anInt2042++;
	    Class11_Sub10_Sub16 class11_sub10_sub16
		= ((Class11_Sub10_Sub16)
		   Class52.aClass34_1020.method677(127, l));
	    if (class11_sub10_sub16 == null) {
		class11_sub10_sub16
		    = (Class11_Sub10_Sub16) Class37.aClass34_696.method677(127,
									   l);
		if (arg1 <= 62)
		    method257(-128, -106, null, -7, (byte) -110, false, -3);
		if (class11_sub10_sub16 == null) {
		    class11_sub10_sub16
			= ((Class11_Sub10_Sub16)
			   Class60.aClass34_1248.method677(123, l));
		    if (class11_sub10_sub16 != null) {
			if (arg5) {
			    class11_sub10_sub16.method227(107);
			    Class52.aClass34_1020
				.method682(121, class11_sub10_sub16, l);
			    Class12.anInt238++;
			    Class11_Sub10_Sub3.anInt2016--;
			}
		    } else {
			if (!arg5) {
			    class11_sub10_sub16
				= ((Class11_Sub10_Sub16)
				   Class13.aClass34_255.method677(120, l));
			    if (class11_sub10_sub16 != null)
				return;
			}
			class11_sub10_sub16 = new Class11_Sub10_Sub16();
			class11_sub10_sub16.aClass55_Sub1_2431 = arg2;
			class11_sub10_sub16.anInt2432 = arg3;
			class11_sub10_sub16.aByte2429 = arg4;
			if (arg5) {
			    Class52.aClass34_1020
				.method682(122, class11_sub10_sub16, l);
			    Class12.anInt238++;
			} else {
			    Class33.aClass32_607.method656(class11_sub10_sub16,
							   (byte) 98);
			    Class60.aClass34_1248
				.method682(121, class11_sub10_sub16, l);
			    Class11_Sub10_Sub3.anInt2016++;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("jd.J(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ',' + arg5 + ','
				     + arg6 + ')'));
	}
    }
    
    public void method258(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8) {
	anInt2033++;
	Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = method255((byte) 3);
	if (class11_sub10_sub4_sub4 != null) {
	    anInt2046 = class11_sub10_sub4_sub4.anInt2046;
	    class11_sub10_sub4_sub4.method258(arg0, arg1, arg2, arg3, arg4,
					      arg5, arg6, arg7, arg8);
	}
    }
    
    public static void method259(Class31 arg0, Class31 arg1, byte arg2) {
	do {
	    try {
		anInt2036++;
		Class11_Sub10_Sub4_Sub5.aClass31_2682 = arg0;
		Class11_Sub10_Sub4_Sub5.aClass31_2668 = arg1;
		if (arg2 > 52)
		    break;
		anInt2043 = 27;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					("jd.L("
					 + (arg0 != null ? "{...}" : "null")
					 + ','
					 + (arg1 != null ? "{...}" : "null")
					 + ',' + arg2 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	anInt2030 = 2301979;
	anInt2032 = 0;
	aClass31_2041 = Class64.method992("(X100(U(Y", 255);
    }
}
