/*************************************************************/
/* Copyright (C) 2019 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Korea Transportation Safety Authority - Site-based, License 17278 17278,
 * at 17, Hyeoksin 6-ro, Gimcheon-si, Gyeongsangbuk-do, South Korea. */
/* Abstract syntax: datex */
/* ASN.1 Java project: datex.Datex */
/* Created: Tue Feb 19 14:47:06 2019 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output datex -ber -root -noSampleCode -messageFormat msvc D:/asn/datex.asn
 */


package datex.iso14827_2;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Time from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Time extends Sequence {
    
    /**
     * The default constructor.
     */
    public Time()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Time(INTEGER time_Year_qty, INTEGER time_Month_qty, 
		    INTEGER time_Day_qty, INTEGER time_Hour_qty, 
		    INTEGER time_Minute_qty, INTEGER time_Second_qty, 
		    Time_SecondFractions time_SecondFractions, 
		    Time_Timezone time_Timezone)
    {
	setTime_Year_qty(time_Year_qty);
	setTime_Month_qty(time_Month_qty);
	setTime_Day_qty(time_Day_qty);
	setTime_Hour_qty(time_Hour_qty);
	setTime_Minute_qty(time_Minute_qty);
	setTime_Second_qty(time_Second_qty);
	setTime_SecondFractions(time_SecondFractions);
	setTime_Timezone(time_Timezone);
    }
    
    /**
     * Construct with components.
     */
    public Time(long time_Year_qty, long time_Month_qty, long time_Day_qty, 
		    long time_Hour_qty, long time_Minute_qty, 
		    long time_Second_qty, 
		    Time_SecondFractions time_SecondFractions, 
		    Time_Timezone time_Timezone)
    {
	this(new INTEGER(time_Year_qty), new INTEGER(time_Month_qty), 
	     new INTEGER(time_Day_qty), new INTEGER(time_Hour_qty), 
	     new INTEGER(time_Minute_qty), new INTEGER(time_Second_qty), 
	     time_SecondFractions, time_Timezone);
    }
    
    /**
     * Construct with required components.
     */
    public Time(Time_SecondFractions time_SecondFractions)
    {
	setTime_SecondFractions(time_SecondFractions);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new Time_SecondFractions();
	mComponents[7] = new Time_Timezone();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new Time_SecondFractions();
	    case 7:
		return new Time_Timezone();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final INTEGER time_Hour_qty__default =
	new INTEGER(0);
    public static final INTEGER time_Minute_qty__default =
	new INTEGER(0);
    public static final INTEGER time_Second_qty__default =
	new INTEGER(0);
    
    // Methods for field "time_Year_qty"
    public long getTime_Year_qty()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setTime_Year_qty(long time_Year_qty)
    {
	setTime_Year_qty(new INTEGER(time_Year_qty));
    }
    
    public void setTime_Year_qty(INTEGER time_Year_qty)
    {
	mComponents[0] = time_Year_qty;
    }
    
    public boolean hasTime_Year_qty()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTime_Year_qty()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "time_Month_qty"
    public long getTime_Month_qty()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTime_Month_qty(long time_Month_qty)
    {
	setTime_Month_qty(new INTEGER(time_Month_qty));
    }
    
    public void setTime_Month_qty(INTEGER time_Month_qty)
    {
	mComponents[1] = time_Month_qty;
    }
    
    public boolean hasTime_Month_qty()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTime_Month_qty()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "time_Day_qty"
    public long getTime_Day_qty()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTime_Day_qty(long time_Day_qty)
    {
	setTime_Day_qty(new INTEGER(time_Day_qty));
    }
    
    public void setTime_Day_qty(INTEGER time_Day_qty)
    {
	mComponents[2] = time_Day_qty;
    }
    
    public boolean hasTime_Day_qty()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTime_Day_qty()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "time_Hour_qty"
    public long getTime_Hour_qty()
    {
	if (hasTime_Hour_qty())
	    return ((INTEGER)mComponents[3]).longValue();
	else
	    return time_Hour_qty__default.longValue();
    }
    
    public void setTime_Hour_qty(long time_Hour_qty)
    {
	setTime_Hour_qty(new INTEGER(time_Hour_qty));
    }
    
    public void setTime_Hour_qty(INTEGER time_Hour_qty)
    {
	mComponents[3] = time_Hour_qty;
    }
    
    public void setTime_Hour_qtyToDefault()
    {
	setTime_Hour_qty(time_Hour_qty__default);
    }
    
    public boolean hasDefaultTime_Hour_qty()
    {
	return true;
    }
    
    public boolean hasTime_Hour_qty()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTime_Hour_qty()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "time_Minute_qty"
    public long getTime_Minute_qty()
    {
	if (hasTime_Minute_qty())
	    return ((INTEGER)mComponents[4]).longValue();
	else
	    return time_Minute_qty__default.longValue();
    }
    
    public void setTime_Minute_qty(long time_Minute_qty)
    {
	setTime_Minute_qty(new INTEGER(time_Minute_qty));
    }
    
    public void setTime_Minute_qty(INTEGER time_Minute_qty)
    {
	mComponents[4] = time_Minute_qty;
    }
    
    public void setTime_Minute_qtyToDefault()
    {
	setTime_Minute_qty(time_Minute_qty__default);
    }
    
    public boolean hasDefaultTime_Minute_qty()
    {
	return true;
    }
    
    public boolean hasTime_Minute_qty()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTime_Minute_qty()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "time_Second_qty"
    public long getTime_Second_qty()
    {
	if (hasTime_Second_qty())
	    return ((INTEGER)mComponents[5]).longValue();
	else
	    return time_Second_qty__default.longValue();
    }
    
    public void setTime_Second_qty(long time_Second_qty)
    {
	setTime_Second_qty(new INTEGER(time_Second_qty));
    }
    
    public void setTime_Second_qty(INTEGER time_Second_qty)
    {
	mComponents[5] = time_Second_qty;
    }
    
    public void setTime_Second_qtyToDefault()
    {
	setTime_Second_qty(time_Second_qty__default);
    }
    
    public boolean hasDefaultTime_Second_qty()
    {
	return true;
    }
    
    public boolean hasTime_Second_qty()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTime_Second_qty()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "time_SecondFractions"
    public Time_SecondFractions getTime_SecondFractions()
    {
	return (Time_SecondFractions)mComponents[6];
    }
    
    public void setTime_SecondFractions(Time_SecondFractions time_SecondFractions)
    {
	mComponents[6] = time_SecondFractions;
    }
    
    
    
    /**
     * Define the ASN1 Type Time_SecondFractions from ASN1 Module ISO14827_2.
     * @see Choice
     */
    public static class Time_SecondFractions extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Time_SecondFractions()
	{
	}
	
	public static final  int  deci_seconds_chosen = 1;
	public static final  int  centi_seconds_chosen = 2;
	public static final  int  milliseconds_chosen = 3;
	
	// Methods for field "deci_seconds"
	public static Time_SecondFractions createTime_SecondFractionsWithDeci_seconds(long deci_seconds)
	{
	    return createTime_SecondFractionsWithDeci_seconds(new INTEGER(deci_seconds));
	}
	
	public static Time_SecondFractions createTime_SecondFractionsWithDeci_seconds(INTEGER deci_seconds)
	{
	    Time_SecondFractions __object = new Time_SecondFractions();

	    __object.setDeci_seconds(deci_seconds);
	    return __object;
	}
	
	public boolean hasDeci_seconds()
	{
	    return getChosenFlag() == deci_seconds_chosen;
	}
	
	public INTEGER getDeci_seconds()
	{
	    if (hasDeci_seconds())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setDeci_seconds(long deci_seconds)
	{
	    setDeci_seconds(new INTEGER(deci_seconds));
	}
	
	public void setDeci_seconds(INTEGER deci_seconds)
	{
	    setChosenValue(deci_seconds);
	    setChosenFlag(deci_seconds_chosen);
	}
	
	
	// Methods for field "centi_seconds"
	public static Time_SecondFractions createTime_SecondFractionsWithCenti_seconds(long centi_seconds)
	{
	    return createTime_SecondFractionsWithCenti_seconds(new INTEGER(centi_seconds));
	}
	
	public static Time_SecondFractions createTime_SecondFractionsWithCenti_seconds(INTEGER centi_seconds)
	{
	    Time_SecondFractions __object = new Time_SecondFractions();

	    __object.setCenti_seconds(centi_seconds);
	    return __object;
	}
	
	public boolean hasCenti_seconds()
	{
	    return getChosenFlag() == centi_seconds_chosen;
	}
	
	public INTEGER getCenti_seconds()
	{
	    if (hasCenti_seconds())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setCenti_seconds(long centi_seconds)
	{
	    setCenti_seconds(new INTEGER(centi_seconds));
	}
	
	public void setCenti_seconds(INTEGER centi_seconds)
	{
	    setChosenValue(centi_seconds);
	    setChosenFlag(centi_seconds_chosen);
	}
	
	
	// Methods for field "milliseconds"
	public static Time_SecondFractions createTime_SecondFractionsWithMilliseconds(long milliseconds)
	{
	    return createTime_SecondFractionsWithMilliseconds(new INTEGER(milliseconds));
	}
	
	public static Time_SecondFractions createTime_SecondFractionsWithMilliseconds(INTEGER milliseconds)
	{
	    Time_SecondFractions __object = new Time_SecondFractions();

	    __object.setMilliseconds(milliseconds);
	    return __object;
	}
	
	public boolean hasMilliseconds()
	{
	    return getChosenFlag() == milliseconds_chosen;
	}
	
	public INTEGER getMilliseconds()
	{
	    if (hasMilliseconds())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setMilliseconds(long milliseconds)
	{
	    setMilliseconds(new INTEGER(milliseconds));
	}
	
	public void setMilliseconds(INTEGER milliseconds)
	{
	    setChosenValue(milliseconds);
	    setChosenFlag(milliseconds_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case deci_seconds_chosen:
		    return new INTEGER();
		case centi_seconds_chosen:
		    return new INTEGER();
		case milliseconds_chosen:
		    return new INTEGER();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Time$Time_SecondFractions"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    800791,
	    null,
	    new FieldsList (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				800787,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(0),
					new INTEGER(9),
					0
				    )
				),
				null,
				null
			    )
			),
			"deci-seconds",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				800787,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(0),
					new INTEGER(99),
					0
				    )
				),
				null,
				null
			    )
			),
			"centi-seconds",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				800787,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(0),
					new INTEGER(999),
					0
				    )
				),
				null,
				null
			    )
			),
			"milliseconds",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Time_SecondFractions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Time_SecondFractions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Check the current selection on unknown extension
	 */
	public final boolean hasUnknownExtension()
	{
	    return getChosenFlag() > 3;
	}
	
    } // End class definition for Time_SecondFractions

    // Methods for field "time_Timezone"
    public Time_Timezone getTime_Timezone()
    {
	return (Time_Timezone)mComponents[7];
    }
    
    public void setTime_Timezone(Time_Timezone time_Timezone)
    {
	mComponents[7] = time_Timezone;
    }
    
    public boolean hasTime_Timezone()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTime_Timezone()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Time_Timezone from ASN1 Module ISO14827_2.
     * @see Sequence
     */
    public static class Time_Timezone extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Time_Timezone()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Time_Timezone(INTEGER timezone_Hour_qty, 
			INTEGER time_Minute_qty)
	{
	    setTimezone_Hour_qty(timezone_Hour_qty);
	    setTime_Minute_qty(time_Minute_qty);
	}
	
	/**
	 * Construct with components.
	 */
	public Time_Timezone(long timezone_Hour_qty, long time_Minute_qty)
	{
	    this(new INTEGER(timezone_Hour_qty), 
		 new INTEGER(time_Minute_qty));
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new INTEGER();
		case 1:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	// Default Values
	public static final INTEGER timezone_Hour_qty__default =
	    new INTEGER(0);
	public static final INTEGER time_Minute_qty__default =
	    new INTEGER(0);
	
	// Methods for field "timezone_Hour_qty"
	public long getTimezone_Hour_qty()
	{
	    if (hasTimezone_Hour_qty())
		return ((INTEGER)mComponents[0]).longValue();
	    else
		return timezone_Hour_qty__default.longValue();
	}
	
	public void setTimezone_Hour_qty(long timezone_Hour_qty)
	{
	    setTimezone_Hour_qty(new INTEGER(timezone_Hour_qty));
	}
	
	public void setTimezone_Hour_qty(INTEGER timezone_Hour_qty)
	{
	    mComponents[0] = timezone_Hour_qty;
	}
	
	public void setTimezone_Hour_qtyToDefault()
	{
	    setTimezone_Hour_qty(timezone_Hour_qty__default);
	}
	
	public boolean hasDefaultTimezone_Hour_qty()
	{
	    return true;
	}
	
	public boolean hasTimezone_Hour_qty()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteTimezone_Hour_qty()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "time_Minute_qty"
	public long getTime_Minute_qty()
	{
	    if (hasTime_Minute_qty())
		return ((INTEGER)mComponents[1]).longValue();
	    else
		return time_Minute_qty__default.longValue();
	}
	
	public void setTime_Minute_qty(long time_Minute_qty)
	{
	    setTime_Minute_qty(new INTEGER(time_Minute_qty));
	}
	
	public void setTime_Minute_qty(INTEGER time_Minute_qty)
	{
	    mComponents[1] = time_Minute_qty;
	}
	
	public void setTime_Minute_qtyToDefault()
	{
	    setTime_Minute_qty(time_Minute_qty__default);
	}
	
	public boolean hasDefaultTime_Minute_qty()
	{
	    return true;
	}
	
	public boolean hasTime_Minute_qty()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteTime_Minute_qty()
	{
	    setComponentAbsent(1);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Time$Time_Timezone"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    800787,
	    null,
	    new FieldsList (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				800787,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(-13),
					new INTEGER(13),
					0
				    )
				),
				null,
				null
			    )
			),
			"timezone-Hour-qty",
			0,
			3,
			timezone_Hour_qty__default
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "INTEGER"
				),
				new QName (
				    "builtin",
				    "INTEGER"
				),
				800787,
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(0),
					new INTEGER(59),
					0
				    )
				),
				null,
				null
			    )
			),
			"time-Minute-qty",
			1,
			3,
			time_Minute_qty__default
		    )
		}
	    ),
	    0,
	    new TagDecoders (
		new TagDecoder[] {
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8000, 0),
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Time_Timezone object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Time_Timezone object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Time_Timezone

    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "datex.iso14827_2",
	    "Time"
	),
	new QName (
	    "ISO14827-2",
	    "Time"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32768),
				    new INTEGER(32767),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Year-qty",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(12),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Month-qty",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(1),
				    new INTEGER(31),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Day-qty",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(23),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Hour-qty",
		    3,
		    3,
		    time_Hour_qty__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(59),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Minute-qty",
		    4,
		    3,
		    time_Minute_qty__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(59),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "time-Second-qty",
		    5,
		    3,
		    time_Second_qty__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Time$Time_SecondFractions"
			)
		    ),
		    "time-SecondFractions",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Time$Time_Timezone"
			)
		    ),
		    "time-Timezone",
		    7,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Time object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Time object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Time
