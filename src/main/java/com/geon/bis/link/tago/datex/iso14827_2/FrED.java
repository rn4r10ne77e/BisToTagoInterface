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

import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type FrED from ASN1 Module ISO14827_2.
 * @see INTEGER
 */

public class FrED extends INTEGER {
    
    /**
     * The default constructor.
     */
    public FrED()
    {
    }
    
    public FrED(short value)
    {
	super(value);
    }
    
    public FrED(int value)
    {
	super(value);
    }
    
    public FrED(long value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final IntegerInfo c_typeinfo = new IntegerInfo (
	new Tags (
	    new short[] {
		0x0002
	    }
	),
	new QName (
	    "datex.iso14827_2",
	    "FrED"
	),
	new QName (
	    "ISO14827-2",
	    "FrED"
	),
	800787,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new FrED(0), 
		new FrED(4294967295L),
		0
	    )
	),
	null,
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FrED object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FrED object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FrED
