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
 * Define the ASN1 Type PublicationType from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class PublicationType extends Choice {
    
    /**
     * The default constructor.
     */
    public PublicationType()
    {
    }
    
    public static final  int  datexPublication_Management_cd_chosen = 1;
    public static final  int  datexPublish_Data_chosen = 2;
    
    // Methods for field "datexPublication_Management_cd"
    public static PublicationType createPublicationTypeWithDatexPublication_Management_cd(DatexPublication_Management_cd datexPublication_Management_cd)
    {
	PublicationType __object = new PublicationType();

	__object.setDatexPublication_Management_cd(datexPublication_Management_cd);
	return __object;
    }
    
    public boolean hasDatexPublication_Management_cd()
    {
	return getChosenFlag() == datexPublication_Management_cd_chosen;
    }
    
    public DatexPublication_Management_cd getDatexPublication_Management_cd()
    {
	if (hasDatexPublication_Management_cd())
	    return (DatexPublication_Management_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexPublication_Management_cd(DatexPublication_Management_cd datexPublication_Management_cd)
    {
	setChosenValue(datexPublication_Management_cd);
	setChosenFlag(datexPublication_Management_cd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexPublication_Management_cd from ASN1 Module ISO14827_2.
     * @see Enumerated
     */
    public static final class DatexPublication_Management_cd extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DatexPublication_Management_cd()
	{
	    super(cFirstNumber);
	}
	
	protected DatexPublication_Management_cd(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long temporarilySuspended = 0;
	    public static final long resume = 1;
	    public static final long terminate_other = 2;
	    public static final long terminate_dataNoLongerAvailable = 3;
	    public static final long terminate_publicationsBeingRejected = 4;
	    public static final long terminate_PendingShutdown = 5;
	    public static final long terminate_processingMgmt = 6;
	    public static final long terminate_bandwidthMgmt = 7;
	    public static final long terminate_accessDenied = 8;
	    public static final long unknownRequest = 9;
	    
	}
	// Named list definitions.
	private final static DatexPublication_Management_cd cNamedNumbers[] = {
	    new DatexPublication_Management_cd(), 
	    new DatexPublication_Management_cd(1), 
	    new DatexPublication_Management_cd(2), 
	    new DatexPublication_Management_cd(3), 
	    new DatexPublication_Management_cd(4), 
	    new DatexPublication_Management_cd(5), 
	    new DatexPublication_Management_cd(6), 
	    new DatexPublication_Management_cd(7), 
	    new DatexPublication_Management_cd(8), 
	    new DatexPublication_Management_cd(9)
	};
	public static final DatexPublication_Management_cd temporarilySuspended = cNamedNumbers[0];
	public static final DatexPublication_Management_cd resume = cNamedNumbers[1];
	public static final DatexPublication_Management_cd terminate_other = cNamedNumbers[2];
	public static final DatexPublication_Management_cd terminate_dataNoLongerAvailable = cNamedNumbers[3];
	public static final DatexPublication_Management_cd terminate_publicationsBeingRejected = cNamedNumbers[4];
	public static final DatexPublication_Management_cd terminate_PendingShutdown = cNamedNumbers[5];
	public static final DatexPublication_Management_cd terminate_processingMgmt = cNamedNumbers[6];
	public static final DatexPublication_Management_cd terminate_bandwidthMgmt = cNamedNumbers[7];
	public static final DatexPublication_Management_cd terminate_accessDenied = cNamedNumbers[8];
	public static final DatexPublication_Management_cd unknownRequest = cNamedNumbers[9];
	
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
	
	public static DatexPublication_Management_cd valueOf(long value)
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
		"PublicationType$DatexPublication_Management_cd"
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
			"temporarilySuspended",
			0
		    ),
		    new MemberListElement (
			"resume",
			1
		    ),
		    new MemberListElement (
			"terminate-other",
			2
		    ),
		    new MemberListElement (
			"terminate-dataNoLongerAvailable",
			3
		    ),
		    new MemberListElement (
			"terminate-publicationsBeingRejected",
			4
		    ),
		    new MemberListElement (
			"terminate-PendingShutdown",
			5
		    ),
		    new MemberListElement (
			"terminate-processingMgmt",
			6
		    ),
		    new MemberListElement (
			"terminate-bandwidthMgmt",
			7
		    ),
		    new MemberListElement (
			"terminate-accessDenied",
			8
		    ),
		    new MemberListElement (
			"unknownRequest",
			9
		    )
		}
	    ),
	    0,
	    temporarilySuspended
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexPublication_Management_cd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexPublication_Management_cd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Methods for "unknownEnumerator"
	 */
	private static final DatexPublication_Management_cd cUnknownEnumerator = 
	    new DatexPublication_Management_cd(-1);
	
	public boolean isUnknownEnumerator()
	{
	    return this == cUnknownEnumerator;
	}
	
	public Enumerated getUnknownEnumerator()
	{
	    return cUnknownEnumerator;
	}
	
    } // End class definition for DatexPublication_Management_cd

    // Methods for field "datexPublish_Data"
    public static PublicationType createPublicationTypeWithDatexPublish_Data(EndApplicationMessage datexPublish_Data)
    {
	PublicationType __object = new PublicationType();

	__object.setDatexPublish_Data(datexPublish_Data);
	return __object;
    }
    
    public boolean hasDatexPublish_Data()
    {
	return getChosenFlag() == datexPublish_Data_chosen;
    }
    
    public EndApplicationMessage getDatexPublish_Data()
    {
	if (hasDatexPublish_Data())
	    return (EndApplicationMessage)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexPublish_Data(EndApplicationMessage datexPublish_Data)
    {
	setChosenValue(datexPublish_Data);
	setChosenFlag(datexPublish_Data_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case datexPublication_Management_cd_chosen:
		return DatexPublication_Management_cd.temporarilySuspended;
	    case datexPublish_Data_chosen:
		return new EndApplicationMessage();
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
	    "PublicationType"
	),
	new QName (
	    "ISO14827-2",
	    "PublicationType"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "PublicationType$DatexPublication_Management_cd"
			)
		    ),
		    "datexPublication-Management-cd",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "datexPublish-Data",
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
     * Get the type descriptor (TypeInfo) of 'this' PublicationType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PublicationType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PublicationType
