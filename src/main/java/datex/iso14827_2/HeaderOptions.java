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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type HeaderOptions from ASN1 Module ISO14827_2.
 * @see Sequence
 */

public class HeaderOptions extends Sequence {
    
    /**
     * The default constructor.
     */
    public HeaderOptions()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public HeaderOptions(UTF8String16 datex_Origin_text, 
		    OctetString datex_OriginAddress_location, 
		    UTF8String16 datex_Sender_text, 
		    OctetString datex_SenderAddress_location, 
		    UTF8String16 datex_Destination_text, 
		    OctetString datex_DestinationAddress_location, 
		    Cost datex_Cost, Time datex_DataPacket_time)
    {
	setDatex_Origin_text(datex_Origin_text);
	setDatex_OriginAddress_location(datex_OriginAddress_location);
	setDatex_Sender_text(datex_Sender_text);
	setDatex_SenderAddress_location(datex_SenderAddress_location);
	setDatex_Destination_text(datex_Destination_text);
	setDatex_DestinationAddress_location(datex_DestinationAddress_location);
	setDatex_Cost(datex_Cost);
	setDatex_DataPacket_time(datex_DataPacket_time);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new OctetString();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new OctetString();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new OctetString();
	mComponents[6] = new Cost();
	mComponents[7] = new Time();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new OctetString();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new OctetString();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new OctetString();
	    case 6:
		return new Cost();
	    case 7:
		return new Time();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "datex_Origin_text"
    public UTF8String16 getDatex_Origin_text()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setDatex_Origin_text(UTF8String16 datex_Origin_text)
    {
	mComponents[0] = datex_Origin_text;
    }
    
    public boolean hasDatex_Origin_text()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDatex_Origin_text()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "datex_OriginAddress_location"
    public OctetString getDatex_OriginAddress_location()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setDatex_OriginAddress_location(OctetString datex_OriginAddress_location)
    {
	mComponents[1] = datex_OriginAddress_location;
    }
    
    public boolean hasDatex_OriginAddress_location()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDatex_OriginAddress_location()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "datex_Sender_text"
    public UTF8String16 getDatex_Sender_text()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setDatex_Sender_text(UTF8String16 datex_Sender_text)
    {
	mComponents[2] = datex_Sender_text;
    }
    
    public boolean hasDatex_Sender_text()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDatex_Sender_text()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "datex_SenderAddress_location"
    public OctetString getDatex_SenderAddress_location()
    {
	return (OctetString)mComponents[3];
    }
    
    public void setDatex_SenderAddress_location(OctetString datex_SenderAddress_location)
    {
	mComponents[3] = datex_SenderAddress_location;
    }
    
    public boolean hasDatex_SenderAddress_location()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDatex_SenderAddress_location()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "datex_Destination_text"
    public UTF8String16 getDatex_Destination_text()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setDatex_Destination_text(UTF8String16 datex_Destination_text)
    {
	mComponents[4] = datex_Destination_text;
    }
    
    public boolean hasDatex_Destination_text()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDatex_Destination_text()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "datex_DestinationAddress_location"
    public OctetString getDatex_DestinationAddress_location()
    {
	return (OctetString)mComponents[5];
    }
    
    public void setDatex_DestinationAddress_location(OctetString datex_DestinationAddress_location)
    {
	mComponents[5] = datex_DestinationAddress_location;
    }
    
    public boolean hasDatex_DestinationAddress_location()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDatex_DestinationAddress_location()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "datex_Cost"
    public Cost getDatex_Cost()
    {
	return (Cost)mComponents[6];
    }
    
    public void setDatex_Cost(Cost datex_Cost)
    {
	mComponents[6] = datex_Cost;
    }
    
    public boolean hasDatex_Cost()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDatex_Cost()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "datex_DataPacket_time"
    public Time getDatex_DataPacket_time()
    {
	return (Time)mComponents[7];
    }
    
    public void setDatex_DataPacket_time(Time datex_DataPacket_time)
    {
	mComponents[7] = datex_DataPacket_time;
    }
    
    public boolean hasDatex_DataPacket_time()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDatex_DataPacket_time()
    {
	setComponentAbsent(7);
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
	    "HeaderOptions"
	),
	new QName (
	    "ISO14827-2",
	    "HeaderOptions"
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
		    "datex-Origin-text",
		    0,
		    3,
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
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    800787,
			    null,
			    null
			)
		    ),
		    "datex-OriginAddress-location",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "datex-Sender-text",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
			    null,
			    null
			)
		    ),
		    "datex-SenderAddress-location",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "datex-Destination-text",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
			    null,
			    null
			)
		    ),
		    "datex-DestinationAddress-location",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Cost"
			    ),
			    new QName (
				"ISO14827-2",
				"Cost"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Cost"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Cost"
				)
			    ),
			    0
			)
		    ),
		    "datex-Cost",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Time"
			    ),
			    new QName (
				"ISO14827-2",
				"Time"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Time"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Time"
				)
			    ),
			    0
			)
		    ),
		    "datex-DataPacket-time",
		    7,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HeaderOptions object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HeaderOptions object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HeaderOptions
