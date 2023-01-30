/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56
{
    public static byte[] aByteArray1144
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public Buffer aBuffer_1145 = new Buffer(null);
    public int[] anIntArray1146;
    public int anInt1147;
    public int anInt1148;
    public int[] anIntArray1149;
    public int[] anIntArray1150;
    public int[] anIntArray1151;
    public long aLong1152;
    
    public void method916(long arg0) {
	aLong1152 = arg0;
	int i = anIntArray1146.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    anIntArray1150[i_0_] = 0;
	    anIntArray1151[i_0_] = 0;
	    aBuffer_1145.position = anIntArray1149[i_0_];
	    method927(i_0_);
	    anIntArray1146[i_0_] = aBuffer_1145.position;
	}
    }
    
    public int method917() {
	int i = anIntArray1146.length;
	int i_1_ = -1;
	int i_2_ = 2147483647;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    if (anIntArray1146[i_3_] >= 0 && anIntArray1150[i_3_] < i_2_) {
		i_1_ = i_3_;
		i_2_ = anIntArray1150[i_3_];
	    }
	}
	return i_1_;
    }
    
    public int method918(int arg0) {
	int i = method928(arg0);
	return i;
    }
    
    public void method919() {
	aBuffer_1145.position = -1;
    }
    
    public boolean method920() {
	int i = anIntArray1146.length;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    if (anIntArray1146[i_4_] >= 0)
		return false;
	}
	return true;
    }
    
    public boolean method921() {
	if (aBuffer_1145.position >= 0)
	    return false;
	return true;
    }
    
    public long method922(int arg0) {
	return aLong1152 + (long) arg0 * (long) anInt1148;
    }
    
    public void method923(int arg0) {
	anIntArray1146[arg0] = aBuffer_1145.position;
    }
    
    public int method924() {
	return anIntArray1146.length;
    }
    
    public int method925(int arg0, int arg1) {
	if (arg1 == 255) {
	    int i = aBuffer_1145.method168(255);
	    int i_5_ = aBuffer_1145.method184(78);
	    if (i == 47) {
		aBuffer_1145.position += i_5_;
		return 1;
	    }
	    if (i == 81) {
		int i_6_ = aBuffer_1145.method178(2);
		i_5_ -= 3;
		int i_7_ = anIntArray1150[arg0];
		aLong1152 += (long) i_7_ * (long) (anInt1148 - i_6_);
		anInt1148 = i_6_;
		aBuffer_1145.position += i_5_;
		return 2;
	    }
	    aBuffer_1145.position += i_5_;
	    return 3;
	}
	byte i = aByteArray1144[arg1 - 128];
	int i_8_ = arg1;
	if (i >= 1)
	    i_8_ |= aBuffer_1145.method168(255) << 8;
	if (i >= 2)
	    i_8_ |= aBuffer_1145.method168(255) << 16;
	return i_8_;
    }
    
    public void method926() {
	aBuffer_1145.payload = null;
	anIntArray1149 = null;
	anIntArray1146 = null;
	anIntArray1150 = null;
	anIntArray1151 = null;
    }
    
    public void method927(int arg0) {
	int i = aBuffer_1145.method184(86);
	anIntArray1150[arg0] += i;
    }
    
    public int method928(int arg0) {
	int i
	    = aBuffer_1145.payload[aBuffer_1145.position];
	if (i < 0) {
	    i &= 0xff;
	    anIntArray1151[arg0] = i;
	    aBuffer_1145.position++;
	} else
	    i = anIntArray1151[arg0];
	if (i == 240 || i == 247) {
	    int i_9_ = aBuffer_1145.method184(61);
	    if (i == 247 && i_9_ > 0) {
		int i_10_ = ((aBuffer_1145.payload
			      [aBuffer_1145.position])
			     & 0xff);
		if (i_10_ >= 241 && i_10_ <= 243 || i_10_ == 246
		    || i_10_ == 248 || i_10_ >= 250 && i_10_ <= 252
		    || i_10_ == 254) {
		    aBuffer_1145.position++;
		    anIntArray1151[arg0] = i_10_;
		    return method925(arg0, i_10_);
		}
	    }
	    aBuffer_1145.position += i_9_;
	    return 0;
	}
	return method925(arg0, i);
    }
    
    public void method929(byte[] arg0) {
	aBuffer_1145.payload = arg0;
	aBuffer_1145.position = 10;
	int i = aBuffer_1145.method164(127);
	anInt1147 = aBuffer_1145.method164(127);
	anInt1148 = 500000;
	anIntArray1149 = new int[i];
	int i_11_ = 0;
	while (i_11_ < i) {
	    int i_12_ = aBuffer_1145.method188((byte) 105);
	    int i_13_ = aBuffer_1145.method188((byte) 105);
	    if (i_12_ == 1297379947) {
		anIntArray1149[i_11_] = aBuffer_1145.position;
		i_11_++;
	    }
	    aBuffer_1145.position += i_13_;
	}
	anIntArray1146 = (int[]) anIntArray1149.clone();
	anIntArray1150 = new int[i];
	anIntArray1151 = new int[i];
    }
    
    public static void method930() {
	aByteArray1144 = null;
    }
    
    public boolean method931() {
	if (aBuffer_1145.payload == null)
	    return false;
	return true;
    }
    
    public void method932(int arg0) {
	aBuffer_1145.position = anIntArray1146[arg0];
    }
}
