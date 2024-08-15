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
 * Define the ASN1 Type Station from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Station extends Sequence {
    
    /**
     * The default constructor.
     */
    public Station()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Station(UTF8String16 trnt_Station_id, 
		    UTF8String16 station_Station_knm, 
		    Station_Station_tp station_Station_tp, 
		    Station_Center_yn station_Center_yn, 
		    UTF8String16 station_Admin_id, 
		    UTF8String16 station_Station_enm, 
		    NMEACoord station_Coordinate, 
		    UTF8String16 station_Install_link_id, 
		    UTF8String16 station_Reg_date, 
		    UTF8String16 station_Remark)
    {
	setTrnt_Station_id(trnt_Station_id);
	setStation_Station_knm(station_Station_knm);
	setStation_Station_tp(station_Station_tp);
	setStation_Center_yn(station_Center_yn);
	setStation_Admin_id(station_Admin_id);
	setStation_Station_enm(station_Station_enm);
	setStation_Coordinate(station_Coordinate);
	setStation_Install_link_id(station_Install_link_id);
	setStation_Reg_date(station_Reg_date);
	setStation_Remark(station_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Station(UTF8String16 trnt_Station_id, 
		    UTF8String16 station_Station_knm, 
		    Station_Station_tp station_Station_tp, 
		    Station_Center_yn station_Center_yn, 
		    UTF8String16 station_Admin_id, 
		    NMEACoord station_Coordinate, 
		    UTF8String16 station_Install_link_id, 
		    UTF8String16 station_Reg_date)
    {
	setTrnt_Station_id(trnt_Station_id);
	setStation_Station_knm(station_Station_knm);
	setStation_Station_tp(station_Station_tp);
	setStation_Center_yn(station_Center_yn);
	setStation_Admin_id(station_Admin_id);
	setStation_Coordinate(station_Coordinate);
	setStation_Install_link_id(station_Install_link_id);
	setStation_Reg_date(station_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = Station_Station_tp._public;
	mComponents[3] = Station_Center_yn.side;
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new NMEACoord();
	mComponents[7] = new UTF8String16();
	mComponents[8] = new UTF8String16();
	mComponents[9] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
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
		return Station_Station_tp._public;
	    case 3:
		return Station_Center_yn.side;
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new NMEACoord();
	    case 7:
		return new UTF8String16();
	    case 8:
		return new UTF8String16();
	    case 9:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Station_id"
    public UTF8String16 getTrnt_Station_id()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Station_id(UTF8String16 trnt_Station_id)
    {
	mComponents[0] = trnt_Station_id;
    }
    
    
    // Methods for field "station_Station_knm"
    public UTF8String16 getStation_Station_knm()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setStation_Station_knm(UTF8String16 station_Station_knm)
    {
	mComponents[1] = station_Station_knm;
    }
    
    
    // Methods for field "station_Station_tp"
    public Station_Station_tp getStation_Station_tp()
    {
	return (Station_Station_tp)mComponents[2];
    }
    
    public void setStation_Station_tp(Station_Station_tp station_Station_tp)
    {
	mComponents[2] = station_Station_tp;
    }
    
    
    
    /**
     * Define the ASN1 Type Station_Station_tp from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Station_Station_tp extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Station_Station_tp()
	{
	    super(cFirstNumber);
	}
	
	protected Station_Station_tp(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long _public = 0;
	    public static final long public_city_farmbus = 1;
	    public static final long seat_city_farmbus = 2;
	    public static final long express_seat_city_farmbus = 3;
	    public static final long public_intercity = 4;
	    public static final long seat_intercity = 5;
	    public static final long express_intercity = 6;
	    public static final long townbus = 7;
	}
	// Named list definitions.
	private final static Station_Station_tp cNamedNumbers[] = {
	    new Station_Station_tp(), 
	    new Station_Station_tp(1), 
	    new Station_Station_tp(2), 
	    new Station_Station_tp(3), 
	    new Station_Station_tp(4), 
	    new Station_Station_tp(5), 
	    new Station_Station_tp(6), 
	    new Station_Station_tp(7)
	};
	public static final Station_Station_tp _public = cNamedNumbers[0];
	public static final Station_Station_tp public_city_farmbus = cNamedNumbers[1];
	public static final Station_Station_tp seat_city_farmbus = cNamedNumbers[2];
	public static final Station_Station_tp express_seat_city_farmbus = cNamedNumbers[3];
	public static final Station_Station_tp public_intercity = cNamedNumbers[4];
	public static final Station_Station_tp seat_intercity = cNamedNumbers[5];
	public static final Station_Station_tp express_intercity = cNamedNumbers[6];
	public static final Station_Station_tp townbus = cNamedNumbers[7];
	
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
	    if (value >= 0 && value <= 7)
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
	
	public static Station_Station_tp valueOf(long value)
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
		"Station$Station_Station_tp"
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
			"public",
			0
		    ),
		    new MemberListElement (
			"public-city-farmbus",
			1
		    ),
		    new MemberListElement (
			"seat-city-farmbus",
			2
		    ),
		    new MemberListElement (
			"express-seat-city-farmbus",
			3
		    ),
		    new MemberListElement (
			"public-intercity",
			4
		    ),
		    new MemberListElement (
			"seat-intercity",
			5
		    ),
		    new MemberListElement (
			"express-intercity",
			6
		    ),
		    new MemberListElement (
			"townbus",
			7
		    )
		}
	    ),
	    0,
	    _public
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Station_Station_tp object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Station_Station_tp object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Station_Station_tp

    // Methods for field "station_Center_yn"
    public Station_Center_yn getStation_Center_yn()
    {
	return (Station_Center_yn)mComponents[3];
    }
    
    public void setStation_Center_yn(Station_Center_yn station_Center_yn)
    {
	mComponents[3] = station_Center_yn;
    }
    
    
    
    /**
     * Define the ASN1 Type Station_Center_yn from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Station_Center_yn extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Station_Center_yn()
	{
	    super(cFirstNumber);
	}
	
	protected Station_Center_yn(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long side = 0;
	    public static final long mid = 1;
	}
	// Named list definitions.
	private final static Station_Center_yn cNamedNumbers[] = {
	    new Station_Center_yn(), 
	    new Station_Center_yn(1)
	};
	public static final Station_Center_yn side = cNamedNumbers[0];
	public static final Station_Center_yn mid = cNamedNumbers[1];
	
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
	
	public static Station_Center_yn valueOf(long value)
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
		"Station$Station_Center_yn"
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
			"side",
			0
		    ),
		    new MemberListElement (
			"mid",
			1
		    )
		}
	    ),
	    0,
	    side
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Station_Center_yn object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Station_Center_yn object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Station_Center_yn

    // Methods for field "station_Admin_id"
    public UTF8String16 getStation_Admin_id()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setStation_Admin_id(UTF8String16 station_Admin_id)
    {
	mComponents[4] = station_Admin_id;
    }
    
    
    // Methods for field "station_Station_enm"
    public UTF8String16 getStation_Station_enm()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setStation_Station_enm(UTF8String16 station_Station_enm)
    {
	mComponents[5] = station_Station_enm;
    }
    
    public boolean hasStation_Station_enm()
    {
	return componentIsPresent(5);
    }
    
    public void deleteStation_Station_enm()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "station_Coordinate"
    public NMEACoord getStation_Coordinate()
    {
	return (NMEACoord)mComponents[6];
    }
    
    public void setStation_Coordinate(NMEACoord station_Coordinate)
    {
	mComponents[6] = station_Coordinate;
    }
    
    
    // Methods for field "station_Install_link_id"
    public UTF8String16 getStation_Install_link_id()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setStation_Install_link_id(UTF8String16 station_Install_link_id)
    {
	mComponents[7] = station_Install_link_id;
    }
    
    
    // Methods for field "station_Reg_date"
    public UTF8String16 getStation_Reg_date()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setStation_Reg_date(UTF8String16 station_Reg_date)
    {
	mComponents[8] = station_Reg_date;
    }
    
    
    // Methods for field "station_Remark"
    public UTF8String16 getStation_Remark()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setStation_Remark(UTF8String16 station_Remark)
    {
	mComponents[9] = station_Remark;
    }
    
    public boolean hasStation_Remark()
    {
	return componentIsPresent(9);
    }
    
    public void deleteStation_Remark()
    {
	setComponentAbsent(9);
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
	    "Station"
	),
	new QName (
	    "BusInfomation",
	    "Station"
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
		    "trnt-Station-id",
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
		    "station-Station-knm",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Station$Station_Station_tp"
			)
		    ),
		    "station-Station-tp",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "Station$Station_Center_yn"
			)
		    ),
		    "station-Center-yn",
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "station-Admin-id",
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
					new INTEGER(100),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "station-Station-enm",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"datex.businfomation",
				"NMEACoord"
			    ),
			    new QName (
				"BusInfomation",
				"NMEACoord"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.businfomation",
				    "NMEACoord"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.businfomation",
				    "NMEACoord"
				)
			    ),
			    0
			)
		    ),
		    "station-Coordinate",
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
					new INTEGER(10),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "station-Install-link-id",
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
		    "station-Reg-date",
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
		    "station-Remark",
		    9,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Station object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Station object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Station
