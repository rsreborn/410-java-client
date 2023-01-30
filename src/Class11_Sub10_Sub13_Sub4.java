/* Class11_Sub10_Sub13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class11_Sub10_Sub13_Sub4 extends Class11_Sub10_Sub13
{
    public int anInt2774;
    public int anInt2775;
    public int[] anIntArray2776;
    public int anInt2777;
    public int anInt2778;
    public int anInt2779;
    public int anInt2780;
    
    public void method448(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int[] arg8,
			  int[] arg9) {
	try {
	    int i = -arg2 / 2;
	    int i_0_ = -arg3 / 2;
	    int i_1_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_2_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_1_ = i_1_ * arg7 >> 8;
	    i_2_ = i_2_ * arg7 >> 8;
	    int i_3_ = (arg4 << 16) + (i_0_ * i_1_ + i * i_2_);
	    int i_4_ = (arg5 << 16) + (i_0_ * i_2_ - i * i_1_);
	    int i_5_ = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_6_ = arg8[arg1];
		int i_7_ = i_5_ + i_6_;
		int i_8_ = i_3_ + i_2_ * i_6_;
		int i_9_ = i_4_ - i_1_ * i_6_;
		for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
		    Class11_Sub10_Sub13.anIntArray2307[i_7_++]
			= (anIntArray2776
			   [(i_8_ >> 16) + (i_9_ >> 16) * anInt2780]);
		    i_8_ += i_2_;
		    i_9_ -= i_1_;
		}
		i_3_ += i_1_;
		i_4_ += i_2_;
		i_5_ += Class11_Sub10_Sub13.anInt2306;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method449(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	for (int i = -arg5; i < 0; i++) {
	    int i_10_ = arg3 + arg4 - 3;
	    while (arg3 < i_10_) {
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
	    }
	    i_10_ += 3;
	    while (arg3 < i_10_)
		arg0[arg3++] = arg1[arg2++];
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public void method450(int arg0, int arg1, int arg2) {
	arg0 += anInt2778;
	arg1 += anInt2774;
	int i = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	int i_11_ = 0;
	int i_12_ = anInt2775;
	int i_13_ = anInt2780;
	int i_14_ = Class11_Sub10_Sub13.anInt2306 - i_13_;
	int i_15_ = 0;
	if (arg1 < Class11_Sub10_Sub13.anInt2305) {
	    int i_16_ = Class11_Sub10_Sub13.anInt2305 - arg1;
	    i_12_ -= i_16_;
	    arg1 = Class11_Sub10_Sub13.anInt2305;
	    i_11_ += i_16_ * i_13_;
	    i += i_16_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg1 + i_12_ > Class11_Sub10_Sub13.anInt2304)
	    i_12_ -= arg1 + i_12_ - Class11_Sub10_Sub13.anInt2304;
	if (arg0 < Class11_Sub10_Sub13.anInt2303) {
	    int i_17_ = Class11_Sub10_Sub13.anInt2303 - arg0;
	    i_13_ -= i_17_;
	    arg0 = Class11_Sub10_Sub13.anInt2303;
	    i_11_ += i_17_;
	    i += i_17_;
	    i_15_ += i_17_;
	    i_14_ += i_17_;
	}
	if (arg0 + i_13_ > Class11_Sub10_Sub13.anInt2302) {
	    int i_18_ = arg0 + i_13_ - Class11_Sub10_Sub13.anInt2302;
	    i_13_ -= i_18_;
	    i_15_ += i_18_;
	    i_14_ += i_18_;
	}
	if (i_13_ > 0 && i_12_ > 0)
	    method458(Class11_Sub10_Sub13.anIntArray2307, anIntArray2776, 0,
		      i_11_, i, i_13_, i_12_, i_14_, i_15_, arg2);
    }
    
    public void method451(int arg0, int arg1) {
	arg0 += anInt2778;
	arg1 += anInt2774;
	int i = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	int i_19_ = 0;
	int i_20_ = anInt2775;
	int i_21_ = anInt2780;
	int i_22_ = Class11_Sub10_Sub13.anInt2306 - i_21_;
	int i_23_ = 0;
	if (arg1 < Class11_Sub10_Sub13.anInt2305) {
	    int i_24_ = Class11_Sub10_Sub13.anInt2305 - arg1;
	    i_20_ -= i_24_;
	    arg1 = Class11_Sub10_Sub13.anInt2305;
	    i_19_ += i_24_ * i_21_;
	    i += i_24_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg1 + i_20_ > Class11_Sub10_Sub13.anInt2304)
	    i_20_ -= arg1 + i_20_ - Class11_Sub10_Sub13.anInt2304;
	if (arg0 < Class11_Sub10_Sub13.anInt2303) {
	    int i_25_ = Class11_Sub10_Sub13.anInt2303 - arg0;
	    i_21_ -= i_25_;
	    arg0 = Class11_Sub10_Sub13.anInt2303;
	    i_19_ += i_25_;
	    i += i_25_;
	    i_23_ += i_25_;
	    i_22_ += i_25_;
	}
	if (arg0 + i_21_ > Class11_Sub10_Sub13.anInt2302) {
	    int i_26_ = arg0 + i_21_ - Class11_Sub10_Sub13.anInt2302;
	    i_21_ -= i_26_;
	    i_23_ += i_26_;
	    i_22_ += i_26_;
	}
	if (i_21_ > 0 && i_20_ > 0)
	    method449(Class11_Sub10_Sub13.anIntArray2307, anIntArray2776,
		      i_19_, i, i_21_, i_20_, i_22_, i_23_);
    }
    
    public void method452() {
	if (anInt2780 != anInt2779 || anInt2775 != anInt2777) {
	    int[] is = new int[anInt2779 * anInt2777];
	    for (int i = 0; i < anInt2775; i++) {
		for (int i_27_ = 0; i_27_ < anInt2780; i_27_++)
		    is[(i + anInt2774) * anInt2779 + (i_27_ + anInt2778)]
			= anIntArray2776[i * anInt2780 + i_27_];
	    }
	    anIntArray2776 = is;
	    anInt2780 = anInt2779;
	    anInt2775 = anInt2777;
	    anInt2778 = 0;
	    anInt2774 = 0;
	}
    }
    
    public void method453(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray2776.length; i++) {
	    int i_28_ = anIntArray2776[i];
	    if (i_28_ != 0) {
		int i_29_ = i_28_ >> 16 & 0xff;
		i_29_ += arg0;
		if (i_29_ < 1)
		    i_29_ = 1;
		else if (i_29_ > 255)
		    i_29_ = 255;
		int i_30_ = i_28_ >> 8 & 0xff;
		i_30_ += arg1;
		if (i_30_ < 1)
		    i_30_ = 1;
		else if (i_30_ > 255)
		    i_30_ = 255;
		int i_31_ = i_28_ & 0xff;
		i_31_ += arg2;
		if (i_31_ < 1)
		    i_31_ = 1;
		else if (i_31_ > 255)
		    i_31_ = 255;
		anIntArray2776[i] = (i_29_ << 16) + (i_30_ << 8) + i_31_;
	    }
	}
    }
    
    public void method454(Class11_Sub10_Sub13_Sub3 arg0, int arg1, int arg2) {
	arg1 += anInt2778;
	arg2 += anInt2774;
	int i = arg1 + arg2 * Class11_Sub10_Sub13.anInt2306;
	int i_32_ = 0;
	int i_33_ = anInt2775;
	int i_34_ = anInt2780;
	int i_35_ = Class11_Sub10_Sub13.anInt2306 - i_34_;
	int i_36_ = 0;
	if (arg2 < Class11_Sub10_Sub13.anInt2305) {
	    int i_37_ = Class11_Sub10_Sub13.anInt2305 - arg2;
	    i_33_ -= i_37_;
	    arg2 = Class11_Sub10_Sub13.anInt2305;
	    i_32_ += i_37_ * i_34_;
	    i += i_37_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg2 + i_33_ > Class11_Sub10_Sub13.anInt2304)
	    i_33_ -= arg2 + i_33_ - Class11_Sub10_Sub13.anInt2304;
	if (arg1 < Class11_Sub10_Sub13.anInt2303) {
	    int i_38_ = Class11_Sub10_Sub13.anInt2303 - arg1;
	    i_34_ -= i_38_;
	    arg1 = Class11_Sub10_Sub13.anInt2303;
	    i_32_ += i_38_;
	    i += i_38_;
	    i_36_ += i_38_;
	    i_35_ += i_38_;
	}
	if (arg1 + i_34_ > Class11_Sub10_Sub13.anInt2302) {
	    int i_39_ = arg1 + i_34_ - Class11_Sub10_Sub13.anInt2302;
	    i_34_ -= i_39_;
	    i_36_ += i_39_;
	    i_35_ += i_39_;
	}
	if (i_34_ > 0 && i_33_ > 0)
	    method457(Class11_Sub10_Sub13.anIntArray2307, anIntArray2776, 0,
		      i_32_, i, i_34_, i_33_, i_35_, i_36_,
		      arg0.aByteArray2768);
    }
    
    public void method455(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, double arg6, int arg7) {
	try {
	    int i = -arg2 / 2;
	    int i_40_ = -arg3 / 2;
	    int i_41_ = (int) (Math.sin(arg6) * 65536.0);
	    int i_42_ = (int) (Math.cos(arg6) * 65536.0);
	    i_41_ = i_41_ * arg7 >> 8;
	    i_42_ = i_42_ * arg7 >> 8;
	    int i_43_ = (arg4 << 16) + (i_40_ * i_41_ + i * i_42_);
	    int i_44_ = (arg5 << 16) + (i_40_ * i_42_ - i * i_41_);
	    int i_45_ = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_46_ = i_45_;
		int i_47_ = i_43_;
		int i_48_ = i_44_;
		for (arg0 = -arg2; arg0 < 0; arg0++) {
		    int i_49_ = (anIntArray2776
				 [(i_47_ >> 16) + (i_48_ >> 16) * anInt2780]);
		    if (i_49_ != 0)
			Class11_Sub10_Sub13.anIntArray2307[i_46_++] = i_49_;
		    else
			i_46_++;
		    i_47_ += i_42_;
		    i_48_ -= i_41_;
		}
		i_43_ += i_41_;
		i_44_ += i_42_;
		i_45_ += Class11_Sub10_Sub13.anInt2306;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method456(int arg0, int arg1) {
	arg0 += anInt2778;
	arg1 += anInt2774;
	int i = arg0 + arg1 * Class11_Sub10_Sub13.anInt2306;
	int i_50_ = 0;
	int i_51_ = anInt2775;
	int i_52_ = anInt2780;
	int i_53_ = Class11_Sub10_Sub13.anInt2306 - i_52_;
	int i_54_ = 0;
	if (arg1 < Class11_Sub10_Sub13.anInt2305) {
	    int i_55_ = Class11_Sub10_Sub13.anInt2305 - arg1;
	    i_51_ -= i_55_;
	    arg1 = Class11_Sub10_Sub13.anInt2305;
	    i_50_ += i_55_ * i_52_;
	    i += i_55_ * Class11_Sub10_Sub13.anInt2306;
	}
	if (arg1 + i_51_ > Class11_Sub10_Sub13.anInt2304)
	    i_51_ -= arg1 + i_51_ - Class11_Sub10_Sub13.anInt2304;
	if (arg0 < Class11_Sub10_Sub13.anInt2303) {
	    int i_56_ = Class11_Sub10_Sub13.anInt2303 - arg0;
	    i_52_ -= i_56_;
	    arg0 = Class11_Sub10_Sub13.anInt2303;
	    i_50_ += i_56_;
	    i += i_56_;
	    i_54_ += i_56_;
	    i_53_ += i_56_;
	}
	if (arg0 + i_52_ > Class11_Sub10_Sub13.anInt2302) {
	    int i_57_ = arg0 + i_52_ - Class11_Sub10_Sub13.anInt2302;
	    i_52_ -= i_57_;
	    i_54_ += i_57_;
	    i_53_ += i_57_;
	}
	if (i_52_ > 0 && i_51_ > 0)
	    method459(Class11_Sub10_Sub13.anIntArray2307, anIntArray2776, 0,
		      i_50_, i, i_52_, i_51_, i_53_, i_54_);
    }
    
    public static void method457(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, byte[] arg9) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_58_ = -arg6; i_58_ < 0; i_58_++) {
	    for (int i_59_ = i; i_59_ < 0; i_59_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0 && arg9[arg4] == 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0 && arg9[arg4] == 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0 && arg9[arg4] == 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0 && arg9[arg4] == 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_60_ = arg5; i_60_ < 0; i_60_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0 && arg9[arg4] == 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public static void method458(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	int i = 256 - arg9;
	for (int i_61_ = -arg6; i_61_ < 0; i_61_++) {
	    for (int i_62_ = -arg5; i_62_ < 0; i_62_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0) {
		    int i_63_ = arg0[arg4];
		    arg0[arg4++]
			= (((arg2 & 0xff00ff) * arg9 + (i_63_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((arg2 & 0xff00) * arg9 + (i_63_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public static void method459(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_64_ = -arg6; i_64_ < 0; i_64_++) {
	    for (int i_65_ = i; i_65_ < 0; i_65_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_66_ = arg5; i_66_ < 0; i_66_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class11_Sub10_Sub13_Sub4() {
	/* empty */
    }
    
    public Class11_Sub10_Sub13_Sub4(int arg0, int arg1) {
	anIntArray2776 = new int[arg0 * arg1];
	anInt2780 = anInt2779 = arg0;
	anInt2775 = anInt2777 = arg1;
	anInt2778 = anInt2774 = 0;
    }
    
    public void method460() {
	Class11_Sub10_Sub13.method396(anIntArray2776, anInt2780, anInt2775);
    }
    
    public Class11_Sub10_Sub13_Sub4(byte[] arg0, Component arg1) {
	try {
	    Image image = Toolkit.getDefaultToolkit().createImage(arg0);
	    MediaTracker mediatracker = new MediaTracker(arg1);
	    mediatracker.addImage(image, 0);
	    mediatracker.waitForAll();
	    anInt2780 = image.getWidth(arg1);
	    anInt2775 = image.getHeight(arg1);
	    anInt2779 = anInt2780;
	    anInt2777 = anInt2775;
	    anInt2778 = 0;
	    anInt2774 = 0;
	    anIntArray2776 = new int[anInt2780 * anInt2775];
	    PixelGrabber pixelgrabber
		= new PixelGrabber(image, 0, 0, anInt2780, anInt2775,
				   anIntArray2776, 0, anInt2780);
	    pixelgrabber.grabPixels();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
}
