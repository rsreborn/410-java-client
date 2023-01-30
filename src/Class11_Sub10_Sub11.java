/* Class11_Sub10_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class11_Sub10_Sub11 extends Class11_Sub10
{
    public int anInt2243;
    public int anInt2244;
    public static Class31 aClass31_2245
	= Class64.method992("*6n*6nRecovery Questions Last Set:*6n@gre@", 255);
    public static int anInt2246;
    public int[] anIntArray2247;
    public int anInt2248 = 0;
    public static int anInt2249;
    public static int anInt2250;
    public int anInt2251 = 128;
    public int anInt2252;
    public static Class31 aClass31_2253
	= Class64.method992("Loading wordpack )2 0(U", 255);
    public static int anInt2254;
    public int[] anIntArray2255;
    public int anInt2256;
    public static byte[][] aByteArrayArray2257;
    public static int anInt2258;
    public static int anInt2259;
    public int anInt2260;
    public static Graphics aGraphics2261;
    public int anInt2262;
    public static Class36 aClass36_2263 = new Class36();
    public static Class31 aClass31_2264;
    public static Class31 aClass31_2265;
    public static Class31 aClass31_2266;
    public static Class31 aClass31_2267
	= Class64.method992("Login to a members(W server to use this object)3",
			    255);
    public static byte[] aByteArray2268;
    public static int anInt2269;
    
    public Class11_Sub10_Sub4_Sub4 method378(byte arg0, int arg1) {
	try {
	    anInt2258++;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= ((Class11_Sub10_Sub4_Sub4)
		   Class33.aClass40_613.method735((long) anInt2252,
						  (byte) -115));
	    if (class11_sub10_sub4_sub4 == null) {
		class11_sub10_sub4_sub4
		    = Class11_Sub10_Sub4_Sub4
			  .method322(Class37_Sub1.aClass55_1792, anInt2260, 0);
		if (class11_sub10_sub4_sub4 == null)
		    return null;
		for (int i = 0; i < 6; i++) {
		    if ((anIntArray2247[0] ^ 0xffffffff) != -1)
			class11_sub10_sub4_sub4.method299(anIntArray2247[i],
							  anIntArray2255[i]);
		}
		class11_sub10_sub4_sub4.method319();
		class11_sub10_sub4_sub4.method312(64 + anInt2256,
						  anInt2248 + 850, -30, -50,
						  -30, true);
		Class33.aClass40_613.method742(arg0 ^ 0x51, (long) anInt2252,
					       class11_sub10_sub4_sub4);
	    }
	    if (arg0 != -39)
		return null;
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_0_;
	    if (anInt2262 == -1 || arg1 == -1)
		class11_sub10_sub4_sub4_0_
		    = class11_sub10_sub4_sub4.method306(true);
	    else
		class11_sub10_sub4_sub4_0_
		    = NotActuallyBuffer.method600(anInt2262, 4867)
			  .method386(class11_sub10_sub4_sub4, arg1, (byte) 98);
	    if (anInt2243 != 128 || anInt2251 != 128)
		class11_sub10_sub4_sub4_0_.method315(anInt2243, anInt2251,
						     anInt2243);
	    if ((anInt2244 ^ 0xffffffff) != -1) {
		if ((anInt2244 ^ 0xffffffff) == -91)
		    class11_sub10_sub4_sub4_0_.method307();
		if (anInt2244 == 180) {
		    class11_sub10_sub4_sub4_0_.method307();
		    class11_sub10_sub4_sub4_0_.method307();
		}
		if ((anInt2244 ^ 0xffffffff) == -271) {
		    class11_sub10_sub4_sub4_0_.method307();
		    class11_sub10_sub4_sub4_0_.method307();
		    class11_sub10_sub4_sub4_0_.method307();
		}
	    }
	    return class11_sub10_sub4_sub4_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ee.F(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method379(boolean arg0, Class11_Sub10_Sub13_Sub3 arg1) {
	anInt2250++;
	int i = 256;
	for (int i_1_ = 0; Class15_Sub1.anIntArray1734.length > i_1_; i_1_++)
	    Class15_Sub1.anIntArray1734[i_1_] = 0;
	for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5001; i_2_++) {
	    int i_3_ = (int) ((double) i * (128.0 * Math.random()));
	    Class15_Sub1.anIntArray1734[i_3_] = (int) (256.0 * Math.random());
	}
	if (arg0 != true)
	    aClass36_2263 = null;
	for (int i_4_ = 0; i_4_ < 20; i_4_++) {
	    for (int i_5_ = 1; i + -1 > i_5_; i_5_++) {
		for (int i_6_ = 1; i_6_ < 127; i_6_++) {
		    int i_7_ = (i_5_ << 1167875111) + i_6_;
		    Class55_Sub1.anIntArray1871[i_7_]
			= (Class15_Sub1.anIntArray1734[-1 + i_7_]
			   + (Class15_Sub1.anIntArray1734[1 + i_7_]
			      + Class15_Sub1.anIntArray1734[-128 + i_7_]
			      - -Class15_Sub1.anIntArray1734[128 + i_7_])) / 4;
		}
	    }
	    int[] is = Class15_Sub1.anIntArray1734;
	    Class15_Sub1.anIntArray1734 = Class55_Sub1.anIntArray1871;
	    Class55_Sub1.anIntArray1871 = is;
	}
	if (arg1 != null) {
	    int i_8_ = 0;
	    for (int i_9_ = 0;
		 (arg1.anInt2772 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
		for (int i_10_ = 0;
		     (arg1.anInt2766 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		     i_10_++) {
		    if (arg1.aByteArray2768[i_8_++] != 0) {
			int i_11_ = 16 + i_9_ + arg1.anInt2767;
			int i_12_ = arg1.anInt2769 + 16 + i_10_;
			int i_13_ = (i_11_ << 804576007) + i_12_;
			Class15_Sub1.anIntArray1734[i_13_] = 0;
		    }
		}
	    }
	}
    }
    
    public static void method380(Class8[] arg0, Class49 arg1, int arg2) {
	try {
	    int i = 17 % ((55 - arg2) / 52);
	    for (int i_14_ = 0; i_14_ < 4; i_14_++) {
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -105; i_15_++) {
		    for (int i_16_ = 0; i_16_ < 104; i_16_++) {
			if (((Class25.aByteArrayArrayArray481[i_14_][i_15_]
			      [i_16_]) & 0x1
			     ^ 0xffffffff)
			    == -2) {
			    int i_17_ = i_14_;
			    if ((0x2 & (Class25.aByteArrayArrayArray481[1]
					[i_15_][i_16_]))
				== 2)
				i_17_--;
			    if ((i_17_ ^ 0xffffffff) <= -1)
				arg0[i_17_].method94(i_16_, 2097152, i_15_);
			}
		    }
		}
	    }
	    anInt2259++;
	    Class11_Sub10_Sub4_Sub1.anInt2478
		+= (int) (Math.random() * 5.0) + -2;
	    if ((Class11_Sub10_Sub4_Sub1.anInt2478 ^ 0xffffffff) > 15)
		Class11_Sub10_Sub4_Sub1.anInt2478 = -16;
	    Class43.anInt777 += -2 + (int) (5.0 * Math.random());
	    if (Class43.anInt777 < -8)
		Class43.anInt777 = -8;
	    if ((Class11_Sub10_Sub4_Sub1.anInt2478 ^ 0xffffffff) < -17)
		Class11_Sub10_Sub4_Sub1.anInt2478 = 16;
	    if (Class43.anInt777 > 8)
		Class43.anInt777 = 8;
	    for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -5; i_18_++) {
		byte[][] is = Class24.aByteArrayArrayArray443[i_18_];
		int i_19_ = (int) Math.sqrt(5100.0);
		int i_20_ = i_19_ * 768 >> 1240961032;
		for (int i_21_ = 1; i_21_ < 103; i_21_++) {
		    for (int i_22_ = 1; i_22_ < 103; i_22_++) {
			int i_23_ = ((Class51.anIntArrayArrayArray1005[i_18_]
				      [i_22_ + 1][i_21_])
				     - (Class51.anIntArrayArrayArray1005[i_18_]
					[-1 + i_22_][i_21_]));
			int i_24_ = (-(Class51.anIntArrayArrayArray1005[i_18_]
				       [i_22_][i_21_ + -1])
				     + (Class51.anIntArrayArrayArray1005[i_18_]
					[i_22_][i_21_ - -1]));
			int i_25_ = (int) Math.sqrt((double) (i_24_ * i_24_
							      + (i_23_ * i_23_
								 + 65536)));
			int i_26_ = 65536 / i_25_;
			int i_27_ = (i_23_ << 1088119400) / i_25_;
			int i_28_ = (i_24_ << 772503464) / i_25_;
			int i_29_ = ((i_26_ * -10
				      + (-50 * i_27_ - -(-50 * i_28_))) / i_20_
				     + 96);
			int i_30_
			    = ((is[i_22_][1 + i_21_] >> -1653784637)
			       + (is[i_22_ + -1][i_21_] >> 1347141378)
			       - (-(is[i_22_ - -1][i_21_] >> 459361795)
				  + -(is[i_22_][-1 + i_21_] >> -332272990))
			       + (is[i_22_][i_21_] >> 1734630977));
			Class62.anIntArrayArray1298[i_22_][i_21_]
			    = -i_30_ + i_29_;
		    }
		}
		for (int i_31_ = 0; i_31_ < 104; i_31_++) {
		    Class47.anIntArray864[i_31_] = 0;
		    Class11_Sub10_Sub12.anIntArray2292[i_31_] = 0;
		    Class11_Sub10.anIntArray1674[i_31_] = 0;
		    Class44.anIntArray795[i_31_] = 0;
		    Class39_Sub1.anIntArray1827[i_31_] = 0;
		}
		for (int i_32_ = -5; i_32_ < 109; i_32_++) {
		    for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -105; i_33_++) {
			int i_34_ = i_32_ + 5;
			if (i_34_ >= 0 && i_34_ < 104) {
			    int i_35_ = 0xff & (Class11_Sub10_Sub15
						.aByteArrayArrayArray2364
						[i_18_][i_34_][i_33_]);
			    if ((i_35_ ^ 0xffffffff) < -1) {
				Class11_Sub10_Sub8 class11_sub10_sub8
				    = Class46.method783(3, i_35_ + -1);
				Class47.anIntArray864[i_33_]
				    += class11_sub10_sub8.anInt2182;
				Class11_Sub10_Sub12.anIntArray2292[i_33_]
				    += class11_sub10_sub8.anInt2172;
				Class11_Sub10.anIntArray1674[i_33_]
				    += class11_sub10_sub8.anInt2170;
				Class44.anIntArray795[i_33_]
				    += class11_sub10_sub8.anInt2176;
				Class39_Sub1.anIntArray1827[i_33_]++;
			    }
			}
			int i_36_ = i_32_ + -5;
			if (i_36_ >= 0 && (i_36_ ^ 0xffffffff) > -105) {
			    int i_37_ = 0xff & (Class11_Sub10_Sub15
						.aByteArrayArrayArray2364
						[i_18_][i_36_][i_33_]);
			    if ((i_37_ ^ 0xffffffff) < -1) {
				Class11_Sub10_Sub8 class11_sub10_sub8
				    = Class46.method783(3, -1 + i_37_);
				Class47.anIntArray864[i_33_]
				    -= class11_sub10_sub8.anInt2182;
				Class11_Sub10_Sub12.anIntArray2292[i_33_]
				    -= class11_sub10_sub8.anInt2172;
				Class11_Sub10.anIntArray1674[i_33_]
				    -= class11_sub10_sub8.anInt2170;
				Class44.anIntArray795[i_33_]
				    -= class11_sub10_sub8.anInt2176;
				Class39_Sub1.anIntArray1827[i_33_]--;
			    }
			}
		    }
		    if ((i_32_ ^ 0xffffffff) <= -2
			&& (i_32_ ^ 0xffffffff) > -104) {
			int i_38_ = 0;
			int i_39_ = 0;
			int i_40_ = 0;
			int i_41_ = 0;
			int i_42_ = 0;
			for (int i_43_ = -5; i_43_ < 109; i_43_++) {
			    int i_44_ = i_43_ - -5;
			    if (i_44_ >= 0 && (i_44_ ^ 0xffffffff) > -105) {
				i_38_ += (Class11_Sub10_Sub12.anIntArray2292
					  [i_44_]);
				i_41_ += Class39_Sub1.anIntArray1827[i_44_];
				i_40_ += Class44.anIntArray795[i_44_];
				i_39_ += Class11_Sub10.anIntArray1674[i_44_];
				i_42_ += Class47.anIntArray864[i_44_];
			    }
			    int i_45_ = -5 + i_43_;
			    if (i_45_ >= 0 && (i_45_ ^ 0xffffffff) > -105) {
				i_41_ -= Class39_Sub1.anIntArray1827[i_45_];
				i_39_ -= Class11_Sub10.anIntArray1674[i_45_];
				i_40_ -= Class44.anIntArray795[i_45_];
				i_38_ -= (Class11_Sub10_Sub12.anIntArray2292
					  [i_45_]);
				i_42_ -= Class47.anIntArray864[i_45_];
			    }
			    if (i_43_ >= 1 && i_43_ < 103
				&& (!Class1.aBoolean94
				    || (0x2 & (Class25.aByteArrayArrayArray481
					       [0][i_32_][i_43_])
					^ 0xffffffff) != -1
				    || (((Class25.aByteArrayArrayArray481
					  [i_18_][i_32_][i_43_]) & 0x10
					 ^ 0xffffffff) == -1
					&& ((Class15_Sub2.method555(i_43_,
								    i_32_,
								    i_18_,
								    (byte) 124)
					     ^ 0xffffffff)
					    == (Class11_Sub10_Sub14.anInt2355
						^ 0xffffffff))))) {
				if ((Class11_Sub7.anInt1610 ^ 0xffffffff)
				    < (i_18_ ^ 0xffffffff))
				    Class11_Sub7.anInt1610 = i_18_;
				int i_46_
				    = 0xff & (Class36.aByteArrayArrayArray655
					      [i_18_][i_32_][i_43_]);
				int i_47_ = ((Class11_Sub10_Sub15
					      .aByteArrayArrayArray2364[i_18_]
					      [i_32_][i_43_])
					     & 0xff);
				if (i_47_ > 0 || (i_46_ ^ 0xffffffff) < -1) {
				    int i_48_
					= (Class51.anIntArrayArrayArray1005
					   [i_18_][i_32_ - -1][i_43_]);
				    int i_49_
					= (Class51.anIntArrayArrayArray1005
					   [i_18_][i_32_][i_43_]);
				    int i_50_
					= (Class51.anIntArrayArrayArray1005
					   [i_18_][1 + i_32_][1 + i_43_]);
				    int i_51_ = (Class62.anIntArrayArray1298
						 [i_32_][i_43_]);
				    int i_52_ = (Class62.anIntArrayArray1298
						 [i_32_ - -1][i_43_]);
				    int i_53_
					= (Class51.anIntArrayArrayArray1005
					   [i_18_][i_32_][i_43_ - -1]);
				    int i_54_ = -1;
				    int i_55_ = -1;
				    int i_56_ = (Class62.anIntArrayArray1298
						 [i_32_][i_43_ - -1]);
				    int i_57_ = (Class62.anIntArrayArray1298
						 [i_32_ + 1][1 + i_43_]);
				    if ((i_47_ ^ 0xffffffff) < -1) {
					int i_58_ = i_42_ * 256 / i_40_;
					int i_59_ = i_38_ / i_41_;
					int i_60_ = i_39_ / i_41_;
					i_54_ = (Class11_Sub10_Sub9.method368
						 (i_60_, 16557, i_59_, i_58_));
					i_60_ += (Class11_Sub10_Sub4_Sub1
						  .anInt2478);
					i_58_
					    = Class43.anInt777 + i_58_ & 0xff;
					if (i_60_ < 0)
					    i_60_ = 0;
					else if (i_60_ > 255)
					    i_60_ = 255;
					i_55_ = (Class11_Sub10_Sub9.method368
						 (i_60_, 16557, i_59_, i_58_));
				    }
				    if ((i_18_ ^ 0xffffffff) < -1) {
					boolean bool = true;
					if (i_47_ == 0
					    && ((Class15_Sub1
						 .aByteArrayArrayArray1754
						 [i_18_][i_32_][i_43_])
						^ 0xffffffff) != -1)
					    bool = false;
					if (i_46_ > 0 && !(Class42.method748
							   (i_46_ + -1, 80)
							   .aBoolean2240))
					    bool = false;
					if (bool && i_49_ == i_48_
					    && i_49_ == i_50_
					    && ((i_49_ ^ 0xffffffff)
						== (i_53_ ^ 0xffffffff)))
					    Class11_Sub6
						.anIntArrayArrayArray1587
						[i_18_][i_32_][i_43_]
						= (Class11_Sub10_Sub6.method345
						   ((Class11_Sub6
						     .anIntArrayArrayArray1587
						     [i_18_][i_32_][i_43_]),
						    2340));
				    }
				    int i_61_ = 0;
				    if (i_55_ != -1)
					i_61_ = (Class11_Sub10_Sub13_Sub1
						 .anIntArray2740
						 [Class20.method570(12800, 96,
								    i_55_)]);
				    if ((i_46_ ^ 0xffffffff) != -1) {
					int i_62_
					    = 1 + (Class15_Sub1
						   .aByteArrayArrayArray1754
						   [i_18_][i_32_][i_43_]);
					byte i_63_
					    = (Class33.aByteArrayArrayArray612
					       [i_18_][i_32_][i_43_]);
					Class11_Sub10_Sub10 class11_sub10_sub10
					    = Class42.method748(-1 + i_46_,
								-125);
					int i_64_
					    = class11_sub10_sub10.anInt2221;
					int i_65_;
					int i_66_;
					if (i_64_ >= 0) {
					    i_65_ = -1;
					    i_66_ = Class11_Sub10_Sub13_Sub1
							.anInterface3_2727
							.method8(true, i_64_);
					} else if ((class11_sub10_sub10
						    .anInt2219)
						   != 16711935) {
					    i_65_
						= (Class11_Sub10_Sub9.method368
						   ((class11_sub10_sub10
						     .anInt2242),
						    16557,
						    (class11_sub10_sub10
						     .anInt2225),
						    (class11_sub10_sub10
						     .anInt2229)));
					    int i_67_
						= (0xff
						   & (Class43.anInt777
						      + (class11_sub10_sub10
							 .anInt2229)));
					    int i_68_
						= ((class11_sub10_sub10
						    .anInt2242)
						   + (Class11_Sub10_Sub4_Sub1
						      .anInt2478));
					    if (i_68_ < 0)
						i_68_ = 0;
					    else if ((i_68_ ^ 0xffffffff)
						     < -256)
						i_68_ = 255;
					    i_66_
						= (Class11_Sub10_Sub9.method368
						   (i_68_, 16557,
						    (class11_sub10_sub10
						     .anInt2225),
						    i_67_));
					} else {
					    i_66_ = -2;
					    i_64_ = -1;
					    i_65_ = -2;
					}
					int i_69_ = 0;
					if (i_66_ != -2)
					    i_69_ = (Class11_Sub10_Sub13_Sub1
						     .anIntArray2740
						     [(Class31.method647
						       (i_66_, 96, -22942))]);
					if (class11_sub10_sub10.anInt2241
					    != -1) {
					    int i_70_ = (((class11_sub10_sub10
							   .anInt2227)
							  - -Class43.anInt777)
							 & 0xff);
					    int i_71_
						= ((class11_sub10_sub10
						    .anInt2215)
						   - -(Class11_Sub10_Sub4_Sub1
						       .anInt2478));
					    if ((i_71_ ^ 0xffffffff) <= -1) {
						if ((i_71_ ^ 0xffffffff)
						    < -256)
						    i_71_ = 255;
					    } else
						i_71_ = 0;
					    i_66_
						= (Class11_Sub10_Sub9.method368
						   (i_71_, 16557,
						    (class11_sub10_sub10
						     .anInt2237),
						    i_70_));
					    i_69_ = (Class11_Sub10_Sub13_Sub1
						     .anIntArray2740
						     [(Class31.method647
						       (i_66_, 96, -22942))]);
					}
					arg1.method821
					    (i_18_, i_32_, i_43_, i_62_, i_63_,
					     i_64_, i_49_, i_48_, i_50_, i_53_,
					     Class20.method570(12800, i_51_,
							       i_54_),
					     Class20.method570(12800, i_52_,
							       i_54_),
					     Class20.method570(12800, i_57_,
							       i_54_),
					     Class20.method570(12800, i_56_,
							       i_54_),
					     Class31.method647(i_65_, i_51_,
							       -22942),
					     Class31.method647(i_65_, i_52_,
							       -22942),
					     Class31.method647(i_65_, i_57_,
							       -22942),
					     Class31.method647(i_65_, i_56_,
							       -22942),
					     i_61_, i_69_);
				    } else
					arg1.method821
					    (i_18_, i_32_, i_43_, 0, 0, -1,
					     i_49_, i_48_, i_50_, i_53_,
					     Class20.method570(12800, i_51_,
							       i_54_),
					     Class20.method570(12800, i_52_,
							       i_54_),
					     Class20.method570(12800, i_57_,
							       i_54_),
					     Class20.method570(12800, i_56_,
							       i_54_),
					     0, 0, 0, 0, i_61_, 0);
				}
			    }
			}
		    }
		}
		for (int i_72_ = 1; (i_72_ ^ 0xffffffff) > -104; i_72_++) {
		    for (int i_73_ = 1; (i_73_ ^ 0xffffffff) > -104; i_73_++)
			arg1.method801(i_18_, i_73_, i_72_,
				       Class15_Sub2.method555(i_72_, i_73_,
							      i_18_,
							      (byte) 127));
		}
		Class11_Sub10_Sub15.aByteArrayArrayArray2364[i_18_] = null;
		Class36.aByteArrayArrayArray655[i_18_] = null;
		Class15_Sub1.aByteArrayArrayArray1754[i_18_] = null;
		Class33.aByteArrayArrayArray612[i_18_] = null;
		Class24.aByteArrayArrayArray443[i_18_] = null;
	    }
	    arg1.method817(-50, -10, -50);
	    for (int i_74_ = 0; (i_74_ ^ 0xffffffff) > -105; i_74_++) {
		for (int i_75_ = 0; i_75_ < 104; i_75_++) {
		    if ((0x2
			 & Class25.aByteArrayArrayArray481[1][i_74_][i_75_])
			== 2)
			arg1.method836(i_74_, i_75_);
		}
	    }
	    int i_76_ = 2;
	    int i_77_ = 1;
	    int i_78_ = 4;
	    for (int i_79_ = 0; (i_79_ ^ 0xffffffff) > -5; i_79_++) {
		if (i_79_ > 0) {
		    i_78_ <<= 3;
		    i_77_ <<= 3;
		    i_76_ <<= 3;
		}
		for (int i_80_ = 0; i_79_ >= i_80_; i_80_++) {
		    for (int i_81_ = 0; i_81_ <= 104; i_81_++) {
			for (int i_82_ = 0; (i_82_ ^ 0xffffffff) >= -105;
			     i_82_++) {
			    if (((Class11_Sub6.anIntArrayArrayArray1587[i_80_]
				  [i_82_][i_81_]) & i_77_
				 ^ 0xffffffff)
				!= -1) {
				int i_83_;
				for (i_83_ = i_81_;
				     (i_83_ < 104
				      && (i_77_ & (Class11_Sub6
						   .anIntArrayArrayArray1587
						   [i_80_][i_82_][1 + i_83_])
					  ^ 0xffffffff) != -1);
				     i_83_++) {
				    /* empty */
				}
				int i_84_ = i_81_;
				int i_85_ = i_80_;
				int i_86_ = i_80_;
				for (/**/; i_84_ > 0; i_84_--) {
				    if ((i_77_ & (Class11_Sub6
						  .anIntArrayArrayArray1587
						  [i_80_][i_82_][-1 + i_84_]))
					== 0)
					break;
				}
			    while_7_:
				for (/**/; (i_85_ ^ 0xffffffff) < -1;
				     i_85_--) {
				    for (int i_87_ = i_84_;
					 ((i_83_ ^ 0xffffffff)
					  <= (i_87_ ^ 0xffffffff));
					 i_87_++) {
					if ((i_77_
					     & (Class11_Sub6
						.anIntArrayArrayArray1587
						[-1 + i_85_][i_82_][i_87_]))
					    == 0)
					    break while_7_;
				    }
				}
			    while_8_:
				for (/**/; i_86_ < i_79_; i_86_++) {
				    for (int i_88_ = i_84_; i_88_ <= i_83_;
					 i_88_++) {
					if ((i_77_
					     & (Class11_Sub6
						.anIntArrayArrayArray1587
						[1 + i_86_][i_82_][i_88_]))
					    == 0)
					    break while_8_;
				    }
				}
				int i_89_ = ((i_86_ + 1 + -i_85_)
					     * (1 + (-i_84_ + i_83_)));
				if ((i_89_ ^ 0xffffffff) <= -9) {
				    int i_90_ = 240;
				    int i_91_
					= ((Class51.anIntArrayArrayArray1005
					    [i_86_][i_82_][i_84_])
					   + -i_90_);
				    int i_92_
					= (Class51.anIntArrayArrayArray1005
					   [i_85_][i_82_][i_84_]);
				    Class49.method816(i_79_, 1, 128 * i_82_,
						      i_82_ * 128, 128 * i_84_,
						      128 + i_83_ * 128, i_91_,
						      i_92_);
				    for (int i_93_ = i_85_;
					 ((i_86_ ^ 0xffffffff)
					  <= (i_93_ ^ 0xffffffff));
					 i_93_++) {
					for (int i_94_ = i_84_; i_83_ >= i_94_;
					     i_94_++)
					    Class11_Sub6
						.anIntArrayArrayArray1587
						[i_93_][i_82_][i_94_]
						= (Class20.method572
						   ((Class11_Sub6
						     .anIntArrayArrayArray1587
						     [i_93_][i_82_][i_94_]),
						    i_77_ ^ 0xffffffff));
				    }
				}
			    }
			    if (((Class11_Sub6.anIntArrayArrayArray1587[i_80_]
				  [i_82_][i_81_]) & i_76_
				 ^ 0xffffffff)
				!= -1) {
				int i_95_;
				for (i_95_ = i_82_;
				     ((i_95_ ^ 0xffffffff) < -1
				      && (i_76_ & (Class11_Sub6
						   .anIntArrayArrayArray1587
						   [i_80_][i_95_ - 1][i_81_])
					  ^ 0xffffffff) != -1);
				     i_95_--) {
				    /* empty */
				}
				int i_96_ = i_82_;
				int i_97_ = i_80_;
				for (/**/;
				     (i_96_ < 104
				      && ((i_76_ & (Class11_Sub6
						    .anIntArrayArrayArray1587
						    [i_80_][1 + i_96_][i_81_]))
					  != 0));
				     i_96_++) {
				    /* empty */
				}
				int i_98_ = i_80_;
			    while_9_:
				for (/**/; i_97_ > 0; i_97_--) {
				    for (int i_99_ = i_95_; i_96_ >= i_99_;
					 i_99_++) {
					if ((((Class11_Sub6
					       .anIntArrayArrayArray1587
					       [-1 + i_97_][i_99_][i_81_])
					      & i_76_)
					     ^ 0xffffffff)
					    == -1)
					    break while_9_;
				    }
				}
			    while_10_:
				for (/**/; ((i_79_ ^ 0xffffffff)
					    < (i_98_ ^ 0xffffffff)); i_98_++) {
				    for (int i_100_ = i_95_; i_96_ >= i_100_;
					 i_100_++) {
					if (((Class11_Sub6
					      .anIntArrayArrayArray1587
					      [1 + i_98_][i_100_][i_81_])
					     & i_76_)
					    == 0)
					    break while_10_;
				    }
				}
				int i_101_ = ((1 + i_96_ - i_95_)
					      * (-i_97_ + (i_98_ - -1)));
				if (i_101_ >= 8) {
				    int i_102_
					= (Class51.anIntArrayArrayArray1005
					   [i_97_][i_95_][i_81_]);
				    int i_103_ = 240;
				    int i_104_
					= (-i_103_
					   + (Class51.anIntArrayArrayArray1005
					      [i_98_][i_95_][i_81_]));
				    Class49.method816(i_79_, 2, i_95_ * 128,
						      i_96_ * 128 + 128,
						      i_81_ * 128, i_81_ * 128,
						      i_104_, i_102_);
				    for (int i_105_ = i_97_; i_98_ >= i_105_;
					 i_105_++) {
					for (int i_106_ = i_95_;
					     ((i_106_ ^ 0xffffffff)
					      >= (i_96_ ^ 0xffffffff));
					     i_106_++)
					    Class11_Sub6
						.anIntArrayArrayArray1587
						[i_105_][i_106_][i_81_]
						= (Class20.method572
						   ((Class11_Sub6
						     .anIntArrayArrayArray1587
						     [i_105_][i_106_][i_81_]),
						    i_76_ ^ 0xffffffff));
				    }
				}
			    }
			    if ((i_78_ & (Class11_Sub6.anIntArrayArrayArray1587
					  [i_80_][i_82_][i_81_]))
				!= 0) {
				int i_107_ = i_82_;
				int i_108_ = i_82_;
				int i_109_ = i_81_;
				int i_110_;
				for (i_110_ = i_81_;
				     (i_110_ ^ 0xffffffff) > -105; i_110_++) {
				    if (((Class11_Sub6.anIntArrayArrayArray1587
					  [i_80_][i_82_][i_110_ - -1])
					 & i_78_)
					== 0)
					break;
				}
				for (/**/; (i_109_ ^ 0xffffffff) < -1;
				     i_109_--) {
				    if (((Class11_Sub6.anIntArrayArrayArray1587
					  [i_80_][i_82_][i_109_ + -1]) & i_78_
					 ^ 0xffffffff)
					== -1)
					break;
				}
			    while_11_:
				for (/**/; (i_107_ ^ 0xffffffff) < -1;
				     i_107_--) {
				    for (int i_111_ = i_109_; i_110_ >= i_111_;
					 i_111_++) {
					if (((Class11_Sub6
					      .anIntArrayArrayArray1587[i_80_]
					      [-1 + i_107_][i_111_])
					     & i_78_)
					    == 0)
					    break while_11_;
				    }
				}
			    while_12_:
				for (/**/; (i_108_ ^ 0xffffffff) > -105;
				     i_108_++) {
				    for (int i_112_ = i_109_; i_110_ >= i_112_;
					 i_112_++) {
					if ((i_78_
					     & (Class11_Sub6
						.anIntArrayArrayArray1587
						[i_80_][1 + i_108_][i_112_]))
					    == 0)
					    break while_12_;
				    }
				}
				if ((((-i_109_ + (i_110_ - -1))
				      * (-i_107_ + (i_108_ - -1)))
				     ^ 0xffffffff)
				    <= -5) {
				    int i_113_
					= (Class51.anIntArrayArrayArray1005
					   [i_80_][i_107_][i_109_]);
				    Class49.method816(i_79_, 4, 128 * i_107_,
						      128 + 128 * i_108_,
						      128 * i_109_,
						      128 * i_110_ - -128,
						      i_113_, i_113_);
				    for (int i_114_ = i_107_; i_114_ <= i_108_;
					 i_114_++) {
					for (int i_115_ = i_109_;
					     i_110_ >= i_115_; i_115_++)
					    Class11_Sub6
						.anIntArrayArrayArray1587
						[i_80_][i_114_][i_115_]
						= (Class20.method572
						   ((Class11_Sub6
						     .anIntArrayArrayArray1587
						     [i_80_][i_114_][i_115_]),
						    i_78_ ^ 0xffffffff));
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ee.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public void method381(int arg0, Buffer arg1) {
	try {
	    for (;;) {
		int i = arg1.method168(255);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method382(i, 70, arg1);
	    }
	    if (arg0 != 2)
		method382(-118, -89, null);
	    anInt2246++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ee.E(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void method382(int arg0, int arg1, Buffer arg2) {
	try {
	    if (arg1 > 35) {
		if (arg0 == 1)
		    anInt2260 = arg2.method164(127);
		else if ((arg0 ^ 0xffffffff) != -3) {
		    if ((arg0 ^ 0xffffffff) == -5)
			anInt2243 = arg2.method164(127);
		    else if ((arg0 ^ 0xffffffff) != -6) {
			if ((arg0 ^ 0xffffffff) == -7)
			    anInt2244 = arg2.method164(127);
			else if (arg0 == 7)
			    anInt2256 = arg2.method168(255);
			else if ((arg0 ^ 0xffffffff) != -9) {
			    if (arg0 >= 40 && (arg0 ^ 0xffffffff) > -51)
				anIntArray2247[arg0 + -40]
				    = arg2.method164(127);
			    else if ((arg0 ^ 0xffffffff) <= -51
				     && (arg0 ^ 0xffffffff) > -61)
				anIntArray2255[-50 + arg0]
				    = arg2.method164(127);
			} else
			    anInt2248 = arg2.method168(255);
		    } else
			anInt2251 = arg2.method164(127);
		} else
		    anInt2262 = arg2.method164(127);
		anInt2254++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ee.A(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method383(byte arg0) {
	try {
	    aClass31_2253 = null;
	    aGraphics2261 = null;
	    if (arg0 > -30)
		method379(false, null);
	    aClass31_2245 = null;
	    aClass31_2266 = null;
	    aByteArrayArray2257 = null;
	    aClass31_2267 = null;
	    aByteArray2268 = null;
	    aClass31_2265 = null;
	    aClass31_2264 = null;
	    aClass36_2263 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ee.C(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10_Sub11() {
	anInt2243 = 128;
	anIntArray2247 = new int[6];
	anInt2262 = -1;
	anInt2256 = 0;
	anIntArray2255 = new int[6];
	anInt2244 = 0;
    }
    
    static {
	aClass31_2264 = aClass31_2267;
	aClass31_2266 = Class64.method992("You have @gre@", 255);
	aClass31_2265 = Class64.method992("::fpsoff", 255);
	anInt2269 = 0;
    }
}
