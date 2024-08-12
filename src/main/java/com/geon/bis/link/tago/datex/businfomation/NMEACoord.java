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
 * Define the ASN1 Type NMEACoord from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class NMEACoord extends Sequence {
    
    /**
     * The default constructor.
     */
    public NMEACoord()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NMEACoord(Latitude latitude, Longitude longitude, 
		    OctetString optData)
    {
	setLatitude(latitude);
	setLongitude(longitude);
	setOptData(optData);
    }
    
    /**
     * Construct with required components.
     */
    public NMEACoord(Latitude latitude, Longitude longitude)
    {
	setLatitude(latitude);
	setLongitude(longitude);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Latitude();
	mComponents[1] = new Longitude();
	mComponents[2] = new OctetString();
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
		return new Latitude();
	    case 1:
		return new Longitude();
	    case 2:
		return new OctetString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "latitude"
    public Latitude getLatitude()
    {
	return (Latitude)mComponents[0];
    }
    
    public void setLatitude(Latitude latitude)
    {
	mComponents[0] = latitude;
    }
    
    
    
    /**
     * Define the ASN1 Type Latitude from ASN1 Module BusInfomation.
     * @see Sequence
     */
    public static class Latitude extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Latitude()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Latitude(INTEGER integerValue, INTEGER fractionValue, 
			INTEGER fracSize, Compass1 compass1)
	{
	    setIntegerValue(integerValue);
	    setFractionValue(fractionValue);
	    setFracSize(fracSize);
	    setCompass1(compass1);
	}
	
	/**
	 * Construct with components.
	 */
	public Latitude(long integerValue, long fractionValue, long fracSize, 
			Compass1 compass1)
	{
	    this(new INTEGER(integerValue), new INTEGER(fractionValue), 
		 new INTEGER(fracSize), compass1);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new INTEGER();
	    mComponents[3] = Compass1.north;
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[4];
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
		    return Compass1.north;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "integerValue"
	public long getIntegerValue()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setIntegerValue(long integerValue)
	{
	    setIntegerValue(new INTEGER(integerValue));
	}
	
	public void setIntegerValue(INTEGER integerValue)
	{
	    mComponents[0] = integerValue;
	}
	
	
	// Methods for field "fractionValue"
	public long getFractionValue()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setFractionValue(long fractionValue)
	{
	    setFractionValue(new INTEGER(fractionValue));
	}
	
	public void setFractionValue(INTEGER fractionValue)
	{
	    mComponents[1] = fractionValue;
	}
	
	
	// Methods for field "fracSize"
	public long getFracSize()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setFracSize(long fracSize)
	{
	    setFracSize(new INTEGER(fracSize));
	}
	
	public void setFracSize(INTEGER fracSize)
	{
	    mComponents[2] = fracSize;
	}
	
	
	// Methods for field "compass1"
	public Compass1 getCompass1()
	{
	    return (Compass1)mComponents[3];
	}
	
	public void setCompass1(Compass1 compass1)
	{
	    mComponents[3] = compass1;
	}
	
	
	
	/**
	 * Define the ASN1 Type Compass1 from ASN1 Module BusInfomation.
	 * @see Enumerated
	 */
	public static final class Compass1 extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Compass1()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Compass1(long value)
	    {
		super(value);
	    }
	    
	    public static final class Value {
		public static final long north = 0;
		public static final long south = 1;
	    }
	    // Named list definitions.
	    private final static Compass1 cNamedNumbers[] = {
		new Compass1(), 
		new Compass1(1)
	    };
	    public static final Compass1 north = cNamedNumbers[0];
	    public static final Compass1 south = cNamedNumbers[1];
	    
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
	    
	    public static Compass1 valueOf(long value)
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
		    "NMEACoord$Latitude$Compass1"
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
			    "north",
			    0
			),
			new MemberListElement (
			    "south",
			    1
			)
		    }
		),
		0,
		north
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Compass1 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Compass1 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Compass1

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
		"datex.businfomation",
		"NMEACoord$Latitude"
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
				null,
				null,
				null
			    )
			),
			"integerValue",
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
				null,
				null,
				null
			    )
			),
			"fractionValue",
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
					new INTEGER(10),
					0
				    )
				),
				null,
				null
			    )
			),
			"fracSize",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"datex.businfomation",
				"NMEACoord$Latitude$Compass1"
			    )
			),
			"compass1",
			3,
			2,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Latitude object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Latitude object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Latitude

    // Methods for field "longitude"
    public Longitude getLongitude()
    {
	return (Longitude)mComponents[1];
    }
    
    public void setLongitude(Longitude longitude)
    {
	mComponents[1] = longitude;
    }
    
    
    
    /**
     * Define the ASN1 Type Longitude from ASN1 Module BusInfomation.
     * @see Sequence
     */
    public static class Longitude extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Longitude()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Longitude(INTEGER integerValue, INTEGER fractionValue, 
			INTEGER fracSize, Compass2 compass2)
	{
	    setIntegerValue(integerValue);
	    setFractionValue(fractionValue);
	    setFracSize(fracSize);
	    setCompass2(compass2);
	}
	
	/**
	 * Construct with components.
	 */
	public Longitude(long integerValue, long fractionValue, long fracSize, 
			Compass2 compass2)
	{
	    this(new INTEGER(integerValue), new INTEGER(fractionValue), 
		 new INTEGER(fracSize), compass2);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new INTEGER();
	    mComponents[2] = new INTEGER();
	    mComponents[3] = Compass2.east;
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[4];
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
		    return Compass2.east;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "integerValue"
	public long getIntegerValue()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setIntegerValue(long integerValue)
	{
	    setIntegerValue(new INTEGER(integerValue));
	}
	
	public void setIntegerValue(INTEGER integerValue)
	{
	    mComponents[0] = integerValue;
	}
	
	
	// Methods for field "fractionValue"
	public long getFractionValue()
	{
	    return ((INTEGER)mComponents[1]).longValue();
	}
	
	public void setFractionValue(long fractionValue)
	{
	    setFractionValue(new INTEGER(fractionValue));
	}
	
	public void setFractionValue(INTEGER fractionValue)
	{
	    mComponents[1] = fractionValue;
	}
	
	
	// Methods for field "fracSize"
	public long getFracSize()
	{
	    return ((INTEGER)mComponents[2]).longValue();
	}
	
	public void setFracSize(long fracSize)
	{
	    setFracSize(new INTEGER(fracSize));
	}
	
	public void setFracSize(INTEGER fracSize)
	{
	    mComponents[2] = fracSize;
	}
	
	
	// Methods for field "compass2"
	public Compass2 getCompass2()
	{
	    return (Compass2)mComponents[3];
	}
	
	public void setCompass2(Compass2 compass2)
	{
	    mComponents[3] = compass2;
	}
	
	
	
	/**
	 * Define the ASN1 Type Compass2 from ASN1 Module BusInfomation.
	 * @see Enumerated
	 */
	public static final class Compass2 extends Enumerated {
	    
	    /**
	     * The default constructor.
	     */
	    private Compass2()
	    {
		super(cFirstNumber);
	    }
	    
	    protected Compass2(long value)
	    {
		super(value);
	    }
	    
	    public static final class Value {
		public static final long east = 0;
		public static final long west = 1;
	    }
	    // Named list definitions.
	    private final static Compass2 cNamedNumbers[] = {
		new Compass2(), 
		new Compass2(1)
	    };
	    public static final Compass2 east = cNamedNumbers[0];
	    public static final Compass2 west = cNamedNumbers[1];
	    
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
	    
	    public static Compass2 valueOf(long value)
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
		    "NMEACoord$Longitude$Compass2"
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
			    "east",
			    0
			),
			new MemberListElement (
			    "west",
			    1
			)
		    }
		),
		0,
		east
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Compass2 object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Compass2 object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Compass2

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
		"datex.businfomation",
		"NMEACoord$Longitude"
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
				null,
				null,
				null
			    )
			),
			"integerValue",
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
				null,
				null,
				null
			    )
			),
			"fractionValue",
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
					new INTEGER(10),
					0
				    )
				),
				null,
				null
			    )
			),
			"fracSize",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"datex.businfomation",
				"NMEACoord$Longitude$Compass2"
			    )
			),
			"compass2",
			3,
			2,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Longitude object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Longitude object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Longitude

    // Methods for field "optData"
    public OctetString getOptData()
    {
	return (OctetString)mComponents[2];
    }
    
    public void setOptData(OctetString optData)
    {
	mComponents[2] = optData;
    }
    
    public boolean hasOptData()
    {
	return componentIsPresent(2);
    }
    
    public void deleteOptData()
    {
	setComponentAbsent(2);
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
	    "NMEACoord"
	),
	new QName (
	    "BusInfomation",
	    "NMEACoord"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "NMEACoord$Latitude"
			)
		    ),
		    "latitude",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "NMEACoord$Longitude"
			)
		    ),
		    "longitude",
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
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    800787,
			    null,
			    null
			)
		    ),
		    "optData",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NMEACoord object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NMEACoord object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NMEACoord
