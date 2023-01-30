/* Class11_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub2_Sub2 extends Class11_Sub2
{
    public Class36[] aClass36Array1898;
    public int anInt1899 = 16;
    public Class36 aClass36_1900;
    public int anInt1901;
    public int anInt1902;
    public int anInt1903;
    
    public synchronized void method127(Class11_Sub2 arg0) {
	Class36 class36 = aClass36Array1898[method131(arg0)];
	class36.method699((byte) -117, arg0);
    }
    
    public int method128(int[] arg0, int arg1, int arg2) {
	anInt1901 -= arg2;
	if (anInt1901 <= 0) {
	    anInt1901 += Class11_Sub10_Sub9.anInt2203 >> 4;
	    for (int i = 0; i < 8; i++) {
		Class36 class36 = aClass36Array1898[i];
		for (Class11_Sub2 class11_sub2
			 = (Class11_Sub2) class36.method694((byte) -122);
		     class11_sub2 != null;
		     class11_sub2 = (Class11_Sub2) class36.method701(0)) {
		    int i_0_ = method131(class11_sub2);
		    if (i_0_ != i)
			aClass36Array1898[i_0_].method699((byte) -104,
							  class11_sub2);
		}
	    }
	}
	for (int i = 0; i < 8; i++) {
	    Class36 class36 = aClass36Array1898[i];
	    for (Class11_Sub2 class11_sub2
		     = (Class11_Sub2) class36.method694((byte) -115);
		 class11_sub2 != null;
		 class11_sub2 = (Class11_Sub2) class36.method701(0)) {
		class11_sub2.aBoolean1472 = false;
		if (class11_sub2.aClass11_Sub3_1471 != null)
		    class11_sub2.aClass11_Sub3_1471.anInt1473 = 0;
	    }
	}
	int i = 0;
	int i_1_ = 255;
	int i_2_ = 7;
	while (i_1_ != 0) {
	    int i_3_;
	    int i_4_;
	    if (i_2_ < 0) {
		i_3_ = i_2_ & 0x3;
		i_4_ = -(i_2_ >> 2);
	    } else {
		i_3_ = i_2_;
		i_4_ = 0;
	    }
	    for (int i_5_ = i_1_ >>> i_3_ & 0x11111111; i_5_ != 0;
		 i_5_ >>>= 4) {
		if ((i_5_ & 0x1) != 0) {
		    i_1_ &= 1 << i_3_ ^ 0xffffffff;
		    Class36 class36 = aClass36Array1898[i_3_];
		    for (Class11_Sub2 class11_sub2
			     = (Class11_Sub2) class36.method694((byte) -112);
			 class11_sub2 != null;
			 class11_sub2 = (Class11_Sub2) class36.method701(0)) {
			if (!class11_sub2.aBoolean1472) {
			    Class11_Sub3 class11_sub3
				= class11_sub2.aClass11_Sub3_1471;
			    if (class11_sub3 != null
				&& class11_sub3.anInt1473 > i_4_)
				i_1_ |= 1 << i_3_;
			    else {
				if (i < anInt1899) {
				    int i_6_
					= class11_sub2.method112(arg0, arg1,
								 arg2);
				    i += i_6_;
				    if (class11_sub3 != null)
					class11_sub3.anInt1473 += i_6_;
				} else
				    class11_sub2.method113(arg2);
				class11_sub2.aBoolean1472 = true;
			    }
			}
		    }
		}
		i_3_ += 4;
		i_4_++;
	    }
	    i_2_--;
	}
	return i;
    }
    
    public void method129() {
	if (anInt1903 > 0) {
	    for (Class11_Sub1 class11_sub1
		     = (Class11_Sub1) aClass36_1900.method694((byte) -120);
		 class11_sub1 != null;
		 class11_sub1 = (Class11_Sub1) aClass36_1900.method701(0))
		class11_sub1.anInt1470 -= anInt1903;
	    anInt1902 -= anInt1903;
	    anInt1903 = 0;
	}
    }
    
    public synchronized void method113(int arg0) {
	do {
	    if (anInt1902 < 0) {
		method132(arg0);
		break;
	    }
	    if (anInt1903 + arg0 < anInt1902) {
		anInt1903 += arg0;
		method132(arg0);
		break;
	    }
	    int i = anInt1902 - anInt1903;
	    method132(i);
	    arg0 -= i;
	    anInt1903 += i;
	    method129();
	    Class11_Sub1 class11_sub1
		= (Class11_Sub1) aClass36_1900.method694((byte) -117);
	    synchronized (class11_sub1) {
		int i_7_ = class11_sub1.method111(this);
		if (i_7_ < 0) {
		    class11_sub1.anInt1470 = 0;
		    method133(class11_sub1);
		} else {
		    class11_sub1.anInt1470 = i_7_;
		    method130(class11_sub1.aClass11_233, class11_sub1);
		}
	    }
	} while (arg0 != 0);
    }
    
    public void method130(Class11 arg0, Class11_Sub1 arg1) {
	for (/**/;
	     (arg0 != aClass36_1900.aClass11_661
	      && ((Class11_Sub1) arg0).anInt1470 <= arg1.anInt1470);
	     arg0 = arg0.aClass11_233) {
	    /* empty */
	}
	aClass36_1900.method693(-36, arg0, arg1);
	anInt1902 = (((Class11_Sub1) aClass36_1900.aClass11_661.aClass11_233)
		     .anInt1470);
    }
    
    public static int method131(Class11_Sub2 arg0) {
	return arg0.method114() >> 5;
    }
    
    public void method132(int arg0) {
	anInt1901 -= arg0;
	if (anInt1901 < 0)
	    anInt1901 = 0;
	for (int i = 0; i < 8; i++) {
	    Class36 class36 = aClass36Array1898[i];
	    for (Class11_Sub2 class11_sub2
		     = (Class11_Sub2) class36.method694((byte) -121);
		 class11_sub2 != null;
		 class11_sub2 = (Class11_Sub2) class36.method701(0))
		class11_sub2.method113(arg0);
	}
    }
    
    public synchronized int method112(int[] arg0, int arg1, int arg2) {
	for (;;) {
	    if (anInt1902 < 0)
		return method128(arg0, arg1, arg2);
	    if (anInt1903 + arg2 < anInt1902) {
		anInt1903 += arg2;
		return method128(arg0, arg1, arg2);
	    }
	    int i = anInt1902 - anInt1903;
	    int i_8_ = method128(arg0, arg1, i);
	    arg1 += i;
	    arg2 -= i;
	    anInt1903 += i;
	    method129();
	    Class11_Sub1 class11_sub1
		= (Class11_Sub1) aClass36_1900.method694((byte) -114);
	    synchronized (class11_sub1) {
		int i_9_ = class11_sub1.method111(this);
		if (i_9_ < 0) {
		    class11_sub1.anInt1470 = 0;
		    method133(class11_sub1);
		} else {
		    class11_sub1.anInt1470 = i_9_;
		    method130(class11_sub1.aClass11_233, class11_sub1);
		}
	    }
	    if (arg2 == 0)
		return i_8_;
	}
    }
    
    public void method133(Class11_Sub1 arg0) {
	arg0.method107(0);
	arg0.method110();
	Class11 class11 = aClass36_1900.aClass11_661.aClass11_233;
	if (class11 == aClass36_1900.aClass11_661)
	    anInt1902 = -1;
	else
	    anInt1902 = ((Class11_Sub1) class11).anInt1470;
    }
    
    public Class11_Sub2_Sub2() {
	aClass36Array1898 = new Class36[8];
	aClass36_1900 = new Class36();
	anInt1902 = -1;
	anInt1901 = 0;
	anInt1903 = 0;
	for (int i = 0; i < 8; i++)
	    aClass36Array1898[i] = new Class36();
    }
}
