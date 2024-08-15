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
 * Define the ASN1 Type BusLocationEvent from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class BusLocationEvent extends Sequence {
    
    /**
     * The default constructor.
     */
    public BusLocationEvent()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BusLocationEvent(GeneralizedTime tsmg_MessageGenerationTime, 
		    UTF8String16 tsvh_NodeZoneIDNumber, 
		    INTEGER tsvh_NodeRouteSequence, 
		    GeneralizedTime tsvh_NodeZoneEntryTime, 
		    GeneralizedTime tsvh_NodeZoneExitTime, 
		    INTEGER tsvh_NodeZoneTripTime)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setTsvh_NodeZoneIDNumber(tsvh_NodeZoneIDNumber);
	setTsvh_NodeRouteSequence(tsvh_NodeRouteSequence);
	setTsvh_NodeZoneEntryTime(tsvh_NodeZoneEntryTime);
	setTsvh_NodeZoneExitTime(tsvh_NodeZoneExitTime);
	setTsvh_NodeZoneTripTime(tsvh_NodeZoneTripTime);
    }
    
    /**
     * Construct with components.
     */
    public BusLocationEvent(GeneralizedTime tsmg_MessageGenerationTime, 
		    UTF8String16 tsvh_NodeZoneIDNumber, 
		    long tsvh_NodeRouteSequence, 
		    GeneralizedTime tsvh_NodeZoneEntryTime, 
		    GeneralizedTime tsvh_NodeZoneExitTime, 
		    long tsvh_NodeZoneTripTime)
    {
	this(tsmg_MessageGenerationTime, tsvh_NodeZoneIDNumber, 
	     new INTEGER(tsvh_NodeRouteSequence), tsvh_NodeZoneEntryTime, 
	     tsvh_NodeZoneExitTime, new INTEGER(tsvh_NodeZoneTripTime));
    }
    
    /**
     * Construct with required components.
     */
    public BusLocationEvent(GeneralizedTime tsmg_MessageGenerationTime, 
		    UTF8String16 tsvh_NodeZoneIDNumber, 
		    long tsvh_NodeRouteSequence)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setTsvh_NodeZoneIDNumber(tsvh_NodeZoneIDNumber);
	setTsvh_NodeRouteSequence(tsvh_NodeRouteSequence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GeneralizedTime();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new INTEGER();
	mComponents[3] = new GeneralizedTime();
	mComponents[4] = new GeneralizedTime();
	mComponents[5] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
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
		return new INTEGER();
	    case 3:
		return new GeneralizedTime();
	    case 4:
		return new GeneralizedTime();
	    case 5:
		return new INTEGER();
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
    
    
    // Methods for field "tsvh_NodeZoneIDNumber"
    public UTF8String16 getTsvh_NodeZoneIDNumber()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setTsvh_NodeZoneIDNumber(UTF8String16 tsvh_NodeZoneIDNumber)
    {
	mComponents[1] = tsvh_NodeZoneIDNumber;
    }
    
    
    // Methods for field "tsvh_NodeRouteSequence"
    public long getTsvh_NodeRouteSequence()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTsvh_NodeRouteSequence(long tsvh_NodeRouteSequence)
    {
	setTsvh_NodeRouteSequence(new INTEGER(tsvh_NodeRouteSequence));
    }
    
    public void setTsvh_NodeRouteSequence(INTEGER tsvh_NodeRouteSequence)
    {
	mComponents[2] = tsvh_NodeRouteSequence;
    }
    
    
    // Methods for field "tsvh_NodeZoneEntryTime"
    public GeneralizedTime getTsvh_NodeZoneEntryTime()
    {
	return (GeneralizedTime)mComponents[3];
    }
    
    public void setTsvh_NodeZoneEntryTime(GeneralizedTime tsvh_NodeZoneEntryTime)
    {
	mComponents[3] = tsvh_NodeZoneEntryTime;
    }
    
    public boolean hasTsvh_NodeZoneEntryTime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTsvh_NodeZoneEntryTime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "tsvh_NodeZoneExitTime"
    public GeneralizedTime getTsvh_NodeZoneExitTime()
    {
	return (GeneralizedTime)mComponents[4];
    }
    
    public void setTsvh_NodeZoneExitTime(GeneralizedTime tsvh_NodeZoneExitTime)
    {
	mComponents[4] = tsvh_NodeZoneExitTime;
    }
    
    public boolean hasTsvh_NodeZoneExitTime()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTsvh_NodeZoneExitTime()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "tsvh_NodeZoneTripTime"
    public long getTsvh_NodeZoneTripTime()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setTsvh_NodeZoneTripTime(long tsvh_NodeZoneTripTime)
    {
	setTsvh_NodeZoneTripTime(new INTEGER(tsvh_NodeZoneTripTime));
    }
    
    public void setTsvh_NodeZoneTripTime(INTEGER tsvh_NodeZoneTripTime)
    {
	mComponents[5] = tsvh_NodeZoneTripTime;
    }
    
    public boolean hasTsvh_NodeZoneTripTime()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTsvh_NodeZoneTripTime()
    {
	setComponentAbsent(5);
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
	    "BusLocationEvent"
	),
	new QName (
	    "BusInfomation",
	    "BusLocationEvent"
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
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(40),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tsvh-NodeZoneIDNumber",
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
				    new INTEGER(512),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsvh-NodeRouteSequence",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "tsvh-NodeZoneEntryTime",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "tsvh-NodeZoneExitTime",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new INTEGER(1200),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsvh-NodeZoneTripTime",
		    5,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BusLocationEvent object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BusLocationEvent object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BusLocationEvent
