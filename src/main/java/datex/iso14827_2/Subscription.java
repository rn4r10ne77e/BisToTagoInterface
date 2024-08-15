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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Subscription from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Subscription extends Sequence {
    
    /**
     * The default constructor.
     */
    public Subscription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Subscription(INTEGER datexSubscribe_Serial_nbr, 
		    SubscriptionType datexSubscribe_Type)
    {
	setDatexSubscribe_Serial_nbr(datexSubscribe_Serial_nbr);
	setDatexSubscribe_Type(datexSubscribe_Type);
    }
    
    /**
     * Construct with components.
     */
    public Subscription(long datexSubscribe_Serial_nbr, 
		    SubscriptionType datexSubscribe_Type)
    {
	this(new INTEGER(datexSubscribe_Serial_nbr), datexSubscribe_Type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new SubscriptionType();
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
		return new SubscriptionType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexSubscribe_Serial_nbr"
    public long getDatexSubscribe_Serial_nbr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDatexSubscribe_Serial_nbr(long datexSubscribe_Serial_nbr)
    {
	setDatexSubscribe_Serial_nbr(new INTEGER(datexSubscribe_Serial_nbr));
    }
    
    public void setDatexSubscribe_Serial_nbr(INTEGER datexSubscribe_Serial_nbr)
    {
	mComponents[0] = datexSubscribe_Serial_nbr;
    }
    
    
    // Methods for field "datexSubscribe_Type"
    public SubscriptionType getDatexSubscribe_Type()
    {
	return (SubscriptionType)mComponents[1];
    }
    
    public void setDatexSubscribe_Type(SubscriptionType datexSubscribe_Type)
    {
	mComponents[1] = datexSubscribe_Type;
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
	    "Subscription"
	),
	new QName (
	    "ISO14827-2",
	    "Subscription"
	),
	800791,
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
		    "datexSubscribe-Serial-nbr",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
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
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "SubscriptionType"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "datexSubscribe-Type",
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
     * Get the type descriptor (TypeInfo) of 'this' Subscription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Subscription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Subscription
