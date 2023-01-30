/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class49
{
    public static int anInt919;
    public static int anInt920;
    public static int[] anIntArray921;
    public static int anInt922;
    public static int anInt923;
    public static int[] anIntArray924 = { -45, 45, 45, -45 };
    public static int anInt925;
    public static boolean aBoolean926;
    public static Class48[] aClass48Array927 = new Class48[500];
    public static int anInt928;
    public static int anInt929 = 0;
    public static boolean aBoolean930;
    public int anInt931;
    public static Class36 aClass36_932;
    public Class11_Sub12[][][] aClass11_Sub12ArrayArrayArray933;
    public static int anInt934;
    public static int anInt935 = -1;
    public static int anInt936;
    public Class28[] aClass28Array937 = new Class28[5000];
    public int[][][] anIntArrayArrayArray938;
    public static int anInt939;
    public int anInt940;
    public static int anInt941;
    public static int[] anIntArray942;
    public static Class28[] aClass28Array943;
    public int anInt944;
    public int anInt945;
    public int anInt946 = 0;
    public static int[] anIntArray947;
    public static int anInt948;
    public static int anInt949;
    public static int anInt950;
    public static int anInt951;
    public static int[] anIntArray952;
    public static int anInt953;
    public static int anInt954;
    public static int anInt955;
    public int[][][] anIntArrayArrayArray956;
    public static int anInt957;
    public static Class48[][] aClass48ArrayArray958;
    public static int anInt959;
    public int[][] anIntArrayArray960;
    public int[][] anIntArrayArray961;
    public int[] anIntArray962;
    public static int anInt963;
    public int anInt964;
    public int[] anIntArray965;
    public static int[] anIntArray966;
    public static int anInt967;
    public static int[] anIntArray968;
    public static int anInt969;
    public static int[] anIntArray970;
    public static int anInt971;
    public static boolean[][] aBooleanArrayArray972;
    public static int anInt973;
    public static int[] anIntArray974;
    public static int anInt975;
    public static int[] anIntArray976;
    public static int[] anIntArray977;
    public static int anInt978;
    public static int[] anIntArray979;
    public static boolean[][][][] aBooleanArrayArrayArrayArray980;
    
    public void method791(Class11_Sub10_Sub4_Sub4 arg0, int arg1, int arg2,
			  int arg3) {
	if (arg2 < anInt940) {
	    Class11_Sub12 class11_sub12
		= aClass11_Sub12ArrayArrayArray933[arg1][arg2 + 1][arg3];
	    if (class11_sub12 != null && class11_sub12.aClass23_1727 != null
		&& (class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420
		    instanceof Class11_Sub10_Sub4_Sub4)) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = ((Class11_Sub10_Sub4_Sub4)
		       class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420);
		if (class11_sub10_sub4_sub4.aClass62Array2606 != null)
		    method839(arg0, class11_sub10_sub4_sub4, 128, 0, 0, true);
	    }
	}
	if (arg3 < anInt940) {
	    Class11_Sub12 class11_sub12
		= aClass11_Sub12ArrayArrayArray933[arg1][arg2][arg3 + 1];
	    if (class11_sub12 != null && class11_sub12.aClass23_1727 != null
		&& (class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420
		    instanceof Class11_Sub10_Sub4_Sub4)) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = ((Class11_Sub10_Sub4_Sub4)
		       class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420);
		if (class11_sub10_sub4_sub4.aClass62Array2606 != null)
		    method839(arg0, class11_sub10_sub4_sub4, 0, 0, 128, true);
	    }
	}
	if (arg2 < anInt940 && arg3 < anInt931) {
	    Class11_Sub12 class11_sub12
		= aClass11_Sub12ArrayArrayArray933[arg1][arg2 + 1][arg3 + 1];
	    if (class11_sub12 != null && class11_sub12.aClass23_1727 != null
		&& (class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420
		    instanceof Class11_Sub10_Sub4_Sub4)) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = ((Class11_Sub10_Sub4_Sub4)
		       class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420);
		if (class11_sub10_sub4_sub4.aClass62Array2606 != null)
		    method839(arg0, class11_sub10_sub4_sub4, 128, 0, 128,
			      true);
	    }
	}
	if (arg2 < anInt940 && arg3 > 0) {
	    Class11_Sub12 class11_sub12
		= aClass11_Sub12ArrayArrayArray933[arg1][arg2 + 1][arg3 - 1];
	    if (class11_sub12 != null && class11_sub12.aClass23_1727 != null
		&& (class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420
		    instanceof Class11_Sub10_Sub4_Sub4)) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		    = ((Class11_Sub10_Sub4_Sub4)
		       class11_sub12.aClass23_1727.aClass11_Sub10_Sub4_420);
		if (class11_sub10_sub4_sub4.aClass62Array2606 != null)
		    method839(arg0, class11_sub10_sub4_sub4, 128, 0, -128,
			      true);
	    }
	}
    }
    
    public void method792(Class28 arg0) {
	for (int i = arg0.anInt515; i <= arg0.anInt504; i++) {
	    for (int i_0_ = arg0.anInt522; i_0_ <= arg0.anInt526; i_0_++) {
		Class11_Sub12 class11_sub12
		    = aClass11_Sub12ArrayArrayArray933[arg0.anInt510][i][i_0_];
		if (class11_sub12 != null) {
		    for (int i_1_ = 0; i_1_ < class11_sub12.anInt1718;
			 i_1_++) {
			if (class11_sub12.aClass28Array1726[i_1_] == arg0) {
			    class11_sub12.anInt1718--;
			    for (int i_2_ = i_1_;
				 i_2_ < class11_sub12.anInt1718; i_2_++) {
				class11_sub12.aClass28Array1726[i_2_]
				    = (class11_sub12.aClass28Array1726
				       [i_2_ + 1]);
				class11_sub12.anIntArray1719[i_2_]
				    = class11_sub12.anIntArray1719[i_2_ + 1];
			    }
			    class11_sub12.aClass28Array1726[(class11_sub12
							     .anInt1718)]
				= null;
			    break;
			}
		    }
		    class11_sub12.anInt1710 = 0;
		    for (int i_3_ = 0; i_3_ < class11_sub12.anInt1718; i_3_++)
			class11_sub12.anInt1710
			    |= class11_sub12.anIntArray1719[i_3_];
		}
	    }
	}
    }
    
    public boolean method793(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, Class11_Sub10_Sub4 arg6, int arg7,
			     int arg8, int arg9) {
	if (arg6 == null)
	    return true;
	int i = arg1 * 128 + 64 * arg4;
	int i_4_ = arg2 * 128 + 64 * arg5;
	return method826(arg0, arg1, arg2, arg4, arg5, i, i_4_, arg3, arg6,
			 arg7, false, arg8, arg9);
    }
    
    public void method794(int arg0, int arg1, int arg2, int arg3) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null) {
	    Class1 class1 = class11_sub12.aClass1_1717;
	    if (class1 != null) {
		int i = arg1 * 128 + 64;
		int i_5_ = arg2 * 128 + 64;
		class1.anInt79 = i + (class1.anInt79 - i) * arg3 / 16;
		class1.anInt84 = i_5_ + (class1.anInt84 - i_5_) * arg3 / 16;
	    }
	}
    }
    
    public Class54 method795(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null)
	    return null;
	return class11_sub12.aClass54_1725;
    }
    
    public void method796(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null)
	    class11_sub12.aClass23_1727 = null;
    }
    
    public void method797() {
	for (int i = 0; i < anInt945; i++) {
	    for (int i_6_ = 0; i_6_ < anInt940; i_6_++) {
		for (int i_7_ = 0; i_7_ < anInt931; i_7_++)
		    aClass11_Sub12ArrayArrayArray933[i][i_6_][i_7_] = null;
	    }
	}
	for (int i = 0; i < anInt953; i++) {
	    for (int i_8_ = 0; i_8_ < anIntArray947[i]; i_8_++)
		aClass48ArrayArray958[i][i_8_] = null;
	    anIntArray947[i] = 0;
	}
	for (int i = 0; i < anInt946; i++)
	    aClass28Array937[i] = null;
	anInt946 = 0;
	for (int i = 0; i < aClass28Array943.length; i++)
	    aClass28Array943[i] = null;
    }
    
    public void method798(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null)
	    class11_sub12.aClass1_1717 = null;
    }
    
    public void method799(int arg0, int arg1, int arg2, int arg3,
			  Class11_Sub10_Sub4 arg4, int arg5, int arg6) {
	if (arg4 != null) {
	    Class23 class23 = new Class23();
	    class23.aClass11_Sub10_Sub4_420 = arg4;
	    class23.anInt422 = arg1 * 128 + 64;
	    class23.anInt417 = arg2 * 128 + 64;
	    class23.anInt413 = arg3;
	    class23.anInt423 = arg5;
	    class23.anInt415 = arg6;
	    if (aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2] == null)
		aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2]
		    = new Class11_Sub12(arg0, arg1, arg2);
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass23_1727
		= class23;
	}
    }
    
    public boolean method800(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5) {
	if (arg1 == arg2 && arg3 == arg4) {
	    if (!method809(arg0, arg1, arg3))
		return false;
	    int i = arg1 << 7;
	    int i_9_ = arg3 << 7;
	    if (method818(i + 1,
			  anIntArrayArrayArray938[arg0][arg1][arg3] - arg5,
			  i_9_ + 1)
		&& method818(i + 128 - 1,
			     (anIntArrayArrayArray938[arg0][arg1 + 1][arg3]
			      - arg5),
			     i_9_ + 1)
		&& method818(i + 128 - 1,
			     (anIntArrayArrayArray938[arg0][arg1 + 1][arg3 + 1]
			      - arg5),
			     i_9_ + 128 - 1)
		&& method818(i + 1,
			     (anIntArrayArrayArray938[arg0][arg1][arg3 + 1]
			      - arg5),
			     i_9_ + 128 - 1))
		return true;
	    return false;
	}
	for (int i = arg1; i <= arg2; i++) {
	    for (int i_10_ = arg3; i_10_ <= arg4; i_10_++) {
		if (anIntArrayArrayArray956[arg0][i][i_10_] == -anInt923)
		    return false;
	    }
	}
	int i = (arg1 << 7) + 1;
	int i_11_ = (arg3 << 7) + 2;
	int i_12_ = anIntArrayArrayArray938[arg0][arg1][arg3] - arg5;
	if (!method818(i, i_12_, i_11_))
	    return false;
	int i_13_ = (arg2 << 7) - 1;
	if (!method818(i_13_, i_12_, i_11_))
	    return false;
	int i_14_ = (arg4 << 7) - 1;
	if (!method818(i, i_12_, i_14_))
	    return false;
	if (!method818(i_13_, i_12_, i_14_))
	    return false;
	return true;
    }
    
    public void method801(int arg0, int arg1, int arg2, int arg3) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null)
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].anInt1729
		= arg3;
    }
    
    public int method802(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null || class11_sub12.aClass1_1717 == null)
	    return 0;
	return class11_sub12.aClass1_1717.anInt96;
    }
    
    public static int method803(int arg0, int arg1) {
	arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public void method804(int arg0) {
	anInt944 = arg0;
	for (int i = 0; i < anInt940; i++) {
	    for (int i_15_ = 0; i_15_ < anInt931; i_15_++) {
		if (aClass11_Sub12ArrayArrayArray933[arg0][i][i_15_] == null)
		    aClass11_Sub12ArrayArrayArray933[arg0][i][i_15_]
			= new Class11_Sub12(arg0, i, i_15_);
	    }
	}
    }
    
    public static void method805(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt978 = 0;
	anInt971 = 0;
	anInt975 = arg3;
	anInt967 = arg4;
	anInt969 = arg3 / 2;
	anInt973 = arg4 / 2;
	boolean[][][][] bools = new boolean[9][32][53][53];
	for (int i = 128; i <= 384; i += 32) {
	    for (int i_16_ = 0; i_16_ < 2048; i_16_ += 64) {
		anInt955 = Class11_Sub10_Sub4_Sub4.anIntArray2632[i];
		anInt941 = Class11_Sub10_Sub4_Sub4.anIntArray2654[i];
		anInt934 = Class11_Sub10_Sub4_Sub4.anIntArray2632[i_16_];
		anInt936 = Class11_Sub10_Sub4_Sub4.anIntArray2654[i_16_];
		int i_17_ = (i - 128) / 32;
		int i_18_ = i_16_ / 64;
		for (int i_19_ = -26; i_19_ <= 26; i_19_++) {
		    for (int i_20_ = -26; i_20_ <= 26; i_20_++) {
			int i_21_ = i_19_ * 128;
			int i_22_ = i_20_ * 128;
			boolean bool = false;
			for (int i_23_ = -arg1; i_23_ <= arg2; i_23_ += 128) {
			    if (method807(i_21_, arg0[i_17_] + i_23_, i_22_)) {
				bool = true;
				break;
			    }
			}
			bools[i_17_][i_18_][i_19_ + 25 + 1][i_20_ + 25 + 1]
			    = bool;
		    }
		}
	    }
	}
	for (int i = 0; i < 8; i++) {
	    for (int i_24_ = 0; i_24_ < 32; i_24_++) {
		for (int i_25_ = -25; i_25_ < 25; i_25_++) {
		    for (int i_26_ = -25; i_26_ < 25; i_26_++) {
			boolean bool = false;
		    while_3_:
			for (int i_27_ = -1; i_27_ <= 1; i_27_++) {
			    for (int i_28_ = -1; i_28_ <= 1; i_28_++) {
				if (bools[i][i_24_][i_25_ + i_27_ + 25 + 1]
				    [i_26_ + i_28_ + 25 + 1]) {
				    bool = true;
				    break while_3_;
				}
				if (bools[i][(i_24_ + 1) % 31]
				    [i_25_ + i_27_ + 25 + 1]
				    [i_26_ + i_28_ + 25 + 1]) {
				    bool = true;
				    break while_3_;
				}
				if (bools[i + 1][i_24_][i_25_ + i_27_ + 25 + 1]
				    [i_26_ + i_28_ + 25 + 1]) {
				    bool = true;
				    break while_3_;
				}
				if (bools[i + 1][(i_24_ + 1) % 31]
				    [i_25_ + i_27_ + 25 + 1]
				    [i_26_ + i_28_ + 25 + 1]) {
				    bool = true;
				    break while_3_;
				}
			    }
			}
			aBooleanArrayArrayArrayArray980[i][i_24_]
			    [i_25_ + 25][i_26_ + 25]
			    = bool;
		    }
		}
	    }
	}
    }
    
    public void method806(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null) {
	    for (int i = 0; i < class11_sub12.anInt1718; i++) {
		Class28 class28 = class11_sub12.aClass28Array1726[i];
		if ((class28.anInt500 >> 29 & 0x3) == 2
		    && class28.anInt515 == arg1 && class28.anInt522 == arg2) {
		    method792(class28);
		    break;
		}
	    }
	}
    }
    
    public static boolean method807(int arg0, int arg1, int arg2) {
	int i = arg2 * anInt934 + arg0 * anInt936 >> 16;
	int i_29_ = arg2 * anInt936 - arg0 * anInt934 >> 16;
	int i_30_ = arg1 * anInt955 + i_29_ * anInt941 >> 16;
	int i_31_ = arg1 * anInt941 - i_29_ * anInt955 >> 16;
	if (i_30_ < 50 || i_30_ > 3500)
	    return false;
	int i_32_ = anInt969 + (i << 9) / i_30_;
	int i_33_ = anInt973 + (i_31_ << 9) / i_30_;
	if (i_32_ < anInt978 || i_32_ > anInt975 || i_33_ < anInt971
	    || i_33_ > anInt967)
	    return false;
	return true;
    }
    
    public boolean method808(int arg0, int arg1, int arg2, int arg3, int arg4,
			     Class11_Sub10_Sub4 arg5, int arg6, int arg7,
			     boolean arg8) {
	if (arg5 == null)
	    return true;
	int i = arg1 - arg4;
	int i_34_ = arg2 - arg4;
	int i_35_ = arg1 + arg4;
	int i_36_ = arg2 + arg4;
	if (arg8) {
	    if (arg6 > 640 && arg6 < 1408)
		i_36_ += 128;
	    if (arg6 > 1152 && arg6 < 1920)
		i_35_ += 128;
	    if (arg6 > 1664 || arg6 < 384)
		i_34_ -= 128;
	    if (arg6 > 128 && arg6 < 896)
		i -= 128;
	}
	i /= 128;
	i_34_ /= 128;
	i_35_ /= 128;
	i_36_ /= 128;
	return method826(arg0, i, i_34_, i_35_ - i + 1, i_36_ - i_34_ + 1,
			 arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
    }
    
    public boolean method809(int arg0, int arg1, int arg2) {
	int i = anIntArrayArrayArray956[arg0][arg1][arg2];
	if (i == -anInt923)
	    return false;
	if (i == anInt923)
	    return true;
	int i_37_ = arg1 << 7;
	int i_38_ = arg2 << 7;
	if (method818(i_37_ + 1, anIntArrayArrayArray938[arg0][arg1][arg2],
		      i_38_ + 1)
	    && method818(i_37_ + 128 - 1,
			 anIntArrayArrayArray938[arg0][arg1 + 1][arg2],
			 i_38_ + 1)
	    && method818(i_37_ + 128 - 1,
			 anIntArrayArrayArray938[arg0][arg1 + 1][arg2 + 1],
			 i_38_ + 128 - 1)
	    && method818(i_37_ + 1,
			 anIntArrayArrayArray938[arg0][arg1][arg2 + 1],
			 i_38_ + 128 - 1)) {
	    anIntArrayArrayArray956[arg0][arg1][arg2] = anInt923;
	    return true;
	}
	anIntArrayArrayArray956[arg0][arg1][arg2] = -anInt923;
	return false;
    }
    
    public void method810(int arg0, int arg1, int arg2, int arg3,
			  Class11_Sub10_Sub4 arg4, int arg5,
			  Class11_Sub10_Sub4 arg6, Class11_Sub10_Sub4 arg7) {
	Class44 class44 = new Class44();
	class44.aClass11_Sub10_Sub4_813 = arg4;
	class44.anInt818 = arg1 * 128 + 64;
	class44.anInt798 = arg2 * 128 + 64;
	class44.anInt793 = arg3;
	class44.anInt810 = arg5;
	class44.aClass11_Sub10_Sub4_792 = arg6;
	class44.aClass11_Sub10_Sub4_803 = arg7;
	int i = 0;
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null) {
	    for (int i_39_ = 0; i_39_ < class11_sub12.anInt1718; i_39_++) {
		if (((class11_sub12.aClass28Array1726[i_39_].anInt513 & 0x100)
		     == 256)
		    && ((class11_sub12.aClass28Array1726[i_39_]
			 .aClass11_Sub10_Sub4_528)
			instanceof Class11_Sub10_Sub4_Sub4)) {
		    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
			= ((Class11_Sub10_Sub4_Sub4)
			   (class11_sub12.aClass28Array1726[i_39_]
			    .aClass11_Sub10_Sub4_528));
		    class11_sub10_sub4_sub4.method294();
		    if (class11_sub10_sub4_sub4.anInt2046 > i)
			i = class11_sub10_sub4_sub4.anInt2046;
		}
	    }
	}
	class44.anInt805 = i;
	if (aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2] == null)
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2]
		= new Class11_Sub12(arg0, arg1, arg2);
	aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass44_1712
	    = class44;
    }
    
    public Class1 method811(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null)
	    return null;
	return class11_sub12.aClass1_1717;
    }
    
    public int method812(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null)
	    return 0;
	for (int i = 0; i < class11_sub12.anInt1718; i++) {
	    Class28 class28 = class11_sub12.aClass28Array1726[i];
	    if ((class28.anInt500 >> 29 & 0x3) == 2 && class28.anInt515 == arg1
		&& class28.anInt522 == arg2)
		return class28.anInt500;
	}
	return 0;
    }
    
    public void method813(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg0 < 0)
	    arg0 = 0;
	else if (arg0 >= anInt940 * 128)
	    arg0 = anInt940 * 128 - 1;
	if (arg2 < 0)
	    arg2 = 0;
	else if (arg2 >= anInt931 * 128)
	    arg2 = anInt931 * 128 - 1;
	anInt923++;
	anInt955 = Class11_Sub10_Sub4_Sub4.anIntArray2632[arg3];
	anInt941 = Class11_Sub10_Sub4_Sub4.anIntArray2654[arg3];
	anInt934 = Class11_Sub10_Sub4_Sub4.anIntArray2632[arg4];
	anInt936 = Class11_Sub10_Sub4_Sub4.anIntArray2654[arg4];
	aBooleanArrayArray972
	    = aBooleanArrayArrayArrayArray980[(arg3 - 128) / 32][arg4 / 64];
	anInt919 = arg0;
	anInt954 = arg1;
	anInt950 = arg2;
	anInt939 = arg0 / 128;
	anInt922 = arg2 / 128;
	anInt925 = arg5;
	anInt957 = anInt939 - 25;
	if (anInt957 < 0)
	    anInt957 = 0;
	anInt949 = anInt922 - 25;
	if (anInt949 < 0)
	    anInt949 = 0;
	anInt948 = anInt939 + 25;
	if (anInt948 > anInt940)
	    anInt948 = anInt940;
	anInt963 = anInt922 + 25;
	if (anInt963 > anInt931)
	    anInt963 = anInt931;
	method838();
	anInt929 = 0;
	for (int i = anInt944; i < anInt945; i++) {
	    Class11_Sub12[][] class11_sub12s
		= aClass11_Sub12ArrayArrayArray933[i];
	    for (int i_40_ = anInt957; i_40_ < anInt948; i_40_++) {
		for (int i_41_ = anInt949; i_41_ < anInt963; i_41_++) {
		    Class11_Sub12 class11_sub12 = class11_sub12s[i_40_][i_41_];
		    if (class11_sub12 != null) {
			if (class11_sub12.anInt1729 > arg5
			    || (!(aBooleanArrayArray972[i_40_ - anInt939 + 25]
				  [i_41_ - anInt922 + 25])
				&& (anIntArrayArrayArray938[i][i_40_][i_41_]
				    - arg1) < 2000)) {
			    class11_sub12.aBoolean1714 = false;
			    class11_sub12.aBoolean1715 = false;
			    class11_sub12.anInt1707 = 0;
			} else {
			    class11_sub12.aBoolean1714 = true;
			    class11_sub12.aBoolean1715 = true;
			    if (class11_sub12.anInt1718 > 0)
				class11_sub12.aBoolean1711 = true;
			    else
				class11_sub12.aBoolean1711 = false;
			    anInt929++;
			}
		    }
		}
	    }
	}
	for (int i = anInt944; i < anInt945; i++) {
	    Class11_Sub12[][] class11_sub12s
		= aClass11_Sub12ArrayArrayArray933[i];
	    for (int i_42_ = -25; i_42_ <= 0; i_42_++) {
		int i_43_ = anInt939 + i_42_;
		int i_44_ = anInt939 - i_42_;
		if (i_43_ >= anInt957 || i_44_ < anInt948) {
		    for (int i_45_ = -25; i_45_ <= 0; i_45_++) {
			int i_46_ = anInt922 + i_45_;
			int i_47_ = anInt922 - i_45_;
			if (i_43_ >= anInt957) {
			    if (i_46_ >= anInt949) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_43_][i_46_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, true);
			    }
			    if (i_47_ < anInt963) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_43_][i_47_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, true);
			    }
			}
			if (i_44_ < anInt948) {
			    if (i_46_ >= anInt949) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_44_][i_46_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, true);
			    }
			    if (i_47_ < anInt963) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_44_][i_47_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, true);
			    }
			}
			if (anInt929 == 0) {
			    aBoolean926 = false;
			    return;
			}
		    }
		}
	    }
	}
	for (int i = anInt944; i < anInt945; i++) {
	    Class11_Sub12[][] class11_sub12s
		= aClass11_Sub12ArrayArrayArray933[i];
	    for (int i_48_ = -25; i_48_ <= 0; i_48_++) {
		int i_49_ = anInt939 + i_48_;
		int i_50_ = anInt939 - i_48_;
		if (i_49_ >= anInt957 || i_50_ < anInt948) {
		    for (int i_51_ = -25; i_51_ <= 0; i_51_++) {
			int i_52_ = anInt922 + i_51_;
			int i_53_ = anInt922 - i_51_;
			if (i_49_ >= anInt957) {
			    if (i_52_ >= anInt949) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_49_][i_52_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, false);
			    }
			    if (i_53_ < anInt963) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_49_][i_53_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, false);
			    }
			}
			if (i_50_ < anInt948) {
			    if (i_52_ >= anInt949) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_50_][i_52_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, false);
			    }
			    if (i_53_ < anInt963) {
				Class11_Sub12 class11_sub12
				    = class11_sub12s[i_50_][i_53_];
				if (class11_sub12 != null
				    && class11_sub12.aBoolean1714)
				    method834(class11_sub12, false);
			    }
			}
			if (anInt929 == 0) {
			    aBoolean926 = false;
			    return;
			}
		    }
		}
	    }
	}
	aBoolean926 = false;
    }
    
    public static void method814() {
	aClass28Array943 = null;
	anIntArray921 = null;
	anIntArray942 = null;
	anIntArray924 = null;
	anIntArray952 = null;
	anIntArray947 = null;
	aClass48ArrayArray958 = null;
	aClass48Array927 = null;
	aClass36_932 = null;
	anIntArray979 = null;
	anIntArray968 = null;
	anIntArray970 = null;
	anIntArray976 = null;
	anIntArray966 = null;
	anIntArray977 = null;
	anIntArray974 = null;
	aBooleanArrayArrayArrayArray980 = null;
	aBooleanArrayArray972 = null;
    }
    
    public void method815(int[] arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg3][arg4][arg5];
	if (class11_sub12 != null) {
	    Class43 class43 = class11_sub12.aClass43_1723;
	    if (class43 != null) {
		int i = class43.anInt776;
		if (i != 0) {
		    for (int i_54_ = 0; i_54_ < 4; i_54_++) {
			arg0[arg1] = i;
			arg0[arg1 + 1] = i;
			arg0[arg1 + 2] = i;
			arg0[arg1 + 3] = i;
			arg1 += arg2;
		    }
		}
	    } else {
		Class30 class30 = class11_sub12.aClass30_1709;
		if (class30 != null) {
		    int i = class30.anInt566;
		    int i_55_ = class30.anInt555;
		    int i_56_ = class30.anInt563;
		    int i_57_ = class30.anInt551;
		    int[] is = anIntArrayArray960[i];
		    int[] is_58_ = anIntArrayArray961[i_55_];
		    int i_59_ = 0;
		    if (i_56_ != 0) {
			for (int i_60_ = 0; i_60_ < 4; i_60_++) {
			    arg0[arg1]
				= is[is_58_[i_59_++]] == 0 ? i_56_ : i_57_;
			    arg0[arg1 + 1]
				= is[is_58_[i_59_++]] == 0 ? i_56_ : i_57_;
			    arg0[arg1 + 2]
				= is[is_58_[i_59_++]] == 0 ? i_56_ : i_57_;
			    arg0[arg1 + 3]
				= is[is_58_[i_59_++]] == 0 ? i_56_ : i_57_;
			    arg1 += arg2;
			}
		    } else {
			for (int i_61_ = 0; i_61_ < 4; i_61_++) {
			    if (is[is_58_[i_59_++]] != 0)
				arg0[arg1] = i_57_;
			    if (is[is_58_[i_59_++]] != 0)
				arg0[arg1 + 1] = i_57_;
			    if (is[is_58_[i_59_++]] != 0)
				arg0[arg1 + 2] = i_57_;
			    if (is[is_58_[i_59_++]] != 0)
				arg0[arg1 + 3] = i_57_;
			    arg1 += arg2;
			}
		    }
		}
	    }
	}
    }
    
    public static void method816(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	Class48 class48 = new Class48();
	class48.anInt888 = arg2 / 128;
	class48.anInt891 = arg3 / 128;
	class48.anInt887 = arg4 / 128;
	class48.anInt890 = arg5 / 128;
	class48.anInt917 = arg1;
	class48.anInt893 = arg2;
	class48.anInt908 = arg3;
	class48.anInt895 = arg4;
	class48.anInt915 = arg5;
	class48.anInt918 = arg6;
	class48.anInt911 = arg7;
	aClass48ArrayArray958[arg0][anIntArray947[arg0]++] = class48;
    }
    
    public void method817(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt945; i++) {
	    for (int i_62_ = 0; i_62_ < anInt940; i_62_++) {
		for (int i_63_ = 0; i_63_ < anInt931; i_63_++) {
		    Class11_Sub12 class11_sub12
			= aClass11_Sub12ArrayArrayArray933[i][i_62_][i_63_];
		    if (class11_sub12 != null) {
			Class54 class54 = class11_sub12.aClass54_1725;
			if (class54 != null
			    && (class54.aClass11_Sub10_Sub4_1062
				instanceof Class11_Sub10_Sub4_Sub4)) {
			    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
				= ((Class11_Sub10_Sub4_Sub4)
				   class54.aClass11_Sub10_Sub4_1062);
			    if (class11_sub10_sub4_sub4.aClass62Array2606
				!= null) {
				method825(class11_sub10_sub4_sub4, i, i_62_,
					  i_63_, 1, 1);
				if (class54.aClass11_Sub10_Sub4_1079
				    instanceof Class11_Sub10_Sub4_Sub4) {
				    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_64_
					= ((Class11_Sub10_Sub4_Sub4)
					   class54.aClass11_Sub10_Sub4_1079);
				    if ((class11_sub10_sub4_sub4_64_
					 .aClass62Array2606)
					!= null) {
					method825(class11_sub10_sub4_sub4_64_,
						  i, i_62_, i_63_, 1, 1);
					method839(class11_sub10_sub4_sub4,
						  class11_sub10_sub4_sub4_64_,
						  0, 0, 0, false);
					class11_sub10_sub4_sub4_64_
					    .method317(arg0, arg1, arg2);
				    }
				}
				class11_sub10_sub4_sub4.method317(arg0, arg1,
								  arg2);
			    }
			}
			for (int i_65_ = 0; i_65_ < class11_sub12.anInt1718;
			     i_65_++) {
			    Class28 class28
				= class11_sub12.aClass28Array1726[i_65_];
			    if (class28 != null
				&& (class28.aClass11_Sub10_Sub4_528
				    instanceof Class11_Sub10_Sub4_Sub4)) {
				Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
				    = ((Class11_Sub10_Sub4_Sub4)
				       class28.aClass11_Sub10_Sub4_528);
				if (class11_sub10_sub4_sub4.aClass62Array2606
				    != null) {
				    method825(class11_sub10_sub4_sub4, i,
					      i_62_, i_63_,
					      (class28.anInt504
					       - class28.anInt515 + 1),
					      (class28.anInt526
					       - class28.anInt522 + 1));
				    class11_sub10_sub4_sub4
					.method317(arg0, arg1, arg2);
				}
			    }
			}
			Class23 class23 = class11_sub12.aClass23_1727;
			if (class23 != null
			    && (class23.aClass11_Sub10_Sub4_420
				instanceof Class11_Sub10_Sub4_Sub4)) {
			    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
				= ((Class11_Sub10_Sub4_Sub4)
				   class23.aClass11_Sub10_Sub4_420);
			    if (class11_sub10_sub4_sub4.aClass62Array2606
				!= null) {
				method791(class11_sub10_sub4_sub4, i, i_62_,
					  i_63_);
				class11_sub10_sub4_sub4.method317(arg0, arg1,
								  arg2);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public boolean method818(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt959; i++) {
	    Class48 class48 = aClass48Array927[i];
	    if (class48.anInt894 == 1) {
		int i_66_ = class48.anInt893 - arg0;
		if (i_66_ > 0) {
		    int i_67_
			= class48.anInt895 + (class48.anInt886 * i_66_ >> 8);
		    int i_68_
			= class48.anInt915 + (class48.anInt904 * i_66_ >> 8);
		    int i_69_
			= class48.anInt918 + (class48.anInt902 * i_66_ >> 8);
		    int i_70_
			= class48.anInt911 + (class48.anInt900 * i_66_ >> 8);
		    if (arg2 >= i_67_ && arg2 <= i_68_ && arg1 >= i_69_
			&& arg1 <= i_70_)
			return true;
		}
	    } else if (class48.anInt894 == 2) {
		int i_71_ = arg0 - class48.anInt893;
		if (i_71_ > 0) {
		    int i_72_
			= class48.anInt895 + (class48.anInt886 * i_71_ >> 8);
		    int i_73_
			= class48.anInt915 + (class48.anInt904 * i_71_ >> 8);
		    int i_74_
			= class48.anInt918 + (class48.anInt902 * i_71_ >> 8);
		    int i_75_
			= class48.anInt911 + (class48.anInt900 * i_71_ >> 8);
		    if (arg2 >= i_72_ && arg2 <= i_73_ && arg1 >= i_74_
			&& arg1 <= i_75_)
			return true;
		}
	    } else if (class48.anInt894 == 3) {
		int i_76_ = class48.anInt895 - arg2;
		if (i_76_ > 0) {
		    int i_77_
			= class48.anInt893 + (class48.anInt909 * i_76_ >> 8);
		    int i_78_
			= class48.anInt908 + (class48.anInt913 * i_76_ >> 8);
		    int i_79_
			= class48.anInt918 + (class48.anInt902 * i_76_ >> 8);
		    int i_80_
			= class48.anInt911 + (class48.anInt900 * i_76_ >> 8);
		    if (arg0 >= i_77_ && arg0 <= i_78_ && arg1 >= i_79_
			&& arg1 <= i_80_)
			return true;
		}
	    } else if (class48.anInt894 == 4) {
		int i_81_ = arg2 - class48.anInt895;
		if (i_81_ > 0) {
		    int i_82_
			= class48.anInt893 + (class48.anInt909 * i_81_ >> 8);
		    int i_83_
			= class48.anInt908 + (class48.anInt913 * i_81_ >> 8);
		    int i_84_
			= class48.anInt918 + (class48.anInt902 * i_81_ >> 8);
		    int i_85_
			= class48.anInt911 + (class48.anInt900 * i_81_ >> 8);
		    if (arg0 >= i_82_ && arg0 <= i_83_ && arg1 >= i_84_
			&& arg1 <= i_85_)
			return true;
		}
	    } else if (class48.anInt894 == 5) {
		int i_86_ = arg1 - class48.anInt918;
		if (i_86_ > 0) {
		    int i_87_
			= class48.anInt893 + (class48.anInt909 * i_86_ >> 8);
		    int i_88_
			= class48.anInt908 + (class48.anInt913 * i_86_ >> 8);
		    int i_89_
			= class48.anInt895 + (class48.anInt886 * i_86_ >> 8);
		    int i_90_
			= class48.anInt915 + (class48.anInt904 * i_86_ >> 8);
		    if (arg0 >= i_87_ && arg0 <= i_88_ && arg2 >= i_89_
			&& arg2 <= i_90_)
			return true;
		}
	    }
	}
	return false;
    }
    
    public Class28 method819(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null)
	    return null;
	for (int i = 0; i < class11_sub12.anInt1718; i++) {
	    Class28 class28 = class11_sub12.aClass28Array1726[i];
	    if ((class28.anInt500 >> 29 & 0x3) == 2 && class28.anInt515 == arg1
		&& class28.anInt522 == arg2)
		return class28;
	}
	return null;
    }
    
    public void method820(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null)
	    class11_sub12.aClass44_1712 = null;
    }
    
    public void method821(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8, int arg9,
			  int arg10, int arg11, int arg12, int arg13,
			  int arg14, int arg15, int arg16, int arg17,
			  int arg18, int arg19) {
	if (arg3 == 0) {
	    Class43 class43
		= new Class43(arg10, arg11, arg12, arg13, -1, arg18, false);
	    for (int i = arg0; i >= 0; i--) {
		if (aClass11_Sub12ArrayArrayArray933[i][arg1][arg2] == null)
		    aClass11_Sub12ArrayArrayArray933[i][arg1][arg2]
			= new Class11_Sub12(i, arg1, arg2);
	    }
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass43_1723
		= class43;
	} else if (arg3 == 1) {
	    Class43 class43
		= new Class43(arg14, arg15, arg16, arg17, arg5, arg19,
			      arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
	    for (int i = arg0; i >= 0; i--) {
		if (aClass11_Sub12ArrayArrayArray933[i][arg1][arg2] == null)
		    aClass11_Sub12ArrayArrayArray933[i][arg1][arg2]
			= new Class11_Sub12(i, arg1, arg2);
	    }
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass43_1723
		= class43;
	} else {
	    Class30 class30
		= new Class30(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8,
			      arg9, arg10, arg11, arg12, arg13, arg14, arg15,
			      arg16, arg17, arg18, arg19);
	    for (int i = arg0; i >= 0; i--) {
		if (aClass11_Sub12ArrayArrayArray933[i][arg1][arg2] == null)
		    aClass11_Sub12ArrayArrayArray933[i][arg1][arg2]
			= new Class11_Sub12(i, arg1, arg2);
	    }
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass30_1709
		= class30;
	}
    }
    
    public void method822(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 != null)
	    class11_sub12.aClass54_1725 = null;
    }
    
    public void method823(int arg0, int arg1, int arg2, int arg3,
			  Class11_Sub10_Sub4 arg4, Class11_Sub10_Sub4 arg5,
			  int arg6, int arg7, int arg8, int arg9) {
	if (arg4 != null || arg5 != null) {
	    Class54 class54 = new Class54();
	    class54.anInt1078 = arg8;
	    class54.anInt1073 = arg9;
	    class54.anInt1067 = arg1 * 128 + 64;
	    class54.anInt1068 = arg2 * 128 + 64;
	    class54.anInt1064 = arg3;
	    class54.aClass11_Sub10_Sub4_1062 = arg4;
	    class54.aClass11_Sub10_Sub4_1079 = arg5;
	    class54.anInt1058 = arg6;
	    class54.anInt1072 = arg7;
	    for (int i = arg0; i >= 0; i--) {
		if (aClass11_Sub12ArrayArrayArray933[i][arg1][arg2] == null)
		    aClass11_Sub12ArrayArrayArray933[i][arg1][arg2]
			= new Class11_Sub12(i, arg1, arg2);
	    }
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass54_1725
		= class54;
	}
    }
    
    public Class23 method824(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null || class11_sub12.aClass23_1727 == null)
	    return null;
	return class11_sub12.aClass23_1727;
    }
    
    public void method825(Class11_Sub10_Sub4_Sub4 arg0, int arg1, int arg2,
			  int arg3, int arg4, int arg5) {
	boolean bool = true;
	int i = arg2;
	int i_91_ = arg2 + arg4;
	int i_92_ = arg3 - 1;
	int i_93_ = arg3 + arg5;
	for (int i_94_ = arg1; i_94_ <= arg1 + 1; i_94_++) {
	    if (i_94_ != anInt945) {
		for (int i_95_ = i; i_95_ <= i_91_; i_95_++) {
		    if (i_95_ >= 0 && i_95_ < anInt940) {
			for (int i_96_ = i_92_; i_96_ <= i_93_; i_96_++) {
			    if (i_96_ >= 0 && i_96_ < anInt931
				&& (!bool || i_95_ >= i_91_ || i_96_ >= i_93_
				    || i_96_ < arg3 && i_95_ != arg2)) {
				Class11_Sub12 class11_sub12
				    = (aClass11_Sub12ArrayArrayArray933[i_94_]
				       [i_95_][i_96_]);
				if (class11_sub12 != null) {
				    int i_97_
					= (((anIntArrayArrayArray938[i_94_]
					     [i_95_][i_96_])
					    + (anIntArrayArrayArray938[i_94_]
					       [i_95_ + 1][i_96_])
					    + (anIntArrayArrayArray938[i_94_]
					       [i_95_][i_96_ + 1])
					    + (anIntArrayArrayArray938[i_94_]
					       [i_95_ + 1][i_96_ + 1])) / 4
					   - ((anIntArrayArrayArray938[arg1]
					       [arg2][arg3])
					      + (anIntArrayArrayArray938[arg1]
						 [arg2 + 1][arg3])
					      + (anIntArrayArrayArray938[arg1]
						 [arg2][arg3 + 1])
					      + (anIntArrayArrayArray938[arg1]
						 [arg2 + 1][arg3 + 1])) / 4);
				    Class54 class54
					= class11_sub12.aClass54_1725;
				    if (class54 != null) {
					if (class54.aClass11_Sub10_Sub4_1062
					    instanceof Class11_Sub10_Sub4_Sub4) {
					    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
						= ((Class11_Sub10_Sub4_Sub4)
						   (class54
						    .aClass11_Sub10_Sub4_1062));
					    if ((class11_sub10_sub4_sub4
						 .aClass62Array2606)
						!= null)
						method839
						    (arg0,
						     class11_sub10_sub4_sub4,
						     ((i_95_ - arg2) * 128
						      + (1 - arg4) * 64),
						     i_97_,
						     ((i_96_ - arg3) * 128
						      + (1 - arg5) * 64),
						     bool);
					}
					if (class54.aClass11_Sub10_Sub4_1079
					    instanceof Class11_Sub10_Sub4_Sub4) {
					    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
						= ((Class11_Sub10_Sub4_Sub4)
						   (class54
						    .aClass11_Sub10_Sub4_1079));
					    if ((class11_sub10_sub4_sub4
						 .aClass62Array2606)
						!= null)
						method839
						    (arg0,
						     class11_sub10_sub4_sub4,
						     ((i_95_ - arg2) * 128
						      + (1 - arg4) * 64),
						     i_97_,
						     ((i_96_ - arg3) * 128
						      + (1 - arg5) * 64),
						     bool);
					}
				    }
				    for (int i_98_ = 0;
					 i_98_ < class11_sub12.anInt1718;
					 i_98_++) {
					Class28 class28
					    = (class11_sub12.aClass28Array1726
					       [i_98_]);
					if (class28 != null
					    && (class28.aClass11_Sub10_Sub4_528
						instanceof Class11_Sub10_Sub4_Sub4)) {
					    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
						= ((Class11_Sub10_Sub4_Sub4)
						   (class28
						    .aClass11_Sub10_Sub4_528));
					    if ((class11_sub10_sub4_sub4
						 .aClass62Array2606)
						!= null) {
						int i_99_
						    = (class28.anInt504
						       - class28.anInt515 + 1);
						int i_100_
						    = (class28.anInt526
						       - class28.anInt522 + 1);
						method839
						    (arg0,
						     class11_sub10_sub4_sub4,
						     ((class28.anInt515
						       - arg2) * 128
						      + (i_99_ - arg4) * 64),
						     i_97_,
						     ((class28.anInt522
						       - arg3) * 128
						      + (i_100_ - arg5) * 64),
						     bool);
					    }
					}
				    }
				}
			    }
			}
		    }
		}
		i--;
		bool = false;
	    }
	}
    }
    
    public boolean method826(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7,
			     Class11_Sub10_Sub4 arg8, int arg9, boolean arg10,
			     int arg11, int arg12) {
	for (int i = arg1; i < arg1 + arg3; i++) {
	    for (int i_101_ = arg2; i_101_ < arg2 + arg4; i_101_++) {
		if (i < 0 || i_101_ < 0 || i >= anInt940 || i_101_ >= anInt931)
		    return false;
		Class11_Sub12 class11_sub12
		    = aClass11_Sub12ArrayArrayArray933[arg0][i][i_101_];
		if (class11_sub12 != null && class11_sub12.anInt1718 >= 5)
		    return false;
	    }
	}
	Class28 class28 = new Class28();
	class28.anInt500 = arg11;
	class28.anInt513 = arg12;
	class28.anInt510 = arg0;
	class28.anInt507 = arg5;
	class28.anInt517 = arg6;
	class28.anInt516 = arg7;
	class28.aClass11_Sub10_Sub4_528 = arg8;
	class28.anInt527 = arg9;
	class28.anInt515 = arg1;
	class28.anInt522 = arg2;
	class28.anInt504 = arg1 + arg3 - 1;
	class28.anInt526 = arg2 + arg4 - 1;
	for (int i = arg1; i < arg1 + arg3; i++) {
	    for (int i_102_ = arg2; i_102_ < arg2 + arg4; i_102_++) {
		int i_103_ = 0;
		if (i > arg1)
		    i_103_++;
		if (i < arg1 + arg3 - 1)
		    i_103_ += 4;
		if (i_102_ > arg2)
		    i_103_ += 8;
		if (i_102_ < arg2 + arg4 - 1)
		    i_103_ += 2;
		for (int i_104_ = arg0; i_104_ >= 0; i_104_--) {
		    if (aClass11_Sub12ArrayArrayArray933[i_104_][i][i_102_]
			== null)
			aClass11_Sub12ArrayArrayArray933[i_104_][i][i_102_]
			    = new Class11_Sub12(i_104_, i, i_102_);
		}
		Class11_Sub12 class11_sub12
		    = aClass11_Sub12ArrayArrayArray933[arg0][i][i_102_];
		class11_sub12.aClass28Array1726[class11_sub12.anInt1718]
		    = class28;
		class11_sub12.anIntArray1719[class11_sub12.anInt1718] = i_103_;
		class11_sub12.anInt1710 |= i_103_;
		class11_sub12.anInt1718++;
	    }
	}
	if (arg10)
	    aClass28Array937[anInt946++] = class28;
	return true;
    }
    
    public boolean method827(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
	int i_105_
	    = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
	int i_106_
	    = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
	if (i * i_106_ > 0 && i_106_ * i_105_ > 0)
	    return true;
	return false;
    }
    
    public boolean method828(int arg0, int arg1, int arg2, int arg3) {
	if (!method809(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_107_ = arg2 << 7;
	int i_108_ = anIntArrayArrayArray938[arg0][arg1][arg2] - 1;
	int i_109_ = i_108_ - 120;
	int i_110_ = i_108_ - 230;
	int i_111_ = i_108_ - 238;
	if (arg3 < 16) {
	    if (arg3 == 1) {
		if (i > anInt919) {
		    if (!method818(i, i_108_, i_107_))
			return false;
		    if (!method818(i, i_108_, i_107_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!method818(i, i_109_, i_107_))
			return false;
		    if (!method818(i, i_109_, i_107_ + 128))
			return false;
		}
		if (!method818(i, i_110_, i_107_))
		    return false;
		if (!method818(i, i_110_, i_107_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 2) {
		if (i_107_ < anInt950) {
		    if (!method818(i, i_108_, i_107_ + 128))
			return false;
		    if (!method818(i + 128, i_108_, i_107_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!method818(i, i_109_, i_107_ + 128))
			return false;
		    if (!method818(i + 128, i_109_, i_107_ + 128))
			return false;
		}
		if (!method818(i, i_110_, i_107_ + 128))
		    return false;
		if (!method818(i + 128, i_110_, i_107_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 4) {
		if (i < anInt919) {
		    if (!method818(i + 128, i_108_, i_107_))
			return false;
		    if (!method818(i + 128, i_108_, i_107_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!method818(i + 128, i_109_, i_107_))
			return false;
		    if (!method818(i + 128, i_109_, i_107_ + 128))
			return false;
		}
		if (!method818(i + 128, i_110_, i_107_))
		    return false;
		if (!method818(i + 128, i_110_, i_107_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 8) {
		if (i_107_ > anInt950) {
		    if (!method818(i, i_108_, i_107_))
			return false;
		    if (!method818(i + 128, i_108_, i_107_))
			return false;
		}
		if (arg0 > 0) {
		    if (!method818(i, i_109_, i_107_))
			return false;
		    if (!method818(i + 128, i_109_, i_107_))
			return false;
		}
		if (!method818(i, i_110_, i_107_))
		    return false;
		if (!method818(i + 128, i_110_, i_107_))
		    return false;
		return true;
	    }
	}
	if (!method818(i + 64, i_111_, i_107_ + 64))
	    return false;
	if (arg3 == 16) {
	    if (!method818(i, i_110_, i_107_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 32) {
	    if (!method818(i + 128, i_110_, i_107_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 64) {
	    if (!method818(i + 128, i_110_, i_107_))
		return false;
	    return true;
	}
	if (arg3 == 128) {
	    if (!method818(i, i_110_, i_107_))
		return false;
	    return true;
	}
	return true;
    }
    
    public void method829(int arg0, int arg1, int arg2, int arg3,
			  Class11_Sub10_Sub4 arg4, int arg5, int arg6,
			  int arg7, int arg8, int arg9, int arg10) {
	if (arg4 != null) {
	    Class1 class1 = new Class1();
	    class1.anInt96 = arg9;
	    class1.anInt74 = arg10;
	    class1.anInt79 = arg1 * 128 + 64 + arg7;
	    class1.anInt84 = arg2 * 128 + 64 + arg8;
	    class1.anInt75 = arg3;
	    class1.aClass11_Sub10_Sub4_80 = arg4;
	    class1.anInt77 = arg5;
	    class1.anInt73 = arg6;
	    for (int i = arg0; i >= 0; i--) {
		if (aClass11_Sub12ArrayArrayArray933[i][arg1][arg2] == null)
		    aClass11_Sub12ArrayArrayArray933[i][arg1][arg2]
			= new Class11_Sub12(i, arg1, arg2);
	    }
	    aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2].aClass1_1717
		= class1;
	}
    }
    
    public boolean method830(int arg0, int arg1, int arg2, int arg3) {
	if (!method809(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_112_ = arg2 << 7;
	if (method818(i + 1, anIntArrayArrayArray938[arg0][arg1][arg2] - arg3,
		      i_112_ + 1)
	    && method818(i + 128 - 1,
			 anIntArrayArrayArray938[arg0][arg1 + 1][arg2] - arg3,
			 i_112_ + 1)
	    && method818(i + 128 - 1,
			 (anIntArrayArrayArray938[arg0][arg1 + 1][arg2 + 1]
			  - arg3),
			 i_112_ + 128 - 1)
	    && method818(i + 1,
			 anIntArrayArrayArray938[arg0][arg1][arg2 + 1] - arg3,
			 i_112_ + 128 - 1))
	    return true;
	return false;
    }
    
    public void method831(Class30 arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	int i = arg0.anIntArray552.length;
	for (int i_113_ = 0; i_113_ < i; i_113_++) {
	    int i_114_ = arg0.anIntArray552[i_113_] - anInt919;
	    int i_115_ = arg0.anIntArray568[i_113_] - anInt954;
	    int i_116_ = arg0.anIntArray559[i_113_] - anInt950;
	    int i_117_ = i_116_ * arg3 + i_114_ * arg4 >> 16;
	    i_116_ = i_116_ * arg4 - i_114_ * arg3 >> 16;
	    i_114_ = i_117_;
	    i_117_ = i_115_ * arg2 - i_116_ * arg1 >> 16;
	    i_116_ = i_115_ * arg1 + i_116_ * arg2 >> 16;
	    i_115_ = i_117_;
	    if (i_116_ < 50)
		return;
	    if (arg0.anIntArray558 != null) {
		Class30.anIntArray570[i_113_] = i_114_;
		Class30.anIntArray565[i_113_] = i_115_;
		Class30.anIntArray560[i_113_] = i_116_;
	    }
	    Class30.anIntArray549[i_113_]
		= Class11_Sub10_Sub13_Sub1.anInt2730 + (i_114_ << 9) / i_116_;
	    Class30.anIntArray556[i_113_]
		= Class11_Sub10_Sub13_Sub1.anInt2729 + (i_115_ << 9) / i_116_;
	}
	Class11_Sub10_Sub13_Sub1.anInt2734 = 0;
	i = arg0.anIntArray553.length;
	for (int i_118_ = 0; i_118_ < i; i_118_++) {
	    int i_119_ = arg0.anIntArray553[i_118_];
	    int i_120_ = arg0.anIntArray554[i_118_];
	    int i_121_ = arg0.anIntArray561[i_118_];
	    int i_122_ = Class30.anIntArray549[i_119_];
	    int i_123_ = Class30.anIntArray549[i_120_];
	    int i_124_ = Class30.anIntArray549[i_121_];
	    int i_125_ = Class30.anIntArray556[i_119_];
	    int i_126_ = Class30.anIntArray556[i_120_];
	    int i_127_ = Class30.anIntArray556[i_121_];
	    if (((i_122_ - i_123_) * (i_127_ - i_126_)
		 - (i_125_ - i_126_) * (i_124_ - i_123_))
		> 0) {
		Class11_Sub10_Sub13_Sub1.aBoolean2732 = false;
		if (i_122_ < 0 || i_123_ < 0 || i_124_ < 0
		    || i_122_ > Class11_Sub10_Sub13_Sub1.anInt2723
		    || i_123_ > Class11_Sub10_Sub13_Sub1.anInt2723
		    || i_124_ > Class11_Sub10_Sub13_Sub1.anInt2723)
		    Class11_Sub10_Sub13_Sub1.aBoolean2732 = true;
		if (aBoolean926
		    && method827(anInt920, anInt951, i_125_, i_126_, i_127_,
				 i_122_, i_123_, i_124_)) {
		    anInt935 = arg5;
		    anInt928 = arg6;
		}
		if (arg0.anIntArray558 == null
		    || arg0.anIntArray558[i_118_] == -1) {
		    if (arg0.anIntArray550[i_118_] != 12345678)
			Class11_Sub10_Sub13_Sub1.method414
			    (i_125_, i_126_, i_127_, i_122_, i_123_, i_124_,
			     arg0.anIntArray550[i_118_],
			     arg0.anIntArray569[i_118_],
			     arg0.anIntArray564[i_118_]);
		} else if (!aBoolean930) {
		    if (arg0.aBoolean557)
			Class11_Sub10_Sub13_Sub1.method418
			    (i_125_, i_126_, i_127_, i_122_, i_123_, i_124_,
			     arg0.anIntArray550[i_118_],
			     arg0.anIntArray569[i_118_],
			     arg0.anIntArray564[i_118_],
			     Class30.anIntArray570[0],
			     Class30.anIntArray570[1],
			     Class30.anIntArray570[3],
			     Class30.anIntArray565[0],
			     Class30.anIntArray565[1],
			     Class30.anIntArray565[3],
			     Class30.anIntArray560[0],
			     Class30.anIntArray560[1],
			     Class30.anIntArray560[3],
			     arg0.anIntArray558[i_118_]);
		    else
			Class11_Sub10_Sub13_Sub1.method418
			    (i_125_, i_126_, i_127_, i_122_, i_123_, i_124_,
			     arg0.anIntArray550[i_118_],
			     arg0.anIntArray569[i_118_],
			     arg0.anIntArray564[i_118_],
			     Class30.anIntArray570[i_119_],
			     Class30.anIntArray570[i_120_],
			     Class30.anIntArray570[i_121_],
			     Class30.anIntArray565[i_119_],
			     Class30.anIntArray565[i_120_],
			     Class30.anIntArray565[i_121_],
			     Class30.anIntArray560[i_119_],
			     Class30.anIntArray560[i_120_],
			     Class30.anIntArray560[i_121_],
			     arg0.anIntArray558[i_118_]);
		} else {
		    int i_128_
			= Class11_Sub10_Sub13_Sub1.anInterface3_2727
			      .method8(true, arg0.anIntArray558[i_118_]);
		    Class11_Sub10_Sub13_Sub1.method414
			(i_125_, i_126_, i_127_, i_122_, i_123_, i_124_,
			 method803(i_128_, arg0.anIntArray550[i_118_]),
			 method803(i_128_, arg0.anIntArray569[i_118_]),
			 method803(i_128_, arg0.anIntArray564[i_118_]));
		}
	    }
	}
    }
    
    public int method832(int arg0, int arg1, int arg2, int arg3) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null)
	    return -1;
	if (class11_sub12.aClass54_1725 != null
	    && class11_sub12.aClass54_1725.anInt1078 == arg3)
	    return class11_sub12.aClass54_1725.anInt1073 & 0xff;
	if (class11_sub12.aClass1_1717 != null
	    && class11_sub12.aClass1_1717.anInt96 == arg3)
	    return class11_sub12.aClass1_1717.anInt74 & 0xff;
	if (class11_sub12.aClass23_1727 != null
	    && class11_sub12.aClass23_1727.anInt423 == arg3)
	    return class11_sub12.aClass23_1727.anInt415 & 0xff;
	for (int i = 0; i < class11_sub12.anInt1718; i++) {
	    if (class11_sub12.aClass28Array1726[i].anInt500 == arg3)
		return class11_sub12.aClass28Array1726[i].anInt513 & 0xff;
	}
	return -1;
    }
    
    public void method833(int arg0, int arg1) {
	aBoolean926 = true;
	anInt920 = arg0;
	anInt951 = arg1;
	anInt935 = -1;
	anInt928 = -1;
    }
    
    public void method834(Class11_Sub12 arg0, boolean arg1) {
	aClass36_932.method691((byte) -98, arg0);
	for (;;) {
	    Class11_Sub12 class11_sub12
		= (Class11_Sub12) aClass36_932.method690(-20575);
	    if (class11_sub12 == null)
		break;
	    if (class11_sub12.aBoolean1715) {
		int i = class11_sub12.anInt1713;
		int i_129_ = class11_sub12.anInt1728;
		int i_130_ = class11_sub12.anInt1722;
		int i_131_ = class11_sub12.anInt1720;
		Class11_Sub12[][] class11_sub12s
		    = aClass11_Sub12ArrayArrayArray933[i_130_];
		if (class11_sub12.aBoolean1714) {
		    if (arg1) {
			if (i_130_ > 0) {
			    Class11_Sub12 class11_sub12_132_
				= (aClass11_Sub12ArrayArrayArray933[i_130_ - 1]
				   [i][i_129_]);
			    if (class11_sub12_132_ != null
				&& class11_sub12_132_.aBoolean1715)
				continue;
			}
			if (i <= anInt939 && i > anInt957) {
			    Class11_Sub12 class11_sub12_133_
				= class11_sub12s[i - 1][i_129_];
			    if (class11_sub12_133_ != null
				&& class11_sub12_133_.aBoolean1715
				&& (class11_sub12_133_.aBoolean1714
				    || (class11_sub12.anInt1710 & 0x1) == 0))
				continue;
			}
			if (i >= anInt939 && i < anInt948 - 1) {
			    Class11_Sub12 class11_sub12_134_
				= class11_sub12s[i + 1][i_129_];
			    if (class11_sub12_134_ != null
				&& class11_sub12_134_.aBoolean1715
				&& (class11_sub12_134_.aBoolean1714
				    || (class11_sub12.anInt1710 & 0x4) == 0))
				continue;
			}
			if (i_129_ <= anInt922 && i_129_ > anInt949) {
			    Class11_Sub12 class11_sub12_135_
				= class11_sub12s[i][i_129_ - 1];
			    if (class11_sub12_135_ != null
				&& class11_sub12_135_.aBoolean1715
				&& (class11_sub12_135_.aBoolean1714
				    || (class11_sub12.anInt1710 & 0x8) == 0))
				continue;
			}
			if (i_129_ >= anInt922 && i_129_ < anInt963 - 1) {
			    Class11_Sub12 class11_sub12_136_
				= class11_sub12s[i][i_129_ + 1];
			    if (class11_sub12_136_ != null
				&& class11_sub12_136_.aBoolean1715
				&& (class11_sub12_136_.aBoolean1714
				    || (class11_sub12.anInt1710 & 0x2) == 0))
				continue;
			}
		    } else
			arg1 = true;
		    class11_sub12.aBoolean1714 = false;
		    if (class11_sub12.aClass11_Sub12_1708 != null) {
			Class11_Sub12 class11_sub12_137_
			    = class11_sub12.aClass11_Sub12_1708;
			if (class11_sub12_137_.aClass43_1723 != null) {
			    if (!method809(0, i, i_129_))
				method835(class11_sub12_137_.aClass43_1723, 0,
					  anInt955, anInt941, anInt934,
					  anInt936, i, i_129_);
			} else if (class11_sub12_137_.aClass30_1709 != null
				   && !method809(0, i, i_129_))
			    method831(class11_sub12_137_.aClass30_1709,
				      anInt955, anInt941, anInt934, anInt936,
				      i, i_129_);
			Class54 class54 = class11_sub12_137_.aClass54_1725;
			if (class54 != null)
			    class54.aClass11_Sub10_Sub4_1062.method258
				(0, anInt955, anInt941, anInt934, anInt936,
				 class54.anInt1067 - anInt919,
				 class54.anInt1064 - anInt954,
				 class54.anInt1068 - anInt950,
				 class54.anInt1078);
			for (int i_138_ = 0;
			     i_138_ < class11_sub12_137_.anInt1718; i_138_++) {
			    Class28 class28
				= class11_sub12_137_.aClass28Array1726[i_138_];
			    if (class28 != null)
				class28.aClass11_Sub10_Sub4_528.method258
				    (class28.anInt527, anInt955, anInt941,
				     anInt934, anInt936,
				     class28.anInt507 - anInt919,
				     class28.anInt516 - anInt954,
				     class28.anInt517 - anInt950,
				     class28.anInt500);
			}
		    }
		    boolean bool = false;
		    if (class11_sub12.aClass43_1723 != null) {
			if (!method809(i_131_, i, i_129_)) {
			    bool = true;
			    method835(class11_sub12.aClass43_1723, i_131_,
				      anInt955, anInt941, anInt934, anInt936,
				      i, i_129_);
			}
		    } else if (class11_sub12.aClass30_1709 != null
			       && !method809(i_131_, i, i_129_)) {
			bool = true;
			method831(class11_sub12.aClass30_1709, anInt955,
				  anInt941, anInt934, anInt936, i, i_129_);
		    }
		    int i_139_ = 0;
		    int i_140_ = 0;
		    Class54 class54 = class11_sub12.aClass54_1725;
		    Class1 class1 = class11_sub12.aClass1_1717;
		    if (class54 != null || class1 != null) {
			if (anInt939 == i)
			    i_139_++;
			else if (anInt939 < i)
			    i_139_ += 2;
			if (anInt922 == i_129_)
			    i_139_ += 3;
			else if (anInt922 > i_129_)
			    i_139_ += 6;
			i_140_ = anIntArray979[i_139_];
			class11_sub12.anInt1724 = anIntArray970[i_139_];
		    }
		    if (class54 != null) {
			if ((class54.anInt1058 & anIntArray968[i_139_]) != 0) {
			    if (class54.anInt1058 == 16) {
				class11_sub12.anInt1707 = 3;
				class11_sub12.anInt1721
				    = anIntArray976[i_139_];
				class11_sub12.anInt1716
				    = 3 - class11_sub12.anInt1721;
			    } else if (class54.anInt1058 == 32) {
				class11_sub12.anInt1707 = 6;
				class11_sub12.anInt1721
				    = anIntArray966[i_139_];
				class11_sub12.anInt1716
				    = 6 - class11_sub12.anInt1721;
			    } else if (class54.anInt1058 == 64) {
				class11_sub12.anInt1707 = 12;
				class11_sub12.anInt1721
				    = anIntArray977[i_139_];
				class11_sub12.anInt1716
				    = 12 - class11_sub12.anInt1721;
			    } else {
				class11_sub12.anInt1707 = 9;
				class11_sub12.anInt1721
				    = anIntArray974[i_139_];
				class11_sub12.anInt1716
				    = 9 - class11_sub12.anInt1721;
			    }
			} else
			    class11_sub12.anInt1707 = 0;
			if ((class54.anInt1058 & i_140_) != 0
			    && !method828(i_131_, i, i_129_,
					  class54.anInt1058))
			    class54.aClass11_Sub10_Sub4_1062.method258
				(0, anInt955, anInt941, anInt934, anInt936,
				 class54.anInt1067 - anInt919,
				 class54.anInt1064 - anInt954,
				 class54.anInt1068 - anInt950,
				 class54.anInt1078);
			if ((class54.anInt1072 & i_140_) != 0
			    && !method828(i_131_, i, i_129_,
					  class54.anInt1072))
			    class54.aClass11_Sub10_Sub4_1079.method258
				(0, anInt955, anInt941, anInt934, anInt936,
				 class54.anInt1067 - anInt919,
				 class54.anInt1064 - anInt954,
				 class54.anInt1068 - anInt950,
				 class54.anInt1078);
		    }
		    if (class1 != null
			&& !method830(i_131_, i, i_129_,
				      (class1.aClass11_Sub10_Sub4_80
				       .anInt2046))) {
			if ((class1.anInt77 & i_140_) != 0)
			    class1.aClass11_Sub10_Sub4_80.method258
				(class1.anInt73, anInt955, anInt941, anInt934,
				 anInt936, class1.anInt79 - anInt919,
				 class1.anInt75 - anInt954,
				 class1.anInt84 - anInt950, class1.anInt96);
			else if ((class1.anInt77 & 0x300) != 0) {
			    int i_141_ = class1.anInt79 - anInt919;
			    int i_142_ = class1.anInt75 - anInt954;
			    int i_143_ = class1.anInt84 - anInt950;
			    int i_144_ = class1.anInt73;
			    int i_145_;
			    if (i_144_ == 1 || i_144_ == 2)
				i_145_ = -i_141_;
			    else
				i_145_ = i_141_;
			    int i_146_;
			    if (i_144_ == 2 || i_144_ == 3)
				i_146_ = -i_143_;
			    else
				i_146_ = i_143_;
			    if ((class1.anInt77 & 0x100) != 0
				&& i_146_ < i_145_) {
				int i_147_ = i_141_ + anIntArray921[i_144_];
				int i_148_ = i_143_ + anIntArray942[i_144_];
				class1.aClass11_Sub10_Sub4_80.method258
				    (i_144_ * 512 + 256, anInt955, anInt941,
				     anInt934, anInt936, i_147_, i_142_,
				     i_148_, class1.anInt96);
			    }
			    if ((class1.anInt77 & 0x200) != 0
				&& i_146_ > i_145_) {
				int i_149_ = i_141_ + anIntArray924[i_144_];
				int i_150_ = i_143_ + anIntArray952[i_144_];
				class1.aClass11_Sub10_Sub4_80.method258
				    (i_144_ * 512 + 1280 & 0x7ff, anInt955,
				     anInt941, anInt934, anInt936, i_149_,
				     i_142_, i_150_, class1.anInt96);
			    }
			}
		    }
		    if (bool) {
			Class23 class23 = class11_sub12.aClass23_1727;
			if (class23 != null)
			    class23.aClass11_Sub10_Sub4_420.method258
				(0, anInt955, anInt941, anInt934, anInt936,
				 class23.anInt422 - anInt919,
				 class23.anInt413 - anInt954,
				 class23.anInt417 - anInt950,
				 class23.anInt423);
			Class44 class44 = class11_sub12.aClass44_1712;
			if (class44 != null && class44.anInt805 == 0) {
			    if (class44.aClass11_Sub10_Sub4_792 != null)
				class44.aClass11_Sub10_Sub4_792.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     class44.anInt793 - anInt954,
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			    if (class44.aClass11_Sub10_Sub4_803 != null)
				class44.aClass11_Sub10_Sub4_803.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     class44.anInt793 - anInt954,
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			    if (class44.aClass11_Sub10_Sub4_813 != null)
				class44.aClass11_Sub10_Sub4_813.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     class44.anInt793 - anInt954,
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			}
		    }
		    int i_151_ = class11_sub12.anInt1710;
		    if (i_151_ != 0) {
			if (i < anInt939 && (i_151_ & 0x4) != 0) {
			    Class11_Sub12 class11_sub12_152_
				= class11_sub12s[i + 1][i_129_];
			    if (class11_sub12_152_ != null
				&& class11_sub12_152_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_152_);
			}
			if (i_129_ < anInt922 && (i_151_ & 0x2) != 0) {
			    Class11_Sub12 class11_sub12_153_
				= class11_sub12s[i][i_129_ + 1];
			    if (class11_sub12_153_ != null
				&& class11_sub12_153_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_153_);
			}
			if (i > anInt939 && (i_151_ & 0x1) != 0) {
			    Class11_Sub12 class11_sub12_154_
				= class11_sub12s[i - 1][i_129_];
			    if (class11_sub12_154_ != null
				&& class11_sub12_154_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_154_);
			}
			if (i_129_ > anInt922 && (i_151_ & 0x8) != 0) {
			    Class11_Sub12 class11_sub12_155_
				= class11_sub12s[i][i_129_ - 1];
			    if (class11_sub12_155_ != null
				&& class11_sub12_155_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_155_);
			}
		    }
		}
		if (class11_sub12.anInt1707 != 0) {
		    boolean bool = true;
		    for (int i_156_ = 0; i_156_ < class11_sub12.anInt1718;
			 i_156_++) {
			if ((class11_sub12.aClass28Array1726[i_156_].anInt505
			     != anInt923)
			    && ((class11_sub12.anIntArray1719[i_156_]
				 & class11_sub12.anInt1707)
				== class11_sub12.anInt1721)) {
			    bool = false;
			    break;
			}
		    }
		    if (bool) {
			Class54 class54 = class11_sub12.aClass54_1725;
			if (!method828(i_131_, i, i_129_, class54.anInt1058))
			    class54.aClass11_Sub10_Sub4_1062.method258
				(0, anInt955, anInt941, anInt934, anInt936,
				 class54.anInt1067 - anInt919,
				 class54.anInt1064 - anInt954,
				 class54.anInt1068 - anInt950,
				 class54.anInt1078);
			class11_sub12.anInt1707 = 0;
		    }
		}
		if (class11_sub12.aBoolean1711) {
		    try {
			int i_157_ = class11_sub12.anInt1718;
			class11_sub12.aBoolean1711 = false;
			int i_158_ = 0;
		    while_5_:
			for (int i_159_ = 0; i_159_ < i_157_; i_159_++) {
			    Class28 class28
				= class11_sub12.aClass28Array1726[i_159_];
			    if (class28.anInt505 != anInt923) {
				for (int i_160_ = class28.anInt515;
				     i_160_ <= class28.anInt504; i_160_++) {
				    for (int i_161_ = class28.anInt522;
					 i_161_ <= class28.anInt526;
					 i_161_++) {
					Class11_Sub12 class11_sub12_162_
					    = class11_sub12s[i_160_][i_161_];
					if (class11_sub12_162_.aBoolean1714) {
					    class11_sub12.aBoolean1711 = true;
					    continue while_5_;
					}
					if (class11_sub12_162_.anInt1707
					    != 0) {
					    int i_163_ = 0;
					    if (i_160_ > class28.anInt515)
						i_163_++;
					    if (i_160_ < class28.anInt504)
						i_163_ += 4;
					    if (i_161_ > class28.anInt522)
						i_163_ += 8;
					    if (i_161_ < class28.anInt526)
						i_163_ += 2;
					    if ((i_163_ & (class11_sub12_162_
							   .anInt1707))
						== class11_sub12.anInt1716) {
						class11_sub12.aBoolean1711
						    = true;
						continue while_5_;
					    }
					}
				    }
				}
				aClass28Array943[i_158_++] = class28;
				int i_164_ = anInt939 - class28.anInt515;
				int i_165_ = class28.anInt504 - anInt939;
				if (i_165_ > i_164_)
				    i_164_ = i_165_;
				int i_166_ = anInt922 - class28.anInt522;
				int i_167_ = class28.anInt526 - anInt922;
				if (i_167_ > i_166_)
				    class28.anInt503 = i_164_ + i_167_;
				else
				    class28.anInt503 = i_164_ + i_166_;
			    }
			}
			while (i_158_ > 0) {
			    int i_168_ = -50;
			    int i_169_ = -1;
			    for (int i_170_ = 0; i_170_ < i_158_; i_170_++) {
				Class28 class28 = aClass28Array943[i_170_];
				if (class28.anInt505 != anInt923) {
				    if (class28.anInt503 > i_168_) {
					i_168_ = class28.anInt503;
					i_169_ = i_170_;
				    } else if (class28.anInt503 == i_168_) {
					int i_171_
					    = class28.anInt507 - anInt919;
					int i_172_
					    = class28.anInt517 - anInt950;
					int i_173_ = ((aClass28Array943[i_169_]
						       .anInt507)
						      - anInt919);
					int i_174_ = ((aClass28Array943[i_169_]
						       .anInt517)
						      - anInt950);
					if (i_171_ * i_171_ + i_172_ * i_172_
					    > (i_173_ * i_173_
					       + i_174_ * i_174_))
					    i_169_ = i_170_;
				    }
				}
			    }
			    if (i_169_ == -1)
				break;
			    Class28 class28 = aClass28Array943[i_169_];
			    class28.anInt505 = anInt923;
			    if (!method800(i_131_, class28.anInt515,
					   class28.anInt504, class28.anInt522,
					   class28.anInt526,
					   (class28.aClass11_Sub10_Sub4_528
					    .anInt2046)))
				class28.aClass11_Sub10_Sub4_528.method258
				    (class28.anInt527, anInt955, anInt941,
				     anInt934, anInt936,
				     class28.anInt507 - anInt919,
				     class28.anInt516 - anInt954,
				     class28.anInt517 - anInt950,
				     class28.anInt500);
			    for (int i_175_ = class28.anInt515;
				 i_175_ <= class28.anInt504; i_175_++) {
				for (int i_176_ = class28.anInt522;
				     i_176_ <= class28.anInt526; i_176_++) {
				    Class11_Sub12 class11_sub12_177_
					= class11_sub12s[i_175_][i_176_];
				    if (class11_sub12_177_.anInt1707 != 0)
					aClass36_932.method691
					    ((byte) -98, class11_sub12_177_);
				    else if ((i_175_ != i || i_176_ != i_129_)
					     && (class11_sub12_177_
						 .aBoolean1715))
					aClass36_932.method691
					    ((byte) -98, class11_sub12_177_);
				}
			    }
			}
			if (class11_sub12.aBoolean1711)
			    continue;
		    } catch (Exception exception) {
			class11_sub12.aBoolean1711 = false;
		    }
		}
		if (class11_sub12.aBoolean1715) {
		    if (class11_sub12.anInt1707 == 0) {
			if (i <= anInt939 && i > anInt957) {
			    Class11_Sub12 class11_sub12_178_
				= class11_sub12s[i - 1][i_129_];
			    if (class11_sub12_178_ != null
				&& class11_sub12_178_.aBoolean1715)
				continue;
			}
			if (i >= anInt939 && i < anInt948 - 1) {
			    Class11_Sub12 class11_sub12_179_
				= class11_sub12s[i + 1][i_129_];
			    if (class11_sub12_179_ != null
				&& class11_sub12_179_.aBoolean1715)
				continue;
			}
			if (i_129_ <= anInt922 && i_129_ > anInt949) {
			    Class11_Sub12 class11_sub12_180_
				= class11_sub12s[i][i_129_ - 1];
			    if (class11_sub12_180_ != null
				&& class11_sub12_180_.aBoolean1715)
				continue;
			}
			if (i_129_ >= anInt922 && i_129_ < anInt963 - 1) {
			    Class11_Sub12 class11_sub12_181_
				= class11_sub12s[i][i_129_ + 1];
			    if (class11_sub12_181_ != null
				&& class11_sub12_181_.aBoolean1715)
				continue;
			}
			class11_sub12.aBoolean1715 = false;
			anInt929--;
			Class44 class44 = class11_sub12.aClass44_1712;
			if (class44 != null && class44.anInt805 != 0) {
			    if (class44.aClass11_Sub10_Sub4_792 != null)
				class44.aClass11_Sub10_Sub4_792.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     (class44.anInt793 - anInt954
				      - class44.anInt805),
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			    if (class44.aClass11_Sub10_Sub4_803 != null)
				class44.aClass11_Sub10_Sub4_803.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     (class44.anInt793 - anInt954
				      - class44.anInt805),
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			    if (class44.aClass11_Sub10_Sub4_813 != null)
				class44.aClass11_Sub10_Sub4_813.method258
				    (0, anInt955, anInt941, anInt934, anInt936,
				     class44.anInt818 - anInt919,
				     (class44.anInt793 - anInt954
				      - class44.anInt805),
				     class44.anInt798 - anInt950,
				     class44.anInt810);
			}
			if (class11_sub12.anInt1724 != 0) {
			    Class1 class1 = class11_sub12.aClass1_1717;
			    if (class1 != null
				&& !method830(i_131_, i, i_129_,
					      (class1.aClass11_Sub10_Sub4_80
					       .anInt2046))) {
				if ((class1.anInt77 & class11_sub12.anInt1724)
				    != 0)
				    class1.aClass11_Sub10_Sub4_80.method258
					(class1.anInt73, anInt955, anInt941,
					 anInt934, anInt936,
					 class1.anInt79 - anInt919,
					 class1.anInt75 - anInt954,
					 class1.anInt84 - anInt950,
					 class1.anInt96);
				else if ((class1.anInt77 & 0x300) != 0) {
				    int i_182_ = class1.anInt79 - anInt919;
				    int i_183_ = class1.anInt75 - anInt954;
				    int i_184_ = class1.anInt84 - anInt950;
				    int i_185_ = class1.anInt73;
				    int i_186_;
				    if (i_185_ == 1 || i_185_ == 2)
					i_186_ = -i_182_;
				    else
					i_186_ = i_182_;
				    int i_187_;
				    if (i_185_ == 2 || i_185_ == 3)
					i_187_ = -i_184_;
				    else
					i_187_ = i_184_;
				    if ((class1.anInt77 & 0x100) != 0
					&& i_187_ >= i_186_) {
					int i_188_
					    = i_182_ + anIntArray921[i_185_];
					int i_189_
					    = i_184_ + anIntArray942[i_185_];
					class1.aClass11_Sub10_Sub4_80.method258
					    (i_185_ * 512 + 256, anInt955,
					     anInt941, anInt934, anInt936,
					     i_188_, i_183_, i_189_,
					     class1.anInt96);
				    }
				    if ((class1.anInt77 & 0x200) != 0
					&& i_187_ <= i_186_) {
					int i_190_
					    = i_182_ + anIntArray924[i_185_];
					int i_191_
					    = i_184_ + anIntArray952[i_185_];
					class1.aClass11_Sub10_Sub4_80.method258
					    (i_185_ * 512 + 1280 & 0x7ff,
					     anInt955, anInt941, anInt934,
					     anInt936, i_190_, i_183_, i_191_,
					     class1.anInt96);
				    }
				}
			    }
			    Class54 class54 = class11_sub12.aClass54_1725;
			    if (class54 != null) {
				if ((class54.anInt1072
				     & class11_sub12.anInt1724) != 0
				    && !method828(i_131_, i, i_129_,
						  class54.anInt1072))
				    class54.aClass11_Sub10_Sub4_1079.method258
					(0, anInt955, anInt941, anInt934,
					 anInt936,
					 class54.anInt1067 - anInt919,
					 class54.anInt1064 - anInt954,
					 class54.anInt1068 - anInt950,
					 class54.anInt1078);
				if ((class54.anInt1058
				     & class11_sub12.anInt1724) != 0
				    && !method828(i_131_, i, i_129_,
						  class54.anInt1058))
				    class54.aClass11_Sub10_Sub4_1062.method258
					(0, anInt955, anInt941, anInt934,
					 anInt936,
					 class54.anInt1067 - anInt919,
					 class54.anInt1064 - anInt954,
					 class54.anInt1068 - anInt950,
					 class54.anInt1078);
			    }
			}
			if (i_130_ < anInt945 - 1) {
			    Class11_Sub12 class11_sub12_192_
				= (aClass11_Sub12ArrayArrayArray933[i_130_ + 1]
				   [i][i_129_]);
			    if (class11_sub12_192_ != null
				&& class11_sub12_192_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_192_);
			}
			if (i < anInt939) {
			    Class11_Sub12 class11_sub12_193_
				= class11_sub12s[i + 1][i_129_];
			    if (class11_sub12_193_ != null
				&& class11_sub12_193_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_193_);
			}
			if (i_129_ < anInt922) {
			    Class11_Sub12 class11_sub12_194_
				= class11_sub12s[i][i_129_ + 1];
			    if (class11_sub12_194_ != null
				&& class11_sub12_194_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_194_);
			}
			if (i > anInt939) {
			    Class11_Sub12 class11_sub12_195_
				= class11_sub12s[i - 1][i_129_];
			    if (class11_sub12_195_ != null
				&& class11_sub12_195_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_195_);
			}
			if (i_129_ > anInt922) {
			    Class11_Sub12 class11_sub12_196_
				= class11_sub12s[i][i_129_ - 1];
			    if (class11_sub12_196_ != null
				&& class11_sub12_196_.aBoolean1715)
				aClass36_932.method691((byte) -98,
						       class11_sub12_196_);
			}
		    }
		}
	    }
	}
    }
    
    public void method835(Class43 arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7) {
	int i_197_;
	int i = i_197_ = (arg6 << 7) - anInt919;
	int i_199_;
	int i_198_ = i_199_ = (arg7 << 7) - anInt950;
	int i_201_;
	int i_200_ = i_201_ = i + 128;
	int i_203_;
	int i_202_ = i_203_ = i_198_ + 128;
	int i_204_ = anIntArrayArrayArray938[arg1][arg6][arg7] - anInt954;
	int i_205_ = anIntArrayArrayArray938[arg1][arg6 + 1][arg7] - anInt954;
	int i_206_
	    = anIntArrayArrayArray938[arg1][arg6 + 1][arg7 + 1] - anInt954;
	int i_207_ = anIntArrayArrayArray938[arg1][arg6][arg7 + 1] - anInt954;
	int i_208_ = i_198_ * arg4 + i * arg5 >> 16;
	i_198_ = i_198_ * arg5 - i * arg4 >> 16;
	i = i_208_;
	i_208_ = i_204_ * arg3 - i_198_ * arg2 >> 16;
	i_198_ = i_204_ * arg2 + i_198_ * arg3 >> 16;
	i_204_ = i_208_;
	if (i_198_ >= 50) {
	    i_208_ = i_199_ * arg4 + i_200_ * arg5 >> 16;
	    i_199_ = i_199_ * arg5 - i_200_ * arg4 >> 16;
	    i_200_ = i_208_;
	    i_208_ = i_205_ * arg3 - i_199_ * arg2 >> 16;
	    i_199_ = i_205_ * arg2 + i_199_ * arg3 >> 16;
	    i_205_ = i_208_;
	    if (i_199_ >= 50) {
		i_208_ = i_202_ * arg4 + i_201_ * arg5 >> 16;
		i_202_ = i_202_ * arg5 - i_201_ * arg4 >> 16;
		i_201_ = i_208_;
		i_208_ = i_206_ * arg3 - i_202_ * arg2 >> 16;
		i_202_ = i_206_ * arg2 + i_202_ * arg3 >> 16;
		i_206_ = i_208_;
		if (i_202_ >= 50) {
		    i_208_ = i_203_ * arg4 + i_197_ * arg5 >> 16;
		    i_203_ = i_203_ * arg5 - i_197_ * arg4 >> 16;
		    i_197_ = i_208_;
		    i_208_ = i_207_ * arg3 - i_203_ * arg2 >> 16;
		    i_203_ = i_207_ * arg2 + i_203_ * arg3 >> 16;
		    i_207_ = i_208_;
		    if (i_203_ >= 50) {
			int i_209_ = (Class11_Sub10_Sub13_Sub1.anInt2730
				      + (i << 9) / i_198_);
			int i_210_ = (Class11_Sub10_Sub13_Sub1.anInt2729
				      + (i_204_ << 9) / i_198_);
			int i_211_ = (Class11_Sub10_Sub13_Sub1.anInt2730
				      + (i_200_ << 9) / i_199_);
			int i_212_ = (Class11_Sub10_Sub13_Sub1.anInt2729
				      + (i_205_ << 9) / i_199_);
			int i_213_ = (Class11_Sub10_Sub13_Sub1.anInt2730
				      + (i_201_ << 9) / i_202_);
			int i_214_ = (Class11_Sub10_Sub13_Sub1.anInt2729
				      + (i_206_ << 9) / i_202_);
			int i_215_ = (Class11_Sub10_Sub13_Sub1.anInt2730
				      + (i_197_ << 9) / i_203_);
			int i_216_ = (Class11_Sub10_Sub13_Sub1.anInt2729
				      + (i_207_ << 9) / i_203_);
			Class11_Sub10_Sub13_Sub1.anInt2734 = 0;
			if (((i_213_ - i_215_) * (i_212_ - i_216_)
			     - (i_214_ - i_216_) * (i_211_ - i_215_))
			    > 0) {
			    Class11_Sub10_Sub13_Sub1.aBoolean2732 = false;
			    if (i_213_ < 0 || i_215_ < 0 || i_211_ < 0
				|| i_213_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_215_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_211_ > Class11_Sub10_Sub13_Sub1.anInt2723)
				Class11_Sub10_Sub13_Sub1.aBoolean2732 = true;
			    if (aBoolean926
				&& method827(anInt920, anInt951, i_214_,
					     i_216_, i_212_, i_213_, i_215_,
					     i_211_)) {
				anInt935 = arg6;
				anInt928 = arg7;
			    }
			    if (arg0.anInt783 == -1) {
				if (arg0.anInt771 != 12345678)
				    Class11_Sub10_Sub13_Sub1.method414
					(i_214_, i_216_, i_212_, i_213_,
					 i_215_, i_211_, arg0.anInt771,
					 arg0.anInt772, arg0.anInt778);
			    } else if (!aBoolean930) {
				if (arg0.aBoolean782)
				    Class11_Sub10_Sub13_Sub1.method418
					(i_214_, i_216_, i_212_, i_213_,
					 i_215_, i_211_, arg0.anInt771,
					 arg0.anInt772, arg0.anInt778, i,
					 i_200_, i_197_, i_204_, i_205_,
					 i_207_, i_198_, i_199_, i_203_,
					 arg0.anInt783);
				else
				    Class11_Sub10_Sub13_Sub1.method418
					(i_214_, i_216_, i_212_, i_213_,
					 i_215_, i_211_, arg0.anInt771,
					 arg0.anInt772, arg0.anInt778, i_201_,
					 i_197_, i_200_, i_206_, i_207_,
					 i_205_, i_202_, i_203_, i_199_,
					 arg0.anInt783);
			    } else {
				int i_217_ = Class11_Sub10_Sub13_Sub1
						 .anInterface3_2727
						 .method8(true, arg0.anInt783);
				Class11_Sub10_Sub13_Sub1.method414
				    (i_214_, i_216_, i_212_, i_213_, i_215_,
				     i_211_, method803(i_217_, arg0.anInt771),
				     method803(i_217_, arg0.anInt772),
				     method803(i_217_, arg0.anInt778));
			    }
			}
			if (((i_209_ - i_211_) * (i_216_ - i_212_)
			     - (i_210_ - i_212_) * (i_215_ - i_211_))
			    > 0) {
			    Class11_Sub10_Sub13_Sub1.aBoolean2732 = false;
			    if (i_209_ < 0 || i_211_ < 0 || i_215_ < 0
				|| i_209_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_211_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_215_ > Class11_Sub10_Sub13_Sub1.anInt2723)
				Class11_Sub10_Sub13_Sub1.aBoolean2732 = true;
			    if (aBoolean926
				&& method827(anInt920, anInt951, i_210_,
					     i_212_, i_216_, i_209_, i_211_,
					     i_215_)) {
				anInt935 = arg6;
				anInt928 = arg7;
			    }
			    if (arg0.anInt783 == -1) {
				if (arg0.anInt791 != 12345678)
				    Class11_Sub10_Sub13_Sub1.method414
					(i_210_, i_212_, i_216_, i_209_,
					 i_211_, i_215_, arg0.anInt791,
					 arg0.anInt778, arg0.anInt772);
			    } else if (!aBoolean930)
				Class11_Sub10_Sub13_Sub1.method418
				    (i_210_, i_212_, i_216_, i_209_, i_211_,
				     i_215_, arg0.anInt791, arg0.anInt778,
				     arg0.anInt772, i, i_200_, i_197_, i_204_,
				     i_205_, i_207_, i_198_, i_199_, i_203_,
				     arg0.anInt783);
			    else {
				int i_218_ = Class11_Sub10_Sub13_Sub1
						 .anInterface3_2727
						 .method8(true, arg0.anInt783);
				Class11_Sub10_Sub13_Sub1.method414
				    (i_210_, i_212_, i_216_, i_209_, i_211_,
				     i_215_, method803(i_218_, arg0.anInt791),
				     method803(i_218_, arg0.anInt778),
				     method803(i_218_, arg0.anInt772));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method836(int arg0, int arg1) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[0][arg0][arg1];
	for (int i = 0; i < 3; i++) {
	    Class11_Sub12 class11_sub12_219_
		= (aClass11_Sub12ArrayArrayArray933[i][arg0][arg1]
		   = aClass11_Sub12ArrayArrayArray933[i + 1][arg0][arg1]);
	    if (class11_sub12_219_ != null) {
		class11_sub12_219_.anInt1722--;
		for (int i_220_ = 0; i_220_ < class11_sub12_219_.anInt1718;
		     i_220_++) {
		    Class28 class28
			= class11_sub12_219_.aClass28Array1726[i_220_];
		    if ((class28.anInt500 >> 29 & 0x3) == 2
			&& class28.anInt515 == arg0
			&& class28.anInt522 == arg1)
			class28.anInt510--;
		}
	    }
	}
	if (aClass11_Sub12ArrayArrayArray933[0][arg0][arg1] == null)
	    aClass11_Sub12ArrayArrayArray933[0][arg0][arg1]
		= new Class11_Sub12(0, arg0, arg1);
	aClass11_Sub12ArrayArrayArray933[0][arg0][arg1].aClass11_Sub12_1708
	    = class11_sub12;
	aClass11_Sub12ArrayArrayArray933[3][arg0][arg1] = null;
    }
    
    public void method837() {
	for (int i = 0; i < anInt946; i++) {
	    Class28 class28 = aClass28Array937[i];
	    method792(class28);
	    aClass28Array937[i] = null;
	}
	anInt946 = 0;
    }
    
    public void method838() {
	int i = anIntArray947[anInt925];
	Class48[] class48s = aClass48ArrayArray958[anInt925];
	anInt959 = 0;
	for (int i_221_ = 0; i_221_ < i; i_221_++) {
	    Class48 class48 = class48s[i_221_];
	    if (class48.anInt917 == 1) {
		int i_222_ = class48.anInt888 - anInt939 + 25;
		if (i_222_ >= 0 && i_222_ <= 50) {
		    int i_223_ = class48.anInt887 - anInt922 + 25;
		    if (i_223_ < 0)
			i_223_ = 0;
		    int i_224_ = class48.anInt890 - anInt922 + 25;
		    if (i_224_ > 50)
			i_224_ = 50;
		    boolean bool = false;
		    while (i_223_ <= i_224_) {
			if (aBooleanArrayArray972[i_222_][i_223_++]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_225_ = anInt919 - class48.anInt893;
			if (i_225_ > 32)
			    class48.anInt894 = 1;
			else {
			    if (i_225_ >= -32)
				continue;
			    class48.anInt894 = 2;
			    i_225_ = -i_225_;
			}
			class48.anInt886
			    = (class48.anInt895 - anInt950 << 8) / i_225_;
			class48.anInt904
			    = (class48.anInt915 - anInt950 << 8) / i_225_;
			class48.anInt902
			    = (class48.anInt918 - anInt954 << 8) / i_225_;
			class48.anInt900
			    = (class48.anInt911 - anInt954 << 8) / i_225_;
			aClass48Array927[anInt959++] = class48;
		    }
		}
	    } else if (class48.anInt917 == 2) {
		int i_226_ = class48.anInt887 - anInt922 + 25;
		if (i_226_ >= 0 && i_226_ <= 50) {
		    int i_227_ = class48.anInt888 - anInt939 + 25;
		    if (i_227_ < 0)
			i_227_ = 0;
		    int i_228_ = class48.anInt891 - anInt939 + 25;
		    if (i_228_ > 50)
			i_228_ = 50;
		    boolean bool = false;
		    while (i_227_ <= i_228_) {
			if (aBooleanArrayArray972[i_227_++][i_226_]) {
			    bool = true;
			    break;
			}
		    }
		    if (bool) {
			int i_229_ = anInt950 - class48.anInt895;
			if (i_229_ > 32)
			    class48.anInt894 = 3;
			else {
			    if (i_229_ >= -32)
				continue;
			    class48.anInt894 = 4;
			    i_229_ = -i_229_;
			}
			class48.anInt909
			    = (class48.anInt893 - anInt919 << 8) / i_229_;
			class48.anInt913
			    = (class48.anInt908 - anInt919 << 8) / i_229_;
			class48.anInt902
			    = (class48.anInt918 - anInt954 << 8) / i_229_;
			class48.anInt900
			    = (class48.anInt911 - anInt954 << 8) / i_229_;
			aClass48Array927[anInt959++] = class48;
		    }
		}
	    } else if (class48.anInt917 == 4) {
		int i_230_ = class48.anInt918 - anInt954;
		if (i_230_ > 128) {
		    int i_231_ = class48.anInt887 - anInt922 + 25;
		    if (i_231_ < 0)
			i_231_ = 0;
		    int i_232_ = class48.anInt890 - anInt922 + 25;
		    if (i_232_ > 50)
			i_232_ = 50;
		    if (i_231_ <= i_232_) {
			int i_233_ = class48.anInt888 - anInt939 + 25;
			if (i_233_ < 0)
			    i_233_ = 0;
			int i_234_ = class48.anInt891 - anInt939 + 25;
			if (i_234_ > 50)
			    i_234_ = 50;
			boolean bool = false;
		    while_6_:
			for (int i_235_ = i_233_; i_235_ <= i_234_; i_235_++) {
			    for (int i_236_ = i_231_; i_236_ <= i_232_;
				 i_236_++) {
				if (aBooleanArrayArray972[i_235_][i_236_]) {
				    bool = true;
				    break while_6_;
				}
			    }
			}
			if (bool) {
			    class48.anInt894 = 5;
			    class48.anInt909
				= (class48.anInt893 - anInt919 << 8) / i_230_;
			    class48.anInt913
				= (class48.anInt908 - anInt919 << 8) / i_230_;
			    class48.anInt886
				= (class48.anInt895 - anInt950 << 8) / i_230_;
			    class48.anInt904
				= (class48.anInt915 - anInt950 << 8) / i_230_;
			    aClass48Array927[anInt959++] = class48;
			}
		    }
		}
	    }
	}
    }
    
    public void method839(Class11_Sub10_Sub4_Sub4 arg0,
			  Class11_Sub10_Sub4_Sub4 arg1, int arg2, int arg3,
			  int arg4, boolean arg5) {
	arg1.method313();
	anInt964++;
	int i = 0;
	int[] is = arg1.anIntArray2597;
	int i_237_ = arg1.anInt2618;
	for (int i_238_ = 0; i_238_ < arg0.anInt2618; i_238_++) {
	    Class62 class62 = arg0.aClass62Array2606[i_238_];
	    Class62 class62_239_ = arg0.aClass62Array2608[i_238_];
	    if (class62_239_.anInt1287 != 0) {
		int i_240_ = arg0.anIntArray2605[i_238_] - arg3;
		if (i_240_ <= arg1.anInt2602) {
		    int i_241_ = arg0.anIntArray2597[i_238_] - arg2;
		    if (i_241_ >= arg1.anInt2593 && i_241_ <= arg1.anInt2619) {
			int i_242_ = arg0.anIntArray2620[i_238_] - arg4;
			if (i_242_ >= arg1.anInt2600
			    && i_242_ <= arg1.anInt2626) {
			    for (int i_243_ = 0; i_243_ < i_237_; i_243_++) {
				Class62 class62_244_
				    = arg1.aClass62Array2606[i_243_];
				Class62 class62_245_
				    = arg1.aClass62Array2608[i_243_];
				if (i_241_ == is[i_243_]
				    && i_242_ == arg1.anIntArray2620[i_243_]
				    && i_240_ == arg1.anIntArray2605[i_243_]
				    && class62_245_.anInt1287 != 0) {
				    class62.anInt1296
					+= class62_245_.anInt1296;
				    class62.anInt1294
					+= class62_245_.anInt1294;
				    class62.anInt1289
					+= class62_245_.anInt1289;
				    class62.anInt1287
					+= class62_245_.anInt1287;
				    class62_244_.anInt1296
					+= class62_239_.anInt1296;
				    class62_244_.anInt1294
					+= class62_239_.anInt1294;
				    class62_244_.anInt1289
					+= class62_239_.anInt1289;
				    class62_244_.anInt1287
					+= class62_239_.anInt1287;
				    i++;
				    anIntArray965[i_238_] = anInt964;
				    anIntArray962[i_243_] = anInt964;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i >= 3 && arg5) {
	    for (int i_246_ = 0; i_246_ < arg0.anInt2624; i_246_++) {
		if (anIntArray965[arg0.anIntArray2610[i_246_]] == anInt964
		    && anIntArray965[arg0.anIntArray2609[i_246_]] == anInt964
		    && anIntArray965[arg0.anIntArray2595[i_246_]] == anInt964)
		    arg0.anIntArray2613[i_246_] = -1;
	    }
	    for (int i_247_ = 0; i_247_ < arg1.anInt2624; i_247_++) {
		if (anIntArray962[arg1.anIntArray2610[i_247_]] == anInt964
		    && anIntArray962[arg1.anIntArray2609[i_247_]] == anInt964
		    && anIntArray962[arg1.anIntArray2595[i_247_]] == anInt964)
		    arg1.anIntArray2613[i_247_] = -1;
	    }
	}
    }
    
    public boolean method840(int arg0, int arg1, int arg2, int arg3, int arg4,
			     Class11_Sub10_Sub4 arg5, int arg6, int arg7,
			     int arg8, int arg9, int arg10, int arg11) {
	if (arg5 == null)
	    return true;
	return method826(arg0, arg8, arg9, arg10 - arg8 + 1, arg11 - arg9 + 1,
			 arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
    }
    
    public Class49(int arg0, int arg1, int arg2, int[][][] arg3) {
	anInt944 = 0;
	anIntArrayArray960
	    = new int[][] { new int[16],
			    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			    { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			    { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			    { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			    { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			    { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			    { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1,
			      1 } };
	anIntArrayArray961
	    = (new int[][]
	       { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
		 { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
		 { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
		 { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } });
	anIntArray962 = new int[10000];
	anInt964 = 0;
	anIntArray965 = new int[10000];
	anInt945 = arg0;
	anInt940 = arg1;
	anInt931 = arg2;
	aClass11_Sub12ArrayArrayArray933 = new Class11_Sub12[arg0][arg1][arg2];
	anIntArrayArrayArray956 = new int[arg0][arg1 + 1][arg2 + 1];
	anIntArrayArrayArray938 = arg3;
	method797();
    }
    
    public int method841(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null || class11_sub12.aClass23_1727 == null)
	    return 0;
	return class11_sub12.aClass23_1727.anInt423;
    }
    
    public int method842(int arg0, int arg1, int arg2) {
	Class11_Sub12 class11_sub12
	    = aClass11_Sub12ArrayArrayArray933[arg0][arg1][arg2];
	if (class11_sub12 == null || class11_sub12.aClass54_1725 == null)
	    return 0;
	return class11_sub12.aClass54_1725.anInt1078;
    }
    
    static {
	anInt928 = -1;
	aBoolean930 = true;
	anInt925 = 0;
	aClass28Array943 = new Class28[100];
	aBoolean926 = false;
	anIntArray921 = new int[] { 53, -53, -53, 53 };
	anInt920 = 0;
	anIntArray942 = new int[] { -53, -53, 53, 53 };
	anIntArray952 = new int[] { 45, 45, -45, -45 };
	anInt953 = 4;
	anInt959 = 0;
	anIntArray947 = new int[anInt953];
	anInt951 = 0;
	aClass48ArrayArray958 = new Class48[anInt953][500];
	aClass36_932 = new Class36();
	anIntArray968 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	anIntArray974 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	anIntArray966 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	anIntArray970 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	anIntArray977 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	anIntArray979 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	aBooleanArrayArrayArrayArray980 = new boolean[8][32][51][51];
	anIntArray976 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }
}
