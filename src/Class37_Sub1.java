/* Class37_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Class37_Sub1 extends Class37
    implements ImageProducer, ImageObserver
{
    public static int anInt1779;
    public static int anInt1780;
    public static Class40 aClass40_1781 = new Class40(500);
    public static int anInt1782;
    public static Class31 aClass31_1783 = Class64.method992("Ok", 255);
    public static int anInt1784;
    public ColorModel aColorModel1785;
    public static int anInt1786;
    public static int anInt1787;
    public static Class31 aClass31_1788
	= Class64.method992("System update in: ", 255);
    public static int anInt1789;
    public static int anInt1790;
    public static int anInt1791;
    public static Class55 aClass55_1792;
    public static int anInt1793;
    public static Class36 aClass36_1794;
    public static int anInt1795;
    public ImageConsumer anImageConsumer1796;
    public static Class31 aClass31_1797
	= Class64.method992("Loading interfaces )2 ", 255);
    public static int anInt1798;
    public static Class31 aClass31_1799 = Class64.method992("p11_full", 255);
    public static Class31 aClass31_1800;
    public static boolean aBoolean1801;
    public static Class31 aClass31_1802;
    public static int anInt1803;
    public static int anInt1804;
    public static int anInt1805;
    public static int[] anIntArray1806;
    public static int anInt1807;
    public static boolean[] aBooleanArray1808;
    public static Class37 aClass37_1809;
    
    public static void method709(int arg0) {
	if (Class29.anInt541 > 0)
	    Class29.anInt541--;
	anInt1780++;
	if (Class46.anInt848 > 1)
	    Class46.anInt848--;
	if (Class37.aBoolean686) {
	    Class37.aBoolean686 = false;
	    Class11_Sub7.method215(-19030);
	} else {
	    for (int i = 0; i < 100; i++) {
		if (!Class12.method506((byte) -98))
		    break;
	    }
	    if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -31
		|| (Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -36) {
		if (Class36.aBoolean670
		    && (Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -31) {
		    Class11_Sub10_Sub4_Sub5.anInt2681 = 0;
		    anInt1804 = 0;
		    while (Class11_Sub4.method135(-14465)) {
			/* empty */
		    }
		    for (int i = 0;
			 ((i ^ 0xffffffff)
			  > (Class11_Sub10_Sub7.aBooleanArray2148.length
			     ^ 0xffffffff));
			 i++)
			Class11_Sub10_Sub7.aBooleanArray2148[i] = false;
		}
		Applet_Sub1.method30(Class40.aClass11_Sub5_Sub1_728, (byte) 31,
				     149);
		synchronized (Class11_Sub10_Sub3.aClass46_2020.anObject858) {
		    if (Class15.aBoolean309) {
			if (Class11_Sub10_Sub4_Sub5.anInt2681 != 0
			    || (Class11_Sub10_Sub3.aClass46_2020.anInt860
				>= 40)) {
			    Buffer.anInt1535++;
			    Class40.aClass11_Sub5_Sub1_728.method196(1, 94);
			    Class40.aClass11_Sub5_Sub1_728.writeByte(0);
			    int i = 0;
			    int i_0_
				= Class40.aClass11_Sub5_Sub1_728.position;
			    for (int i_1_ = 0;
				 ((i_1_ ^ 0xffffffff)
				  > (Class11_Sub10_Sub3.aClass46_2020.anInt860
				     ^ 0xffffffff));
				 i_1_++) {
				if (-i_0_ + (Class40.aClass11_Sub5_Sub1_728
					     .position)
				    >= 240)
				    break;
				i++;
				int i_2_ = (Class11_Sub10_Sub3.aClass46_2020
					    .anIntArray861[i_1_]);
				if (i_2_ >= 0) {
				    if ((i_2_ ^ 0xffffffff) < -765)
					i_2_ = 764;
				} else
				    i_2_ = 0;
				int i_3_ = (Class11_Sub10_Sub3.aClass46_2020
					    .anIntArray863[i_1_]);
				if ((i_3_ ^ 0xffffffff) <= -1) {
				    if ((i_3_ ^ 0xffffffff) < -503)
					i_3_ = 502;
				} else
				    i_3_ = 0;
				int i_4_ = i_3_ * 765 + i_2_;
				if ((Class11_Sub10_Sub3.aClass46_2020
				     .anIntArray863[i_1_]) == -1
				    && ((Class11_Sub10_Sub3.aClass46_2020
					 .anIntArray861[i_1_])
					^ 0xffffffff) == 0) {
				    i_2_ = -1;
				    i_3_ = -1;
				    i_4_ = 524287;
				}
				if ((i_2_ ^ 0xffffffff) == (Class39.anInt713
							    ^ 0xffffffff)
				    && Class6.anInt163 == i_3_) {
				    if (Class11_Sub10_Sub5.anInt2118 < 2047)
					Class11_Sub10_Sub5.anInt2118++;
				} else {
				    int i_5_ = -Class39.anInt713 + i_2_;
				    Class39.anInt713 = i_2_;
				    int i_6_ = -Class6.anInt163 + i_3_;
				    Class6.anInt163 = i_3_;
				    if (Class11_Sub10_Sub5.anInt2118 < 8
					&& (i_5_ ^ 0xffffffff) <= 31
					&& i_5_ <= 31 && i_6_ >= -32
					&& (i_6_ ^ 0xffffffff) >= -32) {
					i_5_ += 32;
					i_6_ += 32;
					Class40.aClass11_Sub5_Sub1_728
					    .writeShortBE
					    (((Class11_Sub10_Sub5.anInt2118
					       << -1949269684)
					      + (i_5_ << -1858089210) - -i_6_)
						);
					Class11_Sub10_Sub5.anInt2118 = 0;
				    } else if ((Class11_Sub10_Sub5.anInt2118
						^ 0xffffffff)
					       > -9) {
					Class40.aClass11_Sub5_Sub1_728
					    .method148
					    ((byte) -48,
					     (i_4_
					      + ((Class11_Sub10_Sub5.anInt2118
						  << 628049107)
						 + 8388608)));
					Class11_Sub10_Sub5.anInt2118 = 0;
				    } else {
					Class40.aClass11_Sub5_Sub1_728
					    .writeIntBE
					    (((Class11_Sub10_Sub5.anInt2118
					       << 360350835)
					      + (-1073741824 + i_4_))
                        );
					Class11_Sub10_Sub5.anInt2118 = 0;
				    }
				}
			    }
			    Class40.aClass11_Sub5_Sub1_728.method191
				(-128,
				 (Class40.aClass11_Sub5_Sub1_728.position
				  + -i_0_));
			    if (i
				< Class11_Sub10_Sub3.aClass46_2020.anInt860) {
				Class11_Sub10_Sub3.aClass46_2020.anInt860 -= i;
				for (int i_7_ = 0;
				     (Class11_Sub10_Sub3.aClass46_2020.anInt860
				      ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
				     i_7_++) {
				    Class11_Sub10_Sub3.aClass46_2020
					.anIntArray861[i_7_]
					= (Class11_Sub10_Sub3.aClass46_2020
					   .anIntArray861[i + i_7_]);
				    Class11_Sub10_Sub3.aClass46_2020
					.anIntArray863[i_7_]
					= (Class11_Sub10_Sub3.aClass46_2020
					   .anIntArray863[i_7_ + i]);
				}
			    } else
				Class11_Sub10_Sub3.aClass46_2020.anInt860 = 0;
			}
		    } else
			Class11_Sub10_Sub3.aClass46_2020.anInt860 = 0;
		}
		if ((Class11_Sub10_Sub4_Sub5.anInt2681 ^ 0xffffffff) != -1) {
		    long l = ((Class1.aLong90 - Class11_Sub10_Sub1.aLong1929)
			      / 50L);
		    Buffer.anInt1536++;
		    if (l > 4095L)
			l = 4095L;
		    Class11_Sub10_Sub1.aLong1929 = Class1.aLong90;
		    int i = 0;
		    int i_8_ = Class50.anInt995;
		    if ((i_8_ ^ 0xffffffff) > -1)
			i_8_ = 0;
		    else if (i_8_ > 502)
			i_8_ = 502;
		    if ((Class11_Sub10_Sub4_Sub5.anInt2681 ^ 0xffffffff) == -3)
			i = 1;
		    int i_9_ = Class61.anInt1266;
		    int i_10_ = (int) l;
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 55);
		    if ((i_9_ ^ 0xffffffff) <= -1) {
			if (i_9_ > 764)
			    i_9_ = 764;
		    } else
			i_9_ = 0;
		    int i_11_ = 765 * i_8_ + i_9_;
		    Class40.aClass11_Sub5_Sub1_728.method157
			(12470,
			 i_11_ + ((i_10_ << -198014636) + (i << 157526099)));
		}
		if ((Class1.anInt85 ^ 0xffffffff) < -1)
		    Class1.anInt85--;
		if (Class11_Sub10_Sub7.aBooleanArray2148[96]
		    || Class11_Sub10_Sub7.aBooleanArray2148[97]
		    || Class11_Sub10_Sub7.aBooleanArray2148[98]
		    || Class11_Sub10_Sub7.aBooleanArray2148[99])
		    Class25.aBoolean480 = true;
		if (Class25.aBoolean480 && Class1.anInt85 <= 0) {
		    Class1.anInt85 = 20;
		    Class25.aBoolean480 = false;
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 2);
		    Class40.aClass11_Sub5_Sub1_728.method167(
					Class29.anInt535);
		    Class11.anInt224++;
		    Class40.aClass11_Sub5_Sub1_728.writeShortLE(Class52.anInt1022
			);
		}
		if (Class11_Sub4.aBoolean1475 != false
		    && !Class11_Sub10_Sub9.aBoolean2200 != false) {
		    Class11_Sub10_Sub9.aBoolean2200 = true;
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 99);
		    Class11_Sub11.anInt1683++;
		    Class40.aClass11_Sub5_Sub1_728.writeByte(1);
		}
		if (!Class11_Sub4.aBoolean1475 == true
		    && !Class11_Sub10_Sub9.aBoolean2200 != true) {
		    Class11_Sub11.anInt1683++;
		    Class11_Sub10_Sub9.aBoolean2200 = false;
		    Class40.aClass11_Sub5_Sub1_728.method196(1, 99);
		    Class40.aClass11_Sub5_Sub1_728.writeByte(0);
		}
		Class39.method727(true);
		if (Class11_Sub10_Sub3.anInt2013 == 30
		    || (Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -36) {
		    Class33.method664(true);
		    Class13.method509((byte) -122);
		    Class34.anInt622++;
		    if (arg0 >= 15) {
			if (Class34.anInt622 > 750)
			    Class11_Sub7.method215(-19030);
			else {
			    Class31.method651((byte) -118);
			    Class36.method697(0);
			    Class12.method503(-31470);
			    Class17.anInt340++;
			    if ((Class17.anInt342 ^ 0xffffffff) != -1) {
				Class57.anInt1174 += 20;
				if (Class57.anInt1174 >= 400)
				    Class17.anInt342 = 0;
			    }
			    if ((Class7.anInt1425 ^ 0xffffffff) != -1) {
				Class9.anInt200++;
				if ((Class9.anInt200 ^ 0xffffffff) <= -16) {
				    if ((Class7.anInt1425 ^ 0xffffffff) == -4)
					Class32.aBoolean575 = true;
				    if (Class7.anInt1425 == 2)
					Class11_Sub10_Sub14.aBoolean2352
					    = true;
				    Class7.anInt1425 = 0;
				}
			    }
			    if (Class48.anInt896 != 0) {
				Class1.anInt91++;
				if (((Class11_Sub6.anInt1590 ^ 0xffffffff)
				     < (Class64.anInt1347 - -5 ^ 0xffffffff))
				    || (Class64.anInt1347 + -5
					> Class11_Sub6.anInt1590)
				    || ((Class11_Sub10_Sub7.anInt2161
					 ^ 0xffffffff)
					< (Class11_Sub10_Sub5.anInt2052 - -5
					   ^ 0xffffffff))
				    || (-5 + Class11_Sub10_Sub5.anInt2052
					> Class11_Sub10_Sub7.anInt2161))
				    Class31.aBoolean1377 = true;
				if (anInt1804 == 0) {
				    if ((Class48.anInt896 ^ 0xffffffff) == -3)
					Class11_Sub10_Sub14.aBoolean2352
					    = true;
				    if (Class48.anInt896 == 3)
					Class32.aBoolean575 = true;
				    Class48.anInt896 = 0;
				    if (!Class31.aBoolean1377
					|| ((Class1.anInt91 ^ 0xffffffff)
					    > -6)) {
					if ((((Class62.anInt1305 ^ 0xffffffff)
					      == -2)
					     || (Class11_Sub8.method218
						 (Class11_Sub7.anInt1597 + -1,
						  (byte) -7)))
					    && (Class11_Sub7.anInt1597
						^ 0xffffffff) < -3)
					    Class9.method102(false);
					else if ((Class11_Sub7.anInt1597
						  ^ 0xffffffff)
						 < -1)
					    Class11_Sub10_Sub4_Sub2_Sub2
						.method281
						((byte) -107,
						 -1 + Class11_Sub7.anInt1597);
				    } else {
					Applet_Sub1.anInt28 = -1;
					Class39_Sub1.method734(-127);
					if ((Class40.anInt722
					     == Applet_Sub1.anInt28)
					    && ((Class4.anInt147 ^ 0xffffffff)
						!= ((Class11_Sub10_Sub4_Sub6
						     .anInt2720)
						    ^ 0xffffffff))) {
					    Class14.anInt291++;
					    int i = 0;
					    Class11_Sub10_Sub5 class11_sub10_sub5
						= (Class42.method750
						   (Class40.anInt722, 694));
					    if ((Class11_Sub10_Sub1.anInt1951
						 == 1)
						&& (class11_sub10_sub5
						    .anInt2116) == 206)
						i = 1;
					    if ((class11_sub10_sub5
						 .anIntArray2106
						 [Class4.anInt147])
						<= 0)
						i = 0;
					    if (class11_sub10_sub5
						.aBoolean2055) {
						int i_12_
						    = (Class11_Sub10_Sub4_Sub6
						       .anInt2720);
						int i_13_ = Class4.anInt147;
						class11_sub10_sub5
						    .anIntArray2106[i_13_]
						    = (class11_sub10_sub5
						       .anIntArray2106[i_12_]);
						class11_sub10_sub5
						    .anIntArray2068[i_13_]
						    = (class11_sub10_sub5
						       .anIntArray2068[i_12_]);
						class11_sub10_sub5
						    .anIntArray2106[i_12_]
						    = -1;
						class11_sub10_sub5
						    .anIntArray2068[i_12_]
						    = 0;
					    } else if ((i ^ 0xffffffff) != -2)
						class11_sub10_sub5.method332
						    (Class4.anInt147, true,
						     (Class11_Sub10_Sub4_Sub6
						      .anInt2720));
					    else {
						int i_14_ = Class4.anInt147;
						int i_15_
						    = (Class11_Sub10_Sub4_Sub6
						       .anInt2720);
						while ((i_15_ ^ 0xffffffff)
						       != (i_14_
							   ^ 0xffffffff)) {
						    if (i_14_ < i_15_) {
							class11_sub10_sub5
							    .method332
							    (-1 + i_15_, true,
							     i_15_);
							i_15_--;
						    } else if ((i_14_
								^ 0xffffffff)
							       < (i_15_
								  ^ 0xffffffff)) {
							class11_sub10_sub5
							    .method332
							    (i_15_ + 1, true,
							     i_15_);
							i_15_++;
						    }
						}
					    }
					    Class40.aClass11_Sub5_Sub1_728
						.method196(1, 125);
					    Class40.aClass11_Sub5_Sub1_728
						.writeShortLE
						((Class11_Sub10_Sub4_Sub6
						  .anInt2720)
						);
					    Class40.aClass11_Sub5_Sub1_728
						.method171
						(Class4.anInt147, -3420);
					    Class40.aClass11_Sub5_Sub1_728
						.method157
						(12470, Class40.anInt722);
					    Class40.aClass11_Sub5_Sub1_728
						.method176(false, i);
					}
				    }
				    Class11_Sub10_Sub4_Sub5.anInt2681 = 0;
				    Class9.anInt200 = 10;
				}
			    }
			    if (Class49.anInt935 != -1) {
				int i = Class49.anInt928;
				int i_16_ = Class49.anInt935;
				boolean bool
				    = (Class44.method759
				       (i, (byte) 117, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2500[0]),
					0, 0, 0, true, 0,
					(Class48
					 .aClass11_Sub10_Sub4_Sub2_Sub1_899
					 .anIntArray2562[0]),
					0, i_16_));
				Class49.anInt935 = -1;
				if (bool) {
				    NotActuallyBuffer.anInt490 = Class61.anInt1266;
				    Class17.anInt342 = 1;
				    Class57.anInt1174 = 0;
				    Class11_Sub10_Sub8.anInt2177
					= Class50.anInt995;
				}
			    }
			    if ((Class11_Sub10_Sub4_Sub5.anInt2681
				 ^ 0xffffffff) == -2
				&& Class3.aClass31_99 != null) {
				Class11_Sub10_Sub4_Sub5.anInt2681 = 0;
				Class32.aBoolean575 = true;
				Class3.aClass31_99 = null;
			    }
			    Class11_Sub10_Sub5.method338(-24);
			    if ((Class46.anInt844 ^ 0xffffffff) == 0) {
				Class11_Sub10_Sub4_Sub5.method327((byte) -85);
				Class42.method747(false);
				Class40.method741((byte) 83);
			    }
			    if (anInt1804 == 1
				|| (Class11_Sub10_Sub4_Sub5.anInt2681
				    ^ 0xffffffff) == -2)
				Class11_Sub10_Sub4_Sub2.anInt2570++;
			    if (Class22.anInt404 == -1
				&& (Class11_Sub10_Sub4_Sub2_Sub2.anInt2836
				    ^ 0xffffffff) == 0
				&& (Class11_Sub10_Sub16.anInt2430
				    ^ 0xffffffff) == 0) {
				if ((Class28.anInt502 ^ 0xffffffff) < -1)
				    Class28.anInt502--;
			    } else if (Class28.anInt502 < 100) {
				Class28.anInt502++;
				if (Class28.anInt502 == 100) {
				    if (Class11_Sub10_Sub4_Sub2_Sub2.anInt2836
					!= -1)
					Class11_Sub10_Sub14.aBoolean2352
					    = true;
				    if (Class22.anInt404 != -1)
					Class32.aBoolean575 = true;
				}
			    }
			    Class4.method61((byte) -125);
			    if (Class34.aBoolean636)
				Class44.method758(1000);
			    for (int i = 0; (i ^ 0xffffffff) > -6; i++)
				Class39.anIntArray704[i]++;
			    Class11_Sub5_Sub1.method200(1);
			    int i = Class11_Sub7.method212(22987);
			    int i_17_ = Class37.method707((byte) 119);
			    if ((i ^ 0xffffffff) < -4501
				&& (i_17_ ^ 0xffffffff) < -4501) {
				Class29.anInt541 = 250;
				Class11_Sub10_Sub6.anInt2139++;
				Class11_Sub10_Sub15.method485(4000, (byte) 80);
				Class40.aClass11_Sub5_Sub1_728.method196(1,
									 247);
			    }
			    Class51.anInt1016++;
			    Class9.anInt194++;
			    Class44.anInt815++;
			    if (Class9.anInt194 > 500) {
				Class9.anInt194 = 0;
				int i_18_ = (int) (8.0 * Math.random());
				if ((0x4 & i_18_) == 4)
				    Class62.anInt1300
					+= Class11_Sub10_Sub4_Sub2.anInt2539;
				if ((0x1 & i_18_ ^ 0xffffffff) == -2)
				    Class59.anInt1242 += Class31.anInt1398;
				if ((0x2 & i_18_ ^ 0xffffffff) == -3)
				    Class54.anInt1082
					+= Class11_Sub10_Sub12.anInt2286;
			    }
			    if ((Class44.anInt815 ^ 0xffffffff) < -501) {
				Class44.anInt815 = 0;
				int i_19_ = (int) (Math.random() * 8.0);
				if ((0x2 & i_19_) == 2)
				    Class15_Sub1.anInt1737
					+= Class11_Sub7.anInt1598;
				if ((i_19_ & 0x1 ^ 0xffffffff) == -2)
				    Class46.anInt855 += Class11_Sub7.anInt1606;
			    }
			    if (Class15_Sub1.anInt1737 < -20)
				Class11_Sub7.anInt1598 = 1;
			    if (Class62.anInt1300 < -40)
				Class11_Sub10_Sub4_Sub2.anInt2539 = 1;
			    if ((Class46.anInt855 ^ 0xffffffff) > 59)
				Class11_Sub7.anInt1606 = 2;
			    if ((Class46.anInt855 ^ 0xffffffff) < -61)
				Class11_Sub7.anInt1606 = -2;
			    if (Class59.anInt1242 < -50)
				Class31.anInt1398 = 2;
			    if (Class54.anInt1082 < -55)
				Class11_Sub10_Sub12.anInt2286 = 2;
			    if ((Class59.anInt1242 ^ 0xffffffff) < -51)
				Class31.anInt1398 = -2;
			    if ((Class15_Sub1.anInt1737 ^ 0xffffffff) < -11)
				Class11_Sub7.anInt1598 = -1;
			    if ((Class62.anInt1300 ^ 0xffffffff) < -41)
				Class11_Sub10_Sub4_Sub2.anInt2539 = -1;
			    if (Class54.anInt1082 > 55)
				Class11_Sub10_Sub12.anInt2286 = -2;
			    if ((Class51.anInt1016 ^ 0xffffffff) < -51) {
				Class40.aClass11_Sub5_Sub1_728.method196(1,
									 217);
				Class28.anInt509++;
			    }
			    do {
				try {
				    if (Class11_Sub12.aClass14_1699 == null
					|| (Class40.aClass11_Sub5_Sub1_728
					    .position) <= 0)
					break;
				    Class11_Sub12.aClass14_1699.method521
					((Class40.aClass11_Sub5_Sub1_728
					  .payload),
					 (Class40.aClass11_Sub5_Sub1_728
					  .position),
					 0, true);
				    Class40.aClass11_Sub5_Sub1_728.position
					= 0;
				    Class51.anInt1016 = 0;
				} catch (java.io.IOException ioexception) {
				    Class11_Sub7.method215(-19030);
				    break;
				}
				break;
			    } while (false);
			}
		    }
		}
	    }
	}
    }
    
    public synchronized boolean isConsumer(ImageConsumer arg0) {
	try {
	    anInt1793++;
	    if (arg0 != anImageConsumer1796)
		return false;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "tb.isConsumer(" + (arg0 != null ? "{...}"
							: "null") + ')');
	}
    }
    
    public void method703(int arg0, int arg1, Component arg2, int arg3) {
	try {
	    if (arg1 > -88)
		method713(null, false);
	    anInt691 = arg3;
	    anInt1779++;
	    anIntArray692 = new int[1 + arg0 * arg3];
	    anInt685 = arg0;
	    aColorModel1785 = new DirectColorModel(32, 16711680, 65280, 255);
	    anImage682 = arg2.createImage(this);
	    method711(-87);
	    arg2.prepareImage(anImage682, this);
	    method711(-83);
	    arg2.prepareImage(anImage682, this);
	    method711(-81);
	    arg2.prepareImage(anImage682, this);
	    this.method706(-124);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.B(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    public synchronized void addConsumer(ImageConsumer arg0) {
	try {
	    anImageConsumer1796 = arg0;
	    arg0.setDimensions(anInt685, anInt691);
	    anInt1789++;
	    arg0.setProperties(null);
	    arg0.setColorModel(aColorModel1785);
	    arg0.setHints(14);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "tb.addConsumer(" + (arg0 != null ? "{...}"
							 : "null") + ')');
	}
    }
    
    public static void method710(int arg0) {
	anInt1786++;
	System.out.println
	    ("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
	System.exit(1);
	if (arg0 != 12726)
	    method714(8, -42, null, 117);
    }
    
    public synchronized void method711(int arg0) {
	try {
	    if (arg0 >= -68)
		method712((byte) 115);
	    anInt1784++;
	    if (anImageConsumer1796 != null) {
		anImageConsumer1796.setPixels(0, 0, anInt685, anInt691,
					      aColorModel1785, anIntArray692,
					      0, anInt685);
		anImageConsumer1796.imageComplete(2);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "tb.E(" + arg0 + ')');
	}
    }
    
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	try {
	    anInt1803++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.requestTopDownLeftRightResend("
				     + (arg0 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void method704(int arg0, Graphics arg1, int arg2, int arg3) {
	try {
	    method711(-85);
	    anInt1795++;
	    if (arg0 == 0)
		arg1.drawImage(anImage682, arg2, arg3, this);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.D(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public synchronized void removeConsumer(ImageConsumer arg0) {
	anInt1805++;
	if (anImageConsumer1796 == arg0)
	    anImageConsumer1796 = null;
    }
    
    public void startProduction(ImageConsumer arg0) {
	try {
	    addConsumer(arg0);
	    anInt1791++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.startProduction("
				     + (arg0 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			       int arg4, int arg5) {
	try {
	    anInt1787++;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.imageUpdate("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ',' + arg3 + ','
				     + arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static void method712(byte arg0) {
	try {
	    aClass31_1783 = null;
	    aClass36_1794 = null;
	    aClass31_1799 = null;
	    aClass55_1792 = null;
	    aClass31_1797 = null;
	    aClass31_1802 = null;
	    if (arg0 > -36)
		method709(29);
	    aClass37_1809 = null;
	    anIntArray1806 = null;
	    aBooleanArray1808 = null;
	    aClass31_1788 = null;
	    aClass31_1800 = null;
	    aClass40_1781 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "tb.C(" + arg0 + ')');
	}
    }
    
    public static void method713(Class55 arg0, boolean arg1) {
	try {
	    anInt1782++;
	    Class8.aClass55_188 = arg0;
	    if (arg1 == false)
		Class22.anInt410
		    = Class8.aClass55_188.method895(16, (byte) 120);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "tb.F(" + (arg0 != null ? "{...}"
					       : "null") + ',' + arg1 + ')');
	}
    }
    
    public static boolean method714(int arg0, int arg1, Class55 arg2,
				    int arg3) {
	try {
	    anInt1790++;
	    byte[] is = arg2.method887((byte) -126, arg0, arg3);
	    if (is == null)
		return false;
	    if (arg1 != -29446)
		method713(null, true);
	    Class11_Sub10_Sub4_Sub5.method325(0, is);
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("tb.A(" + arg0 + ',' + arg1 + ','
				     + (arg2 != null ? "{...}" : "null") + ','
				     + arg3 + ')'));
	}
    }
    
    static {
	aClass36_1794 = new Class36();
	aClass31_1800
	    = (Class64.method992
	       ("To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3",
		255));
	aBoolean1801 = false;
	anInt1804 = 0;
	aClass31_1802 = Class64.method992("@cr2@", 255);
    }
}
