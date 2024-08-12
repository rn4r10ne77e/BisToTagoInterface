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


package com.geon.bis.link.tago.datex.businfomation;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Linkcoords from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Linkcoords extends Sequence {
    
    /**
     * The default constructor.
     */
    public Linkcoords()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Linkcoords(UTF8String16 trnt_Linkid, INTEGER linkcoords_Sequence, 
		    NMEACoord linkcoords_Coordinate, 
		    UTF8String16 linkcoords_Reg_date, 
		    UTF8String16 linkcoords_Remark)
    {
	setTrnt_Linkid(trnt_Linkid);
	setLinkcoords_Sequence(linkcoords_Sequence);
	setLinkcoords_Coordinate(linkcoords_Coordinate);
	setLinkcoords_Reg_date(linkcoords_Reg_date);
	setLinkcoords_Remark(linkcoords_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Linkcoords(UTF8String16 trnt_Linkid, long linkcoords_Sequence, 
		    NMEACoord linkcoords_Coordinate, 
		    UTF8String16 linkcoords_Reg_date, 
		    UTF8String16 linkcoords_Remark)
    {
	this(trnt_Linkid, new INTEGER(linkcoords_Sequence), 
	     linkcoords_Coordinate, linkcoords_Reg_date, linkcoords_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Linkcoords(UTF8String16 trnt_Linkid, long linkcoords_Sequence, 
		    NMEACoord linkcoords_Coordinate, 
		    UTF8String16 linkcoords_Reg_date)
    {
	setTrnt_Linkid(trnt_Linkid);
	setLinkcoords_Sequence(linkcoords_Sequence);
	setLinkcoords_Coordinate(linkcoords_Coordinate);
	setLinkcoords_Reg_date(linkcoords_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new NMEACoord();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
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
		return new UTF8String16();
	    case 1:
		return new INTEGER();
	    case 2:
		return new NMEACoord();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Linkid"
    public UTF8String16 getTrnt_Linkid()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Linkid(UTF8String16 trnt_Linkid)
    {
	mComponents[0] = trnt_Linkid;
    }
    
    
    // Methods for field "linkcoords_Sequence"
    public long getLinkcoords_Sequence()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setLinkcoords_Sequence(long linkcoords_Sequence)
    {
	setLinkcoords_Sequence(new INTEGER(linkcoords_Sequence));
    }
    
    public void setLinkcoords_Sequence(INTEGER linkcoords_Sequence)
    {
	mComponents[1] = linkcoords_Sequence;
    }
    
    
    // Methods for field "linkcoords_Coordinate"
    public NMEACoord getLinkcoords_Coordinate()
    {
	return (NMEACoord)mComponents[2];
    }
    
    public void setLinkcoords_Coordinate(NMEACoord linkcoords_Coordinate)
    {
	mComponents[2] = linkcoords_Coordinate;
    }
    
    
    // Methods for field "linkcoords_Reg_date"
    public UTF8String16 getLinkcoords_Reg_date()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setLinkcoords_Reg_date(UTF8String16 linkcoords_Reg_date)
    {
	mComponents[3] = linkcoords_Reg_date;
    }
    
    
    // Methods for field "linkcoords_Remark"
    public UTF8String16 getLinkcoords_Remark()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setLinkcoords_Remark(UTF8String16 linkcoords_Remark)
    {
	mComponents[4] = linkcoords_Remark;
    }
    
    public boolean hasLinkcoords_Remark()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLinkcoords_Remark()
    {
	setComponentAbsent(4);
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
	    "datex.businfomation",
	    "Linkcoords"
	),
	new QName (
	    "BusInfomation",
	    "Linkcoords"
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
					new INTEGER(1),
					new INTEGER(10),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "trnt-Linkid",
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
				    new INTEGER(9999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "linkcoords-Sequence",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"datex.businfomation",
				"NMEACoord"
			    ),
			    new QName (
				"BusInfomation",
				"NMEACoord"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.businfomation",
				    "NMEACoord"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.businfomation",
				    "NMEACoord"
				)
			    ),
			    0
			)
		    ),
		    "linkcoords-Coordinate",
		    2,
		    2,
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
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    800787,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new INTEGER(8)
				    )
				),
				new PermittedAlphabetConstraint (
				    new PermittedAlphabet (
					"0123456789"
				    )
				)
			    ),
			    null
			)
		    ),
		    "linkcoords-Reg-date",
		    3,
		    2,
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
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "linkcoords-Remark",
		    4,
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
     * Get the type descriptor (TypeInfo) of 'this' Linkcoords object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Linkcoords object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Linkcoords
