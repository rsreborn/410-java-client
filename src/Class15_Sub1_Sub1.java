/* Class15_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15_Sub1_Sub1 extends Class15_Sub1 implements Runnable
{
    public static int anInt2440;
    public static boolean aBoolean2441;
    public static int[] anIntArray2442 = new int[256];
    public static Runnable_Impl1 aRunnable_Impl1_2443;
    public static int anInt2444;
    public static boolean aBoolean2445;
    public Class56 aClass56_2446 = new Class56();
    
    public synchronized void method537(int arg0) {
	try {
	    if (aClass56_2446.method931()) {
		long l = ((long) (anInt2440 - -200
				  - aRunnable_Impl1_2443.method15(17296))
			  * (long) (aClass56_2446.anInt1147 * 1000));
		for (;;) {
		    int i = aClass56_2446.method917();
		    int i_0_ = aClass56_2446.anIntArray1150[i];
		    long l_1_ = aClass56_2446.method922(i_0_);
		    if (l < l_1_)
			break;
		    while ((i_0_ ^ 0xffffffff)
			   == (aClass56_2446.anIntArray1150[i] ^ 0xffffffff)) {
			aClass56_2446.method932(i);
			method552(i, 75, l_1_);
			if (aClass56_2446.method921()) {
			    aClass56_2446.method923(i);
			    if (aClass56_2446.method920()) {
				if (aBoolean2445)
				    aClass56_2446.method916(l_1_);
				else {
				    this.method542
					((long) (int) (l_1_
						       / (long) ((aClass56_2446
								  .anInt1147)
								 * 1000)),
					 (byte) 69);
				    aClass56_2446.method926();
				    method550(0);
				    return;
				}
			    }
			    break;
			}
			aClass56_2446.method927(i);
			aClass56_2446.method923(i);
		    }
		}
		if (arg0 != -1)
		    method534(109);
		method550(0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public static void method550(int arg0) {
	if ((anInt2444 ^ 0xffffffff) < -1) {
	    aRunnable_Impl1_2443.method11(anIntArray2442, anInt2444);
	    anInt2444 = 0;
	}
	if (arg0 != 0)
	    aBoolean2445 = false;
    }
    
    public static void method551(int arg0, int arg1, int arg2, int arg3,
				 byte arg4) {
	try {
	    if ((anInt2444 ^ 0xffffffff)
		<= (anIntArray2442.length ^ 0xffffffff)) {
		aRunnable_Impl1_2443.method11(anIntArray2442, anInt2444);
		anInt2444 = 0;
	    }
	    if (arg4 != 122)
		method550(-19);
	    anIntArray2442[anInt2444++] = arg1 - anInt2440;
	    anInt2440 = arg1;
	    anIntArray2442[anInt2444++]
		= (Class11_Sub10_Sub6.method345
		   (Class11_Sub10_Sub6.method345(arg0 << 889255944, arg3),
		    arg2 << 1906813712));
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public synchronized void method535(boolean arg0, byte arg1, byte[] arg2,
				       int arg3) {
	try {
	    aClass56_2446.method929(arg2);
	    anInt2440 = 0;
	    aBoolean2445 = arg0;
	    aRunnable_Impl1_2443.method10((byte) -16);
	    boolean bool = true;
	    this.method541(-65, arg3, (long) anInt2440, 0);
	    int i = aClass56_2446.method924();
	    if (arg1 != 2)
		method547(-65, 110, 107, -74L);
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		aClass56_2446.method932(i_2_);
		while (!aClass56_2446.method921()) {
		    aClass56_2446.method927(i_2_);
		    if (aClass56_2446.anIntArray1150[i_2_] != 0) {
			bool = false;
			break;
		    }
		    method552(i_2_, 37, 0L);
		}
		aClass56_2446.method923(i_2_);
	    }
	    if (bool) {
		if (aBoolean2445)
		    throw new RuntimeException();
		this.method542((long) anInt2440, (byte) 69);
		aClass56_2446.method926();
	    }
	    method550(arg1 ^ 0x2);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void run() {
	try {
	    try {
		for (;;) {
		    synchronized (this) {
			if (aBoolean2441) {
			    aBoolean2441 = false;
			    break;
			}
			method537(-1);
		    }
		    Class53.method864(true, 100L);
		}
	    } catch (Exception exception) {
		Class14.method517((byte) 32, null, exception);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method552(int arg0, int arg1, long arg2) {
	try {
	    int i = aClass56_2446.method918(arg0);
	    if (arg1 < 7)
		method550(-126);
	    if (i != 1) {
		if ((i & 0x80) != 0) {
		    int i_3_
			= (int) (arg2
				 / (long) (1000 * aClass56_2446.anInt1147));
		    int i_4_ = 0xff & i;
		    int i_5_ = 0xff & i >> 2070296040;
		    int i_6_ = (i & 0xff7440) >> -2135029040;
		    if (!this.method538(i_4_, i_5_, i_6_, (long) i_3_))
			method551(i_5_, i_3_, i_6_, i_4_, (byte) 122);
		}
	    } else
		aClass56_2446.method919();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method547(int arg0, int arg1, int arg2, long arg3) {
	try {
	    method551(arg1, (int) arg3, arg2, arg0, (byte) 122);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public synchronized void method529(byte arg0, int arg1, int arg2) {
	this.method541(-65, arg2, (long) anInt2440, arg1);
	if (arg0 != -97)
	    aRunnable_Impl1_2443 = null;
    }
    
    public void method534(int arg0) {
	try {
	    synchronized (this) {
		aBoolean2441 = true;
	    }
	    for (;;) {
		synchronized (this) {
		    if (!aBoolean2441)
			break;
		}
		Class53.method864(true, 20L);
	    }
	    if (arg0 != 128)
		method547(40, -115, -108, 110L);
	    aRunnable_Impl1_2443.method12(arg0 ^ 0xba);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public synchronized void method526(byte arg0) {
	try {
	    int i = -92 % ((arg0 - -2) / 57);
	    aRunnable_Impl1_2443.method10((byte) -16);
	    this.method542((long) anInt2440, (byte) 69);
	    aRunnable_Impl1_2443.method11(anIntArray2442, anInt2444);
	    anInt2444 = 0;
	    aClass56_2446.method926();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class15_Sub1_Sub1(Class45 arg0, Runnable_Impl1 arg1) {
	try {
	    aRunnable_Impl1_2443 = arg1;
	    aRunnable_Impl1_2443.method13(-9304);
	    aRunnable_Impl1_2443.method10((byte) -16);
	    this.method542((long) anInt2440, (byte) 69);
	    aRunnable_Impl1_2443.method11(anIntArray2442, anInt2444);
	    anInt2444 = 0;
	    arg0.method778(10, this, (byte) 31);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public synchronized void method536(int arg0) {
	try {
	    if (arg0 != 1)
		method526((byte) -10);
	    this.method544((byte) -97, (long) anInt2440);
	    aRunnable_Impl1_2443.method11(anIntArray2442, anInt2444);
	    anInt2444 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}
