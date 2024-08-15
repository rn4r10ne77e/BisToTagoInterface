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
 * Define the ASN1 Type Routestation from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Routestation extends Sequence {
    
    /**
     * The default constructor.
     */
    public Routestation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Routestation(UTF8String16 trnt_Route_id, 
		    INTEGER routestation_Sequence, 
		    UTF8String16 routestation_Station_id, 
		    Routestation_Up_down routestation_Up_down, 
		    INTEGER routestation_Sum_dist, 
		    INTEGER routestation_Remain_dist, 
		    INTEGER routestation_Stat_dist, 
		    INTEGER routestation_Next_dist, 
		    Routestation_Stat_tp routestation_Stat_tp, 
		    UTF8String16 routestation_Reg_date, 
		    UTF8String16 routestation_Remark)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoutestation_Sequence(routestation_Sequence);
	setRoutestation_Station_id(routestation_Station_id);
	setRoutestation_Up_down(routestation_Up_down);
	setRoutestation_Sum_dist(routestation_Sum_dist);
	setRoutestation_Remain_dist(routestation_Remain_dist);
	setRoutestation_Stat_dist(routestation_Stat_dist);
	setRoutestation_Next_dist(routestation_Next_dist);
	setRoutestation_Stat_tp(routestation_Stat_tp);
	setRoutestation_Reg_date(routestation_Reg_date);
	setRoutestation_Remark(routestation_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Routestation(UTF8String16 trnt_Route_id, 
		    long routestation_Sequence, 
		    UTF8String16 routestation_Station_id, 
		    Routestation_Up_down routestation_Up_down, 
		    long routestation_Sum_dist, long routestation_Remain_dist, 
		    long routestation_Stat_dist, long routestation_Next_dist, 
		    Routestation_Stat_tp routestation_Stat_tp, 
		    UTF8String16 routestation_Reg_date, 
		    UTF8String16 routestation_Remark)
    {
	this(trnt_Route_id, new INTEGER(routestation_Sequence), 
	     routestation_Station_id, routestation_Up_down, 
	     new INTEGER(routestation_Sum_dist), 
	     new INTEGER(routestation_Remain_dist), 
	     new INTEGER(routestation_Stat_dist), 
	     new INTEGER(routestation_Next_dist), routestation_Stat_tp, 
	     routestation_Reg_date, routestation_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Routestation(UTF8String16 trnt_Route_id, 
		    long routestation_Sequence, 
		    UTF8String16 routestation_Station_id, 
		    Routestation_Up_down routestation_Up_down, 
		    long routestation_Sum_dist, long routestation_Remain_dist, 
		    long routestation_Stat_dist, long routestation_Next_dist, 
		    Routestation_Stat_tp routestation_Stat_tp, 
		    UTF8String16 routestation_Reg_date)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoutestation_Sequence(routestation_Sequence);
	setRoutestation_Station_id(routestation_Station_id);
	setRoutestation_Up_down(routestation_Up_down);
	setRoutestation_Sum_dist(routestation_Sum_dist);
	setRoutestation_Remain_dist(routestation_Remain_dist);
	setRoutestation_Stat_dist(routestation_Stat_dist);
	setRoutestation_Next_dist(routestation_Next_dist);
	setRoutestation_Stat_tp(routestation_Stat_tp);
	setRoutestation_Reg_date(routestation_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new UTF8String16();
	mComponents[3] = Routestation_Up_down.up;
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = Routestation_Stat_tp.common;
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
		return new INTEGER();
	    case 2:
		return new UTF8String16();
	    case 3:
		return Routestation_Up_down.up;
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return Routestation_Stat_tp.common;
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
    
    
    // Methods for field "routestation_Sequence"
    public long getRoutestation_Sequence()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setRoutestation_Sequence(long routestation_Sequence)
    {
	setRoutestation_Sequence(new INTEGER(routestation_Sequence));
    }
    
    public void setRoutestation_Sequence(INTEGER routestation_Sequence)
    {
	mComponents[1] = routestation_Sequence;
    }
    
    
    // Methods for field "routestation_Station_id"
    public UTF8String16 getRoutestation_Station_id()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setRoutestation_Station_id(UTF8String16 routestation_Station_id)
    {
	mComponents[2] = routestation_Station_id;
    }
    
    
    // Methods for field "routestation_Up_down"
    public Routestation_Up_down getRoutestation_Up_down()
    {
	return (Routestation_Up_down)mComponents[3];
    }
    
    public void setRoutestation_Up_down(Routestation_Up_down routestation_Up_down)
    {
	mComponents[3] = routestation_Up_down;
    }
    
    
    
    /**
     * Define the ASN1 Type Routestation_Up_down from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routestation_Up_down extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routestation_Up_down()
	{
	    super(cFirstNumber);
	}
	
	protected Routestation_Up_down(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long up = 0;
	    public static final long down = 1;
	    public static final long no_division = 2;
	}
	// Named list definitions.
	private final static Routestation_Up_down cNamedNumbers[] = {
	    new Routestation_Up_down(), 
	    new Routestation_Up_down(1), 
	    new Routestation_Up_down(2)
	};
	public static final Routestation_Up_down up = cNamedNumbers[0];
	public static final Routestation_Up_down down = cNamedNumbers[1];
	public static final Routestation_Up_down no_division = cNamedNumbers[2];
	
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
	
	public static Routestation_Up_down valueOf(long value)
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
		"Routestation$Routestation_Up_down"
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
	 * Get the type descriptor (TypeInfo) of 'this' Routestation_Up_down object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routestation_Up_down object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routestation_Up_down

    // Methods for field "routestation_Sum_dist"
    public long getRoutestation_Sum_dist()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setRoutestation_Sum_dist(long routestation_Sum_dist)
    {
	setRoutestation_Sum_dist(new INTEGER(routestation_Sum_dist));
    }
    
    public void setRoutestation_Sum_dist(INTEGER routestation_Sum_dist)
    {
	mComponents[4] = routestation_Sum_dist;
    }
    
    
    // Methods for field "routestation_Remain_dist"
    public long getRoutestation_Remain_dist()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setRoutestation_Remain_dist(long routestation_Remain_dist)
    {
	setRoutestation_Remain_dist(new INTEGER(routestation_Remain_dist));
    }
    
    public void setRoutestation_Remain_dist(INTEGER routestation_Remain_dist)
    {
	mComponents[5] = routestation_Remain_dist;
    }
    
    
    // Methods for field "routestation_Stat_dist"
    public long getRoutestation_Stat_dist()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setRoutestation_Stat_dist(long routestation_Stat_dist)
    {
	setRoutestation_Stat_dist(new INTEGER(routestation_Stat_dist));
    }
    
    public void setRoutestation_Stat_dist(INTEGER routestation_Stat_dist)
    {
	mComponents[6] = routestation_Stat_dist;
    }
    
    
    // Methods for field "routestation_Next_dist"
    public long getRoutestation_Next_dist()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setRoutestation_Next_dist(long routestation_Next_dist)
    {
	setRoutestation_Next_dist(new INTEGER(routestation_Next_dist));
    }
    
    public void setRoutestation_Next_dist(INTEGER routestation_Next_dist)
    {
	mComponents[7] = routestation_Next_dist;
    }
    
    
    // Methods for field "routestation_Stat_tp"
    public Routestation_Stat_tp getRoutestation_Stat_tp()
    {
	return (Routestation_Stat_tp)mComponents[8];
    }
    
    public void setRoutestation_Stat_tp(Routestation_Stat_tp routestation_Stat_tp)
    {
	mComponents[8] = routestation_Stat_tp;
    }
    
    
    
    /**
     * Define the ASN1 Type Routestation_Stat_tp from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Routestation_Stat_tp extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Routestation_Stat_tp()
	{
	    super(cFirstNumber);
	}
	
	protected Routestation_Stat_tp(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long common = 0;
	    public static final long start = 1;
	    public static final long _return = 2;
	    public static final long last = 3;
	    public static final long cross = 4;
	}
	// Named list definitions.
	private final static Routestation_Stat_tp cNamedNumbers[] = {
	    new Routestation_Stat_tp(), 
	    new Routestation_Stat_tp(1), 
	    new Routestation_Stat_tp(2), 
	    new Routestation_Stat_tp(3), 
	    new Routestation_Stat_tp(4)
	};
	public static final Routestation_Stat_tp common = cNamedNumbers[0];
	public static final Routestation_Stat_tp start = cNamedNumbers[1];
	public static final Routestation_Stat_tp _return = cNamedNumbers[2];
	public static final Routestation_Stat_tp last = cNamedNumbers[3];
	public static final Routestation_Stat_tp cross = cNamedNumbers[4];
	
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
	
	public static Routestation_Stat_tp valueOf(long value)
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
		    (short)0x8008
		}
	    ),
	    new QName (
		"datex.businfomation",
		"Routestation$Routestation_Stat_tp"
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
			"common",
			0
		    ),
		    new MemberListElement (
			"start",
			1
		    ),
		    new MemberListElement (
			"return",
			2
		    ),
		    new MemberListElement (
			"last",
			3
		    ),
		    new MemberListElement (
			"cross",
			4
		    )
		}
	    ),
	    0,
	    common
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Routestation_Stat_tp object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Routestation_Stat_tp object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Routestation_Stat_tp

    // Methods for field "routestation_Reg_date"
    public UTF8String16 getRoutestation_Reg_date()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setRoutestation_Reg_date(UTF8String16 routestation_Reg_date)
    {
	mComponents[9] = routestation_Reg_date;
    }
    
    
    // Methods for field "routestation_Remark"
    public UTF8String16 getRoutestation_Remark()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setRoutestation_Remark(UTF8String16 routestation_Remark)
    {
	mComponents[10] = routestation_Remark;
    }
    
    public boolean hasRoutestation_Remark()
    {
	return componentIsPresent(10);
    }
    
    public void deleteRoutestation_Remark()
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
	    "Routestation"
	),
	new QName (
	    "BusInfomation",
	    "Routestation"
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
		    "routestation-Sequence",
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
		    "routestation-Station-id",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Routestation$Routestation_Up_down"
			)
		    ),
		    "routestation-Up-down",
		    3,
		    2,
		    null
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
				    new INTEGER(999999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routestation-Sum-dist",
		    4,
		    2,
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
				    new INTEGER(999999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routestation-Remain-dist",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				    new INTEGER(999999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routestation-Stat-dist",
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
				    new INTEGER(999999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "routestation-Next-dist",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Routestation$Routestation_Stat_tp"
			)
		    ),
		    "routestation-Stat-tp",
		    8,
		    2,
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
		    "routestation-Reg-date",
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
		    "routestation-Remark",
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
			new TagDecoderElement((short)0x8008, 8)
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
     * Get the type descriptor (TypeInfo) of 'this' Routestation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Routestation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Routestation
