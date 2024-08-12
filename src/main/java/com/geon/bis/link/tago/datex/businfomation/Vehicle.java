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
 * Define the ASN1 Type Vehicle from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Vehicle extends Sequence {
    
    /**
     * The default constructor.
     */
    public Vehicle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Vehicle(UTF8String16 trnt_Veh_id, UTF8String16 vehicle_Plat_no, 
		    Vehicle_Veh_tp vehicle_Veh_tp, 
		    Vehicle_Bus_tp vehicle_Bus_tp, INTEGER vehicle_Veh_capa, 
		    UTF8String16 vehicle_Admin_id, 
		    UTF8String16 vehicle_Company_id, 
		    UTF8String16 vehicle_Reg_date, 
		    UTF8String16 vehicle_Remark)
    {
	setTrnt_Veh_id(trnt_Veh_id);
	setVehicle_Plat_no(vehicle_Plat_no);
	setVehicle_Veh_tp(vehicle_Veh_tp);
	setVehicle_Bus_tp(vehicle_Bus_tp);
	setVehicle_Veh_capa(vehicle_Veh_capa);
	setVehicle_Admin_id(vehicle_Admin_id);
	setVehicle_Company_id(vehicle_Company_id);
	setVehicle_Reg_date(vehicle_Reg_date);
	setVehicle_Remark(vehicle_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Vehicle(UTF8String16 trnt_Veh_id, UTF8String16 vehicle_Plat_no, 
		    Vehicle_Veh_tp vehicle_Veh_tp, 
		    Vehicle_Bus_tp vehicle_Bus_tp, long vehicle_Veh_capa, 
		    UTF8String16 vehicle_Admin_id, 
		    UTF8String16 vehicle_Company_id, 
		    UTF8String16 vehicle_Reg_date, 
		    UTF8String16 vehicle_Remark)
    {
	this(trnt_Veh_id, vehicle_Plat_no, vehicle_Veh_tp, vehicle_Bus_tp, 
	     new INTEGER(vehicle_Veh_capa), vehicle_Admin_id, 
	     vehicle_Company_id, vehicle_Reg_date, vehicle_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Vehicle(UTF8String16 trnt_Veh_id, UTF8String16 vehicle_Plat_no, 
		    Vehicle_Veh_tp vehicle_Veh_tp, 
		    Vehicle_Bus_tp vehicle_Bus_tp, long vehicle_Veh_capa, 
		    UTF8String16 vehicle_Admin_id, 
		    UTF8String16 vehicle_Reg_date)
    {
	setTrnt_Veh_id(trnt_Veh_id);
	setVehicle_Plat_no(vehicle_Plat_no);
	setVehicle_Veh_tp(vehicle_Veh_tp);
	setVehicle_Bus_tp(vehicle_Bus_tp);
	setVehicle_Veh_capa(vehicle_Veh_capa);
	setVehicle_Admin_id(vehicle_Admin_id);
	setVehicle_Reg_date(vehicle_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = Vehicle_Veh_tp.compactbus;
	mComponents[3] = Vehicle_Bus_tp.commonbus;
	mComponents[4] = new INTEGER();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new UTF8String16();
	mComponents[8] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
	    case 2:
		return Vehicle_Veh_tp.compactbus;
	    case 3:
		return Vehicle_Bus_tp.commonbus;
	    case 4:
		return new INTEGER();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new UTF8String16();
	    case 7:
		return new UTF8String16();
	    case 8:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Veh_id"
    public UTF8String16 getTrnt_Veh_id()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Veh_id(UTF8String16 trnt_Veh_id)
    {
	mComponents[0] = trnt_Veh_id;
    }
    
    
    // Methods for field "vehicle_Plat_no"
    public UTF8String16 getVehicle_Plat_no()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setVehicle_Plat_no(UTF8String16 vehicle_Plat_no)
    {
	mComponents[1] = vehicle_Plat_no;
    }
    
    
    // Methods for field "vehicle_Veh_tp"
    public Vehicle_Veh_tp getVehicle_Veh_tp()
    {
	return (Vehicle_Veh_tp)mComponents[2];
    }
    
    public void setVehicle_Veh_tp(Vehicle_Veh_tp vehicle_Veh_tp)
    {
	mComponents[2] = vehicle_Veh_tp;
    }
    
    
    
    /**
     * Define the ASN1 Type Vehicle_Veh_tp from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Vehicle_Veh_tp extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Vehicle_Veh_tp()
	{
	    super(cFirstNumber);
	}
	
	protected Vehicle_Veh_tp(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long compactbus = 0;
	    public static final long smallbus = 1;
	    public static final long middlebus = 2;
	    public static final long bigbus = 3;
	}
	// Named list definitions.
	private final static Vehicle_Veh_tp cNamedNumbers[] = {
	    new Vehicle_Veh_tp(), 
	    new Vehicle_Veh_tp(1), 
	    new Vehicle_Veh_tp(2), 
	    new Vehicle_Veh_tp(3)
	};
	public static final Vehicle_Veh_tp compactbus = cNamedNumbers[0];
	public static final Vehicle_Veh_tp smallbus = cNamedNumbers[1];
	public static final Vehicle_Veh_tp middlebus = cNamedNumbers[2];
	public static final Vehicle_Veh_tp bigbus = cNamedNumbers[3];
	
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
	    if (value >= 0 && value <= 3)
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
	
	public static Vehicle_Veh_tp valueOf(long value)
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"datex.businfomation",
		"Vehicle$Vehicle_Veh_tp"
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
			"compactbus",
			0
		    ),
		    new MemberListElement (
			"smallbus",
			1
		    ),
		    new MemberListElement (
			"middlebus",
			2
		    ),
		    new MemberListElement (
			"bigbus",
			3
		    )
		}
	    ),
	    0,
	    compactbus
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Vehicle_Veh_tp object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Vehicle_Veh_tp object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Vehicle_Veh_tp

    // Methods for field "vehicle_Bus_tp"
    public Vehicle_Bus_tp getVehicle_Bus_tp()
    {
	return (Vehicle_Bus_tp)mComponents[3];
    }
    
    public void setVehicle_Bus_tp(Vehicle_Bus_tp vehicle_Bus_tp)
    {
	mComponents[3] = vehicle_Bus_tp;
    }
    
    
    
    /**
     * Define the ASN1 Type Vehicle_Bus_tp from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Vehicle_Bus_tp extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Vehicle_Bus_tp()
	{
	    super(cFirstNumber);
	}
	
	protected Vehicle_Bus_tp(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long commonbus = 0;
	    public static final long lowplatbus = 1;
	    public static final long doubledecker = 2;
	    public static final long dendybus = 3;
	}
	// Named list definitions.
	private final static Vehicle_Bus_tp cNamedNumbers[] = {
	    new Vehicle_Bus_tp(), 
	    new Vehicle_Bus_tp(1), 
	    new Vehicle_Bus_tp(2), 
	    new Vehicle_Bus_tp(3)
	};
	public static final Vehicle_Bus_tp commonbus = cNamedNumbers[0];
	public static final Vehicle_Bus_tp lowplatbus = cNamedNumbers[1];
	public static final Vehicle_Bus_tp doubledecker = cNamedNumbers[2];
	public static final Vehicle_Bus_tp dendybus = cNamedNumbers[3];
	
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
	    if (value >= 0 && value <= 3)
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
	
	public static Vehicle_Bus_tp valueOf(long value)
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
		"Vehicle$Vehicle_Bus_tp"
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
			"commonbus",
			0
		    ),
		    new MemberListElement (
			"lowplatbus",
			1
		    ),
		    new MemberListElement (
			"doubledecker",
			2
		    ),
		    new MemberListElement (
			"dendybus",
			3
		    )
		}
	    ),
	    0,
	    commonbus
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Vehicle_Bus_tp object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Vehicle_Bus_tp object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Vehicle_Bus_tp

    // Methods for field "vehicle_Veh_capa"
    public long getVehicle_Veh_capa()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setVehicle_Veh_capa(long vehicle_Veh_capa)
    {
	setVehicle_Veh_capa(new INTEGER(vehicle_Veh_capa));
    }
    
    public void setVehicle_Veh_capa(INTEGER vehicle_Veh_capa)
    {
	mComponents[4] = vehicle_Veh_capa;
    }
    
    
    // Methods for field "vehicle_Admin_id"
    public UTF8String16 getVehicle_Admin_id()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setVehicle_Admin_id(UTF8String16 vehicle_Admin_id)
    {
	mComponents[5] = vehicle_Admin_id;
    }
    
    
    // Methods for field "vehicle_Company_id"
    public UTF8String16 getVehicle_Company_id()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setVehicle_Company_id(UTF8String16 vehicle_Company_id)
    {
	mComponents[6] = vehicle_Company_id;
    }
    
    public boolean hasVehicle_Company_id()
    {
	return componentIsPresent(6);
    }
    
    public void deleteVehicle_Company_id()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "vehicle_Reg_date"
    public UTF8String16 getVehicle_Reg_date()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setVehicle_Reg_date(UTF8String16 vehicle_Reg_date)
    {
	mComponents[7] = vehicle_Reg_date;
    }
    
    
    // Methods for field "vehicle_Remark"
    public UTF8String16 getVehicle_Remark()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setVehicle_Remark(UTF8String16 vehicle_Remark)
    {
	mComponents[8] = vehicle_Remark;
    }
    
    public boolean hasVehicle_Remark()
    {
	return componentIsPresent(8);
    }
    
    public void deleteVehicle_Remark()
    {
	setComponentAbsent(8);
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
	    "Vehicle"
	),
	new QName (
	    "BusInfomation",
	    "Vehicle"
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
		    "trnt-Veh-id",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
					new INTEGER(12),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "vehicle-Plat-no",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Vehicle$Vehicle_Veh_tp"
			)
		    ),
		    "vehicle-Veh-tp",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Vehicle$Vehicle_Bus_tp"
			)
		    ),
		    "vehicle-Bus-tp",
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
				    new INTEGER(999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "vehicle-Veh-capa",
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
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "vehicle-Admin-id",
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
					new INTEGER(9),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "vehicle-Company-id",
		    6,
		    3,
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
		    "vehicle-Reg-date",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "vehicle-Remark",
		    8,
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
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Vehicle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Vehicle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Vehicle
