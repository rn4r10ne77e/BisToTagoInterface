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


package datex.businfomation;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Node from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class Node extends Sequence {
    
    /**
     * The default constructor.
     */
    public Node()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Node(UTF8String16 trnt_Nodeid, UTF8String16 node_type, 
		    UTF8String16 node_Name, NMEACoord node_Coordinate, 
		    UTF8String16 node_Turn_P, UTF8String16 node_Reg_date, 
		    UTF8String16 node_Remark)
    {
	setTrnt_Nodeid(trnt_Nodeid);
	setNode_type(node_type);
	setNode_Name(node_Name);
	setNode_Coordinate(node_Coordinate);
	setNode_Turn_P(node_Turn_P);
	setNode_Reg_date(node_Reg_date);
	setNode_Remark(node_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public Node(UTF8String16 trnt_Nodeid, UTF8String16 node_type, 
		    NMEACoord node_Coordinate, UTF8String16 node_Turn_P, 
		    UTF8String16 node_Reg_date)
    {
	setTrnt_Nodeid(trnt_Nodeid);
	setNode_type(node_type);
	setNode_Coordinate(node_Coordinate);
	setNode_Turn_P(node_Turn_P);
	setNode_Reg_date(node_Reg_date);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new NMEACoord();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
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
		return new NMEACoord();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    case 6:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trnt_Nodeid"
    public UTF8String16 getTrnt_Nodeid()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTrnt_Nodeid(UTF8String16 trnt_Nodeid)
    {
	mComponents[0] = trnt_Nodeid;
    }
    
    
    // Methods for field "node_type"
    public UTF8String16 getNode_type()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setNode_type(UTF8String16 node_type)
    {
	mComponents[1] = node_type;
    }
    
    
    // Methods for field "node_Name"
    public UTF8String16 getNode_Name()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setNode_Name(UTF8String16 node_Name)
    {
	mComponents[2] = node_Name;
    }
    
    public boolean hasNode_Name()
    {
	return componentIsPresent(2);
    }
    
    public void deleteNode_Name()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "node_Coordinate"
    public NMEACoord getNode_Coordinate()
    {
	return (NMEACoord)mComponents[3];
    }
    
    public void setNode_Coordinate(NMEACoord node_Coordinate)
    {
	mComponents[3] = node_Coordinate;
    }
    
    
    // Methods for field "node_Turn_P"
    public UTF8String16 getNode_Turn_P()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setNode_Turn_P(UTF8String16 node_Turn_P)
    {
	mComponents[4] = node_Turn_P;
    }
    
    
    // Methods for field "node_Reg_date"
    public UTF8String16 getNode_Reg_date()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setNode_Reg_date(UTF8String16 node_Reg_date)
    {
	mComponents[5] = node_Reg_date;
    }
    
    
    // Methods for field "node_Remark"
    public UTF8String16 getNode_Remark()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setNode_Remark(UTF8String16 node_Remark)
    {
	mComponents[6] = node_Remark;
    }
    
    public boolean hasNode_Remark()
    {
	return componentIsPresent(6);
    }
    
    public void deleteNode_Remark()
    {
	setComponentAbsent(6);
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
	    "Node"
	),
	new QName (
	    "BusInfomation",
	    "Node"
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
		    "trnt-Nodeid",
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
					new INTEGER(3),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "node-type",
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
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "node-Name",
		    2,
		    3,
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
		    "node-Coordinate",
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
				new SingleValueConstraint (
				    new INTEGER(1)
				)
			    ),
			    null
			)
		    ),
		    "node-Turn-P",
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
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    null
			)
		    ),
		    "node-Reg-date",
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
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "node-Remark",
		    6,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Node object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Node object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Node
