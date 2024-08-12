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
import com.oss.asn1.ObjectIdentifier;
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type EndApplicationMessage from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class EndApplicationMessage extends Sequence {
    
    /**
     * The default constructor.
     */
    public EndApplicationMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EndApplicationMessage(ObjectIdentifier endApplication_Message_id, 
		    OpenType endApplication_Message_msg)
    {
	setEndApplication_Message_id(endApplication_Message_id);
	setEndApplication_Message_msg(endApplication_Message_msg);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ObjectIdentifier();
	mComponents[1] = new OpenType();
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
		return new ObjectIdentifier();
	    case 1:
		return new OpenType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "endApplication_Message_id"
    public ObjectIdentifier getEndApplication_Message_id()
    {
	return (ObjectIdentifier)mComponents[0];
    }
    
    public void setEndApplication_Message_id(ObjectIdentifier endApplication_Message_id)
    {
	mComponents[0] = endApplication_Message_id;
    }
    
    
    // Methods for field "endApplication_Message_msg"
    public OpenType getEndApplication_Message_msg()
    {
	return (OpenType)mComponents[1];
    }
    
    public void setEndApplication_Message_msg(OpenType endApplication_Message_msg)
    {
	mComponents[1] = endApplication_Message_msg;
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
	    "EndApplicationMessage"
	),
	new QName (
	    "ISO14827-2",
	    "EndApplicationMessage"
	),
	801299,
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
				"ObjectIdentifier"
			    ),
			    new QName (
				"builtin",
				"OBJECT IDENTIFIER"
			    ),
			    800787,
			    new TableConstraint (
				datex.iso14827_1.ISO14827_1.message,
				8
			    ),
			    null
			)
		    ),
		    "endApplication-Message-id",
		    0,
		    274,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new OpenTypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OpenType"
			    ),
			    new QName (
				"builtin",
				"OpenType"
			    ),
			    1849363,
			    new ComponentRelationConstraint (
				new TableConstraint (
				    datex.iso14827_1.ISO14827_1.message,
				    2
				),
				new ComponentRelations (
				    new ComponentRelation[] {
					new ComponentRelation (
					    8,
					    new FieldInfoRef (
						new QName (
						    "datex.iso14827_2",
						    "EndApplicationMessage"
						),
						0
					    ),
					    1
					)
				    }
				)
			    ),
			    new ComponentRelationConstraint (
				new TableConstraint (
				    datex.iso14827_1.ISO14827_1.message,
				    2
				),
				new ComponentRelations (
				    new ComponentRelation[] {
					new ComponentRelation (
					    8,
					    new FieldInfoRef (
						new QName (
						    "datex.iso14827_2",
						    "EndApplicationMessage"
						),
						0
					    ),
					    1
					)
				    }
				)
			    )
			)
		    ),
		    "endApplication-Message-msg",
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
     * Get the type descriptor (TypeInfo) of 'this' EndApplicationMessage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EndApplicationMessage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EndApplicationMessage
