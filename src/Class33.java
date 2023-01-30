/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class33
{
    public static int anInt599;
    public static int anInt600;
    public static Class55 aClass55_601;
    public byte[] aByteArray602;
    public static boolean aBoolean603;
    public static Class31 aClass31_604
	= Class64.method992("Report abuse", 255);
    public int[] anIntArray605;
    public static int anInt606;
    public static Class32 aClass32_607;
    public static int anInt608;
    public static boolean aBoolean609 = false;
    public int[] anIntArray610;
    public static int anInt611;
    public static byte[][][] aByteArrayArrayArray612;
    public static Class40 aClass40_613;
    public static Class31 aClass31_614;
    public static Class31 aClass31_615;
    public static Class31 aClass31_616;
    public static Class64 aClass64_617;
    public static Class55_Sub1 aClass55_Sub1_618;
    public static int anInt619;
    public static Class31 aClass31_620;
    
    public static void method664(boolean arg0) {
	try {
	    anInt606++;
	    if (arg0 != true)
		aClass31_604 = null;
	    for (Class11_Sub8 class11_sub8
		     = ((Class11_Sub8)
			Class37_Sub1.aClass36_1794.method694((byte) -118));
		 class11_sub8 != null;
		 class11_sub8 = ((Class11_Sub8)
				 Class37_Sub1.aClass36_1794.method701(0))) {
		if (class11_sub8.anInt1632 > 0)
		    class11_sub8.anInt1632--;
		if ((class11_sub8.anInt1632 ^ 0xffffffff) == -1) {
		    if ((class11_sub8.anInt1618 ^ 0xffffffff) > -1
			|| Class42.method745(class11_sub8.anInt1618, -123,
					     class11_sub8.anInt1636)) {
			Class54.method871(class11_sub8.anInt1626,
					  class11_sub8.anInt1615, false,
					  class11_sub8.anInt1619,
					  class11_sub8.anInt1636,
					  class11_sub8.anInt1614,
					  class11_sub8.anInt1618,
					  class11_sub8.anInt1629);
			class11_sub8.method107(0);
		    }
		} else {
		    if ((class11_sub8.anInt1633 ^ 0xffffffff) < -1)
			class11_sub8.anInt1633--;
		    if (class11_sub8.anInt1633 == 0
			&& class11_sub8.anInt1615 >= 1
			&& (class11_sub8.anInt1619 ^ 0xffffffff) <= -2
			&& class11_sub8.anInt1615 <= 102
			&& class11_sub8.anInt1619 <= 102
			&& (class11_sub8.anInt1634 < 0
			    || Class42.method745(class11_sub8.anInt1634, 74,
						 class11_sub8.anInt1617))) {
			Class54.method871(class11_sub8.anInt1626,
					  class11_sub8.anInt1615, !arg0,
					  class11_sub8.anInt1619,
					  class11_sub8.anInt1617,
					  class11_sub8.anInt1614,
					  class11_sub8.anInt1634,
					  class11_sub8.anInt1635);
			class11_sub8.anInt1633 = -1;
			if (((class11_sub8.anInt1634 ^ 0xffffffff)
			     == (class11_sub8.anInt1618 ^ 0xffffffff))
			    && class11_sub8.anInt1618 == -1)
			    class11_sub8.method107(0);
			else if ((class11_sub8.anInt1618
				  == class11_sub8.anInt1634)
				 && ((class11_sub8.anInt1629 ^ 0xffffffff)
				     == (class11_sub8.anInt1635 ^ 0xffffffff))
				 && (class11_sub8.anInt1617
				     == class11_sub8.anInt1636))
			    class11_sub8.method107(0);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ob.D(" + arg0 + ')');
	}
    }
    
    public static void method665(boolean arg0) {
	try {
	    anInt608++;
	    if (arg0 != false)
		method666(115);
	    Class25.aClass40_475.method740(4);
	    Class50.aClass40_998.method740(4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ob.C(" + arg0 + ')');
	}
    }
    
    public static void method666(int arg0) {
	try {
	    aClass55_Sub1_618 = null;
	    aClass31_620 = null;
	    aClass32_607 = null;
	    aClass31_614 = null;
	    if (arg0 > -76)
		method664(false);
	    aClass64_617 = null;
	    aClass40_613 = null;
	    aClass31_615 = null;
	    aClass31_604 = null;
	    aClass31_616 = null;
	    aClass55_601 = null;
	    aByteArrayArrayArray612 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ob.A(" + arg0 + ')');
	}
    }
    
    public int method667(int arg0, int arg1, int arg2, byte[] arg3, int arg4,
			 byte[] arg5) {
	try {
	    anInt599++;
	    if ((arg1 ^ 0xffffffff) == arg4)
		return 0;
	    arg1 += arg0;
	    int i = 0;
	    int i_0_ = arg2;
	    for (;;) {
		byte i_1_ = arg3[i_0_];
		if ((i_1_ ^ 0xffffffff) <= -1)
		    i++;
		else
		    i = anIntArray605[i];
		int i_2_;
		if (((i_2_ = anIntArray605[i]) ^ 0xffffffff) > -1) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if (arg1 <= arg0)
			break;
		    i = 0;
		}
		if ((0x40 & i_1_ ^ 0xffffffff) != -1)
		    i = anIntArray605[i];
		else
		    i++;
		if (((i_2_ = anIntArray605[i]) ^ 0xffffffff) > -1) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if ((arg1 ^ 0xffffffff) >= (arg0 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((0x20 & i_1_ ^ 0xffffffff) != -1)
		    i = anIntArray605[i];
		else
		    i++;
		if ((i_2_ = anIntArray605[i]) < 0) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if (arg1 <= arg0)
			break;
		    i = 0;
		}
		if ((i_1_ & 0x10) != 0)
		    i = anIntArray605[i];
		else
		    i++;
		if (((i_2_ = anIntArray605[i]) ^ 0xffffffff) > -1) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if ((arg0 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_1_ & 0x8 ^ 0xffffffff) == -1)
		    i++;
		else
		    i = anIntArray605[i];
		if (((i_2_ = anIntArray605[i]) ^ 0xffffffff) > -1) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if (arg0 >= arg1)
			break;
		    i = 0;
		}
		if ((0x4 & i_1_) == 0)
		    i++;
		else
		    i = anIntArray605[i];
		if (((i_2_ = anIntArray605[i]) ^ 0xffffffff) > -1) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if ((arg1 ^ 0xffffffff) >= (arg0 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_1_ & 0x2) == 0)
		    i++;
		else
		    i = anIntArray605[i];
		if ((i_2_ = anIntArray605[i]) < 0) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if ((arg1 ^ 0xffffffff) >= (arg0 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((0x1 & i_1_ ^ 0xffffffff) == -1)
		    i++;
		else
		    i = anIntArray605[i];
		if ((i_2_ = anIntArray605[i]) < 0) {
		    arg5[arg0++] = (byte) (i_2_ ^ 0xffffffff);
		    if (arg1 <= arg0)
			break;
		    i = 0;
		}
		i_0_++;
	    }
	    return 1 + i_0_ - arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ob.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + (arg3 != null ? "{...}" : "null")
				     + ',' + arg4 + ','
				     + (arg5 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public int method668(byte[] arg0, int arg1, byte[] arg2, int arg3,
			 byte arg4, int arg5) {
	try {
	    if (arg4 > -20)
		aClass31_615 = null;
	    int i = 0;
	    arg1 += arg3;
	    int i_3_ = arg5 << -893227965;
	    anInt600++;
	    for (/**/; (arg1 ^ 0xffffffff) < (arg3 ^ 0xffffffff); arg3++) {
		int i_4_ = arg0[arg3] & 0xff;
		int i_5_ = aByteArray602[i_4_];
		int i_6_ = anIntArray610[i_4_];
		if (i_5_ == 0)
		    throw new RuntimeException("No codeword for data value "
					       + i_4_);
		int i_7_ = i_3_ >> 1928862339;
		int i_8_ = 0x7 & i_3_;
		int i_9_ = (-1 + (i_8_ - -i_5_) >> -965353309) + i_7_;
		i &= -i_8_ >> -2004012577;
		i_8_ += 24;
		arg2[i_7_]
		    = (byte) (i = Class11_Sub10_Sub6.method345(i,
							       i_6_ >>> i_8_));
		if (i_7_ < i_9_) {
		    i_8_ -= 8;
		    i_7_++;
		    arg2[i_7_] = (byte) (i = i_6_ >>> i_8_);
		    if (i_9_ > i_7_) {
			i_8_ -= 8;
			i_7_++;
			arg2[i_7_] = (byte) (i = i_6_ >>> i_8_);
			if (i_9_ > i_7_) {
			    i_8_ -= 8;
			    i_7_++;
			    arg2[i_7_] = (byte) (i = i_6_ >>> i_8_);
			    if (i_7_ < i_9_) {
				i_8_ -= 8;
				i_7_++;
				arg2[i_7_] = (byte) (i = i_6_ << -i_8_);
			    }
			}
		    }
		}
		i_3_ += i_5_;
	    }
	    return -arg5 + (7 + i_3_ >> -99929885);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ob.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ',' + arg4 + ',' + arg5 + ')'));
	}
    }
    
    public Class33(byte[] arg0) {
	try {
	    int[] is = new int[33];
	    int i = arg0.length;
	    anIntArray610 = new int[i];
	    anIntArray605 = new int[8];
	    int i_10_ = 0;
	    aByteArray602 = arg0;
	    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_11_++) {
		int i_12_ = arg0[i_11_];
		if (i_12_ != 0) {
		    int i_13_ = 1 << -i_12_ + 32;
		    int i_14_ = is[i_12_];
		    anIntArray610[i_11_] = i_14_;
		    int i_15_;
		    if ((i_14_ & i_13_) == 0) {
			i_15_ = i_14_ | i_13_;
			for (int i_16_ = -1 + i_12_; i_16_ >= 1; i_16_--) {
			    int i_17_ = is[i_16_];
			    if ((i_17_ ^ 0xffffffff) != (i_14_ ^ 0xffffffff))
				break;
			    int i_18_ = 1 << -i_16_ + 32;
			    if ((i_17_ & i_18_ ^ 0xffffffff) == -1)
				is[i_16_]
				    = Class11_Sub10_Sub6.method345(i_18_,
								   i_17_);
			    else {
				is[i_16_] = is[i_16_ - 1];
				break;
			    }
			}
		    } else
			i_15_ = is[-1 + i_12_];
		    is[i_12_] = i_15_;
		    for (int i_19_ = 1 + i_12_; (i_19_ ^ 0xffffffff) >= -33;
			 i_19_++) {
			if (i_14_ == is[i_19_])
			    is[i_19_] = i_15_;
		    }
		    int i_20_ = 0;
		    for (int i_21_ = 0; i_12_ > i_21_; i_21_++) {
			int i_22_ = -2147483648 >>> i_21_;
			if ((i_14_ & i_22_) == 0)
			    i_20_++;
			else {
			    if (anIntArray605[i_20_] == 0)
				anIntArray605[i_20_] = i_10_;
			    i_20_ = anIntArray605[i_20_];
			}
			i_22_ >>>= 1;
			if (anIntArray605.length <= i_20_) {
			    int[] is_23_ = new int[anIntArray605.length * 2];
			    for (int i_24_ = 0; i_24_ < anIntArray605.length;
				 i_24_++)
				is_23_[i_24_] = anIntArray605[i_24_];
			    anIntArray605 = is_23_;
			}
		    }
		    anIntArray605[i_20_] = i_11_ ^ 0xffffffff;
		    if ((i_20_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff))
			i_10_ = 1 + i_20_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ob.<init>(" + (arg0 != null ? "{...}"
						    : "null") + ')');
	}
    }
    
    static {
	aClass32_607 = new Class32();
	aClass40_613 = new Class40(30);
	aClass31_614
	    = (Class64.method992
	       ("*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3",
		255));
	aClass31_616 = Class64.method992("(U1", 255);
	aClass31_615 = Class64.method992("Choose Option", 255);
	anInt619 = 0;
	aClass31_620 = Class64.method992("Walk here @whi@", 255);
    }
}
