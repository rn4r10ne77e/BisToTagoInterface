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
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PublicationData from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class PublicationData extends Sequence {
    
    /**
     * The default constructor.
     */
    public PublicationData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PublicationData(INTEGER datexPublish_SubscribeSerial_nbr, 
		    INTEGER datexPublish_Serial_nbr, 
		    BOOLEAN datexPublish_LatePublicationFlag, 
		    PublicationType datexPublish_Type)
    {
	setDatexPublish_SubscribeSerial_nbr(datexPublish_SubscribeSerial_nbr);
	setDatexPublish_Serial_nbr(datexPublish_Serial_nbr);
	setDatexPublish_LatePublicationFlag(datexPublish_LatePublicationFlag);
	setDatexPublish_Type(datexPublish_Type);
    }
    
    /**
     * Construct with components.
     */
    public PublicationData(long datexPublish_SubscribeSerial_nbr, 
		    long datexPublish_Serial_nbr, 
		    boolean datexPublish_LatePublicationFlag, 
		    PublicationType datexPublish_Type)
    {
	this(new INTEGER(datexPublish_SubscribeSerial_nbr), 
	     new INTEGER(datexPublish_Serial_nbr), 
	     new BOOLEAN(datexPublish_LatePublicationFlag), 
	     datexPublish_Type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new PublicationType();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new PublicationType();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datexPublish_SubscribeSerial_nbr"
    public long getDatexPublish_SubscribeSerial_nbr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setDatexPublish_SubscribeSerial_nbr(long datexPublish_SubscribeSerial_nbr)
    {
	setDatexPublish_SubscribeSerial_nbr(new INTEGER(datexPublish_SubscribeSerial_nbr));
    }
    
    public void setDatexPublish_SubscribeSerial_nbr(INTEGER datexPublish_SubscribeSerial_nbr)
    {
	mComponents[0] = datexPublish_SubscribeSerial_nbr;
    }
    
    
    // Methods for field "datexPublish_Serial_nbr"
    public long getDatexPublish_Serial_nbr()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDatexPublish_Serial_nbr(long datexPublish_Serial_nbr)
    {
	setDatexPublish_Serial_nbr(new INTEGER(datexPublish_Serial_nbr));
    }
    
    public void setDatexPublish_Serial_nbr(INTEGER datexPublish_Serial_nbr)
    {
	mComponents[1] = datexPublish_Serial_nbr;
    }
    
    
    // Methods for field "datexPublish_LatePublicationFlag"
    public boolean getDatexPublish_LatePublicationFlag()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setDatexPublish_LatePublicationFlag(boolean datexPublish_LatePublicationFlag)
    {
	setDatexPublish_LatePublicationFlag(new BOOLEAN(datexPublish_LatePublicationFlag));
    }
    
    public void setDatexPublish_LatePublicationFlag(BOOLEAN datexPublish_LatePublicationFlag)
    {
	mComponents[2] = datexPublish_LatePublicationFlag;
    }
    
    
    // Methods for field "datexPublish_Type"
    public PublicationType getDatexPublish_Type()
    {
	return (PublicationType)mComponents[3];
    }
    
    public void setDatexPublish_Type(PublicationType datexPublish_Type)
    {
	mComponents[3] = datexPublish_Type;
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
	    "PublicationData"
	),
	new QName (
	    "ISO14827-2",
	    "PublicationData"
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
		    "datexPublish-SubscribeSerial-nbr",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "datexPublish-Serial-nbr",
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
		    "datexPublish-LatePublicationFlag",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"PublicationType"
			    ),
			    new QName (
				"ISO14827-2",
				"PublicationType"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "PublicationType"
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
		    "datexPublish-Type",
		    3,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PublicationData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PublicationData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PublicationData
