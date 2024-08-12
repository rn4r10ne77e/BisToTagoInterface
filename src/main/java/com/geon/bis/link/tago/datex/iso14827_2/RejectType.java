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

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RejectType from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class RejectType extends Choice {
    
    /**
     * The default constructor.
     */
    public RejectType()
    {
    }
    
    public static final  int  datexReject_Login_cd_chosen = 1;
    public static final  int  datexReject_Subscription_cd_chosen = 2;
    public static final  int  datexReject_Publication_cd_chosen = 3;
    
    // Methods for field "datexReject_Login_cd"
    public static RejectType createRejectTypeWithDatexReject_Login_cd(DatexReject_Login_cd datexReject_Login_cd)
    {
	RejectType __object = new RejectType();

	__object.setDatexReject_Login_cd(datexReject_Login_cd);
	return __object;
    }
    
    public boolean hasDatexReject_Login_cd()
    {
	return getChosenFlag() == datexReject_Login_cd_chosen;
    }
    
    public DatexReject_Login_cd getDatexReject_Login_cd()
    {
	if (hasDatexReject_Login_cd())
	    return (DatexReject_Login_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexReject_Login_cd(DatexReject_Login_cd datexReject_Login_cd)
    {
	setChosenValue(datexReject_Login_cd);
	setChosenFlag(datexReject_Login_cd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexReject_Login_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexReject_Login_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexReject_Login_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexReject_Login_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long other = 0;
	    public static final long unknownDomainName = 1;
	    public static final long accessDenied = 2;
	    public static final long invalidNamePassword = 3;
	    public static final long timeoutTooSmall = 4;
	    public static final long timeoutTooLarge = 5;
	    public static final long heartbeatTooSmall = 6;
	    public static final long heartbeatTooLarge = 7;
	    public static final long sessionExists = 8;
	    public static final long maxSessionReached = 9;
	    
	}
	// Named list definitions.
	private final static DatexReject_Login_cd cNamedNumbers[] = {
	    new DatexReject_Login_cd(), 
	    new DatexReject_Login_cd(1), 
	    new DatexReject_Login_cd(2), 
	    new DatexReject_Login_cd(3), 
	    new DatexReject_Login_cd(4), 
	    new DatexReject_Login_cd(5), 
	    new DatexReject_Login_cd(6), 
	    new DatexReject_Login_cd(7), 
	    new DatexReject_Login_cd(8), 
	    new DatexReject_Login_cd(9)
	};
	public static final DatexReject_Login_cd other = cNamedNumbers[0];
	public static final DatexReject_Login_cd unknownDomainName = cNamedNumbers[1];
	public static final DatexReject_Login_cd accessDenied = cNamedNumbers[2];
	public static final DatexReject_Login_cd invalidNamePassword = cNamedNumbers[3];
	public static final DatexReject_Login_cd timeoutTooSmall = cNamedNumbers[4];
	public static final DatexReject_Login_cd timeoutTooLarge = cNamedNumbers[5];
	public static final DatexReject_Login_cd heartbeatTooSmall = cNamedNumbers[6];
	public static final DatexReject_Login_cd heartbeatTooLarge = cNamedNumbers[7];
	public static final DatexReject_Login_cd sessionExists = cNamedNumbers[8];
	public static final DatexReject_Login_cd maxSessionReached = cNamedNumbers[9];
	
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
	    if (value >= 0 && value <= 9)
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
	
	public static DatexReject_Login_cd valueOf(long value)
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
		"RejectType$DatexReject_Login_cd"
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
			"unknownDomainName",
			1
		    ),
		    new MemberListElement (
			"accessDenied",
			2
		    ),
		    new MemberListElement (
			"invalidNamePassword",
			3
		    ),
		    new MemberListElement (
			"timeoutTooSmall",
			4
		    ),
		    new MemberListElement (
			"timeoutTooLarge",
			5
		    ),
		    new MemberListElement (
			"heartbeatTooSmall",
			6
		    ),
		    new MemberListElement (
			"heartbeatTooLarge",
			7
		    ),
		    new MemberListElement (
			"sessionExists",
			8
		    ),
		    new MemberListElement (
			"maxSessionReached",
			9
		    )
		}
	    ),
	    0,
	    other
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexReject_Login_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexReject_Login_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexReject_Login_cd cUnknownEnumerator = 
	    new DatexReject_Login_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexReject_Login_cd

    // Methods for field "datexReject_Subscription_cd"
    public static RejectType createRejectTypeWithDatexReject_Subscription_cd(DatexReject_Subscription_cd datexReject_Subscription_cd)
    {
	RejectType __object = new RejectType();

	__object.setDatexReject_Subscription_cd(datexReject_Subscription_cd);
	return __object;
    }
    
    public boolean hasDatexReject_Subscription_cd()
    {
	return getChosenFlag() == datexReject_Subscription_cd_chosen;
    }
    
    public DatexReject_Subscription_cd getDatexReject_Subscription_cd()
    {
	if (hasDatexReject_Subscription_cd())
	    return (DatexReject_Subscription_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexReject_Subscription_cd(DatexReject_Subscription_cd datexReject_Subscription_cd)
    {
	setChosenValue(datexReject_Subscription_cd);
	setChosenFlag(datexReject_Subscription_cd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexReject_Subscription_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexReject_Subscription_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexReject_Subscription_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexReject_Subscription_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long other = 0;
	    public static final long unknownSubscriptionNbr = 1;
	    public static final long invalidTimes = 2;
	    public static final long frequencyTooSmall = 3;
	    public static final long frequencyTooLarge = 4;
	    public static final long invalid_mode = 5;
	    public static final long publishFormatNotSupported = 6;
	    public static final long unknownSubscriptionMsgId = 7;
	    public static final long invalidSubscriptionMsgId = 8;
	    public static final long invalidSubscriptionContent = 9;
	    
	}
	// Named list definitions.
	private final static DatexReject_Subscription_cd cNamedNumbers[] = {
	    new DatexReject_Subscription_cd(), 
	    new DatexReject_Subscription_cd(1), 
	    new DatexReject_Subscription_cd(2), 
	    new DatexReject_Subscription_cd(3), 
	    new DatexReject_Subscription_cd(4), 
	    new DatexReject_Subscription_cd(5), 
	    new DatexReject_Subscription_cd(6), 
	    new DatexReject_Subscription_cd(7), 
	    new DatexReject_Subscription_cd(8), 
	    new DatexReject_Subscription_cd(9)
	};
	public static final DatexReject_Subscription_cd other = cNamedNumbers[0];
	public static final DatexReject_Subscription_cd unknownSubscriptionNbr = cNamedNumbers[1];
	public static final DatexReject_Subscription_cd invalidTimes = cNamedNumbers[2];
	public static final DatexReject_Subscription_cd frequencyTooSmall = cNamedNumbers[3];
	public static final DatexReject_Subscription_cd frequencyTooLarge = cNamedNumbers[4];
	public static final DatexReject_Subscription_cd invalid_mode = cNamedNumbers[5];
	public static final DatexReject_Subscription_cd publishFormatNotSupported = cNamedNumbers[6];
	public static final DatexReject_Subscription_cd unknownSubscriptionMsgId = cNamedNumbers[7];
	public static final DatexReject_Subscription_cd invalidSubscriptionMsgId = cNamedNumbers[8];
	public static final DatexReject_Subscription_cd invalidSubscriptionContent = cNamedNumbers[9];
	
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
	    if (value >= 0 && value <= 9)
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
	
	public static DatexReject_Subscription_cd valueOf(long value)
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"RejectType$DatexReject_Subscription_cd"
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
			"unknownSubscriptionNbr",
			1
		    ),
		    new MemberListElement (
			"invalidTimes",
			2
		    ),
		    new MemberListElement (
			"frequencyTooSmall",
			3
		    ),
		    new MemberListElement (
			"frequencyTooLarge",
			4
		    ),
		    new MemberListElement (
			"invalid-mode",
			5
		    ),
		    new MemberListElement (
			"publishFormatNotSupported",
			6
		    ),
		    new MemberListElement (
			"unknownSubscriptionMsgId",
			7
		    ),
		    new MemberListElement (
			"invalidSubscriptionMsgId",
			8
		    ),
		    new MemberListElement (
			"invalidSubscriptionContent",
			9
		    )
		}
	    ),
	    0,
	    other
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexReject_Subscription_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexReject_Subscription_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexReject_Subscription_cd cUnknownEnumerator = 
	    new DatexReject_Subscription_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexReject_Subscription_cd

    // Methods for field "datexReject_Publication_cd"
    public static RejectType createRejectTypeWithDatexReject_Publication_cd(DatexReject_Publication_cd datexReject_Publication_cd)
    {
	RejectType __object = new RejectType();

	__object.setDatexReject_Publication_cd(datexReject_Publication_cd);
	return __object;
    }
    
    public boolean hasDatexReject_Publication_cd()
    {
	return getChosenFlag() == datexReject_Publication_cd_chosen;
    }
    
    public DatexReject_Publication_cd getDatexReject_Publication_cd()
    {
	if (hasDatexReject_Publication_cd())
	    return (DatexReject_Publication_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexReject_Publication_cd(DatexReject_Publication_cd datexReject_Publication_cd)
    {
	setChosenValue(datexReject_Publication_cd);
	setChosenFlag(datexReject_Publication_cd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexReject_Publication_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexReject_Publication_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexReject_Publication_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexReject_Publication_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long other = 0;
	    public static final long unknownSubscription = 1;
	    public static final long unknownPublicationNbr = 2;
	    public static final long invalidPublishFormat = 3;
	    public static final long unknownPublicationMsgId = 4;
	    public static final long invalidPublicationMsgId = 5;
	    public static final long invalidPublicationMsgContent = 6;
	    public static final long repeatedPublicationNbr = 7;
	    
	}
	// Named list definitions.
	private final static DatexReject_Publication_cd cNamedNumbers[] = {
	    new DatexReject_Publication_cd(), 
	    new DatexReject_Publication_cd(1), 
	    new DatexReject_Publication_cd(2), 
	    new DatexReject_Publication_cd(3), 
	    new DatexReject_Publication_cd(4), 
	    new DatexReject_Publication_cd(5), 
	    new DatexReject_Publication_cd(6), 
	    new DatexReject_Publication_cd(7)
	};
	public static final DatexReject_Publication_cd other = cNamedNumbers[0];
	public static final DatexReject_Publication_cd unknownSubscription = cNamedNumbers[1];
	public static final DatexReject_Publication_cd unknownPublicationNbr = cNamedNumbers[2];
	public static final DatexReject_Publication_cd invalidPublishFormat = cNamedNumbers[3];
	public static final DatexReject_Publication_cd unknownPublicationMsgId = cNamedNumbers[4];
	public static final DatexReject_Publication_cd invalidPublicationMsgId = cNamedNumbers[5];
	public static final DatexReject_Publication_cd invalidPublicationMsgContent = cNamedNumbers[6];
	public static final DatexReject_Publication_cd repeatedPublicationNbr = cNamedNumbers[7];
	
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
	
	public static DatexReject_Publication_cd valueOf(long value)
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"RejectType$DatexReject_Publication_cd"
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
			"unknownSubscription",
			1
		    ),
		    new MemberListElement (
			"unknownPublicationNbr",
			2
		    ),
		    new MemberListElement (
			"invalidPublishFormat",
			3
		    ),
		    new MemberListElement (
			"unknownPublicationMsgId",
			4
		    ),
		    new MemberListElement (
			"invalidPublicationMsgId",
			5
		    ),
		    new MemberListElement (
			"invalidPublicationMsgContent",
			6
		    ),
		    new MemberListElement (
			"repeatedPublicationNbr",
			7
		    )
		}
	    ),
	    0,
	    other
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexReject_Publication_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexReject_Publication_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexReject_Publication_cd cUnknownEnumerator = 
	    new DatexReject_Publication_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexReject_Publication_cd

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case datexReject_Login_cd_chosen:
		return DatexReject_Login_cd.other;
	    case datexReject_Subscription_cd_chosen:
		return DatexReject_Subscription_cd.other;
	    case datexReject_Publication_cd_chosen:
		return DatexReject_Publication_cd.other;
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "datex.iso14827_2",
	    "RejectType"
	),
	new QName (
	    "ISO14827-2",
	    "RejectType"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "RejectType$DatexReject_Login_cd"
			)
		    ),
		    "datexReject-Login-cd",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "RejectType$DatexReject_Subscription_cd"
			)
		    ),
		    "datexReject-Subscription-cd",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "RejectType$DatexReject_Publication_cd"
			)
		    ),
		    "datexReject-Publication-cd",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RejectType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RejectType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RejectType
