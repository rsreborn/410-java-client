/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public abstract class Class39
{
    public static Class31 aClass31_703;
    public static int[] anIntArray704;
    public static int anInt705;
    public static int anInt706;
    public static Class8[] aClass8Array707 = new Class8[4];
    public static int anInt708;
    public static Class31 aClass31_709;
    public static int anInt710;
    public static boolean aBoolean711;
    public static int anInt712;
    public static int anInt713;
    public static int anInt714;
    public static Class31 aClass31_715;
    public static int anInt716;
    public static byte[][] aByteArrayArray717;
    public static Image anImage718;
    public static Class31 aClass31_719;
    public static int[] anIntArray720;
    public static int anInt721;
    
    public abstract int method724(byte i, int i_0_, int i_1_);
    
    public abstract void method725(boolean bool);
    
    public static void method726(int arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10) {
	try {
	    anInt716++;
	    if (Class61.method968(arg3, -20142)
		&& (arg1 <= arg7 && (arg0 ^ 0xffffffff) <= (arg10 ^ 0xffffffff)
		    && arg7 < arg4
		    && (arg8 ^ 0xffffffff) < (arg0 ^ 0xffffffff))) {
		if (arg2 > -82)
		    aClass31_709 = null;
		Class11_Sub10_Sub5[] class11_sub10_sub5s
		    = Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg3];
		for (int i = 0; class11_sub10_sub5s.length > i; i++) {
		    Class11_Sub10_Sub5 class11_sub10_sub5
			= class11_sub10_sub5s[i];
		    if (class11_sub10_sub5 != null
			&& (arg9 ^ 0xffffffff) == (class11_sub10_sub5.anInt2117
						   ^ 0xffffffff)) {
			int i_2_ = class11_sub10_sub5.anInt2071 - -arg1;
			int i_3_
			    = class11_sub10_sub5.anInt2081 - -arg10 + -arg5;
			if (class11_sub10_sub5.anInt2119 == 8
			    && (i_2_ ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
			    && (i_3_ ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
			    && arg7 < class11_sub10_sub5.anInt2105 + i_2_
			    && class11_sub10_sub5.anInt2115 + i_3_ > arg0)
			    Class46.anInt856 = i;
			if ((class11_sub10_sub5.anInt2090 >= 0
			     || class11_sub10_sub5.anInt2124 != 0)
			    && (i_2_ ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
			    && arg0 >= i_3_
			    && arg7 < i_2_ - -class11_sub10_sub5.anInt2105
			    && (class11_sub10_sub5.anInt2115 + i_3_
				^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
			    if ((class11_sub10_sub5.anInt2090 ^ 0xffffffff)
				<= -1)
				Class14.anInt297
				    = class11_sub10_sub5.anInt2090;
			    else
				Class14.anInt297 = i;
			}
			if (class11_sub10_sub5.anInt2119 == 0) {
			    if (!class11_sub10_sub5.aBoolean2054
				|| Class11_Sub10_Sub14.method470(arg6, i,
								 (byte) -119)
				|| Class31.aBoolean1389) {
				method726(arg0, i_2_, (byte) -84, arg3,
					  i_2_ + class11_sub10_sub5.anInt2105,
					  class11_sub10_sub5.anInt2080, arg6,
					  arg7,
					  i_3_ + class11_sub10_sub5.anInt2115,
					  i, i_3_);
				if (class11_sub10_sub5.anInt2115
				    < class11_sub10_sub5.anInt2101)
				    Class11_Sub10_Sub4_Sub2_Sub1.method279
					(114, class11_sub10_sub5,
					 i_2_ - -class11_sub10_sub5.anInt2105,
					 class11_sub10_sub5.anInt2101,
					 class11_sub10_sub5.anInt2115, arg6,
					 arg0, arg7, i_3_);
			    }
			} else {
			    if (class11_sub10_sub5.anInt2061 == 1
				&& i_2_ <= arg7 && i_3_ <= arg0
				&& arg7 < class11_sub10_sub5.anInt2105 + i_2_
				&& ((arg0 ^ 0xffffffff)
				    > (class11_sub10_sub5.anInt2115 + i_3_
				       ^ 0xffffffff))) {
				boolean bool = false;
				if ((class11_sub10_sub5.anInt2116 ^ 0xffffffff)
				    != -1)
				    bool = (Class11_Sub10_Sub14.method463
					    (class11_sub10_sub5, (byte) -69));
				if (!bool) {
				    Class7.method80((class11_sub10_sub5
						     .aClass31_2087),
						    54,
						    i + (arg3 << 593914160), 0,
						    false, 0);
				    Class11_Sub10_Sub11.anInt2249++;
				}
			    }
			    if (((class11_sub10_sub5.anInt2061 ^ 0xffffffff)
				 == -3)
				&& (Class11_Sub10_Sub11.anInt2269
				    ^ 0xffffffff) == -1
				&& (arg7 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff)
				&& i_3_ <= arg0
				&& class11_sub10_sub5.anInt2105 + i_2_ > arg7
				&& (i_3_ + class11_sub10_sub5.anInt2115
				    > arg0)) {
				Class31 class31
				    = class11_sub10_sub5.aClass31_2114;
				if (class31.method654(Class61.aClass31_1265,
						      (byte) 95)
				    != -1)
				    class31
					= (class31.method634
					   (class31.method654((Class61
							       .aClass31_1265),
							      (byte) 95),
					    -32, 0));
				Class7.method80
				    (Class40.method744(0,
						       (new Class31[]
							{ class31,
							  Class14.aClass31_301,
							  (class11_sub10_sub5
							   .aClass31_2067) })),
				     21, i + (arg3 << 972631216), 0, false, 0);
				Class3.anInt124++;
			    }
			    if (((class11_sub10_sub5.anInt2061 ^ 0xffffffff)
				 == -4)
				&& arg7 >= i_2_ && arg0 >= i_3_
				&& (i_2_ + class11_sub10_sub5.anInt2105
				    ^ 0xffffffff) < (arg7 ^ 0xffffffff)
				&& (class11_sub10_sub5.anInt2115 + i_3_
				    > arg0)) {
				client.anInt1460++;
				int i_4_;
				if ((arg6 ^ 0xffffffff) != -4)
				    i_4_ = 32;
				else
				    i_4_ = 35;
				Class7.method80(Class31.aClass31_1401, i_4_,
						(arg3 << 1377079504) - -i, 0,
						false, 0);
			    }
			    if (class11_sub10_sub5.anInt2061 == 4
				&& arg7 >= i_2_
				&& (i_3_ ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
				&& arg7 < class11_sub10_sub5.anInt2105 + i_2_
				&& (class11_sub10_sub5.anInt2115 + i_3_
				    > arg0)) {
				Class7.method80((class11_sub10_sub5
						 .aClass31_2087),
						40, (arg3 << -2106873360) + i,
						0, false, 0);
				Class53.anInt1042++;
			    }
			    if (class11_sub10_sub5.anInt2061 == 5
				&& arg7 >= i_2_
				&& (arg0 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)
				&& i_2_ - -class11_sub10_sub5.anInt2105 > arg7
				&& (class11_sub10_sub5.anInt2115 + i_3_
				    ^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
				Class7.method80((class11_sub10_sub5
						 .aClass31_2087),
						49, (arg3 << -780420624) + i,
						0, false, 0);
				Class50.anInt983++;
			    }
			    if (class11_sub10_sub5.anInt2061 == 6
				&& Class39_Sub1.aBoolean1839 == false
				&& (i_2_ ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
				&& i_3_ <= arg0
				&& ((arg7 ^ 0xffffffff)
				    > (i_2_ + class11_sub10_sub5.anInt2105
				       ^ 0xffffffff))
				&& ((arg0 ^ 0xffffffff)
				    > (class11_sub10_sub5.anInt2115 + i_3_
				       ^ 0xffffffff))) {
				Class7.method80((class11_sub10_sub5
						 .aClass31_2087),
						18, i + (arg3 << -529885648),
						0, false, 0);
				Class11.anInt225++;
			    }
			    if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff)
				== -3) {
				int i_5_ = 0;
				for (int i_6_ = 0;
				     ((class11_sub10_sub5.anInt2115
				       ^ 0xffffffff)
				      < (i_6_ ^ 0xffffffff));
				     i_6_++) {
				    for (int i_7_ = 0;
					 ((class11_sub10_sub5.anInt2105
					   ^ 0xffffffff)
					  < (i_7_ ^ 0xffffffff));
					 i_7_++) {
					int i_8_
					    = i_3_ - -(((class11_sub10_sub5
							 .anInt2066)
							+ 32)
						       * i_6_);
					int i_9_ = (i_7_ * ((class11_sub10_sub5
							     .anInt2053)
							    + 32)
						    + i_2_);
					if ((i_5_ ^ 0xffffffff) > -21) {
					    i_9_ += (class11_sub10_sub5
						     .anIntArray2073[i_5_]);
					    i_8_ += (class11_sub10_sub5
						     .anIntArray2098[i_5_]);
					}
					if (i_9_ <= arg7 && i_8_ <= arg0
					    && ((i_9_ - -32 ^ 0xffffffff)
						< (arg7 ^ 0xffffffff))
					    && ((arg0 ^ 0xffffffff)
						> (i_8_ + 32 ^ 0xffffffff))) {
					    Class4.anInt147 = i_5_;
					    Applet_Sub1.anInt28
						= i + (arg3 << 100823376);
					    if ((class11_sub10_sub5
						 .anIntArray2106[i_5_])
						> 0) {
						Class11_Sub10_Sub15 class11_sub10_sub15
						    = (Class60.method950
						       (114,
							(-1
							 + (class11_sub10_sub5
							    .anIntArray2106
							    [i_5_]))));
						if (((anInt721 ^ 0xffffffff)
						     != -2)
						    || !(class11_sub10_sub5
							 .aBoolean2093)) {
						    if (((Class11_Sub10_Sub11
							  .anInt2269)
							 ^ 0xffffffff) != -2
							|| !(class11_sub10_sub5
							     .aBoolean2093)) {
							Class31[] class31s
							    = (class11_sub10_sub15
							       .aClass31Array2374);
							Class11_Sub10_Sub4_Sub5
							    .anInt2685++;
							if (Class13
							    .aBoolean269)
							    class31s
								= (Class11_Sub10_Sub6
								       .method350
								   ((byte) 112,
								    class31s));
							if (class11_sub10_sub5
							    .aBoolean2093) {
							    for (int i_10_ = 4;
								 ((i_10_
								   ^ 0xffffffff)
								  <= -4);
								 i_10_--) {
								if ((class31s
								     != null)
								    && ((class31s
									 [i_10_])
									!= null)) {
								    Class9
									.anInt197++;
								    int i_11_;
								    if (i_10_
									== 3)
									i_11_
									    = 53;
								    else
									i_11_
									    = 23;
								    Class7
									.method80
									((Class40
									      .method744
									  (0,
									   (new Class31[]
									    { class31s[i_10_],
									      Class47.aClass31_875,
									      class11_sub10_sub15.aClass31_2406 }))),
									 i_11_,
									 (i
									  + (arg3
									     << 1864444848)),
									 i_5_,
									 false,
									 (class11_sub10_sub15
									  .anInt2409));
								} else if ((i_10_
									    ^ 0xffffffff)
									   == -5) {
								    Class7
									.method80
									((Class40
									      .method744
									  (0,
									   (new Class31[]
									    { Class11_Sub10_Sub10.aClass31_2216,
									      class11_sub10_sub15.aClass31_2406 }))),
									 23,
									 (i
									  + (arg3
									     << -2048570160)),
									 i_5_,
									 false,
									 (class11_sub10_sub15
									  .anInt2409));
								    Class11_Sub10_Sub1
									.anInt1931++;
								}
							    }
							}
							if (class11_sub10_sub5
							    .aBoolean2122) {
							    Class11_Sub10_Sub14
								.anInt2346++;
							    Class7.method80
								((Class40
								      .method744
								  (0,
								   (new Class31[]
								    { (Class25
								       .aClass31_466),
								      (class11_sub10_sub15
								       .aClass31_2406) }))),
								 1,
								 i + (arg3
								      << -763237264),
								 i_5_, false,
								 (class11_sub10_sub15
								  .anInt2409));
							}
							if ((class11_sub10_sub5
							     .aBoolean2093)
							    && (class31s
								!= null)) {
							    for (int i_12_ = 2;
								 i_12_ >= 0;
								 i_12_--) {
								if ((class31s
								     [i_12_])
								    != null) {
								    Class24
									.anInt445++;
								    int i_13_
									= 0;
								    if ((i_12_
									 ^ 0xffffffff)
									== -1)
									i_13_
									    = 4;
								    if ((i_12_
									 ^ 0xffffffff)
									== -2)
									i_13_
									    = 27;
								    if (i_12_
									== 2)
									i_13_
									    = 46;
								    Class7
									.method80
									((Class40
									      .method744
									  (0,
									   (new Class31[]
									    { class31s[i_12_],
									      Class47.aClass31_875,
									      class11_sub10_sub15.aClass31_2406 }))),
									 i_13_,
									 ((arg3
									   << 1987777264)
									  + i),
									 i_5_,
									 false,
									 (class11_sub10_sub15
									  .anInt2409));
								}
							    }
							}
							class31s
							    = (class11_sub10_sub5
							       .aClass31Array2086);
							if (Class13
							    .aBoolean269)
							    class31s
								= (Class11_Sub10_Sub6
								       .method350
								   ((byte) 112,
								    class31s));
							if (class31s != null) {
							    for (int i_14_ = 4;
								 ((i_14_
								   ^ 0xffffffff)
								  <= -1);
								 i_14_--) {
								if ((class31s
								     [i_14_])
								    != null) {
								    int i_15_
									= 0;
								    if (i_14_
									== 0)
									i_15_
									    = 52;
								    if ((i_14_
									 ^ 0xffffffff)
									== -2)
									i_15_
									    = 55;
								    Class11_Sub10_Sub4_Sub2_Sub2
									.anInt2821++;
								    if ((i_14_
									 ^ 0xffffffff)
									== -3)
									i_15_
									    = 47;
								    if ((i_14_
									 ^ 0xffffffff)
									== -4)
									i_15_
									    = 39;
								    if ((i_14_
									 ^ 0xffffffff)
									== -5)
									i_15_
									    = 26;
								    Class7
									.method80
									((Class40
									      .method744
									  (0,
									   (new Class31[]
									    { class31s[i_14_],
									      Class47.aClass31_875,
									      class11_sub10_sub15.aClass31_2406 }))),
									 i_15_,
									 ((arg3
									   << -1550819600)
									  + i),
									 i_5_,
									 false,
									 (class11_sub10_sub15
									  .anInt2409));
								}
							    }
							}
							Class7.method80
							    ((Class40.method744
							      (0,
							       (new Class31[]
								{ (Class11_Sub10_Sub9
								   .aClass31_2207),
								  (class11_sub10_sub15
								   .aClass31_2406) }))),
							     1002,
							     i + (arg3
								  << 307046320),
							     i_5_, false,
							     (class11_sub10_sub15
							      .anInt2409));
						    } else if (((0x10
								 & (Class11_Sub10_Sub4_Sub5
								    .anInt2676))
								^ 0xffffffff)
							       == -17) {
							Class7.method80
							    ((Class40.method744
							      (0,
							       (new Class31[]
								{ (Class44
								   .aClass31_799),
								  (Class47
								   .aClass31_875),
								  (class11_sub10_sub15
								   .aClass31_2406) }))),
							     28,
							     ((arg3
							       << -2021597776)
							      + i),
							     i_5_, false,
							     (class11_sub10_sub15
							      .anInt2409));
							Class11_Sub10_Sub6
							    .anInt2141++;
						    }
						} else if ((Class60.anInt1256
							    != ((arg3
								 << -417223888)
								+ i))
							   || (Class10.anInt212
							       != i_5_)) {
						    Class7.method80
							((Class40.method744
							  (0,
							   (new Class31[]
							    { (Class8
							       .aClass31_168),
							      (Class11_Sub10_Sub6
							       .aClass31_2146),
							      (Class11_Sub10_Sub4_Sub5
							       .aClass31_2675),
							      (class11_sub10_sub15
							       .aClass31_2406) }))),
							 19,
							 ((arg3 << -1737423600)
							  - -i),
							 i_5_, false,
							 (class11_sub10_sub15
							  .anInt2409));
						    Class39_Sub1.anInt1826++;
						}
					    }
					}
					i_5_++;
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("pd.E(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + arg3 + ',' + arg4 + ',' + arg5
				     + ',' + arg6 + ',' + arg7 + ',' + arg8
				     + ',' + arg9 + ',' + arg10 + ')'));
	}
    }
    
    public static void method727(boolean arg0) {
	do {
	    try {
		anInt712++;
		if (Class1.aBoolean94
		    && Class1.anInt82 != Class11_Sub10_Sub14.anInt2355)
		    Class43.method753(Class11_Sub10_Sub4_Sub2.anInt2571,
				      Class1.anInt82, (byte) 123,
				      (Class48
				       .aClass11_Sub10_Sub4_Sub2_Sub1_899
				       .anIntArray2562[0]),
				      (Class48
				       .aClass11_Sub10_Sub4_Sub2_Sub1_899
				       .anIntArray2500[0]),
				      Class11_Sub10_Sub4.anInt2043);
		else {
		    if ((Buffer.anInt1569 ^ 0xffffffff)
			!= (Class1.anInt82 ^ 0xffffffff)) {
			Buffer.anInt1569 = Class1.anInt82;
			Class6.method73((byte) 99, Class1.anInt82);
		    }
		    if (arg0 == true)
			break;
		    method729(23);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					"pd.F(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public static void method728(int arg0) {
	try {
	    anImage718 = null;
	    aClass31_715 = null;
	    int i = 108 / ((arg0 - 71) / 48);
	    aByteArrayArray717 = null;
	    aClass8Array707 = null;
	    aClass31_719 = null;
	    aClass31_709 = null;
	    anIntArray704 = null;
	    anIntArray720 = null;
	    aClass31_703 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "pd.G(" + arg0 + ')');
	}
    }
    
    public static void method729(int arg0) {
	do {
	    try {
		synchronized (Class55.anObject1111) {
		    if (Class32.anInt583 != 0) {
			Class32.anInt583 = 1;
			try {
			    Class55.anObject1111.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		}
		anInt710++;
		if (arg0 == -27632)
		    break;
		anIntArray704 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class58.method939(runtimeexception,
					"pd.D(" + arg0 + ')');
	    }
	    break;
	} while (false);
    }
    
    public abstract void method730(int i);
    
    static {
	anIntArray704 = new int[5];
	aBoolean711 = false;
	aClass31_703 = Class64.method992(":chalreq:", 255);
	aByteArrayArray717 = new byte[50][];
	aClass31_719 = Class64.method992("@yel@World", 255);
	aClass31_715 = Class64.method992("chatback", 255);
	anInt713 = 0;
	anInt708 = 0;
	aClass31_709 = Class64.method992("q8_full", 255);
	anIntArray720 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2,
				    2, 2, 2, 2, 2, 2, 2, 2, 3 };
	anInt721 = 0;
    }
}
