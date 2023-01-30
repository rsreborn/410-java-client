/* Class11_Sub10_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class11_Sub10_Sub2 extends Class11_Sub10
{
    public boolean aBoolean1952 = false;
    public static int anInt1953;
    public static int anInt1954;
    public int anInt1955;
    public int[] anIntArray1956;
    public static Class31 aClass31_1957
	= Class64.method992("You have only just left another world", 255);
    public Class31 aClass31_1958 = Class11_Sub10_Sub4_Sub3.aClass31_2582;
    public static Class11_Sub10_Sub13_Sub2 aClass11_Sub10_Sub13_Sub2_1959;
    public boolean aBoolean1960;
    public static int anInt1961;
    public int anInt1962;
    public int anInt1963;
    public Class31 aClass31_1964;
    public int anInt1965;
    public static int anInt1966;
    public int anInt1967;
    public boolean aBoolean1968;
    public boolean aBoolean1969;
    public boolean aBoolean1970 = false;
    public static int anInt1971;
    public static int anInt1972 = 0;
    public int anInt1973;
    public int anInt1974;
    public static int anInt1975;
    public static Class31 aClass31_1976
	= Class64.method992(" unread messages", 255);
    public int anInt1977;
    public boolean aBoolean1978;
    public static Class31 aClass31_1979;
    public int[] anIntArray1980;
    public int anInt1981;
    public static Class31 aClass31_1982 = Class64.method992("backtop1", 255);
    public int anInt1983;
    public static int anInt1984;
    public static int anInt1985;
    public static int anInt1986;
    public int anInt1987;
    public static Class31 aClass31_1988 = Class64.method992("Nov", 255);
    public static Class31 aClass31_1989;
    public static Class31 aClass31_1990;
    public boolean aBoolean1991;
    public static int anInt1992;
    public int anInt1993;
    public int anInt1994;
    public int anInt1995;
    public int[] anIntArray1996;
    public static int anInt1997;
    public int anInt1998;
    public static int anInt1999;
    public int anInt2000;
    public int anInt2001;
    public int[] anIntArray2002;
    public int anInt2003;
    public int[] anIntArray2004;
    public static Buffer aBuffer_2005;
    public static Class31 aClass31_2006;
    public static int anInt2007;
    public Class31[] aClass31Array2008;
    public boolean aBoolean2009;
    public int anInt2010;
    public boolean aBoolean2011;
    public int anInt2012;
    
    public Class11_Sub10_Sub4_Sub4 method235(int arg0, int arg1, int arg2,
					     int arg3, int arg4, int arg5,
					     int arg6) {
	try {
	    anInt2007++;
	    long l;
	    if (anIntArray1996 == null)
		l = (long) ((anInt1963 << -24678838) - -arg0);
	    else
		l = (long) ((anInt1963 << 1963756426) - -(arg4 << -1165436669)
			    + arg0);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class11_Sub10_Sub16.aClass40_2425.method735(l, (byte) -86));
	    if (arg5 >= -37)
		method246(41, -126, null);
	    if (class11_sub10_sub4_sub4 == null) {
		class11_sub10_sub4_sub4
		    = method241(-21201, !aBoolean1970, arg4, false, arg0);
		if (class11_sub10_sub4_sub4 == null)
		    return null;
		Class11_Sub10_Sub16.aClass40_2425
		    .method742(-126, l, class11_sub10_sub4_sub4);
	    }
	    if (aBoolean2011 || aBoolean1970)
		class11_sub10_sub4_sub4
		    = new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4,
						  aBoolean2011, aBoolean1970);
	    if (aBoolean2011) {
		int i = (arg2 + arg1 + arg3 - -arg6) / 4;
		for (int i_0_ = 0;
		     ((i_0_ ^ 0xffffffff)
		      > (class11_sub10_sub4_sub4.anInt2618 ^ 0xffffffff));
		     i_0_++) {
		    int i_1_ = class11_sub10_sub4_sub4.anIntArray2620[i_0_];
		    int i_2_ = class11_sub10_sub4_sub4.anIntArray2597[i_0_];
		    int i_3_ = arg3 - -((arg1 - arg3) * (64 + i_2_) / 128);
		    int i_4_ = arg2 + (arg6 - arg2) * (i_2_ - -64) / 128;
		    int i_5_ = i_3_ + (-i_3_ + i_4_) * (i_1_ + 64) / 128;
		    class11_sub10_sub4_sub4.anIntArray2605[i_0_] += i_5_ + -i;
		}
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public Class11_Sub10_Sub2 method236(boolean arg0) {
	try {
	    if (arg0 != false)
		return null;
	    anInt1992++;
	    int i = -1;
	    if (anInt1962 == -1) {
		if (anInt1983 != -1)
		    i = Class29.anIntArray547[anInt1983];
	    } else
		i = Class61.method965(-23573, anInt1962);
	    if (i < 0 || i >= anIntArray1980.length || anIntArray1980[i] == -1)
		return null;
	    return Class51.method853((byte) -107, anIntArray1980[i]);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ia.I(" + arg0 + ')');
	}
    }
    
    public void method237(byte arg0, Buffer arg1) {
	try {
	    if (arg0 != -3)
		anInt2001 = -1;
	    anInt1985++;
	    for (;;) {
		int i = arg1.readUByte();
		if ((i ^ 0xffffffff) == -1)
		    break;
		method246(arg0 ^ 0x75db, i, arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method238(int arg0, Graphics arg1) {
	try {
	    anInt1984++;
	    if (arg0 != 0)
		method245(-55);
	    Class11_Sub10_Sub16.aClass37_2434.method704(arg0, arg1, 0, 4);
	    Class10.aClass37_203.method704(0, arg1, 0, 357);
	    Class40.aClass37_738.method704(0, arg1, 722, 4);
	    Class9.aClass37_191.method704(arg0, arg1, 743, 205);
	    Class37_Sub1.aClass37_1809.method704(arg0, arg1, 0, 0);
	    Class39_Sub1.aClass37_1837.method704(0, arg1, 516, 4);
	    Class1.aClass37_98.method704(0, arg1, 516, 205);
	    Class11_Sub10_Sub3.aClass37_2019.method704(arg0, arg1, 496, 357);
	    Class6.aClass37_156.method704(arg0, arg1, 0, 338);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.A(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public boolean method239(int arg0, int arg1) {
	try {
	    if (arg1 != 65535)
		return false;
	    anInt1986++;
	    if (anIntArray1996 == null) {
		if (anIntArray2004 == null)
		    return true;
		if (arg0 != 10)
		    return true;
		boolean bool = true;
		for (int i = 0; anIntArray2004.length > i; i++)
		    bool &= Class11_Sub10_Sub10.aClass55_2236
				.method883(50, 0, 0xffff & anIntArray2004[i]);
		return bool;
	    }
	    for (int i = 0; anIntArray1996.length > i; i++) {
		if ((arg0 ^ 0xffffffff) == (anIntArray1996[i] ^ 0xffffffff))
		    return Class11_Sub10_Sub10.aClass55_2236
			       .method883(50, 0, 0xffff & anIntArray2004[i]);
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ia.L(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static boolean method240(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg0 != -22936)
		return false;
	    anInt1975++;
	    int i = (arg2 & 0x1fffd904) >> -1085303410;
	    int i_6_ = Class52.aClass49_1024.method832(Class1.anInt82, arg3,
						       arg1, arg2);
	    if (i_6_ == -1)
		return false;
	    int i_7_ = i_6_ >> -1621218938 & 0x3;
	    int i_8_ = i_6_ & 0x1f;
	    if ((i_8_ ^ 0xffffffff) == -11 || i_8_ == 11 || i_8_ == 22) {
		Class11_Sub10_Sub2 class11_sub10_sub2
		    = Class51.method853((byte) -114, i);
		int i_9_;
		int i_10_;
		if (i_7_ != 0 && (i_7_ ^ 0xffffffff) != -3) {
		    i_10_ = class11_sub10_sub2.anInt1967;
		    i_9_ = class11_sub10_sub2.anInt1974;
		} else {
		    i_9_ = class11_sub10_sub2.anInt1967;
		    i_10_ = class11_sub10_sub2.anInt1974;
		}
		int i_11_ = class11_sub10_sub2.anInt2001;
		if ((i_7_ ^ 0xffffffff) != -1)
		    i_11_ = (0xf & i_11_ << i_7_) + (i_11_ >> -i_7_ + 4);
		Class44.method759(arg1, (byte) -40, 0,
				  (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				   .anIntArray2500[0]),
				  i_10_, i_11_, 2, true, 0,
				  (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				   .anIntArray2562[0]),
				  i_9_, arg3);
	    } else
		Class44.method759(arg1, (byte) 109, i_7_,
				  (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				   .anIntArray2500[0]),
				  0, 0, 2, true, i_8_ - -1,
				  (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				   .anIntArray2562[0]),
				  0, arg3);
	    NotActuallyBuffer.anInt490 = Class61.anInt1266;
	    Class17.anInt342 = 2;
	    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
	    Class57.anInt1174 = 0;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method241(int arg0, boolean arg1, int arg2,
					     boolean arg3, int arg4) {
	try {
	    if (arg0 != -21201)
		method244(false, 122);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = null;
	    anInt1953++;
	    if (anIntArray1996 != null) {
		int i = -1;
		for (int i_12_ = 0; i_12_ < anIntArray1996.length; i_12_++) {
		    if ((arg2 ^ 0xffffffff)
			== (anIntArray1996[i_12_] ^ 0xffffffff)) {
			i = i_12_;
			break;
		    }
		}
		if ((i ^ 0xffffffff) == 0)
		    return null;
		int i_13_ = anIntArray2004[i];
		boolean bool = (arg4 ^ 0xffffffff) < -4 ^ aBoolean1968;
		if (bool)
		    i_13_ += 65536;
		class11_sub10_sub4_sub4
		    = ((Class11_Sub10_Sub4_Sub4)
		       Class37_Sub1.aClass40_1781.method735((long) i_13_,
							    (byte) -92));
		if (class11_sub10_sub4_sub4 == null) {
		    class11_sub10_sub4_sub4
			= (Class11_Sub10_Sub4_Sub4.method322
			   (Class11_Sub10_Sub10.aClass55_2236, 0xffff & i_13_,
			    0));
		    if (class11_sub10_sub4_sub4 == null)
			return null;
		    if (bool)
			class11_sub10_sub4_sub4.method295();
		    Class37_Sub1.aClass40_1781.method742
			(arg0 + 21079, (long) i_13_, class11_sub10_sub4_sub4);
		}
	    } else {
		if (arg2 != 10)
		    return null;
		if (anIntArray2004 == null)
		    return null;
		boolean bool = arg4 > 3 ^ aBoolean1968;
		int i = anIntArray2004.length;
		for (int i_14_ = 0; i > i_14_; i_14_++) {
		    int i_15_ = anIntArray2004[i_14_];
		    if (bool)
			i_15_ += 65536;
		    class11_sub10_sub4_sub4
			= ((Class11_Sub10_Sub4_Sub4)
			   Class37_Sub1.aClass40_1781.method735((long) i_15_,
								(byte) -124));
		    if (class11_sub10_sub4_sub4 == null) {
			class11_sub10_sub4_sub4
			    = (Class11_Sub10_Sub4_Sub4.method322
			       (Class11_Sub10_Sub10.aClass55_2236,
				0xffff & i_15_, 0));
			if (class11_sub10_sub4_sub4 == null)
			    return null;
			if (bool)
			    class11_sub10_sub4_sub4.method295();
			Class37_Sub1.aClass40_1781.method742
			    (arg0 + 21077, (long) i_15_,
			     class11_sub10_sub4_sub4);
		    }
		    if (i > 1)
			Class54.aClass11_Sub10_Sub4_Sub4Array1069[i_14_]
			    = class11_sub10_sub4_sub4;
		}
		if ((i ^ 0xffffffff) < -2)
		    class11_sub10_sub4_sub4
			= (new Class11_Sub10_Sub4_Sub4
			   (Class54.aClass11_Sub10_Sub4_Sub4Array1069, i));
	    }
	    boolean bool;
	    if ((anInt1977 ^ 0xffffffff) == -129 && anInt2003 == 128
		&& (anInt1994 ^ 0xffffffff) == -129)
		bool = false;
	    else
		bool = true;
	    boolean bool_16_;
	    if (anInt1981 != 0 || (anInt2000 ^ 0xffffffff) != -1
		|| anInt2010 != 0)
		bool_16_ = true;
	    else
		bool_16_ = false;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_17_
		= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4,
					      ((arg4 ^ 0xffffffff) == -1
					       && !bool && !bool_16_),
					      anIntArray2002 == null, true);
	    arg4 &= 0x3;
	    if ((arg4 ^ 0xffffffff) == -2)
		class11_sub10_sub4_sub4_17_.method307();
	    else if (arg4 == 2)
		class11_sub10_sub4_sub4_17_.method308();
	    else if (arg4 == 3)
		class11_sub10_sub4_sub4_17_.method305();
	    if (anIntArray2002 != null) {
		for (int i = 0; anIntArray2002.length > i; i++)
		    class11_sub10_sub4_sub4_17_.method299(anIntArray2002[i],
							  anIntArray1956[i]);
	    }
	    if (bool)
		class11_sub10_sub4_sub4_17_.method315(anInt1977, anInt2003,
						      anInt1994);
	    if (bool_16_)
		class11_sub10_sub4_sub4_17_.method296(anInt1981, anInt2000,
						      anInt2010);
	    if (arg3)
		class11_sub10_sub4_sub4_17_.method319();
	    class11_sub10_sub4_sub4_17_.method312(64 - -anInt2012,
						  768 + 5 * anInt1995, -50,
						  -10, -50, arg1);
	    return class11_sub10_sub4_sub4_17_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.F(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public void method242(int arg0) {
	try {
	    if (arg0 == (anInt1998 ^ 0xffffffff)) {
		anInt1998 = 0;
		if (anIntArray2004 != null
		    && (anIntArray1996 == null || anIntArray1996[0] == 10))
		    anInt1998 = 1;
		for (int i = 0; i < 5; i++) {
		    if (aClass31Array2008[i] != null)
			anInt1998 = 1;
		}
	    }
	    if ((anInt1955 ^ 0xffffffff) == 0)
		anInt1955 = !aBoolean1960 ? 0 : 1;
	    anInt1997++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ia.K(" + arg0 + ')');
	}
    }
    
    public boolean method243(byte arg0) {
	try {
	    anInt1966++;
	    if (anIntArray2004 == null)
		return true;
	    if (arg0 <= 18)
		return false;
	    boolean bool = true;
	    for (int i = 0; i < anIntArray2004.length; i++)
		bool &= Class11_Sub10_Sub10.aClass55_2236
			    .method883(50, 0, 0xffff & anIntArray2004[i]);
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ia.D(" + arg0 + ')');
	}
    }
    
    public static void method244(boolean arg0, int arg1) {
	try {
	    anInt1971++;
	    if ((arg1 ^ 0xffffffff) != 0
		&& Class37_Sub1.aBooleanArray1808[arg1]) {
		Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2803.method886(arg1, 0);
		if (Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg1]
		    != null) {
		    boolean bool = true;
		    for (int i = 0;
			 ((Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61
			   [arg1]).length
			  > i);
			 i++) {
			if ((Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg1]
			     [i])
			    != null) {
			    if ((Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61
				 [arg1][i].anInt2119)
				== 2)
				bool = false;
			    else
				Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61
				    [arg1][i]
				    = null;
			}
		    }
		    if (bool)
			Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg1]
			    = null;
		    Class37_Sub1.aBooleanArray1808[arg1] = arg0;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ia.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method245(int arg0) {
	try {
	    aClass31_1988 = null;
	    aClass31_2006 = null;
	    aClass31_1976 = null;
	    aClass31_1990 = null;
	    aClass31_1989 = null;
	    aClass11_Sub10_Sub13_Sub2_1959 = null;
	    aClass31_1979 = null;
	    if (arg0 != 128)
		method240(-37, -39, 67, -97);
	    aBuffer_2005 = null;
	    aClass31_1982 = null;
	    aClass31_1957 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ia.M(" + arg0 + ')');
	}
    }
    
    public void method246(int arg0, int arg1, Buffer arg2) {
	try {
	    if (arg0 != -30170)
		aBoolean1969 = false;
	    anInt1954++;
	    if ((arg1 ^ 0xffffffff) == -2) {
		int i = arg2.readUByte();
		if ((i ^ 0xffffffff) < -1) {
		    if (anIntArray2004 == null
			|| Class11_Sub10_Sub15.aBoolean2366) {
			anIntArray2004 = new int[i];
			anIntArray1996 = new int[i];
			for (int i_18_ = 0; i > i_18_; i_18_++) {
			    anIntArray2004[i_18_] = arg2.readUShortBE();
			    anIntArray1996[i_18_] = arg2.readUByte();
			}
		    } else
			arg2.position += i * 3;
		}
	    } else if ((arg1 ^ 0xffffffff) != -3) {
		if ((arg1 ^ 0xffffffff) == -4)
		    aClass31_1964 = arg2.method181((byte) 127);
		else if ((arg1 ^ 0xffffffff) == -6) {
		    int i = arg2.readUByte();
		    if ((i ^ 0xffffffff) < -1) {
			if (anIntArray2004 == null
			    || Class11_Sub10_Sub15.aBoolean2366) {
			    anIntArray2004 = new int[i];
			    anIntArray1996 = null;
			    for (int i_19_ = 0; i_19_ < i; i_19_++)
				anIntArray2004[i_19_]
				    = arg2.readUShortBE();
			} else
			    arg2.position += 2 * i;
		    }
		} else if (arg1 != 14) {
		    if (arg1 != 15) {
			if ((arg1 ^ 0xffffffff) != -18) {
			    if (arg1 == 18)
				aBoolean1969 = false;
			    else if ((arg1 ^ 0xffffffff) == -20)
				anInt1998 = arg2.readUByte();
			    else if ((arg1 ^ 0xffffffff) != -22) {
				if (arg1 != 22) {
				    if (arg1 == 23)
					aBoolean1978 = true;
				    else if (arg1 != 24) {
					if ((arg1 ^ 0xffffffff) != -29) {
					    if (arg1 != 29) {
						if (arg1 != 39) {
						    if (arg1 >= 30
							&& arg1 < 35) {
							aClass31Array2008
							    [-30 + arg1]
							    = (arg2.method181
							       ((byte) 127));
							if (aClass31Array2008
								[arg1 - 30]
								.method653
							    ((Class15_Sub2
							      .aClass31_1776),
							     true))
							    aClass31Array2008
								[arg1 - 30]
								= null;
						    } else if ((arg1
								^ 0xffffffff)
							       == -41) {
							int i = (arg2.readUByte
								 ());
							anIntArray1956
							    = new int[i];
							anIntArray2002
							    = new int[i];
							for (int i_20_ = 0;
							     ((i ^ 0xffffffff)
							      < (i_20_
								 ^ 0xffffffff));
							     i_20_++) {
							    anIntArray2002
								[i_20_]
								= (arg2.readUShortBE
								   ());
							    anIntArray1956
								[i_20_]
								= (arg2.readUShortBE
								   ());
							}
						    } else if ((arg1
								^ 0xffffffff)
							       == -61)
							anInt1965
							    = (arg2.readUShortBE
							       ());
						    else if (arg1 == 62)
							aBoolean1968 = true;
						    else if ((arg1
							      ^ 0xffffffff)
							     != -65) {
							if (arg1 == 65)
							    anInt1977
								= (arg2.readUShortBE
								   ());
							else if (arg1 == 66)
							    anInt2003
								= (arg2.readUShortBE
								   ());
							else if ((arg1
								  ^ 0xffffffff)
								 == -68)
							    anInt1994
								= (arg2.readUShortBE
								   ());
							else if (arg1 == 68)
							    anInt1973
								= (arg2.readUShortBE
								   ());
							else if ((arg1
								  ^ 0xffffffff)
								 == -70)
							    anInt2001
								= (arg2.readUByte
								   ());
							else if ((arg1
								  ^ 0xffffffff)
								 != -71) {
							    if ((arg1
								 ^ 0xffffffff)
								!= -72) {
								if (arg1
								    != 72) {
								    if ((arg1
									 ^ 0xffffffff)
									== -74)
									aBoolean1952
									    = true;
								    else if ((arg1
									      ^ 0xffffffff)
									     != -75) {
									if ((arg1
									     ^ 0xffffffff)
									    != -76) {
									    if (arg1 == 77) {
										anInt1962 = arg2.readUShortBE();
										if (anInt1962 == 65535)
										    anInt1962 = -1;
										anInt1983 = arg2.readUShortBE();
										if ((anInt1983 ^ 0xffffffff) == -65536)
										    anInt1983 = -1;
										int i = arg2.readUByte();
										anIntArray1980 = new int[1 + i];
										for (int i_21_ = 0; i >= i_21_; i_21_++) {
										    anIntArray1980[i_21_] = arg2.readUShortBE();
										    if ((anIntArray1980[i_21_] ^ 0xffffffff) == -65536)
											anIntArray1980[i_21_] = -1;
										}
									    }
									} else
									    anInt1955 = arg2.readUByte();
								    } else
									aBoolean2009
									    = true;
								} else
								    anInt2010
									= (arg2.method161
									   ((byte) -122));
							    } else
								anInt2000
								    = (arg2.method161
								       ((byte) -122));
							} else
							    anInt1981
								= (arg2.method161
								   ((byte) -122));
						    } else
							aBoolean1991 = false;
						} else
						    anInt1995
							= 5 * (arg2.method156
							       (26669));
					    } else
						anInt2012
						    = arg2.method156(arg0
								     + 56839);
					} else
					    anInt1993 = arg2.readUByte();
				    } else {
					anInt1987 = arg2.readUShortBE();
					if ((anInt1987 ^ 0xffffffff) == -65536)
					    anInt1987 = -1;
				    }
				} else
				    aBoolean1970 = true;
			    } else
				aBoolean2011 = true;
			} else
			    aBoolean1960 = false;
		    } else
			anInt1974 = arg2.readUByte();
		} else
		    anInt1967 = arg2.readUByte();
	    } else
		aClass31_1958 = arg2.method181((byte) 127);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.C(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method247
	(int arg0, int arg1, int arg2, Class11_Sub10_Sub12 arg3, int arg4,
	 int arg5, int arg6, int arg7, byte arg8) {
	try {
	    anInt1961++;
	    long l;
	    if (anIntArray1996 != null)
		l = (long) ((anInt1963 << 568570474) + (arg4 << -1972124701)
			    - -arg0);
	    else
		l = (long) (arg0 + (anInt1963 << 2058635850));
	    if (arg8 >= -55)
		aBoolean1968 = true;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class12.aClass40_248.method735(l, (byte) -92));
	    if (class11_sub10_sub4_sub4 == null) {
		class11_sub10_sub4_sub4
		    = method241(-21201, true, arg4, true, arg0);
		if (class11_sub10_sub4_sub4 == null)
		    return null;
		Class12.aClass40_248.method742(-122, l,
					       class11_sub10_sub4_sub4);
	    }
	    if (arg3 == null && !aBoolean2011)
		return class11_sub10_sub4_sub4;
	    if (arg3 != null)
		class11_sub10_sub4_sub4
		    = arg3.method389(class11_sub10_sub4_sub4, arg5, (byte) 81,
				     arg0);
	    else
		class11_sub10_sub4_sub4
		    = class11_sub10_sub4_sub4.method301(true);
	    if (aBoolean2011) {
		int i = (arg6 - -arg2 - -arg1 - -arg7) / 4;
		for (int i_22_ = 0;
		     ((i_22_ ^ 0xffffffff)
		      > (class11_sub10_sub4_sub4.anInt2618 ^ 0xffffffff));
		     i_22_++) {
		    int i_23_ = class11_sub10_sub4_sub4.anIntArray2597[i_22_];
		    int i_24_ = (arg2 - arg6) * (64 + i_23_) / 128 + arg6;
		    int i_25_ = arg7 - -((arg1 - arg7) * (i_23_ + 64) / 128);
		    int i_26_ = class11_sub10_sub4_sub4.anIntArray2620[i_22_];
		    int i_27_ = i_24_ + (i_25_ - i_24_) * (64 + i_26_) / 128;
		    class11_sub10_sub4_sub4.anIntArray2605[i_22_]
			+= -i + i_27_;
		}
	    }
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ia.J(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + (arg3 != null ? "{...}" : "null")
				     + ',' + arg4 + ',' + arg5 + ',' + arg6
				     + ',' + arg7 + ',' + arg8 + ')'));
	}
    }
    
    public Class11_Sub10_Sub2() {
	aBoolean1969 = true;
	aBoolean1960 = true;
	anInt1977 = 128;
	anInt1987 = -1;
	anInt1967 = 1;
	anInt1995 = 0;
	aBoolean1968 = false;
	anInt1962 = -1;
	aBoolean1991 = true;
	anInt1983 = -1;
	anInt1955 = -1;
	anInt1973 = -1;
	anInt1981 = 0;
	anInt1998 = -1;
	anInt1974 = 1;
	anInt1994 = 128;
	anInt1965 = -1;
	anInt2001 = 0;
	anInt1993 = 16;
	anInt2000 = 0;
	aBoolean1978 = false;
	anInt2003 = 128;
	aClass31Array2008 = new Class31[5];
	anInt2010 = 0;
	aBoolean2009 = false;
	aBoolean2011 = false;
	anInt2012 = 0;
    }
    
    static {
	aClass31_1979 = Class64.method992("It(Ws a ", 255);
	aClass31_1990 = Class64.method992("Examine @yel@", 255);
	aClass31_2006 = Class64.method992("@cr1@", 255);
	aClass31_1989 = Class64.method992("yesterday", 255);
    }
}
