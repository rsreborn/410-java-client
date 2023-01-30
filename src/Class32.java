/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class32
{
    public static Class31 aClass31_571;
    public static Class31 aClass31_572
	= Class64.method992("Earlier today", 255);
    public static boolean[] aBooleanArray573
	= { true, true, true, true, true, true, true, true, true, true, true,
	    true, true, true, true, true, true, true, true, true, true, false,
	    false, false, false };
    public static Class31 aClass31_574;
    public static boolean aBoolean575;
    public static int anInt576;
    public static Class20 aClass20_577;
    public static Class31 aClass31_578;
    public static int anInt579;
    public Class11_Sub10 aClass11_Sub10_580 = new Class11_Sub10();
    public static int anInt581;
    public static Class31 aClass31_582;
    public static int anInt583 = 0;
    public static int[] anIntArray584;
    public static int anInt585;
    public static Class31 aClass31_586;
    public static int anInt587;
    public static int anInt588;
    public static Class55 aClass55_589;
    public static int anInt590;
    public static Class31 aClass31_591;
    public static Class31 aClass31_592;
    public static int anInt593;
    public static int anInt594;
    public static Class31 aClass31_595;
    public static Class31 aClass31_596;
    public static int[] anIntArray597;
    public static Class31 aClass31_598;
    
    public void method656(Class11_Sub10 arg0, byte arg1) {
	try {
	    if (arg1 != 98)
		method659((byte) 115, null);
	    if (arg0.aClass11_Sub10_1675 != null)
		arg0.method227(109);
	    arg0.aClass11_Sub10_1659 = aClass11_Sub10_580;
	    arg0.aClass11_Sub10_1675 = aClass11_Sub10_580.aClass11_Sub10_1675;
	    arg0.aClass11_Sub10_1675.aClass11_Sub10_1659 = arg0;
	    arg0.aClass11_Sub10_1659.aClass11_Sub10_1675 = arg0;
	    anInt576++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "oa.B(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public Class11_Sub10 method657(int arg0) {
	try {
	    anInt593++;
	    Class11_Sub10 class11_sub10
		= aClass11_Sub10_580.aClass11_Sub10_1659;
	    if (arg0 != 26435)
		method658(-113);
	    if (aClass11_Sub10_580 == class11_sub10)
		return null;
	    class11_sub10.method227(-64);
	    return class11_sub10;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "oa.D(" + arg0 + ')');
	}
    }
    
    public Class11_Sub10 method658(int arg0) {
	try {
	    anInt579++;
	    if (arg0 != -1)
		aClass31_578 = null;
	    Class11_Sub10 class11_sub10
		= aClass11_Sub10_580.aClass11_Sub10_1659;
	    if (class11_sub10 == aClass11_Sub10_580)
		return null;
	    return class11_sub10;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "oa.C(" + arg0 + ')');
	}
    }
    
    public void method659(byte arg0, Class11_Sub10 arg1) {
	try {
	    anInt590++;
	    if (arg1.aClass11_Sub10_1675 != null)
		arg1.method227(-112);
	    arg1.aClass11_Sub10_1675 = aClass11_Sub10_580;
	    if (arg0 >= -100)
		aClass31_572 = null;
	    arg1.aClass11_Sub10_1659 = aClass11_Sub10_580.aClass11_Sub10_1659;
	    arg1.aClass11_Sub10_1675.aClass11_Sub10_1659 = arg1;
	    arg1.aClass11_Sub10_1659.aClass11_Sub10_1675 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("oa.G(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public Class32() {
	try {
	    aClass11_Sub10_580.aClass11_Sub10_1659 = aClass11_Sub10_580;
	    aClass11_Sub10_580.aClass11_Sub10_1675 = aClass11_Sub10_580;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "oa.<init>(" + ')');
	}
    }
    
    public static void method660(int arg0) {
	try {
	    Class29.method613(false, 50);
	    anInt585++;
	    boolean bool = true;
	    Class11_Sub10_Sub3.anInt2024 = 0;
	    for (int i = 0; ((Class60.aByteArrayArray1259.length ^ 0xffffffff)
			     < (i ^ 0xffffffff)); i++) {
		if (Class11_Sub10_Sub4_Sub1.anIntArray2490[i] != -1
		    && Class60.aByteArrayArray1259[i] == null) {
		    Class60.aByteArrayArray1259[i]
			= (Class13.aClass55_Sub1_270.method887
			   ((byte) -127, 0,
			    Class11_Sub10_Sub4_Sub1.anIntArray2490[i]));
		    if (Class60.aByteArrayArray1259[i] == null) {
			bool = false;
			Class11_Sub10_Sub3.anInt2024++;
		    }
		}
		if ((Canvas_Sub1.anIntArray64[i] ^ 0xffffffff) != 0
		    && Class11_Sub10_Sub11.aByteArrayArray2257[i] == null) {
		    Class11_Sub10_Sub11.aByteArrayArray2257[i]
			= (Class13.aClass55_Sub1_270.method901
			   (0, Canvas_Sub1.anIntArray64[i],
			    Class11_Sub10_Sub4_Sub5.xteaKeys[i],
			    123));
		    if (Class11_Sub10_Sub11.aByteArrayArray2257[i] == null) {
			Class11_Sub10_Sub3.anInt2024++;
			bool = false;
		    }
		}
	    }
	    if (!bool)
		Applet_Sub1.anInt5 = 1;
	    else {
		bool = true;
		Class29.anInt530 = 0;
		for (int i = 0;
		     ((Class60.aByteArrayArray1259.length ^ 0xffffffff)
		      < (i ^ 0xffffffff));
		     i++) {
		    byte[] is = Class11_Sub10_Sub11.aByteArrayArray2257[i];
		    if (is != null) {
			int i_0_ = (64 * (0xff & (Class11_Sub10_Sub4_Sub3
						  .anIntArray2589[i]))
				    + -Class10.anInt214);
			int i_1_ = ((Class11_Sub10_Sub4_Sub3.anIntArray2589[i]
				     >> -554412120) * 64
				    - Class11_Sub10_Sub6.anInt2133);
			if (Class17.aBoolean338) {
			    i_0_ = 10;
			    i_1_ = 10;
			}
			bool
			    &= Class11_Sub10_Sub4.method254(is, i_1_, 0, i_0_);
		    }
		}
		if (!bool)
		    Applet_Sub1.anInt5 = 2;
		else if (arg0 <= -58) {
		    if ((Applet_Sub1.anInt5 ^ 0xffffffff) != -1)
			Class28.method610(true,
					  Class11_Sub10_Sub4.aClass31_2041,
					  Class54.aClass31_1059, -32266);
		    Class15_Sub2.method554(33554431);
		    Class52.aClass49_1024.method797();
		    System.gc();
		    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
			Class39.aClass8Array707[i].method92(true);
		    for (int i = 0; i < 4; i++) {
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -105;
			     i_2_++) {
			    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -105;
				 i_3_++)
				Class25.aByteArrayArrayArray481[i][i_2_][i_3_]
				    = (byte) 0;
			}
		    }
		    Class11_Sub8.method217(-25155);
		    int i = Class60.aByteArrayArray1259.length;
		    Class29.method613(true, 50);
		    if (!Class17.aBoolean338) {
			for (int i_4_ = 0;
			     (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
			    int i_5_ = (-Class11_Sub10_Sub6.anInt2133
					+ 64 * ((Class11_Sub10_Sub4_Sub3
						 .anIntArray2589[i_4_])
						>> -278145272));
			    int i_6_
				= (-Class10.anInt214
				   + (0xff & (Class11_Sub10_Sub4_Sub3
					      .anIntArray2589[i_4_])) * 64);
			    byte[] is = Class60.aByteArrayArray1259[i_4_];
			    if (is != null)
				Class50.method843
				    ((byte) -106, i_6_,
				     ((-6 + Class11_Sub10_Sub4_Sub2.anInt2571)
				      * 8),
				     Class39.aClass8Array707, is, i_5_,
				     (-6 + Class11_Sub10_Sub4.anInt2043) * 8);
			}
			for (int i_7_ = 0;
			     (i_7_ ^ 0xffffffff) > (i ^ 0xffffffff); i_7_++) {
			    int i_8_ = (((Class11_Sub10_Sub4_Sub3
					  .anIntArray2589[i_7_])
					 >> 242100264) * 64
					+ -Class11_Sub10_Sub6.anInt2133);
			    byte[] is = Class60.aByteArrayArray1259[i_7_];
			    int i_9_ = (64 * (0xff & (Class11_Sub10_Sub4_Sub3
						      .anIntArray2589[i_7_]))
					+ -Class10.anInt214);
			    if (is == null
				&& Class11_Sub10_Sub4.anInt2043 < 800)
				Class34.method683(64, 64, 20318, i_9_, i_8_);
			}
			Class29.method613(true, 50);
			for (int i_10_ = 0;
			     (i ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
			     i_10_++) {
			    byte[] is = (Class11_Sub10_Sub11
					 .aByteArrayArray2257[i_10_]);
			    if (is != null) {
				int i_11_ = (-Class11_Sub10_Sub6.anInt2133
					     + 64 * ((Class11_Sub10_Sub4_Sub3
						      .anIntArray2589[i_10_])
						     >> -1816397720));
				int i_12_ = (64 * ((Class11_Sub10_Sub4_Sub3
						    .anIntArray2589[i_10_])
						   & 0xff)
					     + -Class10.anInt214);
				Class11_Sub4.method139(i_12_, i_11_,
						       Class52.aClass49_1024,
						       is, -116,
						       (Class39
							.aClass8Array707));
			    }
			}
		    }
		    if (Class17.aBoolean338) {
			for (int i_13_ = 0; i_13_ < 4; i_13_++) {
			    for (int i_14_ = 0; i_14_ < 13; i_14_++) {
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -14;
				     i_15_++) {
				    int i_16_
					= (Class55.anIntArrayArrayArray1092
					   [i_13_][i_14_][i_15_]);
				    boolean bool_17_ = false;
				    if (i_16_ != -1) {
					int i_18_ = i_16_ >> 674285880 & 0x3;
					int i_19_
					    = i_16_ >> -308591122 & 0x3ff;
					int i_20_
					    = i_16_ >> -2102813917 & 0x7ff;
					int i_21_ = ((i_19_ / 8 << -1464282520)
						     + i_20_ / 8);
					int i_22_ = i_16_ >> 991390945 & 0x3;
					for (int i_23_ = 0;
					     (((Class11_Sub10_Sub4_Sub3
						.anIntArray2589).length
					       ^ 0xffffffff)
					      < (i_23_ ^ 0xffffffff));
					     i_23_++) {
					    if ((((Class11_Sub10_Sub4_Sub3
						   .anIntArray2589[i_23_])
						  ^ 0xffffffff)
						 == (i_21_ ^ 0xffffffff))
						&& (Class60.aByteArrayArray1259
						    [i_23_]) != null) {
						Class11_Sub10_Sub4_Sub2_Sub1
						    .method280
						    ((Class60
						      .aByteArrayArray1259
						      [i_23_]),
						     i_15_ * 8,
						     8 * (0x7 & i_19_), i_22_,
						     i_14_ * 8, i_18_,
						     8 * (0x7 & i_20_),
						     Class39.aClass8Array707,
						     i_13_, (byte) 108);
						bool_17_ = true;
						break;
					    }
					}
				    }
				    if (!bool_17_)
					Class11_Sub10_Sub14.method465
					    (i_14_ * 8, 0, i_13_, i_15_ * 8);
				}
			    }
			}
			for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -14;
			     i_24_++) {
			    for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -14;
				 i_25_++) {
				int i_26_ = (Class55.anIntArrayArrayArray1092
					     [0][i_24_][i_25_]);
				if (i_26_ == -1)
				    Class34.method683(8, 8, 20318, i_25_ * 8,
						      i_24_ * 8);
			    }
			}
			Class29.method613(true, 50);
			for (int i_27_ = 0; i_27_ < 4; i_27_++) {
			    for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > -14;
				 i_28_++) {
				for (int i_29_ = 0; i_29_ < 13; i_29_++) {
				    int i_30_
					= (Class55.anIntArrayArrayArray1092
					   [i_27_][i_28_][i_29_]);
				    if ((i_30_ ^ 0xffffffff) != 0) {
					int i_31_ = i_30_ >> 1259961400 & 0x3;
					int i_32_
					    = (i_30_ & 0x7) >> -1188364383;
					int i_33_
					    = (0xffe4bf & i_30_) >> 1106863470;
					int i_34_
					    = 0x7ff & i_30_ >> -109535005;
					int i_35_
					    = (i_34_ / 8
					       + (i_33_ / 8 << 1133756424));
					for (int i_36_ = 0;
					     ((i_36_ ^ 0xffffffff)
					      > ((Class11_Sub10_Sub4_Sub3
						  .anIntArray2589).length
						 ^ 0xffffffff));
					     i_36_++) {
					    if (((Class11_Sub10_Sub4_Sub3
						  .anIntArray2589[i_36_])
						 == i_35_)
						&& (Class11_Sub10_Sub11
						    .aByteArrayArray2257
						    [i_36_]) != null) {
						Class7.method78
						    (i_32_, i_31_,
						     8 * (i_33_ & 0x7),
						     8 * i_28_,
						     Class39.aClass8Array707,
						     (byte) 109, 8 * i_29_,
						     8 * (i_34_ & 0x7),
						     Class52.aClass49_1024,
						     i_27_,
						     (Class11_Sub10_Sub11
						      .aByteArrayArray2257
						      [i_36_]));
						break;
					    }
					}
				    }
				}
			    }
			}
		    }
		    Class29.method613(true, 50);
		    Class15_Sub2.method554(33554431);
		    Class11_Sub10_Sub11.method380(Class39.aClass8Array707,
						  Class52.aClass49_1024, 122);
		    Class29.method613(true, 50);
		    int i_37_ = Class11_Sub7.anInt1610;
		    if (i_37_ > Class1.anInt82)
			i_37_ = Class1.anInt82;
		    if ((-1 + Class1.anInt82 ^ 0xffffffff)
			< (i_37_ ^ 0xffffffff))
			i_37_ = Class1.anInt82 + -1;
		    if (!Class1.aBoolean94)
			Class52.aClass49_1024.method804(0);
		    else
			Class52.aClass49_1024
			    .method804(Class11_Sub7.anInt1610);
		    for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -105; i_38_++) {
			for (int i_39_ = 0; i_39_ < 104; i_39_++)
			    Class44.method766(i_39_, i_38_, 100);
		    }
		    Class64.method990(-126);
		    Class37_Sub1.aClass40_1781.method740(4);
		    if (Class60.aCanvas_Sub1_1260 != null) {
			Class40.outBuffer.method196(1, 153);
			Class12.anInt246++;
			Class40.outBuffer.writeIntBE(1057001181
            );
		    }
		    if (!Class17.aBoolean338) {
			int i_40_
			    = (Class11_Sub10_Sub4_Sub2.anInt2571 - 6) / 8;
			int i_41_
			    = (6 + Class11_Sub10_Sub4_Sub2.anInt2571) / 8;
			int i_42_ = (-6 + Class11_Sub10_Sub4.anInt2043) / 8;
			int i_43_ = (Class11_Sub10_Sub4.anInt2043 - -6) / 8;
			for (int i_44_ = -1 + i_40_;
			     (i_44_ ^ 0xffffffff) >= (i_41_ + 1 ^ 0xffffffff);
			     i_44_++) {
			    for (int i_45_ = -1 + i_42_;
				 ((i_45_ ^ 0xffffffff)
				  >= (1 + i_43_ ^ 0xffffffff));
				 i_45_++) {
				if ((i_40_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff)
				    || i_44_ > i_41_ || i_45_ < i_42_
				    || (i_43_ ^ 0xffffffff) > (i_45_
							       ^ 0xffffffff)) {
				    Class13.aClass55_Sub1_270.method882
					(true,
					 (Class40.method744
					  (0, (new Class31[]
					       { Class59.aClass31_1235,
						 (Class11_Sub11.method493
						  (i_44_, (byte) -128)),
						 Class51.aClass31_1015,
						 (Class11_Sub11.method493
						  (i_45_, (byte) -126)) }))));
				    Class13.aClass55_Sub1_270.method882
					(true,
					 (Class40.method744
					  (0, (new Class31[]
					       { Canvas_Sub1.aClass31_62,
						 (Class11_Sub11.method493
						  (i_44_, (byte) -128)),
						 Class51.aClass31_1015,
						 (Class11_Sub11.method493
						  (i_45_, (byte) -125)) }))));
				}
			    }
			}
		    }
		    if ((Class46.anInt844 ^ 0xffffffff) == 0)
			Class34.method674(30, false);
		    else
			Class34.method674(35, false);
		    Class11.method108(-25457);
		    Class40.outBuffer.method196(1, 91);
		    Class61.method962((byte) 113);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "oa.F(" + arg0 + ')');
	}
    }
    
    public static void method661(byte arg0) {
	try {
	    aClass31_595 = null;
	    aClass31_586 = null;
	    aClass31_574 = null;
	    aClass31_582 = null;
	    aClass31_572 = null;
	    aClass31_591 = null;
	    aBooleanArray573 = null;
	    anIntArray597 = null;
	    aClass31_598 = null;
	    aClass20_577 = null;
	    aClass31_571 = null;
	    aClass55_589 = null;
	    aClass31_592 = null;
	    aClass31_596 = null;
	    anIntArray584 = null;
	    int i = 102 % ((arg0 - 33) / 45);
	    aClass31_578 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "oa.E(" + arg0 + ')');
	}
    }
    
    public static void method662(int arg0, Graphics arg1) {
	try {
	    anInt588++;
	    Class34.aClass37_624.method704(0, arg1, 553, 205);
	    int i = 99 % ((arg0 - -43) / 63);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("oa.H(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method663(boolean arg0, int arg1, int arg2,
				 byte[] arg3) {
	anInt587++;
	if (Class11_Sub5_Sub1.aClass15_1925 != null) {
	    if ((Class25.anInt470 ^ 0xffffffff) <= -1) {
		Class11_Sub5_Sub1.aClass15_1925.method526((byte) -91);
		Class4.anInt143 = 20;
		Class11_Sub10_Sub8.anInt2191 = 0;
		Class11_Sub10_Sub11.aByteArray2268 = null;
		Class25.anInt470 = -1;
	    }
	    if (arg1 != 0)
		method662(25, null);
	    if (arg3 != null) {
		if ((Class4.anInt143 ^ 0xffffffff) < -1) {
		    Class11_Sub5_Sub1.aClass15_1925.method536(arg1 + 1);
		    Class4.anInt143 = 0;
		}
		Class25.anInt470 = arg2;
		Class11_Sub5_Sub1.aClass15_1925.method535(arg0, (byte) 2, arg3,
							  arg2);
	    }
	}
    }
    
    static {
	aClass31_582 = Class64.method992("earlier today", 255);
	aBoolean575 = false;
	aClass31_574 = Class64.method992("Loaded textures", 255);
	anInt581 = 0;
	aClass31_586 = Class64.method992("Loaded title screen", 255);
	aClass31_591 = Class64.method992("Loaded interfaces", 255);
	aClass31_578 = Class64.method992("@yel@Classic", 255);
	aClass31_571 = Class64.method992("*6nin your message centre)3", 255);
	aClass31_592
	    = Class64.method992("Please wait 1 minute and try again)3", 255);
	aClass31_595 = Class64.method992("slide:", 255);
	aClass20_577 = new Class20();
	aClass31_596 = Class64.method992("mapscene", 255);
	aClass31_598 = Class64.method992("logo", 255);
	anIntArray597 = new int[2048];
    }
}
