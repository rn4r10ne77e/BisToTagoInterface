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
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type C2CAuthenticatedMessage from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class C2CAuthenticatedMessage extends Sequence {
    
    /**
     * The default constructor.
     */
    public C2CAuthenticatedMessage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public C2CAuthenticatedMessage(OctetString datex_AuthenticationInfo_text, 
		    INTEGER datex_DataPacket_number, 
		    INTEGER datex_DataPacketPriority_number, 
		    HeaderOptions options, PDUs pdu)
    {
	setDatex_AuthenticationInfo_text(datex_AuthenticationInfo_text);
	setDatex_DataPacket_number(datex_DataPacket_number);
	setDatex_DataPacketPriority_number(datex_DataPacketPriority_number);
	setOptions(options);
	setPdu(pdu);
    }
    
    /**
     * Construct with components.
     */
    public C2CAuthenticatedMessage(OctetString datex_AuthenticationInfo_text, 
		    long datex_DataPacket_number, 
		    long datex_DataPacketPriority_number, 
		    HeaderOptions options, PDUs pdu)
    {
	this(datex_AuthenticationInfo_text, 
	     new INTEGER(datex_DataPacket_number), 
	     new INTEGER(datex_DataPacketPriority_number), options, pdu);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OctetString();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new HeaderOptions();
	mComponents[4] = new PDUs();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new OctetString();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new HeaderOptions();
	    case 4:
		return new PDUs();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datex_AuthenticationInfo_text"
    public OctetString getDatex_AuthenticationInfo_text()
    {
	return (OctetString)mComponents[0];
    }
    
    public void setDatex_AuthenticationInfo_text(OctetString datex_AuthenticationInfo_text)
    {
	mComponents[0] = datex_AuthenticationInfo_text;
    }
    
    
    // Methods for field "datex_DataPacket_number"
    public long getDatex_DataPacket_number()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDatex_DataPacket_number(long datex_DataPacket_number)
    {
	setDatex_DataPacket_number(new INTEGER(datex_DataPacket_number));
    }
    
    public void setDatex_DataPacket_number(INTEGER datex_DataPacket_number)
    {
	mComponents[1] = datex_DataPacket_number;
    }
    
    
    // Methods for field "datex_DataPacketPriority_number"
    public long getDatex_DataPacketPriority_number()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setDatex_DataPacketPriority_number(long datex_DataPacketPriority_number)
    {
	setDatex_DataPacketPriority_number(new INTEGER(datex_DataPacketPriority_number));
    }
    
    public void setDatex_DataPacketPriority_number(INTEGER datex_DataPacketPriority_number)
    {
	mComponents[2] = datex_DataPacketPriority_number;
    }
    
    
    // Methods for field "options"
    public HeaderOptions getOptions()
    {
	return (HeaderOptions)mComponents[3];
    }
    
    public void setOptions(HeaderOptions options)
    {
	mComponents[3] = options;
    }
    
    
    // Methods for field "pdu"
    public PDUs getPdu()
    {
	return (PDUs)mComponents[4];
    }
    
    public void setPdu(PDUs pdu)
    {
	mComponents[4] = pdu;
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
	    "C2CAuthenticatedMessage"
	),
	new QName (
	    "ISO14827-2",
	    "C2CAuthenticatedMessage"
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
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    800787,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(0),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "datex-AuthenticationInfo-text",
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
		    "datex-DataPacket-number",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
				    new INTEGER(10),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "datex-DataPacketPriority-number",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"HeaderOptions"
			    ),
			    new QName (
				"ISO14827-2",
				"HeaderOptions"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "HeaderOptions"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "HeaderOptions"
				)
			    ),
			    0
			)
		    ),
		    "options",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"PDUs"
			    ),
			    new QName (
				"ISO14827-2",
				"PDUs"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "PDUs"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7),
				    new TagDecoderElement((short)0x8008, 8),
				    new TagDecoderElement((short)0x8009, 9)
				}
			    )
			)
		    ),
		    "pdu",
		    4,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' C2CAuthenticatedMessage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' C2CAuthenticatedMessage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for C2CAuthenticatedMessage
