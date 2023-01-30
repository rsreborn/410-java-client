/* Class11_Sub10_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub4_Sub4 extends Class11_Sub10_Sub4
{
    public int[] anIntArray2592;
    public int anInt2593;
    public int[] anIntArray2594;
    public int[] anIntArray2595;
    public int[] anIntArray2596;
    public int[] anIntArray2597;
    public int[] anIntArray2598;
    public int[] anIntArray2599;
    public int anInt2600;
    public int anInt2601 = 0;
    public int anInt2602;
    public int anInt2603;
    public int[][] anIntArrayArray2604;
    public int[] anIntArray2605;
    public Class62[] aClass62Array2606;
    public int[] anIntArray2607;
    public Class62[] aClass62Array2608;
    public int[] anIntArray2609;
    public int[] anIntArray2610;
    public int[] anIntArray2611;
    public int[] anIntArray2612;
    public int[] anIntArray2613;
    public int anInt2614;
    public int[][] anIntArrayArray2615;
    public int anInt2616;
    public int[] anIntArray2617;
    public int anInt2618;
    public int anInt2619;
    public int[] anIntArray2620;
    public int[] anIntArray2621;
    public int[] anIntArray2622;
    public boolean aBoolean2623 = false;
    public int anInt2624;
    public static Class11_Sub10_Sub4_Sub4 aClass11_Sub10_Sub4_Sub4_2625
	= new Class11_Sub10_Sub4_Sub4();
    public int anInt2626;
    public static Class11_Sub10_Sub4_Sub4 aClass11_Sub10_Sub4_Sub4_2627;
    public static int[] anIntArray2628 = new int[1];
    public static int[] anIntArray2629;
    public static int anInt2630;
    public static int anInt2631;
    public static int[] anIntArray2632;
    public static int anInt2633;
    public static int[] anIntArray2634;
    public static boolean[] aBooleanArray2635;
    public static int[] anIntArray2636;
    public static int[] anIntArray2637;
    public static int[] anIntArray2638;
    public static int[] anIntArray2639;
    public static int[] anIntArray2640;
    public static int[] anIntArray2641;
    public static int[] anIntArray2642;
    public static int anInt2643;
    public static int[] anIntArray2644;
    public static int[] anIntArray2645;
    public static int[] anIntArray2646;
    public static int[] anIntArray2647;
    public static boolean aBoolean2648;
    public static int[] anIntArray2649;
    public static int[][] anIntArrayArray2650;
    public static int[] anIntArray2651;
    public static int[] anIntArray2652;
    public static int[][] anIntArrayArray2653;
    public static int[] anIntArray2654;
    public static boolean[] aBooleanArray2655;
    public static int anInt2656;
    public static int[] anIntArray2657;
    public static int anInt2658;
    public static int[] anIntArray2659;
    public static int[] anIntArray2660;
    
    public void method292(int arg0) {
	int i = Class11_Sub10_Sub13_Sub1.anInt2730;
	int i_0_ = Class11_Sub10_Sub13_Sub1.anInt2729;
	int i_1_ = 0;
	int i_2_ = anIntArray2610[arg0];
	int i_3_ = anIntArray2609[arg0];
	int i_4_ = anIntArray2595[arg0];
	int i_5_ = anIntArray2638[i_2_];
	int i_6_ = anIntArray2638[i_3_];
	int i_7_ = anIntArray2638[i_4_];
	if (anIntArray2598 == null)
	    Class11_Sub10_Sub13_Sub1.anInt2734 = 0;
	else
	    Class11_Sub10_Sub13_Sub1.anInt2734 = anIntArray2598[arg0];
	if (i_5_ >= 50) {
	    anIntArray2641[i_1_] = anIntArray2637[i_2_];
	    anIntArray2651[i_1_] = anIntArray2636[i_2_];
	    anIntArray2659[i_1_++] = anIntArray2622[arg0];
	} else {
	    int i_8_ = anIntArray2645[i_2_];
	    int i_9_ = anIntArray2646[i_2_];
	    int i_10_ = anIntArray2622[arg0];
	    if (i_7_ >= 50) {
		int i_11_ = (50 - i_5_) * anIntArray2644[i_7_ - i_5_];
		anIntArray2641[i_1_]
		    = i + (i_8_ + ((anIntArray2645[i_4_] - i_8_) * i_11_ >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_9_ + ((anIntArray2646[i_4_] - i_9_) * i_11_
				      >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_10_ + ((anIntArray2594[arg0] - i_10_) * i_11_ >> 16);
	    }
	    if (i_6_ >= 50) {
		int i_12_ = (50 - i_5_) * anIntArray2644[i_6_ - i_5_];
		anIntArray2641[i_1_]
		    = i + (i_8_ + ((anIntArray2645[i_3_] - i_8_) * i_12_ >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_9_ + ((anIntArray2646[i_3_] - i_9_) * i_12_
				      >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_10_ + ((anIntArray2596[arg0] - i_10_) * i_12_ >> 16);
	    }
	}
	if (i_6_ >= 50) {
	    anIntArray2641[i_1_] = anIntArray2637[i_3_];
	    anIntArray2651[i_1_] = anIntArray2636[i_3_];
	    anIntArray2659[i_1_++] = anIntArray2596[arg0];
	} else {
	    int i_13_ = anIntArray2645[i_3_];
	    int i_14_ = anIntArray2646[i_3_];
	    int i_15_ = anIntArray2596[arg0];
	    if (i_5_ >= 50) {
		int i_16_ = (50 - i_6_) * anIntArray2644[i_5_ - i_6_];
		anIntArray2641[i_1_]
		    = i + (i_13_ + ((anIntArray2645[i_2_] - i_13_) * i_16_
				    >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_14_ + ((anIntArray2646[i_2_] - i_14_) * i_16_
				       >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_15_ + ((anIntArray2622[arg0] - i_15_) * i_16_ >> 16);
	    }
	    if (i_7_ >= 50) {
		int i_17_ = (50 - i_6_) * anIntArray2644[i_7_ - i_6_];
		anIntArray2641[i_1_]
		    = i + (i_13_ + ((anIntArray2645[i_4_] - i_13_) * i_17_
				    >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_14_ + ((anIntArray2646[i_4_] - i_14_) * i_17_
				       >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_15_ + ((anIntArray2594[arg0] - i_15_) * i_17_ >> 16);
	    }
	}
	if (i_7_ >= 50) {
	    anIntArray2641[i_1_] = anIntArray2637[i_4_];
	    anIntArray2651[i_1_] = anIntArray2636[i_4_];
	    anIntArray2659[i_1_++] = anIntArray2594[arg0];
	} else {
	    int i_18_ = anIntArray2645[i_4_];
	    int i_19_ = anIntArray2646[i_4_];
	    int i_20_ = anIntArray2594[arg0];
	    if (i_6_ >= 50) {
		int i_21_ = (50 - i_7_) * anIntArray2644[i_6_ - i_7_];
		anIntArray2641[i_1_]
		    = i + (i_18_ + ((anIntArray2645[i_3_] - i_18_) * i_21_
				    >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_19_ + ((anIntArray2646[i_3_] - i_19_) * i_21_
				       >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_20_ + ((anIntArray2596[arg0] - i_20_) * i_21_ >> 16);
	    }
	    if (i_5_ >= 50) {
		int i_22_ = (50 - i_7_) * anIntArray2644[i_5_ - i_7_];
		anIntArray2641[i_1_]
		    = i + (i_18_ + ((anIntArray2645[i_2_] - i_18_) * i_22_
				    >> 16)
			   << 9) / 50;
		anIntArray2651[i_1_]
		    = i_0_ + (i_19_ + ((anIntArray2646[i_2_] - i_19_) * i_22_
				       >> 16)
			      << 9) / 50;
		anIntArray2659[i_1_++]
		    = i_20_ + ((anIntArray2622[arg0] - i_20_) * i_22_ >> 16);
	    }
	}
	int i_23_ = anIntArray2641[0];
	int i_24_ = anIntArray2641[1];
	int i_25_ = anIntArray2641[2];
	int i_26_ = anIntArray2651[0];
	int i_27_ = anIntArray2651[1];
	int i_28_ = anIntArray2651[2];
	Class11_Sub10_Sub13_Sub1.aBoolean2732 = false;
	if (i_1_ == 3) {
	    if (i_23_ < 0 || i_24_ < 0 || i_25_ < 0
		|| i_23_ > Class11_Sub10_Sub13_Sub1.anInt2723
		|| i_24_ > Class11_Sub10_Sub13_Sub1.anInt2723
		|| i_25_ > Class11_Sub10_Sub13_Sub1.anInt2723)
		Class11_Sub10_Sub13_Sub1.aBoolean2732 = true;
	    int i_29_;
	    if (anIntArray2613 == null)
		i_29_ = 0;
	    else
		i_29_ = anIntArray2613[arg0] & 0x3;
	    if (i_29_ == 0)
		Class11_Sub10_Sub13_Sub1.method414(i_26_, i_27_, i_28_, i_23_,
						   i_24_, i_25_,
						   anIntArray2659[0],
						   anIntArray2659[1],
						   anIntArray2659[2]);
	    else if (i_29_ == 1)
		Class11_Sub10_Sub13_Sub1.method416(i_26_, i_27_, i_28_, i_23_,
						   i_24_, i_25_,
						   (anIntArray2640
						    [anIntArray2622[arg0]]));
	    else if (i_29_ == 2) {
		int i_30_ = anIntArray2613[arg0] >> 2;
		int i_31_ = anIntArray2617[i_30_];
		int i_32_ = anIntArray2612[i_30_];
		int i_33_ = anIntArray2592[i_30_];
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_27_, i_28_, i_23_, i_24_, i_25_,
		     anIntArray2659[0], anIntArray2659[1], anIntArray2659[2],
		     anIntArray2645[i_31_], anIntArray2645[i_32_],
		     anIntArray2645[i_33_], anIntArray2646[i_31_],
		     anIntArray2646[i_32_], anIntArray2646[i_33_],
		     anIntArray2638[i_31_], anIntArray2638[i_32_],
		     anIntArray2638[i_33_], anIntArray2607[arg0]);
	    } else if (i_29_ == 3) {
		int i_34_ = anIntArray2613[arg0] >> 2;
		int i_35_ = anIntArray2617[i_34_];
		int i_36_ = anIntArray2612[i_34_];
		int i_37_ = anIntArray2592[i_34_];
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_27_, i_28_, i_23_, i_24_, i_25_,
		     anIntArray2622[arg0], anIntArray2622[arg0],
		     anIntArray2622[arg0], anIntArray2645[i_35_],
		     anIntArray2645[i_36_], anIntArray2645[i_37_],
		     anIntArray2646[i_35_], anIntArray2646[i_36_],
		     anIntArray2646[i_37_], anIntArray2638[i_35_],
		     anIntArray2638[i_36_], anIntArray2638[i_37_],
		     anIntArray2607[arg0]);
	    }
	}
	if (i_1_ == 4) {
	    if (i_23_ < 0 || i_24_ < 0 || i_25_ < 0
		|| i_23_ > Class11_Sub10_Sub13_Sub1.anInt2723
		|| i_24_ > Class11_Sub10_Sub13_Sub1.anInt2723
		|| i_25_ > Class11_Sub10_Sub13_Sub1.anInt2723
		|| anIntArray2641[3] < 0
		|| anIntArray2641[3] > Class11_Sub10_Sub13_Sub1.anInt2723)
		Class11_Sub10_Sub13_Sub1.aBoolean2732 = true;
	    int i_38_;
	    if (anIntArray2613 == null)
		i_38_ = 0;
	    else
		i_38_ = anIntArray2613[arg0] & 0x3;
	    if (i_38_ == 0) {
		Class11_Sub10_Sub13_Sub1.method414(i_26_, i_27_, i_28_, i_23_,
						   i_24_, i_25_,
						   anIntArray2659[0],
						   anIntArray2659[1],
						   anIntArray2659[2]);
		Class11_Sub10_Sub13_Sub1.method414(i_26_, i_28_,
						   anIntArray2651[3], i_23_,
						   i_25_, anIntArray2641[3],
						   anIntArray2659[0],
						   anIntArray2659[2],
						   anIntArray2659[3]);
	    } else if (i_38_ == 1) {
		int i_39_ = anIntArray2640[anIntArray2622[arg0]];
		Class11_Sub10_Sub13_Sub1.method416(i_26_, i_27_, i_28_, i_23_,
						   i_24_, i_25_, i_39_);
		Class11_Sub10_Sub13_Sub1.method416(i_26_, i_28_,
						   anIntArray2651[3], i_23_,
						   i_25_, anIntArray2641[3],
						   i_39_);
	    } else if (i_38_ == 2) {
		int i_40_ = anIntArray2613[arg0] >> 2;
		int i_41_ = anIntArray2617[i_40_];
		int i_42_ = anIntArray2612[i_40_];
		int i_43_ = anIntArray2592[i_40_];
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_27_, i_28_, i_23_, i_24_, i_25_,
		     anIntArray2659[0], anIntArray2659[1], anIntArray2659[2],
		     anIntArray2645[i_41_], anIntArray2645[i_42_],
		     anIntArray2645[i_43_], anIntArray2646[i_41_],
		     anIntArray2646[i_42_], anIntArray2646[i_43_],
		     anIntArray2638[i_41_], anIntArray2638[i_42_],
		     anIntArray2638[i_43_], anIntArray2607[arg0]);
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_28_, anIntArray2651[3], i_23_, i_25_,
		     anIntArray2641[3], anIntArray2659[0], anIntArray2659[2],
		     anIntArray2659[3], anIntArray2645[i_41_],
		     anIntArray2645[i_42_], anIntArray2645[i_43_],
		     anIntArray2646[i_41_], anIntArray2646[i_42_],
		     anIntArray2646[i_43_], anIntArray2638[i_41_],
		     anIntArray2638[i_42_], anIntArray2638[i_43_],
		     anIntArray2607[arg0]);
	    } else if (i_38_ == 3) {
		int i_44_ = anIntArray2613[arg0] >> 2;
		int i_45_ = anIntArray2617[i_44_];
		int i_46_ = anIntArray2612[i_44_];
		int i_47_ = anIntArray2592[i_44_];
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_27_, i_28_, i_23_, i_24_, i_25_,
		     anIntArray2622[arg0], anIntArray2622[arg0],
		     anIntArray2622[arg0], anIntArray2645[i_45_],
		     anIntArray2645[i_46_], anIntArray2645[i_47_],
		     anIntArray2646[i_45_], anIntArray2646[i_46_],
		     anIntArray2646[i_47_], anIntArray2638[i_45_],
		     anIntArray2638[i_46_], anIntArray2638[i_47_],
		     anIntArray2607[arg0]);
		Class11_Sub10_Sub13_Sub1.method418
		    (i_26_, i_28_, anIntArray2651[3], i_23_, i_25_,
		     anIntArray2641[3], anIntArray2622[arg0],
		     anIntArray2622[arg0], anIntArray2622[arg0],
		     anIntArray2645[i_45_], anIntArray2645[i_46_],
		     anIntArray2645[i_47_], anIntArray2646[i_45_],
		     anIntArray2646[i_46_], anIntArray2646[i_47_],
		     anIntArray2638[i_45_], anIntArray2638[i_46_],
		     anIntArray2638[i_47_], anIntArray2607[arg0]);
	    }
	}
    }
    
    public void method293(Class11_Sub10_Sub6 arg0, int arg1) {
	if (anIntArrayArray2604 != null && arg1 != -1) {
	    aClass62Array2606 = null;
	    anInt2614 = 0;
	    Class18 class18 = arg0.aClass18Array2140[arg1];
	    Class11_Sub6 class11_sub6 = class18.aClass11_Sub6_352;
	    anInt2630 = 0;
	    anInt2643 = 0;
	    anInt2658 = 0;
	    for (int i = 0; i < class18.anInt356; i++) {
		int i_48_ = class18.anIntArray346[i];
		method311(class11_sub6.anIntArray1580[i_48_],
			  class11_sub6.anIntArrayArray1592[i_48_],
			  class18.anIntArray351[i], class18.anIntArray350[i],
			  class18.anIntArray349[i]);
	    }
	}
    }
    
    public void method294() {
	if (anInt2614 != 1) {
	    anInt2614 = 1;
	    anInt2046 = 0;
	    anInt2602 = 0;
	    anInt2593 = 0;
	    for (int i = 0; i < anInt2618; i++) {
		int i_49_ = anIntArray2597[i];
		int i_50_ = anIntArray2605[i];
		int i_51_ = anIntArray2620[i];
		if (-i_50_ > anInt2046)
		    anInt2046 = -i_50_;
		if (i_50_ > anInt2602)
		    anInt2602 = i_50_;
		int i_52_ = i_49_ * i_49_ + i_51_ * i_51_;
		if (i_52_ > anInt2593)
		    anInt2593 = i_52_;
	    }
	    anInt2593 = (int) (Math.sqrt((double) anInt2593) + 0.99);
	    anInt2626 = (int) (Math.sqrt((double) (anInt2593 * anInt2593
						   + anInt2046 * anInt2046))
			       + 0.99);
	    anInt2619 = (anInt2626
			 + (int) (Math.sqrt((double) (anInt2593 * anInt2593
						      + anInt2602 * anInt2602))
				  + 0.99));
	}
    }
    
    public void method295() {
	aClass62Array2606 = null;
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++)
	    anIntArray2620[i] = -anIntArray2620[i];
	for (int i = 0; i < anInt2624; i++) {
	    int i_53_ = anIntArray2610[i];
	    anIntArray2610[i] = anIntArray2595[i];
	    anIntArray2595[i] = i_53_;
	}
    }
    
    public void method296(int arg0, int arg1, int arg2) {
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++) {
	    anIntArray2597[i] += arg0;
	    anIntArray2605[i] += arg1;
	    anIntArray2620[i] += arg2;
	}
    }
    
    public void method297(boolean arg0, boolean arg1, int arg2) {
	if (anInt2619 < 1500) {
	    for (int i = 0; i < anInt2619; i++)
		anIntArray2639[i] = 0;
	    for (int i = 0; i < anInt2624; i++) {
		if (anIntArray2613 == null || anIntArray2613[i] != -1) {
		    int i_54_ = anIntArray2610[i];
		    int i_55_ = anIntArray2609[i];
		    int i_56_ = anIntArray2595[i];
		    int i_57_ = anIntArray2637[i_54_];
		    int i_58_ = anIntArray2637[i_55_];
		    int i_59_ = anIntArray2637[i_56_];
		    if (arg0 && (i_57_ == -5000 || i_58_ == -5000
				 || i_59_ == -5000)) {
			int i_60_ = anIntArray2645[i_54_];
			int i_61_ = anIntArray2645[i_55_];
			int i_62_ = anIntArray2645[i_56_];
			int i_63_ = anIntArray2646[i_54_];
			int i_64_ = anIntArray2646[i_55_];
			int i_65_ = anIntArray2646[i_56_];
			int i_66_ = anIntArray2638[i_54_];
			int i_67_ = anIntArray2638[i_55_];
			int i_68_ = anIntArray2638[i_56_];
			i_60_ -= i_61_;
			i_62_ -= i_61_;
			i_63_ -= i_64_;
			i_65_ -= i_64_;
			i_66_ -= i_67_;
			i_68_ -= i_67_;
			int i_69_ = i_63_ * i_68_ - i_66_ * i_65_;
			int i_70_ = i_66_ * i_62_ - i_60_ * i_68_;
			int i_71_ = i_60_ * i_65_ - i_63_ * i_62_;
			if (i_61_ * i_69_ + i_64_ * i_70_ + i_67_ * i_71_
			    > 0) {
			    aBooleanArray2635[i] = true;
			    int i_72_ = ((anIntArray2652[i_54_]
					  + anIntArray2652[i_55_]
					  + anIntArray2652[i_56_]) / 3
					 + anInt2626);
			    anIntArrayArray2653[i_72_][anIntArray2639[i_72_]++]
				= i;
			}
		    } else {
			if (arg1 && method316(anInt2656, anInt2633,
					      anIntArray2636[i_54_],
					      anIntArray2636[i_55_],
					      anIntArray2636[i_56_], i_57_,
					      i_58_, i_59_)) {
			    anIntArray2634[anInt2631++] = arg2;
			    arg1 = false;
			}
			if (((i_57_ - i_58_) * (anIntArray2636[i_56_]
						- anIntArray2636[i_55_])
			     - ((anIntArray2636[i_54_] - anIntArray2636[i_55_])
				* (i_59_ - i_58_)))
			    > 0) {
			    aBooleanArray2635[i] = false;
			    if (i_57_ < 0 || i_58_ < 0 || i_59_ < 0
				|| i_57_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_58_ > Class11_Sub10_Sub13_Sub1.anInt2723
				|| i_59_ > Class11_Sub10_Sub13_Sub1.anInt2723)
				aBooleanArray2655[i] = true;
			    else
				aBooleanArray2655[i] = false;
			    int i_73_ = ((anIntArray2652[i_54_]
					  + anIntArray2652[i_55_]
					  + anIntArray2652[i_56_]) / 3
					 + anInt2626);
			    anIntArrayArray2653[i_73_][anIntArray2639[i_73_]++]
				= i;
			}
		    }
		}
	    }
	    if (anIntArray2611 == null) {
		for (int i = anInt2619 - 1; i >= 0; i--) {
		    int i_74_ = anIntArray2639[i];
		    if (i_74_ > 0) {
			int[] is = anIntArrayArray2653[i];
			for (int i_75_ = 0; i_75_ < i_74_; i_75_++)
			    method314(is[i_75_]);
		    }
		}
	    } else {
		for (int i = 0; i < 12; i++) {
		    anIntArray2629[i] = 0;
		    anIntArray2647[i] = 0;
		}
		for (int i = anInt2619 - 1; i >= 0; i--) {
		    int i_76_ = anIntArray2639[i];
		    if (i_76_ > 0) {
			int[] is = anIntArrayArray2653[i];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
			    int i_78_ = is[i_77_];
			    int i_79_ = anIntArray2611[i_78_];
			    int i_80_ = anIntArray2629[i_79_]++;
			    anIntArrayArray2650[i_79_][i_80_] = i_78_;
			    if (i_79_ < 10)
				anIntArray2647[i_79_] += i;
			    else if (i_79_ == 10)
				anIntArray2642[i_80_] = i;
			    else
				anIntArray2657[i_80_] = i;
			}
		    }
		}
		int i = 0;
		if (anIntArray2629[1] > 0 || anIntArray2629[2] > 0)
		    i = ((anIntArray2647[1] + anIntArray2647[2])
			 / (anIntArray2629[1] + anIntArray2629[2]));
		int i_81_ = 0;
		if (anIntArray2629[3] > 0 || anIntArray2629[4] > 0)
		    i_81_ = ((anIntArray2647[3] + anIntArray2647[4])
			     / (anIntArray2629[3] + anIntArray2629[4]));
		int i_82_ = 0;
		if (anIntArray2629[6] > 0 || anIntArray2629[8] > 0)
		    i_82_ = ((anIntArray2647[6] + anIntArray2647[8])
			     / (anIntArray2629[6] + anIntArray2629[8]));
		int i_83_ = 0;
		int i_84_ = anIntArray2629[10];
		int[] is = anIntArrayArray2650[10];
		int[] is_85_ = anIntArray2642;
		if (i_83_ == i_84_) {
		    i_83_ = 0;
		    i_84_ = anIntArray2629[11];
		    is = anIntArrayArray2650[11];
		    is_85_ = anIntArray2657;
		}
		int i_86_;
		if (i_83_ < i_84_)
		    i_86_ = is_85_[i_83_];
		else
		    i_86_ = -1000;
		for (int i_87_ = 0; i_87_ < 10; i_87_++) {
		    while (i_87_ == 0) {
			if (i_86_ <= i)
			    break;
			method314(is[i_83_++]);
			if (i_83_ == i_84_ && is != anIntArrayArray2650[11]) {
			    i_83_ = 0;
			    i_84_ = anIntArray2629[11];
			    is = anIntArrayArray2650[11];
			    is_85_ = anIntArray2657;
			}
			if (i_83_ < i_84_)
			    i_86_ = is_85_[i_83_];
			else
			    i_86_ = -1000;
		    }
		    while (i_87_ == 3) {
			if (i_86_ <= i_81_)
			    break;
			method314(is[i_83_++]);
			if (i_83_ == i_84_ && is != anIntArrayArray2650[11]) {
			    i_83_ = 0;
			    i_84_ = anIntArray2629[11];
			    is = anIntArrayArray2650[11];
			    is_85_ = anIntArray2657;
			}
			if (i_83_ < i_84_)
			    i_86_ = is_85_[i_83_];
			else
			    i_86_ = -1000;
		    }
		    while (i_87_ == 5 && i_86_ > i_82_) {
			method314(is[i_83_++]);
			if (i_83_ == i_84_ && is != anIntArrayArray2650[11]) {
			    i_83_ = 0;
			    i_84_ = anIntArray2629[11];
			    is = anIntArrayArray2650[11];
			    is_85_ = anIntArray2657;
			}
			if (i_83_ < i_84_)
			    i_86_ = is_85_[i_83_];
			else
			    i_86_ = -1000;
		    }
		    int i_88_ = anIntArray2629[i_87_];
		    int[] is_89_ = anIntArrayArray2650[i_87_];
		    for (int i_90_ = 0; i_90_ < i_88_; i_90_++)
			method314(is_89_[i_90_]);
		}
		while (i_86_ != -1000) {
		    method314(is[i_83_++]);
		    if (i_83_ == i_84_ && is != anIntArrayArray2650[11]) {
			i_83_ = 0;
			is = anIntArrayArray2650[11];
			i_84_ = anIntArray2629[11];
			is_85_ = anIntArray2657;
		    }
		    if (i_83_ < i_84_)
			i_86_ = is_85_[i_83_];
		    else
			i_86_ = -1000;
		}
	    }
	}
    }
    
    public static int method298(int arg0, int arg1, int arg2) {
	if ((arg2 & 0x2) == 2) {
	    if (arg1 < 0)
		arg1 = 0;
	    else if (arg1 > 127)
		arg1 = 127;
	    arg1 = anIntArray2660[arg1];
	    return arg1;
	}
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public void method299(int arg0, int arg1) {
	for (int i = 0; i < anInt2624; i++) {
	    if (anIntArray2607[i] == arg0)
		anIntArray2607[i] = arg1;
	}
    }
    
    public int method300() {
	method294();
	return anInt2593;
    }
    
    public Class11_Sub10_Sub4_Sub4 method301(boolean arg0) {
	if (!arg0 && anIntArray2628.length < anInt2624)
	    anIntArray2628 = new int[anInt2624 + 100];
	return method321(arg0, aClass11_Sub10_Sub4_Sub4_2625, anIntArray2628);
    }
    
    public void method302() {
	if (anInt2614 != 2) {
	    anInt2614 = 2;
	    anInt2593 = 0;
	    for (int i = 0; i < anInt2618; i++) {
		int i_91_ = anIntArray2597[i];
		int i_92_ = anIntArray2605[i];
		int i_93_ = anIntArray2620[i];
		int i_94_ = i_91_ * i_91_ + i_93_ * i_93_ + i_92_ * i_92_;
		if (i_94_ > anInt2593)
		    anInt2593 = i_94_;
	    }
	    anInt2593 = (int) (Math.sqrt((double) anInt2593) + 0.99);
	    anInt2626 = anInt2593;
	    anInt2619 = anInt2593 + anInt2593;
	}
    }
    
    public void method258(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7, int arg8) {
	if (anInt2614 != 1)
	    method294();
	int i = arg7 * arg4 - arg5 * arg3 >> 16;
	int i_95_ = arg6 * arg1 + i * arg2 >> 16;
	int i_96_ = anInt2593 * arg2 >> 16;
	int i_97_ = i_95_ + i_96_;
	if (i_97_ > 50 && i_95_ < 3500) {
	    int i_98_ = arg7 * arg3 + arg5 * arg4 >> 16;
	    int i_99_ = i_98_ - anInt2593 << 9;
	    if (i_99_ / i_97_ < Class11_Sub10_Sub13_Sub1.anInt2726) {
		int i_100_ = i_98_ + anInt2593 << 9;
		if (i_100_ / i_97_ > Class11_Sub10_Sub13_Sub1.anInt2722) {
		    int i_101_ = arg6 * arg2 - i * arg1 >> 16;
		    int i_102_ = anInt2593 * arg1 >> 16;
		    int i_103_ = i_101_ + i_102_ << 9;
		    if (i_103_ / i_97_ > Class11_Sub10_Sub13_Sub1.anInt2733) {
			int i_104_ = i_102_ + (anInt2046 * arg2 >> 16);
			int i_105_ = i_101_ - i_104_ << 9;
			if (i_105_ / i_97_
			    < Class11_Sub10_Sub13_Sub1.anInt2731) {
			    int i_106_ = i_96_ + (anInt2046 * arg1 >> 16);
			    boolean bool = false;
			    boolean bool_107_ = false;
			    if (i_95_ - i_106_ <= 50)
				bool_107_ = true;
			    boolean bool_108_ = bool_107_ || anInt2616 > 0;
			    boolean bool_109_ = false;
			    if (arg8 > 0 && aBoolean2648) {
				int i_110_ = i_95_ - i_96_;
				if (i_110_ <= 50)
				    i_110_ = 50;
				if (i_98_ > 0) {
				    i_99_ /= i_97_;
				    i_100_ /= i_110_;
				} else {
				    i_100_ /= i_97_;
				    i_99_ /= i_110_;
				}
				if (i_101_ > 0) {
				    i_105_ /= i_97_;
				    i_103_ /= i_110_;
				} else {
				    i_103_ /= i_97_;
				    i_105_ /= i_110_;
				}
				int i_111_
				    = (anInt2656
				       - Class11_Sub10_Sub13_Sub1.anInt2730);
				int i_112_
				    = (anInt2633
				       - Class11_Sub10_Sub13_Sub1.anInt2729);
				if (i_111_ > i_99_ && i_111_ < i_100_
				    && i_112_ > i_105_ && i_112_ < i_103_) {
				    if (aBoolean2623)
					anIntArray2634[anInt2631++] = arg8;
				    else
					bool_109_ = true;
				}
			    }
			    int i_113_ = Class11_Sub10_Sub13_Sub1.anInt2730;
			    int i_114_ = Class11_Sub10_Sub13_Sub1.anInt2729;
			    int i_115_ = 0;
			    int i_116_ = 0;
			    if (arg0 != 0) {
				i_115_ = anIntArray2632[arg0];
				i_116_ = anIntArray2654[arg0];
			    }
			    for (int i_117_ = 0; i_117_ < anInt2618;
				 i_117_++) {
				int i_118_ = anIntArray2597[i_117_];
				int i_119_ = anIntArray2605[i_117_];
				int i_120_ = anIntArray2620[i_117_];
				if (arg0 != 0) {
				    int i_121_
					= (i_120_ * i_115_ + i_118_ * i_116_
					   >> 16);
				    i_120_ = (i_120_ * i_116_ - i_118_ * i_115_
					      >> 16);
				    i_118_ = i_121_;
				}
				i_118_ += arg5;
				i_119_ += arg6;
				i_120_ += arg7;
				int i_122_
				    = i_120_ * arg3 + i_118_ * arg4 >> 16;
				i_120_ = i_120_ * arg4 - i_118_ * arg3 >> 16;
				i_118_ = i_122_;
				i_122_ = i_119_ * arg2 - i_120_ * arg1 >> 16;
				i_120_ = i_119_ * arg1 + i_120_ * arg2 >> 16;
				i_119_ = i_122_;
				anIntArray2652[i_117_] = i_120_ - i_95_;
				if (i_120_ >= 50) {
				    anIntArray2637[i_117_]
					= i_113_ + (i_118_ << 9) / i_120_;
				    anIntArray2636[i_117_]
					= i_114_ + (i_119_ << 9) / i_120_;
				} else {
				    anIntArray2637[i_117_] = -5000;
				    bool = true;
				}
				if (bool_108_) {
				    anIntArray2645[i_117_] = i_118_;
				    anIntArray2646[i_117_] = i_119_;
				    anIntArray2638[i_117_] = i_120_;
				}
			    }
			    try {
				method297(bool, bool_109_, arg8);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method303(int arg0) {
	aClass62Array2606 = null;
	anInt2614 = 0;
	int i = anIntArray2632[arg0];
	int i_123_ = anIntArray2654[arg0];
	for (int i_124_ = 0; i_124_ < anInt2618; i_124_++) {
	    int i_125_
		= (anIntArray2605[i_124_] * i_123_ - anIntArray2620[i_124_] * i
		   >> 16);
	    anIntArray2620[i_124_]
		= (anIntArray2605[i_124_] * i + anIntArray2620[i_124_] * i_123_
		   >> 16);
	    anIntArray2605[i_124_] = i_125_;
	}
    }
    
    public int method304(Class11_Sub10_Sub4_Sub4 arg0, int arg1) {
	int i = -1;
	int i_126_ = arg0.anIntArray2597[arg1];
	int i_127_ = arg0.anIntArray2605[arg1];
	int i_128_ = arg0.anIntArray2620[arg1];
	for (int i_129_ = 0; i_129_ < anInt2618; i_129_++) {
	    if (i_126_ == anIntArray2597[i_129_]
		&& i_127_ == anIntArray2605[i_129_]
		&& i_128_ == anIntArray2620[i_129_]) {
		i = i_129_;
		break;
	    }
	}
	if (i == -1) {
	    anIntArray2597[anInt2618] = i_126_;
	    anIntArray2605[anInt2618] = i_127_;
	    anIntArray2620[anInt2618] = i_128_;
	    if (arg0.anIntArray2599 != null)
		anIntArray2599[anInt2618] = arg0.anIntArray2599[arg1];
	    i = anInt2618++;
	}
	return i;
    }
    
    public void method305() {
	aClass62Array2606 = null;
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++) {
	    int i_130_ = anIntArray2620[i];
	    anIntArray2620[i] = anIntArray2597[i];
	    anIntArray2597[i] = -i_130_;
	}
    }
    
    public Class11_Sub10_Sub4_Sub4 method306(boolean arg0) {
	if (!arg0 && anIntArray2649.length < anInt2624)
	    anIntArray2649 = new int[anInt2624 + 100];
	return method321(arg0, aClass11_Sub10_Sub4_Sub4_2627, anIntArray2649);
    }
    
    public void method307() {
	aClass62Array2606 = null;
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++) {
	    int i_131_ = anIntArray2597[i];
	    anIntArray2597[i] = anIntArray2620[i];
	    anIntArray2620[i] = -i_131_;
	}
    }
    
    public void method308() {
	aClass62Array2606 = null;
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++) {
	    anIntArray2597[i] = -anIntArray2597[i];
	    anIntArray2620[i] = -anIntArray2620[i];
	}
    }
    
    public static void method309() {
	aClass11_Sub10_Sub4_Sub4_2625 = null;
	anIntArray2628 = null;
	aClass11_Sub10_Sub4_Sub4_2627 = null;
	anIntArray2649 = null;
	aBooleanArray2655 = null;
	aBooleanArray2635 = null;
	anIntArray2637 = null;
	anIntArray2636 = null;
	anIntArray2652 = null;
	anIntArray2645 = null;
	anIntArray2646 = null;
	anIntArray2638 = null;
	anIntArray2639 = null;
	anIntArrayArray2653 = null;
	anIntArray2629 = null;
	anIntArrayArray2650 = null;
	anIntArray2642 = null;
	anIntArray2657 = null;
	anIntArray2647 = null;
	anIntArray2641 = null;
	anIntArray2651 = null;
	anIntArray2659 = null;
	anIntArray2634 = null;
	anIntArray2632 = null;
	anIntArray2654 = null;
	anIntArray2640 = null;
	anIntArray2644 = null;
	anIntArray2660 = null;
    }
    
    public void method310(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6) {
	if (anInt2614 != 2 && anInt2614 != 1)
	    method302();
	int i = Class11_Sub10_Sub13_Sub1.anInt2730;
	int i_132_ = Class11_Sub10_Sub13_Sub1.anInt2729;
	int i_133_ = anIntArray2632[arg0];
	int i_134_ = anIntArray2654[arg0];
	int i_135_ = anIntArray2632[arg1];
	int i_136_ = anIntArray2654[arg1];
	int i_137_ = anIntArray2632[arg2];
	int i_138_ = anIntArray2654[arg2];
	int i_139_ = anIntArray2632[arg3];
	int i_140_ = anIntArray2654[arg3];
	int i_141_ = arg5 * i_139_ + arg6 * i_140_ >> 16;
	for (int i_142_ = 0; i_142_ < anInt2618; i_142_++) {
	    int i_143_ = anIntArray2597[i_142_];
	    int i_144_ = anIntArray2605[i_142_];
	    int i_145_ = anIntArray2620[i_142_];
	    if (arg2 != 0) {
		int i_146_ = i_144_ * i_137_ + i_143_ * i_138_ >> 16;
		i_144_ = i_144_ * i_138_ - i_143_ * i_137_ >> 16;
		i_143_ = i_146_;
	    }
	    if (arg0 != 0) {
		int i_147_ = i_144_ * i_134_ - i_145_ * i_133_ >> 16;
		i_145_ = i_144_ * i_133_ + i_145_ * i_134_ >> 16;
		i_144_ = i_147_;
	    }
	    if (arg1 != 0) {
		int i_148_ = i_145_ * i_135_ + i_143_ * i_136_ >> 16;
		i_145_ = i_145_ * i_136_ - i_143_ * i_135_ >> 16;
		i_143_ = i_148_;
	    }
	    i_143_ += arg4;
	    i_144_ += arg5;
	    i_145_ += arg6;
	    int i_149_ = i_144_ * i_140_ - i_145_ * i_139_ >> 16;
	    i_145_ = i_144_ * i_139_ + i_145_ * i_140_ >> 16;
	    i_144_ = i_149_;
	    anIntArray2652[i_142_] = i_145_ - i_141_;
	    anIntArray2637[i_142_] = i + (i_143_ << 9) / i_145_;
	    anIntArray2636[i_142_] = i_132_ + (i_144_ << 9) / i_145_;
	    if (anInt2616 > 0) {
		anIntArray2645[i_142_] = i_143_;
		anIntArray2646[i_142_] = i_144_;
		anIntArray2638[i_142_] = i_145_;
	    }
	}
	try {
	    method297(false, false, 0);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method311(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
	int i = arg1.length;
	if (arg0 == 0) {
	    int i_150_ = 0;
	    anInt2630 = 0;
	    anInt2643 = 0;
	    anInt2658 = 0;
	    for (int i_151_ = 0; i_151_ < i; i_151_++) {
		int i_152_ = arg1[i_151_];
		if (i_152_ < anIntArrayArray2604.length) {
		    int[] is = anIntArrayArray2604[i_152_];
		    for (int i_153_ = 0; i_153_ < is.length; i_153_++) {
			int i_154_ = is[i_153_];
			anInt2630 += anIntArray2597[i_154_];
			anInt2643 += anIntArray2605[i_154_];
			anInt2658 += anIntArray2620[i_154_];
			i_150_++;
		    }
		}
	    }
	    if (i_150_ > 0) {
		anInt2630 = anInt2630 / i_150_ + arg2;
		anInt2643 = anInt2643 / i_150_ + arg3;
		anInt2658 = anInt2658 / i_150_ + arg4;
	    } else {
		anInt2630 = arg2;
		anInt2643 = arg3;
		anInt2658 = arg4;
	    }
	} else if (arg0 == 1) {
	    for (int i_155_ = 0; i_155_ < i; i_155_++) {
		int i_156_ = arg1[i_155_];
		if (i_156_ < anIntArrayArray2604.length) {
		    int[] is = anIntArrayArray2604[i_156_];
		    for (int i_157_ = 0; i_157_ < is.length; i_157_++) {
			int i_158_ = is[i_157_];
			anIntArray2597[i_158_] += arg2;
			anIntArray2605[i_158_] += arg3;
			anIntArray2620[i_158_] += arg4;
		    }
		}
	    }
	} else if (arg0 == 2) {
	    for (int i_159_ = 0; i_159_ < i; i_159_++) {
		int i_160_ = arg1[i_159_];
		if (i_160_ < anIntArrayArray2604.length) {
		    int[] is = anIntArrayArray2604[i_160_];
		    for (int i_161_ = 0; i_161_ < is.length; i_161_++) {
			int i_162_ = is[i_161_];
			anIntArray2597[i_162_] -= anInt2630;
			anIntArray2605[i_162_] -= anInt2643;
			anIntArray2620[i_162_] -= anInt2658;
			int i_163_ = (arg2 & 0xff) * 8;
			int i_164_ = (arg3 & 0xff) * 8;
			int i_165_ = (arg4 & 0xff) * 8;
			if (i_165_ != 0) {
			    int i_166_ = anIntArray2632[i_165_];
			    int i_167_ = anIntArray2654[i_165_];
			    int i_168_ = ((anIntArray2605[i_162_] * i_166_
					   + anIntArray2597[i_162_] * i_167_)
					  >> 16);
			    anIntArray2605[i_162_]
				= (anIntArray2605[i_162_] * i_167_
				   - anIntArray2597[i_162_] * i_166_) >> 16;
			    anIntArray2597[i_162_] = i_168_;
			}
			if (i_163_ != 0) {
			    int i_169_ = anIntArray2632[i_163_];
			    int i_170_ = anIntArray2654[i_163_];
			    int i_171_ = ((anIntArray2605[i_162_] * i_170_
					   - anIntArray2620[i_162_] * i_169_)
					  >> 16);
			    anIntArray2620[i_162_]
				= (anIntArray2605[i_162_] * i_169_
				   + anIntArray2620[i_162_] * i_170_) >> 16;
			    anIntArray2605[i_162_] = i_171_;
			}
			if (i_164_ != 0) {
			    int i_172_ = anIntArray2632[i_164_];
			    int i_173_ = anIntArray2654[i_164_];
			    int i_174_ = ((anIntArray2620[i_162_] * i_172_
					   + anIntArray2597[i_162_] * i_173_)
					  >> 16);
			    anIntArray2620[i_162_]
				= (anIntArray2620[i_162_] * i_173_
				   - anIntArray2597[i_162_] * i_172_) >> 16;
			    anIntArray2597[i_162_] = i_174_;
			}
			anIntArray2597[i_162_] += anInt2630;
			anIntArray2605[i_162_] += anInt2643;
			anIntArray2620[i_162_] += anInt2658;
		    }
		}
	    }
	} else if (arg0 == 3) {
	    for (int i_175_ = 0; i_175_ < i; i_175_++) {
		int i_176_ = arg1[i_175_];
		if (i_176_ < anIntArrayArray2604.length) {
		    int[] is = anIntArrayArray2604[i_176_];
		    for (int i_177_ = 0; i_177_ < is.length; i_177_++) {
			int i_178_ = is[i_177_];
			anIntArray2597[i_178_] -= anInt2630;
			anIntArray2605[i_178_] -= anInt2643;
			anIntArray2620[i_178_] -= anInt2658;
			anIntArray2597[i_178_]
			    = anIntArray2597[i_178_] * arg2 / 128;
			anIntArray2605[i_178_]
			    = anIntArray2605[i_178_] * arg3 / 128;
			anIntArray2620[i_178_]
			    = anIntArray2620[i_178_] * arg4 / 128;
			anIntArray2597[i_178_] += anInt2630;
			anIntArray2605[i_178_] += anInt2643;
			anIntArray2620[i_178_] += anInt2658;
		    }
		}
	    }
	} else if (arg0 == 5 && anIntArrayArray2615 != null
		   && anIntArray2598 != null) {
	    for (int i_179_ = 0; i_179_ < i; i_179_++) {
		int i_180_ = arg1[i_179_];
		if (i_180_ < anIntArrayArray2615.length) {
		    int[] is = anIntArrayArray2615[i_180_];
		    for (int i_181_ = 0; i_181_ < is.length; i_181_++) {
			int i_182_ = is[i_181_];
			anIntArray2598[i_182_] += arg2 * 8;
			if (anIntArray2598[i_182_] < 0)
			    anIntArray2598[i_182_] = 0;
			if (anIntArray2598[i_182_] > 255)
			    anIntArray2598[i_182_] = 255;
		    }
		}
	    }
	}
    }
    
    public void method312(int arg0, int arg1, int arg2, int arg3, int arg4,
			  boolean arg5) {
	int i = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3
					  + arg4 * arg4));
	int i_183_ = arg1 * i >> 8;
	if (anIntArray2622 == null) {
	    anIntArray2622 = new int[anInt2624];
	    anIntArray2596 = new int[anInt2624];
	    anIntArray2594 = new int[anInt2624];
	}
	if (aClass62Array2606 == null) {
	    aClass62Array2606 = new Class62[anInt2618];
	    for (int i_184_ = 0; i_184_ < anInt2618; i_184_++)
		aClass62Array2606[i_184_] = new Class62();
	}
	for (int i_185_ = 0; i_185_ < anInt2624; i_185_++) {
	    int i_186_ = anIntArray2610[i_185_];
	    int i_187_ = anIntArray2609[i_185_];
	    int i_188_ = anIntArray2595[i_185_];
	    int i_189_ = anIntArray2597[i_187_] - anIntArray2597[i_186_];
	    int i_190_ = anIntArray2605[i_187_] - anIntArray2605[i_186_];
	    int i_191_ = anIntArray2620[i_187_] - anIntArray2620[i_186_];
	    int i_192_ = anIntArray2597[i_188_] - anIntArray2597[i_186_];
	    int i_193_ = anIntArray2605[i_188_] - anIntArray2605[i_186_];
	    int i_194_ = anIntArray2620[i_188_] - anIntArray2620[i_186_];
	    int i_195_ = i_190_ * i_194_ - i_193_ * i_191_;
	    int i_196_ = i_191_ * i_192_ - i_194_ * i_189_;
	    int i_197_;
	    for (i_197_ = i_189_ * i_193_ - i_192_ * i_190_;
		 (i_195_ > 8192 || i_196_ > 8192 || i_197_ > 8192
		  || i_195_ < -8192 || i_196_ < -8192 || i_197_ < -8192);
		 i_197_ >>= 1) {
		i_195_ >>= 1;
		i_196_ >>= 1;
	    }
	    int i_198_
		= (int) Math.sqrt((double) (i_195_ * i_195_ + i_196_ * i_196_
					    + i_197_ * i_197_));
	    if (i_198_ <= 0)
		i_198_ = 1;
	    i_195_ = i_195_ * 256 / i_198_;
	    i_196_ = i_196_ * 256 / i_198_;
	    i_197_ = i_197_ * 256 / i_198_;
	    if (anIntArray2613 == null
		|| (anIntArray2613[i_185_] & 0x1) == 0) {
		Class62 class62 = aClass62Array2606[i_186_];
		class62.anInt1296 += i_195_;
		class62.anInt1294 += i_196_;
		class62.anInt1289 += i_197_;
		class62.anInt1287++;
		class62 = aClass62Array2606[i_187_];
		class62.anInt1296 += i_195_;
		class62.anInt1294 += i_196_;
		class62.anInt1289 += i_197_;
		class62.anInt1287++;
		class62 = aClass62Array2606[i_188_];
		class62.anInt1296 += i_195_;
		class62.anInt1294 += i_196_;
		class62.anInt1289 += i_197_;
		class62.anInt1287++;
	    } else {
		int i_199_ = arg0 + (arg2 * i_195_ + arg3 * i_196_
				     + arg4 * i_197_) / (i_183_ + i_183_ / 2);
		anIntArray2622[i_185_]
		    = method298(anIntArray2607[i_185_], i_199_,
				anIntArray2613[i_185_]);
	    }
	}
	if (arg5)
	    method320(arg0, i_183_, arg2, arg3, arg4);
	else {
	    aClass62Array2608 = new Class62[anInt2618];
	    for (int i_200_ = 0; i_200_ < anInt2618; i_200_++) {
		Class62 class62 = aClass62Array2606[i_200_];
		Class62 class62_201_
		    = aClass62Array2608[i_200_] = new Class62();
		class62_201_.anInt1296 = class62.anInt1296;
		class62_201_.anInt1294 = class62.anInt1294;
		class62_201_.anInt1289 = class62.anInt1289;
		class62_201_.anInt1287 = class62.anInt1287;
	    }
	    anInt2603 = (arg0 << 16) + (i_183_ & 0xffff);
	}
    }
    
    public void method313() {
	if (anInt2614 != 3) {
	    anInt2614 = 3;
	    anInt2046 = 0;
	    anInt2602 = 0;
	    anInt2593 = 999999;
	    anInt2619 = -999999;
	    anInt2626 = -99999;
	    anInt2600 = 99999;
	    for (int i = 0; i < anInt2618; i++) {
		int i_202_ = anIntArray2597[i];
		int i_203_ = anIntArray2605[i];
		int i_204_ = anIntArray2620[i];
		if (i_202_ < anInt2593)
		    anInt2593 = i_202_;
		if (i_202_ > anInt2619)
		    anInt2619 = i_202_;
		if (i_204_ < anInt2600)
		    anInt2600 = i_204_;
		if (i_204_ > anInt2626)
		    anInt2626 = i_204_;
		if (-i_203_ > anInt2046)
		    anInt2046 = -i_203_;
		if (i_203_ > anInt2602)
		    anInt2602 = i_203_;
	    }
	}
    }
    
    public void method314(int arg0) {
	if (aBooleanArray2635[arg0])
	    method292(arg0);
	else {
	    int i = anIntArray2610[arg0];
	    int i_205_ = anIntArray2609[arg0];
	    int i_206_ = anIntArray2595[arg0];
	    Class11_Sub10_Sub13_Sub1.aBoolean2732 = aBooleanArray2655[arg0];
	    if (anIntArray2598 == null)
		Class11_Sub10_Sub13_Sub1.anInt2734 = 0;
	    else
		Class11_Sub10_Sub13_Sub1.anInt2734 = anIntArray2598[arg0];
	    int i_207_;
	    if (anIntArray2613 == null)
		i_207_ = 0;
	    else
		i_207_ = anIntArray2613[arg0] & 0x3;
	    if (i_207_ == 0)
		Class11_Sub10_Sub13_Sub1.method414(anIntArray2636[i],
						   anIntArray2636[i_205_],
						   anIntArray2636[i_206_],
						   anIntArray2637[i],
						   anIntArray2637[i_205_],
						   anIntArray2637[i_206_],
						   anIntArray2622[arg0],
						   anIntArray2596[arg0],
						   anIntArray2594[arg0]);
	    else if (i_207_ == 1)
		Class11_Sub10_Sub13_Sub1.method416(anIntArray2636[i],
						   anIntArray2636[i_205_],
						   anIntArray2636[i_206_],
						   anIntArray2637[i],
						   anIntArray2637[i_205_],
						   anIntArray2637[i_206_],
						   (anIntArray2640
						    [anIntArray2622[arg0]]));
	    else if (i_207_ == 2) {
		int i_208_ = anIntArray2613[arg0] >> 2;
		int i_209_ = anIntArray2617[i_208_];
		int i_210_ = anIntArray2612[i_208_];
		int i_211_ = anIntArray2592[i_208_];
		Class11_Sub10_Sub13_Sub1.method418
		    (anIntArray2636[i], anIntArray2636[i_205_],
		     anIntArray2636[i_206_], anIntArray2637[i],
		     anIntArray2637[i_205_], anIntArray2637[i_206_],
		     anIntArray2622[arg0], anIntArray2596[arg0],
		     anIntArray2594[arg0], anIntArray2645[i_209_],
		     anIntArray2645[i_210_], anIntArray2645[i_211_],
		     anIntArray2646[i_209_], anIntArray2646[i_210_],
		     anIntArray2646[i_211_], anIntArray2638[i_209_],
		     anIntArray2638[i_210_], anIntArray2638[i_211_],
		     anIntArray2607[arg0]);
	    } else if (i_207_ == 3) {
		int i_212_ = anIntArray2613[arg0] >> 2;
		int i_213_ = anIntArray2617[i_212_];
		int i_214_ = anIntArray2612[i_212_];
		int i_215_ = anIntArray2592[i_212_];
		Class11_Sub10_Sub13_Sub1.method418
		    (anIntArray2636[i], anIntArray2636[i_205_],
		     anIntArray2636[i_206_], anIntArray2637[i],
		     anIntArray2637[i_205_], anIntArray2637[i_206_],
		     anIntArray2622[arg0], anIntArray2622[arg0],
		     anIntArray2622[arg0], anIntArray2645[i_213_],
		     anIntArray2645[i_214_], anIntArray2645[i_215_],
		     anIntArray2646[i_213_], anIntArray2646[i_214_],
		     anIntArray2646[i_215_], anIntArray2638[i_213_],
		     anIntArray2638[i_214_], anIntArray2638[i_215_],
		     anIntArray2607[arg0]);
	    }
	}
    }
    
    public void method315(int arg0, int arg1, int arg2) {
	aClass62Array2606 = null;
	anInt2614 = 0;
	for (int i = 0; i < anInt2618; i++) {
	    anIntArray2597[i] = anIntArray2597[i] * arg0 / 128;
	    anIntArray2605[i] = anIntArray2605[i] * arg1 / 128;
	    anIntArray2620[i] = anIntArray2620[i] * arg2 / 128;
	}
    }
    
    public boolean method316(int arg0, int arg1, int arg2, int arg3, int arg4,
			     int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	return true;
    }
    
    public void method317(int arg0, int arg1, int arg2) {
	int i = anInt2603 >> 16;
	int i_216_ = anInt2603 << 16 >> 16;
	method320(i, i_216_, arg0, arg1, arg2);
    }
    
    public void method318(Class11_Sub10_Sub6 arg0, int arg1,
			  Class11_Sub10_Sub6 arg2, int arg3, int[] arg4) {
	if (arg1 != -1) {
	    if (arg4 == null || arg3 == -1)
		method293(arg0, arg1);
	    else {
		aClass62Array2606 = null;
		anInt2614 = 0;
		Class18 class18 = arg0.aClass18Array2140[arg1];
		Class18 class18_217_ = arg2.aClass18Array2140[arg3];
		Class11_Sub6 class11_sub6 = class18.aClass11_Sub6_352;
		anInt2630 = 0;
		anInt2643 = 0;
		anInt2658 = 0;
		int i = 0;
		int i_218_ = arg4[i++];
		for (int i_219_ = 0; i_219_ < class18.anInt356; i_219_++) {
		    int i_220_;
		    for (i_220_ = class18.anIntArray346[i_219_];
			 i_220_ > i_218_; i_218_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_220_ != i_218_
			|| class11_sub6.anIntArray1580[i_220_] == 0)
			method311(class11_sub6.anIntArray1580[i_220_],
				  class11_sub6.anIntArrayArray1592[i_220_],
				  class18.anIntArray351[i_219_],
				  class18.anIntArray350[i_219_],
				  class18.anIntArray349[i_219_]);
		}
		anInt2630 = 0;
		anInt2643 = 0;
		anInt2658 = 0;
		i = 0;
		i_218_ = arg4[i++];
		for (int i_221_ = 0; i_221_ < class18_217_.anInt356;
		     i_221_++) {
		    int i_222_;
		    for (i_222_ = class18_217_.anIntArray346[i_221_];
			 i_222_ > i_218_; i_218_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_222_ == i_218_
			|| class11_sub6.anIntArray1580[i_222_] == 0)
			method311(class11_sub6.anIntArray1580[i_222_],
				  class11_sub6.anIntArrayArray1592[i_222_],
				  class18_217_.anIntArray351[i_221_],
				  class18_217_.anIntArray350[i_221_],
				  class18_217_.anIntArray349[i_221_]);
		}
	    }
	}
    }
    
    public void method319() {
	if (anIntArray2599 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_223_ = 0; i_223_ < anInt2618; i_223_++) {
		int i_224_ = anIntArray2599[i_223_];
		is[i_224_]++;
		if (i_224_ > i)
		    i = i_224_;
	    }
	    anIntArrayArray2604 = new int[i + 1][];
	    for (int i_225_ = 0; i_225_ <= i; i_225_++) {
		anIntArrayArray2604[i_225_] = new int[is[i_225_]];
		is[i_225_] = 0;
	    }
	    for (int i_226_ = 0; i_226_ < anInt2618; i_226_++) {
		int i_227_ = anIntArray2599[i_226_];
		anIntArrayArray2604[i_227_][is[i_227_]++] = i_226_;
	    }
	    anIntArray2599 = null;
	}
	if (anIntArray2621 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_228_ = 0; i_228_ < anInt2624; i_228_++) {
		int i_229_ = anIntArray2621[i_228_];
		is[i_229_]++;
		if (i_229_ > i)
		    i = i_229_;
	    }
	    anIntArrayArray2615 = new int[i + 1][];
	    for (int i_230_ = 0; i_230_ <= i; i_230_++) {
		anIntArrayArray2615[i_230_] = new int[is[i_230_]];
		is[i_230_] = 0;
	    }
	    for (int i_231_ = 0; i_231_ < anInt2624; i_231_++) {
		int i_232_ = anIntArray2621[i_231_];
		anIntArrayArray2615[i_232_][is[i_232_]++] = i_231_;
	    }
	    anIntArray2621 = null;
	}
    }
    
    public void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
	for (int i = 0; i < anInt2624; i++) {
	    int i_233_ = anIntArray2610[i];
	    int i_234_ = anIntArray2609[i];
	    int i_235_ = anIntArray2595[i];
	    if (anIntArray2613 == null) {
		int i_236_ = anIntArray2607[i];
		Class62 class62 = aClass62Array2606[i_233_];
		int i_237_ = arg0 + ((arg2 * class62.anInt1296
				      + arg3 * class62.anInt1294
				      + arg4 * class62.anInt1289)
				     / (arg1 * class62.anInt1287));
		anIntArray2622[i] = method298(i_236_, i_237_, 0);
		class62 = aClass62Array2606[i_234_];
		i_237_ = arg0 + ((arg2 * class62.anInt1296
				  + arg3 * class62.anInt1294
				  + arg4 * class62.anInt1289)
				 / (arg1 * class62.anInt1287));
		anIntArray2596[i] = method298(i_236_, i_237_, 0);
		class62 = aClass62Array2606[i_235_];
		i_237_ = arg0 + ((arg2 * class62.anInt1296
				  + arg3 * class62.anInt1294
				  + arg4 * class62.anInt1289)
				 / (arg1 * class62.anInt1287));
		anIntArray2594[i] = method298(i_236_, i_237_, 0);
	    } else if ((anIntArray2613[i] & 0x1) == 0) {
		int i_238_ = anIntArray2607[i];
		int i_239_ = anIntArray2613[i];
		Class62 class62 = aClass62Array2606[i_233_];
		int i_240_ = arg0 + ((arg2 * class62.anInt1296
				      + arg3 * class62.anInt1294
				      + arg4 * class62.anInt1289)
				     / (arg1 * class62.anInt1287));
		anIntArray2622[i] = method298(i_238_, i_240_, i_239_);
		class62 = aClass62Array2606[i_234_];
		i_240_ = arg0 + ((arg2 * class62.anInt1296
				  + arg3 * class62.anInt1294
				  + arg4 * class62.anInt1289)
				 / (arg1 * class62.anInt1287));
		anIntArray2596[i] = method298(i_238_, i_240_, i_239_);
		class62 = aClass62Array2606[i_235_];
		i_240_ = arg0 + ((arg2 * class62.anInt1296
				  + arg3 * class62.anInt1294
				  + arg4 * class62.anInt1289)
				 / (arg1 * class62.anInt1287));
		anIntArray2594[i] = method298(i_238_, i_240_, i_239_);
	    }
	}
	aClass62Array2606 = null;
	aClass62Array2608 = null;
	anIntArray2599 = null;
	anIntArray2621 = null;
	if (anIntArray2613 != null) {
	    for (int i = 0; i < anInt2624; i++) {
		if ((anIntArray2613[i] & 0x2) == 2)
		    return;
	    }
	}
	anIntArray2607 = null;
    }
    
    public Class11_Sub10_Sub4_Sub4 method321
	(boolean arg0, Class11_Sub10_Sub4_Sub4 arg1, int[] arg2) {
	arg1.anInt2618 = anInt2618;
	arg1.anInt2624 = anInt2624;
	arg1.anInt2616 = anInt2616;
	if (arg1.anIntArray2597 == null
	    || arg1.anIntArray2597.length < anInt2618) {
	    arg1.anIntArray2597 = new int[anInt2618 + 100];
	    arg1.anIntArray2605 = new int[anInt2618 + 100];
	    arg1.anIntArray2620 = new int[anInt2618 + 100];
	}
	for (int i = 0; i < anInt2618; i++) {
	    arg1.anIntArray2597[i] = anIntArray2597[i];
	    arg1.anIntArray2605[i] = anIntArray2605[i];
	    arg1.anIntArray2620[i] = anIntArray2620[i];
	}
	if (arg0)
	    arg1.anIntArray2598 = anIntArray2598;
	else {
	    arg1.anIntArray2598 = arg2;
	    if (anIntArray2598 == null) {
		for (int i = 0; i < anInt2624; i++)
		    arg1.anIntArray2598[i] = 0;
	    } else {
		for (int i = 0; i < anInt2624; i++)
		    arg1.anIntArray2598[i] = anIntArray2598[i];
	    }
	}
	arg1.anIntArray2613 = anIntArray2613;
	arg1.anIntArray2607 = anIntArray2607;
	arg1.anIntArray2611 = anIntArray2611;
	arg1.anInt2601 = anInt2601;
	arg1.anIntArrayArray2615 = anIntArrayArray2615;
	arg1.anIntArrayArray2604 = anIntArrayArray2604;
	arg1.anIntArray2610 = anIntArray2610;
	arg1.anIntArray2609 = anIntArray2609;
	arg1.anIntArray2595 = anIntArray2595;
	arg1.anIntArray2622 = anIntArray2622;
	arg1.anIntArray2596 = anIntArray2596;
	arg1.anIntArray2594 = anIntArray2594;
	arg1.anIntArray2617 = anIntArray2617;
	arg1.anIntArray2612 = anIntArray2612;
	arg1.anIntArray2592 = anIntArray2592;
	arg1.anInt2614 = 0;
	return arg1;
    }
    
    public static Class11_Sub10_Sub4_Sub4 method322(Class55 arg0, int arg1,
						    int arg2) {
	byte[] is = arg0.method887((byte) -124, arg2, arg1);
	if (is == null)
	    return null;
	return new Class11_Sub10_Sub4_Sub4(is);
    }
    
    public Class11_Sub10_Sub4_Sub4(byte[] arg0) {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
	Buffer buffer = new Buffer(arg0);
	Buffer buffer_241_ = new Buffer(arg0);
	Buffer buffer_242_ = new Buffer(arg0);
	Buffer buffer_243_ = new Buffer(arg0);
	Buffer buffer_244_ = new Buffer(arg0);
	buffer.position = arg0.length - 18;
	int i = buffer.method164();
	int i_245_ = buffer.method164();
	int i_246_ = buffer.method168(255);
	int i_247_ = buffer.method168(255);
	int i_248_ = buffer.method168(255);
	int i_249_ = buffer.method168(255);
	int i_250_ = buffer.method168(255);
	int i_251_ = buffer.method168(255);
	int i_252_ = buffer.method164();
	int i_253_ = buffer.method164();
	int i_254_ = buffer.method164();
	int i_255_ = buffer.method164();
	int i_256_ = 0;
	int i_257_ = i_256_;
	i_256_ += i;
	int i_258_ = i_256_;
	i_256_ += i_245_;
	int i_259_ = i_256_;
	if (i_248_ == 255)
	    i_256_ += i_245_;
	else
	    i_259_ = -i_248_ - 1;
	int i_260_ = i_256_;
	if (i_250_ == 1)
	    i_256_ += i_245_;
	else
	    i_260_ = -1;
	int i_261_ = i_256_;
	if (i_247_ == 1)
	    i_256_ += i_245_;
	else
	    i_261_ = -1;
	int i_262_ = i_256_;
	if (i_251_ == 1)
	    i_256_ += i;
	else
	    i_262_ = -1;
	int i_263_ = i_256_;
	if (i_249_ == 1)
	    i_256_ += i_245_;
	else
	    i_263_ = -1;
	int i_264_ = i_256_;
	i_256_ += i_255_;
	int i_265_ = i_256_;
	i_256_ += i_245_ * 2;
	int i_266_ = i_256_;
	i_256_ += i_246_ * 6;
	int i_267_ = i_256_;
	i_256_ += i_252_;
	int i_268_ = i_256_;
	i_256_ += i_253_;
	int i_269_ = i_256_;
	i_256_ += i_254_;
	anInt2618 = i;
	anInt2624 = i_245_;
	anInt2616 = i_246_;
	anIntArray2597 = new int[i];
	anIntArray2605 = new int[i];
	anIntArray2620 = new int[i];
	anIntArray2610 = new int[i_245_];
	anIntArray2609 = new int[i_245_];
	anIntArray2595 = new int[i_245_];
	anIntArray2617 = new int[i_246_];
	anIntArray2612 = new int[i_246_];
	anIntArray2592 = new int[i_246_];
	if (i_262_ >= 0)
	    anIntArray2599 = new int[i];
	if (i_261_ >= 0)
	    anIntArray2613 = new int[i_245_];
	if (i_259_ >= 0)
	    anIntArray2611 = new int[i_245_];
	else
	    anInt2601 = -i_259_ - 1;
	if (i_263_ >= 0)
	    anIntArray2598 = new int[i_245_];
	if (i_260_ >= 0)
	    anIntArray2621 = new int[i_245_];
	anIntArray2607 = new int[i_245_];
	buffer.position = i_257_;
	buffer_241_.position = i_267_;
	buffer_242_.position = i_268_;
	buffer_243_.position = i_269_;
	buffer_244_.position = i_262_;
	int i_270_ = 0;
	int i_271_ = 0;
	int i_272_ = 0;
	for (int i_273_ = 0; i_273_ < i; i_273_++) {
	    int i_274_ = buffer.method168(255);
	    int i_275_ = 0;
	    if ((i_274_ & 0x1) != 0)
		i_275_ = buffer_241_.method159((byte) 121);
	    int i_276_ = 0;
	    if ((i_274_ & 0x2) != 0)
		i_276_ = buffer_242_.method159((byte) 19);
	    int i_277_ = 0;
	    if ((i_274_ & 0x4) != 0)
		i_277_ = buffer_243_.method159((byte) 107);
	    anIntArray2597[i_273_] = i_270_ + i_275_;
	    anIntArray2605[i_273_] = i_271_ + i_276_;
	    anIntArray2620[i_273_] = i_272_ + i_277_;
	    i_270_ = anIntArray2597[i_273_];
	    i_271_ = anIntArray2605[i_273_];
	    i_272_ = anIntArray2620[i_273_];
	    if (anIntArray2599 != null)
		anIntArray2599[i_273_] = buffer_244_.method168(255);
	}
	buffer.position = i_265_;
	buffer_241_.position = i_261_;
	buffer_242_.position = i_259_;
	buffer_243_.position = i_263_;
	buffer_244_.position = i_260_;
	for (int i_278_ = 0; i_278_ < i_245_; i_278_++) {
	    anIntArray2607[i_278_] = buffer.method164();
	    if (anIntArray2613 != null)
		anIntArray2613[i_278_] = buffer_241_.method168(255);
	    if (anIntArray2611 != null)
		anIntArray2611[i_278_] = buffer_242_.method168(255);
	    if (anIntArray2598 != null)
		anIntArray2598[i_278_] = buffer_243_.method168(255);
	    if (anIntArray2621 != null)
		anIntArray2621[i_278_] = buffer_244_.method168(255);
	}
	buffer.position = i_264_;
	buffer_241_.position = i_258_;
	int i_279_ = 0;
	int i_280_ = 0;
	int i_281_ = 0;
	int i_282_ = 0;
	for (int i_283_ = 0; i_283_ < i_245_; i_283_++) {
	    int i_284_ = buffer_241_.method168(255);
	    if (i_284_ == 1) {
		i_279_ = buffer.method159((byte) 83) + i_282_;
		i_282_ = i_279_;
		i_280_ = buffer.method159((byte) 86) + i_282_;
		i_282_ = i_280_;
		i_281_ = buffer.method159((byte) 116) + i_282_;
		i_282_ = i_281_;
		anIntArray2610[i_283_] = i_279_;
		anIntArray2609[i_283_] = i_280_;
		anIntArray2595[i_283_] = i_281_;
	    }
	    if (i_284_ == 2) {
		i_280_ = i_281_;
		i_281_ = buffer.method159((byte) 125) + i_282_;
		i_282_ = i_281_;
		anIntArray2610[i_283_] = i_279_;
		anIntArray2609[i_283_] = i_280_;
		anIntArray2595[i_283_] = i_281_;
	    }
	    if (i_284_ == 3) {
		i_279_ = i_281_;
		i_281_ = buffer.method159((byte) 122) + i_282_;
		i_282_ = i_281_;
		anIntArray2610[i_283_] = i_279_;
		anIntArray2609[i_283_] = i_280_;
		anIntArray2595[i_283_] = i_281_;
	    }
	    if (i_284_ == 4) {
		int i_285_ = i_279_;
		i_279_ = i_280_;
		i_280_ = i_285_;
		i_281_ = buffer.method159((byte) 63) + i_282_;
		i_282_ = i_281_;
		anIntArray2610[i_283_] = i_279_;
		anIntArray2609[i_283_] = i_280_;
		anIntArray2595[i_283_] = i_281_;
	    }
	}
	buffer.position = i_266_;
	for (int i_286_ = 0; i_286_ < i_246_; i_286_++) {
	    anIntArray2617[i_286_] = buffer.method164();
	    anIntArray2612[i_286_] = buffer.method164();
	    anIntArray2592[i_286_] = buffer.method164();
	}
    }
    
    public Class11_Sub10_Sub4_Sub4() {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
    }
    
    public Class11_Sub10_Sub4_Sub4(Class11_Sub10_Sub4_Sub4[] arg0, int arg1) {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
	boolean bool = false;
	boolean bool_287_ = false;
	boolean bool_288_ = false;
	boolean bool_289_ = false;
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2616 = 0;
	anInt2601 = -1;
	for (int i = 0; i < arg1; i++) {
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = arg0[i];
	    if (class11_sub10_sub4_sub4 != null) {
		anInt2618 += class11_sub10_sub4_sub4.anInt2618;
		anInt2624 += class11_sub10_sub4_sub4.anInt2624;
		anInt2616 += class11_sub10_sub4_sub4.anInt2616;
		bool = bool | class11_sub10_sub4_sub4.anIntArray2613 != null;
		if (class11_sub10_sub4_sub4.anIntArray2611 != null)
		    bool_287_ = true;
		else {
		    if (anInt2601 == -1)
			anInt2601 = class11_sub10_sub4_sub4.anInt2601;
		    if (anInt2601 != class11_sub10_sub4_sub4.anInt2601)
			bool_287_ = true;
		}
		bool_288_ = (bool_288_
			     | class11_sub10_sub4_sub4.anIntArray2598 != null);
		bool_289_ = (bool_289_
			     | class11_sub10_sub4_sub4.anIntArray2621 != null);
	    }
	}
	anIntArray2597 = new int[anInt2618];
	anIntArray2605 = new int[anInt2618];
	anIntArray2620 = new int[anInt2618];
	anIntArray2599 = new int[anInt2618];
	anIntArray2610 = new int[anInt2624];
	anIntArray2609 = new int[anInt2624];
	anIntArray2595 = new int[anInt2624];
	anIntArray2617 = new int[anInt2616];
	anIntArray2612 = new int[anInt2616];
	anIntArray2592 = new int[anInt2616];
	if (bool)
	    anIntArray2613 = new int[anInt2624];
	if (bool_287_)
	    anIntArray2611 = new int[anInt2624];
	if (bool_288_)
	    anIntArray2598 = new int[anInt2624];
	if (bool_289_)
	    anIntArray2621 = new int[anInt2624];
	anIntArray2607 = new int[anInt2624];
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2616 = 0;
	int i = 0;
	for (int i_290_ = 0; i_290_ < arg1; i_290_++) {
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = arg0[i_290_];
	    if (class11_sub10_sub4_sub4 != null) {
		for (int i_291_ = 0;
		     i_291_ < class11_sub10_sub4_sub4.anInt2624; i_291_++) {
		    if (bool) {
			if (class11_sub10_sub4_sub4.anIntArray2613 == null)
			    anIntArray2613[anInt2624] = 0;
			else {
			    int i_292_ = (class11_sub10_sub4_sub4
					  .anIntArray2613[i_291_]);
			    if ((i_292_ & 0x2) == 2)
				i_292_ += i << 2;
			    anIntArray2613[anInt2624] = i_292_;
			}
		    }
		    if (bool_287_) {
			if (class11_sub10_sub4_sub4.anIntArray2611 == null)
			    anIntArray2611[anInt2624]
				= class11_sub10_sub4_sub4.anInt2601;
			else
			    anIntArray2611[anInt2624]
				= (class11_sub10_sub4_sub4.anIntArray2611
				   [i_291_]);
		    }
		    if (bool_288_) {
			if (class11_sub10_sub4_sub4.anIntArray2598 == null)
			    anIntArray2598[anInt2624] = 0;
			else
			    anIntArray2598[anInt2624]
				= (class11_sub10_sub4_sub4.anIntArray2598
				   [i_291_]);
		    }
		    if (bool_289_
			&& class11_sub10_sub4_sub4.anIntArray2621 != null)
			anIntArray2621[anInt2624]
			    = class11_sub10_sub4_sub4.anIntArray2621[i_291_];
		    anIntArray2607[anInt2624]
			= class11_sub10_sub4_sub4.anIntArray2607[i_291_];
		    anIntArray2610[anInt2624]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2610
				     [i_291_]));
		    anIntArray2609[anInt2624]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2609
				     [i_291_]));
		    anIntArray2595[anInt2624]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2595
				     [i_291_]));
		    anInt2624++;
		}
		for (int i_293_ = 0;
		     i_293_ < class11_sub10_sub4_sub4.anInt2616; i_293_++) {
		    anIntArray2617[anInt2616]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2617
				     [i_293_]));
		    anIntArray2612[anInt2616]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2612
				     [i_293_]));
		    anIntArray2592[anInt2616]
			= method304(class11_sub10_sub4_sub4,
				    (class11_sub10_sub4_sub4.anIntArray2592
				     [i_293_]));
		    anInt2616++;
		}
		i += class11_sub10_sub4_sub4.anInt2616;
	    }
	}
    }
    
    public Class11_Sub10_Sub4_Sub4(Class11_Sub10_Sub4_Sub4[] arg0, int arg1,
				   boolean arg2) {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
	boolean bool = false;
	boolean bool_294_ = false;
	boolean bool_295_ = false;
	boolean bool_296_ = false;
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2616 = 0;
	anInt2601 = -1;
	for (int i = 0; i < arg1; i++) {
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = arg0[i];
	    if (class11_sub10_sub4_sub4 != null) {
		anInt2618 += class11_sub10_sub4_sub4.anInt2618;
		anInt2624 += class11_sub10_sub4_sub4.anInt2624;
		anInt2616 += class11_sub10_sub4_sub4.anInt2616;
		bool = bool | class11_sub10_sub4_sub4.anIntArray2613 != null;
		if (class11_sub10_sub4_sub4.anIntArray2611 != null)
		    bool_294_ = true;
		else {
		    if (anInt2601 == -1)
			anInt2601 = class11_sub10_sub4_sub4.anInt2601;
		    if (anInt2601 != class11_sub10_sub4_sub4.anInt2601)
			bool_294_ = true;
		}
		bool_295_ = (bool_295_
			     | class11_sub10_sub4_sub4.anIntArray2598 != null);
		bool_296_ = (bool_296_
			     | class11_sub10_sub4_sub4.anIntArray2607 != null);
	    }
	}
	anIntArray2597 = new int[anInt2618];
	anIntArray2605 = new int[anInt2618];
	anIntArray2620 = new int[anInt2618];
	anIntArray2610 = new int[anInt2624];
	anIntArray2609 = new int[anInt2624];
	anIntArray2595 = new int[anInt2624];
	anIntArray2622 = new int[anInt2624];
	anIntArray2596 = new int[anInt2624];
	anIntArray2594 = new int[anInt2624];
	anIntArray2617 = new int[anInt2616];
	anIntArray2612 = new int[anInt2616];
	anIntArray2592 = new int[anInt2616];
	if (bool)
	    anIntArray2613 = new int[anInt2624];
	if (bool_294_)
	    anIntArray2611 = new int[anInt2624];
	if (bool_295_)
	    anIntArray2598 = new int[anInt2624];
	if (bool_296_)
	    anIntArray2607 = new int[anInt2624];
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2616 = 0;
	int i = 0;
	for (int i_297_ = 0; i_297_ < arg1; i_297_++) {
	    Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4 = arg0[i_297_];
	    if (class11_sub10_sub4_sub4 != null) {
		int i_298_ = anInt2618;
		for (int i_299_ = 0;
		     i_299_ < class11_sub10_sub4_sub4.anInt2618; i_299_++) {
		    anIntArray2597[anInt2618]
			= class11_sub10_sub4_sub4.anIntArray2597[i_299_];
		    anIntArray2605[anInt2618]
			= class11_sub10_sub4_sub4.anIntArray2605[i_299_];
		    anIntArray2620[anInt2618]
			= class11_sub10_sub4_sub4.anIntArray2620[i_299_];
		    anInt2618++;
		}
		for (int i_300_ = 0;
		     i_300_ < class11_sub10_sub4_sub4.anInt2624; i_300_++) {
		    anIntArray2610[anInt2624]
			= (class11_sub10_sub4_sub4.anIntArray2610[i_300_]
			   + i_298_);
		    anIntArray2609[anInt2624]
			= (class11_sub10_sub4_sub4.anIntArray2609[i_300_]
			   + i_298_);
		    anIntArray2595[anInt2624]
			= (class11_sub10_sub4_sub4.anIntArray2595[i_300_]
			   + i_298_);
		    anIntArray2622[anInt2624]
			= class11_sub10_sub4_sub4.anIntArray2622[i_300_];
		    anIntArray2596[anInt2624]
			= class11_sub10_sub4_sub4.anIntArray2596[i_300_];
		    anIntArray2594[anInt2624]
			= class11_sub10_sub4_sub4.anIntArray2594[i_300_];
		    if (bool) {
			if (class11_sub10_sub4_sub4.anIntArray2613 == null)
			    anIntArray2613[anInt2624] = 0;
			else {
			    int i_301_ = (class11_sub10_sub4_sub4
					  .anIntArray2613[i_300_]);
			    if ((i_301_ & 0x2) == 2)
				i_301_ += i << 2;
			    anIntArray2613[anInt2624] = i_301_;
			}
		    }
		    if (bool_294_) {
			if (class11_sub10_sub4_sub4.anIntArray2611 == null)
			    anIntArray2611[anInt2624]
				= class11_sub10_sub4_sub4.anInt2601;
			else
			    anIntArray2611[anInt2624]
				= (class11_sub10_sub4_sub4.anIntArray2611
				   [i_300_]);
		    }
		    if (bool_295_) {
			if (class11_sub10_sub4_sub4.anIntArray2598 == null)
			    anIntArray2598[anInt2624] = 0;
			else
			    anIntArray2598[anInt2624]
				= (class11_sub10_sub4_sub4.anIntArray2598
				   [i_300_]);
		    }
		    if (bool_296_
			&& class11_sub10_sub4_sub4.anIntArray2607 != null)
			anIntArray2607[anInt2624]
			    = class11_sub10_sub4_sub4.anIntArray2607[i_300_];
		    anInt2624++;
		}
		for (int i_302_ = 0;
		     i_302_ < class11_sub10_sub4_sub4.anInt2616; i_302_++) {
		    anIntArray2617[anInt2616]
			= (class11_sub10_sub4_sub4.anIntArray2617[i_302_]
			   + i_298_);
		    anIntArray2612[anInt2616]
			= (class11_sub10_sub4_sub4.anIntArray2612[i_302_]
			   + i_298_);
		    anIntArray2592[anInt2616]
			= (class11_sub10_sub4_sub4.anIntArray2592[i_302_]
			   + i_298_);
		    anInt2616++;
		}
		i += class11_sub10_sub4_sub4.anInt2616;
	    }
	}
    }
    
    public Class11_Sub10_Sub4_Sub4(Class11_Sub10_Sub4_Sub4 arg0, boolean arg1,
				   boolean arg2, boolean arg3) {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2618 = arg0.anInt2618;
	anInt2624 = arg0.anInt2624;
	anInt2616 = arg0.anInt2616;
	if (arg1) {
	    anIntArray2597 = arg0.anIntArray2597;
	    anIntArray2605 = arg0.anIntArray2605;
	    anIntArray2620 = arg0.anIntArray2620;
	} else {
	    anIntArray2597 = new int[anInt2618];
	    anIntArray2605 = new int[anInt2618];
	    anIntArray2620 = new int[anInt2618];
	    for (int i = 0; i < anInt2618; i++) {
		anIntArray2597[i] = arg0.anIntArray2597[i];
		anIntArray2605[i] = arg0.anIntArray2605[i];
		anIntArray2620[i] = arg0.anIntArray2620[i];
	    }
	}
	if (arg2)
	    anIntArray2607 = arg0.anIntArray2607;
	else {
	    anIntArray2607 = new int[anInt2624];
	    for (int i = 0; i < anInt2624; i++)
		anIntArray2607[i] = arg0.anIntArray2607[i];
	}
	if (arg3)
	    anIntArray2598 = arg0.anIntArray2598;
	else {
	    anIntArray2598 = new int[anInt2624];
	    if (arg0.anIntArray2598 == null) {
		for (int i = 0; i < anInt2624; i++)
		    anIntArray2598[i] = 0;
	    } else {
		for (int i = 0; i < anInt2624; i++)
		    anIntArray2598[i] = arg0.anIntArray2598[i];
	    }
	}
	anIntArray2599 = arg0.anIntArray2599;
	anIntArray2621 = arg0.anIntArray2621;
	anIntArray2613 = arg0.anIntArray2613;
	anIntArray2610 = arg0.anIntArray2610;
	anIntArray2609 = arg0.anIntArray2609;
	anIntArray2595 = arg0.anIntArray2595;
	anIntArray2611 = arg0.anIntArray2611;
	anInt2601 = arg0.anInt2601;
	anIntArray2617 = arg0.anIntArray2617;
	anIntArray2612 = arg0.anIntArray2612;
	anIntArray2592 = arg0.anIntArray2592;
    }
    
    public Class11_Sub10_Sub4_Sub4(Class11_Sub10_Sub4_Sub4 arg0, boolean arg1,
				   boolean arg2) {
	anInt2616 = 0;
	anInt2618 = 0;
	anInt2624 = 0;
	anInt2618 = arg0.anInt2618;
	anInt2624 = arg0.anInt2624;
	anInt2616 = arg0.anInt2616;
	if (arg1) {
	    anIntArray2605 = new int[anInt2618];
	    for (int i = 0; i < anInt2618; i++)
		anIntArray2605[i] = arg0.anIntArray2605[i];
	} else
	    anIntArray2605 = arg0.anIntArray2605;
	if (arg2) {
	    anIntArray2622 = new int[anInt2624];
	    anIntArray2596 = new int[anInt2624];
	    anIntArray2594 = new int[anInt2624];
	    for (int i = 0; i < anInt2624; i++) {
		anIntArray2622[i] = arg0.anIntArray2622[i];
		anIntArray2596[i] = arg0.anIntArray2596[i];
		anIntArray2594[i] = arg0.anIntArray2594[i];
	    }
	    anIntArray2613 = new int[anInt2624];
	    if (arg0.anIntArray2613 == null) {
		for (int i = 0; i < anInt2624; i++)
		    anIntArray2613[i] = 0;
	    } else {
		for (int i = 0; i < anInt2624; i++)
		    anIntArray2613[i] = arg0.anIntArray2613[i];
	    }
	    aClass62Array2606 = new Class62[anInt2618];
	    for (int i = 0; i < anInt2618; i++) {
		Class62 class62 = aClass62Array2606[i] = new Class62();
		Class62 class62_303_ = arg0.aClass62Array2606[i];
		class62.anInt1296 = class62_303_.anInt1296;
		class62.anInt1294 = class62_303_.anInt1294;
		class62.anInt1289 = class62_303_.anInt1289;
		class62.anInt1287 = class62_303_.anInt1287;
	    }
	    aClass62Array2608 = arg0.aClass62Array2608;
	} else {
	    anIntArray2622 = arg0.anIntArray2622;
	    anIntArray2596 = arg0.anIntArray2596;
	    anIntArray2594 = arg0.anIntArray2594;
	    anIntArray2613 = arg0.anIntArray2613;
	}
	anIntArray2597 = arg0.anIntArray2597;
	anIntArray2620 = arg0.anIntArray2620;
	anIntArray2607 = arg0.anIntArray2607;
	anIntArray2598 = arg0.anIntArray2598;
	anIntArray2611 = arg0.anIntArray2611;
	anInt2601 = arg0.anInt2601;
	anIntArray2610 = arg0.anIntArray2610;
	anIntArray2609 = arg0.anIntArray2609;
	anIntArray2595 = arg0.anIntArray2595;
	anIntArray2617 = arg0.anIntArray2617;
	anIntArray2612 = arg0.anIntArray2612;
	anIntArray2592 = arg0.anIntArray2592;
	anInt2603 = arg0.anInt2603;
    }
    
    static {
	aClass11_Sub10_Sub4_Sub4_2627 = new Class11_Sub10_Sub4_Sub4();
	anInt2631 = 0;
	anIntArray2632 = Class11_Sub10_Sub13_Sub1.anIntArray2725;
	anIntArray2641 = new int[10];
	anIntArray2638 = new int[4096];
	anIntArray2644 = Class11_Sub10_Sub13_Sub1.anIntArray2738;
	anIntArray2639 = new int[1500];
	anIntArray2642 = new int[2000];
	anIntArray2634 = new int[1000];
	anIntArray2640 = Class11_Sub10_Sub13_Sub1.anIntArray2740;
	aBooleanArray2635 = new boolean[4096];
	anIntArray2646 = new int[4096];
	anIntArray2647 = new int[12];
	aBoolean2648 = false;
	anIntArray2636 = new int[4096];
	anIntArray2651 = new int[10];
	anIntArray2649 = new int[1];
	anIntArray2652 = new int[4096];
	anIntArray2629 = new int[12];
	aBooleanArray2655 = new boolean[4096];
	anIntArray2637 = new int[4096];
	anIntArray2654 = Class11_Sub10_Sub13_Sub1.anIntArray2721;
	anInt2633 = 0;
	anIntArrayArray2653 = new int[1500][512];
	anIntArrayArray2650 = new int[12][2000];
	anInt2656 = 0;
	anIntArray2645 = new int[4096];
	anIntArray2659 = new int[10];
	anIntArray2657 = new int[2000];
	anIntArray2660 = new int[128];
	int i = 0;
	int i_304_ = 248;
	while (i < 9)
	    anIntArray2660[i++] = 255;
	while (i < 16) {
	    anIntArray2660[i++] = i_304_;
	    i_304_ -= 8;
	}
	while (i < 32) {
	    anIntArray2660[i++] = i_304_;
	    i_304_ -= 4;
	}
	while (i < 64) {
	    anIntArray2660[i++] = i_304_;
	    i_304_ -= 2;
	}
	while (i < 128)
	    anIntArray2660[i++] = i_304_--;
    }
}
