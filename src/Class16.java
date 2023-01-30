/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class16
{
    public int anInt319 = 2;
    public int[] anIntArray320 = new int[2];
    public int anInt321;
    public int anInt322;
    public int[] anIntArray323 = new int[2];
    public int anInt324;
    public int anInt325;
    public int anInt326;
    public int anInt327;
    public int anInt328;
    public int anInt329;
    
    public void method558() {
	anInt326 = 0;
	anInt325 = 0;
	anInt327 = 0;
	anInt328 = 0;
	anInt329 = 0;
    }
    
    public void method559(Buffer arg0) {
	anInt319 = arg0.readUByte();
	anIntArray320 = new int[anInt319];
	anIntArray323 = new int[anInt319];
	for (int i = 0; i < anInt319; i++) {
	    anIntArray320[i] = arg0.readUShortBE();
	    anIntArray323[i] = arg0.readUShortBE();
	}
    }
    
    public Class16() {
	anIntArray320[0] = 0;
	anIntArray320[1] = 65535;
	anIntArray323[0] = 0;
	anIntArray323[1] = 65535;
    }
    
    public void method560(Buffer arg0) {
	anInt322 = arg0.readUByte();
	anInt324 = arg0.readUIntBE();
	anInt321 = arg0.readUIntBE();
	method559(arg0);
    }
    
    public int method561(int arg0) {
	if (anInt329 >= anInt326) {
	    anInt328 = anIntArray323[anInt325++] << 15;
	    if (anInt325 >= anInt319)
		anInt325 = anInt319 - 1;
	    anInt326 = (int) ((double) anIntArray320[anInt325] / 65536.0
			      * (double) arg0);
	    if (anInt326 > anInt329)
		anInt327 = (((anIntArray323[anInt325] << 15) - anInt328)
			    / (anInt326 - anInt329));
	}
	anInt328 += anInt327;
	anInt329++;
	return anInt328 - anInt327 >> 15;
    }
}
