/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23
{
    public int anInt413;
    public static int anInt414;
    public int anInt415;
    public static int anInt416;
    public int anInt417;
    public static int anInt418;
    public static Class40 aClass40_419 = new Class40(100);
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_420;
    public static int anInt421;
    public int anInt422;
    public int anInt423;
    public static int anInt424;
    public static int anInt425;
    public static int anInt426 = -1;
    public static Class31 aClass31_427 = Class64.method992("titlebox", 255);
    public static int anInt428;
    public static Class31 aClass31_429;
    public static Class31 aClass31_430 = Class64.method992("From:  ", 255);
    public static int anInt431 = 0;
    public static int[] anIntArray432;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_433;
    
    public static void method579(byte arg0) {
	try {
	    aClass11_Sub10_Sub13_Sub3_433 = null;
	    aClass31_429 = null;
	    aClass31_430 = null;
	    aClass40_419 = null;
	    aClass31_427 = null;
	    anIntArray432 = null;
	    int i = -35 % ((arg0 - -31) / 50);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ac.A(" + arg0 + ')');
	}
    }
    
    public static void method580(byte arg0, Class11_Sub10_Sub4_Sub2 arg1) {
	try {
	    if ((arg1.anInt2556 ^ 0xffffffff) == -1)
		arg1.anInt2516 = 1024;
	    arg1.anInt2515 = 0;
	    if (arg1.anInt2556 == 1)
		arg1.anInt2516 = 1536;
	    int i = -Class61.anInt1283 + arg1.anInt2509;
	    if (arg1.anInt2556 == 2)
		arg1.anInt2516 = 0;
	    if ((arg1.anInt2556 ^ 0xffffffff) == -4)
		arg1.anInt2516 = 512;
	    anInt416++;
	    int i_0_ = arg1.anInt2559 * 128 + 64 * arg1.anInt2510;
	    arg1.anInt2506 += (i_0_ + -arg1.anInt2506) / i;
	    if (arg0 > -101)
		anInt426 = -17;
	    int i_1_ = 128 * arg1.anInt2564 - -(64 * arg1.anInt2510);
	    arg1.anInt2517 += (-arg1.anInt2517 + i_1_) / i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ac.B(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method581(boolean arg0) {
	anInt414++;
	if (Class48.anInt906 == 35) {
	    int i = Class11_Sub10_Sub4_Sub2.inBuffer
			.readUByte();
	    int i_2_ = Class51.anInt1004 - -(i & 0x7);
	    int i_3_ = (Class11_Sub10_Sub4_Sub6.anInt2715
			+ ((i & 0x7a) >> -669758332));
	    int i_4_ = Class11_Sub10_Sub4_Sub2.inBuffer
			   .readUByte();
	    int i_5_ = i_4_ >> 484046402;
	    int i_6_ = i_4_ & 0x3;
	    int i_7_ = Class39.anIntArray720[i_5_];
	    if ((i_3_ ^ 0xffffffff) <= -1 && i_2_ >= 0 && i_3_ < 104
		&& (i_2_ ^ 0xffffffff) > -105)
		Buffer.method187(0, Class1.anInt82, i_7_, 386132008,
				       i_6_, i_5_, -1, i_2_, -1, i_3_);
	} else if (Class48.anInt906 == 46) {
	    int i = Class11_Sub10_Sub4_Sub2.inBuffer
			.method141(66);
	    int i_8_ = Class11_Sub10_Sub4_Sub2.inBuffer
			   .readUShortLE();
	    int i_9_ = Class11_Sub10_Sub4_Sub2.inBuffer
			   .method174(59);
	    int i_10_ = Class11_Sub10_Sub4_Sub2.inBuffer
			    .method190();
	    int i_11_ = Class51.anInt1004 + (0x7 & i_10_);
	    int i_12_ = (((0x73 & i_10_) >> -622186428)
			 + Class11_Sub10_Sub4_Sub6.anInt2715);
	    if ((i_12_ ^ 0xffffffff) <= -1 && i_11_ >= 0
		&& (i_12_ ^ 0xffffffff) > -105 && (i_11_ ^ 0xffffffff) > -105
		&& (i_8_ ^ 0xffffffff) != (Class44.anInt800 ^ 0xffffffff)) {
		Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3
		    = new Class11_Sub10_Sub4_Sub3();
		class11_sub10_sub4_sub3.anInt2588 = i;
		class11_sub10_sub4_sub3.anInt2578 = i_9_;
		if ((Class51.aClass36ArrayArrayArray1007[Class1.anInt82][i_12_]
		     [i_11_])
		    == null)
		    Class51.aClass36ArrayArrayArray1007[Class1.anInt82]
			[i_12_][i_11_]
			= new Class36();
		Class51.aClass36ArrayArrayArray1007[Class1.anInt82][i_12_]
		    [i_11_].method691((byte) -98, class11_sub10_sub4_sub3);
		Class44.method766(i_11_, i_12_, 127);
	    }
	} else if ((Class48.anInt906 ^ 0xffffffff) == -64) {
	    int i = Class11_Sub10_Sub4_Sub2.inBuffer
			.readUByte();
	    int i_13_ = (((i & 0x73) >> -1037810556)
			 + Class11_Sub10_Sub4_Sub6.anInt2715);
	    int i_14_ = Class51.anInt1004 + (0x7 & i);
	    int i_15_ = Class11_Sub10_Sub4_Sub2.inBuffer
			    .readUShortBE();
	    int i_16_ = Class11_Sub10_Sub4_Sub2.inBuffer
			    .readUShortBE();
	    int i_17_ = Class11_Sub10_Sub4_Sub2.inBuffer
			    .readUShortBE();
	    if ((i_13_ ^ 0xffffffff) <= -1 && i_14_ >= 0
		&& (i_13_ ^ 0xffffffff) > -105
		&& (i_14_ ^ 0xffffffff) > -105) {
		Class36 class36 = (Class51.aClass36ArrayArrayArray1007
				   [Class1.anInt82][i_13_][i_14_]);
		if (class36 != null) {
		    for (Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3
			     = ((Class11_Sub10_Sub4_Sub3)
				class36.method694((byte) -119));
			 class11_sub10_sub4_sub3 != null;
			 class11_sub10_sub4_sub3 = ((Class11_Sub10_Sub4_Sub3)
						    class36.method701(0))) {
			if (((i_15_ & 0x7fff ^ 0xffffffff)
			     == (class11_sub10_sub4_sub3.anInt2578
				 ^ 0xffffffff))
			    && class11_sub10_sub4_sub3.anInt2588 == i_16_) {
			    class11_sub10_sub4_sub3.anInt2588 = i_17_;
			    break;
			}
		    }
		    Class44.method766(i_14_, i_13_, 117);
		}
	    }
	} else {
	    if ((Class48.anInt906 ^ 0xffffffff) == -119) {
		int i = Class11_Sub10_Sub4_Sub2.inBuffer
			    .readUByte();
		int i_18_ = ((i >> -1426250524 & 0x7)
			     + Class11_Sub10_Sub4_Sub6.anInt2715);
		int i_19_ = Class51.anInt1004 + (i & 0x7);
		int i_20_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUShortBE();
		int i_21_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUByte();
		int i_22_ = i_21_ >> 526843780 & 0xf;
		int i_23_ = i_21_ & 0x7;
		if (i_18_ + -i_22_ <= (Class48
				       .aClass11_Sub10_Sub4_Sub2_Sub1_899
				       .anIntArray2500[0])
		    && (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			.anIntArray2500[0]) <= i_22_ + i_18_
		    && ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			 .anIntArray2562[0])
			^ 0xffffffff) <= (-i_22_ + i_19_ ^ 0xffffffff)
		    && (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			.anIntArray2562[0]) <= i_19_ - -i_22_
		    && (Class54.anInt1083 ^ 0xffffffff) != -1 && i_23_ > 0
		    && (Class55_Sub1.anInt1853 ^ 0xffffffff) > -51) {
		    Class11_Sub10_Sub4_Sub2_Sub2.anIntArray2824[(Class55_Sub1
								 .anInt1853)]
			= i_20_;
		    Class64.anIntArray1327[Class55_Sub1.anInt1853] = i_23_;
		    Class11_Sub10_Sub1.anIntArray1944[Class55_Sub1.anInt1853]
			= 0;
		    Class36.aClass35Array671[Class55_Sub1.anInt1853] = null;
		    Class55_Sub1.anInt1853++;
		}
	    }
	    if ((Class48.anInt906 ^ 0xffffffff) == -245) {
		int i = Class11_Sub10_Sub4_Sub2.inBuffer
			    .method174(46);
		int i_24_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUByteA();
		int i_25_ = Class51.anInt1004 + (i_24_ & 0x7);
		int i_26_ = ((0x7 & i_24_ >> -1709303548)
			     + Class11_Sub10_Sub4_Sub6.anInt2715);
		int i_27_ = Class11_Sub10_Sub4_Sub2.inBuffer
				.method190();
		int i_28_ = 0x3 & i_27_;
		int i_29_ = i_27_ >> -1573466142;
		int i_30_ = Class39.anIntArray720[i_29_];
		if ((i_26_ ^ 0xffffffff) <= -1 && (i_25_ ^ 0xffffffff) <= -1
		    && (i_26_ ^ 0xffffffff) > -105 && i_25_ < 104)
		    Buffer.method187(0, Class1.anInt82, i_30_, 386132008,
					   i_28_, i_29_, i, i_25_, -1, i_26_);
	    } else {
		if ((Class48.anInt906 ^ 0xffffffff) == -22) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUShortLE();
		    int i_31_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method166(false);
		    int i_32_ = (((0x71 & i_31_) >> 440015652)
				 + Class11_Sub10_Sub4_Sub6.anInt2715);
		    int i_33_ = Class51.anInt1004 - -(0x7 & i_31_);
		    int i_34_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method141(106);
		    int i_35_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method166(false);
		    int i_36_ = i_35_ >> 28543266;
		    int i_37_ = i_35_ & 0x3;
		    int i_38_ = Class39.anIntArray720[i_36_];
		    int i_39_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method150();
		    int i_40_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method151(-9216);
		    int i_41_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method156(26669);
		    int i_42_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method151(-9216);
		    int i_43_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortLE();
		    int i_44_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method174(26);
		    Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1;
		    if ((Class44.anInt800 ^ 0xffffffff) == (i ^ 0xffffffff))
			class11_sub10_sub4_sub2_sub1
			    = Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899;
		    else
			class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i]);
		    if (class11_sub10_sub4_sub2_sub1 != null) {
			Class11_Sub10_Sub2 class11_sub10_sub2
			    = Class51.method853((byte) -113, i_43_);
			int i_45_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][1 + i_32_][i_33_]);
			int i_46_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_32_][i_33_]);
			int i_47_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_32_ + 1][1 + i_33_]);
			int i_48_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_32_][i_33_ + 1]);
			Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
			    = class11_sub10_sub2.method235(i_37_, i_45_, i_48_,
							   i_46_, i_36_, -101,
							   i_47_);
			if (class11_sub10_sub4_sub4 != null) {
			    Buffer.method187(1 + i_34_, Class1.anInt82,
						   i_38_, 386132008, 0, 0, -1,
						   i_33_, 1 + i_44_, i_32_);
			    class11_sub10_sub4_sub2_sub1
				.aClass11_Sub10_Sub4_Sub4_2788
				= class11_sub10_sub4_sub4;
			    int i_49_ = class11_sub10_sub2.anInt1967;
			    int i_50_ = class11_sub10_sub2.anInt1974;
			    if ((i_40_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff)) {
				int i_51_ = i_42_;
				i_42_ = i_40_;
				i_40_ = i_51_;
			    }
			    class11_sub10_sub4_sub2_sub1.anInt2797
				= Class61.anInt1283 + i_44_;
			    if ((i_41_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff)) {
				int i_52_ = i_41_;
				i_41_ = i_39_;
				i_39_ = i_52_;
			    }
			    if ((i_37_ ^ 0xffffffff) == -2
				|| (i_37_ ^ 0xffffffff) == -4) {
				i_50_ = class11_sub10_sub2.anInt1967;
				i_49_ = class11_sub10_sub2.anInt1974;
			    }
			    class11_sub10_sub4_sub2_sub1.anInt2808
				= i_49_ * 64 + i_32_ * 128;
			    class11_sub10_sub4_sub2_sub1.anInt2792
				= i_34_ + Class61.anInt1283;
			    class11_sub10_sub4_sub2_sub1.anInt2790
				= 128 * i_33_ - -(i_50_ * 64);
			    class11_sub10_sub4_sub2_sub1.anInt2802
				= (Class11_Sub10_Sub4_Sub5.method324
				   (Class1.anInt82,
				    class11_sub10_sub4_sub2_sub1.anInt2808, 3,
				    class11_sub10_sub4_sub2_sub1.anInt2790));
			    class11_sub10_sub4_sub2_sub1.anInt2807
				= i_33_ - -i_39_;
			    class11_sub10_sub4_sub2_sub1.anInt2791
				= i_41_ + i_33_;
			    class11_sub10_sub4_sub2_sub1.anInt2783
				= i_40_ + i_32_;
			    class11_sub10_sub4_sub2_sub1.anInt2782
				= i_32_ + i_42_;
			}
		    }
		}
		if (Class48.anInt906 == 56) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUShortLE();
		    int i_53_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method190();
		    int i_54_ = (Class11_Sub10_Sub4_Sub6.anInt2715
				 + (0x7 & i_53_ >> -1604177596));
		    int i_55_ = Class51.anInt1004 - -(0x7 & i_53_);
		    int i_56_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method174(82);
		    if (i_54_ >= 0 && i_55_ >= 0 && i_54_ < 104
			&& (i_55_ ^ 0xffffffff) > -105) {
			Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3
			    = new Class11_Sub10_Sub4_Sub3();
			class11_sub10_sub4_sub3.anInt2588 = i_56_;
			class11_sub10_sub4_sub3.anInt2578 = i;
			if ((Class51.aClass36ArrayArrayArray1007
			     [Class1.anInt82][i_54_][i_55_])
			    == null)
			    Class51.aClass36ArrayArrayArray1007
				[Class1.anInt82][i_54_][i_55_]
				= new Class36();
			Class51.aClass36ArrayArrayArray1007[Class1.anInt82]
			    [i_54_][i_55_]
			    .method691((byte) -98, class11_sub10_sub4_sub3);
			Class44.method766(i_55_, i_54_, 111);
		    }
		} else if ((Class48.anInt906 ^ 0xffffffff) == -136) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUByte();
		    int i_57_ = (Class11_Sub10_Sub4_Sub6.anInt2715
				 - -(i >> -1829990108 & 0x7));
		    int i_58_ = (i & 0x7) + Class51.anInt1004;
		    int i_59_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    int i_60_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUByte();
		    int i_61_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    if (i_57_ >= 0 && (i_58_ ^ 0xffffffff) <= -1
			&& (i_57_ ^ 0xffffffff) > -105
			&& (i_58_ ^ 0xffffffff) > -105) {
			i_58_ = 128 * i_58_ - -64;
			i_57_ = 64 + i_57_ * 128;
			Class11_Sub10_Sub4_Sub6 class11_sub10_sub4_sub6
			    = (new Class11_Sub10_Sub4_Sub6
			       (i_59_, Class1.anInt82, i_57_, i_58_,
				(Class11_Sub10_Sub4_Sub5.method324((Class1
								    .anInt82),
								   i_57_, 3,
								   i_58_)
				 + -i_60_),
				i_61_, Class61.anInt1283));
			Class11_Sub10_Sub4_Sub2_Sub2.aClass36_2818
			    .method691((byte) -98, class11_sub10_sub4_sub6);
		    }
		} else if (Class48.anInt906 == 221) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.method166(!arg0);
		    int i_62_ = (((i & 0x7a) >> 2051676196)
				 + Class11_Sub10_Sub4_Sub6.anInt2715);
		    int i_63_ = (i & 0x7) + Class51.anInt1004;
		    int i_64_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    if ((i_62_ ^ 0xffffffff) <= -1 && i_63_ >= 0
			&& (i_62_ ^ 0xffffffff) > -105 && i_63_ < 104) {
			Class36 class36 = (Class51.aClass36ArrayArrayArray1007
					   [Class1.anInt82][i_62_][i_63_]);
			if (class36 != null) {
			    for (Class11_Sub10_Sub4_Sub3 class11_sub10_sub4_sub3
				     = ((Class11_Sub10_Sub4_Sub3)
					class36.method694((byte) -127));
				 class11_sub10_sub4_sub3 != null;
				 class11_sub10_sub4_sub3
				     = ((Class11_Sub10_Sub4_Sub3)
					class36.method701(0))) {
				if ((class11_sub10_sub4_sub3.anInt2578
				     ^ 0xffffffff)
				    == (0x7fff & i_64_ ^ 0xffffffff)) {
				    class11_sub10_sub4_sub3.method107(0);
				    break;
				}
			    }
			    if (class36.method694((byte) -118) == null)
				Class51.aClass36ArrayArrayArray1007
				    [Class1.anInt82][i_62_][i_63_]
				    = null;
			    Class44.method766(i_63_, i_62_, 126);
			}
		    }
		} else if ((Class48.anInt906 ^ 0xffffffff) == -70) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.readUByte();
		    int i_65_ = (Class11_Sub10_Sub4_Sub6.anInt2715
				 - -(0x7 & i >> 581949924));
		    int i_66_ = (0x7 & i) + Class51.anInt1004;
		    int i_67_ = i_65_ - -Class11_Sub10_Sub4_Sub2
					     .inBuffer
					     .method156(26669);
		    int i_68_ = i_66_ - -Class11_Sub10_Sub4_Sub2
					     .inBuffer
					     .method156(26669);
		    int i_69_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer
				    .method161((byte) -120);
		    int i_70_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    int i_71_
			= 4 * Class11_Sub10_Sub4_Sub2
				  .inBuffer.readUByte();
		    int i_72_ = (Class11_Sub10_Sub4_Sub2
				     .inBuffer.readUByte()
				 * 4);
		    int i_73_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    int i_74_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUShortBE();
		    int i_75_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUByte();
		    int i_76_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUByte();
		    if ((i_65_ ^ 0xffffffff) <= -1 && i_66_ >= 0
			&& (i_65_ ^ 0xffffffff) > -105
			&& (i_66_ ^ 0xffffffff) > -105
			&& (i_67_ ^ 0xffffffff) <= -1
			&& (i_68_ ^ 0xffffffff) <= -1
			&& (i_67_ ^ 0xffffffff) > -105
			&& (i_68_ ^ 0xffffffff) > -105
			&& (i_70_ ^ 0xffffffff) != -65536) {
			i_68_ = 128 * i_68_ - -64;
			i_65_ = 64 + 128 * i_65_;
			i_67_ = 64 + 128 * i_67_;
			i_66_ = 64 + i_66_ * 128;
			Class11_Sub10_Sub4_Sub1 class11_sub10_sub4_sub1
			    = (new Class11_Sub10_Sub4_Sub1
			       (i_70_, Class1.anInt82, i_65_, i_66_,
				(Class11_Sub10_Sub4_Sub5.method324((Class1
								    .anInt82),
								   i_65_, 3,
								   i_66_)
				 + -i_71_),
				Class61.anInt1283 + i_73_,
				i_74_ + Class61.anInt1283, i_75_, i_76_, i_69_,
				i_72_));
			class11_sub10_sub4_sub1.method260
			    (i_67_,
			     Class11_Sub10_Sub4_Sub5.method324(Class1.anInt82,
							       i_67_, 3,
							       i_68_) - i_72_,
			     1, Class61.anInt1283 + i_73_, i_68_);
			Class11_Sub10_Sub11.aClass36_2263
			    .method691((byte) -98, class11_sub10_sub4_sub1);
		    }
		} else if ((Class48.anInt906 ^ 0xffffffff) == -130) {
		    int i = Class11_Sub10_Sub4_Sub2.inBuffer
				.method174(101);
		    int i_77_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.readUByteA();
		    int i_78_ = i_77_ >> 718675586;
		    int i_79_ = 0x3 & i_77_;
		    int i_80_ = Class39.anIntArray720[i_78_];
		    int i_81_ = Class11_Sub10_Sub4_Sub2
				    .inBuffer.method166(false);
		    int i_82_ = Class51.anInt1004 + (0x7 & i_81_);
		    int i_83_ = (Class11_Sub10_Sub4_Sub6.anInt2715
				 + ((0x7e & i_81_) >> 1957051236));
		    if (i_83_ >= 0 && i_82_ >= 0 && (i_83_ ^ 0xffffffff) > -104
			&& (i_82_ ^ 0xffffffff) > -104) {
			int i_84_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_83_][i_82_]);
			int i_85_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_83_ + 1][i_82_]);
			int i_86_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][1 + i_83_][i_82_ + 1]);
			int i_87_ = (Class51.anIntArrayArrayArray1005
				     [Class1.anInt82][i_83_][i_82_ - -1]);
			if ((i_80_ ^ 0xffffffff) == -1) {
			    Class54 class54
				= Class52.aClass49_1024
				      .method795(Class1.anInt82, i_83_, i_82_);
			    if (class54 != null) {
				int i_88_ = ((class54.anInt1078 & 0x1ffff9b3)
					     >> 1936293262);
				if (i_78_ == 2) {
				    class54.aClass11_Sub10_Sub4_1062
					= (new Class11_Sub10_Sub4_Sub5
					   (i_88_, 2, i_79_ + 4, i_84_, i_85_,
					    i_86_, i_87_, i, false));
				    class54.aClass11_Sub10_Sub4_1079
					= (new Class11_Sub10_Sub4_Sub5
					   (i_88_, 2, 0x3 & i_79_ - -1, i_84_,
					    i_85_, i_86_, i_87_, i, false));
				} else
				    class54.aClass11_Sub10_Sub4_1062
					= new Class11_Sub10_Sub4_Sub5(i_88_,
								      i_78_,
								      i_79_,
								      i_84_,
								      i_85_,
								      i_86_,
								      i_87_, i,
								      false);
			    }
			}
			if ((i_80_ ^ 0xffffffff) == -2) {
			    Class1 class1
				= Class52.aClass49_1024
				      .method811(Class1.anInt82, i_83_, i_82_);
			    if (class1 != null)
				class1.aClass11_Sub10_Sub4_80
				    = (new Class11_Sub10_Sub4_Sub5
				       (0x7fff & class1.anInt96 >> -1759435538,
					4, 0, i_84_, i_85_, i_86_, i_87_, i,
					false));
			}
			if ((i_80_ ^ 0xffffffff) == -3) {
			    Class28 class28
				= Class52.aClass49_1024
				      .method819(Class1.anInt82, i_83_, i_82_);
			    if (i_78_ == 11)
				i_78_ = 10;
			    if (class28 != null)
				class28.aClass11_Sub10_Sub4_528
				    = (new Class11_Sub10_Sub4_Sub5
				       (((class28.anInt500 & 0x1fffdbb2)
					 >> 1509192814),
					i_78_, i_79_, i_84_, i_85_, i_86_,
					i_87_, i, false));
			}
			if (i_80_ == 3) {
			    Class23 class23
				= Class52.aClass49_1024
				      .method824(Class1.anInt82, i_83_, i_82_);
			    if (class23 != null)
				class23.aClass11_Sub10_Sub4_420
				    = (new Class11_Sub10_Sub4_Sub5
				       (((0x1ffffb48 & class23.anInt423)
					 >> -1177436178),
					22, i_79_, i_84_, i_85_, i_86_, i_87_,
					i, false));
			}
		    }
		} else if (arg0 != true)
		    anInt425 = -74;
	    }
	}
    }
    
    public static void method582(int arg0, Class55_Sub1 arg1, int arg2) {
	try {
	    anInt421++;
	    if (Class11_Sub10_Sub2.aBuffer_2005 != null) {
		Class11_Sub10_Sub2.aBuffer_2005.position
		    = arg2 * 4 - -5;
		int i = Class11_Sub10_Sub2.aBuffer_2005
			    .readUIntBE();
		arg1.method911(true, i);
	    }
	    Class11_Sub10_Sub4.method257(255, 83, null, 0, (byte) 0, true,
					 255);
	    if (arg0 >= 126)
		Class44.aClass55_Sub1Array820[arg2] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ac.E(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub13_Sub3 method583(int arg0, int arg1,
						     Class55 arg2) {
	try {
	    if (arg1 != 15090)
		method579((byte) -126);
	    anInt418++;
	    if (!Class11_Sub12.method499((byte) -34, arg2, arg0))
		return null;
	    return Applet_Sub1.method31(52);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ac.D(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    static {
	aClass31_429 = Class64.method992("@yel@0 unread messages", 255);
	anInt425 = 0;
    }
}
