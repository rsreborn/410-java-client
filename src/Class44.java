/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class44
{
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_792;
    public int anInt793;
    public static int anInt794;
    public static int[] anIntArray795;
    public static int anInt796;
    public static int[] anIntArray797 = { 1, 0, -1, 0 };
    public int anInt798;
    public static Class31 aClass31_799;
    public static int anInt800;
    public static int anInt801;
    public static int anInt802;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_803;
    public static int anInt804;
    public int anInt805;
    public static int anInt806;
    public static int anInt807;
    public static int anInt808;
    public static int anInt809;
    public int anInt810;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_811;
    public static int anInt812;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_813;
    public static int[] anIntArray814;
    public static int anInt815 = 0;
    public static int anInt816;
    public static int anInt817;
    public int anInt818;
    public static Class31 aClass31_819;
    public static Class55_Sub1[] aClass55_Sub1Array820;
    public static int anInt821;
    
    public static Class31 method757(boolean arg0, int arg1, int arg2,
				    int arg3) {
	try {
	    anInt821++;
	    int i = 1;
	    if (arg3 > arg1 || arg1 > 36)
		arg1 = 10;
	    int i_0_ = arg2 / arg1;
	    while ((i_0_ ^ 0xffffffff) != -1) {
		i_0_ /= arg1;
		i++;
	    }
	    int i_1_ = i;
	    if (arg2 < 0 || arg0)
		i_1_++;
	    byte[] is = new byte[i_1_];
	    if ((arg2 ^ 0xffffffff) <= -1) {
		if (arg0)
		    is[0] = (byte) 43;
	    } else
		is[0] = (byte) 45;
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = arg2 % arg1;
		if ((i_3_ ^ 0xffffffff) > -1)
		    i_3_ = -i_3_;
		if (i_3_ > 9)
		    i_3_ += 39;
		is[-i_2_ + i_1_ + -1] = (byte) (i_3_ + 48);
		arg2 /= arg1;
	    }
	    Class31 class31 = new Class31();
	    class31.aByteArray1366 = is;
	    class31.anInt1403 = i_1_;
	    return class31;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rb.B(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ')'));
	}
    }
    
    public static void method758(int arg0) {
	if (arg0 != 1000)
	    method766(90, 15, 98);
	anInt807++;
	int i = 64 + 128 * Class13.anInt271;
	int i_4_ = 128 * Class37.anInt687 + 64;
	int i_5_
	    = (Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82, i_4_, 3, i)
	       - Class11_Sub10_Sub4.anInt2039);
	if ((i ^ 0xffffffff) < (Class15_Sub1.anInt1748 ^ 0xffffffff)) {
	    Class15_Sub1.anInt1748
		+= Class6.anInt160 - -((i + -Class15_Sub1.anInt1748)
				       * Class11_Sub10_Sub4_Sub2.anInt2569
				       / 1000);
	    if ((i ^ 0xffffffff) > (Class15_Sub1.anInt1748 ^ 0xffffffff))
		Class15_Sub1.anInt1748 = i;
	}
	if (Class15_Sub1.anInt1748 > i) {
	    Class15_Sub1.anInt1748 -= ((-i + Class15_Sub1.anInt1748)
				       * Class11_Sub10_Sub4_Sub2.anInt2569
				       / 1000) + Class6.anInt160;
	    if ((i ^ 0xffffffff) < (Class15_Sub1.anInt1748 ^ 0xffffffff))
		Class15_Sub1.anInt1748 = i;
	}
	if (Class42.anInt761 < i_5_) {
	    Class42.anInt761 += (((-Class42.anInt761 + i_5_)
				  * Class11_Sub10_Sub4_Sub2.anInt2569 / 1000)
				 + Class6.anInt160);
	    if (i_5_ < Class42.anInt761)
		Class42.anInt761 = i_5_;
	}
	i = 64 + 128 * Class40.anInt725;
	if ((Class42.anInt761 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
	    Class42.anInt761
		-= Class6.anInt160 + (Class11_Sub10_Sub4_Sub2.anInt2569
				      * (Class42.anInt761 + -i_5_) / 1000);
	    if ((Class42.anInt761 ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
		Class42.anInt761 = i_5_;
	}
	if ((Class15_Sub2.anInt1764 ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
	    Class15_Sub2.anInt1764
		+= Class6.anInt160 - -(Class11_Sub10_Sub4_Sub2.anInt2569
				       * (-Class15_Sub2.anInt1764 + i_4_)
				       / 1000);
	    if ((i_4_ ^ 0xffffffff) > (Class15_Sub2.anInt1764 ^ 0xffffffff))
		Class15_Sub2.anInt1764 = i_4_;
	}
	if ((Class15_Sub2.anInt1764 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
	    Class15_Sub2.anInt1764 -= ((Class15_Sub2.anInt1764 - i_4_)
				       * Class11_Sub10_Sub4_Sub2.anInt2569
				       / 1000) + Class6.anInt160;
	    if (i_4_ > Class15_Sub2.anInt1764)
		Class15_Sub2.anInt1764 = i_4_;
	}
	i_4_ = 128 * Class39.anInt706 - -64;
	i_5_ = (Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82, i_4_, 3, i)
		- anInt809);
	int i_6_ = -Class15_Sub2.anInt1764 + i_4_;
	int i_7_ = -Class42.anInt761 + i_5_;
	int i_8_ = -Class15_Sub1.anInt1748 + i;
	int i_9_ = (int) Math.sqrt((double) (i_6_ * i_6_ - -(i_8_ * i_8_)));
	int i_10_ = 0x7ff & (int) (Math.atan2((double) i_7_, (double) i_9_)
				   * 325.949);
	if (i_10_ < 128)
	    i_10_ = 128;
	if ((i_10_ ^ 0xffffffff) < -384)
	    i_10_ = 383;
	int i_11_ = 0x7ff & (int) (-325.949
				   * Math.atan2((double) i_6_, (double) i_8_));
	int i_12_ = i_11_ - Class8.anInt180;
	if (Class11_Sub8.anInt1628 < i_10_) {
	    Class11_Sub8.anInt1628
		+= (Class36.anInt678 * (-Class11_Sub8.anInt1628 + i_10_) / 1000
		    + Buffer.anInt1565);
	    if (Class11_Sub8.anInt1628 > i_10_)
		Class11_Sub8.anInt1628 = i_10_;
	}
	if (Class11_Sub8.anInt1628 > i_10_) {
	    Class11_Sub8.anInt1628
		-= ((Class11_Sub8.anInt1628 + -i_10_) * Class36.anInt678 / 1000
		    + Buffer.anInt1565);
	    if (i_10_ > Class11_Sub8.anInt1628)
		Class11_Sub8.anInt1628 = i_10_;
	}
	if ((i_12_ ^ 0xffffffff) < -1025)
	    i_12_ -= 2048;
	if ((i_12_ ^ 0xffffffff) > 1023)
	    i_12_ += 2048;
	if (i_12_ > 0) {
	    Class8.anInt180
		+= i_12_ * Class36.anInt678 / 1000 + Buffer.anInt1565;
	    Class8.anInt180 &= 0x7ff;
	}
	if ((i_12_ ^ 0xffffffff) > -1) {
	    Class8.anInt180 -= Buffer.anInt1565 - -(Class36.anInt678
							  * -i_12_ / 1000);
	    Class8.anInt180 &= 0x7ff;
	}
	int i_13_ = i_11_ + -Class8.anInt180;
	if ((i_13_ ^ 0xffffffff) < -1025)
	    i_13_ -= 2048;
	if (i_13_ < -1024)
	    i_13_ += 2048;
	if (i_13_ < 0 && (i_12_ ^ 0xffffffff) < -1
	    || (i_13_ ^ 0xffffffff) < -1 && i_12_ < 0)
	    Class8.anInt180 = i_11_;
    }
    
    public static boolean method759(int arg0, byte arg1, int arg2, int arg3,
				    int arg4, int arg5, int arg6, boolean arg7,
				    int arg8, int arg9, int arg10, int arg11) {
	try {
	    anInt796++;
	    int i = -66 / ((35 - arg1) / 61);
	    for (int i_14_ = 0; i_14_ < 104; i_14_++) {
		for (int i_15_ = 0; i_15_ < 104; i_15_++) {
		    Class11_Sub12.anIntArrayArray1693[i_14_][i_15_] = 0;
		    Class11_Sub10_Sub10.anIntArrayArray2230[i_14_][i_15_]
			= 99999999;
		}
	    }
	    Class11_Sub12.anIntArrayArray1693[arg3][arg9] = 99;
	    Class11_Sub10_Sub10.anIntArrayArray2230[arg3][arg9] = 0;
	    int i_16_ = arg9;
	    int i_17_ = arg3;
	    int i_18_ = 0;
	    Class13.anIntArray263[i_18_] = arg3;
	    Class11_Sub10_Sub10.anIntArray2226[i_18_++] = arg9;
	    int i_19_ = 0;
	    boolean bool = false;
	    int i_20_ = Class13.anIntArray263.length;
	    int[][] is
		= Class39.aClass8Array707[Class1.anInt82].anIntArrayArray179;
	    while (i_19_ != i_18_) {
		i_16_ = Class11_Sub10_Sub10.anIntArray2226[i_19_];
		i_17_ = Class13.anIntArray263[i_19_];
		i_19_ = (1 + i_19_) % i_20_;
		if (i_17_ == arg11 && i_16_ == arg0) {
		    bool = true;
		    break;
		}
		if (arg8 != 0) {
		    if (((arg8 ^ 0xffffffff) > -6 || arg8 == 10)
			&& (Class39.aClass8Array707[Class1.anInt82].method85
			    (arg2, i_16_, arg0, arg11, i_17_, -1 + arg8,
			     -1))) {
			bool = true;
			break;
		    }
		    if (arg8 < 10
			&& (Class39.aClass8Array707[Class1.anInt82].method93
			    (i_16_, arg2, arg8 - 1, arg11, arg0, (byte) 16,
			     i_17_))) {
			bool = true;
			break;
		    }
		}
		if (arg10 != 0 && arg4 != 0
		    && (Class39.aClass8Array707[Class1.anInt82].method96
			(arg5, i_16_, arg11, arg0, arg10, i_17_, arg4,
			 false))) {
		    bool = true;
		    break;
		}
		int i_21_ = 1 + (Class11_Sub10_Sub10.anIntArrayArray2230[i_17_]
				 [i_16_]);
		if ((i_17_ ^ 0xffffffff) < -1
		    && (Class11_Sub12.anIntArrayArray1693[i_17_ + -1][i_16_]
			== 0)
		    && ((0x1280108 & is[-1 + i_17_][i_16_] ^ 0xffffffff)
			== -1)) {
		    Class13.anIntArray263[i_18_] = -1 + i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = i_16_;
		    Class11_Sub12.anIntArrayArray1693[i_17_ + -1][i_16_] = 2;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub10_Sub10.anIntArrayArray2230[-1 + i_17_][i_16_]
			= i_21_;
		}
		if (i_17_ < 103
		    && (Class11_Sub12.anIntArrayArray1693[i_17_ + 1][i_16_]
			^ 0xffffffff) == -1
		    && (0x1280180 & is[i_17_ - -1][i_16_]) == 0) {
		    Class13.anIntArray263[i_18_] = i_17_ - -1;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = i_16_;
		    Class11_Sub12.anIntArrayArray1693[i_17_ - -1][i_16_] = 8;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub10_Sub10.anIntArrayArray2230[i_17_ - -1][i_16_]
			= i_21_;
		}
		if (i_16_ > 0
		    && (Class11_Sub12.anIntArrayArray1693[i_17_][-1 + i_16_]
			^ 0xffffffff) == -1
		    && ((0x1280102 & is[i_17_][-1 + i_16_] ^ 0xffffffff)
			== -1)) {
		    Class13.anIntArray263[i_18_] = i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = -1 + i_16_;
		    i_18_ = (i_18_ - -1) % i_20_;
		    Class11_Sub12.anIntArrayArray1693[i_17_][i_16_ + -1] = 1;
		    Class11_Sub10_Sub10.anIntArrayArray2230[i_17_][-1 + i_16_]
			= i_21_;
		}
		if (i_16_ < 103
		    && (Class11_Sub12.anIntArrayArray1693[i_17_][i_16_ - -1]
			== 0)
		    && (0x1280120 & is[i_17_][1 + i_16_]) == 0) {
		    Class13.anIntArray263[i_18_] = i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = i_16_ + 1;
		    Class11_Sub12.anIntArrayArray1693[i_17_][i_16_ - -1] = 4;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub10_Sub10.anIntArrayArray2230[i_17_][i_16_ - -1]
			= i_21_;
		}
		if (i_17_ > 0 && i_16_ > 0
		    && (Class11_Sub12.anIntArrayArray1693[-1 + i_17_]
			[i_16_ + -1]) == 0
		    && (is[i_17_ + -1][i_16_ + -1] & 0x128010e) == 0
		    && (is[-1 + i_17_][i_16_] & 0x1280108) == 0
		    && (0x1280102 & is[i_17_][i_16_ - 1]) == 0) {
		    Class13.anIntArray263[i_18_] = i_17_ + -1;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = i_16_ - 1;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub12.anIntArrayArray1693[i_17_ + -1][-1 + i_16_]
			= 3;
		    Class11_Sub10_Sub10.anIntArrayArray2230[-1 + i_17_]
			[-1 + i_16_]
			= i_21_;
		}
		if ((i_17_ ^ 0xffffffff) > -104 && (i_16_ ^ 0xffffffff) < -1
		    && ((Class11_Sub12.anIntArrayArray1693[1 + i_17_]
			 [i_16_ + -1])
			^ 0xffffffff) == -1
		    && ((is[i_17_ - -1][-1 + i_16_] & 0x1280183 ^ 0xffffffff)
			== -1)
		    && (0x1280180 & is[i_17_ + 1][i_16_] ^ 0xffffffff) == -1
		    && (0x1280102 & is[i_17_][i_16_ - 1]) == 0) {
		    Class13.anIntArray263[i_18_] = 1 + i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = -1 + i_16_;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub12.anIntArrayArray1693[i_17_ + 1][-1 + i_16_]
			= 9;
		    Class11_Sub10_Sub10.anIntArrayArray2230[1 + i_17_]
			[-1 + i_16_]
			= i_21_;
		}
		if ((i_17_ ^ 0xffffffff) < -1 && i_16_ < 103
		    && (Class11_Sub12.anIntArrayArray1693[i_17_ - 1]
			[i_16_ - -1]) == 0
		    && (is[i_17_ + -1][1 + i_16_] & 0x1280138) == 0
		    && (is[-1 + i_17_][i_16_] & 0x1280108 ^ 0xffffffff) == -1
		    && (is[i_17_][1 + i_16_] & 0x1280120 ^ 0xffffffff) == -1) {
		    Class13.anIntArray263[i_18_] = i_17_ + -1;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = i_16_ - -1;
		    Class11_Sub12.anIntArrayArray1693[i_17_ - 1][1 + i_16_]
			= 6;
		    Class11_Sub10_Sub10.anIntArrayArray2230[-1 + i_17_][(i_16_
									 - -1)]
			= i_21_;
		    i_18_ = (1 + i_18_) % i_20_;
		}
		if ((i_17_ ^ 0xffffffff) > -104 && i_16_ < 103
		    && (Class11_Sub12.anIntArrayArray1693[i_17_ + 1][1 + i_16_]
			^ 0xffffffff) == -1
		    && (is[1 + i_17_][i_16_ - -1] & 0x12801e0) == 0
		    && (is[i_17_ - -1][i_16_] & 0x1280180 ^ 0xffffffff) == -1
		    && (0x1280120 & is[i_17_][1 + i_16_] ^ 0xffffffff) == -1) {
		    Class13.anIntArray263[i_18_] = 1 + i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_18_] = 1 + i_16_;
		    Class11_Sub12.anIntArrayArray1693[i_17_ - -1][1 + i_16_]
			= 12;
		    i_18_ = (1 + i_18_) % i_20_;
		    Class11_Sub10_Sub10.anIntArrayArray2230[i_17_ - -1]
			[1 + i_16_]
			= i_21_;
		}
	    }
	    Class57.anInt1155 = 0;
	    if (!bool) {
		if (!arg7)
		    return false;
		int i_22_ = 1000;
		int i_23_ = 100;
		int i_24_ = 10;
		for (int i_25_ = -i_24_ + arg11;
		     (i_25_ ^ 0xffffffff) >= (i_24_ + arg11 ^ 0xffffffff);
		     i_25_++) {
		    for (int i_26_ = arg0 + -i_24_;
			 (i_26_ ^ 0xffffffff) >= (i_24_ + arg0 ^ 0xffffffff);
			 i_26_++) {
			if (i_25_ >= 0 && (i_26_ ^ 0xffffffff) <= -1
			    && (i_25_ ^ 0xffffffff) > -105
			    && (i_26_ ^ 0xffffffff) > -105
			    && ((Class11_Sub10_Sub10.anIntArrayArray2230[i_25_]
				 [i_26_])
				^ 0xffffffff) > -101) {
			    int i_27_ = 0;
			    int i_28_ = 0;
			    if (arg11 <= i_25_) {
				if (arg11 + (arg10 + -1) < i_25_)
				    i_28_ = i_25_ + 1 + (-arg11 + -arg10);
			    } else
				i_28_ = -i_25_ + arg11;
			    if ((arg0 ^ 0xffffffff) >= (i_26_ ^ 0xffffffff)) {
				if (i_26_ > -1 + (arg4 + arg0))
				    i_27_ = i_26_ + (-arg0 + -arg4 - -1);
			    } else
				i_27_ = -i_26_ + arg0;
			    int i_29_ = i_27_ * i_27_ + i_28_ * i_28_;
			    if (i_29_ < i_22_
				|| ((i_22_ ^ 0xffffffff) == (i_29_
							     ^ 0xffffffff)
				    && i_23_ > (Class11_Sub10_Sub10
						.anIntArrayArray2230[i_25_]
						[i_26_]))) {
				i_23_ = (Class11_Sub10_Sub10
					 .anIntArrayArray2230[i_25_][i_26_]);
				i_16_ = i_26_;
				i_17_ = i_25_;
				i_22_ = i_29_;
			    }
			}
		    }
		}
		if ((i_22_ ^ 0xffffffff) == -1001)
		    return false;
		if ((arg3 ^ 0xffffffff) == (i_17_ ^ 0xffffffff)
		    && i_16_ == arg9)
		    return false;
		Class57.anInt1155 = 1;
	    }
	    i_19_ = 0;
	    Class13.anIntArray263[i_19_] = i_17_;
	    Class11_Sub10_Sub10.anIntArray2226[i_19_++] = i_16_;
	    int i_31_;
	    int i_30_
		= i_31_ = Class11_Sub12.anIntArrayArray1693[i_17_][i_16_];
	    while (i_17_ != arg3 || arg9 != i_16_) {
		if ((i_30_ ^ 0xffffffff) != (i_31_ ^ 0xffffffff)) {
		    i_31_ = i_30_;
		    Class13.anIntArray263[i_19_] = i_17_;
		    Class11_Sub10_Sub10.anIntArray2226[i_19_++] = i_16_;
		}
		if ((i_30_ & 0x2) == 0) {
		    if ((i_30_ & 0x8) != 0)
			i_17_--;
		} else
		    i_17_++;
		if ((0x1 & i_30_ ^ 0xffffffff) == -1) {
		    if ((i_30_ & 0x4) != 0)
			i_16_--;
		} else
		    i_16_++;
		i_30_ = Class11_Sub12.anIntArrayArray1693[i_17_][i_16_];
	    }
	    if (i_19_ > 0) {
		i_20_ = i_19_;
		i_19_--;
		if (i_20_ > 25)
		    i_20_ = 25;
		int i_32_ = Class13.anIntArray263[i_19_];
		int i_33_ = Class11_Sub10_Sub10.anIntArray2226[i_19_];
		if ((arg6 ^ 0xffffffff) == -1) {
		    Class36.anInt672++;
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 130);
		    Class40.aClass11_Sub5_Sub1_728
			.writeByte(i_20_ + i_20_ - -3);
		}
		if (arg6 == 1) {
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 136);
		    Class40.aClass11_Sub5_Sub1_728
			.writeByte(i_20_ + (i_20_ + 3) - -14);
		    Class14.anInt276++;
		}
		if (arg6 == 2) {
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 89);
		    Class40.aClass11_Sub5_Sub1_728
			.writeByte(i_20_ - -i_20_ - -3);
		    Class11_Sub10_Sub2.anInt1999++;
		}
		Class40.aClass11_Sub5_Sub1_728.method172(false,
							 !(Class11_Sub10_Sub7
							   .aBooleanArray2148
							   [82]) ? 0 : 1);
		Class40.aClass11_Sub5_Sub1_728
		    .method171(i_32_ - -Class11_Sub10_Sub6.anInt2133, -3420);
		Class40.aClass11_Sub5_Sub1_728
		    .writeShortLE(i_33_ - -Class10.anInt214);
		Class14.anInt302 = Class13.anIntArray263[0];
		Class40.anInt735 = Class11_Sub10_Sub10.anIntArray2226[0];
		for (int i_34_ = 1;
		     (i_20_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
		    i_19_--;
		    Class40.aClass11_Sub5_Sub1_728.method172
			(false, -i_32_ + Class13.anIntArray263[i_19_]);
		    Class40.aClass11_Sub5_Sub1_728.method162
			(-5016,
			 Class11_Sub10_Sub10.anIntArray2226[i_19_] - i_33_);
		}
		return true;
	    }
	    if ((arg6 ^ 0xffffffff) == -2)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rb.F(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ',' + arg7 + ',' + arg8
				     + ',' + arg9 + ',' + arg10 + ',' + arg11
				     + ')'));
	}
    }
    
    public static void method760(int arg0, int arg1) {
	try {
	    if (arg0 == 256) {
		anInt802++;
		Class11_Sub10_Sub2.method244(false, arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "rb.G(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class37 method761(int arg0, Component arg1, int arg2,
				    int arg3) {
	try {
	    anInt808++;
	    Class37_Sub1 class37_sub1 = new Class37_Sub1();
	    class37_sub1.method703(arg0, -124, arg1, arg3);
	    if (arg2 != -8)
		return null;
	    return class37_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rb.D(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static void method762(byte arg0) {
	aClass55_Sub1Array820 = null;
	anIntArray795 = null;
	anIntArray814 = null;
	aClass11_Sub10_Sub13_Sub3_811 = null;
	anIntArray797 = null;
	aClass31_799 = null;
	aClass31_819 = null;
	if (arg0 != -10)
	    anInt800 = 12;
    }
    
    public static void method763(int arg0, int arg1, int arg2, byte arg3,
				 Class8 arg4, int arg5, int arg6, Class49 arg7,
				 int arg8) {
	try {
	    anInt817++;
	    if (!Class1.aBoolean94
		|| (0x2 & Class25.aByteArrayArrayArray481[0][arg2][arg8]
		    ^ 0xffffffff) != -1
		|| ((Class25.aByteArrayArrayArray481[arg0][arg2][arg8] & 0x10
		     ^ 0xffffffff) == -1
		    && (Class15_Sub2.method555(arg8, arg2, arg0, (byte) 124)
			== Class11_Sub10_Sub14.anInt2355))) {
		if (Class11_Sub7.anInt1610 > arg0)
		    Class11_Sub7.anInt1610 = arg0;
		int i = Class51.anIntArrayArrayArray1005[arg0][arg2 + 1][arg8];
		int i_35_ = Class51.anIntArrayArrayArray1005[arg0][arg2][arg8];
		int i_36_ = (Class51.anIntArrayArrayArray1005[arg0][arg2 + 1]
			     [1 + arg8]);
		int i_37_
		    = Class51.anIntArrayArrayArray1005[arg0][arg2][arg8 + 1];
		Class11_Sub10_Sub2 class11_sub10_sub2
		    = Class51.method853((byte) -114, arg1);
		int i_38_ = i_37_ + (i + (i_35_ - -i_36_)) >> 1261294754;
		int i_39_ = (arg5 << 289069478) - -arg6;
		int i_40_ = (1073741824 + (arg1 << 1977755150)
			     + (arg2 + (arg8 << -701337881)));
		if (class11_sub10_sub2.anInt1998 == 0)
		    i_40_ += -2147483648;
		if (class11_sub10_sub2.anInt1955 == 1)
		    i_39_ += 256;
		if (arg3 >= -5)
		    anInt815 = -28;
		if (arg6 == 22) {
		    if (!Class1.aBoolean94 || class11_sub10_sub2.anInt1998 != 0
			|| class11_sub10_sub2.aBoolean1952) {
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if (class11_sub10_sub2.anInt1987 == -1
			    && class11_sub10_sub2.anIntArray1980 == null)
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(arg5, i, i_37_,
							       i_35_, 22, -112,
							       i_36_);
			else
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 22, arg5, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			arg7.method799(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4, i_40_, i_39_);
			if (class11_sub10_sub2.aBoolean1960
			    && class11_sub10_sub2.anInt1998 == 1
			    && arg4 != null)
			    arg4.method94(arg8, 2097152, arg2);
		    }
		} else if ((arg6 ^ 0xffffffff) == -11
			   || (arg6 ^ 0xffffffff) == -12) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0
			&& class11_sub10_sub2.anIntArray1980 == null)
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, 10, -73,
							   i_36_);
		    else
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, 10, arg5,
							  i_35_, i, i_36_,
							  i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    if (class11_sub10_sub4 != null) {
			int i_41_;
			int i_42_;
			if ((arg5 ^ 0xffffffff) != -2 && arg5 != 3) {
			    i_41_ = class11_sub10_sub2.anInt1974;
			    i_42_ = class11_sub10_sub2.anInt1967;
			} else {
			    i_41_ = class11_sub10_sub2.anInt1967;
			    i_42_ = class11_sub10_sub2.anInt1974;
			}
			int i_43_ = 0;
			if (arg6 == 11)
			    i_43_ += 256;
			if (arg7.method793(arg0, arg2, arg8, i_38_, i_42_,
					   i_41_, class11_sub10_sub4, i_43_,
					   i_40_, i_39_)
			    && class11_sub10_sub2.aBoolean1991) {
			    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4;
			    if (class11_sub10_sub4
				instanceof Class11_Sub10_Sub4_Sub4)
				class11_sub10_sub4_sub4
				    = ((Class11_Sub10_Sub4_Sub4)
				       class11_sub10_sub4);
			    else
				class11_sub10_sub4_sub4
				    = class11_sub10_sub2.method235(arg5, i,
								   i_37_,
								   i_35_, 10,
								   -41, i_36_);
			    if (class11_sub10_sub4_sub4 != null) {
				for (int i_44_ = 0; i_44_ <= i_42_; i_44_++) {
				    for (int i_45_ = 0;
					 ((i_41_ ^ 0xffffffff)
					  <= (i_45_ ^ 0xffffffff));
					 i_45_++) {
					int i_46_ = (class11_sub10_sub4_sub4
							 .method300()
						     / 4);
					if (i_46_ > 30)
					    i_46_ = 30;
					if (((Class24.aByteArrayArrayArray443
					      [arg0][i_44_ + arg2]
					      [arg8 - -i_45_])
					     ^ 0xffffffff)
					    > (i_46_ ^ 0xffffffff))
					    Class24.aByteArrayArrayArray443
						[arg0][arg2 - -i_44_]
						[arg8 - -i_45_]
						= (byte) i_46_;
				    }
				}
			    }
			}
		    }
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method89(class11_sub10_sub2.anInt1974,
				      class11_sub10_sub2.aBoolean1969, arg2,
				      arg5, 19398920, arg8,
				      class11_sub10_sub2.anInt1967);
		} else if (arg6 >= 12) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if (class11_sub10_sub2.anInt1987 != -1
			|| class11_sub10_sub2.anIntArray1980 != null)
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, arg6, arg5,
							  i_35_, i, i_36_,
							  i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    else
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, arg6, -83,
							   i_36_);
		    arg7.method793(arg0, arg2, arg8, i_38_, 1, 1,
				   class11_sub10_sub4, 0, i_40_, i_39_);
		    if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg0 > 0)
			Class11_Sub6.anIntArrayArrayArray1587[arg0][arg2][arg8]
			    = (Class11_Sub10_Sub6.method345
			       ((Class11_Sub6.anIntArrayArrayArray1587[arg0]
				 [arg2][arg8]),
				2340));
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method89(class11_sub10_sub2.anInt1974,
				      class11_sub10_sub2.aBoolean1969, arg2,
				      arg5, 19398920, arg8,
				      class11_sub10_sub2.anInt1967);
		} else if ((arg6 ^ 0xffffffff) == -1) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0
			&& class11_sub10_sub2.anIntArray1980 == null)
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, 0, -71,
							   i_36_);
		    else
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, 0, arg5, i_35_,
							  i, i_36_, i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    arg7.method823(arg0, arg2, arg8, i_38_, class11_sub10_sub4,
				   null,
				   Class11_Sub10_Sub1.anIntArray1950[arg5], 0,
				   i_40_, i_39_);
		    if (arg5 != 0) {
			if (arg5 == 1) {
			    if (class11_sub10_sub2.aBoolean1991) {
				Class24.aByteArrayArrayArray443[arg0][arg2]
				    [1 + arg8]
				    = (byte) 50;
				Class24.aByteArrayArrayArray443[arg0]
				    [arg2 + 1][arg8 + 1]
				    = (byte) 50;
			    }
			    if (class11_sub10_sub2.aBoolean1978)
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [arg2][1 + arg8]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][arg2][1 + arg8]),
					1170));
			} else if ((arg5 ^ 0xffffffff) != -3) {
			    if ((arg5 ^ 0xffffffff) == -4) {
				if (class11_sub10_sub2.aBoolean1991) {
				    Class24.aByteArrayArrayArray443[arg0]
					[arg2][arg8]
					= (byte) 50;
				    Class24.aByteArrayArrayArray443[arg0]
					[1 + arg2][arg8]
					= (byte) 50;
				}
				if (class11_sub10_sub2.aBoolean1978)
				    Class11_Sub6.anIntArrayArrayArray1587
					[arg0][arg2][arg8]
					= (Class11_Sub10_Sub6.method345
					   ((Class11_Sub6
					     .anIntArrayArrayArray1587[arg0]
					     [arg2][arg8]),
					    1170));
			    }
			} else {
			    if (class11_sub10_sub2.aBoolean1991) {
				Class24.aByteArrayArrayArray443[arg0]
				    [1 + arg2][arg8]
				    = (byte) 50;
				Class24.aByteArrayArrayArray443[arg0]
				    [arg2 + 1][arg8 - -1]
				    = (byte) 50;
			    }
			    if (class11_sub10_sub2.aBoolean1978)
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [1 + arg2][arg8]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][1 + arg2][arg8]),
					585));
			}
		    } else {
			if (class11_sub10_sub2.aBoolean1991) {
			    Class24.aByteArrayArrayArray443[arg0][arg2][arg8]
				= (byte) 50;
			    Class24.aByteArrayArrayArray443[arg0][arg2][(arg8
									 - -1)]
				= (byte) 50;
			}
			if (class11_sub10_sub2.aBoolean1978)
			    Class11_Sub6.anIntArrayArrayArray1587[arg0]
				[arg2][arg8]
				= (Class11_Sub10_Sub6.method345
				   ((Class11_Sub6.anIntArrayArrayArray1587
				     [arg0][arg2][arg8]),
				    585));
		    }
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method86(class11_sub10_sub2.aBoolean1969, true,
				      arg5, arg8, arg2, arg6);
		    if ((class11_sub10_sub2.anInt1993 ^ 0xffffffff) != -17)
			arg7.method794(arg0, arg2, arg8,
				       class11_sub10_sub2.anInt1993);
		} else if (arg6 == 1) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0
			|| class11_sub10_sub2.anIntArray1980 != null)
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, 1, arg5, i_35_,
							  i, i_36_, i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    else
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, 1, -77,
							   i_36_);
		    arg7.method823(arg0, arg2, arg8, i_38_, class11_sub10_sub4,
				   null, Class55.anIntArray1103[arg5], 0,
				   i_40_, i_39_);
		    if (class11_sub10_sub2.aBoolean1991) {
			if ((arg5 ^ 0xffffffff) != -1) {
			    if ((arg5 ^ 0xffffffff) != -2) {
				if (arg5 != 2) {
				    if (arg5 == 3)
					Class24.aByteArrayArrayArray443
					    [arg0][arg2][arg8]
					    = (byte) 50;
				} else
				    Class24.aByteArrayArrayArray443[arg0]
					[1 + arg2][arg8]
					= (byte) 50;
			    } else
				Class24.aByteArrayArrayArray443[arg0]
				    [arg2 + 1][1 + arg8]
				    = (byte) 50;
			} else
			    Class24.aByteArrayArrayArray443[arg0][arg2][(arg8
									 - -1)]
				= (byte) 50;
		    }
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method86(class11_sub10_sub2.aBoolean1969, true,
				      arg5, arg8, arg2, arg6);
		} else if ((arg6 ^ 0xffffffff) == -3) {
		    int i_47_ = 1 + arg5 & 0x3;
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    Class11_Sub10_Sub4 class11_sub10_sub4_48_;
		    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0
			&& class11_sub10_sub2.anIntArray1980 == null) {
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(4 + arg5, i, i_37_,
							   i_35_, 2, -86,
							   i_36_);
			class11_sub10_sub4_48_
			    = class11_sub10_sub2.method235(i_47_, i, i_37_,
							   i_35_, 2, -114,
							   i_36_);
		    } else {
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, 2, 4 - -arg5,
							  i_35_, i, i_36_,
							  i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
			class11_sub10_sub4_48_
			    = new Class11_Sub10_Sub4_Sub5(arg1, 2, i_47_,
							  i_35_, i, i_36_,
							  i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    }
		    arg7.method823(arg0, arg2, arg8, i_38_, class11_sub10_sub4,
				   class11_sub10_sub4_48_,
				   Class11_Sub10_Sub1.anIntArray1950[arg5],
				   Class11_Sub10_Sub1.anIntArray1950[i_47_],
				   i_40_, i_39_);
		    if (class11_sub10_sub2.aBoolean1978) {
			if ((arg5 ^ 0xffffffff) != -1) {
			    if ((arg5 ^ 0xffffffff) == -2) {
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [arg2][arg8 - -1]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][arg2][arg8 - -1]),
					1170));
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [arg2 - -1][arg8]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][arg2 - -1][arg8]),
					585));
			    } else if (arg5 != 2) {
				if (arg5 == 3) {
				    Class11_Sub6.anIntArrayArrayArray1587
					[arg0][arg2][arg8]
					= (Class11_Sub10_Sub6.method345
					   ((Class11_Sub6
					     .anIntArrayArrayArray1587[arg0]
					     [arg2][arg8]),
					    1170));
				    Class11_Sub6.anIntArrayArrayArray1587
					[arg0][arg2][arg8]
					= (Class11_Sub10_Sub6.method345
					   ((Class11_Sub6
					     .anIntArrayArrayArray1587[arg0]
					     [arg2][arg8]),
					    585));
				}
			    } else {
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [arg2 + 1][arg8]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][arg2 + 1][arg8]),
					585));
				Class11_Sub6.anIntArrayArrayArray1587[arg0]
				    [arg2][arg8]
				    = (Class11_Sub10_Sub6.method345
				       ((Class11_Sub6.anIntArrayArrayArray1587
					 [arg0][arg2][arg8]),
					1170));
			    }
			} else {
			    Class11_Sub6.anIntArrayArrayArray1587[arg0]
				[arg2][arg8]
				= (Class11_Sub10_Sub6.method345
				   ((Class11_Sub6.anIntArrayArrayArray1587
				     [arg0][arg2][arg8]),
				    585));
			    Class11_Sub6.anIntArrayArrayArray1587[arg0]
				[arg2][1 + arg8]
				= (Class11_Sub10_Sub6.method345
				   ((Class11_Sub6.anIntArrayArrayArray1587
				     [arg0][arg2][1 + arg8]),
				    1170));
			}
		    }
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method86(class11_sub10_sub2.aBoolean1969, true,
				      arg5, arg8, arg2, arg6);
		    if ((class11_sub10_sub2.anInt1993 ^ 0xffffffff) != -17)
			arg7.method794(arg0, arg2, arg8,
				       class11_sub10_sub2.anInt1993);
		} else if ((arg6 ^ 0xffffffff) == -4) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0
			&& class11_sub10_sub2.anIntArray1980 == null)
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, 3, -65,
							   i_36_);
		    else
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, 3, arg5, i_35_,
							  i, i_36_, i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    arg7.method823(arg0, arg2, arg8, i_38_, class11_sub10_sub4,
				   null, Class55.anIntArray1103[arg5], 0,
				   i_40_, i_39_);
		    if (class11_sub10_sub2.aBoolean1991) {
			if (arg5 == 0)
			    Class24.aByteArrayArrayArray443[arg0][arg2]
				[1 + arg8]
				= (byte) 50;
			else if ((arg5 ^ 0xffffffff) != -2) {
			    if ((arg5 ^ 0xffffffff) != -3) {
				if ((arg5 ^ 0xffffffff) == -4)
				    Class24.aByteArrayArrayArray443[arg0]
					[arg2][arg8]
					= (byte) 50;
			    } else
				Class24.aByteArrayArrayArray443[arg0]
				    [1 + arg2][arg8]
				    = (byte) 50;
			} else
			    Class24.aByteArrayArrayArray443[arg0][1 + arg2]
				[1 + arg8]
				= (byte) 50;
		    }
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method86(class11_sub10_sub2.aBoolean1969, true,
				      arg5, arg8, arg2, arg6);
		} else if (arg6 == 9) {
		    Class11_Sub10_Sub4 class11_sub10_sub4;
		    if (class11_sub10_sub2.anInt1987 == -1
			&& class11_sub10_sub2.anIntArray1980 == null)
			class11_sub10_sub4
			    = class11_sub10_sub2.method235(arg5, i, i_37_,
							   i_35_, arg6, -41,
							   i_36_);
		    else
			class11_sub10_sub4
			    = new Class11_Sub10_Sub4_Sub5(arg1, arg6, arg5,
							  i_35_, i, i_36_,
							  i_37_,
							  (class11_sub10_sub2
							   .anInt1987),
							  true);
		    arg7.method793(arg0, arg2, arg8, i_38_, 1, 1,
				   class11_sub10_sub4, 0, i_40_, i_39_);
		    if (class11_sub10_sub2.aBoolean1960 && arg4 != null)
			arg4.method89(class11_sub10_sub2.anInt1974,
				      class11_sub10_sub2.aBoolean1969, arg2,
				      arg5, 19398920, arg8,
				      class11_sub10_sub2.anInt1967);
		} else {
		    if (class11_sub10_sub2.aBoolean2011) {
			if ((arg5 ^ 0xffffffff) == -2) {
			    int i_49_ = i_37_;
			    i_37_ = i_36_;
			    i_36_ = i;
			    i = i_35_;
			    i_35_ = i_49_;
			} else if (arg5 != 2) {
			    if ((arg5 ^ 0xffffffff) == -4) {
				int i_50_ = i_37_;
				i_37_ = i_35_;
				i_35_ = i;
				i = i_36_;
				i_36_ = i_50_;
			    }
			} else {
			    int i_51_ = i_37_;
			    i_37_ = i;
			    i = i_51_;
			    i_51_ = i_36_;
			    i_36_ = i_35_;
			    i_35_ = i_51_;
			}
		    }
		    if ((arg6 ^ 0xffffffff) == -5) {
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) == 0
			    && class11_sub10_sub2.anIntArray1980 == null)
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(0, i, i_37_,
							       i_35_, 4, -57,
							       i_36_);
			else
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 4, 0, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			arg7.method829(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4,
				       Class11_Sub10_Sub1.anIntArray1950[arg5],
				       arg5 * 512, 0, 0, i_40_, i_39_);
		    } else if (arg6 == 5) {
			int i_52_ = 16;
			int i_53_ = arg7.method842(arg0, arg2, arg8);
			if ((i_53_ ^ 0xffffffff) < -1)
			    i_52_
				= (Class51.method853
				   ((byte) -108, 0x7fff & i_53_ >> 2056017326)
				   .anInt1993);
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if (class11_sub10_sub2.anInt1987 != -1
			    || class11_sub10_sub2.anIntArray1980 != null)
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 4, 0, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			else
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(0, i, i_37_,
							       i_35_, 4, -68,
							       i_36_);
			arg7.method829(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4,
				       Class11_Sub10_Sub1.anIntArray1950[arg5],
				       arg5 * 512, anIntArray797[arg5] * i_52_,
				       (Class11_Sub10_Sub4_Sub1.anIntArray2458
					[arg5]) * i_52_,
				       i_40_, i_39_);
		    } else if (arg6 == 6) {
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if (class11_sub10_sub2.anInt1987 != -1
			    || class11_sub10_sub2.anIntArray1980 != null)
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 4, 0, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			else
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(0, i, i_37_,
							       i_35_, 4, -114,
							       i_36_);
			arg7.method829(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4, 256, arg5, 0, 0,
				       i_40_, i_39_);
		    } else if ((arg6 ^ 0xffffffff) == -8) {
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if (class11_sub10_sub2.anInt1987 != -1
			    || class11_sub10_sub2.anIntArray1980 != null)
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 4, 0, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			else
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(0, i, i_37_,
							       i_35_, 4, -57,
							       i_36_);
			arg7.method829(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4, 512, arg5, 0, 0,
				       i_40_, i_39_);
		    } else if ((arg6 ^ 0xffffffff) == -9) {
			Class11_Sub10_Sub4 class11_sub10_sub4;
			if ((class11_sub10_sub2.anInt1987 ^ 0xffffffff) != 0
			    || class11_sub10_sub2.anIntArray1980 != null)
			    class11_sub10_sub4
				= (new Class11_Sub10_Sub4_Sub5
				   (arg1, 4, 0, i_35_, i, i_36_, i_37_,
				    class11_sub10_sub2.anInt1987, true));
			else
			    class11_sub10_sub4
				= class11_sub10_sub2.method235(0, i, i_37_,
							       i_35_, 4, -90,
							       i_36_);
			arg7.method829(arg0, arg2, arg8, i_38_,
				       class11_sub10_sub4, 768, arg5, 0, 0,
				       i_40_, i_39_);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rb.K(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ','
				     + (arg4 != null ? "{...}" : "null") + ','
				     + arg5 + ',' + arg6 + ','
				     + (arg7 != null ? "{...}" : "null") + ','
				     + arg8 + ')'));
	}
    }
    
    public static boolean method764(Class11_Sub10_Sub5 arg0, byte arg1) {
	try {
	    anInt801++;
	    if (arg0.anIntArray2110 == null)
		return false;
	    if (arg1 > -27)
		anIntArray797 = null;
	    for (int i = 0;
		 (arg0.anIntArray2110.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_54_ = Class61.method963(i, 22562, arg0);
		int i_55_ = arg0.anIntArray2112[i];
		if ((arg0.anIntArray2110[i] ^ 0xffffffff) == -3) {
		    if ((i_55_ ^ 0xffffffff) >= (i_54_ ^ 0xffffffff))
			return false;
		} else if (arg0.anIntArray2110[i] == 3) {
		    if ((i_54_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff))
			return false;
		} else if (arg0.anIntArray2110[i] == 4) {
		    if ((i_54_ ^ 0xffffffff) == (i_55_ ^ 0xffffffff))
			return false;
		} else if (i_55_ != i_54_)
		    return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "rb.C(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static void method765(byte[] arg0, int arg1, int arg2,
				 Class64 arg3) {
	try {
	    anInt816++;
	    Class11_Sub11 class11_sub11 = new Class11_Sub11();
	    class11_sub11.aClass64_1689 = arg3;
	    class11_sub11.aLong231 = (long) arg2;
	    class11_sub11.anInt1686 = 0;
	    class11_sub11.aByteArray1682 = arg0;
	    if (arg1 != 20165)
		aClass55_Sub1Array820 = null;
	    synchronized (Class39_Sub1.aClass36_1822) {
		Class39_Sub1.aClass36_1822.method691((byte) -98,
						     class11_sub11);
	    }
	    Class11_Sub10_Sub4_Sub3.method291(arg1 + -20271);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("rb.A("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method766(int arg0, int arg1, int arg2) {
	anInt812++;
	Class36 class36
	    = Class51.aClass36ArrayArrayArray1007[Class1.anInt82][arg1][arg0];
	if (class36 == null)
	    Class52.aClass49_1024.method820(Class1.anInt82, arg1, arg0);
	else {
	    Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3 = null;
	    Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3_56_
		= (Class11_Sub10_Sub4_Sub3) class36.method694((byte) -117);
	    int i = -99999999;
	    for (/**/; class11_sub10_sub4_sub3_56_ != null;
		 class11_sub10_sub4_sub3_56_
		     = (Class11_Sub10_Sub4_Sub3) class36.method701(0)) {
		Class11_Sub10_Sub15 class11_sub10_sub15
		    = Class60.method950(-113,
					class11_sub10_sub4_sub3_56_.anInt2578);
		int i_57_ = class11_sub10_sub15.anInt2387;
		if (class11_sub10_sub15.aBoolean2405)
		    i_57_ *= 1 + class11_sub10_sub4_sub3_56_.anInt2588;
		if ((i_57_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
		    i = i_57_;
		    class11_sub10_sub4_sub3 = class11_sub10_sub4_sub3_56_;
		}
	    }
	    class36.method699((byte) -119, class11_sub10_sub4_sub3);
	    Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3_58_ = null;
	    class11_sub10_sub4_sub3_56_
		= (Class11_Sub10_Sub4_Sub3) class36.method694((byte) -115);
	    Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3_59_ = null;
	    for (/**/; class11_sub10_sub4_sub3_56_ != null;
		 class11_sub10_sub4_sub3_56_
		     = (Class11_Sub10_Sub4_Sub3) class36.method701(0)) {
		if (((class11_sub10_sub4_sub3.anInt2578 ^ 0xffffffff)
		     != (class11_sub10_sub4_sub3_56_.anInt2578 ^ 0xffffffff))
		    && class11_sub10_sub4_sub3_58_ == null)
		    class11_sub10_sub4_sub3_58_ = class11_sub10_sub4_sub3_56_;
		if (((class11_sub10_sub4_sub3_56_.anInt2578 ^ 0xffffffff)
		     != (class11_sub10_sub4_sub3.anInt2578 ^ 0xffffffff))
		    && (class11_sub10_sub4_sub3_58_.anInt2578
			!= class11_sub10_sub4_sub3_56_.anInt2578)
		    && class11_sub10_sub4_sub3_59_ == null)
		    class11_sub10_sub4_sub3_59_ = class11_sub10_sub4_sub3_56_;
	    }
	    int i_60_ = 1610612736 + (arg1 - -(arg0 << -1246618137));
	    Class52.aClass49_1024.method810
		(Class1.anInt82, arg1, arg0,
		 Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82,
						   128 * arg1 + 64, 3,
						   64 + arg0 * 128),
		 class11_sub10_sub4_sub3, i_60_, class11_sub10_sub4_sub3_58_,
		 class11_sub10_sub4_sub3_59_);
	    if (arg2 <= 54)
		method758(16);
	}
    }
    
    public static void method767(byte arg0) {
	try {
	    anInt804++;
	    if (arg0 >= -38)
		aClass11_Sub10_Sub13_Sub3_811 = null;
	    Class11_Sub10_Sub4_Sub1.aClass40_2489.method740(4);
	    Class23.aClass40_419.method740(4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "rb.H(" + arg0 + ')');
	}
    }
    
    static {
	anInt800 = -1;
	anInt794 = 0;
	aClass31_799 = null;
	aClass55_Sub1Array820 = new Class55_Sub1[256];
	aClass31_819 = Class64.method992("glow3:", 255);
    }
}
