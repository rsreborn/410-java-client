/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class45 implements Runnable
{
    public static int anInt822 = 3;
    public Class41 aClass41_823;
    public static String aString824;
    public Class5[] aClass5Array825;
    public String aString826;
    public String aString827;
    public boolean aBoolean828;
    public Runnable_Impl1 aRunnable_Impl1_829;
    public Class5[] aClass5Array830;
    public InetAddress anInetAddress831;
    public static String aString832;
    public Interface1 anInterface1_833;
    public String aString834 = null;
    public int anInt835 = 0;
    public Applet anApplet836;
    public Thread aThread837;
    public Class5 aClass5_838;
    public Class5 aClass5_839;
    public Class41 aClass41_840;
    public Class5 aClass5_841;
    public String aString842;
    public static Method aMethod843;
    
    public Class41 method768(int arg0) {
	try {
	    if (arg0 != 0)
		return null;
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Interface1 method769(byte arg0) {
	try {
	    int i = 81 / ((77 - arg0) / 41);
	    return anInterface1_833;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method770(boolean arg0, int arg1) {
	try {
	    if (arg0 != true)
		method776((byte) -97);
	    return method771(arg1, (byte) -34, 3, null, 0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method771(int arg0, byte arg1, int arg2, Object arg3,
			     int arg4) {
	try {
	    Class41 class41 = new Class41();
	    class41.anInt747 = arg0;
	    class41.anInt748 = arg2;
	    class41.anObject750 = arg3;
	    synchronized (this) {
		if (aClass41_840 != null) {
		    aClass41_840.aClass41_752 = class41;
		    aClass41_840 = class41;
		} else
		    aClass41_840 = aClass41_823 = class41;
		this.notify();
		if (arg1 != -34)
		    aString842 = null;
	    }
	    return class41;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method772(Class arg0, String arg1, Class[] arg2, int arg3) {
	try {
	    if (arg3 != 9)
		method773((byte) -63, 86);
	    return method771(0, (byte) -34, 9,
			     new Object[] { arg0, arg1, arg2 }, 0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method773(byte arg0, int arg1) {
	try {
	    if (arg0 >= -34)
		method779(-124);
	    return method771(arg1, (byte) -34, 1, null, 0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method774(int arg0) {
	synchronized (this) {
	    aBoolean828 = true;
	    this.notifyAll();
	}
	try {
	    aThread837.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	if (aRunnable_Impl1_829 != null)
	    aRunnable_Impl1_829.method14(false);
	if (arg0 != 0)
	    aThread837 = null;
	if (aClass5_838 != null) {
	    try {
		aClass5_838.method66(-1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass5_841 != null) {
	    try {
		aClass5_841.method66(-1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass5Array830 != null) {
	    for (int i = 0;
		 (aClass5Array830.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		if (aClass5Array830[i] != null) {
		    try {
			aClass5Array830[i].method66(-1);
		    } catch (IOException ioexception) {
			/* empty */
		    }
		}
	    }
	}
	if (aClass5_839 != null) {
	    try {
		aClass5_839.method66(-1);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass5Array825 != null) {
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aClass5Array825.length ^ 0xffffffff);
		 i++) {
		if (aClass5Array825[i] != null) {
		    try {
			aClass5Array825[i].method66(arg0 + -1);
		    } catch (IOException ioexception) {
			/* empty */
		    }
		}
	    }
	}
    }
    
    public Class41 method775(byte arg0, String arg1, Class arg2) {
	try {
	    int i = 93 % ((-30 - arg0) / 50);
	    return method771(0, (byte) -34, 10, new Object[] { arg2, arg1 },
			     0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Runnable_Impl1 method776(byte arg0) {
	try {
	    if (arg0 >= -108)
		return null;
	    return aRunnable_Impl1_829;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method777(int arg0, String arg1, byte arg2) {
	try {
	    if ((arg0 ^ 0xffffffff) > -33 || (arg0 ^ 0xffffffff) < -35)
		arg0 = 32;
	    String[] strings
		= { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
		    "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/",
		    "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
	    String string = ".file_store_" + arg0;
	    for (int i = 0; (strings.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		try {
		    String string_0_ = strings[i];
		    if (string_0_.length() > 0) {
			File file = new File(string_0_);
			if (!file.exists())
			    continue;
		    }
		    File file = new File(string_0_ + string);
		    if (file.exists() || file.mkdir()) {
			if (arg1.length() > 0) {
			    file = new File(file, arg1);
			    if (!file.exists() && !file.mkdir())
				continue;
			}
			aString842 = aString834 = file.getParent() + "/";
			aString826 = aString827 = file.getPath() + "/";
			return;
		    }
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	    if (arg2 == -96)
		throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void run() {
	try {
	    for (;;) {
		Class41 class41;
		synchronized (this) {
		    for (;;) {
			if (aBoolean828)
			    return;
			if (aClass41_823 != null) {
			    class41 = aClass41_823;
			    aClass41_823 = aClass41_823.aClass41_752;
			    if (aClass41_823 == null)
				aClass41_840 = null;
			    break;
			}
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
		    }
		}
		try {
		    int i = class41.anInt748;
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 2) {
			    Thread thread
				= new Thread((Runnable) class41.anObject750);
			    thread.setDaemon(true);
			    thread.start();
			    thread.setPriority(class41.anInt747);
			    class41.anObject751 = thread;
			} else if ((i ^ 0xffffffff) == -5)
			    class41.anObject751
				= new DataInputStream(((URL)
						       class41.anObject750)
							  .openStream());
			else if (i != 9) {
			    if ((i ^ 0xffffffff) != -11)
				throw new Exception();
			    Object[] objects = (Object[]) class41.anObject750;
			    class41.anObject751
				= ((Class) objects[0])
				      .getDeclaredField((String) objects[1]);
			} else {
			    Object[] objects = (Object[]) class41.anObject750;
			    class41.anObject751
				= (((Class) objects[0]).getDeclaredMethod
				   ((String) objects[1],
				    (Class[]) objects[2]));
			}
		    } else
			class41.anObject751
			    = new Socket(anInetAddress831, class41.anInt747);
		    class41.anInt749 = 1;
		} catch (Exception exception) {
		    class41.anInt749 = 2;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method778(int arg0, Runnable arg1, byte arg2) {
	try {
	    if (arg2 != 31)
		method769((byte) 122);
	    return method771(arg0, (byte) -34, 2, arg1, 0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public void method779(int arg0) {
	try {
	    try {
		File file = new File(aString834 + "uid.dat");
		if (!file.exists()
		    || (file.length() ^ 0xffffffffffffffffL) > -5L) {
		    DataOutputStream dataoutputstream
			= (new DataOutputStream
			   (new FileOutputStream(aString834 + "uid.dat")));
		    dataoutputstream.writeInt((int) (Math.random()
						     * 9.9999999E7));
		    dataoutputstream.close();
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    try {
		DataInputStream datainputstream
		    = new DataInputStream(new FileInputStream(aString834
							      + "uid.dat"));
		anInt835 = arg0 + datainputstream.readInt();
		datainputstream.close();
	    } catch (Exception exception) {
		/* empty */
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class41 method780(byte arg0, URL arg1) {
	try {
	    int i = 66 % ((56 - arg0) / 56);
	    return method771(0, (byte) -34, 4, arg1, 0);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class45(boolean arg0, Applet arg1, InetAddress arg2, int arg3,
		   String arg4, int arg5) throws IOException {
	aBoolean828 = false;
	aClass41_823 = null;
	anApplet836 = null;
	aString826 = null;
	aClass41_840 = null;
	aString827 = null;
	aClass5_839 = null;
	aClass5_841 = null;
	aClass5_838 = null;
	aString842 = null;
	try {
	    anInetAddress831 = arg2;
	    aString832 = "Unknown";
	    anApplet836 = arg1;
	    aString824 = "1.1";
	    try {
		aString832 = System.getProperty("java.vendor");
		aString824 = System.getProperty("java.version");
	    } catch (Exception exception) {
		/* empty */
	    }
	    try {
		if (arg1 == null)
		    aMethod843 = (Class.forName("java.awt.Component")
				      .getDeclaredMethod
				  ("setFocusTraversalKeysEnabled",
				   new Class[] { Boolean.TYPE }));
		else
		    aMethod843 = (arg1.getClass().getMethod
				  ("setFocusTraversalKeysEnabled",
				   new Class[] { Boolean.TYPE }));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if (arg0) {
		method777(arg3, arg4, (byte) -96);
		File file = new File(aString834 + "main_file_cache.dat");
		if (file.exists())
		    aClass5_839 = new Class5(file, "rw", 52428800L);
		aClass5Array825 = new Class5[5];
		for (int i = 0; i < 5; i++) {
		    File file_1_
			= new File(aString834 + "main_file_cache.idx" + i);
		    if (file_1_.exists())
			aClass5Array825[i]
			    = new Class5(file_1_, "rw", 1048576L);
		}
		aClass5_838
		    = new Class5(new File(aString827 + "main_file_cache.dat2"),
				 "rw", 52428800L);
		aClass5Array830 = new Class5[arg5];
		for (int i = 0; (arg5 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		    aClass5Array830[i]
			= new Class5(new File(aString827
					      + "main_file_cache.idx" + i),
				     "rw", 1048576L);
		aClass5_841 = new Class5(new File(aString827
						  + "main_file_cache.idx255"),
					 "rw", 1048576L);
		method779(1);
	    }
	    aBoolean828 = false;
	    aThread837 = new Thread(this);
	    aThread837.setPriority(10);
	    aThread837.setDaemon(true);
	    aThread837.start();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}
