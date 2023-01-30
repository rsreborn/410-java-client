/* Class11_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub3_Sub1 extends Class11_Sub3
{
    public int anInt1904;
    public byte[] aByteArray1905;
    public int anInt1906;
    public int anInt1907;
    
    public Class11_Sub3_Sub1 method134(Class50 arg0) {
	aByteArray1905 = arg0.method848(-4, aByteArray1905);
	anInt1904 = arg0.method846(94, anInt1904);
	if (anInt1907 == anInt1906)
	    anInt1907 = anInt1906 = arg0.method845(anInt1907, 120);
	else {
	    anInt1907 = arg0.method845(anInt1907, 125);
	    anInt1906 = arg0.method845(anInt1906, 122);
	    if (anInt1907 == anInt1906)
		anInt1907--;
	}
	return this;
    }
    
    public Class11_Sub3_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
	anInt1904 = arg0;
	aByteArray1905 = arg1;
	anInt1907 = arg2;
	anInt1906 = arg3;
    }
}
