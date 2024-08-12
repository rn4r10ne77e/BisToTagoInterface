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
 * Define the ASN1 Type Accept from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Accept extends Sequence {
    
    /**
     * The default constructor.
     */
    public Accept()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Accept(INTEGER datexAccept_Packet_nbr, 
		    DatexAccept_Type datexAccept_Type)
    {
	setDatexAccept_Packet_nbr(datexAccept_Packet_nbr);
	setDatexAccept_Type(datexAccept_Type);
    }
    
    /**
     * Construct with components.
     */
    public Accept(long datexAccept_Packet_nbr, 
		    DatexAccept_Type datexAccept_Type)
    {
	this(new INTEGER(datexAccept_Packet_nbr), datexAccept_Type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new DatexAccept_Type();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new DatexAccept_Type();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexAccept_Packet_nbr"
    public long getDatexAccept_Packet_nbr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDatexAccept_Packet_nbr(long datexAccept_Packet_nbr)
    {
	setDatexAccept_Packet_nbr(new INTEGER(datexAccept_Packet_nbr));
    }
    
    public void setDatexAccept_Packet_nbr(INTEGER datexAccept_Packet_nbr)
    {
	mComponents[0] = datexAccept_Packet_nbr;
    }
    
    
    // Methods for field "datexAccept_Type"
    public DatexAccept_Type getDatexAccept_Type()
    {
	return (DatexAccept_Type)mComponents[1];
    }
    
    public void setDatexAccept_Type(DatexAccept_Type datexAccept_Type)
    {
	mComponents[1] = datexAccept_Type;
    }
    
    
    
    /**
     * Define the ASN1 Type DatexAccept_Type from ASN1 Module ISO14827_2.
     * @see Choice
     */
    public static class DatexAccept_Type extends Choice {
	
	/**
	 * The default constructor.
	 */
	public DatexAccept_Type()
	{
	}
	
	public static final  int  logIn_chosen = 1;
	public static final  int  single_subscription_chosen = 2;
	public static final  int  registered_subscription_chosen = 3;
	public static final  int  publication_chosen = 4;
	
	// Methods for field "logIn"
	public static DatexAccept_Type createDatexAccept_TypeWithLogIn(ObjectIdentifier logIn)
	{
	    DatexAccept_Type __object = new DatexAccept_Type();

	    __object.setLogIn(logIn);
	    return __object;
	}
	
	public boolean hasLogIn()
	{
	    return getChosenFlag() == logIn_chosen;
	}
	
	public ObjectIdentifier getLogIn()
	{
	    if (hasLogIn())
		return (ObjectIdentifier)mChosenValue;
	    else
		return null;
	}
	
	public void setLogIn(ObjectIdentifier logIn)
	{
	    setChosenValue(logIn);
	    setChosenFlag(logIn_chosen);
	}
	
	
	// Methods for field "single_subscription"
	public static DatexAccept_Type createDatexAccept_TypeWithSingle_subscription(Null single_subscription)
	{
	    DatexAccept_Type __object = new DatexAccept_Type();

	    __object.setSingle_subscription(single_subscription);
	    return __object;
	}
	
	public boolean hasSingle_subscription()
	{
	    return getChosenFlag() == single_subscription_chosen;
	}
	
	public Null getSingle_subscription()
	{
	    if (hasSingle_subscription())
		return (Null)mChosenValue;
	    else
		return null;
	}
	
	public void setSingle_subscription(Null single_subscription)
	{
	    setChosenValue(single_subscription);
	    setChosenFlag(single_subscription_chosen);
	}
	
	
	// Methods for field "registered_subscription"
	public static DatexAccept_Type createDatexAccept_TypeWithRegistered_subscription(long registered_subscription)
	{
	    return createDatexAccept_TypeWithRegistered_subscription(new INTEGER(registered_subscription));
	}
	
	public static DatexAccept_Type createDatexAccept_TypeWithRegistered_subscription(INTEGER registered_subscription)
	{
	    DatexAccept_Type __object = new DatexAccept_Type();

	    __object.setRegistered_subscription(registered_subscription);
	    return __object;
	}
	
	public boolean hasRegistered_subscription()
	{
	    return getChosenFlag() == registered_subscription_chosen;
	}
	
	public INTEGER getRegistered_subscription()
	{
	    if (hasRegistered_subscription())
		return (INTEGER)mChosenValue;
	    else
		return null;
	}
	
	public void setRegistered_subscription(long registered_subscription)
	{
	    setRegistered_subscription(new INTEGER(registered_subscription));
	}
	
	public void setRegistered_subscription(INTEGER registered_subscription)
	{
	    setChosenValue(registered_subscription);
	    setChosenFlag(registered_subscription_chosen);
	}
	
	
	// Methods for field "publication"
	public static DatexAccept_Type createDatexAccept_TypeWithPublication(Null publication)
	{
	    DatexAccept_Type __object = new DatexAccept_Type();

	    __object.setPublication(publication);
	    return __object;
	}
	
	public boolean hasPublication()
	{
	    return getChosenFlag() == publication_chosen;
	}
	
	public Null getPublication()
	{
	    if (hasPublication())
		return (Null)mChosenValue;
	    else
		return null;
	}
	
	public void setPublication(Null publication)
	{
	    setChosenValue(publication);
	    setChosenFlag(publication_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case logIn_chosen:
		    return new ObjectIdentifier();
		case single_subscription_chosen:
		    return new Null();
		case registered_subscription_chosen:
		    return new INTEGER();
		case publication_chosen:
		    return new Null();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Accept$DatexAccept_Type"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    800787,
	    null,
	    new FieldsList (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new VectorInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "ObjectIdentifier"
				),
				new QName (
				    "builtin",
				    "OBJECT IDENTIFIER"
				),
				800787,
				null,
				null
			    )
			),
			"logIn",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				1849363,
				null
			    )
			),
			"single-subscription",
			1,
			2
		    ),
		    new FieldInfo (
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
					new INTEGER(4294967295L),
					0
				    )
				),
				null,
				null
			    )
			),
			"registered-subscription",
			2,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				1849363,
				null
			    )
			),
			"publication",
			3,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2),
		    new TagDecoderElement((short)0x8003, 3)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexAccept_Type object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexAccept_Type object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DatexAccept_Type

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
	    "Accept"
	),
	new QName (
	    "ISO14827-2",
	    "Accept"
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
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(0),
				    new INTEGER(4294967295L),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datexAccept-Packet-nbr",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Accept$DatexAccept_Type"
			)
		    ),
		    "datexAccept-Type",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Accept object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Accept object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Accept
