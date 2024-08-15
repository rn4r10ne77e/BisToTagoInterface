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

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SubscriptionType from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class SubscriptionType extends Choice {
    
    /**
     * The default constructor.
     */
    public SubscriptionType()
    {
    }
    
    public static final  int  subscription_chosen = 1;
    public static final  int  datexSubscribe_CancelReason_cd_chosen = 2;
    
    // Methods for field "subscription"
    public static SubscriptionType createSubscriptionTypeWithSubscription(SubscriptionData subscription)
    {
	SubscriptionType __object = new SubscriptionType();

	__object.setSubscription(subscription);
	return __object;
    }
    
    public boolean hasSubscription()
    {
	return getChosenFlag() == subscription_chosen;
    }
    
    public SubscriptionData getSubscription()
    {
	if (hasSubscription())
	    return (SubscriptionData)mChosenValue;
	else
	    return null;
    }
    
    public void setSubscription(SubscriptionData subscription)
    {
	setChosenValue(subscription);
	setChosenFlag(subscription_chosen);
    }
    
    
    // Methods for field "datexSubscribe_CancelReason_cd"
    public static SubscriptionType createSubscriptionTypeWithDatexSubscribe_CancelReason_cd(DatexSubscribe_CancelReason_cd datexSubscribe_CancelReason_cd)
    {
	SubscriptionType __object = new SubscriptionType();

	__object.setDatexSubscribe_CancelReason_cd(datexSubscribe_CancelReason_cd);
	return __object;
    }
    
    public boolean hasDatexSubscribe_CancelReason_cd()
    {
	return getChosenFlag() == datexSubscribe_CancelReason_cd_chosen;
    }
    
    public DatexSubscribe_CancelReason_cd getDatexSubscribe_CancelReason_cd()
    {
	if (hasDatexSubscribe_CancelReason_cd())
	    return (DatexSubscribe_CancelReason_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexSubscribe_CancelReason_cd(DatexSubscribe_CancelReason_cd datexSubscribe_CancelReason_cd)
    {
	setChosenValue(datexSubscribe_CancelReason_cd);
	setChosenFlag(datexSubscribe_CancelReason_cd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexSubscribe_CancelReason_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexSubscribe_CancelReason_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexSubscribe_CancelReason_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexSubscribe_CancelReason_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long other = 0;
	    public static final long dataNotNeeded = 1;
	    public static final long errorsInPublication = 2;
	    public static final long pendingLogout = 3;
	    public static final long processingMgmt = 4;
	    public static final long bandwidthMgmt = 5;
	    
	}
	// Named list definitions.
	private final static DatexSubscribe_CancelReason_cd cNamedNumbers[] = {
	    new DatexSubscribe_CancelReason_cd(), 
	    new DatexSubscribe_CancelReason_cd(1), 
	    new DatexSubscribe_CancelReason_cd(2), 
	    new DatexSubscribe_CancelReason_cd(3), 
	    new DatexSubscribe_CancelReason_cd(4), 
	    new DatexSubscribe_CancelReason_cd(5)
	};
	public static final DatexSubscribe_CancelReason_cd other = cNamedNumbers[0];
	public static final DatexSubscribe_CancelReason_cd dataNotNeeded = cNamedNumbers[1];
	public static final DatexSubscribe_CancelReason_cd errorsInPublication = cNamedNumbers[2];
	public static final DatexSubscribe_CancelReason_cd pendingLogout = cNamedNumbers[3];
	public static final DatexSubscribe_CancelReason_cd processingMgmt = cNamedNumbers[4];
	public static final DatexSubscribe_CancelReason_cd bandwidthMgmt = cNamedNumbers[5];
	
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
	    if (value >= 0 && value <= 5)
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
	
	public static DatexSubscribe_CancelReason_cd valueOf(long value)
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
		"SubscriptionType$DatexSubscribe_CancelReason_cd"
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
			"dataNotNeeded",
			1
		    ),
		    new MemberListElement (
			"errorsInPublication",
			2
		    ),
		    new MemberListElement (
			"pendingLogout",
			3
		    ),
		    new MemberListElement (
			"processingMgmt",
			4
		    ),
		    new MemberListElement (
			"bandwidthMgmt",
			5
		    )
		}
	    ),
	    0,
	    other
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexSubscribe_CancelReason_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexSubscribe_CancelReason_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexSubscribe_CancelReason_cd cUnknownEnumerator = 
	    new DatexSubscribe_CancelReason_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexSubscribe_CancelReason_cd

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case subscription_chosen:
		return new SubscriptionData();
	    case datexSubscribe_CancelReason_cd_chosen:
		return DatexSubscribe_CancelReason_cd.other;
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
	    "SubscriptionType"
	),
	new QName (
	    "ISO14827-2",
	    "SubscriptionType"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "SubscriptionData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "SubscriptionData"
				)
			    ),
			    0
			)
		    ),
		    "subscription",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "SubscriptionType$DatexSubscribe_CancelReason_cd"
			)
		    ),
		    "datexSubscribe-CancelReason-cd",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SubscriptionType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SubscriptionType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SubscriptionType
