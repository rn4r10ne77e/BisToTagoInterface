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
import com.oss.asn1.UTF8String16;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Initiate from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Initiate extends Sequence {
    
    /**
     * The default constructor.
     */
    public Initiate()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Initiate(UTF8String16 datex_Sender_txt, 
		    UTF8String16 datex_Destination_txt)
    {
	setDatex_Sender_txt(datex_Sender_txt);
	setDatex_Destination_txt(datex_Destination_txt);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
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
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
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
	    "Initiate"
	),
	new QName (
	    "ISO14827-2",
	    "Initiate"
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
     * Get the type descriptor (TypeInfo) of 'this' Initiate object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Initiate object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Initiate
