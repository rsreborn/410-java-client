/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class Class8
{
    public int anInt165;
    public static Class55_Sub1 aClass55_Sub1_166;
    public static int anInt167;
    public static Class31 aClass31_168 = Class64.method992("Use ", 255);
    public static int anInt169;
    public static int anInt170;
    public static int anInt171;
    public int anInt172;
    public static int anInt173;
    public int anInt174;
    public int anInt175;
    public static int anInt176;
    public static int anInt177;
    public static int anInt178;
    public int[][] anIntArrayArray179;
    public static int anInt180;
    public static int anInt181;
    public static int anInt182;
    public static int anInt183;
    public static int anInt184;
    public static int anInt185;
    public static int anInt186;
    public static int loginState = 0;
    public static Class55 aClass55_188;
    public static int anInt189;
    public static int anInt190 = 0;
    
    public boolean method85(int arg0, int arg1, int arg2, int arg3, int arg4,
			    int arg5, int arg6) {
	try {
	    anInt169++;
	    if (arg6 != -1)
		method93(4, 70, 21, -27, 80, (byte) -101, -80);
	    if (arg3 == arg4 && arg2 == arg1)
		return true;
	    arg4 -= anInt165;
	    arg3 -= anInt165;
	    arg2 -= anInt175;
	    arg1 -= anInt175;
	    if (arg5 == 0) {
		if (arg0 == 0) {
		    if (arg4 == arg3 - 1
			&& (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff))
			return true;
		    if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			&& (1 + arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			&& (anIntArrayArray179[arg4][arg1] & 0x1280120
			    ^ 0xffffffff) == -1)
			return true;
		    if (arg4 == arg3 && arg1 == arg2 - 1
			&& (anIntArrayArray179[arg4][arg1] & 0x1280102) == 0)
			return true;
		} else if (arg0 != 1) {
		    if ((arg0 ^ 0xffffffff) == -3) {
			if (arg4 == 1 + arg3
			    && (arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
			    return true;
			if (arg3 == arg4
			    && (arg1 ^ 0xffffffff) == (1 + arg2 ^ 0xffffffff)
			    && ((anIntArrayArray179[arg4][arg1] & 0x1280120)
				== 0))
			    return true;
			if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && -1 + arg2 == arg1
			    && ((0x1280102 & anIntArrayArray179[arg4][arg1])
				== 0))
			    return true;
		    } else if ((arg0 ^ 0xffffffff) == -4) {
			if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			    && -1 + arg2 == arg1)
			    return true;
			if ((arg4 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
			    && (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
			    && (anIntArrayArray179[arg4][arg1] & 0x1280108
				^ 0xffffffff) == -1)
			    return true;
			if (1 + arg3 == arg4 && arg2 == arg1
			    && (anIntArrayArray179[arg4][arg1] & 0x1280180
				^ 0xffffffff) == -1)
			    return true;
		    }
		} else {
		    if (arg4 == arg3
			&& (arg1 ^ 0xffffffff) == (1 + arg2 ^ 0xffffffff))
			return true;
		    if ((arg4 ^ 0xffffffff) == (-1 + arg3 ^ 0xffffffff)
			&& (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
			&& (anIntArrayArray179[arg4][arg1] & 0x1280108
			    ^ 0xffffffff) == -1)
			return true;
		    if ((arg3 - -1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			&& arg1 == arg2
			&& (anIntArrayArray179[arg4][arg1] & 0x1280180
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg5 == 2) {
		if (arg0 != 0) {
		    if (arg0 == 1) {
			if ((arg4 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
			    && (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
			    && ((0x1280108 & anIntArrayArray179[arg4][arg1])
				== 0))
			    return true;
			if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			    && arg1 == arg2 - -1)
			    return true;
			if (arg4 == 1 + arg3
			    && (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff))
			    return true;
			if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && (arg1 ^ 0xffffffff) == (arg2 + -1 ^ 0xffffffff)
			    && (anIntArrayArray179[arg4][arg1] & 0x1280102
				^ 0xffffffff) == -1)
			    return true;
		    } else if ((arg0 ^ 0xffffffff) != -3) {
			if ((arg0 ^ 0xffffffff) == -4) {
			    if (arg4 == -1 + arg3 && arg2 == arg1)
				return true;
			    if (arg3 == arg4 && arg2 + 1 == arg1
				&& (anIntArrayArray179[arg4][arg1]
				    & 0x1280120) == 0)
				return true;
			    if ((1 + arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
				&& arg2 == arg1
				&& (anIntArrayArray179[arg4][arg1]
				    & 0x1280180) == 0)
				return true;
			    if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
				&& (arg2 - 1 ^ 0xffffffff) == (arg1
							       ^ 0xffffffff))
				return true;
			}
		    } else {
			if (arg3 + -1 == arg4 && arg2 == arg1
			    && ((anIntArrayArray179[arg4][arg1] & 0x1280108)
				== 0))
			    return true;
			if (arg4 == arg3 && arg1 == arg2 + 1
			    && ((anIntArrayArray179[arg4][arg1] & 0x1280120)
				== 0))
			    return true;
			if (arg4 == 1 + arg3
			    && (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff))
			    return true;
			if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			    && (arg1 ^ 0xffffffff) == (-1 + arg2 ^ 0xffffffff))
			    return true;
		    }
		} else {
		    if (-1 + arg3 == arg4
			&& (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff))
			return true;
		    if (arg3 == arg4
			&& (arg1 ^ 0xffffffff) == (arg2 + 1 ^ 0xffffffff))
			return true;
		    if (1 + arg3 == arg4
			&& (arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
			&& (anIntArrayArray179[arg4][arg1] & 0x1280180) == 0)
			return true;
		    if (arg4 == arg3 && -1 + arg2 == arg1
			&& (anIntArrayArray179[arg4][arg1] & 0x1280102
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg5 == 9) {
		if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
		    && (1 + arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
		    && ((anIntArrayArray179[arg4][arg1] & 0x20 ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
		    && arg1 == arg2 + -1
		    && (0x2 & anIntArrayArray179[arg4][arg1]) == 0)
		    return true;
		if ((arg3 - 1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
		    && (arg1 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		    && ((anIntArrayArray179[arg4][arg1] & 0x8 ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg4 ^ 0xffffffff) == (arg3 + 1 ^ 0xffffffff)
		    && (arg2 ^ 0xffffffff) == (arg1 ^ 0xffffffff)
		    && ((anIntArrayArray179[arg4][arg1] & 0x80 ^ 0xffffffff)
			== -1))
		    return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.O(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public void method86(boolean arg0, boolean arg1, int arg2, int arg3,
			 int arg4, int arg5) {
	arg3 -= anInt175;
	anInt189++;
	arg4 -= anInt165;
	if (arg1 != true)
	    method93(-34, 0, -59, -54, -6, (byte) -8, 0);
	if (arg5 == 0) {
	    if (arg2 == 0) {
		method97(128, arg4, arg3, false);
		method97(8, arg4 - 1, arg3, !arg1);
	    }
	    if (arg2 == 1) {
		method97(2, arg4, arg3, false);
		method97(32, arg4, arg3 + 1, false);
	    }
	    if ((arg2 ^ 0xffffffff) == -3) {
		method97(8, arg4, arg3, !arg1);
		method97(128, arg4 + 1, arg3, false);
	    }
	    if ((arg2 ^ 0xffffffff) == -4) {
		method97(32, arg4, arg3, false);
		method97(2, arg4, -1 + arg3, false);
	    }
	}
	if ((arg5 ^ 0xffffffff) == -2 || arg5 == 3) {
	    if ((arg2 ^ 0xffffffff) == -1) {
		method97(1, arg4, arg3, !arg1);
		method97(16, -1 + arg4, 1 + arg3, !arg1);
	    }
	    if ((arg2 ^ 0xffffffff) == -2) {
		method97(4, arg4, arg3, !arg1);
		method97(64, arg4 - -1, arg3 + 1, !arg1);
	    }
	    if (arg2 == 2) {
		method97(16, arg4, arg3, !arg1);
		method97(1, arg4 - -1, -1 + arg3, false);
	    }
	    if (arg2 == 3) {
		method97(64, arg4, arg3, false);
		method97(4, arg4 + -1, -1 + arg3, false);
	    }
	}
	if ((arg5 ^ 0xffffffff) == -3) {
	    if (arg2 == 0) {
		method97(130, arg4, arg3, false);
		method97(8, -1 + arg4, arg3, false);
		method97(32, arg4, 1 + arg3, false);
	    }
	    if ((arg2 ^ 0xffffffff) == -2) {
		method97(10, arg4, arg3, !arg1);
		method97(32, arg4, 1 + arg3, !arg1);
		method97(128, arg4 + 1, arg3, false);
	    }
	    if ((arg2 ^ 0xffffffff) == -3) {
		method97(40, arg4, arg3, !arg1);
		method97(128, arg4 - -1, arg3, false);
		method97(2, arg4, -1 + arg3, false);
	    }
	    if ((arg2 ^ 0xffffffff) == -4) {
		method97(160, arg4, arg3, !arg1);
		method97(2, arg4, arg3 + -1, !arg1);
		method97(8, arg4 - 1, arg3, false);
	    }
	}
	if (arg0) {
	    if (arg5 == 0) {
		if ((arg2 ^ 0xffffffff) == -1) {
		    method97(65536, arg4, arg3, !arg1);
		    method97(4096, -1 + arg4, arg3, !arg1);
		}
		if ((arg2 ^ 0xffffffff) == -2) {
		    method97(1024, arg4, arg3, !arg1);
		    method97(16384, arg4, 1 + arg3, false);
		}
		if (arg2 == 2) {
		    method97(4096, arg4, arg3, false);
		    method97(65536, 1 + arg4, arg3, !arg1);
		}
		if ((arg2 ^ 0xffffffff) == -4) {
		    method97(16384, arg4, arg3, false);
		    method97(1024, arg4, arg3 + -1, false);
		}
	    }
	    if (arg5 == 1 || arg5 == 3) {
		if ((arg2 ^ 0xffffffff) == -1) {
		    method97(512, arg4, arg3, false);
		    method97(8192, arg4 + -1, 1 + arg3, false);
		}
		if ((arg2 ^ 0xffffffff) == -2) {
		    method97(2048, arg4, arg3, false);
		    method97(32768, arg4 + 1, arg3 - -1, !arg1);
		}
		if ((arg2 ^ 0xffffffff) == -3) {
		    method97(8192, arg4, arg3, false);
		    method97(512, arg4 + 1, -1 + arg3, false);
		}
		if (arg2 == 3) {
		    method97(32768, arg4, arg3, false);
		    method97(2048, -1 + arg4, -1 + arg3, false);
		}
	    }
	    if (arg5 == 2) {
		if ((arg2 ^ 0xffffffff) == -1) {
		    method97(66560, arg4, arg3, !arg1);
		    method97(4096, -1 + arg4, arg3, false);
		    method97(16384, arg4, 1 + arg3, !arg1);
		}
		if (arg2 == 1) {
		    method97(5120, arg4, arg3, false);
		    method97(16384, arg4, arg3 + 1, false);
		    method97(65536, arg4 + 1, arg3, false);
		}
		if (arg2 == 2) {
		    method97(20480, arg4, arg3, false);
		    method97(65536, 1 + arg4, arg3, false);
		    method97(1024, arg4, arg3 - 1, false);
		}
		if ((arg2 ^ 0xffffffff) == -4) {
		    method97(81920, arg4, arg3, !arg1);
		    method97(1024, arg4, arg3 - 1, false);
		    method97(4096, -1 + arg4, arg3, false);
		}
	    }
	}
    }
    
    public void method87(int arg0, int arg1, int arg2, boolean arg3, int arg4,
			 int arg5, int arg6) {
	try {
	    if (arg5 != -1)
		anInt165 = 103;
	    if (arg2 == 1 || arg2 == 3) {
		int i = arg0;
		arg0 = arg1;
		arg1 = i;
	    }
	    arg4 -= anInt165;
	    anInt171++;
	    int i = 256;
	    if (arg3)
		i += 131072;
	    arg6 -= anInt175;
	    for (int i_0_ = arg4; arg0 + arg4 > i_0_; i_0_++) {
		if (i_0_ >= 0
		    && (i_0_ ^ 0xffffffff) > (anInt172 ^ 0xffffffff)) {
		    for (int i_1_ = arg6; i_1_ < arg6 + arg1; i_1_++) {
			if (i_1_ >= 0 && i_1_ < anInt174)
			    method88(i, arg5 + 16777216, i_1_, i_0_);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.L(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public void method88(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anIntArrayArray179[arg3][arg2]
		= Class20.method572(anIntArrayArray179[arg3][arg2],
				    -arg0 + arg1);
	    anInt183++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.H(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public void method89(int arg0, boolean arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	try {
	    arg2 -= anInt165;
	    arg5 -= anInt175;
	    anInt167++;
	    if (arg4 != 19398920)
		method94(-123, -124, -9);
	    if (arg3 == 1 || arg3 == 3) {
		int i = arg6;
		arg6 = arg0;
		arg0 = i;
	    }
	    int i = 256;
	    if (arg1)
		i += 131072;
	    for (int i_2_ = arg2; arg2 + arg6 > i_2_; i_2_++) {
		if ((i_2_ ^ 0xffffffff) <= -1 && anInt172 > i_2_) {
		    for (int i_3_ = arg5;
			 (i_3_ ^ 0xffffffff) > (arg5 + arg0 ^ 0xffffffff);
			 i_3_++) {
			if ((i_3_ ^ 0xffffffff) <= -1
			    && (anInt174 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
			    method97(i, i_2_, i_3_, false);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.F(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public void method90(int arg0, byte arg1, boolean arg2, int arg3, int arg4,
			 int arg5) {
	arg3 -= anInt175;
	anInt170++;
	arg5 -= anInt165;
	if (arg0 == 0) {
	    if ((arg4 ^ 0xffffffff) == -1) {
		method88(128, 16777215, arg3, arg5);
		method88(8, 16777215, arg3, arg5 + -1);
	    }
	    if ((arg4 ^ 0xffffffff) == -2) {
		method88(2, 16777215, arg3, arg5);
		method88(32, 16777215, arg3 + 1, arg5);
	    }
	    if ((arg4 ^ 0xffffffff) == -3) {
		method88(8, 16777215, arg3, arg5);
		method88(128, 16777215, arg3, 1 + arg5);
	    }
	    if (arg4 == 3) {
		method88(32, 16777215, arg3, arg5);
		method88(2, 16777215, -1 + arg3, arg5);
	    }
	}
	if (arg1 >= -75)
	    aClass31_168 = null;
	if ((arg0 ^ 0xffffffff) == -2 || arg0 == 3) {
	    if (arg4 == 0) {
		method88(1, 16777215, arg3, arg5);
		method88(16, 16777215, arg3 - -1, -1 + arg5);
	    }
	    if (arg4 == 1) {
		method88(4, 16777215, arg3, arg5);
		method88(64, 16777215, arg3 - -1, arg5 + 1);
	    }
	    if (arg4 == 2) {
		method88(16, 16777215, arg3, arg5);
		method88(1, 16777215, -1 + arg3, 1 + arg5);
	    }
	    if (arg4 == 3) {
		method88(64, 16777215, arg3, arg5);
		method88(4, 16777215, -1 + arg3, arg5 - 1);
	    }
	}
	if ((arg0 ^ 0xffffffff) == -3) {
	    if (arg4 == 0) {
		method88(130, 16777215, arg3, arg5);
		method88(8, 16777215, arg3, arg5 - 1);
		method88(32, 16777215, 1 + arg3, arg5);
	    }
	    if ((arg4 ^ 0xffffffff) == -2) {
		method88(10, 16777215, arg3, arg5);
		method88(32, 16777215, arg3 + 1, arg5);
		method88(128, 16777215, arg3, 1 + arg5);
	    }
	    if ((arg4 ^ 0xffffffff) == -3) {
		method88(40, 16777215, arg3, arg5);
		method88(128, 16777215, arg3, 1 + arg5);
		method88(2, 16777215, -1 + arg3, arg5);
	    }
	    if (arg4 == 3) {
		method88(160, 16777215, arg3, arg5);
		method88(2, 16777215, -1 + arg3, arg5);
		method88(8, 16777215, arg3, -1 + arg5);
	    }
	}
	if (arg2) {
	    if ((arg0 ^ 0xffffffff) == -1) {
		if (arg4 == 0) {
		    method88(65536, 16777215, arg3, arg5);
		    method88(4096, 16777215, arg3, arg5 + -1);
		}
		if ((arg4 ^ 0xffffffff) == -2) {
		    method88(1024, 16777215, arg3, arg5);
		    method88(16384, 16777215, arg3 - -1, arg5);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method88(4096, 16777215, arg3, arg5);
		    method88(65536, 16777215, arg3, 1 + arg5);
		}
		if (arg4 == 3) {
		    method88(16384, 16777215, arg3, arg5);
		    method88(1024, 16777215, -1 + arg3, arg5);
		}
	    }
	    if (arg0 == 1 || (arg0 ^ 0xffffffff) == -4) {
		if ((arg4 ^ 0xffffffff) == -1) {
		    method88(512, 16777215, arg3, arg5);
		    method88(8192, 16777215, 1 + arg3, arg5 + -1);
		}
		if (arg4 == 1) {
		    method88(2048, 16777215, arg3, arg5);
		    method88(32768, 16777215, 1 + arg3, 1 + arg5);
		}
		if (arg4 == 2) {
		    method88(8192, 16777215, arg3, arg5);
		    method88(512, 16777215, -1 + arg3, 1 + arg5);
		}
		if (arg4 == 3) {
		    method88(32768, 16777215, arg3, arg5);
		    method88(2048, 16777215, arg3 + -1, arg5 - 1);
		}
	    }
	    if ((arg0 ^ 0xffffffff) == -3) {
		if (arg4 == 0) {
		    method88(66560, 16777215, arg3, arg5);
		    method88(4096, 16777215, arg3, -1 + arg5);
		    method88(16384, 16777215, 1 + arg3, arg5);
		}
		if (arg4 == 1) {
		    method88(5120, 16777215, arg3, arg5);
		    method88(16384, 16777215, arg3 - -1, arg5);
		    method88(65536, 16777215, arg3, arg5 - -1);
		}
		if (arg4 == 2) {
		    method88(20480, 16777215, arg3, arg5);
		    method88(65536, 16777215, arg3, arg5 - -1);
		    method88(1024, 16777215, -1 + arg3, arg5);
		}
		if ((arg4 ^ 0xffffffff) == -4) {
		    method88(81920, 16777215, arg3, arg5);
		    method88(1024, 16777215, -1 + arg3, arg5);
		    method88(4096, 16777215, arg3, -1 + arg5);
		}
	    }
	}
    }
    
    public static boolean method91(int arg0, int arg1) {
	try {
	    anInt185++;
	    if (!Class61.method968(arg0, -20142))
		return false;
	    boolean bool = false;
	    Class11_Sub10_Sub5[] class11_sub10_sub5s
		= Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg0];
	    if (arg1 != 65536)
		return true;
	    for (int i = 0; class11_sub10_sub5s.length > i; i++) {
		Class11_Sub10_Sub5 class11_sub10_sub5 = class11_sub10_sub5s[i];
		if (class11_sub10_sub5 != null
		    && class11_sub10_sub5.anInt2119 == 6) {
		    if ((class11_sub10_sub5.anInt2057 ^ 0xffffffff) != 0
			|| class11_sub10_sub5.anInt2085 != -1) {
			boolean bool_4_ = Class44.method764(class11_sub10_sub5,
							    (byte) -70);
			int i_5_;
			if (bool_4_)
			    i_5_ = class11_sub10_sub5.anInt2085;
			else
			    i_5_ = class11_sub10_sub5.anInt2057;
			if ((i_5_ ^ 0xffffffff) != 0) {
			    Class11_Sub10_Sub12 class11_sub10_sub12
				= NotActuallyBuffer.method600(i_5_, arg1 + -60669);
			    class11_sub10_sub5.anInt2088 += Class17.anInt340;
			    while (((class11_sub10_sub12.anIntArray2296
				     [class11_sub10_sub5.anInt2048])
				    ^ 0xffffffff)
				   > (class11_sub10_sub5.anInt2088
				      ^ 0xffffffff)) {
				bool = true;
				class11_sub10_sub5.anInt2088
				    -= (class11_sub10_sub12.anIntArray2296
					[class11_sub10_sub5.anInt2048]);
				class11_sub10_sub5.anInt2048++;
				if ((class11_sub10_sub5.anInt2048 ^ 0xffffffff)
				    <= ((class11_sub10_sub12
					 .anIntArray2280).length
					^ 0xffffffff)) {
				    class11_sub10_sub5.anInt2048
					-= class11_sub10_sub12.anInt2288;
				    if ((class11_sub10_sub5.anInt2048
					 ^ 0xffffffff) > -1
					|| (class11_sub10_sub5.anInt2048
					    >= (class11_sub10_sub12
						.anIntArray2280).length))
					class11_sub10_sub5.anInt2048 = 0;
				}
			    }
			}
		    }
		    if ((class11_sub10_sub5.anInt2126 ^ 0xffffffff) != -1) {
			int i_6_ = class11_sub10_sub5.anInt2126 >> 458059952;
			bool = true;
			i_6_ *= Class17.anInt340;
			class11_sub10_sub5.anInt2065
			    = class11_sub10_sub5.anInt2065 - -i_6_ & 0x7ff;
			int i_7_ = (class11_sub10_sub5.anInt2126 << -925034832
				    >> 1205545680);
			i_7_ *= Class17.anInt340;
			class11_sub10_sub5.anInt2120
			    = class11_sub10_sub5.anInt2120 + i_7_ & 0x7ff;
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "fb.K(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method92(boolean arg0) {
	for (int i = 0; anInt172 > i; i++) {
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (anInt174 ^ 0xffffffff);
		 i_8_++) {
		if (i != 0 && (i_8_ ^ 0xffffffff) != -1 && i != anInt172 - 1
		    && anInt174 + -1 != i_8_)
		    anIntArrayArray179[i][i_8_] = 16777216;
		else
		    anIntArrayArray179[i][i_8_] = 16777215;
	    }
	}
	anInt186++;
	if (arg0 != true)
	    method91(-13, -59);
    }
    
    public boolean method93(int arg0, int arg1, int arg2, int arg3, int arg4,
			    byte arg5, int arg6) {
	try {
	    anInt176++;
	    int i = -61 % ((arg5 - -43) / 47);
	    if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff) && arg0 == arg4)
		return true;
	    arg3 -= anInt165;
	    arg0 -= anInt175;
	    arg4 -= anInt175;
	    arg6 -= anInt165;
	    if (arg2 == 6 || (arg2 ^ 0xffffffff) == -8) {
		if (arg2 == 7)
		    arg1 = 0x3 & arg1 + 2;
		if (arg1 == 0) {
		    if ((1 + arg3 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			&& (arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
			&& (0x80 & anIntArrayArray179[arg6][arg0]
			    ^ 0xffffffff) == -1)
			return true;
		    if ((arg3 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			&& arg0 == -1 + arg4
			&& ((0x2 & anIntArrayArray179[arg6][arg0] ^ 0xffffffff)
			    == -1))
			return true;
		} else if ((arg1 ^ 0xffffffff) == -2) {
		    if (-1 + arg3 == arg6 && arg4 == arg0
			&& ((0x8 & anIntArrayArray179[arg6][arg0] ^ 0xffffffff)
			    == -1))
			return true;
		    if (arg3 == arg6 && -1 + arg4 == arg0
			&& (anIntArrayArray179[arg6][arg0] & 0x2) == 0)
			return true;
		} else if ((arg1 ^ 0xffffffff) != -3) {
		    if (arg1 == 3) {
			if (arg6 == 1 + arg3 && arg4 == arg0
			    && (0x80 & anIntArrayArray179[arg6][arg0]) == 0)
			    return true;
			if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
			    && arg0 == 1 + arg4
			    && (0x20 & anIntArrayArray179[arg6][arg0]) == 0)
			    return true;
		    }
		} else {
		    if ((arg3 + -1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			&& (arg4 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
			&& (anIntArrayArray179[arg6][arg0] & 0x8) == 0)
			return true;
		    if (arg6 == arg3 && arg0 == arg4 - -1
			&& (0x20 & anIntArrayArray179[arg6][arg0]
			    ^ 0xffffffff) == -1)
			return true;
		}
	    }
	    if (arg2 == 8) {
		if (arg6 == arg3 && 1 + arg4 == arg0
		    && ((0x20 & anIntArrayArray179[arg6][arg0] ^ 0xffffffff)
			== -1))
		    return true;
		if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
		    && arg4 + -1 == arg0
		    && ((0x2 & anIntArrayArray179[arg6][arg0] ^ 0xffffffff)
			== -1))
		    return true;
		if (arg6 == arg3 + -1
		    && (arg4 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
		    && ((0x8 & anIntArrayArray179[arg6][arg0] ^ 0xffffffff)
			== -1))
		    return true;
		if (arg6 == arg3 - -1 && arg0 == arg4
		    && (anIntArrayArray179[arg6][arg0] & 0x80) == 0)
		    return true;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.G(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ')'));
	}
    }
    
    public void method94(int arg0, int arg1, int arg2) {
	try {
	    arg0 -= anInt175;
	    anInt184++;
	    arg2 -= anInt165;
	    anIntArrayArray179[arg2][arg0]
		= Class11_Sub10_Sub6.method345(anIntArrayArray179[arg2][arg0],
					       arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.M(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public Class8(int arg0, int arg1) {
	try {
	    anInt174 = arg1;
	    anInt172 = arg0;
	    anInt165 = 0;
	    anInt175 = 0;
	    anIntArrayArray179 = new int[anInt172][anInt174];
	    method92(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "fb.<init>(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method95(int arg0, int arg1, byte arg2) {
	try {
	    arg1 -= anInt165;
	    if (arg2 == -32) {
		arg0 -= anInt175;
		anInt173++;
		anIntArrayArray179[arg1][arg0]
		    = Class20.method572(anIntArrayArray179[arg1][arg0],
					14680063);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.J(" + arg0 + ',' + arg1 + ',' + arg2
				     + ')'));
	}
    }
    
    public boolean method96(int arg0, int arg1, int arg2, int arg3, int arg4,
			    int arg5, int arg6, boolean arg7) {
	try {
	    anInt182++;
	    int i = arg3 + arg6 + -1;
	    if (arg7 != false)
		anInt172 = -24;
	    int i_9_ = arg2 - (-arg4 - -1);
	    if ((arg2 ^ 0xffffffff) >= (arg5 ^ 0xffffffff)
		&& (arg5 ^ 0xffffffff) >= (i_9_ ^ 0xffffffff) && arg1 >= arg3
		&& arg1 <= i)
		return true;
	    if (arg5 == -1 + arg2 && arg3 <= arg1
		&& (i ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
		&& ((0x8
		     & anIntArrayArray179[-anInt165 + arg5][-anInt175 + arg1])
		    == 0)
		&& (arg0 & 0x8 ^ 0xffffffff) == -1)
		return true;
	    if ((i_9_ - -1 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		&& (arg3 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
		&& (i ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
		&& ((0x80
		     & anIntArrayArray179[-anInt165 + arg5][-anInt175 + arg1])
		    ^ 0xffffffff) == -1
		&& (0x2 & arg0 ^ 0xffffffff) == -1)
		return true;
	    if ((arg1 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) >= (arg5 ^ 0xffffffff)
		&& (i_9_ ^ 0xffffffff) <= (arg5 ^ 0xffffffff)
		&& ((anIntArrayArray179[arg5 + -anInt165][arg1 + -anInt175]
		     & 0x2)
		    ^ 0xffffffff) == -1
		&& (arg0 & 0x4) == 0)
		return true;
	    if ((arg1 ^ 0xffffffff) == (i + 1 ^ 0xffffffff)
		&& (arg5 ^ 0xffffffff) <= (arg2 ^ 0xffffffff) && i_9_ >= arg5
		&& ((0x20
		     & anIntArrayArray179[-anInt165 + arg5][-anInt175 + arg1])
		    ^ 0xffffffff) == -1
		&& (arg0 & 0x1) == 0)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ',' + arg7 + ')'));
	}
    }
    
    public void method97(int arg0, int arg1, int arg2, boolean arg3) {
	try {
	    if (arg3 != false)
		method88(-97, 109, -128, 8);
	    anInt177++;
	    anIntArrayArray179[arg1][arg2]
		= Class11_Sub10_Sub6.method345(anIntArrayArray179[arg1][arg2],
					       arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.I(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public static void method98
	(Class64 arg0, Class64 arg1, byte arg2, int arg3) throws IOException {
	try {
	    anInt181++;
	    byte[] is = arg0.method996(arg3, 97);
	    if (is != null) {
		int i = 92 / ((arg2 - 67) / 53);
		int i_10_ = 0;
		byte[] is_11_ = new byte[1000];
		int i_12_ = is.length + -2;
		GZIPInputStream gzipinputstream
		    = new GZIPInputStream(new ByteArrayInputStream(is));
		for (;;) {
		    int i_13_ = gzipinputstream.read(is_11_, 0, is_11_.length);
		    if (i_13_ == -1)
			break;
		    i_10_ += i_13_;
		}
		byte[] is_14_ = new byte[9 + is.length];
		Class21.method574(is, 0, is_14_, 9, is.length);
		is = is_14_;
		Buffer buffer = new Buffer(is_14_);
		buffer.writeByte(2);
		buffer.writeIntBE(i_12_);
		buffer.writeIntBE(i_10_);
		buffer.position = -2 + is_14_.length;
		int i_15_ = buffer.method164();
		buffer.position = -2 + is_14_.length;
		Object object = null;
		buffer.writeShortBE(-1 + i_15_);
		arg1.method994(is.length, arg3, is, false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("fb.A("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static void method99(int arg0) {
	aClass55_Sub1_166 = null;
	aClass31_168 = null;
	aClass55_188 = null;
	if (arg0 != 5314)
	    method91(47, -71);
    }
}
