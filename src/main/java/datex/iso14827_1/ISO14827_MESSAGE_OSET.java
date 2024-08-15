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


package datex.iso14827_1;

import com.oss.asn1.AbstractData;
import com.oss.asn1.InfoObjectSet;
import com.oss.metadata.ContainerInfo;
import com.oss.metadata.QName;
import com.oss.metadata.TypeInfo;
import com.oss.metadata.TypeInfoRef;

/**
 * Define the ASN1 Type ISO14827_MESSAGE_OSET from ASN1 Module ISO14827_1.
 * @see InfoObjectSet
 */

public class ISO14827_MESSAGE_OSET extends InfoObjectSet {
    
    /**
     * The default constructor.
     */
    public ISO14827_MESSAGE_OSET()
    {
    }
    
    /**
     * Construct with components.
     */
    public ISO14827_MESSAGE_OSET(ISO14827_MESSAGE[] objects, int flags,
		    String modname, String osetname)
    {
	super(objects, flags, modname, osetname);
    }
    
    /**
     * Initialize the type descriptor..
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	null,
	new QName (
	    "datex.iso14827_1",
	    "ISO14827_MESSAGE_OSET"
	),
	new QName (
	    "ISO14827-1",
	    "ISO14827-MESSAGE"
	),
	0,
	null,
	null,
	new TypeInfoRef (
	    new QName (
		"datex.iso14827_1",
		"ISO14827_MESSAGE"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ISO14827_MESSAGE_OSET object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ISO14827_MESSAGE_OSET object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Create an instance of the class that SEQUENCE OF/SET OF holds.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new ISO14827_MESSAGE();
    }
    
} // End class definition for ISO14827_MESSAGE_OSET
