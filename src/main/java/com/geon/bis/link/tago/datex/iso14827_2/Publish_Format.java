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
 * Define the ASN1 Type Publish_Format from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class Publish_Format extends Choice {
    
    /**
     * The default constructor.
     */
    public Publish_Format()
    {
    }
    
    public static final  int  datexPublish_Data_chosen = 1;
    public static final  int  datexPublish_FileName_txt_chosen = 2;
    
    // Methods for field "datexPublish_Data"
    public static Publish_Format createPublish_FormatWithDatexPublish_Data(DatexPublish_Data datexPublish_Data)
    {
	Publish_Format __object = new Publish_Format();

	__object.setDatexPublish_Data(datexPublish_Data);
	return __object;
    }
    
    public boolean hasDatexPublish_Data()
    {
	return getChosenFlag() == datexPublish_Data_chosen;
    }
    
    public DatexPublish_Data getDatexPublish_Data()
    {
	if (hasDatexPublish_Data())
	    return (DatexPublish_Data)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexPublish_Data(DatexPublish_Data datexPublish_Data)
    {
	setChosenValue(datexPublish_Data);
	setChosenFlag(datexPublish_Data_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DatexPublish_Data from ASN1 Module ISO14827_2.
     * @see SequenceOf
     */
    public static class DatexPublish_Data extends SequenceOf<PublicationData> {
	
	/**
	 * The default constructor.
	 */
	public DatexPublish_Data()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public DatexPublish_Data(PublicationData[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PublicationData();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"datex.iso14827_2",
		"Publish_Format$DatexPublish_Data"
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
		    "datex.iso14827_2",
		    "PublicationData"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DatexPublish_Data object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DatexPublish_Data object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DatexPublish_Data

    // Methods for field "datexPublish_FileName_txt"
    public static Publish_Format createPublish_FormatWithDatexPublish_FileName_txt(UTF8String16 datexPublish_FileName_txt)
    {
	Publish_Format __object = new Publish_Format();

	__object.setDatexPublish_FileName_txt(datexPublish_FileName_txt);
	return __object;
    }
    
    public boolean hasDatexPublish_FileName_txt()
    {
	return getChosenFlag() == datexPublish_FileName_txt_chosen;
    }
    
    public UTF8String16 getDatexPublish_FileName_txt()
    {
	if (hasDatexPublish_FileName_txt())
	    return (UTF8String16)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexPublish_FileName_txt(UTF8String16 datexPublish_FileName_txt)
    {
	setChosenValue(datexPublish_FileName_txt);
	setChosenFlag(datexPublish_FileName_txt_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case datexPublish_Data_chosen:
		return new DatexPublish_Data();
	    case datexPublish_FileName_txt_chosen:
		return new UTF8String16();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
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
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.iso14827_2",
			    "Publish_Format$DatexPublish_Data"
			)
		    ),
		    "datexPublish-Data",
		    0,
		    2
		),
		new FieldInfo (
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
		    "datexPublish-FileName-txt",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Publish_Format object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Publish_Format object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Publish_Format
