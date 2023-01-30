/* Class11_Sub10_Sub4_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub2_Sub2 extends Class11_Sub10_Sub4_Sub2
{
    public static int anInt2816 = 0;
    public static int anInt2817;
    public static Class36 aClass36_2818;
    public static int anInt2819;
    public static int anInt2820;
    public static int anInt2821;
    public static int anInt2822 = 0;
    public static Class11_Sub10_Sub13_Sub4 aClass11_Sub10_Sub13_Sub4_2823;
    public static int[] anIntArray2824;
    public static int anInt2825;
    public static int anInt2826;
    public static int anInt2827;
    public Class11_Sub10_Sub14 aClass11_Sub10_Sub14_2828;
    public static int anInt2829;
    public static boolean aBoolean2830 = false;
    public static Class31 aClass31_2831;
    public static int anInt2832;
    public static int anInt2833;
    public static Class31 aClass31_2834;
    public static Class31 aClass31_2835;
    public static int anInt2836;
    public static int anInt2837;
    public static int anInt2838;
    
    public Class11_Sub10_Sub4_Sub4 method255(byte arg0) {
	try {
	    anInt2833++;
	    if (aClass11_Sub10_Sub14_2828 == null)
		return null;
	    if (arg0 != 3)
		anInt2837 = 92;
	    Class11_Sub10_Sub12 class11_sub10_sub12
		= ((anInt2549 ^ 0xffffffff) != 0 && anInt2555 == 0
		   ? NotActuallyBuffer.method600(anInt2549, 4867) : null);
	    Class11_Sub10_Sub12 class11_sub10_sub12_0_
		= ((anInt2560 != -1
		    && ((anInt2560 ^ 0xffffffff) != (anInt2525 ^ 0xffffffff)
			|| class11_sub10_sub12 == null))
		   ? NotActuallyBuffer.method600(anInt2560, 4867) : null);
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4
		= aClass11_Sub10_Sub14_2828.method461(class11_sub10_sub12,
						      class11_sub10_sub12_0_,
						      0, anInt2558, anInt2535);
	    if (class11_sub10_sub4_sub4 == null)
		return null;
	    class11_sub10_sub4_sub4.method294();
	    anInt2552 = class11_sub10_sub4_sub4.anInt2046;
	    if (anInt2543 != -1 && (anInt2527 ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4_1_
		    = Class11_Sub10_Sub1.method229((byte) 30, anInt2543)
			  .method378((byte) -39, anInt2527);
		if (class11_sub10_sub4_sub4_1_ != null) {
		    class11_sub10_sub4_sub4_1_.method296(0, -anInt2524, 0);
		    Class11_Sub10_Sub4_Sub4[] class11_sub10_sub4_sub4s
			= { class11_sub10_sub4_sub4,
			    class11_sub10_sub4_sub4_1_ };
		    class11_sub10_sub4_sub4
			= new Class11_Sub10_Sub4_Sub4(class11_sub10_sub4_sub4s,
						      2, true);
		}
	    }
	    if (aClass11_Sub10_Sub14_2828.anInt2308 == 1)
		class11_sub10_sub4_sub4.aBoolean2623 = true;
	    return class11_sub10_sub4_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ua.D(" + arg0 + ')');
	}
    }
    
    public static void method281(byte arg0, int arg1) {
	anInt2827++;
	if (arg1 >= 0) {
	    int i = Class11_Sub10_Sub4_Sub2_Sub1.anIntArray2794[arg1];
	    if ((i ^ 0xffffffff) <= -2001)
		i -= 2000;
	    int i_2_ = Class48.anIntArray914[arg1];
	    int i_3_ = Class11_Sub8.anIntArray1627[arg1];
	    int i_4_ = Class13.anIntArray267[arg1];
	    if (Class57.anInt1154 != 0 && (i ^ 0xffffffff) != -1004) {
		Class57.anInt1154 = 0;
		Class32.aBoolean575 = true;
	    }
	    if ((i ^ 0xffffffff) == -1007) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class11_Sub10_Sub14 class11_sub10_sub14
			= (class11_sub10_sub4_sub2_sub2
			   .aClass11_Sub10_Sub14_2828);
		    if (class11_sub10_sub14.anIntArray2317 != null)
			class11_sub10_sub14
			    = class11_sub10_sub14.method467((byte) 122);
		    if (class11_sub10_sub14 != null) {
			Class31 class31;
			if (class11_sub10_sub14.aClass31_2335 != null)
			    class31 = class11_sub10_sub14.aClass31_2335;
			else
			    class31
				= Class40.method744(0, (new Class31[]
							{ (Class11_Sub10_Sub2
							   .aClass31_1979),
							  (class11_sub10_sub14
							   .aClass31_2341),
							  (Class11_Sub10_Sub16
							   .aClass31_2437) }));
			Class11_Sub10_Sub4_Sub3
			    .method288(0, Class25.aClass31_461, class31, true);
		    }
		}
	    }
	    if ((i ^ 0xffffffff) == -9) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class44.method759
			(class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			 (byte) 115, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
		    Class17.anInt342 = 2;
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    anInt2826++;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class57.anInt1174 = 0;
		    Class40.outBuffer.method196(1, 110);
		    Class40.outBuffer.method171(i_2_, -3420);
		}
	    }
	    if (i == 1005) {
		int i_5_ = 0x7fff & i_2_ >> 1719186702;
		Class11_Sub10_Sub2 class11_sub10_sub2
		    = Class51.method853((byte) -111, i_5_);
		Class31 class31;
		if (class11_sub10_sub2.aClass31_1964 == null)
		    class31 = Class40.method744(0, (new Class31[]
						    { (Class11_Sub10_Sub2
						       .aClass31_1979),
						      (class11_sub10_sub2
						       .aClass31_1958),
						      (Class11_Sub10_Sub16
						       .aClass31_2437) }));
		else
		    class31 = class11_sub10_sub2.aClass31_1964;
		Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461,
						  class31, true);
	    }
	    if ((i ^ 0xffffffff) == -12) {
		Class11_Sub10_Sub5.anInt2084++;
		boolean bool
		    = Class44.method759(i_4_, (byte) 102, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2500[0]),
					0, 0, 2, false, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2562[0]),
					0, i_3_);
		if (!bool)
		    bool
			= Class44.method759(i_4_, (byte) 98, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2500[0]),
					    1, 0, 2, false, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2562[0]),
					    1, i_3_);
		Class57.anInt1174 = 0;
		Class17.anInt342 = 2;
		Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		NotActuallyBuffer.anInt490 = Class61.anInt1266;
		Class40.outBuffer.method196(1, 211);
		Class40.outBuffer.method171(Class10.anInt212,
							 -3420);
		Class40.outBuffer.writeShortLE(Class55.anInt1098
		);
		Class40.outBuffer
		    .writeShortLE(i_3_ + Class11_Sub10_Sub6.anInt2133);
		Class40.outBuffer
		    .writeShortBE(Class10.anInt214 + i_4_);
		Class40.outBuffer.method157(12470,
							 Class60.anInt1256);
		Class40.outBuffer.writeShortBE(i_2_);
	    }
	    if (i == 56) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class44.method759
			(class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			 (byte) 121, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class57.anInt1174 = 0;
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    Class17.anInt342 = 2;
		    Canvas_Sub1.anInt44++;
		    Class40.outBuffer.method196(1, 212);
		    Class40.outBuffer.method171(i_2_, -3420);
		}
	    }
	    if (i == 55) {
		Class40.outBuffer.method196(1, 79);
		Class40.outBuffer.method182(-77, i_4_);
		Class40.outBuffer.method167(i_2_);
		Class40.outBuffer.writeShortBE(i_3_);
		Class47.anInt866++;
		Class7.anInt1425 = 2;
		Class20.anInt386 = i_4_;
		Class43.anInt785 = i_3_;
		if (Buffer.anInt1564 == i_4_ >> 1269795344)
		    Class7.anInt1425 = 1;
		if ((Class47.anInt881 ^ 0xffffffff)
		    == (i_4_ >> 2049166320 ^ 0xffffffff))
		    Class7.anInt1425 = 3;
		Class9.anInt200 = 0;
	    }
	    if (i == 51 || i == 12 || i == 2 || i == 45) {
		Class31 class31 = Class4.aClass31Array141[arg1];
		int i_6_
		    = class31.method654(Class11_Sub6.aClass31_1585, (byte) 95);
		if ((i_6_ ^ 0xffffffff) != 0) {
		    long l = class31.method639(28418, 5 + i_6_).method632
				 ((byte) 12).method633((byte) -126);
		    if ((i ^ 0xffffffff) == -52)
			Class11_Sub10_Sub5.method340(l, -121);
		    if (i == 12)
			Class15_Sub1.method539((byte) 45, l);
		    if (i == 2)
			Class11_Sub12.method501(-103, l);
		    if (i == 45)
			Class43.method755((byte) -42, l);
		}
	    }
	    if ((i ^ 0xffffffff) == -16) {
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
		if (class11_sub10_sub4_sub2_sub1 != null) {
		    Class23.anInt424++;
		    Class44.method759
			(class11_sub10_sub4_sub2_sub1.anIntArray2562[0],
			 (byte) 121, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub1.anIntArray2500[0]);
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    Class57.anInt1174 = 0;
		    Class17.anInt342 = 2;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class40.outBuffer.method196(1, 7);
		    Class40.outBuffer.method167(i_2_);
		}
	    }
	    if (i == 49) {
		Class51.anInt1010++;
		Class40.outBuffer.method196(1, 184);
		Class40.outBuffer.writeIntBE(i_4_);
		Class11_Sub10_Sub5 class11_sub10_sub5
		    = Class42.method750(i_4_, 694);
		if (class11_sub10_sub5.anIntArrayArray2070 != null
		    && (class11_sub10_sub5.anIntArrayArray2070[0][0]
			^ 0xffffffff) == -6) {
		    int i_7_ = class11_sub10_sub5.anIntArrayArray2070[0][1];
		    if (class11_sub10_sub5.anIntArray2112[0]
			!= Class29.anIntArray547[i_7_]) {
			Class29.anIntArray547[i_7_]
			    = class11_sub10_sub5.anIntArray2112[0];
			Buffer.method160(i_7_, (byte) -72);
			Class11_Sub10_Sub14.aBoolean2352 = true;
		    }
		}
	    }
	    if (i == 20) {
		Class31 class31 = Class4.aClass31Array141[arg1];
		int i_8_
		    = class31.method654(Class11_Sub6.aClass31_1585, (byte) 95);
		if ((i_8_ ^ 0xffffffff) != 0) {
		    long l = class31.method639(28418, 5 + i_8_).method632
				 ((byte) 12).method633((byte) -126);
		    int i_9_ = -1;
		    for (int i_10_ = 0; ((Buffer.anInt1573 ^ 0xffffffff)
					 < (i_10_ ^ 0xffffffff)); i_10_++) {
			if (Class7.aLongArray1423[i_10_] == l) {
			    i_9_ = i_10_;
			    break;
			}
		    }
		    if ((i_9_ ^ 0xffffffff) != 0
			&& (NotActuallyBuffer.anIntArray484[i_9_] ^ 0xffffffff) < -1) {
			Class52.anInt1027 = 3;
			Class57.anInt1154 = 0;
			Class32.aBoolean575 = true;
			Class33.aBoolean609 = true;
			Class25.aClass31_463 = Class25.aClass31_461;
			Class11_Sub10_Sub4_Sub2.aLong2529
			    = Class7.aLongArray1423[i_9_];
			Class25.aClass31_478
			    = Class40.method744(0,
						(new Class31[]
						 { Class1.aClass31_86,
						   (Canvas_Sub1.aClass31Array63
						    [i_9_]) }));
		    }
		}
	    }
	    if (i == 46) {
		Class11_Sub10_Sub6.anInt2143++;
		Class40.outBuffer.method196(1, 64);
		Class40.outBuffer.writeIntBE(i_4_);
		Class40.outBuffer.method167(i_3_);
		Class40.outBuffer.method167(i_2_);
		Class20.anInt386 = i_4_;
		Class7.anInt1425 = 2;
		Class9.anInt200 = 0;
		Class43.anInt785 = i_3_;
		if ((i_4_ >> 1507355280 ^ 0xffffffff)
		    == (Buffer.anInt1564 ^ 0xffffffff))
		    Class7.anInt1425 = 1;
		if ((i_4_ >> 293624656 ^ 0xffffffff)
		    == (Class47.anInt881 ^ 0xffffffff))
		    Class7.anInt1425 = 3;
	    }
	    if (i == 42) {
		Class31 class31 = Class4.aClass31Array141[arg1];
		int i_11_
		    = class31.method654(Class11_Sub6.aClass31_1585, (byte) 95);
		if ((i_11_ ^ 0xffffffff) != 0) {
		    if (Buffer.anInt1564 != -1)
			Class11_Sub10_Sub4_Sub3.method288(0,
							  Class25.aClass31_461,
							  (Class53
							   .aClass31_1038),
							  true);
		    else {
			Class24.method584(48);
			if (Class11_Sub7.anInt1612 != -1) {
			    Class25.aClass31_465
				= class31.method639(28418, 5 + i_11_)
				      .method632((byte) 12);
			    Class36.anInt667 = Buffer.anInt1564
				= Class11_Sub7.anInt1612;
			    Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2809 = false;
			}
		    }
		}
	    }
	    if (i == 31) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class14.anInt286++;
		    Class44.method759
			(class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			 (byte) 97, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class17.anInt342 = 2;
		    Class57.anInt1174 = 0;
		    Class40.outBuffer.method196(1, 133);
		    Class40.outBuffer.method171(i_2_, -3420);
		}
	    }
	    if ((i ^ 0xffffffff) == -41) {
		Class51.anInt1010++;
		Class40.outBuffer.method196(1, 184);
		Class40.outBuffer.writeIntBE(i_4_);
		Class11_Sub10_Sub5 class11_sub10_sub5
		    = Class42.method750(i_4_, 694);
		if (class11_sub10_sub5.anIntArrayArray2070 != null
		    && (class11_sub10_sub5.anIntArrayArray2070[0][0]
			^ 0xffffffff) == -6) {
		    int i_12_ = class11_sub10_sub5.anIntArrayArray2070[0][1];
		    Class29.anIntArray547[i_12_]
			= 1 - Class29.anIntArray547[i_12_];
		    Buffer.method160(i_12_, (byte) -61);
		    Class11_Sub10_Sub14.aBoolean2352 = true;
		}
	    }
	    if ((i ^ 0xffffffff) == -5) {
		Class40.outBuffer.method196(1, 220);
		Class40.outBuffer.writeShortLE(i_2_);
		Class40.outBuffer.writeShortBE(i_3_);
		Class40.outBuffer.method182(-121, i_4_);
		Class11_Sub7.anInt1604++;
		Class7.anInt1425 = 2;
		Class9.anInt200 = 0;
		Class43.anInt785 = i_3_;
		Class20.anInt386 = i_4_;
		if (Buffer.anInt1564 == i_4_ >> -1003194992)
		    Class7.anInt1425 = 1;
		if ((Class47.anInt881 ^ 0xffffffff)
		    == (i_4_ >> -1799304464 ^ 0xffffffff))
		    Class7.anInt1425 = 3;
	    }
	    if ((i ^ 0xffffffff) == -34) {
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
		if (class11_sub10_sub4_sub2_sub1 != null) {
		    Class44.method759
			(class11_sub10_sub4_sub2_sub1.anIntArray2562[0],
			 (byte) 107, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub1.anIntArray2500[0]);
		    Class17.anInt342 = 2;
		    Class57.anInt1174 = 0;
		    Class47.anInt871++;
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class40.outBuffer.method196(1, 58);
		    Class40.outBuffer.method171(i_2_, -3420);
		}
	    }
	    if ((i ^ 0xffffffff) == -45) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class11_Sub10_Sub14.anInt2333++;
		    Class44.method759
			(class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			 (byte) 120, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class17.anInt342 = 2;
		    Class57.anInt1174 = 0;
		    Class40.outBuffer.method196(1, 101);
		    Class40.outBuffer.writeIntBE(Class47.anInt877
			);
		    Class40.outBuffer.method167(i_2_);
		}
	    }
	    if ((i ^ 0xffffffff) == -4) {
		boolean bool
		    = Class44.method759(i_4_, (byte) 106, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2500[0]),
					0, 0, 2, false, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2562[0]),
					0, i_3_);
		Buffer.anInt1539++;
		if (!bool)
		    bool
			= Class44.method759(i_4_, (byte) -56, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2500[0]),
					    1, 0, 2, false, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2562[0]),
					    1, i_3_);
		Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		Class17.anInt342 = 2;
		NotActuallyBuffer.anInt490 = Class61.anInt1266;
		Class57.anInt1174 = 0;
		Class40.outBuffer.method196(1, 131);
		Class40.outBuffer
		    .writeShortBE(i_4_ - -Class10.anInt214);
		Class40.outBuffer.method171(i_2_, -3420);
		Class40.outBuffer.writeShortBE
		    (i_3_ - -Class11_Sub10_Sub6.anInt2133);
	    }
	    if ((i ^ 0xffffffff) == -17) {
		Class64.anInt1345++;
		boolean bool
		    = Class44.method759(i_4_, (byte) -70, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2500[0]),
					0, 0, 2, false, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2562[0]),
					0, i_3_);
		if (!bool)
		    bool
			= Class44.method759(i_4_, (byte) -64, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2500[0]),
					    1, 0, 2, false, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2562[0]),
					    1, i_3_);
		Class17.anInt342 = 2;
		NotActuallyBuffer.anInt490 = Class61.anInt1266;
		Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		Class57.anInt1174 = 0;
		Class40.outBuffer.method196(1, 200);
		Class40.outBuffer
		    .writeShortBE(Class10.anInt214 + i_4_);
		Class40.outBuffer
		    .writeShortBE(Class11_Sub10_Sub6.anInt2133 + i_3_);
		Class40.outBuffer.writeShortLE(i_2_);
	    }
	    if ((i ^ 0xffffffff) == -55) {
		Class11_Sub10_Sub5 class11_sub10_sub5
		    = Class42.method750(i_4_, 694);
		boolean bool = true;
		if ((class11_sub10_sub5.anInt2116 ^ 0xffffffff) < -1)
		    bool = Class13.method511(class11_sub10_sub5, 110);
		if (bool) {
		    Class40.outBuffer.method196(1, 184);
		    Class40.outBuffer.writeIntBE(i_4_
			);
		    Class51.anInt1010++;
		}
	    }
	    int i_13_ = 50 % ((10 - arg0) / 63);
	    if ((i ^ 0xffffffff) == -33)
		Class24.method584(63);
	    if ((i ^ 0xffffffff) == -42) {
		Class11_Sub10_Sub4_Sub6.anInt2698++;
		Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_, i_3_);
		Class40.outBuffer.method196(1, 165);
		Class40.outBuffer
		    .method167(i_4_ + Class10.anInt214);
		Class40.outBuffer
		    .method171(Class11_Sub10_Sub6.anInt2133 + i_3_, -3420);
		Class40.outBuffer
		    .writeShortLE(0x7fff & i_2_ >> -1507606994);
	    }
	    if ((i ^ 0xffffffff) == -18) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    Class44.method759
			(class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			 (byte) 116, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2500[0]),
			 1, 0, 2, false, 0,
			 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			  .anIntArray2562[0]),
			 1, class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class17.anInt342 = 2;
		    Class11_Sub10_Sub4_Sub6.anInt2702++;
		    Class57.anInt1174 = 0;
		    Class40.outBuffer.method196(1, 185);
		    Class40.outBuffer.method167(i_2_);
		}
	    }
	    if ((i ^ 0xffffffff) == -2) {
		Class39.anInt721 = 1;
		Class10.anInt212 = i_3_;
		Class60.anInt1256 = i_4_;
		Class55.anInt1098 = i_2_;
		Class11_Sub10_Sub6.aClass31_2146
		    = Class60.method950(118, i_2_).aClass31_2406;
		if (Class11_Sub10_Sub6.aClass31_2146 == null)
		    Class11_Sub10_Sub6.aClass31_2146 = Class20.aClass31_390;
		Class11_Sub10_Sub11.anInt2269 = 0;
		Class11_Sub10_Sub14.aBoolean2352 = true;
	    } else {
		if (i == 39) {
		    Class40.outBuffer.method196(1, 135);
		    Class59.anInt1238++;
		    Class40.outBuffer.method167(i_2_);
		    Class40.outBuffer.method182(-118, i_4_);
		    Class40.outBuffer.method171(i_3_, -3420);
		    Class7.anInt1425 = 2;
		    Class9.anInt200 = 0;
		    if (i_4_ >> 1922775056 == Buffer.anInt1564)
			Class7.anInt1425 = 1;
		    Class20.anInt386 = i_4_;
		    Class43.anInt785 = i_3_;
		    if (Class47.anInt881 == i_4_ >> -1912387408)
			Class7.anInt1425 = 3;
		}
		if (i == 22) {
		    Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			= Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_2_];
		    if (class11_sub10_sub4_sub2_sub2 != null) {
			Class44.method759
			    (class11_sub10_sub4_sub2_sub2.anIntArray2562[0],
			     (byte) 97, 0,
			     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			      .anIntArray2500[0]),
			     1, 0, 2, false, 0,
			     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			      .anIntArray2562[0]),
			     1,
			     class11_sub10_sub4_sub2_sub2.anIntArray2500[0]);
			NotActuallyBuffer.anInt490 = Class61.anInt1266;
			Class57.anInt1174 = 0;
			Class17.anInt342 = 2;
			Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			Class36.anInt666++;
			Class40.outBuffer.method196(1, 164);
			Class40.outBuffer.writeShortLE(i_2_);
		    }
		}
		if (i == 14) {
		    Class43.anInt773++;
		    boolean bool
			= Class44.method759(i_4_, (byte) 121, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2500[0]),
					    0, 0, 2, false, 0,
					    (Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anIntArray2562[0]),
					    0, i_3_);
		    if (!bool)
			bool = (Class44.method759
				(i_4_, (byte) -110, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1, i_3_));
		    Class17.anInt342 = 2;
		    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
		    NotActuallyBuffer.anInt490 = Class61.anInt1266;
		    Class57.anInt1174 = 0;
		    Class40.outBuffer.method196(1, 219);
		    Class40.outBuffer
			.writeShortLE(Class11_Sub10_Sub6.anInt2133 + i_3_);
		    Class40.outBuffer.writeShortLE(i_2_);
		    Class40.outBuffer
			.writeShortLE(i_4_ + Class10.anInt214);
		}
		if ((i ^ 0xffffffff) == -1002) {
		    Class11_Sub10_Sub15 class11_sub10_sub15
			= Class60.method950(55, i_2_);
		    Class31 class31;
		    if (class11_sub10_sub15.aClass31_2388 == null)
			class31 = Class40.method744(0, (new Class31[]
							{ (Class11_Sub10_Sub2
							   .aClass31_1979),
							  (class11_sub10_sub15
							   .aClass31_2406),
							  (Class11_Sub10_Sub16
							   .aClass31_2437) }));
		    else
			class31 = class11_sub10_sub15.aClass31_2388;
		    Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461,
						      class31, true);
		}
		if ((i ^ 0xffffffff) == -29) {
		    Class40.outBuffer.method196(1, 66);
		    Class40.outBuffer.method171(i_3_, -3420);
		    Class40.outBuffer.method182(-62, i_4_);
		    Class40.outBuffer.writeShortBE(i_2_);
		    Class64.anInt1336++;
		    Class40.outBuffer.writeIntBE(Class47.anInt877
			);
		    Class7.anInt1425 = 2;
		    Class43.anInt785 = i_3_;
		    if ((i_4_ >> -933328624 ^ 0xffffffff)
			== (Buffer.anInt1564 ^ 0xffffffff))
			Class7.anInt1425 = 1;
		    Class9.anInt200 = 0;
		    Class20.anInt386 = i_4_;
		    if ((Class47.anInt881 ^ 0xffffffff)
			== (i_4_ >> 298482192 ^ 0xffffffff))
			Class7.anInt1425 = 3;
		}
		if (i == 35) {
		    Class44.method760(256, Class14.anInt294);
		    Class14.anInt294 = -1;
		    Class32.aBoolean575 = true;
		}
		if ((i ^ 0xffffffff) == -53) {
		    Class40.outBuffer.method196(1, 199);
		    Class40.outBuffer.writeShortBE(i_3_);
		    Class40.outBuffer.writeIntBE(i_4_
			);
		    Class7.anInt1438++;
		    Class40.outBuffer.writeShortBE(i_2_);
		    Class9.anInt200 = 0;
		    Class20.anInt386 = i_4_;
		    Class7.anInt1425 = 2;
		    if ((Buffer.anInt1564 ^ 0xffffffff)
			== (i_4_ >> 1433367280 ^ 0xffffffff))
			Class7.anInt1425 = 1;
		    if ((i_4_ >> 1738391568 ^ 0xffffffff)
			== (Class47.anInt881 ^ 0xffffffff))
			Class7.anInt1425 = 3;
		    Class43.anInt785 = i_3_;
		}
		if (i == 53) {
		    Class40.outBuffer.method196(1, 193);
		    Class40.outBuffer.method146(-1472, i_4_);
		    Class59.anInt1234++;
		    Class40.outBuffer.writeShortLE(i_3_);
		    Class40.outBuffer.method171(i_2_, -3420);
		    Class43.anInt785 = i_3_;
		    Class7.anInt1425 = 2;
		    if (Buffer.anInt1564 == i_4_ >> 542216336)
			Class7.anInt1425 = 1;
		    if (Class47.anInt881 == i_4_ >> 356324336)
			Class7.anInt1425 = 3;
		    Class20.anInt386 = i_4_;
		    Class9.anInt200 = 0;
		}
		if (i == 34) {
		    Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_, i_3_);
		    Class40.outBuffer.method196(1, 222);
		    Class57.anInt1190++;
		    Class40.outBuffer
			.writeShortLE(Class10.anInt214 + i_4_);
		    Class40.outBuffer
			.method167((i_2_ & 0x1fffdb8d) >> 1524886030);
		    Class40.outBuffer
			.method171(Class11_Sub10_Sub6.anInt2133 + i_3_, -3420);
		}
		if ((i ^ 0xffffffff) == -48) {
		    Class40.outBuffer.method196(1, 192);
		    Class23.anInt428++;
		    Class40.outBuffer.method157(12470, i_4_);
		    Class40.outBuffer.method171(i_3_, -3420);
		    Class40.outBuffer.method167(i_2_);
		    Class20.anInt386 = i_4_;
		    Class9.anInt200 = 0;
		    Class7.anInt1425 = 2;
		    Class43.anInt785 = i_3_;
		    if ((Buffer.anInt1564 ^ 0xffffffff)
			== (i_4_ >> 857926448 ^ 0xffffffff))
			Class7.anInt1425 = 1;
		    if (Class47.anInt881 == i_4_ >> 569130000)
			Class7.anInt1425 = 3;
		}
		if (i == 26) {
		    Class40.outBuffer.method196(1, 194);
		    Class52.anInt1025++;
		    Class40.outBuffer.writeShortBE(i_2_);
		    Class40.outBuffer.method182(-95, i_4_);
		    Class40.outBuffer.method167(i_3_);
		    Class9.anInt200 = 0;
		    Class43.anInt785 = i_3_;
		    Class20.anInt386 = i_4_;
		    Class7.anInt1425 = 2;
		    if ((Buffer.anInt1564 ^ 0xffffffff)
			== (i_4_ >> 1150189168 ^ 0xffffffff))
			Class7.anInt1425 = 1;
		    if ((Class47.anInt881 ^ 0xffffffff)
			== (i_4_ >> 505560208 ^ 0xffffffff))
			Class7.anInt1425 = 3;
		}
		if (i == 1002) {
		    Class11_Sub10_Sub15 class11_sub10_sub15
			= Class60.method950(-94, i_2_);
		    Class11_Sub10_Sub5 class11_sub10_sub5
			= Class42.method750(i_4_, 694);
		    Class31 class31;
		    if (class11_sub10_sub5 != null
			&& class11_sub10_sub5.anIntArray2068[i_3_] >= 100000)
			class31
			    = (Class40.method744
			       (0,
				(new Class31[]
				 { Class11_Sub11.method493((class11_sub10_sub5
							    .anIntArray2068
							    [i_3_]),
							   (byte) -128),
				   Class11_Sub12.aClass31_1698,
				   class11_sub10_sub15.aClass31_2406 })));
		    else if (class11_sub10_sub15.aClass31_2388 == null)
			class31 = Class40.method744(0, (new Class31[]
							{ (Class11_Sub10_Sub2
							   .aClass31_1979),
							  (class11_sub10_sub15
							   .aClass31_2406),
							  (Class11_Sub10_Sub16
							   .aClass31_2437) }));
		    else
			class31 = class11_sub10_sub15.aClass31_2388;
		    Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461,
						      class31, true);
		}
		if ((i ^ 0xffffffff) == -1005) {
		    Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_, i_3_);
		    Class11_Sub10_Sub9.anInt2198++;
		    Class40.outBuffer.method196(1, 33);
		    Class40.outBuffer
			.method167(i_4_ + Class10.anInt214);
		    Class40.outBuffer
			.method171(Class11_Sub10_Sub6.anInt2133 + i_3_, -3420);
		    Class40.outBuffer
			.method171(0x7fff & i_2_ >> -2139369010, -3420);
		}
		if ((i ^ 0xffffffff) == -11) {
		    Class13.anInt254++;
		    Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_, i_3_);
		    Class40.outBuffer.method196(1, 3);
		    Class40.outBuffer.writeShortBE
			(Class11_Sub10_Sub6.anInt2133 + i_3_);
		    Class40.outBuffer
			.method167(Class10.anInt214 + i_4_);
		    Class40.outBuffer
			.writeShortLE((0x1fffc0a1 & i_2_) >> 1325909134);
		}
		if (i == 23) {
		    Class40.outBuffer.method196(1, 29);
		    Class40.outBuffer.writeShortLE(i_3_);
		    Class4.anInt140++;
		    Class40.outBuffer.writeShortBE(i_2_);
		    Class40.outBuffer.method157(12470, i_4_);
		    Class7.anInt1425 = 2;
		    Class20.anInt386 = i_4_;
		    Class43.anInt785 = i_3_;
		    if ((Buffer.anInt1564 ^ 0xffffffff)
			== (i_4_ >> -514481200 ^ 0xffffffff))
			Class7.anInt1425 = 1;
		    Class9.anInt200 = 0;
		    if (Class47.anInt881 == i_4_ >> 253477840)
			Class7.anInt1425 = 3;
		}
		if ((i ^ 0xffffffff) == -19 && !Class39_Sub1.aBoolean1839) {
		    Class40.outBuffer.method196(1, 11);
		    Class39_Sub1.aBoolean1839 = true;
		    Class11_Sub6.anInt1595++;
		}
		if ((i ^ 0xffffffff) == -22) {
		    Class11_Sub10_Sub5 class11_sub10_sub5
			= Class42.method750(i_4_, 694);
		    Class39.anInt721 = 0;
		    Class31 class31 = class11_sub10_sub5.aClass31_2114;
		    Class11_Sub10_Sub14.aBoolean2352 = true;
		    Class47.anInt877 = i_4_;
		    Class11_Sub10_Sub4_Sub5.anInt2676
			= class11_sub10_sub5.anInt2097;
		    Class11_Sub10_Sub11.anInt2269 = 1;
		    if (class31.method654(Class61.aClass31_1265, (byte) 95)
			!= -1)
			class31 = (class31.method634
				   (class31.method654(Class61.aClass31_1265,
						      (byte) 95),
				    -32, 0));
		    Class31 class31_14_ = class11_sub10_sub5.aClass31_2114;
		    if (class31_14_.method654(Class61.aClass31_1265, (byte) 95)
			!= -1)
			class31_14_
			    = (class31_14_.method639
			       (28418,
				class31_14_.method654(Class61.aClass31_1265,
						      (byte) 95) - -1));
		    Class44.aClass31_799
			= Class40.method744(0,
					    (new Class31[]
					     { class31, Class61.aClass31_1265,
					       (class11_sub10_sub5
						.aClass31_2067),
					       Class61.aClass31_1265,
					       class31_14_ }));
		    if ((Class11_Sub10_Sub4_Sub5.anInt2676 ^ 0xffffffff)
			== -17) {
			Class11_Sub10_Sub14.aBoolean2352 = true;
			NotActuallyBuffer.anInt483 = 3;
			Buffer.aBoolean1558 = true;
		    }
		} else {
		    if ((i ^ 0xffffffff) == -25) {
			if (!Class11_Sub4.aBoolean1491)
			    Class52.aClass49_1024.method833((Class61.anInt1266
							     + -4),
							    -4 + (Class50
								  .anInt995));
			else
			    Class52.aClass49_1024.method833(-4 + i_3_,
							    -4 + i_4_);
		    }
		    if (i == 13) {
			Class22.anInt407++;
			boolean bool
			    = (Class44.method759
			       (i_4_, (byte) -113, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2500[0]),
				0, 0, 2, false, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2562[0]),
				0, i_3_));
			if (!bool)
			    bool = (Class44.method759
				    (i_4_, (byte) -108, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2500[0]),
				     1, 0, 2, false, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2562[0]),
				     1, i_3_));
			Class17.anInt342 = 2;
			Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			Class57.anInt1174 = 0;
			NotActuallyBuffer.anInt490 = Class61.anInt1266;
			Class40.outBuffer.method196(1, 156);
			Class40.outBuffer.method171(i_2_, -3420);
			Class40.outBuffer.writeShortBE
			    (Class11_Sub10_Sub6.anInt2133 + i_3_);
			Class40.outBuffer
			    .method171(Class10.anInt214 + i_4_, -3420);
		    }
		    if ((i ^ 0xffffffff) == -7
			&& Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_,
							i_3_)) {
			client.anInt1468++;
			Class40.outBuffer.method196(1, 116);
			Class40.outBuffer
			    .writeShortBE(Class10.anInt214 + i_4_);
			Class40.outBuffer.writeShortLE
			    (i_3_ + Class11_Sub10_Sub6.anInt2133);
			Class40.outBuffer
			    .writeShortLE(i_2_ >> -1412921554 & 0x7fff);
			Class40.outBuffer
			    .method182(-127, Class47.anInt877);
		    }
		    if (i == 29 || (i ^ 0xffffffff) == -38) {
			Class31 class31 = Class4.aClass31Array141[arg1];
			int i_15_
			    = class31.method654(Class11_Sub6.aClass31_1585,
						(byte) 95);
			if ((i_15_ ^ 0xffffffff) != 0) {
			    class31 = class31.method639(28418, 5 + i_15_)
					  .method632((byte) 12);
			    Class31 class31_16_
				= class31.method629(121).method621(true);
			    boolean bool = false;
			    for (int i_17_ = 0; i_17_ < Class48.anInt885;
				 i_17_++) {
				Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
				    = (Class11_Sub10_Sub7
				       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
				       [Class32.anIntArray597[i_17_]]);
				if (class11_sub10_sub4_sub2_sub1 != null
				    && (class11_sub10_sub4_sub2_sub1
					.aClass31_2800) != null
				    && class11_sub10_sub4_sub2_sub1
					   .aClass31_2800
					   .method653(class31_16_, true)) {
				    bool = true;
				    Class44.method759
					((class11_sub10_sub4_sub2_sub1
					  .anIntArray2562[0]),
					 (byte) -73, 0,
					 (Class48
					  .aClass11_Sub10_Sub4_Sub2_Sub1_899
					  .anIntArray2500[0]),
					 1, 0, 2, false, 0,
					 (Class48
					  .aClass11_Sub10_Sub4_Sub2_Sub1_899
					  .anIntArray2562[0]),
					 1,
					 (class11_sub10_sub4_sub2_sub1
					  .anIntArray2500[0]));
				    if (i == 29) {
					Class40.outBuffer
					    .method196(1, 235);
					Class40.outBuffer
					    .method171
					    (Class32.anIntArray597[i_17_],
					     -3420);
					Class47.anInt867++;
				    }
				    if (i == 37) {
					Class40.outBuffer
					    .method196(1, 7);
					Class23.anInt424++;
					Class40.outBuffer
					    .method167
					    (
								Class32.anIntArray597[i_17_]);
				    }
				    break;
				}
			    }
			    if (!bool)
				Class11_Sub10_Sub4_Sub3.method288
				    (0, Class25.aClass31_461,
				     Class40.method744(0, (new Class31[]
							   { (Class11_Sub7
							      .aClass31_1599),
							     class31_16_ })),
				     true);
			}
		    }
		    if ((i ^ 0xffffffff) == -31) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    Class52.anInt1017++;
			    Class44.method759
				((class11_sub10_sub4_sub2_sub1.anIntArray2562
				  [0]),
				 (byte) 99, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub1.anIntArray2500
				  [0]));
			    Class17.anInt342 = 2;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class57.anInt1174 = 0;
			    Class40.outBuffer.method196(1, 36);
			    Class40.outBuffer.method167(i_2_);
			}
		    }
		    if (i == 9 && Class11_Sub10_Sub2.method240(-22936, i_4_,
							       i_2_, i_3_)) {
			Class11_Sub10_Sub10.anInt2232++;
			Class40.outBuffer.method196(1, 44);
			Class40.outBuffer
			    .method167(Class55.anInt1098);
			Class40.outBuffer
			    .writeShortLE(i_2_ >> -1638536466 & 0x7fff);
			Class40.outBuffer
			    .writeShortBE(Class10.anInt212);
			Class40.outBuffer
			    .writeShortBE(i_4_ - -Class10.anInt214);
			Class40.outBuffer
			    .method146(-1472, Class60.anInt1256);
			Class40.outBuffer.method167
			    (i_3_ - -Class11_Sub10_Sub6.anInt2133);
		    }
		    if ((i ^ 0xffffffff) == -28) {
			Class37.anInt689++;
			Class40.outBuffer.method196(1, 228);
			Class40.outBuffer.method146(-1472, i_4_);
			Class40.outBuffer.method167(i_3_);
			Class40.outBuffer.writeShortBE(i_2_
			);
			Class20.anInt386 = i_4_;
			Class7.anInt1425 = 2;
			Class9.anInt200 = 0;
			if ((i_4_ >> 855495024 ^ 0xffffffff)
			    == (Buffer.anInt1564 ^ 0xffffffff))
			    Class7.anInt1425 = 1;
			Class43.anInt785 = i_3_;
			if (Class47.anInt881 == i_4_ >> 1785046256)
			    Class7.anInt1425 = 3;
		    }
		    if (i == 38) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    Class47.anInt867++;
			    Class44.method759
				((class11_sub10_sub4_sub2_sub1.anIntArray2562
				  [0]),
				 (byte) 116, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub1.anIntArray2500
				  [0]));
			    Class17.anInt342 = 2;
			    Class57.anInt1174 = 0;
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    Class40.outBuffer.method196(1, 235);
			    Class40.outBuffer.method171(i_2_,
								     -3420);
			}
		    }
		    if (i == 19) {
			Class40.outBuffer.method196(1, 142);
			Class31.anInt1415++;
			Class40.outBuffer.method171(i_3_, -3420);
			Class40.outBuffer
			    .method171(Class55.anInt1098, -3420);
			Class40.outBuffer.method171(i_2_, -3420);
			Class40.outBuffer
			    .method167(Class10.anInt212);
			Class40.outBuffer.method146(-1472, i_4_);
			Class40.outBuffer
			    .method146(-1472, Class60.anInt1256);
			Class20.anInt386 = i_4_;
			Class7.anInt1425 = 2;
			if (i_4_ >> -956193200 == Buffer.anInt1564)
			    Class7.anInt1425 = 1;
			Class43.anInt785 = i_3_;
			if (i_4_ >> 406233552 == Class47.anInt881)
			    Class7.anInt1425 = 3;
			Class9.anInt200 = 0;
		    }
		    if ((i ^ 0xffffffff) == -37) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    Class11_Sub10_Sub5.anInt2113++;
			    Class44.method759
				((class11_sub10_sub4_sub2_sub1.anIntArray2562
				  [0]),
				 (byte) 102, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub1.anIntArray2500
				  [0]));
			    Class57.anInt1174 = 0;
			    Class17.anInt342 = 2;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class40.outBuffer.method196(1, 147);
			    Class40.outBuffer
				.method182(-114, Class47.anInt877);
			    Class40.outBuffer
				.writeShortBE(i_2_);
			}
		    }
		    if ((i ^ 0xffffffff) == -49) {
			Class62.anInt1295++;
			boolean bool
			    = (Class44.method759
			       (i_4_, (byte) -117, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2500[0]),
				0, 0, 2, false, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2562[0]),
				0, i_3_));
			if (!bool)
			    bool = (Class44.method759
				    (i_4_, (byte) -88, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2500[0]),
				     1, 0, 2, false, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2562[0]),
				     1, i_3_));
			Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			Class17.anInt342 = 2;
			NotActuallyBuffer.anInt490 = Class61.anInt1266;
			Class57.anInt1174 = 0;
			Class40.outBuffer.method196(1, 108);
			Class40.outBuffer.method167
			    (Class11_Sub10_Sub6.anInt2133 + i_3_);
			Class40.outBuffer
			    .method182(-123, Class47.anInt877);
			Class40.outBuffer.writeShortBE(i_2_
			);
			Class40.outBuffer
			    .writeShortLE(i_4_ + Class10.anInt214);
		    }
		    if (i == 50) {
			boolean bool
			    = (Class44.method759
			       (i_4_, (byte) 106, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2500[0]),
				0, 0, 2, false, 0,
				(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				 .anIntArray2562[0]),
				0, i_3_));
			Class22.anInt400++;
			if (!bool)
			    bool = (Class44.method759
				    (i_4_, (byte) -44, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2500[0]),
				     1, 0, 2, false, 0,
				     (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anIntArray2562[0]),
				     1, i_3_));
			NotActuallyBuffer.anInt490 = Class61.anInt1266;
			Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			Class17.anInt342 = 2;
			Class57.anInt1174 = 0;
			Class40.outBuffer.method196(1, 202);
			Class40.outBuffer
			    .writeShortBE(i_4_ - -Class10.anInt214);
			Class40.outBuffer.method171(i_2_, -3420);
			Class40.outBuffer.method167
			    (Class11_Sub10_Sub6.anInt2133 + i_3_);
		    }
		    if ((i ^ 0xffffffff) == -8) {
			Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			    = (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
			       [i_2_]);
			if (class11_sub10_sub4_sub2_sub2 != null) {
			    Class11_Sub12.anInt1694++;
			    Class44.method759
				((class11_sub10_sub4_sub2_sub2.anIntArray2562
				  [0]),
				 (byte) -52, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub2.anIntArray2500
				  [0]));
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class17.anInt342 = 2;
			    Class57.anInt1174 = 0;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    Class40.outBuffer.method196(1, 4);
			    Class40.outBuffer
				.writeShortBE(i_2_);
			    Class40.outBuffer
				.writeShortBE(Class10.anInt212);
			    Class40.outBuffer
				.writeIntBE(Class60.anInt1256);
			    Class40.outBuffer
				.writeShortLE(Class55.anInt1098);
			}
		    }
		    if (i == 43) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    Class44.method759
				((class11_sub10_sub4_sub2_sub1.anIntArray2562
				  [0]),
				 (byte) -108, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub1.anIntArray2500
				  [0]));
			    Class17.anInt342 = 2;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class6.anInt164++;
			    Class57.anInt1174 = 0;
			    Class40.outBuffer.method196(1, 190);
			    Class40.outBuffer.method167(
						i_2_);
			}
		    }
		    if ((i ^ 0xffffffff) == -6) {
			Class11_Sub10_Sub2.method240(-22936, i_4_, i_2_, i_3_);
			Class39_Sub1.anInt1815++;
			Class40.outBuffer.method196(1, 139);
			Class40.outBuffer
			    .writeShortLE(i_4_ - -Class10.anInt214);
			Class40.outBuffer.method167
			    (i_3_ - -Class11_Sub10_Sub6.anInt2133);
			Class40.outBuffer
			    .method171(i_2_ >> -1091129138 & 0x7fff, -3420);
		    }
		    if (i == 25) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    Class44.method759
				((class11_sub10_sub4_sub2_sub1.anIntArray2562
				  [0]),
				 (byte) 111, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2500[0]),
				 1, 0, 2, false, 0,
				 (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				  .anIntArray2562[0]),
				 1,
				 (class11_sub10_sub4_sub2_sub1.anIntArray2500
				  [0]));
			    Class48.anInt898++;
			    Class17.anInt342 = 2;
			    Class57.anInt1174 = 0;
			    Class11_Sub10_Sub8.anInt2177 = Class50.anInt995;
			    NotActuallyBuffer.anInt490 = Class61.anInt1266;
			    Class40.outBuffer.method196(1, 214);
			    Class40.outBuffer
				.method167(Class55.anInt1098);
			    Class40.outBuffer
				.method146(-1472, Class60.anInt1256);
			    Class40.outBuffer
				.writeShortBE(Class10.anInt212);
			    Class40.outBuffer.writeShortLE(i_2_);
			}
		    }
		    if ((Class39.anInt721 ^ 0xffffffff) != -1) {
			Class11_Sub10_Sub14.aBoolean2352 = true;
			Class39.anInt721 = 0;
		    }
		    if ((Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff) != -1) {
			Class11_Sub10_Sub14.aBoolean2352 = true;
			Class11_Sub10_Sub11.anInt2269 = 0;
		    }
		}
	    }
	}
    }
    
    public static void method282(int arg0) {
	if (arg0 != -21933)
	    aClass31_2834 = null;
	anInt2820++;
	if (Class11.aClass14_222 != null)
	    Class11.aClass14_222.method520(-9098);
    }
    
    public boolean method270(int arg0) {
	try {
	    anInt2825++;
	    if (aClass11_Sub10_Sub14_2828 == null)
		return false;
	    if (arg0 != 28738)
		method255((byte) 81);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ua.H(" + arg0 + ')');
	}
    }
    
    public static void method283(Class55 arg0, int arg1, Class55 arg2,
				 Class55 arg3) {
	try {
	    if (arg1 != 0)
		anInt2838 = 96;
	    anInt2829++;
	    Class33.aClass55_601 = arg3;
	    Class11_Sub10_Sub15.aClass55_2362 = arg2;
	    Class47.aClass55_882 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ua.I("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static void method284(int arg0, byte arg1) {
	try {
	    if (arg0 == -3)
		Class11_Sub10_Sub4.method259(Class15_Sub1.aClass31_1745,
					     (Class11_Sub10_Sub4_Sub5
					      .aClass31_2665),
					     (byte) 85);
	    else if ((arg0 ^ 0xffffffff) == 1)
		Class11_Sub10_Sub4.method259(Class25.aClass31_461,
					     Class47.aClass31_878, (byte) 61);
	    else if (arg0 == -1)
		Class11_Sub10_Sub4.method259(Class11_Sub10_Sub10.aClass31_2214,
					     (Class11_Sub10_Sub4_Sub5
					      .aClass31_2665),
					     (byte) 122);
	    else if (arg0 == 3)
		Class11_Sub10_Sub4.method259(Class25.aClass31_461,
					     Class3.aClass31_112, (byte) 66);
	    else if (arg0 != 4) {
		if ((arg0 ^ 0xffffffff) == -6)
		    Class11_Sub10_Sub4.method259(Class11.aClass31_227,
						 (Class11_Sub10_Sub4_Sub3
						  .aClass31_2576),
						 (byte) 92);
		else if (arg0 != 6) {
		    if (arg0 == 7)
			Class11_Sub10_Sub4.method259(Class7.aClass31_1444,
						     Class46.aClass31_862,
						     (byte) 76);
		    else if (arg0 != 8) {
			if (arg0 == 9)
			    Class11_Sub10_Sub4.method259
				(Class11_Sub10_Sub4_Sub6.aClass31_2717,
				 Class50.aClass31_981, (byte) 65);
			else if ((arg0 ^ 0xffffffff) != -11) {
			    if ((arg0 ^ 0xffffffff) != -12) {
				if ((arg0 ^ 0xffffffff) == -13)
				    Class11_Sub10_Sub4.method259
					(Class11_Sub10_Sub4_Sub2.aClass31_2508,
					 Class53.aClass31_1050, (byte) 92);
				else if (arg0 == 13)
				    Class11_Sub10_Sub4.method259
					(RuntimeException_Sub1.aClass31_1355,
					 Class11_Sub10_Sub4_Sub5.aClass31_2665,
					 (byte) 84);
				else if ((arg0 ^ 0xffffffff) == -15)
				    Class11_Sub10_Sub4.method259
					(Class11_Sub5_Sub1.aClass31_1926,
					 Class32.aClass31_592, (byte) 75);
				else if ((arg0 ^ 0xffffffff) != -17) {
				    if (arg0 != 17) {
					if (arg0 != 18) {
					    if ((arg0 ^ 0xffffffff) == -21)
						Class11_Sub10_Sub4.method259
						    ((Class11_Sub10_Sub7
						      .aClass31_2147),
						     (Class11_Sub10_Sub4_Sub5
						      .aClass31_2665),
						     (byte) 63);
					    else if (arg0 == 22)
						Class11_Sub10_Sub4.method259
						    (Class13.aClass31_257,
						     (Class11_Sub11
						      .aClass31_1676),
						     (byte) 57);
					    else if (arg0 == 23)
						Class11_Sub10_Sub4.method259
						    ((Class11_Sub10_Sub10
						      .aClass31_2233),
						     Class32.aClass31_592,
						     (byte) 98);
					    else if ((arg0 ^ 0xffffffff)
						     != -25) {
						if (arg0 != 25) {
						    if (arg0 == 26)
							Class11_Sub10_Sub4
							    .method259
							    ((Applet_Sub1
							      .aClass31_19),
							     aClass31_2834,
							     (byte) 75);
						    else
							Class11_Sub10_Sub4
							    .method259
							    ((Class40.method744
							      (0,
							       (new Class31[]
								{ (Class11_Sub10_Sub4_Sub5
								   .aClass31_2664),
								  (Class11_Sub11
								       .method493
								   (arg0,
								    (byte) -126)) }))),
							     (Class11_Sub10_Sub4_Sub5
							      .aClass31_2665),
							     (byte) 96);
						} else
						    Class11_Sub10_Sub4
							.method259
							((Class11_Sub10_Sub4_Sub2
							  .aClass31_2526),
							 (Class11_Sub10_Sub4_Sub5
							  .aClass31_2665),
							 (byte) 98);
					    } else
						Class11_Sub10_Sub4.method259
						    (Class42.aClass31_765,
						     Class50.aClass31_999,
						     (byte) 120);
					} else
					    Class11_Sub10_Sub4.method259
						((Class11_Sub10_Sub4_Sub1
						  .aClass31_2475),
						 Class48.aClass31_889,
						 (byte) 105);
				    } else
					Class11_Sub10_Sub4.method259
					    (Class37.aClass31_700,
					     Class17.aClass31_336, (byte) 91);
				} else
				    Class11_Sub10_Sub4.method259
					(Class47.aClass31_883,
					 Class32.aClass31_592, (byte) 59);
			    } else
				Class11_Sub10_Sub4.method259((Class17
							      .aClass31_344),
							     (Class17
							      .aClass31_333),
							     (byte) 112);
			} else
			    Class11_Sub10_Sub4.method259
				(Class11_Sub10_Sub4_Sub1.aClass31_2491,
				 Class11_Sub10_Sub8.aClass31_2196, (byte) 125);
		    } else
			Class11_Sub10_Sub4.method259((Class11_Sub10_Sub4_Sub1
						      .aClass31_2491),
						     Class36.aClass31_668,
						     (byte) 98);
		} else
		    Class11_Sub10_Sub4.method259((Class11_Sub10_Sub4_Sub5
						  .aClass31_2667),
						 (Class11_Sub10_Sub12
						  .aClass31_2300),
						 (byte) 99);
	    } else
		Class11_Sub10_Sub4.method259(Class12.aClass31_250,
					     Class29.aClass31_542, (byte) 72);
	    if (arg1 != 101)
		method282(69);
	    anInt2817++;
	    Class34.method674(10, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ua.A(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method285(byte arg0, Class11_Sub10_Sub4_Sub2 arg1) {
	arg1.aBoolean2565 = false;
	anInt2819++;
	if (arg1.anInt2560 != -1) {
	    Class11_Sub10_Sub12 class11_sub10_sub12
		= NotActuallyBuffer.method600(arg1.anInt2560, 4867);
	    arg1.anInt2536++;
	    if (arg1.anInt2535 < class11_sub10_sub12.anIntArray2280.length
		&& ((arg1.anInt2536 ^ 0xffffffff)
		    < (class11_sub10_sub12.anIntArray2296[arg1.anInt2535]
		       ^ 0xffffffff))) {
		arg1.anInt2535++;
		arg1.anInt2536 = 1;
	    }
	    if (arg1.anInt2535 >= class11_sub10_sub12.anIntArray2280.length) {
		arg1.anInt2536 = 0;
		arg1.anInt2535 = 0;
	    }
	}
	if ((arg1.anInt2543 ^ 0xffffffff) != 0
	    && arg1.anInt2563 <= Class61.anInt1283) {
	    if (arg1.anInt2527 < 0)
		arg1.anInt2527 = 0;
	    int i = (Class11_Sub10_Sub1.method229((byte) 30, arg1.anInt2543)
		     .anInt2262);
	    if ((i ^ 0xffffffff) != 0) {
		Class11_Sub10_Sub12 class11_sub10_sub12
		    = NotActuallyBuffer.method600(i, 4867);
		arg1.anInt2498++;
		if (((arg1.anInt2527 ^ 0xffffffff)
		     > (class11_sub10_sub12.anIntArray2280.length
			^ 0xffffffff))
		    && arg1.anInt2498 > (class11_sub10_sub12.anIntArray2296
					 [arg1.anInt2527])) {
		    arg1.anInt2498 = 1;
		    arg1.anInt2527++;
		}
		if (((class11_sub10_sub12.anIntArray2280.length ^ 0xffffffff)
		     >= (arg1.anInt2527 ^ 0xffffffff))
		    && ((arg1.anInt2527 ^ 0xffffffff) > -1
			|| (arg1.anInt2527
			    >= class11_sub10_sub12.anIntArray2280.length)))
		    arg1.anInt2543 = -1;
	    } else
		arg1.anInt2543 = -1;
	}
	if ((arg1.anInt2549 ^ 0xffffffff) != 0 && arg1.anInt2555 <= 1) {
	    Class11_Sub10_Sub12 class11_sub10_sub12
		= NotActuallyBuffer.method600(arg1.anInt2549, 4867);
	    if (class11_sub10_sub12.anInt2279 == 1 && arg1.anInt2514 > 0
		&& (arg1.anInt2509 ^ 0xffffffff) >= (Class61.anInt1283
						     ^ 0xffffffff)
		&& (arg1.anInt2537 ^ 0xffffffff) > (Class61.anInt1283
						    ^ 0xffffffff)) {
		arg1.anInt2555 = 1;
		return;
	    }
	}
	if ((arg1.anInt2549 ^ 0xffffffff) != 0 && arg1.anInt2555 == 0) {
	    Class11_Sub10_Sub12 class11_sub10_sub12
		= NotActuallyBuffer.method600(arg1.anInt2549, 4867);
	    arg1.anInt2496++;
	    if (class11_sub10_sub12.anIntArray2280.length > arg1.anInt2558
		&& (arg1.anInt2496
		    > class11_sub10_sub12.anIntArray2296[arg1.anInt2558])) {
		arg1.anInt2558++;
		arg1.anInt2496 = 1;
	    }
	    if ((arg1.anInt2558 ^ 0xffffffff)
		<= (class11_sub10_sub12.anIntArray2280.length ^ 0xffffffff)) {
		arg1.anInt2558 -= class11_sub10_sub12.anInt2288;
		arg1.anInt2540++;
		if ((class11_sub10_sub12.anInt2276 ^ 0xffffffff)
		    >= (arg1.anInt2540 ^ 0xffffffff))
		    arg1.anInt2549 = -1;
		if ((arg1.anInt2558 ^ 0xffffffff) > -1
		    || (arg1.anInt2558
			>= class11_sub10_sub12.anIntArray2280.length))
		    arg1.anInt2549 = -1;
	    }
	    arg1.aBoolean2565 = class11_sub10_sub12.aBoolean2284;
	}
	if (arg0 <= 25)
	    anInt2837 = 52;
	if (arg1.anInt2555 > 0)
	    arg1.anInt2555--;
    }
    
    public static void method286(boolean arg0) {
	aClass31_2831 = null;
	aClass31_2835 = null;
	aClass31_2834 = null;
	anIntArray2824 = null;
	aClass36_2818 = null;
	aClass11_Sub10_Sub13_Sub4_2823 = null;
	if (arg0 != true)
	    method284(-89, (byte) 66);
    }
    
    public static Class11_Sub10_Sub13_Sub3[] method287(int arg0) {
	try {
	    Class11_Sub10_Sub13_Sub3[] class11_sub10_sub13_sub3s
		= new Class11_Sub10_Sub13_Sub3[Class10.anInt216];
	    anInt2832++;
	    for (int i = arg0; i < Class10.anInt216; i++) {
		Class11_Sub10_Sub13_Sub3 class11_sub10_sub13_sub3
		    = (class11_sub10_sub13_sub3s[i]
		       = new Class11_Sub10_Sub13_Sub3());
		class11_sub10_sub13_sub3.anInt2770 = Class59.anInt1233;
		class11_sub10_sub13_sub3.anInt2771
		    = Class11_Sub10_Sub3.anInt2023;
		class11_sub10_sub13_sub3.anInt2769 = Class44.anIntArray814[i];
		class11_sub10_sub13_sub3.anInt2767
		    = Class11_Sub4.anIntArray1505[i];
		class11_sub10_sub13_sub3.anInt2766 = Class28.anIntArray523[i];
		class11_sub10_sub13_sub3.anInt2772 = Class6.anIntArray153[i];
		class11_sub10_sub13_sub3.anIntArray2773
		    = Class39_Sub1.anIntArray1833;
		class11_sub10_sub13_sub3.aByteArray2768
		    = Class51.aByteArrayArray1013[i];
	    }
	    Class52.method855(-122);
	    return class11_sub10_sub13_sub3s;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ua.G(" + arg0 + ')');
	}
    }
    
    static {
	anIntArray2824 = new int[50];
	aClass31_2831 = Class64.method992("titlebutton", 255);
	aClass36_2818 = new Class36();
	aClass31_2835 = Class64.method992("mapfunction", 255);
	aClass31_2834
	    = Class64.method992("as it was used to break our rules", 255);
	anInt2836 = -1;
	anInt2838 = 0;
    }
}
