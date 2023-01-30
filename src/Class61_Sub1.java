/* Class61_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class61_Sub1 extends Class61 implements Runnable
{
    public int[] anIntArray1872 = new int[512];
    public int anInt1873;
    public int anInt1874 = 0;
    public long aLong1875;
    public boolean aBoolean1876 = false;
    public int anInt1877 = 0;
    public int anInt1878;
    public int anInt1879;
    public int anInt1880 = 256;
    public int anInt1881;
    public int anInt1882;
    public long aLong1883;
    public static int[] anIntArray1884 = new int[256];
    public long aLong1885;
    
    public Class61_Sub1(int arg0) throws Exception {
	super(arg0);
	anInt1878 = 0;
	anInt1881 = 0;
	aLong1883 = 0L;
    }
    
    public abstract void method969() throws Exception;
    
    public void method970(long arg0) throws Exception {
	method975(anInt1879);
	for (;;) {
	    int i = method976();
	    if (i < anInt1880)
		break;
	    method969();
	}
	anInt1882 = 0;
	anInt1873 = 0;
	aLong1885 = arg0;
	aLong1875 = arg0;
    }
    
    public void method971(long arg0) {
	if (aLong1883 != 0L) {
	    for (/**/; aLong1885 < arg0;
		 aLong1885 += (long) (256000 / Class11_Sub10_Sub9.anInt2203))
		Class61.method961(256, (byte) -64);
	    if (arg0 < aLong1883)
		return;
	    try {
		method970(arg0);
	    } catch (Exception exception) {
		method973();
		aLong1883 += 5000L;
		return;
	    }
	    aLong1883 = 0L;
	}
	while (aLong1885 < arg0) {
	    aLong1885 += (long) (250880 / Class11_Sub10_Sub9.anInt2203);
	    int i;
	    try {
		i = method976();
	    } catch (Exception exception) {
		method973();
		aLong1883 = arg0;
		return;
	    }
	    method977(i);
	    int i_0_ = anInt1881 * 3 / 512 - anInt1878 * 2;
	    if (i_0_ < 0)
		i_0_ = 0;
	    else if (i_0_ > anInt1874)
		i_0_ = anInt1874;
	    anInt1880 = anInt1879 - 256 - i_0_;
	    if (anInt1880 < 256)
		anInt1880 = 256;
	    if (anInt1879 < 16384) {
		if (i >= anInt1879) {
		    anInt1882 += 5;
		    if (anInt1882 >= 100) {
			method973();
			anInt1879 += 2048;
			aLong1883 = arg0;
			return;
		    }
		} else if (i != anInt1873 && anInt1882 > 0)
		    anInt1882--;
	    }
	    anInt1873 = i;
	    if (i < anInt1880)
		break;
	    Class61.method966(anIntArray1884, 256);
	    try {
		method969();
	    } catch (Exception exception) {
		method973();
		aLong1883 = arg0;
		return;
	    }
	    aLong1875 = arg0;
	    anInt1873 -= 256;
	}
	if (arg0 >= aLong1875 + 5000L) {
	    method973();
	    aLong1883 = arg0;
	    for (int i = 0; i < 512; i++)
		anIntArray1872[i] = 0;
	    anInt1878 = anInt1874 = anInt1881 = 0;
	}
    }
    
    public void method959() {
	synchronized (this) {
	    aBoolean1876 = true;
	}
	for (;;) {
	    synchronized (this) {
		if (!aBoolean1876)
		    break;
	    }
	    Class53.method864(true, 50L);
	}
    }
    
    public static void method972() {
	anIntArray1884 = null;
    }
    
    public synchronized void method957(long arg0) {
	method971(arg0);
	if (aLong1885 < arg0)
	    aLong1885 = arg0;
    }
    
    public abstract void method973();
    
    public void method974(Class45 arg0, int arg1) throws Exception {
	anInt1879 = arg1;
	method970(System.currentTimeMillis());
	arg0.method778(10, this, (byte) 31);
    }
    
    public abstract void method975(int i) throws Exception;
    
    public abstract int method976() throws Exception;
    
    public void run() {
	try {
	    for (;;) {
		synchronized (this) {
		    if (aBoolean1876) {
			if (aLong1883 == 0L)
			    method973();
			aBoolean1876 = false;
			break;
		    }
		    method957(System.currentTimeMillis());
		}
		Class53.method864(true, 5L);
	    }
	} catch (Exception exception) {
	    Class14.method517((byte) 107, null, exception);
	}
    }
    
    public void method977(int arg0) {
	int i = arg0 - anInt1880;
	int i_1_ = anIntArray1872[anInt1877];
	anIntArray1872[anInt1877] = i;
	anInt1881 += i - i_1_;
	int i_2_ = anInt1877 + 1 & 0x1ff;
	if (i > anInt1874)
	    anInt1874 = i;
	if (i < anInt1878)
	    anInt1878 = i;
	if (i_1_ == anInt1874) {
	    int i_3_ = i;
	    for (int i_4_ = i_2_; i_4_ != anInt1877 && i_3_ < anInt1874;
		 i_4_ = i_4_ + 1 & 0x1ff) {
		int i_5_ = anIntArray1872[i_4_];
		if (i_5_ > i_3_)
		    i_3_ = i_5_;
	    }
	    anInt1874 = i_3_;
	}
	if (i_1_ == anInt1878) {
	    int i_6_ = i;
	    for (int i_7_ = i_2_; i_7_ != anInt1877 && i_6_ > anInt1878;
		 i_7_ = i_7_ + 1 & 0x1ff) {
		int i_8_ = anIntArray1872[i_7_];
		if (i_8_ < i_6_)
		    i_6_ = i_8_;
	    }
	    anInt1878 = i_6_;
	}
	anInt1877 = i_2_;
    }
}
