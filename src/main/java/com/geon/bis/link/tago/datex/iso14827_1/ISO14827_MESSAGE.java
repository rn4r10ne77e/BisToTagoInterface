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


package com.geon.bis.link.tago.datex.iso14827_1;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ISO14827_MESSAGE from ASN1 Module ISO14827_1.
 * @see InfoObject
 */

public class ISO14827_MESSAGE extends InfoObject {
    
    /**
     * The default constructor.
     */
    public ISO14827_MESSAGE()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ISO14827_MESSAGE(PrintableString name, PrintableString definition, 
		    ASN1Type MessageBody, PrintableString remarks, 
		    MessageType messageType, 
		    SubscriptionType subscriptionType, 
		    PrintableString initialPublication, 
		    PrintableString subsequentPublications, 
		    ObjectIdentifier id, INTEGER _oss_unique_index)
    {
	setName(name);
	setDefinition(definition);
	setMessageBody(MessageBody);
	setRemarks(remarks);
	setMessageType(messageType);
	setSubscriptionType(subscriptionType);
	setInitialPublication(initialPublication);
	setSubsequentPublications(subsequentPublications);
	setId(id);
	set_oss_unique_index(_oss_unique_index);
    }
    
    /**
     * Construct with components.
     */
    public ISO14827_MESSAGE(PrintableString name, PrintableString definition, 
		    ASN1Type MessageBody, PrintableString remarks, 
		    MessageType messageType, 
		    SubscriptionType subscriptionType, 
		    PrintableString initialPublication, 
		    PrintableString subsequentPublications, 
		    ObjectIdentifier id, long _oss_unique_index)
    {
	this(name, definition, MessageBody, remarks, messageType, 
	     subscriptionType, initialPublication, subsequentPublications, 
	     id, new INTEGER(_oss_unique_index));
    }
    
