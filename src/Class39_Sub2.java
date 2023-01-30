/* Class39_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39_Sub2 extends Class39
{
    public long aLong1840;
    
    public void method725(boolean arg0) {
	method730(7971);
	if (arg0)
	    method724((byte) -99, 127, 45);
    }
    
    public int method724(byte arg0, int arg1, int arg2) {
	int i;
	try {
	    long l = (long) arg2 * 1000000L;
	    long l_0_ = aLong1840 - System.nanoTime();
	    int i_1_ = 0;
	    if (l > l_0_)
		l_0_ = l;
	    Class53.method864(true, l_0_ / 1000000L);
	    long l_2_;
	    for (l_2_ = System.nanoTime();
		 ((i_1_ ^ 0xffffffff) > -11
		  && (-2 < (i_1_ ^ 0xffffffff) || aLong1840 < l_2_));
		 i_1_++)
		aLong1840 += (long) arg1 * 1000000L;
	    if (aLong1840 < l_2_)
		aLong1840 = l_2_;
	    if (arg0 <= 59)
		aLong1840 = 107L;
	    i = i_1_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public Class39_Sub2() {
	method730(7971);
    }
    
    public void method730(int arg0) {
	if (arg0 != 7971)
	    aLong1840 = 125L;
	aLong1840 = System.nanoTime();
    }
}
