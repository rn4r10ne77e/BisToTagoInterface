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
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Publication from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class Publication extends Sequence {
    
    /**
     * The default constructor.
     */
    public Publication()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Publication(BOOLEAN datexPublish_Guaranteed_bool, 
		    Publish_Format datexPublish_Format)
    {
	setDatexPublish_Guaranteed_bool(datexPublish_Guaranteed_bool);
	setDatexPublish_Format(datexPublish_Format);
    }
    
    /**
     * Construct with components.
     */
    public Publication(boolean datexPublish_Guaranteed_bool, 
		    Publish_Format datexPublish_Format)
    {
	this(new BOOLEAN(datexPublish_Guaranteed_bool), datexPublish_Format);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new Publish_Format();
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
		return new BOOLEAN();
	    case 1:
		return new Publish_Format();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexPublish_Guaranteed_bool"
    public boolean getDatexPublish_Guaranteed_bool()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setDatexPublish_Guaranteed_bool(boolean datexPublish_Guaranteed_bool)
    {
	setDatexPublish_Guaranteed_bool(new BOOLEAN(datexPublish_Guaranteed_bool));
    }
    
    public void setDatexPublish_Guaranteed_bool(BOOLEAN datexPublish_Guaranteed_bool)
    {
	mComponents[0] = datexPublish_Guaranteed_bool;
    }
    
    
    // Methods for field "datexPublish_Format"
    public Publish_Format getDatexPublish_Format()
    {
	return (Publish_Format)mComponents[1];
    }
    
    public void setDatexPublish_Format(Publish_Format datexPublish_Format)
    {
	mComponents[1] = datexPublish_Format;
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
	    "Publication"
	),
	new QName (
	    "ISO14827-2",
	    "Publication"
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
		    "datexPublish-Guaranteed-bool",
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
				"Publish_Format"
			    ),
			    new QName (
				"ISO14827-2",
				"Publish-Format"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Publish_Format"
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
		    "datexPublish-Format",
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
     * Get the type descriptor (TypeInfo) of 'this' Publication object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Publication object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Publication
