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
 * Define the ASN1 Type Routelink from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Routelink extends Sequence {
    
    /**
     * The default constructor.
     */
    public Routelink()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Routelink(UTF8String16 trnt_Route_id, INTEGER routelink_Sequence, 
		    UTF8String16 routelink_Link_id, 
		    Routelink_Station_yn routelink_Station_yn, 
		    Routelink_Up_down routelink_Up_down, 
		    UTF8String16 routelink_Reg_date, 
		    UTF8String16 routelink_Remark)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoutelink_Sequence(routelink_Sequence);
	setRoutelink_Link_id(routelink_Link_id);
	setRoutelink_Station_yn(routelink_Station_yn);
	setRoutelink_Up_down(routelink_Up_down);
	setRoutelink_Reg_date(routelink_Reg_date);
	setRoutelink_Remark(routelink_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Routelink(UTF8String16 trnt_Route_id, long routelink_Sequence, 
		    UTF8String16 routelink_Link_id, 
		    Routelink_Station_yn routelink_Station_yn, 
		    Routelink_Up_down routelink_Up_down, 
		    UTF8String16 routelink_Reg_date, 
		    UTF8String16 routelink_Remark)
    {
	this(trnt_Route_id, new INTEGER(routelink_Sequence), 
	     routelink_Link_id, routelink_Station_yn, routelink_Up_down, 
	     routelink_Reg_date, routelink_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Routelink(UTF8String16 trnt_Route_id, long routelink_Sequence, 
		    UTF8String16 routelink_Link_id, 
		    Routelink_Station_yn routelink_Station_yn, 
		    Routelink_Up_down routelink_Up_down, 
		    UTF8String16 routelink_Reg_date)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoutelink_Sequence(routelink_Sequence);
	setRoutelink_Link_id(routelink_Link_id);
	setRoutelink_Station_yn(routelink_Station_yn);
	setRoutelink_Up_down(routelink_Up_down);
	setRoutelink_Reg_date(routelink_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new UTF8String16();
	mComponents[3] = Routelink_Station_yn.no;
	mComponents[4] = Routelink_Up_down.up;
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new INTEGER();
	    case 2:
		return new UTF8String16();
	    case 3:
		return Routelink_Station_yn.no;
	    case 4:
		return Routelink_Up_down.up;
	    case 5:
		return new UTF8String16();
	    case 6:
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
    
    
    // Methods for field "routelink_Sequence"
    public long getRoutelink_Sequence()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRoutelink_Sequence(long routelink_Sequence)
    {
	setRoutelink_Sequence(new INTEGER(routelink_Sequence));
    }
    
    public void setRoutelink_Sequence(INTEGER routelink_Sequence)
    {
	mComponents[1] = routelink_Sequence;
    }
    
    
    // Methods for field "routelink_Link_id"
    public UTF8String16 getRoutelink_Link_id()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setRoutelink_Link_id(UTF8String16 routelink_Link_id)
    {
	mComponents[2] = routelink_Link_id;
    }
    
    
    // Methods for field "routelink_Station_yn"
    public Routelink_Station_yn getRoutelink_Station_yn()
    {
	return (Routelink_Station_yn)mComponents[3];
    }
    
    public void setRoutelink_Station_yn(Routelink_Station_yn routelink_Station_yn)
    {
	mComponents[3] = routelink_Station_yn;
    }
    
    
    
    /**
     * Define the ASN1 Type Routelink_Station_yn from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routelink_Station_yn extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routelink_Station_yn()
	{
	    super(cFirstNumber);
	}
	
	protected Routelink_Station_yn(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long no = 0;
	    public static final long yes = 1;
	}
	// Named list definitions.
	private final static Routelink_Station_yn cNamedNumbers[] = {
	    new Routelink_Station_yn(), 
	    new Routelink_Station_yn(1)
	};
	public static final Routelink_Station_yn no = cNamedNumbers[0];
	public static final Routelink_Station_yn yes = cNamedNumbers[1];
	
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
	    if (value >= 0 && value <= 1)
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
	
	public static Routelink_Station_yn valueOf(long value)
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"datex.businfomation",
		"Routelink$Routelink_Station_yn"
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
			"no",
			0
		    ),
		    new MemberListElement (
			"yes",
			1
		    )
		}
	    ),
	    0,
	    no
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Routelink_Station_yn object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routelink_Station_yn object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routelink_Station_yn

    // Methods for field "routelink_Up_down"
    public Routelink_Up_down getRoutelink_Up_down()
    {
	return (Routelink_Up_down)mComponents[4];
    }
    
    public void setRoutelink_Up_down(Routelink_Up_down routelink_Up_down)
    {
	mComponents[4] = routelink_Up_down;
    }
    
    
    
    /**
     * Define the ASN1 Type Routelink_Up_down from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routelink_Up_down extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routelink_Up_down()
	{
	    super(cFirstNumber);
	}
	
	protected Routelink_Up_down(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long up = 0;
	    public static final long down = 1;
	    public static final long no_division = 2;
	}
	// Named list definitions.
	private final static Routelink_Up_down cNamedNumbers[] = {
	    new Routelink_Up_down(), 
	    new Routelink_Up_down(1), 
	    new Routelink_Up_down(2)
	};
	public static final Routelink_Up_down up = cNamedNumbers[0];
	public static final Routelink_Up_down down = cNamedNumbers[1];
	public static final Routelink_Up_down no_division = cNamedNumbers[2];
	
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
	    if (value >= 0 && value <= 2)
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
	
	public static Routelink_Up_down valueOf(long value)
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"datex.businfomation",
		"Routelink$Routelink_Up_down"
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
			"up",
			0
		    ),
		    new MemberListElement (
			"down",
			1
		    ),
		    new MemberListElement (
			"no-division",
			2
		    )
		}
	    ),
	    0,
	    up
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Routelink_Up_down object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routelink_Up_down object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routelink_Up_down

    // Methods for field "routelink_Reg_date"
    public UTF8String16 getRoutelink_Reg_date()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setRoutelink_Reg_date(UTF8String16 routelink_Reg_date)
    {
	mComponents[5] = routelink_Reg_date;
    }
    
    
    // Methods for field "routelink_Remark"
    public UTF8String16 getRoutelink_Remark()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setRoutelink_Remark(UTF8String16 routelink_Remark)
    {
	mComponents[6] = routelink_Remark;
    }
    
    public boolean hasRoutelink_Remark()
    {
	return componentIsPresent(6);
    }
    
    public void deleteRoutelink_Remark()
    {
	setComponentAbsent(6);
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
	    "Routelink"
	),
	new QName (
	    "BusInfomation",
	    "Routelink"
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
				    new INTEGER(999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routelink-Sequence",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
					new INTEGER(10),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "routelink-Link-id",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Routelink$Routelink_Station_yn"
			)
		    ),
		    "routelink-Station-yn",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Routelink$Routelink_Up_down"
			)
		    ),
		    "routelink-Up-down",
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
		    "routelink-Reg-date",
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
		    "routelink-Remark",
		    6,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Routelink object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Routelink object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Routelink