    /**
     * Construct with required components.
     */
    public ISO14827_MESSAGE(PrintableString name, PrintableString definition, 
		    ASN1Type MessageBody, MessageType messageType, 
		    ObjectIdentifier id, long _oss_unique_index)
    {
	setName(name);
	setDefinition(definition);
	setMessageBody(MessageBody);
	setMessageType(messageType);
	setId(id);
	set_oss_unique_index(_oss_unique_index);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new ASN1Type();
	mComponents[3] = new PrintableString();
	mComponents[4] = MessageType.publication;
	mComponents[5] = SubscriptionType.single;
	mComponents[6] = new PrintableString();
	mComponents[7] = new PrintableString();
	mComponents[8] = new ObjectIdentifier();
	mComponents[9] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Unique field index initialization
    {
	mUniqueFieldIndex = 9;
    }
    
    
    // Methods for field "name"
    public PrintableString getName()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setName(PrintableString name)
    {
	mComponents[0] = name;
    }
    
    
    // Methods for field "definition"
    public PrintableString getDefinition()
    {
	return (PrintableString)mComponents[1];
    }
    
    public void setDefinition(PrintableString definition)
    {
	mComponents[1] = definition;
    }
    
    
    // Methods for field "MessageBody"
    public ASN1Type getMessageBody()
    {
	return (ASN1Type)mComponents[2];
    }
    
    public void setMessageBody(ASN1Type MessageBody)
    {
	mComponents[2] = MessageBody;
    }
    
    
    // Methods for field "remarks"
    public PrintableString getRemarks()
    {
	return (PrintableString)mComponents[3];
    }
    
    public void setRemarks(PrintableString remarks)
    {
	mComponents[3] = remarks;
    }
    
    public boolean hasRemarks()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRemarks()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "messageType"
    public MessageType getMessageType()
    {
	return (MessageType)mComponents[4];
    }
    
    public void setMessageType(MessageType messageType)
    {
	mComponents[4] = messageType;
    }
    
    
    
    /**
     * Define the ASN1 Type MessageType from ASN1 Module ISO14827_1.
     * @see Enumerated
     */
    public static final class MessageType extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private MessageType()
	{
	    super(cFirstNumber);
	}
	
	protected MessageType(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long publication = 0;
	    public static final long subscription = 1;
	}
	// Named list definitions.
	private final static MessageType cNamedNumbers[] = {
	    new MessageType(), 
	    new MessageType(1)
	};
	public static final MessageType publication = cNamedNumbers[0];
	public static final MessageType subscription = cNamedNumbers[1];
	
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
	
	public static MessageType valueOf(long value)
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
		    0x000a
		}
	    ),
	    new QName (
		"datex.iso14827_1",
		"ISO14827_MESSAGE$MessageType"
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
			"publication",
			0
		    ),
		    new MemberListElement (
			"subscription",
			1
		    )
		}
	    ),
	    0,
	    publication
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' MessageType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' MessageType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for MessageType

    // Methods for field "subscriptionType"
    public SubscriptionType getSubscriptionType()
    {
	return (SubscriptionType)mComponents[5];
    }
    
    public void setSubscriptionType(SubscriptionType subscriptionType)
    {
	mComponents[5] = subscriptionType;
    }
    
    public boolean hasSubscriptionType()
    {
	return componentIsPresent(5);
    }
    
    public void deleteSubscriptionType()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type SubscriptionType from ASN1 Module ISO14827_1.
     * @see Enumerated
     */
    public static final class SubscriptionType extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private SubscriptionType()
	{
	    super(cFirstNumber);
	}
	
	protected SubscriptionType(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long single = 0;
	    public static final long event_driven = 1;
	    public static final long single_or_event = 2;
	    public static final long periodic = 3;
	    public static final long single_or_periodic = 4;
	    public static final long event_or_periodic = 5;
	    public static final long single_event_periodic = 6;
	}
	// Named list definitions.
	private final static SubscriptionType cNamedNumbers[] = {
	    new SubscriptionType(), 
	    new SubscriptionType(1), 
	    new SubscriptionType(2), 
	    new SubscriptionType(3), 
	    new SubscriptionType(4), 
	    new SubscriptionType(5), 
	    new SubscriptionType(6)
	};
	public static final SubscriptionType single = cNamedNumbers[0];
	public static final SubscriptionType event_driven = cNamedNumbers[1];
	public static final SubscriptionType single_or_event = cNamedNumbers[2];
	public static final SubscriptionType periodic = cNamedNumbers[3];
	public static final SubscriptionType single_or_periodic = cNamedNumbers[4];
	public static final SubscriptionType event_or_periodic = cNamedNumbers[5];
	public static final SubscriptionType single_event_periodic = cNamedNumbers[6];
	
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
	    if (value >= 0 && value <= 6)
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
	
	public static SubscriptionType valueOf(long value)
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
		    0x000a
		}
	    ),
	    new QName (
		"datex.iso14827_1",
		"ISO14827_MESSAGE$SubscriptionType"
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
			"single",
			0
		    ),
		    new MemberListElement (
			"event-driven",
			1
		    ),
		    new MemberListElement (
			"single-or-event",
			2
		    ),
		    new MemberListElement (
			"periodic",
			3
		    ),
		    new MemberListElement (
			"single-or-periodic",
			4
		    ),
		    new MemberListElement (
			"event-or-periodic",
			5
		    ),
		    new MemberListElement (
			"single-event-periodic",
			6
		    )
		}
	    ),
	    0,
	    single
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

    // Methods for field "initialPublication"
    public PrintableString getInitialPublication()
    {
	return (PrintableString)mComponents[6];
    }
    
    public void setInitialPublication(PrintableString initialPublication)
    {
	mComponents[6] = initialPublication;
    }
    
    public boolean hasInitialPublication()
    {
	return componentIsPresent(6);
    }
    
    public void deleteInitialPublication()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "subsequentPublications"
    public PrintableString getSubsequentPublications()
    {
	return (PrintableString)mComponents[7];
    }
    
    public void setSubsequentPublications(PrintableString subsequentPublications)
    {
	mComponents[7] = subsequentPublications;
    }
    
    public boolean hasSubsequentPublications()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSubsequentPublications()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "id"
    public ObjectIdentifier getId()
    {
	return (ObjectIdentifier)mComponents[8];
    }
    
    public void setId(ObjectIdentifier id)
    {
	mComponents[8] = id;
    }
    
    
    // Methods for field "_oss_unique_index"
    public long get_oss_unique_index()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void set_oss_unique_index(long _oss_unique_index)
    {
	set_oss_unique_index(new INTEGER(_oss_unique_index));
    }
    
    public void set_oss_unique_index(INTEGER _oss_unique_index)
    {
	mComponents[9] = _oss_unique_index;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    null
	),
	new QName (
	    "datex.iso14827_1",
	    "ISO14827_MESSAGE"
	),
	new QName (
	    "ISO14827-1",
	    "ISO14827-MESSAGE"
	),
	800787,
	null,
	new FieldsList (
	    new InfoObjectFieldInfo[] {
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    0x0013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "name",
		    0,
		    2,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    0x0013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(65535),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "definition",
		    1,
		    2,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "com.oss.asn1",
			    "ASN1Type"
			)
		    ),
		    "MessageBody",
		    2,
		    2,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    0x0013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(20000),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "remarks",
		    3,
		    3,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_1",
			    "ISO14827_MESSAGE$MessageType"
			)
		    ),
		    "messageType",
		    4,
		    2,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_1",
			    "ISO14827_MESSAGE$SubscriptionType"
			)
		    ),
		    "subscriptionType",
		    5,
		    3,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    0x0013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "initialPublication",
		    6,
		    3,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    0x0013
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(0),
					    new INTEGER(255),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    null,
			    null
			)
		    ),
		    "subsequentPublications",
		    7,
		    3,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "com.oss.asn1",
			    "ObjectIdentifier"
			)
		    ),
		    "id",
		    8,
		    2,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "com.oss.asn1",
			    "INTEGER"
			)
		    ),
		    "_oss_unique_index",
		    9,
		    66,
		    null
		)
	    }
	),
	0,
	null,
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ISO14827_MESSAGE object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ISO14827_MESSAGE object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ISO14827_MESSAGE
