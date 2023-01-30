/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6
{
    public static Class31 aClass31_152
	= Class64.method992("Enter name of friend to delete from list", 255);
    public static int[] anIntArray153;
    public static int anInt154;
    public static int anInt155;
    public static Class37 aClass37_156;
    public static int anInt157 = 0;
    public static int anInt158;
    public static Class40 aClass40_159 = new Class40(64);
    public static int anInt160;
    public static int anInt161;
    public static int anInt162 = 0;
    public static int anInt163 = 0;
    public static int anInt164;
    
    public static void method72(int arg0) {
	try {
	    if (arg0 < 102)
		aClass40_159 = null;
	    aClass40_159 = null;
	    aClass37_156 = null;
	    aClass31_152 = null;
	    anIntArray153 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "de.A(" + arg0 + ')');
	}
    }
    
    public static void method73(byte arg0, int arg1) {
	try {
	    anInt154++;
	    int[] is = Class52.aClass11_Sub10_Sub13_Sub4_1029.anIntArray2776;
	    int i = is.length;
	    for (int i_0_ = 0; i_0_ < i; i_0_++)
		is[i_0_] = 0;
	    for (int i_1_ = 1; i_1_ < 103; i_1_++) {
		int i_2_ = 4 * (512 * (-i_1_ + 103)) + 24628;
		for (int i_3_ = 1; i_3_ < 103; i_3_++) {
		    if (((Class25.aByteArrayArrayArray481[arg1][i_3_][i_1_]
			  & 0x18)
			 ^ 0xffffffff)
			== -1)
			Class52.aClass49_1024.method815(is, i_2_, 512, arg1,
							i_3_, i_1_);
		    if (arg1 < 3 && ((Class25.aByteArrayArrayArray481[1 + arg1]
				      [i_3_][i_1_]) & 0x8
				     ^ 0xffffffff) != -1)
			Class52.aClass49_1024.method815(is, i_2_, 512,
							1 + arg1, i_3_, i_1_);
		    i_2_ += 4;
		}
	    }
	    Class52.aClass11_Sub10_Sub13_Sub4_1029.method460();
	    int i_4_
		= ((228 + (int) (20.0 * Math.random()) << 611447088)
		   - -((int) (Math.random() * 20.0) + 238 - 10 << 1281745896)
		   - (10 + -(int) (20.0 * Math.random()) + -238));
	    int i_5_
		= 238 + ((int) (20.0 * Math.random()) + -10) << 1793679856;
	    for (int i_6_ = 1; i_6_ < 103; i_6_++) {
		for (int i_7_ = 1; i_7_ < 103; i_7_++) {
		    if (((0x18
			  & Class25.aByteArrayArrayArray481[arg1][i_7_][i_6_])
			 ^ 0xffffffff)
			== -1)
			Class60.method955(arg1, i_4_, (byte) -82, i_5_, i_6_,
					  i_7_);
		    if (arg1 < 3 && (0x8 & (Class25.aByteArrayArrayArray481
					    [arg1 - -1][i_7_][i_6_])) != 0)
			Class60.method955(1 + arg1, i_4_, (byte) -82, i_5_,
					  i_6_, i_7_);
		}
	    }
	    if (arg0 != 99)
		method75(-7, null, -94, false);
	    Class50.anInt1000 = 0;
	    for (int i_8_ = 0; i_8_ < 104; i_8_++) {
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -105; i_9_++) {
		    int i_10_ = Class52.aClass49_1024.method841(Class1.anInt82,
								i_8_, i_9_);
		    if (i_10_ != 0) {
			i_10_ = 0x7fff & i_10_ >> -2042991922;
			int i_11_
			    = Class51.method853((byte) -119, i_10_).anInt1965;
			if ((i_11_ ^ 0xffffffff) <= -1) {
			    int i_12_ = i_8_;
			    int i_13_ = i_9_;
			    if ((i_11_ ^ 0xffffffff) != -23 && i_11_ != 29
				&& i_11_ != 34 && (i_11_ ^ 0xffffffff) != -37
				&& (i_11_ ^ 0xffffffff) != -47
				&& (i_11_ ^ 0xffffffff) != -48
				&& (i_11_ ^ 0xffffffff) != -49) {
				int[][] is_14_
				    = (Class39.aClass8Array707[Class1.anInt82]
				       .anIntArrayArray179);
				for (int i_15_ = 0; i_15_ < 10; i_15_++) {
				    int i_16_ = (int) (4.0 * Math.random());
				    if ((i_16_ ^ 0xffffffff) == -1 && i_12_ > 0
					&& ((i_12_ ^ 0xffffffff)
					    < (i_8_ - 3 ^ 0xffffffff))
					&& (is_14_[i_12_ - 1][i_13_]
					    & 0x1280108) == 0)
					i_12_--;
				    if ((i_16_ ^ 0xffffffff) == -2
					&& i_12_ < 103
					&& ((i_12_ ^ 0xffffffff)
					    > (3 + i_8_ ^ 0xffffffff))
					&& ((0x1280180
					     & is_14_[1 + i_12_][i_13_])
					    ^ 0xffffffff) == -1)
					i_12_++;
				    if ((i_16_ ^ 0xffffffff) == -3 && i_13_ > 0
					&& i_13_ > -3 + i_9_
					&& (is_14_[i_12_][i_13_ + -1]
					    & 0x1280102) == 0)
					i_13_--;
				    if (i_16_ == 3
					&& (i_13_ ^ 0xffffffff) > -104
					&& i_13_ < i_9_ - -3
					&& (0x1280120
					    & is_14_[i_12_][i_13_ + 1]) == 0)
					i_13_++;
				}
			    }
			    Class11_Sub10_Sub4_Sub6
				.aClass11_Sub10_Sub13_Sub4Array2713
				[Class50.anInt1000]
				= (Class55.aClass11_Sub10_Sub13_Sub4Array1140
				   [i_11_]);
			    Class11_Sub4.anIntArray1493[Class50.anInt1000]
				= i_12_;
			    Class11_Sub10_Sub8.anIntArray2193[(Class50
							       .anInt1000)]
				= i_13_;
			    Class50.anInt1000++;
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "de.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method74(boolean arg0) {
	try {
	    anInt158++;
	    Class15.method532(-7184);
	    if ((Class11_Sub10_Sub4_Sub2_Sub2.anInt2816 ^ 0xffffffff) == -3) {
		int[] is = Class11_Sub10_Sub13.anIntArray2307;
		byte[] is_17_
		    = Class3.aClass11_Sub10_Sub13_Sub3_131.aByteArray2768;
		int i = is_17_.length;
		for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_18_++) {
		    if (is_17_[i_18_] == 0)
			is[i_18_] = 0;
		}
		Class64.aClass11_Sub10_Sub13_Sub4_1348.method448
		    (0, 0, 33, 33, 25, 25, Class29.anInt535, 256,
		     Class11_Sub10_Sub8.anIntArray2188, Class17.anIntArray339);
		Class11_Sub6.method208(4, Class11_Sub10_Sub11.aGraphics2261);
	    } else {
		int i = Class46.anInt855 + Class29.anInt535 & 0x7ff;
		int i_19_
		    = (-(Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517
			 / 32)
		       + 464);
		int i_20_
		    = 48 + (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506
			    / 32);
		Class52.aClass11_Sub10_Sub13_Sub4_1029.method448
		    (25, 5, 146, 151, i_20_, i_19_, i,
		     256 + Class15_Sub1.anInt1737, Class32.anIntArray584,
		     Class12.anIntArray251);
		Class64.aClass11_Sub10_Sub13_Sub4_1348.method448
		    (0, 0, 33, 33, 25, 25, Class29.anInt535, 256,
		     Class11_Sub10_Sub8.anIntArray2188, Class17.anIntArray339);
		for (int i_21_ = 0;
		     (Class50.anInt1000 ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
		     i_21_++) {
		    i_20_ = 2 + (Class11_Sub4.anIntArray1493[i_21_] * 4
				 - (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				    .anInt2506) / 32);
		    i_19_
			= (-((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			      .anInt2517)
			     / 32)
			   + 4 * Class11_Sub10_Sub8.anIntArray2193[i_21_] + 2);
		    Class50.method844(i_20_, -21346,
				      (Class11_Sub10_Sub4_Sub6
				       .aClass11_Sub10_Sub13_Sub4Array2713
				       [i_21_]),
				      i_19_);
		}
		for (int i_22_ = 0; i_22_ < 104; i_22_++) {
		    for (int i_23_ = 0; i_23_ < 104; i_23_++) {
			Class36 class36 = (Class51.aClass36ArrayArrayArray1007
					   [Class1.anInt82][i_22_][i_23_]);
			if (class36 != null) {
			    i_20_
				= (2 + 4 * i_22_
				   - (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2506) / 32);
			    i_19_
				= -((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2517)
				    / 32) + (2 + 4 * i_23_);
			    Class50.method844
				(i_20_, -21346,
				 Class10.aClass11_Sub10_Sub13_Sub4Array209[0],
				 i_19_);
			}
		    }
		}
		for (int i_24_ = 0; i_24_ < Class32.anInt581; i_24_++) {
		    Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			= (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
			   [Class11_Sub10_Sub5.anIntArray2063[i_24_]]);
		    if (class11_sub10_sub4_sub2_sub2 != null
			&& class11_sub10_sub4_sub2_sub2.method270(28738)) {
			Class11_Sub10_Sub14 class11_sub10_sub14
			    = (class11_sub10_sub4_sub2_sub2
			       .aClass11_Sub10_Sub14_2828);
			if (class11_sub10_sub14.anIntArray2317 != null)
			    class11_sub10_sub14
				= class11_sub10_sub14.method467((byte) 83);
			if (class11_sub10_sub14 != null
			    && class11_sub10_sub14.aBoolean2329
			    && class11_sub10_sub14.aBoolean2340) {
			    i_19_
				= (-((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2517)
				     / 32)
				   + (class11_sub10_sub4_sub2_sub2.anInt2517
				      / 32));
			    i_20_
				= (-((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2506)
				     / 32)
				   + (class11_sub10_sub4_sub2_sub2.anInt2506
				      / 32));
			    Class50.method844
				(i_20_, -21346,
				 Class10.aClass11_Sub10_Sub13_Sub4Array209[1],
				 i_19_);
			}
		    }
		}
		if (arg0 != false)
		    method73((byte) 67, 79);
		for (int i_25_ = 0;
		     (i_25_ ^ 0xffffffff) > (Class48.anInt885 ^ 0xffffffff);
		     i_25_++) {
		    Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			= (Class11_Sub10_Sub7
			   .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
			   [Class32.anIntArray597[i_25_]]);
		    if (class11_sub10_sub4_sub2_sub1 != null
			&& class11_sub10_sub4_sub2_sub1.method270(28738)) {
			i_19_ = (class11_sub10_sub4_sub2_sub1.anInt2517 / 32
				 + -((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2517)
				     / 32));
			i_20_ = (class11_sub10_sub4_sub2_sub1.anInt2506 / 32
				 + -((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2506)
				     / 32));
			long l = class11_sub10_sub4_sub2_sub1.aClass31_2800
				     .method633((byte) -126);
			boolean bool = false;
			for (int i_26_ = 0; i_26_ < Buffer.anInt1573;
			     i_26_++) {
			    if (((l ^ 0xffffffffffffffffL)
				 == (Class7.aLongArray1423[i_26_]
				     ^ 0xffffffffffffffffL))
				&& NotActuallyBuffer.anIntArray484[i_26_] != 0) {
				bool = true;
				break;
			    }
			}
			boolean bool_27_ = false;
			if ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
			     .anInt2799) != 0
			    && class11_sub10_sub4_sub2_sub1.anInt2799 != 0
			    && ((class11_sub10_sub4_sub2_sub1.anInt2799
				 ^ 0xffffffff)
				== ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2799)
				    ^ 0xffffffff)))
			    bool_27_ = true;
			if (bool)
			    Class50.method844
				(i_20_, -21346,
				 Class10.aClass11_Sub10_Sub13_Sub4Array209[3],
				 i_19_);
			else if (!bool_27_)
			    Class50.method844
				(i_20_, -21346,
				 Class10.aClass11_Sub10_Sub13_Sub4Array209[2],
				 i_19_);
			else
			    Class50.method844
				(i_20_, -21346,
				 Class10.aClass11_Sub10_Sub13_Sub4Array209[4],
				 i_19_);
		    }
		}
		if (Class51.anInt1006 != 0
		    && (Class61.anInt1283 % 20 ^ 0xffffffff) > -11) {
		    if (Class51.anInt1006 == 1 && Class47.anInt872 >= 0
			&& (Class47.anInt872
			    < (Class12
			       .aClass11_Sub10_Sub4_Sub2_Sub2Array235).length)) {
			Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
			    = (Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235
			       [Class47.anInt872]);
			if (class11_sub10_sub4_sub2_sub2 != null) {
			    i_20_
				= (class11_sub10_sub4_sub2_sub2.anInt2506 / 32
				   + -((Class48
					.aClass11_Sub10_Sub4_Sub2_Sub1_899
					.anInt2506)
				       / 32));
			    i_19_
				= (class11_sub10_sub4_sub2_sub2.anInt2517 / 32
				   + -((Class48
					.aClass11_Sub10_Sub4_Sub2_Sub1_899
					.anInt2517)
				       / 32));
			    Class58.method940
				(256,
				 Class64.aClass11_Sub10_Sub13_Sub4Array1342[1],
				 i_19_, i_20_);
			}
		    }
		    if (Class51.anInt1006 == 2) {
			i_20_ = (-((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				    .anInt2506)
				   / 32)
				 + (2 + (-Class11_Sub10_Sub6.anInt2133
					 + client.anInt1466) * 4));
			i_19_ = (-((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				    .anInt2517)
				   / 32)
				 + (2 + 4 * (Class44.anInt794
					     - Class10.anInt214)));
			Class58.method940(256,
					  (Class64
					   .aClass11_Sub10_Sub13_Sub4Array1342
					   [1]),
					  i_19_, i_20_);
		    }
		    if ((Class51.anInt1006 ^ 0xffffffff) == -11
			&& Class11_Sub4.anInt1480 >= 0
			&& ((Class11_Sub10_Sub7
			     .aClass11_Sub10_Sub4_Sub2_Sub1Array2160).length
			    > Class11_Sub4.anInt1480)) {
			Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
			       [Class11_Sub4.anInt1480]);
			if (class11_sub10_sub4_sub2_sub1 != null) {
			    i_19_
				= (class11_sub10_sub4_sub2_sub1.anInt2517 / 32
				   - (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2517) / 32);
			    i_20_
				= (class11_sub10_sub4_sub2_sub1.anInt2506 / 32
				   + -((Class48
					.aClass11_Sub10_Sub4_Sub2_Sub1_899
					.anInt2506)
				       / 32));
			    Class58.method940
				(256,
				 Class64.aClass11_Sub10_Sub13_Sub4Array1342[1],
				 i_19_, i_20_);
			}
		    }
		}
		if ((Class14.anInt302 ^ 0xffffffff) != -1) {
		    i_19_ = 2 + (4 * Class40.anInt735
				 + -((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2517)
				     / 32));
		    i_20_ = (4 * Class14.anInt302 - -2
			     - (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				.anInt2506) / 32);
		    Class50.method844(i_20_, -21346,
				      (Class64
				       .aClass11_Sub10_Sub13_Sub4Array1342[0]),
				      i_19_);
		}
		Class11_Sub10_Sub13.method404(97, 78, 3, 3, 16777215);
		Class11_Sub6.method208(4, Class11_Sub10_Sub11.aGraphics2261);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "de.B(" + arg0 + ')');
	}
    }
    
    public static int method75(int arg0, byte[] arg1, int arg2, boolean arg3) {
	try {
	    anInt155++;
	    int i = -1;
	    for (int i_28_ = arg0; (i_28_ ^ 0xffffffff) > (arg2 ^ 0xffffffff);
		 i_28_++)
		i = (Class4.anIntArray136[0xff & (i ^ arg1[i_28_])]
		     ^ i >>> 646342952);
	    i ^= 0xffffffff;
	    if (arg3 != false)
		return 59;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("de.D(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    static {
	anInt161 = 0;
    }
}
