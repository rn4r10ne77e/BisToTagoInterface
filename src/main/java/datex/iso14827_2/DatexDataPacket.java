/*************************************************************/
/* Copyright (C) 2019 OSS Nokalva, Inc.  All rights reserved.*/
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
 * Define the ASN1 Type DatexDataPacket from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class DatexDataPacket extends Sequence {
    
    /**
     * The default constructor.
     */
    public DatexDataPacket()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DatexDataPacket(Datex_Version_number datex_Version_number, 
		    OctetString datex_Data, OctetString datex_Crc_nbr)
    {
	setDatex_Version_number(datex_Version_number);
	setDatex_Data(datex_Data);
	setDatex_Crc_nbr(datex_Crc_nbr);
    }
    
    public void initComponents()
    {
	mComponents[0] = Datex_Version_number.experimental;
	mComponents[1] = new OctetString();
	mComponents[2] = new OctetString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
        return switch (index) {
            case 0 -> Datex_Version_number.experimental;
            case 1, 2 -> new OctetString();
            default -> throw new InternalError("AbstractCollection.createInstance()");
        };

    }
    
    
    // Methods for field "datex_Version_number"
    public Datex_Version_number getDatex_Version_number()
    {
	return (Datex_Version_number)mComponents[0];
    }
    
    public void setDatex_Version_number(Datex_Version_number datex_Version_number)
    {
	mComponents[0] = datex_Version_number;
    }
    
    
    
    /**
     * Define the ASN1 Type Datex_Version_number from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class Datex_Version_number extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Datex_Version_number()
	{
	    super(cFirstNumber);
	}
	
	private Datex_Version_number(long value)
	{
	    super(value);
	}

	public static final class Value {
	    public static final long experimental = 0;
	    public static final long version1 = 1;

	}
	// Named list definitions.
	private final static Datex_Version_number[] cNamedNumbers = {
	    new Datex_Version_number(),
	    new Datex_Version_number(1)
	};
	public static final Datex_Version_number experimental = cNamedNumbers[0];
	public static final Datex_Version_number version1 = cNamedNumbers[1];

	private final static long cFirstNumber = 0;
	private final static boolean cLinearNumbers = false;
	
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
	
	public static Datex_Version_number valueOf(long value)
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
	    if (isUnknownEnumerator())
			return -1;
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
		    (short)0x8000
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"DatexDataPacket$Datex_Version_number"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    800791,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"experimental",
			0
		    ),
		    new MemberListElement (
			"version1",
			1
		    )
		}
	    ),
	    0,
	    experimental
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Datex_Version_number object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Datex_Version_number object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}

	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final Datex_Version_number cUnknownEnumerator = 
	    new Datex_Version_number(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for Datex_Version_number

    // Methods for field "datex_Data"
    public OctetString getDatex_Data()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setDatex_Data(OctetString datex_Data)
    {
	mComponents[1] = datex_Data;
    }
    
    
    // Methods for field "datex_Crc_nbr"
    public OctetString getDatex_Crc_nbr()
    {
	return (OctetString)mComponents[2];
    }
    
    public void setDatex_Crc_nbr(OctetString datex_Crc_nbr)
    {
	mComponents[2] = datex_Crc_nbr;
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
	    "datex.iso14827_2",
	    "DatexDataPacket"
	),
	new QName (
	    "ISO14827-2",
	    "DatexDataPacket"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "DatexDataPacket$Datex_Version_number"
			)
		    ),
		    "datex-Version-number",
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
		    "datex-Data",
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
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(2)
				)
			    ),
			    null
			)
		    ),
		    "datex-Crc-nbr",
		    2,
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
		)
	    }
	),
	0
    );

    /**
     * Get the type descriptor (TypeInfo) of 'this' DatexDataPacket object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * Get the static type descriptor (TypeInfo) of 'this' DatexDataPacket object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }

    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for DatexDataPacket
