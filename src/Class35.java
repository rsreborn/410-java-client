/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35
{
    public Class19[] aClass19Array650;
    public int anInt651;
    public int anInt652;
    
    public static Class35 method684(Class55 arg0, int arg1, int arg2) {
	byte[] is = arg0.method887((byte) -121, arg2, arg1);
	if (is == null)
	    return null;
	return new Class35(new Buffer(is));
    }
    
    public int method685() {
	int i = 9999999;
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    if (aClass19Array650[i_0_] != null
		&& aClass19Array650[i_0_].anInt361 / 20 < i)
		i = aClass19Array650[i_0_].anInt361 / 20;
	}
	if (anInt652 < anInt651 && anInt652 / 20 < i)
	    i = anInt652 / 20;
	if (i == 9999999 || i == 0)
	    return 0;
	for (int i_1_ = 0; i_1_ < 10; i_1_++) {
	    if (aClass19Array650[i_1_] != null)
		aClass19Array650[i_1_].anInt361 -= i * 20;
	}
	if (anInt652 < anInt651) {
	    anInt652 -= i * 20;
	    anInt651 -= i * 20;
	}
	return i;
    }
    
    public Class11_Sub3_Sub1 method686() {
	byte[] is = method687();
	return new Class11_Sub3_Sub1(22050, is, 22050 * anInt652 / 1000,
				     22050 * anInt651 / 1000);
    }
    
    public byte[] method687() {
	int i = 0;
	for (int i_2_ = 0; i_2_ < 10; i_2_++) {
	    if (aClass19Array650[i_2_] != null
		&& (aClass19Array650[i_2_].anInt376
		    + aClass19Array650[i_2_].anInt361) > i)
		i = (aClass19Array650[i_2_].anInt376
		     + aClass19Array650[i_2_].anInt361);
	}
	if (i == 0)
	    return new byte[0];
	int i_3_ = 22050 * i / 1000;
	byte[] is = new byte[i_3_];
	for (int i_4_ = 0; i_4_ < 10; i_4_++) {
	    if (aClass19Array650[i_4_] != null) {
		int i_5_ = aClass19Array650[i_4_].anInt376 * 22050 / 1000;
		int i_6_ = aClass19Array650[i_4_].anInt361 * 22050 / 1000;
		int[] is_7_
		    = aClass19Array650[i_4_]
			  .method569(i_5_, aClass19Array650[i_4_].anInt376);
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
		    int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
		    if ((i_9_ + 128 & ~0xff) != 0)
			i_9_ = i_9_ >> 31 ^ 0x7f;
		    is[i_8_ + i_6_] = (byte) i_9_;
		}
	    }
	}
	return is;
    }
    
    public Class35(Buffer arg0) {
	aClass19Array650 = new Class19[10];
	for (int i = 0; i < 10; i++) {
	    int i_10_ = arg0.method168(255);
	    if (i_10_ != 0) {
		arg0.position--;
		aClass19Array650[i] = new Class19();
		aClass19Array650[i].method568(arg0);
	    }
	}
	anInt652 = arg0.method164();
	anInt651 = arg0.method164();
    }
    
    public Class35() {
	aClass19Array650 = new Class19[10];
    }
}
