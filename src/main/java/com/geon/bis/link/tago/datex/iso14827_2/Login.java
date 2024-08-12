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


package com.geon.bis.link.tago.datex.iso14827_2;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Login from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Login extends Sequence {
    
    /**
     * The default constructor.
     */
    public Login()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Login(UTF8String16 datex_Sender_txt, 
		    UTF8String16 datex_Destination_txt, 
		    OctetString datexLogin_UserName_txt, 
		    OctetString datexLogin_Password_txt, 
		    DatexLogin_EncodingRules_id datexLogin_EncodingRules_id, 
		    INTEGER datexLogin_HeartbeatDurationMax_qty, 
		    INTEGER datexLogin_ResponseTimeOut_qty, 
		    DatexLogin_Initiator_cd datexLogin_Initiator_cd, 
		    INTEGER datexLogin_DatagramSize_qty)
    {
	setDatex_Sender_txt(datex_Sender_txt);
	setDatex_Destination_txt(datex_Destination_txt);
	setDatexLogin_UserName_txt(datexLogin_UserName_txt);
	setDatexLogin_Password_txt(datexLogin_Password_txt);
	setDatexLogin_EncodingRules_id(datexLogin_EncodingRules_id);
	setDatexLogin_HeartbeatDurationMax_qty(datexLogin_HeartbeatDurationMax_qty);
	setDatexLogin_ResponseTimeOut_qty(datexLogin_ResponseTimeOut_qty);
	setDatexLogin_Initiator_cd(datexLogin_Initiator_cd);
	setDatexLogin_DatagramSize_qty(datexLogin_DatagramSize_qty);
    }
    
    /**
     * Construct with components.
     */
    public Login(UTF8String16 datex_Sender_txt, 
		    UTF8String16 datex_Destination_txt, 
		    OctetString datexLogin_UserName_txt, 
		    OctetString datexLogin_Password_txt, 
		    DatexLogin_EncodingRules_id datexLogin_EncodingRules_id, 
		    long datexLogin_HeartbeatDurationMax_qty, 
		    long datexLogin_ResponseTimeOut_qty, 
		    DatexLogin_Initiator_cd datexLogin_Initiator_cd, 
		    long datexLogin_DatagramSize_qty)
    {
	this(datex_Sender_txt, datex_Destination_txt, 
	     datexLogin_UserName_txt, datexLogin_Password_txt, 
	     datexLogin_EncodingRules_id, 
	     new INTEGER(datexLogin_HeartbeatDurationMax_qty), 
	     new INTEGER(datexLogin_ResponseTimeOut_qty), 
	     datexLogin_Initiator_cd, 
	     new INTEGER(datexLogin_DatagramSize_qty));
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new OctetString();
	mComponents[3] = new OctetString();
	mComponents[4] = new DatexLogin_EncodingRules_id();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = DatexLogin_Initiator_cd.serverInitiated;
	mComponents[8] = new INTEGER();
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
		return new OctetString();
	    case 3:
		return new OctetString();
	    case 4:
		return new DatexLogin_EncodingRules_id();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return DatexLogin_Initiator_cd.serverInitiated;
	    case 8:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datex_Sender_txt"
    public UTF8String16 getDatex_Sender_txt()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setDatex_Sender_txt(UTF8String16 datex_Sender_txt)
    {
	mComponents[0] = datex_Sender_txt;
    }
    
    
    // Methods for field "datex_Destination_txt"
    public UTF8String16 getDatex_Destination_txt()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setDatex_Destination_txt(UTF8String16 datex_Destination_txt)
    {
	mComponents[1] = datex_Destination_txt;
    }
    
    
    // Methods for field "datexLogin_UserName_txt"
    public OctetString getDatexLogin_UserName_txt()
    {
	return (OctetString)mComponents[2];
    }
    
    public void setDatexLogin_UserName_txt(OctetString datexLogin_UserName_txt)
    {
	mComponents[2] = datexLogin_UserName_txt;
    }
    
    
    // Methods for field "datexLogin_Password_txt"
    public OctetString getDatexLogin_Password_txt()
    {
	return (OctetString)mComponents[3];
    }
    
    public void setDatexLogin_Password_txt(OctetString datexLogin_Password_txt)
    {
	mComponents[3] = datexLogin_Password_txt;
    }
    
    
    // Methods for field "datexLogin_EncodingRules_id"
    public DatexLogin_EncodingRules_id getDatexLogin_EncodingRules_id()
    {
	return (DatexLogin_EncodingRules_id)mComponents[4];
    }
    
    public void setDatexLogin_EncodingRules_id(DatexLogin_EncodingRules_id datexLogin_EncodingRules_id)
    {
	mComponents[4] = datexLogin_EncodingRules_id;
    }
    
    
    
    /**
     * Define the ASN1 Type DatexLogin_EncodingRules_id from ASN1 Module ISO14827_2.
     * @see SequenceOf
     */
    public static class DatexLogin_EncodingRules_id extends SequenceOf<ObjectIdentifier> {
	
	/**
	 * The default constructor.
	 */
	public DatexLogin_EncodingRules_id()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public DatexLogin_EncodingRules_id(ObjectIdentifier[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new ObjectIdentifier();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Login$DatexLogin_EncodingRules_id"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "com.oss.asn1",
		    "ObjectIdentifier"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexLogin_EncodingRules_id object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexLogin_EncodingRules_id object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DatexLogin_EncodingRules_id

    // Methods for field "datexLogin_HeartbeatDurationMax_qty"
    public long getDatexLogin_HeartbeatDurationMax_qty()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setDatexLogin_HeartbeatDurationMax_qty(long datexLogin_HeartbeatDurationMax_qty)
    {
	setDatexLogin_HeartbeatDurationMax_qty(new INTEGER(datexLogin_HeartbeatDurationMax_qty));
    }
    
    public void setDatexLogin_HeartbeatDurationMax_qty(INTEGER datexLogin_HeartbeatDurationMax_qty)
    {
	mComponents[5] = datexLogin_HeartbeatDurationMax_qty;
    }
    
    
    // Methods for field "datexLogin_ResponseTimeOut_qty"
    public long getDatexLogin_ResponseTimeOut_qty()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setDatexLogin_ResponseTimeOut_qty(long datexLogin_ResponseTimeOut_qty)
    {
	setDatexLogin_ResponseTimeOut_qty(new INTEGER(datexLogin_ResponseTimeOut_qty));
    }
    
    public void setDatexLogin_ResponseTimeOut_qty(INTEGER datexLogin_ResponseTimeOut_qty)
    {
	mComponents[6] = datexLogin_ResponseTimeOut_qty;
    }
    
    
    // Methods for field "datexLogin_Initiator_cd"
    public DatexLogin_Initiator_cd getDatexLogin_Initiator_cd()
    {
	return (DatexLogin_Initiator_cd)mComponents[7];
    }
    
    public void setDatexLogin_Initiator_cd(DatexLogin_Initiator_cd datexLogin_Initiator_cd)
    {
	mComponents[7] = datexLogin_Initiator_cd;
    }
    
    
    
    /**
     * Define the ASN1 Type DatexLogin_Initiator_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexLogin_Initiator_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexLogin_Initiator_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexLogin_Initiator_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long serverInitiated = 0;
	    public static final long clientInitiated = 1;
	    
	}
	// Named list definitions.
	private final static DatexLogin_Initiator_cd cNamedNumbers[] = {
	    new DatexLogin_Initiator_cd(), 
	    new DatexLogin_Initiator_cd(1)
	};
	public static final DatexLogin_Initiator_cd serverInitiated = cNamedNumbers[0];
	public static final DatexLogin_Initiator_cd clientInitiated = cNamedNumbers[1];
	
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
	
	public static DatexLogin_Initiator_cd valueOf(long value)
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
		    (short)0x8007
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Login$DatexLogin_Initiator_cd"
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
			"serverInitiated",
			0
		    ),
		    new MemberListElement (
			"clientInitiated",
			1
		    )
		}
	    ),
	    0,
	    serverInitiated
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexLogin_Initiator_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexLogin_Initiator_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexLogin_Initiator_cd cUnknownEnumerator = 
	    new DatexLogin_Initiator_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexLogin_Initiator_cd

    // Methods for field "datexLogin_DatagramSize_qty"
    public long getDatexLogin_DatagramSize_qty()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setDatexLogin_DatagramSize_qty(long datexLogin_DatagramSize_qty)
    {
	setDatexLogin_DatagramSize_qty(new INTEGER(datexLogin_DatagramSize_qty));
    }
    
    public void setDatexLogin_DatagramSize_qty(INTEGER datexLogin_DatagramSize_qty)
    {
	mComponents[8] = datexLogin_DatagramSize_qty;
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
	    "Login"
	),
	new QName (
	    "ISO14827-2",
	    "Login"
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
					new INTEGER(0),
					new INTEGER(40),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "datex-Sender-txt",
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
					new INTEGER(0),
					new INTEGER(40),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "datex-Destination-txt",
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
		    "datexLogin-UserName-txt",
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
		    "datexLogin-Password-txt",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Login$DatexLogin_EncodingRules_id"
			)
		    ),
		    "datexLogin-EncodingRules-id",
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
				    new INTEGER(65535),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datexLogin-HeartbeatDurationMax-qty",
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
				    new INTEGER(255),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datexLogin-ResponseTimeOut-qty",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Login$DatexLogin_Initiator_cd"
			)
		    ),
		    "datexLogin-Initiator-cd",
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
				    new INTEGER(65535),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datexLogin-DatagramSize-qty",
		    8,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Login object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Login object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Login
