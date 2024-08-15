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
import com.oss.asn1.GeneralizedTime;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BusLocationPolling from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class BusLocationPolling extends Sequence {
    
    /**
     * The default constructor.
     */
    public BusLocationPolling()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BusLocationPolling(NMEACoord tsfc_PTVehicleCoordinate, 
		    GeneralizedTime tsfc_PTVehicleCollectedTime, 
		    INTEGER tsfc_PTVehicleCollectedCycleTime)
    {
	setTsfc_PTVehicleCoordinate(tsfc_PTVehicleCoordinate);
	setTsfc_PTVehicleCollectedTime(tsfc_PTVehicleCollectedTime);
	setTsfc_PTVehicleCollectedCycleTime(tsfc_PTVehicleCollectedCycleTime);
    }
    
    /**
     * Construct with components.
     */
    public BusLocationPolling(NMEACoord tsfc_PTVehicleCoordinate, 
		    GeneralizedTime tsfc_PTVehicleCollectedTime, 
		    long tsfc_PTVehicleCollectedCycleTime)
    {
	this(tsfc_PTVehicleCoordinate, tsfc_PTVehicleCollectedTime, 
	     new INTEGER(tsfc_PTVehicleCollectedCycleTime));
    }
    
    public void initComponents()
    {
	mComponents[0] = new NMEACoord();
	mComponents[1] = new GeneralizedTime();
	mComponents[2] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new NMEACoord();
	    case 1:
		return new GeneralizedTime();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsfc_PTVehicleCoordinate"
    public NMEACoord getTsfc_PTVehicleCoordinate()
    {
	return (NMEACoord)mComponents[0];
    }
    
    public void setTsfc_PTVehicleCoordinate(NMEACoord tsfc_PTVehicleCoordinate)
    {
	mComponents[0] = tsfc_PTVehicleCoordinate;
    }
    
    public boolean hasTsfc_PTVehicleCoordinate()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTsfc_PTVehicleCoordinate()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "tsfc_PTVehicleCollectedTime"
    public GeneralizedTime getTsfc_PTVehicleCollectedTime()
    {
	return (GeneralizedTime)mComponents[1];
    }
    
    public void setTsfc_PTVehicleCollectedTime(GeneralizedTime tsfc_PTVehicleCollectedTime)
    {
	mComponents[1] = tsfc_PTVehicleCollectedTime;
    }
    
    public boolean hasTsfc_PTVehicleCollectedTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTsfc_PTVehicleCollectedTime()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "tsfc_PTVehicleCollectedCycleTime"
    public long getTsfc_PTVehicleCollectedCycleTime()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setTsfc_PTVehicleCollectedCycleTime(long tsfc_PTVehicleCollectedCycleTime)
    {
	setTsfc_PTVehicleCollectedCycleTime(new INTEGER(tsfc_PTVehicleCollectedCycleTime));
    }
    
    public void setTsfc_PTVehicleCollectedCycleTime(INTEGER tsfc_PTVehicleCollectedCycleTime)
    {
	mComponents[2] = tsfc_PTVehicleCollectedCycleTime;
    }
    
    public boolean hasTsfc_PTVehicleCollectedCycleTime()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTsfc_PTVehicleCollectedCycleTime()
    {
	setComponentAbsent(2);
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
	    "BusLocationPolling"
	),
	new QName (
	    "BusInfomation",
	    "BusLocationPolling"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "tsfc-PTVehicleCoordinate",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "tsfc-PTVehicleCollectedTime",
		    1,
		    3,
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
				    new INTEGER(3600),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "tsfc-PTVehicleCollectedCycleTime",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BusLocationPolling object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BusLocationPolling object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BusLocationPolling
