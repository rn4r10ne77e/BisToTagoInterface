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
 * Define the ASN1 Type Route from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Route extends Sequence {
    
    /**
     * The default constructor.
     */
    public Route()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Route(UTF8String16 trnt_Route_id, UTF8String16 route_Route_nm, 
		    Route_Route_ty route_Route_ty, 
		    UTF8String16 route_St_sta_id, 
		    UTF8String16 route_Ed_sta_id, 
		    UTF8String16 route_Md_sta_id, INTEGER route_Perm_vol, 
		    UTF8String16 route_Begin_date, 
		    UTF8String16 route_Close_date, 
		    UTF8String16 route_Route_ex, 
		    UTF8String16 route_Company_id, 
		    UTF8String16 route_Admin_id, INTEGER route_Distance, 
		    INTEGER route_Req_time, INTEGER route_Charge, 
		    UTF8String16 route_Reg_date, UTF8String16 route_Remark)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoute_Route_nm(route_Route_nm);
	setRoute_Route_ty(route_Route_ty);
	setRoute_St_sta_id(route_St_sta_id);
	setRoute_Ed_sta_id(route_Ed_sta_id);
	setRoute_Md_sta_id(route_Md_sta_id);
	setRoute_Perm_vol(route_Perm_vol);
	setRoute_Begin_date(route_Begin_date);
	setRoute_Close_date(route_Close_date);
	setRoute_Route_ex(route_Route_ex);
	setRoute_Company_id(route_Company_id);
	setRoute_Admin_id(route_Admin_id);
	setRoute_Distance(route_Distance);
	setRoute_Req_time(route_Req_time);
	setRoute_Charge(route_Charge);
	setRoute_Reg_date(route_Reg_date);
	setRoute_Remark(route_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Route(UTF8String16 trnt_Route_id, UTF8String16 route_Route_nm, 
		    Route_Route_ty route_Route_ty, 
		    UTF8String16 route_St_sta_id, 
		    UTF8String16 route_Ed_sta_id, 
		    UTF8String16 route_Md_sta_id, long route_Perm_vol, 
		    UTF8String16 route_Begin_date, 
		    UTF8String16 route_Close_date, 
		    UTF8String16 route_Route_ex, 
		    UTF8String16 route_Company_id, 
		    UTF8String16 route_Admin_id, long route_Distance, 
		    long route_Req_time, long route_Charge, 
		    UTF8String16 route_Reg_date, UTF8String16 route_Remark)
    {
	this(trnt_Route_id, route_Route_nm, route_Route_ty, 
	     route_St_sta_id, route_Ed_sta_id, route_Md_sta_id, 
	     new INTEGER(route_Perm_vol), route_Begin_date, 
	     route_Close_date, route_Route_ex, route_Company_id, 
	     route_Admin_id, new INTEGER(route_Distance), 
	     new INTEGER(route_Req_time), new INTEGER(route_Charge), 
	     route_Reg_date, route_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Route(UTF8String16 trnt_Route_id, UTF8String16 route_Route_nm, 
		    Route_Route_ty route_Route_ty, 
		    UTF8String16 route_St_sta_id, 
		    UTF8String16 route_Ed_sta_id, long route_Perm_vol, 
		    UTF8String16 route_Admin_id, long route_Distance, 
		    long route_Req_time, UTF8String16 route_Reg_date)
    {
	setTrnt_Route_id(trnt_Route_id);
	setRoute_Route_nm(route_Route_nm);
	setRoute_Route_ty(route_Route_ty);
	setRoute_St_sta_id(route_St_sta_id);
	setRoute_Ed_sta_id(route_Ed_sta_id);
	setRoute_Perm_vol(route_Perm_vol);
	setRoute_Admin_id(route_Admin_id);
	setRoute_Distance(route_Distance);
	setRoute_Req_time(route_Req_time);
	setRoute_Reg_date(route_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = Route_Route_ty.wide_area_city_bus;
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new INTEGER();
	mComponents[7] = new UTF8String16();
	mComponents[8] = new UTF8String16();
	mComponents[9] = new UTF8String16();
	mComponents[10] = new UTF8String16();
	mComponents[11] = new UTF8String16();
	mComponents[12] = new INTEGER();
	mComponents[13] = new INTEGER();
	mComponents[14] = new INTEGER();
	mComponents[15] = new UTF8String16();
	mComponents[16] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[17];
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
		return Route_Route_ty.wide_area_city_bus;
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new INTEGER();
	    case 7:
		return new UTF8String16();
	    case 8:
		return new UTF8String16();
	    case 9:
		return new UTF8String16();
	    case 10:
		return new UTF8String16();
	    case 11:
		return new UTF8String16();
	    case 12:
		return new INTEGER();
	    case 13:
		return new INTEGER();
	    case 14:
		return new INTEGER();
	    case 15:
		return new UTF8String16();
	    case 16:
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
    
    
    // Methods for field "route_Route_nm"
    public UTF8String16 getRoute_Route_nm()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setRoute_Route_nm(UTF8String16 route_Route_nm)
    {
	mComponents[1] = route_Route_nm;
    }
    
    
    // Methods for field "route_Route_ty"
    public Route_Route_ty getRoute_Route_ty()
    {
	return (Route_Route_ty)mComponents[2];
    }
    
    public void setRoute_Route_ty(Route_Route_ty route_Route_ty)
    {
	mComponents[2] = route_Route_ty;
    }
    
    
    
    /**
     * Define the ASN1 Type Route_Route_ty from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Route_Route_ty extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Route_Route_ty()
	{
	    super(cFirstNumber);
	}
	
	protected Route_Route_ty(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long wide_area_city_bus = 10;
	    public static final long express_seat_city_bus = 11;
	    public static final long seat_city_bus = 12;
	    public static final long public_city_bus = 13;
	    public static final long express_seat_farmbus = 21;
	    public static final long seat_farmbus = 22;
	    public static final long public_farmbus = 23;
	    public static final long town_bus = 30;
	    public static final long express_intercity_bus = 41;
	    public static final long seat_intercity_bus = 42;
	    public static final long public_intercity_bus = 43;
	}
	// Named list definitions.
	private final static Route_Route_ty cNamedNumbers[] = {
	    new Route_Route_ty(), 
	    new Route_Route_ty(11), 
	    new Route_Route_ty(12), 
	    new Route_Route_ty(13), 
	    new Route_Route_ty(21), 
	    new Route_Route_ty(22), 
	    new Route_Route_ty(23), 
	    new Route_Route_ty(30), 
	    new Route_Route_ty(41), 
	    new Route_Route_ty(42), 
	    new Route_Route_ty(43)
	};
	public static final Route_Route_ty wide_area_city_bus = cNamedNumbers[0];
	public static final Route_Route_ty express_seat_city_bus = cNamedNumbers[1];
	public static final Route_Route_ty seat_city_bus = cNamedNumbers[2];
	public static final Route_Route_ty public_city_bus = cNamedNumbers[3];
	public static final Route_Route_ty express_seat_farmbus = cNamedNumbers[4];
	public static final Route_Route_ty seat_farmbus = cNamedNumbers[5];
	public static final Route_Route_ty public_farmbus = cNamedNumbers[6];
	public static final Route_Route_ty town_bus = cNamedNumbers[7];
	public static final Route_Route_ty express_intercity_bus = cNamedNumbers[8];
	public static final Route_Route_ty seat_intercity_bus = cNamedNumbers[9];
	public static final Route_Route_ty public_intercity_bus = cNamedNumbers[10];
	
	protected final static long cFirstNumber = 10;
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
	    if (value >= 10 && value <= 13)
		return (int)(value - 10);
	    if (value >= 21 && value <= 23)
		return (int)(value - 17);
	    if (value == 30)
		return 7;
	    if (value >= 41 && value <= 43)
		return (int)(value - 33);
	    else
		return -1;
	}
	
	/**
	 * Returns the enumerator with the specified value or null if the value
	 * is not associated with any enumerator.
	 *  @param value The value of the enumerator to return.
	 *  @return The enumerator with the specified value.
	 */
	
	public static Route_Route_ty valueOf(long value)
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
		"Route$Route_Route_ty"
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
			"wide-area-city-bus",
			10
		    ),
		    new MemberListElement (
			"express-seat-city-bus",
			11
		    ),
		    new MemberListElement (
			"seat-city-bus",
			12
		    ),
		    new MemberListElement (
			"public-city-bus",
			13
		    ),
		    new MemberListElement (
			"express-seat-farmbus",
			21
		    ),
		    new MemberListElement (
			"seat-farmbus",
			22
		    ),
		    new MemberListElement (
			"public-farmbus",
			23
		    ),
		    new MemberListElement (
			"town-bus",
			30
		    ),
		    new MemberListElement (
			"express-intercity-bus",
			41
		    ),
		    new MemberListElement (
			"seat-intercity-bus",
			42
		    ),
		    new MemberListElement (
			"public-intercity-bus",
			43
		    )
		}
	    ),
	    0,
	    wide_area_city_bus
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Route_Route_ty object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Route_Route_ty object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Route_Route_ty

    // Methods for field "route_St_sta_id"
    public UTF8String16 getRoute_St_sta_id()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setRoute_St_sta_id(UTF8String16 route_St_sta_id)
    {
	mComponents[3] = route_St_sta_id;
    }
    
    
    // Methods for field "route_Ed_sta_id"
    public UTF8String16 getRoute_Ed_sta_id()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setRoute_Ed_sta_id(UTF8String16 route_Ed_sta_id)
    {
	mComponents[4] = route_Ed_sta_id;
    }
    
    
    // Methods for field "route_Md_sta_id"
    public UTF8String16 getRoute_Md_sta_id()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setRoute_Md_sta_id(UTF8String16 route_Md_sta_id)
    {
	mComponents[5] = route_Md_sta_id;
    }
    
    public boolean hasRoute_Md_sta_id()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRoute_Md_sta_id()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "route_Perm_vol"
    public long getRoute_Perm_vol()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setRoute_Perm_vol(long route_Perm_vol)
    {
	setRoute_Perm_vol(new INTEGER(route_Perm_vol));
    }
    
    public void setRoute_Perm_vol(INTEGER route_Perm_vol)
    {
	mComponents[6] = route_Perm_vol;
    }
    
    
    // Methods for field "route_Begin_date"
    public UTF8String16 getRoute_Begin_date()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setRoute_Begin_date(UTF8String16 route_Begin_date)
    {
	mComponents[7] = route_Begin_date;
    }
    
    public boolean hasRoute_Begin_date()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRoute_Begin_date()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "route_Close_date"
    public UTF8String16 getRoute_Close_date()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setRoute_Close_date(UTF8String16 route_Close_date)
    {
	mComponents[8] = route_Close_date;
    }
    
    public boolean hasRoute_Close_date()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRoute_Close_date()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "route_Route_ex"
    public UTF8String16 getRoute_Route_ex()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setRoute_Route_ex(UTF8String16 route_Route_ex)
    {
	mComponents[9] = route_Route_ex;
    }
    
    public boolean hasRoute_Route_ex()
    {
	return componentIsPresent(9);
    }
    
    public void deleteRoute_Route_ex()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "route_Company_id"
    public UTF8String16 getRoute_Company_id()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setRoute_Company_id(UTF8String16 route_Company_id)
    {
	mComponents[10] = route_Company_id;
    }
    
    public boolean hasRoute_Company_id()
    {
	return componentIsPresent(10);
    }
    
    public void deleteRoute_Company_id()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "route_Admin_id"
    public UTF8String16 getRoute_Admin_id()
    {
	return (UTF8String16)mComponents[11];
    }
    
    public void setRoute_Admin_id(UTF8String16 route_Admin_id)
    {
	mComponents[11] = route_Admin_id;
    }
    
    
    // Methods for field "route_Distance"
    public long getRoute_Distance()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setRoute_Distance(long route_Distance)
    {
	setRoute_Distance(new INTEGER(route_Distance));
    }
    
    public void setRoute_Distance(INTEGER route_Distance)
    {
	mComponents[12] = route_Distance;
    }
    
    
    // Methods for field "route_Req_time"
    public long getRoute_Req_time()
    {
	return ((INTEGER)mComponents[13]).longValue();
    }
    
    public void setRoute_Req_time(long route_Req_time)
    {
	setRoute_Req_time(new INTEGER(route_Req_time));
    }
    
    public void setRoute_Req_time(INTEGER route_Req_time)
    {
	mComponents[13] = route_Req_time;
    }
    
    
    // Methods for field "route_Charge"
    public long getRoute_Charge()
    {
	return ((INTEGER)mComponents[14]).longValue();
    }
    
    public void setRoute_Charge(long route_Charge)
    {
	setRoute_Charge(new INTEGER(route_Charge));
    }
    
    public void setRoute_Charge(INTEGER route_Charge)
    {
	mComponents[14] = route_Charge;
    }
    
    public boolean hasRoute_Charge()
    {
	return componentIsPresent(14);
    }
    
    public void deleteRoute_Charge()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "route_Reg_date"
    public UTF8String16 getRoute_Reg_date()
    {
	return (UTF8String16)mComponents[15];
    }
    
    public void setRoute_Reg_date(UTF8String16 route_Reg_date)
    {
	mComponents[15] = route_Reg_date;
    }
    
    
    // Methods for field "route_Remark"
    public UTF8String16 getRoute_Remark()
    {
	return (UTF8String16)mComponents[16];
    }
    
    public void setRoute_Remark(UTF8String16 route_Remark)
    {
	mComponents[16] = route_Remark;
    }
    
    public boolean hasRoute_Remark()
    {
	return componentIsPresent(16);
    }
    
    public void deleteRoute_Remark()
    {
	setComponentAbsent(16);
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
	    "Route"
	),
	new QName (
	    "BusInfomation",
	    "Route"
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
					new INTEGER(30),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "route-Route-nm",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Route$Route_Route_ty"
			)
		    ),
		    "route-Route-ty",
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
		    "route-St-sta-id",
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
		    "route-Ed-sta-id",
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
					new INTEGER(9),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "route-Md-sta-id",
		    5,
		    3,
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
				    new INTEGER(999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "route-Perm-vol",
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
		    "route-Begin-date",
		    7,
		    3,
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
		    "route-Close-date",
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
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(20),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "route-Route-ex",
		    9,
		    3,
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
					new INTEGER(9),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "route-Company-id",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "route-Admin-id",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "route-Distance",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
				    new INTEGER(9999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "route-Req-time",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
				    new INTEGER(99999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "route-Charge",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    "route-Reg-date",
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
		    "route-Remark",
		    16,
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
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Route object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Route object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Route
