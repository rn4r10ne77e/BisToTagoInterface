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


package datex.businfomation;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Routeplan from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Routeplan extends Sequence {
    
    /**
     * The default constructor.
     */
    public Routeplan()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Routeplan(UTF8String16 trnt_Route_id, 
		    Routeplan_Oper_week routeplan_Oper_week, 
		    INTEGER routeplan_Oper_cnt, 
		    UTF8String16 routeplan_St_first_tm, 
		    UTF8String16 routeplan_St_last_tm, 
		    UTF8String16 routeplan_Ed_first_tm, 
		    UTF8String16 routeplan_Ed_last_tm, 
		    INTEGER routeplan_Min_head, INTEGER routeplan_Max_head, 
		    UTF8String16 routeplan_Reg_date, 
		    UTF8String16 routeplan_Remark)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRouteplan_Oper_week(routeplan_Oper_week);
	setRouteplan_Oper_cnt(routeplan_Oper_cnt);
	setRouteplan_St_first_tm(routeplan_St_first_tm);
	setRouteplan_St_last_tm(routeplan_St_last_tm);
	setRouteplan_Ed_first_tm(routeplan_Ed_first_tm);
	setRouteplan_Ed_last_tm(routeplan_Ed_last_tm);
	setRouteplan_Min_head(routeplan_Min_head);
	setRouteplan_Max_head(routeplan_Max_head);
	setRouteplan_Reg_date(routeplan_Reg_date);
	setRouteplan_Remark(routeplan_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Routeplan(UTF8String16 trnt_Route_id, 
		    Routeplan_Oper_week routeplan_Oper_week, 
		    long routeplan_Oper_cnt, 
		    UTF8String16 routeplan_St_first_tm, 
		    UTF8String16 routeplan_St_last_tm, 
		    UTF8String16 routeplan_Ed_first_tm, 
		    UTF8String16 routeplan_Ed_last_tm, 
		    long routeplan_Min_head, long routeplan_Max_head, 
		    UTF8String16 routeplan_Reg_date, 
		    UTF8String16 routeplan_Remark)
    {
	this(trnt_Route_id, routeplan_Oper_week, 
	     new INTEGER(routeplan_Oper_cnt), routeplan_St_first_tm, 
	     routeplan_St_last_tm, routeplan_Ed_first_tm, 
	     routeplan_Ed_last_tm, new INTEGER(routeplan_Min_head), 
	     new INTEGER(routeplan_Max_head), routeplan_Reg_date, 
	     routeplan_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Routeplan(UTF8String16 trnt_Route_id, 
		    Routeplan_Oper_week routeplan_Oper_week, 
		    long routeplan_Oper_cnt, 
		    UTF8String16 routeplan_St_first_tm, 
		    UTF8String16 routeplan_St_last_tm, 
		    UTF8String16 routeplan_Ed_first_tm, 
		    UTF8String16 routeplan_Ed_last_tm, 
		    long routeplan_Min_head, UTF8String16 routeplan_Reg_date)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRouteplan_Oper_week(routeplan_Oper_week);
	setRouteplan_Oper_cnt(routeplan_Oper_cnt);
	setRouteplan_St_first_tm(routeplan_St_first_tm);
	setRouteplan_St_last_tm(routeplan_St_last_tm);
	setRouteplan_Ed_first_tm(routeplan_Ed_first_tm);
	setRouteplan_Ed_last_tm(routeplan_Ed_last_tm);
	setRouteplan_Min_head(routeplan_Min_head);
	setRouteplan_Reg_date(routeplan_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = Routeplan_Oper_week.occasionality;
	mComponents[2] = new INTEGER();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = new UTF8String16();
	mComponents[10] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return Routeplan_Oper_week.occasionality;
	    case 2:
		return new INTEGER();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new UTF8String16();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return new UTF8String16();
	    case 10:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Route_id"
    public UTF8String16 getTrnt_Route_id()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Route_id(UTF8String16 trnt_Route_id)
    {
	mComponents[0] = trnt_Route_id;
    }
    
    
    // Methods for field "routeplan_Oper_week"
    public Routeplan_Oper_week getRouteplan_Oper_week()
    {
	return (Routeplan_Oper_week)mComponents[1];
    }
    
    public void setRouteplan_Oper_week(Routeplan_Oper_week routeplan_Oper_week)
    {
	mComponents[1] = routeplan_Oper_week;
    }
    
    
    
    /**
     * Define the ASN1 Type Routeplan_Oper_week from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routeplan_Oper_week extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routeplan_Oper_week()
	{
	    super(cFirstNumber);
	}
	
	protected Routeplan_Oper_week(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long occasionality = 0;
	    public static final long weekday = 1;
	    public static final long saturday = 2;
	    public static final long holiday = 3;
	    public static final long daily = 4;
	}
	// Named list definitions.
	private final static Routeplan_Oper_week cNamedNumbers[] = {
	    new Routeplan_Oper_week(), 
	    new Routeplan_Oper_week(1), 
	    new Routeplan_Oper_week(2), 
	    new Routeplan_Oper_week(3), 
	    new Routeplan_Oper_week(4)
	};
	public static final Routeplan_Oper_week occasionality = cNamedNumbers[0];
	public static final Routeplan_Oper_week weekday = cNamedNumbers[1];
	public static final Routeplan_Oper_week saturday = cNamedNumbers[2];
	public static final Routeplan_Oper_week holiday = cNamedNumbers[3];
	public static final Routeplan_Oper_week daily = cNamedNumbers[4];
	
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int indexOfValue(long value)
	{
	    if (value >= 0 && value <= 4)
		return (int)value;
	    else
		return -1;
	}
	
	/**
	 * Returns the enumerator with the specified value or null if the value
	 * is not associated with any enumerator.
	 *  @param value The value of the enumerator to return.
	 *  @return The enumerator with the specified value.
	 */
	
	public static Routeplan_Oper_week valueOf(long value)
	{
	    int inx = indexOfValue(value);
	    
	    if (inx < 0)
		return null;
	    else
		return cNamedNumbers[inx];
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public int indexOf()
	{
	    return indexOfValue(mValue);
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public Enumerated lookupValue(long value)
	{
	    return valueOf(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.businfomation",
		"Routeplan$Routeplan_Oper_week"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    800787,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"occasionality",
			0
		    ),
		    new MemberListElement (
			"weekday",
			1
		    ),
		    new MemberListElement (
			"saturday",
			2
		    ),
		    new MemberListElement (
			"holiday",
			3
		    ),
		    new MemberListElement (
			"daily",
			4
		    )
		}
	    ),
	    0,
	    occasionality
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Routeplan_Oper_week object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routeplan_Oper_week object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routeplan_Oper_week

    // Methods for field "routeplan_Oper_cnt"
    public long getRouteplan_Oper_cnt()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRouteplan_Oper_cnt(long routeplan_Oper_cnt)
    {
	setRouteplan_Oper_cnt(new INTEGER(routeplan_Oper_cnt));
    }
    
    public void setRouteplan_Oper_cnt(INTEGER routeplan_Oper_cnt)
    {
	mComponents[2] = routeplan_Oper_cnt;
    }
    
    
    // Methods for field "routeplan_St_first_tm"
    public UTF8String16 getRouteplan_St_first_tm()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setRouteplan_St_first_tm(UTF8String16 routeplan_St_first_tm)
    {
	mComponents[3] = routeplan_St_first_tm;
    }
    
    
    // Methods for field "routeplan_St_last_tm"
    public UTF8String16 getRouteplan_St_last_tm()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setRouteplan_St_last_tm(UTF8String16 routeplan_St_last_tm)
    {
	mComponents[4] = routeplan_St_last_tm;
    }
    
    
    // Methods for field "routeplan_Ed_first_tm"
    public UTF8String16 getRouteplan_Ed_first_tm()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setRouteplan_Ed_first_tm(UTF8String16 routeplan_Ed_first_tm)
    {
	mComponents[5] = routeplan_Ed_first_tm;
    }
    
    
    // Methods for field "routeplan_Ed_last_tm"
    public UTF8String16 getRouteplan_Ed_last_tm()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setRouteplan_Ed_last_tm(UTF8String16 routeplan_Ed_last_tm)
    {
	mComponents[6] = routeplan_Ed_last_tm;
    }
    
    
    // Methods for field "routeplan_Min_head"
    public long getRouteplan_Min_head()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setRouteplan_Min_head(long routeplan_Min_head)
    {
	setRouteplan_Min_head(new INTEGER(routeplan_Min_head));
    }
    
    public void setRouteplan_Min_head(INTEGER routeplan_Min_head)
    {
	mComponents[7] = routeplan_Min_head;
    }
    
    
    // Methods for field "routeplan_Max_head"
    public long getRouteplan_Max_head()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setRouteplan_Max_head(long routeplan_Max_head)
    {
	setRouteplan_Max_head(new INTEGER(routeplan_Max_head));
    }
    
    public void setRouteplan_Max_head(INTEGER routeplan_Max_head)
    {
	mComponents[8] = routeplan_Max_head;
    }
    
    public boolean hasRouteplan_Max_head()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRouteplan_Max_head()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "routeplan_Reg_date"
    public UTF8String16 getRouteplan_Reg_date()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setRouteplan_Reg_date(UTF8String16 routeplan_Reg_date)
    {
	mComponents[9] = routeplan_Reg_date;
    }
    
    
    // Methods for field "routeplan_Remark"
    public UTF8String16 getRouteplan_Remark()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setRouteplan_Remark(UTF8String16 routeplan_Remark)
    {
	mComponents[10] = routeplan_Remark;
    }
    
    public boolean hasRouteplan_Remark()
    {
	return componentIsPresent(10);
    }
    
    public void deleteRouteplan_Remark()
    {
	setComponentAbsent(10);
    }
    
    
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
	    "datex.businfomation",
	    "Routeplan"
	),
	new QName (
	    "BusInfomation",
	    "Routeplan"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(9),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "trnt-Route-id",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Routeplan$Routeplan_Oper_week"
			)
		    ),
		    "routeplan-Oper-week",
		    1,
		    2,
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
				    new INTEGER(0),
				    new INTEGER(999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routeplan-Oper-cnt",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(4)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-St-first-tm",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(4)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-St-last-tm",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(4)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-Ed-first-tm",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(4)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-Ed-last-tm",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "routeplan-Min-head",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "routeplan-Max-head",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(8)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-Reg-date",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "routeplan-Remark",
		    10,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Routeplan object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Routeplan object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Routeplan
