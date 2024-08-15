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


package datex.iso14827_2;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SubscriptionData from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class SubscriptionData extends Sequence {
    
    /**
     * The default constructor.
     */
    public SubscriptionData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SubscriptionData(BOOLEAN datexSubscribe_Persistent_bool, 
		    DatexSubscribe_Status_cd datexSubscribe_Status_cd, 
		    SubscriptionMode datexSubscribe_Mode, 
		    DatexSubscribe_PublishFormat_cd datexSubscribe_PublishFormat_cd, 
		    INTEGER datexSubscription_Priority_nbr, 
		    BOOLEAN datexSubscribe_Guarantee_bool, 
		    EndApplicationMessage datexSubscribe_Pdu)
    {
	setDatexSubscribe_Persistent_bool(datexSubscribe_Persistent_bool);
	setDatexSubscribe_Status_cd(datexSubscribe_Status_cd);
	setDatexSubscribe_Mode(datexSubscribe_Mode);
	setDatexSubscribe_PublishFormat_cd(datexSubscribe_PublishFormat_cd);
	setDatexSubscription_Priority_nbr(datexSubscription_Priority_nbr);
	setDatexSubscribe_Guarantee_bool(datexSubscribe_Guarantee_bool);
	setDatexSubscribe_Pdu(datexSubscribe_Pdu);
    }
    
    /**
     * Construct with components.
     */
    public SubscriptionData(boolean datexSubscribe_Persistent_bool, 
		    DatexSubscribe_Status_cd datexSubscribe_Status_cd, 
		    SubscriptionMode datexSubscribe_Mode, 
		    DatexSubscribe_PublishFormat_cd datexSubscribe_PublishFormat_cd, 
		    long datexSubscription_Priority_nbr, 
		    boolean datexSubscribe_Guarantee_bool, 
		    EndApplicationMessage datexSubscribe_Pdu)
    {
	this(new BOOLEAN(datexSubscribe_Persistent_bool), 
	     datexSubscribe_Status_cd, datexSubscribe_Mode, 
	     datexSubscribe_PublishFormat_cd, 
	     new INTEGER(datexSubscription_Priority_nbr), 
	     new BOOLEAN(datexSubscribe_Guarantee_bool), datexSubscribe_Pdu);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = DatexSubscribe_Status_cd._new;
	mComponents[2] = new SubscriptionMode();
	mComponents[3] = DatexSubscribe_PublishFormat_cd.other;
	mComponents[4] = new INTEGER();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new EndApplicationMessage();
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
		return new BOOLEAN();
	    case 1:
		return DatexSubscribe_Status_cd._new;
	    case 2:
		return new SubscriptionMode();
	    case 3:
		return DatexSubscribe_PublishFormat_cd.other;
	    case 4:
		return new INTEGER();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new EndApplicationMessage();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexSubscribe_Persistent_bool"
    public boolean getDatexSubscribe_Persistent_bool()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setDatexSubscribe_Persistent_bool(boolean datexSubscribe_Persistent_bool)
    {
	setDatexSubscribe_Persistent_bool(new BOOLEAN(datexSubscribe_Persistent_bool));
    }
    
    public void setDatexSubscribe_Persistent_bool(BOOLEAN datexSubscribe_Persistent_bool)
    {
	mComponents[0] = datexSubscribe_Persistent_bool;
    }
    
    
    // Methods for field "datexSubscribe_Status_cd"
    public DatexSubscribe_Status_cd getDatexSubscribe_Status_cd()
    {
	return (DatexSubscribe_Status_cd)mComponents[1];
    }
    
    public void setDatexSubscribe_Status_cd(DatexSubscribe_Status_cd datexSubscribe_Status_cd)
    {
	mComponents[1] = datexSubscribe_Status_cd;
    }
    
    
    
    /**
     * Define the ASN1 Type DatexSubscribe_Status_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexSubscribe_Status_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexSubscribe_Status_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexSubscribe_Status_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long _new = 0;
	    public static final long update = 1;
	}
	// Named list definitions.
	private final static DatexSubscribe_Status_cd cNamedNumbers[] = {
	    new DatexSubscribe_Status_cd(), 
	    new DatexSubscribe_Status_cd(1)
	};
	public static final DatexSubscribe_Status_cd _new = cNamedNumbers[0];
	public static final DatexSubscribe_Status_cd update = cNamedNumbers[1];
	
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
	
	public static DatexSubscribe_Status_cd valueOf(long value)
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
		"datex.iso14827_2",
		"SubscriptionData$DatexSubscribe_Status_cd"
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
			"new",
			0
		    ),
		    new MemberListElement (
			"update",
			1
		    )
		}
	    ),
	    0,
	    _new
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexSubscribe_Status_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexSubscribe_Status_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DatexSubscribe_Status_cd

    // Methods for field "datexSubscribe_Mode"
    public SubscriptionMode getDatexSubscribe_Mode()
    {
	return (SubscriptionMode)mComponents[2];
    }
    
    public void setDatexSubscribe_Mode(SubscriptionMode datexSubscribe_Mode)
    {
	mComponents[2] = datexSubscribe_Mode;
    }
    
    
    // Methods for field "datexSubscribe_PublishFormat_cd"
    public DatexSubscribe_PublishFormat_cd getDatexSubscribe_PublishFormat_cd()
    {
	return (DatexSubscribe_PublishFormat_cd)mComponents[3];
    }
    
    public void setDatexSubscribe_PublishFormat_cd(DatexSubscribe_PublishFormat_cd datexSubscribe_PublishFormat_cd)
    {
	mComponents[3] = datexSubscribe_PublishFormat_cd;
    }
    
    
    
    /**
     * Define the ASN1 Type DatexSubscribe_PublishFormat_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexSubscribe_PublishFormat_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexSubscribe_PublishFormat_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexSubscribe_PublishFormat_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long other = 0;
	    public static final long ftp = 1;
	    public static final long tftp = 2;
	    public static final long dataPacket = 3;
	    
	}
	// Named list definitions.
	private final static DatexSubscribe_PublishFormat_cd cNamedNumbers[] = {
	    new DatexSubscribe_PublishFormat_cd(), 
	    new DatexSubscribe_PublishFormat_cd(1), 
	    new DatexSubscribe_PublishFormat_cd(2), 
	    new DatexSubscribe_PublishFormat_cd(3)
	};
	public static final DatexSubscribe_PublishFormat_cd other = cNamedNumbers[0];
	public static final DatexSubscribe_PublishFormat_cd ftp = cNamedNumbers[1];
	public static final DatexSubscribe_PublishFormat_cd tftp = cNamedNumbers[2];
	public static final DatexSubscribe_PublishFormat_cd dataPacket = cNamedNumbers[3];
	
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
	
	public static DatexSubscribe_PublishFormat_cd valueOf(long value)
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"SubscriptionData$DatexSubscribe_PublishFormat_cd"
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
			"other",
			0
		    ),
		    new MemberListElement (
			"ftp",
			1
		    ),
		    new MemberListElement (
			"tftp",
			2
		    ),
		    new MemberListElement (
			"dataPacket",
			3
		    )
		}
	    ),
	    0,
	    other
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexSubscribe_PublishFormat_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexSubscribe_PublishFormat_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexSubscribe_PublishFormat_cd cUnknownEnumerator = 
	    new DatexSubscribe_PublishFormat_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexSubscribe_PublishFormat_cd

    // Methods for field "datexSubscription_Priority_nbr"
    public long getDatexSubscription_Priority_nbr()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setDatexSubscription_Priority_nbr(long datexSubscription_Priority_nbr)
    {
	setDatexSubscription_Priority_nbr(new INTEGER(datexSubscription_Priority_nbr));
    }
    
    public void setDatexSubscription_Priority_nbr(INTEGER datexSubscription_Priority_nbr)
    {
	mComponents[4] = datexSubscription_Priority_nbr;
    }
    
    
    // Methods for field "datexSubscribe_Guarantee_bool"
    public boolean getDatexSubscribe_Guarantee_bool()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setDatexSubscribe_Guarantee_bool(boolean datexSubscribe_Guarantee_bool)
    {
	setDatexSubscribe_Guarantee_bool(new BOOLEAN(datexSubscribe_Guarantee_bool));
    }
    
    public void setDatexSubscribe_Guarantee_bool(BOOLEAN datexSubscribe_Guarantee_bool)
    {
	mComponents[5] = datexSubscribe_Guarantee_bool;
    }
    
    
    // Methods for field "datexSubscribe_Pdu"
    public EndApplicationMessage getDatexSubscribe_Pdu()
    {
	return (EndApplicationMessage)mComponents[6];
    }
    
    public void setDatexSubscribe_Pdu(EndApplicationMessage datexSubscribe_Pdu)
    {
	mComponents[6] = datexSubscribe_Pdu;
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
	    "SubscriptionData"
	),
	new QName (
	    "ISO14827-2",
	    "SubscriptionData"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    800787,
			    null
			)
		    ),
		    "datexSubscribe-Persistent-bool",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "SubscriptionData$DatexSubscribe_Status_cd"
			)
		    ),
		    "datexSubscribe-Status-cd",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"SubscriptionMode"
			    ),
			    new QName (
				"ISO14827-2",
				"SubscriptionMode"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "SubscriptionMode"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "datexSubscribe-Mode",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "SubscriptionData$DatexSubscribe_PublishFormat_cd"
			)
		    ),
		    "datexSubscribe-PublishFormat-cd",
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
				    new INTEGER(1),
				    new INTEGER(10),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datexSubscription-Priority-nbr",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    800787,
			    null
			)
		    ),
		    "datexSubscribe-Guarantee-bool",
		    5,
		    2,
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
				"datex.iso14827_2",
				"EndApplicationMessage"
			    ),
			    new QName (
				"ISO14827-2",
				"EndApplicationMessage"
			    ),
			    801299,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "EndApplicationMessage"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "EndApplicationMessage"
				)
			    ),
			    0
			)
		    ),
		    "datexSubscribe-Pdu",
		    6,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SubscriptionData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SubscriptionData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SubscriptionData
