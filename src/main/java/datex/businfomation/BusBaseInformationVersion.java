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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BusBaseInformationVersion from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class BusBaseInformationVersion extends Sequence {
    
    /**
     * The default constructor.
     */
    public BusBaseInformationVersion()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BusBaseInformationVersion(GeneralizedTime tsmg_MessageGenerationTime, 
		    UTF8String16 base_Node_version, 
		    UTF8String16 base_Link_version, 
		    UTF8String16 base_LinkCoords_version, 
		    UTF8String16 base_Station_version, 
		    UTF8String16 base_Route_version, 
		    UTF8String16 base_RoutePlan_version, 
		    UTF8String16 base_RouteStation_version, 
		    UTF8String16 base_Vehicle_version, 
		    UTF8String16 base_RouteLink_version, 
		    UTF8String16 base_RouteAllocate_version, 
		    UTF8String16 base_Company_version, 
		    UTF8String16 base_Admin_version, UTF8String16 base_Remark)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setBase_Node_version(base_Node_version);
	setBase_Link_version(base_Link_version);
	setBase_LinkCoords_version(base_LinkCoords_version);
	setBase_Station_version(base_Station_version);
	setBase_Route_version(base_Route_version);
	setBase_RoutePlan_version(base_RoutePlan_version);
	setBase_RouteStation_version(base_RouteStation_version);
	setBase_Vehicle_version(base_Vehicle_version);
	setBase_RouteLink_version(base_RouteLink_version);
	setBase_RouteAllocate_version(base_RouteAllocate_version);
	setBase_Company_version(base_Company_version);
	setBase_Admin_version(base_Admin_version);
	setBase_Remark(base_Remark);
    }
    
    /**
     * Construct with required components.
     */
    public BusBaseInformationVersion(GeneralizedTime tsmg_MessageGenerationTime)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GeneralizedTime();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new UTF8String16();
	mComponents[8] = new UTF8String16();
	mComponents[9] = new UTF8String16();
	mComponents[10] = new UTF8String16();
	mComponents[11] = new UTF8String16();
	mComponents[12] = new UTF8String16();
	mComponents[13] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[14];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new GeneralizedTime();
	    case 1:
		return new UTF8String16();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new UTF8String16();
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
		return new UTF8String16();
	    case 12:
		return new UTF8String16();
	    case 13:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsmg_MessageGenerationTime"
    public GeneralizedTime getTsmg_MessageGenerationTime()
    {
	return (GeneralizedTime)mComponents[0];
    }
    
    public void setTsmg_MessageGenerationTime(GeneralizedTime tsmg_MessageGenerationTime)
    {
	mComponents[0] = tsmg_MessageGenerationTime;
    }
    
    
    // Methods for field "base_Node_version"
    public UTF8String16 getBase_Node_version()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setBase_Node_version(UTF8String16 base_Node_version)
    {
	mComponents[1] = base_Node_version;
    }
    
    public boolean hasBase_Node_version()
    {
	return componentIsPresent(1);
    }
    
    public void deleteBase_Node_version()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "base_Link_version"
    public UTF8String16 getBase_Link_version()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setBase_Link_version(UTF8String16 base_Link_version)
    {
	mComponents[2] = base_Link_version;
    }
    
    public boolean hasBase_Link_version()
    {
	return componentIsPresent(2);
    }
    
    public void deleteBase_Link_version()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "base_LinkCoords_version"
    public UTF8String16 getBase_LinkCoords_version()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setBase_LinkCoords_version(UTF8String16 base_LinkCoords_version)
    {
	mComponents[3] = base_LinkCoords_version;
    }
    
    public boolean hasBase_LinkCoords_version()
    {
	return componentIsPresent(3);
    }
    
    public void deleteBase_LinkCoords_version()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "base_Station_version"
    public UTF8String16 getBase_Station_version()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setBase_Station_version(UTF8String16 base_Station_version)
    {
	mComponents[4] = base_Station_version;
    }
    
    public boolean hasBase_Station_version()
    {
	return componentIsPresent(4);
    }
    
    public void deleteBase_Station_version()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "base_Route_version"
    public UTF8String16 getBase_Route_version()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setBase_Route_version(UTF8String16 base_Route_version)
    {
	mComponents[5] = base_Route_version;
    }
    
    public boolean hasBase_Route_version()
    {
	return componentIsPresent(5);
    }
    
    public void deleteBase_Route_version()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "base_RoutePlan_version"
    public UTF8String16 getBase_RoutePlan_version()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setBase_RoutePlan_version(UTF8String16 base_RoutePlan_version)
    {
	mComponents[6] = base_RoutePlan_version;
    }
    
    public boolean hasBase_RoutePlan_version()
    {
	return componentIsPresent(6);
    }
    
    public void deleteBase_RoutePlan_version()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "base_RouteStation_version"
    public UTF8String16 getBase_RouteStation_version()
    {
	return (UTF8String16)mComponents[7];
    }
    
    public void setBase_RouteStation_version(UTF8String16 base_RouteStation_version)
    {
	mComponents[7] = base_RouteStation_version;
    }
    
    public boolean hasBase_RouteStation_version()
    {
	return componentIsPresent(7);
    }
    
    public void deleteBase_RouteStation_version()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "base_Vehicle_version"
    public UTF8String16 getBase_Vehicle_version()
    {
	return (UTF8String16)mComponents[8];
    }
    
    public void setBase_Vehicle_version(UTF8String16 base_Vehicle_version)
    {
	mComponents[8] = base_Vehicle_version;
    }
    
    public boolean hasBase_Vehicle_version()
    {
	return componentIsPresent(8);
    }
    
    public void deleteBase_Vehicle_version()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "base_RouteLink_version"
    public UTF8String16 getBase_RouteLink_version()
    {
	return (UTF8String16)mComponents[9];
    }
    
    public void setBase_RouteLink_version(UTF8String16 base_RouteLink_version)
    {
	mComponents[9] = base_RouteLink_version;
    }
    
    public boolean hasBase_RouteLink_version()
    {
	return componentIsPresent(9);
    }
    
    public void deleteBase_RouteLink_version()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "base_RouteAllocate_version"
    public UTF8String16 getBase_RouteAllocate_version()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setBase_RouteAllocate_version(UTF8String16 base_RouteAllocate_version)
    {
	mComponents[10] = base_RouteAllocate_version;
    }
    
    public boolean hasBase_RouteAllocate_version()
    {
	return componentIsPresent(10);
    }
    
    public void deleteBase_RouteAllocate_version()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "base_Company_version"
    public UTF8String16 getBase_Company_version()
    {
	return (UTF8String16)mComponents[11];
    }
    
    public void setBase_Company_version(UTF8String16 base_Company_version)
    {
	mComponents[11] = base_Company_version;
    }
    
    public boolean hasBase_Company_version()
    {
	return componentIsPresent(11);
    }
    
    public void deleteBase_Company_version()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "base_Admin_version"
    public UTF8String16 getBase_Admin_version()
    {
	return (UTF8String16)mComponents[12];
    }
    
    public void setBase_Admin_version(UTF8String16 base_Admin_version)
    {
	mComponents[12] = base_Admin_version;
    }
    
    public boolean hasBase_Admin_version()
    {
	return componentIsPresent(12);
    }
    
    public void deleteBase_Admin_version()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "base_Remark"
    public UTF8String16 getBase_Remark()
    {
	return (UTF8String16)mComponents[13];
    }
    
    public void setBase_Remark(UTF8String16 base_Remark)
    {
	mComponents[13] = base_Remark;
    }
    
    public boolean hasBase_Remark()
    {
	return componentIsPresent(13);
    }
    
    public void deleteBase_Remark()
    {
	setComponentAbsent(13);
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
	    "BusBaseInformationVersion"
	),
	new QName (
	    "BusInfomation",
	    "BusBaseInformationVersion"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"GeneralizedTime"
			    ),
			    new QName (
				"builtin",
				"GeneralizedTime"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsmg-MessageGenerationTime",
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
		    "base-Node-version",
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
		    "base-Link-version",
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
		    "base-LinkCoords-version",
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
		    "base-Station-version",
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
		    "base-Route-version",
		    5,
		    3,
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
		    "base-RoutePlan-version",
		    6,
		    3,
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
		    "base-RouteStation-version",
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
		    "base-Vehicle-version",
		    8,
		    3,
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
		    "base-RouteLink-version",
		    9,
		    3,
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
		    "base-RouteAllocate-version",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "base-Company-version",
		    11,
		    3,
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
		    "base-Admin-version",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "base-Remark",
		    13,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BusBaseInformationVersion object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BusBaseInformationVersion object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BusBaseInformationVersion
