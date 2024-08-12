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
 * Define the ASN1 Type TransferDone from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class TransferDone extends Sequence {
    
    /**
     * The default constructor.
     */
    public TransferDone()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TransferDone(INTEGER datexTransferDone_Publication_nbr, 
		    UTF8String16 datexTransferDone_FileName_txt, 
		    BOOLEAN datexTransferDone_Success_bool)
    {
	setDatexTransferDone_Publication_nbr(datexTransferDone_Publication_nbr);
	setDatexTransferDone_FileName_txt(datexTransferDone_FileName_txt);
	setDatexTransferDone_Success_bool(datexTransferDone_Success_bool);
    }
    
    /**
     * Construct with components.
     */
    public TransferDone(long datexTransferDone_Publication_nbr, 
		    UTF8String16 datexTransferDone_FileName_txt, 
		    boolean datexTransferDone_Success_bool)
    {
	this(new INTEGER(datexTransferDone_Publication_nbr), 
	     datexTransferDone_FileName_txt, 
	     new BOOLEAN(datexTransferDone_Success_bool));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new BOOLEAN();
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
		return new UTF8String16();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexTransferDone_Publication_nbr"
    public long getDatexTransferDone_Publication_nbr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDatexTransferDone_Publication_nbr(long datexTransferDone_Publication_nbr)
    {
	setDatexTransferDone_Publication_nbr(new INTEGER(datexTransferDone_Publication_nbr));
    }
    
    public void setDatexTransferDone_Publication_nbr(INTEGER datexTransferDone_Publication_nbr)
    {
	mComponents[0] = datexTransferDone_Publication_nbr;
    }
    
    
    // Methods for field "datexTransferDone_FileName_txt"
    public UTF8String16 getDatexTransferDone_FileName_txt()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setDatexTransferDone_FileName_txt(UTF8String16 datexTransferDone_FileName_txt)
    {
	mComponents[1] = datexTransferDone_FileName_txt;
    }
    
    
    // Methods for field "datexTransferDone_Success_bool"
    public boolean getDatexTransferDone_Success_bool()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setDatexTransferDone_Success_bool(boolean datexTransferDone_Success_bool)
    {
	setDatexTransferDone_Success_bool(new BOOLEAN(datexTransferDone_Success_bool));
    }
    
    public void setDatexTransferDone_Success_bool(BOOLEAN datexTransferDone_Success_bool)
    {
	mComponents[2] = datexTransferDone_Success_bool;
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
	    "TransferDone"
	),
	new QName (
	    "ISO14827-2",
	    "TransferDone"
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
		    "datexTransferDone-Publication-nbr",
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
					new INTEGER(2000),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "datexTransferDone-FileName-txt",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "datexTransferDone-Success-bool",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' TransferDone object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TransferDone object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TransferDone
