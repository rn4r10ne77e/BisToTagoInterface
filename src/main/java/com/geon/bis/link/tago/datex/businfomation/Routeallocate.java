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


package com.geon.bis.link.tago.datex.businfomation;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Routeallocate from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Routeallocate extends Sequence {
    
    /**
     * The default constructor.
     */
    public Routeallocate()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Routeallocate(UTF8String16 trnt_Route_id, 
		    Routeallocate_Oper_week routeallocate_Oper_week, 
		    INTEGER routeallocate_Alloc_seq, 
		    UTF8String16 routeallocate_Alloc_time, 
		    UTF8String16 routeallocate_St_station_id, 
		    UTF8String16 routeallocate_Ed_station_id, 
		    UTF8String16 routeallocate_Reg_date, 
		    UTF8String16 routeallocate_Remark)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRouteallocate_Oper_week(routeallocate_Oper_week);
	setRouteallocate_Alloc_seq(routeallocate_Alloc_seq);
	setRouteallocate_Alloc_time(routeallocate_Alloc_time);
	setRouteallocate_St_station_id(routeallocate_St_station_id);
	setRouteallocate_Ed_station_id(routeallocate_Ed_station_id);
	setRouteallocate_Reg_date(routeallocate_Reg_date);
	setRouteallocate_Remark(routeallocate_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Routeallocate(UTF8String16 trnt_Route_id, 
		    Routeallocate_Oper_week routeallocate_Oper_week, 
		    long routeallocate_Alloc_seq, 
		    UTF8String16 routeallocate_Alloc_time, 
		    UTF8String16 routeallocate_St_station_id, 
		    UTF8String16 routeallocate_Ed_station_id, 
		    UTF8String16 routeallocate_Reg_date, 
		    UTF8String16 routeallocate_Remark)
    {
	this(trnt_Route_id, routeallocate_Oper_week, 
	     new INTEGER(routeallocate_Alloc_seq), routeallocate_Alloc_time, 
	     routeallocate_St_station_id, routeallocate_Ed_station_id, 
	     routeallocate_Reg_date, routeallocate_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Routeallocate(UTF8String16 trnt_Route_id, 
		    Routeallocate_Oper_week routeallocate_Oper_week, 
		    long routeallocate_Alloc_seq, 
		    UTF8String16 routeallocate_Alloc_time, 
		    UTF8String16 routeallocate_Reg_date)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRouteallocate_Oper_week(routeallocate_Oper_week);
	setRouteallocate_Alloc_seq(routeallocate_Alloc_seq);
	setRouteallocate_Alloc_time(routeallocate_Alloc_time);
	setRouteallocate_Reg_date(routeallocate_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = Routeallocate_Oper_week.occasionality;
	mComponents[2] = new INTEGER();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new UTF8String16();
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
		return new UTF8String16();
	    case 1:
		return Routeallocate_Oper_week.occasionality;
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
    
    
    // Methods for field "routeallocate_Oper_week"
    public Routeallocate_Oper_week getRouteallocate_Oper_week()
    {
	return (Routeallocate_Oper_week)mComponents[1];
    }
    
    public void setRouteallocate_Oper_week(Routeallocate_Oper_week routeallocate_Oper_week)
    {
	mComponents[1] = routeallocate_Oper_week;
    }
    
    
    
    /**
     * Define the ASN1 Type Routeallocate_Oper_week from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routeallocate_Oper_week extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routeallocate_Oper_week()
	{
	    super(cFirstNumber);
	}
	
	protected Routeallocate_Oper_week(long value)
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
	private final static Routeallocate_Oper_week cNamedNumbers[] = {
	    new Routeallocate_Oper_week(), 
	    new Routeallocate_Oper_week(1), 
	    new Routeallocate_Oper_week(2), 
	    new Routeallocate_Oper_week(3), 
	    new Routeallocate_Oper_week(4)
	};
	public static final Routeallocate_Oper_week occasionality = cNamedNumbers[0];
	public static final Routeallocate_Oper_week weekday = cNamedNumbers[1];
	public static final Routeallocate_Oper_week saturday = cNamedNumbers[2];
	public static final Routeallocate_Oper_week holiday = cNamedNumbers[3];
	public static final Routeallocate_Oper_week daily = cNamedNumbers[4];
	
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
	
	public static Routeallocate_Oper_week valueOf(long value)
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
		"Routeallocate$Routeallocate_Oper_week"
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
	 * Get the type descriptor (TypeInfo) of 'this' Routeallocate_Oper_week object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routeallocate_Oper_week object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routeallocate_Oper_week

    // Methods for field "routeallocate_Alloc_seq"
    public long getRouteallocate_Alloc_seq()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRouteallocate_Alloc_seq(long routeallocate_Alloc_seq)
    {
	setRouteallocate_Alloc_seq(new INTEGER(routeallocate_Alloc_seq));
    }
    
    public void setRouteallocate_Alloc_seq(INTEGER routeallocate_Alloc_seq)
    {
	mComponents[2] = routeallocate_Alloc_seq;
    }
    
    
    // Methods for field "routeallocate_Alloc_time"
    public UTF8String16 getRouteallocate_Alloc_time()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setRouteallocate_Alloc_time(UTF8String16 routeallocate_Alloc_time)
    {
	mComponents[3] = routeallocate_Alloc_time;
    }
    
    
    // Methods for field "routeallocate_St_station_id"
    public UTF8String16 getRouteallocate_St_station_id()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setRouteallocate_St_station_id(UTF8String16 routeallocate_St_station_id)
    {
	mComponents[4] = routeallocate_St_station_id;
    }
    
    public boolean hasRouteallocate_St_station_id()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRouteallocate_St_station_id()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "routeallocate_Ed_station_id"
    public UTF8String16 getRouteallocate_Ed_station_id()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setRouteallocate_Ed_station_id(UTF8String16 routeallocate_Ed_station_id)
    {
	mComponents[5] = routeallocate_Ed_station_id;
    }
    
    public boolean hasRouteallocate_Ed_station_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRouteallocate_Ed_station_id()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "routeallocate_Reg_date"
    public UTF8String16 getRouteallocate_Reg_date()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setRouteallocate_Reg_date(UTF8String16 routeallocate_Reg_date)
    {
	mComponents[6] = routeallocate_Reg_date;
    }
    
    
    // Methods for field "routeallocate_Remark"
    public UTF8String16 getRouteallocate_Remark()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setRouteallocate_Remark(UTF8String16 routeallocate_Remark)
    {
	mComponents[7] = routeallocate_Remark;
    }
    
    public boolean hasRouteallocate_Remark()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRouteallocate_Remark()
    {
	setComponentAbsent(7);
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
	    "Routeallocate"
	),
	new QName (
	    "BusInfomation",
	    "Routeallocate"
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
			    "Routeallocate$Routeallocate_Oper_week"
			)
		    ),
		    "routeallocate-Oper-week",
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
		    "routeallocate-Alloc-seq",
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
		    "routeallocate-Alloc-time",
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
		    "routeallocate-St-station-id",
		    4,
		    3,
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
		    "routeallocate-Ed-station-id",
		    5,
		    3,
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
		    "routeallocate-Reg-date",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "routeallocate-Remark",
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
     * Get the type descriptor (TypeInfo) of 'this' Routeallocate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Routeallocate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Routeallocate
