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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Registered from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class Registered extends Choice {
    
    /**
     * The default constructor.
     */
    public Registered()
    {
    }
    
    public static final  int  continuous_chosen = 1;
    public static final  int  daily_chosen = 2;
    
    // Methods for field "continuous"
    public static Registered createRegisteredWithContinuous(Continuous continuous)
    {
	Registered __object = new Registered();

	__object.setContinuous(continuous);
	return __object;
    }
    
    public boolean hasContinuous()
    {
	return getChosenFlag() == continuous_chosen;
    }
    
    public Continuous getContinuous()
    {
	if (hasContinuous())
	    return (Continuous)mChosenValue;
	else
	    return null;
    }
    
    public void setContinuous(Continuous continuous)
    {
	setChosenValue(continuous);
	setChosenFlag(continuous_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Continuous from ASN1 Module ISO14827_2.
     * @see Sequence
     */
    public static class Continuous extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Continuous()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Continuous(INTEGER datexRegistered_UpdateDelay_qty, 
			Time datexRegistered_StartTime, 
			Time datexRegistered_EndTime)
	{
	    setDatexRegistered_UpdateDelay_qty(datexRegistered_UpdateDelay_qty);
	    setDatexRegistered_StartTime(datexRegistered_StartTime);
	    setDatexRegistered_EndTime(datexRegistered_EndTime);
	}
	
	/**
	 * Construct with components.
	 */
	public Continuous(long datexRegistered_UpdateDelay_qty, 
			Time datexRegistered_StartTime, 
			Time datexRegistered_EndTime)
	{
	    this(new INTEGER(datexRegistered_UpdateDelay_qty), 
		 datexRegistered_StartTime, datexRegistered_EndTime);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new Time();
	    mComponents[2] = new Time();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[3];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new INTEGER();
		case 1:
		    return new Time();
		case 2:
		    return new Time();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	// Default Values
	public static final INTEGER datexRegistered_UpdateDelay_qty__default =
	    new INTEGER(0);
	
	// Methods for field "datexRegistered_UpdateDelay_qty"
	public long getDatexRegistered_UpdateDelay_qty()
	{
	    if (hasDatexRegistered_UpdateDelay_qty())
		return ((INTEGER)mComponents[0]).longValue();
	    else
		return datexRegistered_UpdateDelay_qty__default.longValue();
	}
	
	public void setDatexRegistered_UpdateDelay_qty(long datexRegistered_UpdateDelay_qty)
	{
	    setDatexRegistered_UpdateDelay_qty(new INTEGER(datexRegistered_UpdateDelay_qty));
	}
	
	public void setDatexRegistered_UpdateDelay_qty(INTEGER datexRegistered_UpdateDelay_qty)
	{
	    mComponents[0] = datexRegistered_UpdateDelay_qty;
	}
	
	public void setDatexRegistered_UpdateDelay_qtyToDefault()
	{
	    setDatexRegistered_UpdateDelay_qty(datexRegistered_UpdateDelay_qty__default);
	}
	
	public boolean hasDefaultDatexRegistered_UpdateDelay_qty()
	{
	    return true;
	}
	
	public boolean hasDatexRegistered_UpdateDelay_qty()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteDatexRegistered_UpdateDelay_qty()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "datexRegistered_StartTime"
	public Time getDatexRegistered_StartTime()
	{
	    return (Time)mComponents[1];
	}
	
	public void setDatexRegistered_StartTime(Time datexRegistered_StartTime)
	{
	    mComponents[1] = datexRegistered_StartTime;
	}
	
	public boolean hasDatexRegistered_StartTime()
	{
	    return componentIsPresent(1);
	}
	
	public void deleteDatexRegistered_StartTime()
	{
	    setComponentAbsent(1);
	}
	
	
	// Methods for field "datexRegistered_EndTime"
	public Time getDatexRegistered_EndTime()
	{
	    return (Time)mComponents[2];
	}
	
	public void setDatexRegistered_EndTime(Time datexRegistered_EndTime)
	{
	    mComponents[2] = datexRegistered_EndTime;
	}
	
	public boolean hasDatexRegistered_EndTime()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteDatexRegistered_EndTime()
	{
	    setComponentAbsent(2);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Registered$Continuous"
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
					new INTEGER(0),
					new INTEGER(424967295),
					0
				    )
				),
				null,
				null
			    )
			),
			"datexRegistered-UpdateDelay-qty",
			0,
			3,
			datexRegistered_UpdateDelay_qty__default
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
				new FieldsRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0
			    )
			),
			"datexRegistered-StartTime",
			1,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
				new FieldsRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0
			    )
			),
			"datexRegistered-EndTime",
			2,
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
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1),
			    new TagDecoderElement((short)0x8002, 2)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Continuous object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Continuous object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Continuous

    // Methods for field "daily"
    public static Registered createRegisteredWithDaily(Daily daily)
    {
	Registered __object = new Registered();

	__object.setDaily(daily);
	return __object;
    }
    
    public boolean hasDaily()
    {
	return getChosenFlag() == daily_chosen;
    }
    
    public Daily getDaily()
    {
	if (hasDaily())
	    return (Daily)mChosenValue;
	else
	    return null;
    }
    
    public void setDaily(Daily daily)
    {
	setChosenValue(daily);
	setChosenFlag(daily_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Daily from ASN1 Module ISO14827_2.
     * @see Sequence
     */
    public static class Daily extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Daily()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Daily(INTEGER datexRegistered_UpdateDelay_qty, 
			DatexRegistered_DaysOfWeek_cd datexRegistered_DaysOfWeek_cd, 
			Time datexRegistered_StartDate, 
			Time datexRegistered_EndDate, 
			Time datexRegistered_StartTime, 
			INTEGER datexRegistered_Duration_qty)
	{
	    setDatexRegistered_UpdateDelay_qty(datexRegistered_UpdateDelay_qty);
	    setDatexRegistered_DaysOfWeek_cd(datexRegistered_DaysOfWeek_cd);
	    setDatexRegistered_StartDate(datexRegistered_StartDate);
	    setDatexRegistered_EndDate(datexRegistered_EndDate);
	    setDatexRegistered_StartTime(datexRegistered_StartTime);
	    setDatexRegistered_Duration_qty(datexRegistered_Duration_qty);
	}
	
	/**
	 * Construct with components.
	 */
	public Daily(long datexRegistered_UpdateDelay_qty, 
			DatexRegistered_DaysOfWeek_cd datexRegistered_DaysOfWeek_cd, 
			Time datexRegistered_StartDate, 
			Time datexRegistered_EndDate, 
			Time datexRegistered_StartTime, 
			long datexRegistered_Duration_qty)
	{
	    this(new INTEGER(datexRegistered_UpdateDelay_qty), 
		 datexRegistered_DaysOfWeek_cd, datexRegistered_StartDate, 
		 datexRegistered_EndDate, datexRegistered_StartTime, 
		 new INTEGER(datexRegistered_Duration_qty));
	}
	
	/**
	 * Construct with required components.
	 */
	public Daily(DatexRegistered_DaysOfWeek_cd datexRegistered_DaysOfWeek_cd)
	{
	    setDatexRegistered_DaysOfWeek_cd(datexRegistered_DaysOfWeek_cd);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new DatexRegistered_DaysOfWeek_cd();
	    mComponents[2] = new Time();
	    mComponents[3] = new Time();
	    mComponents[4] = new Time();
	    mComponents[5] = new INTEGER();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[6];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new INTEGER();
		case 1:
		    return new DatexRegistered_DaysOfWeek_cd();
		case 2:
		    return new Time();
		case 3:
		    return new Time();
		case 4:
		    return new Time();
		case 5:
		    return new INTEGER();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	// Default Values
	public static final INTEGER datexRegistered_UpdateDelay_qty__default =
	    new INTEGER(0);
	
	// Methods for field "datexRegistered_UpdateDelay_qty"
	public long getDatexRegistered_UpdateDelay_qty()
	{
	    if (hasDatexRegistered_UpdateDelay_qty())
		return ((INTEGER)mComponents[0]).longValue();
	    else
		return datexRegistered_UpdateDelay_qty__default.longValue();
	}
	
	public void setDatexRegistered_UpdateDelay_qty(long datexRegistered_UpdateDelay_qty)
	{
	    setDatexRegistered_UpdateDelay_qty(new INTEGER(datexRegistered_UpdateDelay_qty));
	}
	
	public void setDatexRegistered_UpdateDelay_qty(INTEGER datexRegistered_UpdateDelay_qty)
	{
	    mComponents[0] = datexRegistered_UpdateDelay_qty;
	}
	
	public void setDatexRegistered_UpdateDelay_qtyToDefault()
	{
	    setDatexRegistered_UpdateDelay_qty(datexRegistered_UpdateDelay_qty__default);
	}
	
	public boolean hasDefaultDatexRegistered_UpdateDelay_qty()
	{
	    return true;
	}
	
	public boolean hasDatexRegistered_UpdateDelay_qty()
	{
	    return componentIsPresent(0);
	}
	
	public void deleteDatexRegistered_UpdateDelay_qty()
	{
	    setComponentAbsent(0);
	}
	
	
	// Methods for field "datexRegistered_DaysOfWeek_cd"
	public DatexRegistered_DaysOfWeek_cd getDatexRegistered_DaysOfWeek_cd()
	{
	    return (DatexRegistered_DaysOfWeek_cd)mComponents[1];
	}
	
	public void setDatexRegistered_DaysOfWeek_cd(DatexRegistered_DaysOfWeek_cd datexRegistered_DaysOfWeek_cd)
	{
	    mComponents[1] = datexRegistered_DaysOfWeek_cd;
	}
	
	
	
	/**
	 * Define the ASN1 Type DatexRegistered_DaysOfWeek_cd from ASN1 Module ISO14827_2.
	 * @see BitString
	 */
	public static class DatexRegistered_DaysOfWeek_cd extends BitString {
	    
	    /**
	     * The default constructor.
	     */
	    public DatexRegistered_DaysOfWeek_cd()
	    {
	    }
	    
	    /**
	     * Construct Bit String from a byte array.
	     * All bits considered significant.
	     * @param value the byte array to set this object to.
	     */
	    public DatexRegistered_DaysOfWeek_cd(byte[] value)
	    {
		super(value);
	    }
	    
	    
	    /**
	     * Construct Bit String from a byte array and significant bits.
	     * @param value the byte array to set this object to.
	     * @param sigBits the number of significant bits.
	     */
	    public DatexRegistered_DaysOfWeek_cd(byte[] value, int sigBits)
	    {
		super(value, sigBits);
	    }
	    
	    // Named list definitions.
	    
	    public static final int other = 0;
	    public static final int sunday = 1;
	    public static final int monday = 2;
	    public static final int tuesday = 3;
	    public static final int wednesday = 4;
	    public static final int thursday = 5;
	    public static final int friday = 6;
	    public static final int saturday = 7;
	    
	    /**
	     * Initialize the type descriptor.
	     */
	    private static final BitStringInfo c_typeinfo = new BitStringInfo (
		new Tags (
		    new short[] {
			(short)0x8001
		    }
		),
		new QName (
		    "datex.iso14827_2",
		    "Registered$Daily$DatexRegistered_DaysOfWeek_cd"
		),
		new QName (
		    "builtin",
		    "BIT STRING"
		),
		800787,
		new SizeConstraint (
		    new SingleValueConstraint (
			new INTEGER(8)
		    )
		),
		new Bounds (
		    Long.valueOf(8),
		    Long.valueOf(8)
		),
		new MemberList (
		    new MemberListElement[] {
			new MemberListElement (
			    "other",
			    0
			),
			new MemberListElement (
			    "sunday",
			    1
			),
			new MemberListElement (
			    "monday",
			    2
			),
			new MemberListElement (
			    "tuesday",
			    3
			),
			new MemberListElement (
			    "wednesday",
			    4
			),
			new MemberListElement (
			    "thursday",
			    5
			),
			new MemberListElement (
			    "friday",
			    6
			),
			new MemberListElement (
			    "saturday",
			    7
			)
		    }
		)
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' DatexRegistered_DaysOfWeek_cd object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' DatexRegistered_DaysOfWeek_cd object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for DatexRegistered_DaysOfWeek_cd

	// Methods for field "datexRegistered_StartDate"
	public Time getDatexRegistered_StartDate()
	{
	    return (Time)mComponents[2];
	}
	
	public void setDatexRegistered_StartDate(Time datexRegistered_StartDate)
	{
	    mComponents[2] = datexRegistered_StartDate;
	}
	
	public boolean hasDatexRegistered_StartDate()
	{
	    return componentIsPresent(2);
	}
	
	public void deleteDatexRegistered_StartDate()
	{
	    setComponentAbsent(2);
	}
	
	
	// Methods for field "datexRegistered_EndDate"
	public Time getDatexRegistered_EndDate()
	{
	    return (Time)mComponents[3];
	}
	
	public void setDatexRegistered_EndDate(Time datexRegistered_EndDate)
	{
	    mComponents[3] = datexRegistered_EndDate;
	}
	
	public boolean hasDatexRegistered_EndDate()
	{
	    return componentIsPresent(3);
	}
	
	public void deleteDatexRegistered_EndDate()
	{
	    setComponentAbsent(3);
	}
	
	
	// Methods for field "datexRegistered_StartTime"
	public Time getDatexRegistered_StartTime()
	{
	    return (Time)mComponents[4];
	}
	
	public void setDatexRegistered_StartTime(Time datexRegistered_StartTime)
	{
	    mComponents[4] = datexRegistered_StartTime;
	}
	
	public boolean hasDatexRegistered_StartTime()
	{
	    return componentIsPresent(4);
	}
	
	public void deleteDatexRegistered_StartTime()
	{
	    setComponentAbsent(4);
	}
	
	
	// Methods for field "datexRegistered_Duration_qty"
	public long getDatexRegistered_Duration_qty()
	{
	    return ((INTEGER)mComponents[5]).longValue();
	}
	
	public void setDatexRegistered_Duration_qty(long datexRegistered_Duration_qty)
	{
	    setDatexRegistered_Duration_qty(new INTEGER(datexRegistered_Duration_qty));
	}
	
	public void setDatexRegistered_Duration_qty(INTEGER datexRegistered_Duration_qty)
	{
	    mComponents[5] = datexRegistered_Duration_qty;
	}
	
	public boolean hasDatexRegistered_Duration_qty()
	{
	    return componentIsPresent(5);
	}
	
	public void deleteDatexRegistered_Duration_qty()
	{
	    setComponentAbsent(5);
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Registered$Daily"
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
					new INTEGER(0),
					new INTEGER(424967295),
					0
				    )
				),
				null,
				null
			    )
			),
			"datexRegistered-UpdateDelay-qty",
			0,
			3,
			datexRegistered_UpdateDelay_qty__default
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"datex.iso14827_2",
				"Registered$Daily$DatexRegistered_DaysOfWeek_cd"
			    )
			),
			"datexRegistered-DaysOfWeek-cd",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
				new FieldsRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0
			    )
			),
			"datexRegistered-StartDate",
			2,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8003
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
				new FieldsRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0
			    )
			),
			"datexRegistered-EndDate",
			3,
			3,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8004
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
				new FieldsRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.iso14827_2",
					"Time"
				    )
				),
				0
			    )
			),
			"datexRegistered-StartTime",
			4,
			3,
			null
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
					new INTEGER(65535),
					0
				    )
				),
				null,
				null
			    )
			),
			"datexRegistered-Duration-qty",
			5,
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
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8001, 1)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8002, 2),
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4),
			    new TagDecoderElement((short)0x8005, 5)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8003, 3),
			    new TagDecoderElement((short)0x8004, 4),
			    new TagDecoderElement((short)0x8005, 5)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8004, 4),
			    new TagDecoderElement((short)0x8005, 5)
			}
		    ),
		    new TagDecoder (
			new TagDecoderElement[] {
			    new TagDecoderElement((short)0x8005, 5)
			}
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Daily object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Daily object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Daily

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case continuous_chosen:
		return new Continuous();
	    case daily_chosen:
		return new Daily();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "datex.iso14827_2",
	    "Registered"
	),
	new QName (
	    "ISO14827-2",
	    "Registered"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Registered$Continuous"
			)
		    ),
		    "continuous",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Registered$Daily"
			)
		    ),
		    "daily",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Registered object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Registered object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Registered
