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
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Reject from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Reject extends Sequence {
    
    /**
     * The default constructor.
     */
    public Reject()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Reject(INTEGER datexReject_Packet_nbr, RejectType datexReject_Type, 
		    AlternateRequest datexReject_AlternateRequest)
    {
	setDatexReject_Packet_nbr(datexReject_Packet_nbr);
	setDatexReject_Type(datexReject_Type);
	setDatexReject_AlternateRequest(datexReject_AlternateRequest);
    }
    
    /**
     * Construct with components.
     */
    public Reject(long datexReject_Packet_nbr, RejectType datexReject_Type, 
		    AlternateRequest datexReject_AlternateRequest)
    {
	this(new INTEGER(datexReject_Packet_nbr), datexReject_Type, 
	     datexReject_AlternateRequest);
    }
    
    /**
     * Construct with required components.
     */
    public Reject(long datexReject_Packet_nbr, RejectType datexReject_Type)
    {
	setDatexReject_Packet_nbr(datexReject_Packet_nbr);
	setDatexReject_Type(datexReject_Type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new RejectType();
	mComponents[2] = new AlternateRequest();
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
		return new INTEGER();
	    case 1:
		return new RejectType();
	    case 2:
		return new AlternateRequest();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexReject_Packet_nbr"
    public long getDatexReject_Packet_nbr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDatexReject_Packet_nbr(long datexReject_Packet_nbr)
    {
	setDatexReject_Packet_nbr(new INTEGER(datexReject_Packet_nbr));
    }
    
    public void setDatexReject_Packet_nbr(INTEGER datexReject_Packet_nbr)
    {
	mComponents[0] = datexReject_Packet_nbr;
    }
    
    
    // Methods for field "datexReject_Type"
    public RejectType getDatexReject_Type()
    {
	return (RejectType)mComponents[1];
    }
    
    public void setDatexReject_Type(RejectType datexReject_Type)
    {
	mComponents[1] = datexReject_Type;
    }
    
    
    // Methods for field "datexReject_AlternateRequest"
    public AlternateRequest getDatexReject_AlternateRequest()
    {
	return (AlternateRequest)mComponents[2];
    }
    
    public void setDatexReject_AlternateRequest(AlternateRequest datexReject_AlternateRequest)
    {
	mComponents[2] = datexReject_AlternateRequest;
    }
    
    public boolean hasDatexReject_AlternateRequest()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDatexReject_AlternateRequest()
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
	    "datex.iso14827_2",
	    "Reject"
	),
	new QName (
	    "ISO14827-2",
	    "Reject"
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
		    "datexReject-Packet-nbr",
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
				"RejectType"
			    ),
			    new QName (
				"ISO14827-2",
				"RejectType"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "RejectType"
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
		    "datexReject-Type",
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
				"AlternateRequest"
			    ),
			    new QName (
				"ISO14827-2",
				"AlternateRequest"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "AlternateRequest"
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
		    "datexReject-AlternateRequest",
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
     * Get the type descriptor (TypeInfo) of 'this' Reject object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Reject object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Reject
