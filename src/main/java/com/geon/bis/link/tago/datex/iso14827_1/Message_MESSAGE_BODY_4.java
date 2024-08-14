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

import com.geon.bis.link.tago.datex.businfomation.BusBaseInformation;
import com.oss.asn1.AbstractData;
import com.oss.asn1.SequenceOf;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Message_MESSAGE_BODY_4 from ASN1 Module ISO14827_1.
 * @see SequenceOf
 */

public class Message_MESSAGE_BODY_4 extends SequenceOf<BusBaseInformation> {
    
    /**
     * The default constructor.
     */
    public Message_MESSAGE_BODY_4()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public Message_MESSAGE_BODY_4(BusBaseInformation[] elements)
    {
	super(elements);
    }
    
    /**
     * Create an instance of  SEQUENCE OF/SET OF.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new BusBaseInformation();
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "datex.iso14827_1",
	    "Message_MESSAGE_BODY_4"
	),
	new QName (
	    "builtin",
	    "SEQUENCE OF"
	),
	800787,
	null,
	null,
	new TypeInfoRef (
	    new QName (
		"datex.businfomation",
		"BusBaseInformation"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Message_MESSAGE_BODY_4 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Message_MESSAGE_BODY_4 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Message_MESSAGE_BODY_4
