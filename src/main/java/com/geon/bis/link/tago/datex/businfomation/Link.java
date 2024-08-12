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
 * Define the ASN1 Type Link from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Link extends Sequence {
    
    /**
     * The default constructor.
     */
    public Link()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Link(UTF8String16 trnt_Linkid, UTF8String16 link_Fnode, 
		    UTF8String16 link_Tnode, INTEGER link_Lanes, 
		    UTF8String16 link_Roadrank, UTF8String16 link_Roadtype, 
		    UTF8String16 link_Roadno, UTF8String16 link_Roadname, 
		    UTF8String16 link_Roaduse, UTF8String16 link_Multilink, 
		    UTF8String16 link_Connect, INTEGER link_MaxSpd, 
		    UTF8String16 link_Restveh, INTEGER link_Restw, 
		    INTEGER link_Resth, UTF8String16 link_Reg_date, 
		    UTF8String16 link_Remark)
    {
	setTrnt_Linkid(trnt_Linkid);
	setLink_Fnode(link_Fnode);
	setLink_Tnode(link_Tnode);
	setLink_Lanes(link_Lanes);
	setLink_Roadrank(link_Roadrank);
	setLink_Roadtype(link_Roadtype);
	setLink_Roadno(link_Roadno);
	setLink_Roadname(link_Roadname);
	setLink_Roaduse(link_Roaduse);
	setLink_Multilink(link_Multilink);
	setLink_Connect(link_Connect);
	setLink_MaxSpd(link_MaxSpd);
	setLink_Restveh(link_Restveh);
	setLink_Restw(link_Restw);
	setLink_Resth(link_Resth);
	setLink_Reg_date(link_Reg_date);
	setLink_Remark(link_Remark);
    }
    
    /**
     * Construct with components.
     */
    public Link(UTF8String16 trnt_Linkid, UTF8String16 link_Fnode, 
		    UTF8String16 link_Tnode, long link_Lanes, 
		    UTF8String16 link_Roadrank, UTF8String16 link_Roadtype, 
		    UTF8String16 link_Roadno, UTF8String16 link_Roadname, 
		    UTF8String16 link_Roaduse, UTF8String16 link_Multilink, 
		    UTF8String16 link_Connect, long link_MaxSpd, 
		    UTF8String16 link_Restveh, long link_Restw, 
		    long link_Resth, UTF8String16 link_Reg_date, 
		    UTF8String16 link_Remark)
    {
	this(trnt_Linkid, link_Fnode, link_Tnode, new INTEGER(link_Lanes), 
	     link_Roadrank, link_Roadtype, link_Roadno, link_Roadname, 
	     link_Roaduse, link_Multilink, link_Connect, 
	     new INTEGER(link_MaxSpd), link_Restveh, 
	     new INTEGER(link_Restw), new INTEGER(link_Resth), 
	     link_Reg_date, link_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Link(UTF8String16 trnt_Linkid, UTF8String16 link_Fnode, 
		    UTF8String16 link_Tnode, long link_Lanes, 
		    UTF8String16 link_Roadrank, UTF8String16 link_Roadtype, 
		    UTF8String16 link_Roadno, UTF8String16 link_Roaduse, 
		    UTF8String16 link_Multilink, UTF8String16 link_Connect, 
		    long link_MaxSpd, UTF8String16 link_Reg_date)
    {
	setTrnt_Linkid(trnt_Linkid);
	setLink_Fnode(link_Fnode);
	setLink_Tnode(link_Tnode);
	setLink_Lanes(link_Lanes);
	setLink_Roadrank(link_Roadrank);
	setLink_Roadtype(link_Roadtype);
	setLink_Roadno(link_Roadno);
	setLink_Roaduse(link_Roaduse);
	setLink_Multilink(link_Multilink);
	setLink_Connect(link_Connect);
	setLink_MaxSpd(link_MaxSpd);
	setLink_Reg_date(link_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new INTEGER();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new UTF8String16();
	mComponents[8] = new UTF8String16();
	mComponents[9] = new UTF8String16();
	mComponents[10] = new UTF8String16();
	mComponents[11] = new INTEGER();
	mComponents[12] = new UTF8String16();
	mComponents[13] = new INTEGER();
	mComponents[14] = new INTEGER();
	mComponents[15] = new UTF8String16();
	mComponents[16] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[17];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new INTEGER();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new UTF8String16();
	    case 7:
		return new UTF8String16();
	    case 8:
		return new UTF8String16();
	    case 9:
		return new UTF8String16();
	    case 10:
		return new UTF8String16();
	    case 11:
		return new INTEGER();
	    case 12:
		return new UTF8String16();
	    case 13:
		return new INTEGER();
	    case 14:
		return new INTEGER();
	    case 15:
		return new UTF8String16();
	    case 16:
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
    
    
    // Methods for field "link_Fnode"
    public UTF8String16 getLink_Fnode()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setLink_Fnode(UTF8String16 link_Fnode)
    {
	mComponents[1] = link_Fnode;
    }
    
    
    // Methods for field "link_Tnode"
    public UTF8String16 getLink_Tnode()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setLink_Tnode(UTF8String16 link_Tnode)
    {
	mComponents[2] = link_Tnode;
    }
    
    
    // Methods for field "link_Lanes"
    public long getLink_Lanes()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setLink_Lanes(long link_Lanes)
    {
	setLink_Lanes(new INTEGER(link_Lanes));
    }
    
    public void setLink_Lanes(INTEGER link_Lanes)
    {
	mComponents[3] = link_Lanes;
    }
    
    
    // Methods for field "link_Roadrank"
    public UTF8String16 getLink_Roadrank()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setLink_Roadrank(UTF8String16 link_Roadrank)
    {
	mComponents[4] = link_Roadrank;
    }
    
    
    // Methods for field "link_Roadtype"
    public UTF8String16 getLink_Roadtype()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setLink_Roadtype(UTF8String16 link_Roadtype)
    {
	mComponents[5] = link_Roadtype;
    }
    
    
    // Methods for field "link_Roadno"
    public UTF8String16 getLink_Roadno()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setLink_Roadno(UTF8String16 link_Roadno)
    {
	mComponents[6] = link_Roadno;
    }
    
    
    // Methods for field "link_Roadname"
    public UTF8String16 getLink_Roadname()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setLink_Roadname(UTF8String16 link_Roadname)
    {
	mComponents[7] = link_Roadname;
    }
    
    public boolean hasLink_Roadname()
    {
	return componentIsPresent(7);
    }
    
    public void deleteLink_Roadname()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "link_Roaduse"
    public UTF8String16 getLink_Roaduse()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setLink_Roaduse(UTF8String16 link_Roaduse)
    {
	mComponents[8] = link_Roaduse;
    }
    
    
    // Methods for field "link_Multilink"
    public UTF8String16 getLink_Multilink()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setLink_Multilink(UTF8String16 link_Multilink)
    {
	mComponents[9] = link_Multilink;
    }
    
    
    // Methods for field "link_Connect"
    public UTF8String16 getLink_Connect()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setLink_Connect(UTF8String16 link_Connect)
    {
	mComponents[10] = link_Connect;
    }
    
    
    // Methods for field "link_MaxSpd"
    public long getLink_MaxSpd()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }
    
    public void setLink_MaxSpd(long link_MaxSpd)
    {
	setLink_MaxSpd(new INTEGER(link_MaxSpd));
    }
    
    public void setLink_MaxSpd(INTEGER link_MaxSpd)
    {
	mComponents[11] = link_MaxSpd;
    }
    
    
    // Methods for field "link_Restveh"
    public UTF8String16 getLink_Restveh()
    {
	return (UTF8String16)mComponents[12];
    }
    
    public void setLink_Restveh(UTF8String16 link_Restveh)
    {
	mComponents[12] = link_Restveh;
    }
    
    public boolean hasLink_Restveh()
    {
	return componentIsPresent(12);
    }
    
    public void deleteLink_Restveh()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "link_Restw"
    public long getLink_Restw()
    {
	return ((INTEGER)mComponents[13]).longValue();
    }
    
    public void setLink_Restw(long link_Restw)
    {
	setLink_Restw(new INTEGER(link_Restw));
    }
    
    public void setLink_Restw(INTEGER link_Restw)
    {
	mComponents[13] = link_Restw;
    }
    
    public boolean hasLink_Restw()
    {
	return componentIsPresent(13);
    }
    
    public void deleteLink_Restw()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "link_Resth"
    public long getLink_Resth()
    {
	return ((INTEGER)mComponents[14]).longValue();
    }
    
    public void setLink_Resth(long link_Resth)
    {
	setLink_Resth(new INTEGER(link_Resth));
    }
    
    public void setLink_Resth(INTEGER link_Resth)
    {
	mComponents[14] = link_Resth;
    }
    
    public boolean hasLink_Resth()
    {
	return componentIsPresent(14);
    }
    
    public void deleteLink_Resth()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "link_Reg_date"
    public UTF8String16 getLink_Reg_date()
    {
	return (UTF8String16)mComponents[15];
    }
    
    public void setLink_Reg_date(UTF8String16 link_Reg_date)
    {
	mComponents[15] = link_Reg_date;
    }
    
    
    // Methods for field "link_Remark"
    public UTF8String16 getLink_Remark()
    {
	return (UTF8String16)mComponents[16];
    }
    
    public void setLink_Remark(UTF8String16 link_Remark)
    {
	mComponents[16] = link_Remark;
    }
    
    public boolean hasLink_Remark()
    {
	return componentIsPresent(16);
    }
    
    public void deleteLink_Remark()
    {
	setComponentAbsent(16);
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
	    "Link"
	),
	new QName (
	    "BusInfomation",
	    "Link"
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
					new INTEGER(1),
					new INTEGER(10),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Fnode",
		    1,
		    2,
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
					new INTEGER(1),
					new INTEGER(10),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Tnode",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new INTEGER(99),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "link-Lanes",
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Roadrank",
		    4,
		    2,
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Roadtype",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
					new INTEGER(5),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Roadno",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "link-Roadname",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				new SingleValueConstraint (
				    new INTEGER(1)
				)
			    ),
			    null
			)
		    ),
		    "link-Roaduse",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
				new SingleValueConstraint (
				    new INTEGER(1)
				)
			    ),
			    null
			)
		    ),
		    "link-Multilink",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Connect",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
				    new INTEGER(999),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "link-MaxSpd",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "link-Restveh",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "link-Restw",
		    13,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    "link-Resth",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    null
			)
		    ),
		    "link-Reg-date",
		    15,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
		    "link-Remark",
		    16,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13),
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Link object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Link object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Link
