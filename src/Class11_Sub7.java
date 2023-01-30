/* Class11_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class11_Sub7 extends Class11
{
    public static int anInt1596;
    public static int anInt1597 = 0;
    public static int anInt1598 = 1;
    public static Class31 aClass31_1599
	= Class64.method992("Unable to find ", 255);
    public static int anInt1600;
    public static int anInt1601;
    public static int anInt1602;
    public static int anInt1603;
    public static int anInt1604;
    public static Class55 aClass55_1605;
    public static int anInt1606;
    public static int anInt1607;
    public static int anInt1608;
    public static Class3[] aClass3Array1609 = new Class3[5];
    public static int anInt1610;
    public Class31 aClass31_1611;
    public static int anInt1612;
    
    public static Class11_Sub10_Sub1 method210(byte arg0, int arg1) {
	try {
	    anInt1601++;
	    Class11_Sub10_Sub1 class11_sub10_sub1
		= ((Class11_Sub10_Sub1)
		   Class39_Sub1.aClass40_1811.method735((long) arg1,
							(byte) -75));
	    if (class11_sub10_sub1 != null)
		return class11_sub10_sub1;
	    byte[] is = Class28.aClass55_508.method887((byte) -124, arg1, 14);
	    class11_sub10_sub1 = new Class11_Sub10_Sub1();
	    if (arg0 > -17)
		anInt1607 = -97;
	    if (is != null)
		class11_sub10_sub1.method234(new Buffer(is),
					     (byte) -127);
	    Class39_Sub1.aClass40_1811.method742(-121, (long) arg1,
						 class11_sub10_sub1);
	    return class11_sub10_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "gd.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method211(byte arg0) {
	try {
	    aClass55_1605 = null;
	    if (arg0 != 111)
		method212(-125);
	    aClass3Array1609 = null;
	    aClass31_1599 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gd.B(" + arg0 + ')');
	}
    }
    
    public static int method212(int arg0) {
	try {
	    if (arg0 != 22987)
		method213(null, 90, null);
	    anInt1596++;
	    return Class11_Sub10_Sub4_Sub3.anInt2591++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gd.F(" + arg0 + ')');
	}
    }
    
    public static int method213(Class31 arg0, int arg1, Buffer arg2) {
	try {
	    anInt1608++;
	    if (arg1 <= 106)
		anInt1600 = -43;
	    int i = arg2.position;
	    arg2.method155(arg0.anInt1403);
	    arg2.position
		+= Class11_Sub4.aClass33_1503.method668(arg0.aByteArray1366,
							arg0.anInt1403,
							arg2.payload, 0,
							(byte) -96,
							arg2.position);
	    return arg2.position + -i;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("gd.A("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ','
				     + (arg2 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public static boolean method214(byte arg0) {
	try {
	    long l = System.currentTimeMillis();
	    anInt1602++;
	    int i = (int) (-Class11.aLong221 + l);
	    if ((i ^ 0xffffffff) < -201)
		i = 200;
	    Class11.aLong221 = l;
	    Class24.anInt439 += i;
	    if (Class52.anInt1032 == 0
		&& Class11_Sub10_Sub4_Sub2_Sub2.anInt2822 == 0
		&& Class11_Sub10_Sub3.anInt2016 == 0 && Class12.anInt238 == 0)
		return true;
	    if (arg0 <= 7)
		method214((byte) -21);
	    if (Class11.aClass14_222 == null)
		return false;
	    try {
		if (Class24.anInt439 > 30000)
		    throw new IOException();
		for (/**/;
		     ((Class11_Sub10_Sub4_Sub2_Sub2.anInt2822 ^ 0xffffffff)
		      > -21);
		     Class11_Sub10_Sub4_Sub2_Sub2.anInt2822++) {
		    if (Class12.anInt238 <= 0)
			break;
		    Class11_Sub10_Sub16 class11_sub10_sub16
			= ((Class11_Sub10_Sub16)
			   Class52.aClass34_1020.method671((byte) -102));
		    Buffer buffer = new Buffer(4);
		    buffer.writeByte(1);
		    buffer.method148(
					(int) class11_sub10_sub16.aLong231);
		    Class11.aClass14_222.method521(buffer.payload,
						   4, 0, true);
		    Class37.aClass34_696.method682(126, class11_sub10_sub16,
						   (class11_sub10_sub16
						    .aLong231));
		    Class12.anInt238--;
		}
		for (/**/;
		     ((Class52.anInt1032 ^ 0xffffffff) > -21
		      && (Class11_Sub10_Sub3.anInt2016 ^ 0xffffffff) < -1);
		     Class52.anInt1032++) {
		    Class11_Sub10_Sub16 class11_sub10_sub16
			= ((Class11_Sub10_Sub16)
			   Class33.aClass32_607.method658(-1));
		    Buffer buffer = new Buffer(4);
		    buffer.writeByte(0);
		    buffer.method148(
					(int) class11_sub10_sub16.aLong231);
		    Class11.aClass14_222.method521(buffer.payload,
						   4, 0, true);
		    class11_sub10_sub16.method227(55);
		    Class13.aClass34_255.method682(126, class11_sub10_sub16,
						   (class11_sub10_sub16
						    .aLong231));
		    Class11_Sub10_Sub3.anInt2016--;
		}
		for (int i_0_ = 0; i_0_ < 100; i_0_++) {
		    int i_1_ = Class11.aClass14_222.method518(0);
		    if ((i_1_ ^ 0xffffffff) > -1)
			throw new IOException();
		    if (i_1_ == 0)
			break;
		    Class24.anInt439 = 0;
		    int i_2_ = 0;
		    if (Class50.aClass11_Sub10_Sub16_1001 != null) {
			if ((Class63.anInt1323 ^ 0xffffffff) == -1)
			    i_2_ = 1;
		    } else
			i_2_ = 8;
		    if (i_2_ > 0) {
			int i_3_ = (-Class11_Sub4.aBuffer_1476.position
				    + i_2_);
			if (i_1_ < i_3_)
			    i_3_ = i_1_;
			Class11.aClass14_222.method515
			    (Class11_Sub4.aBuffer_1476.position, i_3_,
			     (byte) 84,
			     Class11_Sub4.aBuffer_1476.payload);
			if (Class34.aByte635 != 0) {
			    for (int i_4_ = 0;
				 (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff);
				 i_4_++)
				Class11_Sub4.aBuffer_1476
				    .payload
				    [i_4_ + (Class11_Sub4.aBuffer_1476
					     .position)]
				    = (byte) (Class11_Sub12.method494
					      ((Class11_Sub4.aBuffer_1476
						.payload
						[i_4_ + (Class11_Sub4
							 .aBuffer_1476
							 .position)]),
					       Class34.aByte635));
			}
			Class11_Sub4.aBuffer_1476.position += i_3_;
			if ((Class11_Sub4.aBuffer_1476.position
			     ^ 0xffffffff)
			    > (i_2_ ^ 0xffffffff))
			    break;
			if (Class50.aClass11_Sub10_Sub16_1001 == null) {
			    Class11_Sub4.aBuffer_1476.position = 0;
			    int i_5_ = Class11_Sub4.aBuffer_1476
					   .method168(255);
			    int i_6_ = Class11_Sub4.aBuffer_1476
					   .method164();
			    int i_7_ = Class11_Sub4.aBuffer_1476
					   .method168(255);
			    int i_8_ = Class11_Sub4.aBuffer_1476
					   .method188((byte) 105);
			    long l_9_ = (long) ((i_5_ << 109357392) + i_6_);
			    Class11_Sub10_Sub16 class11_sub10_sub16
				= ((Class11_Sub10_Sub16)
				   Class37.aClass34_696.method677(120, l_9_));
			    Class52.aBoolean1023 = true;
			    if (class11_sub10_sub16 == null) {
				class11_sub10_sub16
				    = ((Class11_Sub10_Sub16)
				       Class13.aClass34_255.method677(126,
								      l_9_));
				Class52.aBoolean1023 = false;
			    }
			    if (class11_sub10_sub16 == null)
				throw new IOException();
			    Class50.aClass11_Sub10_Sub16_1001
				= class11_sub10_sub16;
			    int i_10_ = (i_7_ ^ 0xffffffff) != -1 ? 9 : 5;
			    Class9.aBuffer_193
				= new Buffer((Class50
						    .aClass11_Sub10_Sub16_1001
						    .aByte2429)
						   + i_10_ + i_8_);
			    Class9.aBuffer_193.writeByte(i_7_);
			    Class9.aBuffer_193.writeIntBE(i_8_
                );
			    Class11_Sub4.aBuffer_1476.position = 0;
			    Class63.anInt1323 = 8;
			} else if (Class63.anInt1323 == 0) {
			    if ((Class11_Sub4.aBuffer_1476.payload
				 [0])
				!= -1)
				Class50.aClass11_Sub10_Sub16_1001 = null;
			    else {
				Class63.anInt1323 = 1;
				Class11_Sub4.aBuffer_1476.position = 0;
			    }
			}
		    } else {
			int i_11_
			    = (Class9.aBuffer_193.payload.length
			       + -Class50.aClass11_Sub10_Sub16_1001.aByte2429);
			int i_12_ = -Class63.anInt1323 + 512;
			if ((i_12_ ^ 0xffffffff)
			    < (i_11_ + -Class9.aBuffer_193.position
			       ^ 0xffffffff))
			    i_12_
				= i_11_ + -Class9.aBuffer_193.position;
			if (i_1_ < i_12_)
			    i_12_ = i_1_;
			Class11.aClass14_222.method515
			    (Class9.aBuffer_193.position, i_12_,
			     (byte) 127,
			     Class9.aBuffer_193.payload);
			if (Class34.aByte635 != 0) {
			    for (int i_13_ = 0;
				 (i_12_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff);
				 i_13_++)
				Class9.aBuffer_193.payload
				    [(i_13_
				      + Class9.aBuffer_193.position)]
				    = (byte) (Class11_Sub12.method494
					      ((Class9.aBuffer_193
						.payload
						[i_13_ + (Class9
							  .aBuffer_193
							  .position)]),
					       Class34.aByte635));
			}
			Class9.aBuffer_193.position += i_12_;
			Class63.anInt1323 += i_12_;
			if ((i_11_ ^ 0xffffffff)
			    != (Class9.aBuffer_193.position
				^ 0xffffffff)) {
			    if ((Class63.anInt1323 ^ 0xffffffff) != -513)
				break;
			    Class63.anInt1323 = 0;
			} else {
			    if (Class50.aClass11_Sub10_Sub16_1001.aLong231
				== 16711935L) {
				Class11_Sub10_Sub2.aBuffer_2005
				    = Class9.aBuffer_193;
				for (int i_14_ = 0; i_14_ < 256; i_14_++) {
				    Class55_Sub1 class55_sub1
					= Class44.aClass55_Sub1Array820[i_14_];
				    if (class55_sub1 != null) {
					Class11_Sub10_Sub2
					    .aBuffer_2005.position
					    = 5 + 4 * i_14_;
					int i_15_ = Class11_Sub10_Sub2
							.aBuffer_2005
							.method188((byte) 105);
					class55_sub1.method911(true, i_15_);
				    }
				}
			    } else {
				Class11_Sub10_Sub8.aCRC32_2171.reset();
				Class11_Sub10_Sub8.aCRC32_2171.update
				    (Class9.aBuffer_193.payload,
				     0, i_11_);
				int i_16_ = (int) Class11_Sub10_Sub8
						      .aCRC32_2171.getValue();
				if ((i_16_ ^ 0xffffffff)
				    != ((Class50.aClass11_Sub10_Sub16_1001
					 .anInt2432)
					^ 0xffffffff)) {
				    try {
					Class11.aClass14_222.method520(-9098);
				    } catch (Exception exception) {
					/* empty */
				    }
				    Class34.aByte635
					= (byte) (int) (Math.random() * 255.0
							+ 1.0);
				    Class11.aClass14_222 = null;
				    Class31.anInt1413++;
				    return false;
				}
				Class31.anInt1413 = 0;
				Class57.anInt1158 = 0;
				Class50.aClass11_Sub10_Sub16_1001
				    .aClass55_Sub1_2431.method910
				    (Class9.aBuffer_193.payload,
				     Class52.aBoolean1023,
				     ((Class50.aClass11_Sub10_Sub16_1001
				       .aLong231) & 0xff0000L
				      ^ 0xffffffffffffffffL) == -16711681L,
				     (int) ((Class50.aClass11_Sub10_Sub16_1001
					     .aLong231)
					    & 0xffffL),
				     117);
			    }
			    Class50.aClass11_Sub10_Sub16_1001.method107(0);
			    Class9.aBuffer_193 = null;
			    Class63.anInt1323 = 0;
			    Class50.aClass11_Sub10_Sub16_1001 = null;
			    if (Class52.aBoolean1023)
				Class11_Sub10_Sub4_Sub2_Sub2.anInt2822--;
			    else
				Class52.anInt1032--;
			}
		    }
		}
		return true;
	    } catch (IOException ioexception) {
		try {
		    Class11.aClass14_222.method520(-9098);
		} catch (Exception exception) {
		    /* empty */
		}
		Class57.anInt1158++;
		Class11.aClass14_222 = null;
		return false;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gd.E(" + arg0 + ')');
	}
    }
    
    public static void method215(int arg0) {
	try {
	    anInt1603++;
	    if ((Class29.anInt541 ^ 0xffffffff) < -1)
		Class25.method597(-77);
	    else {
		Class34.method674(40, false);
		if (arg0 == -19030)
		    Class13.aClass14_265 = Class11_Sub12.aClass14_1699;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "gd.C(" + arg0 + ')');
	}
    }
    
    static {
	anInt1606 = 2;
	anInt1610 = 99;
	anInt1607 = 1;
	anInt1600 = 0;
	anInt1612 = -1;
    }
}
