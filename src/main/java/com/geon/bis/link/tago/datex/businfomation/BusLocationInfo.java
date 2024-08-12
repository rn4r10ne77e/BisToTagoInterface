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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BusLocationInfo from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class BusLocationInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public BusLocationInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BusLocationInfo(UTF8String16 tsfc_PTVehicleIDNumber, 
		    BusLocationInfoType busLocationInfoType, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    Tpfc_BusRunCodeNumber tpfc_BusRunCodeNumber, 
		    BOOLEAN tsfc_LastPTVehicle, 
		    UTF8String16 tpif_EndNodeZoneIDNumber, 
		    INTEGER tpif_EndNodeRouteSequence, 
		    INTEGER tsfc_BusTotalSeatsNumber, 
		    INTEGER tsfc_BusPassengerNumber, 
		    INTEGER tsfc_BusRemainSeatsNumber)
    {
	setTsfc_PTVehicleIDNumber(tsfc_PTVehicleIDNumber);
	setBusLocationInfoType(busLocationInfoType);
	setTpif_SubRouteIdentityNumber(tpif_SubRouteIdentityNumber);
	setTpfc_BusEventCodeNumber(tpfc_BusEventCodeNumber);
	setTpfc_BusRunCodeNumber(tpfc_BusRunCodeNumber);
	setTsfc_LastPTVehicle(tsfc_LastPTVehicle);
	setTpif_EndNodeZoneIDNumber(tpif_EndNodeZoneIDNumber);
	setTpif_EndNodeRouteSequence(tpif_EndNodeRouteSequence);
	setTsfc_BusTotalSeatsNumber(tsfc_BusTotalSeatsNumber);
	setTsfc_BusPassengerNumber(tsfc_BusPassengerNumber);
	setTsfc_BusRemainSeatsNumber(tsfc_BusRemainSeatsNumber);
    }
    
    /**
     * Construct with components.
     */
    public BusLocationInfo(UTF8String16 tsfc_PTVehicleIDNumber, 
		    BusLocationInfoType busLocationInfoType, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    Tpfc_BusRunCodeNumber tpfc_BusRunCodeNumber, 
		    boolean tsfc_LastPTVehicle, 
		    UTF8String16 tpif_EndNodeZoneIDNumber, 
		    long tpif_EndNodeRouteSequence, 
		    long tsfc_BusTotalSeatsNumber, 
		    long tsfc_BusPassengerNumber, 
		    long tsfc_BusRemainSeatsNumber)
    {
	this(tsfc_PTVehicleIDNumber, busLocationInfoType, 
	     tpif_SubRouteIdentityNumber, tpfc_BusEventCodeNumber, 
	     tpfc_BusRunCodeNumber, new BOOLEAN(tsfc_LastPTVehicle), 
	     tpif_EndNodeZoneIDNumber, 
	     new INTEGER(tpif_EndNodeRouteSequence), 
	     new INTEGER(tsfc_BusTotalSeatsNumber), 
	     new INTEGER(tsfc_BusPassengerNumber), 
	     new INTEGER(tsfc_BusRemainSeatsNumber));
    }
    
    /**
     * Construct with required components.
     */
    public BusLocationInfo(UTF8String16 tsfc_PTVehicleIDNumber, 
		    BusLocationInfoType busLocationInfoType, 
		    UTF8String16 tpif_SubRouteIdentityNumber, 
		    Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber, 
		    Tpfc_BusRunCodeNumber tpfc_BusRunCodeNumber)
    {
	setTsfc_PTVehicleIDNumber(tsfc_PTVehicleIDNumber);
	setBusLocationInfoType(busLocationInfoType);
	setTpif_SubRouteIdentityNumber(tpif_SubRouteIdentityNumber);
	setTpfc_BusEventCodeNumber(tpfc_BusEventCodeNumber);
	setTpfc_BusRunCodeNumber(tpfc_BusRunCodeNumber);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new BusLocationInfoType();
	mComponents[2] = new UTF8String16();
	mComponents[3] = Tpfc_BusEventCodeNumber.enter_BusStop;
	mComponents[4] = Tpfc_BusRunCodeNumber.normal_Run;
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new UTF8String16();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = new INTEGER();
	mComponents[10] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new BusLocationInfoType();
	    case 2:
		return new UTF8String16();
	    case 3:
		return Tpfc_BusEventCodeNumber.enter_BusStop;
	    case 4:
		return Tpfc_BusRunCodeNumber.normal_Run;
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new UTF8String16();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return new INTEGER();
	    case 10:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsfc_PTVehicleIDNumber"
    public UTF8String16 getTsfc_PTVehicleIDNumber()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setTsfc_PTVehicleIDNumber(UTF8String16 tsfc_PTVehicleIDNumber)
    {
	mComponents[0] = tsfc_PTVehicleIDNumber;
    }
    
    
    // Methods for field "busLocationInfoType"
    public BusLocationInfoType getBusLocationInfoType()
    {
	return (BusLocationInfoType)mComponents[1];
    }
    
    public void setBusLocationInfoType(BusLocationInfoType busLocationInfoType)
    {
	mComponents[1] = busLocationInfoType;
    }
    
    
    
    /**
     * Define the ASN1 Type BusLocationInfoType from ASN1 Module BusInfomation.
     * @see Choice
     */
    public static class BusLocationInfoType extends Choice {
	
	/**
	 * The default constructor.
	 */
	public BusLocationInfoType()
	{
	}
	
	public static final  int  busLocationEvent_chosen = 1;
	public static final  int  busLocationPolling_chosen = 2;
	
	// Methods for field "busLocationEvent"
	public static BusLocationInfoType createBusLocationInfoTypeWithBusLocationEvent(BusLocationEvent busLocationEvent)
	{
	    BusLocationInfoType __object = new BusLocationInfoType();

	    __object.setBusLocationEvent(busLocationEvent);
	    return __object;
	}
	
	public boolean hasBusLocationEvent()
	{
	    return getChosenFlag() == busLocationEvent_chosen;
	}
	
	public BusLocationEvent getBusLocationEvent()
	{
	    if (hasBusLocationEvent())
		return (BusLocationEvent)mChosenValue;
	    else
		return null;
	}
	
	public void setBusLocationEvent(BusLocationEvent busLocationEvent)
	{
	    setChosenValue(busLocationEvent);
	    setChosenFlag(busLocationEvent_chosen);
	}
	
	
	// Methods for field "busLocationPolling"
	public static BusLocationInfoType createBusLocationInfoTypeWithBusLocationPolling(BusLocationPolling busLocationPolling)
	{
	    BusLocationInfoType __object = new BusLocationInfoType();

	    __object.setBusLocationPolling(busLocationPolling);
	    return __object;
	}
	
	public boolean hasBusLocationPolling()
	{
	    return getChosenFlag() == busLocationPolling_chosen;
	}
	
	public BusLocationPolling getBusLocationPolling()
	{
	    if (hasBusLocationPolling())
		return (BusLocationPolling)mChosenValue;
	    else
		return null;
	}
	
	public void setBusLocationPolling(BusLocationPolling busLocationPolling)
	{
	    setChosenValue(busLocationPolling);
	    setChosenFlag(busLocationPolling_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case busLocationEvent_chosen:
		    return new BusLocationEvent();
		case busLocationPolling_chosen:
		    return new BusLocationPolling();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusLocationInfo$BusLocationInfoType"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    800787,
	    null,
	    new FieldsList (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
				new FieldsRef (
				    new QName (
					"datex.businfomation",
					"BusLocationEvent"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.businfomation",
					"BusLocationEvent"
				    )
				),
				0
			    )
			),
			"busLocationEvent",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
				new FieldsRef (
				    new QName (
					"datex.businfomation",
					"BusLocationPolling"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"datex.businfomation",
					"BusLocationPolling"
				    )
				),
				0
			    )
			),
			"busLocationPolling",
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
	 * Get the type descriptor (TypeInfo) of 'this' BusLocationInfoType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' BusLocationInfoType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for BusLocationInfoType

    // Methods for field "tpif_SubRouteIdentityNumber"
    public UTF8String16 getTpif_SubRouteIdentityNumber()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setTpif_SubRouteIdentityNumber(UTF8String16 tpif_SubRouteIdentityNumber)
    {
	mComponents[2] = tpif_SubRouteIdentityNumber;
    }
    
    
    // Methods for field "tpfc_BusEventCodeNumber"
    public Tpfc_BusEventCodeNumber getTpfc_BusEventCodeNumber()
    {
	return (Tpfc_BusEventCodeNumber)mComponents[3];
    }
    
    public void setTpfc_BusEventCodeNumber(Tpfc_BusEventCodeNumber tpfc_BusEventCodeNumber)
    {
	mComponents[3] = tpfc_BusEventCodeNumber;
    }
    
    
    
    /**
     * Define the ASN1 Type Tpfc_BusEventCodeNumber from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Tpfc_BusEventCodeNumber extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpfc_BusEventCodeNumber()
	{
	    super(cFirstNumber);
	}
	
	protected Tpfc_BusEventCodeNumber(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long enter_BusStop = 0;
	    public static final long exit_BusStop = 1;
	    public static final long pass_Cross = 2;
	    public static final long fixed_Cycle = 3;
	    public static final long enter_Cross = 4;
	    public static final long exit_Cross = 5;
	}
	// Named list definitions.
	private final static Tpfc_BusEventCodeNumber cNamedNumbers[] = {
	    new Tpfc_BusEventCodeNumber(), 
	    new Tpfc_BusEventCodeNumber(1), 
	    new Tpfc_BusEventCodeNumber(2), 
	    new Tpfc_BusEventCodeNumber(3), 
	    new Tpfc_BusEventCodeNumber(4), 
	    new Tpfc_BusEventCodeNumber(5)
	};
	public static final Tpfc_BusEventCodeNumber enter_BusStop = cNamedNumbers[0];
	public static final Tpfc_BusEventCodeNumber exit_BusStop = cNamedNumbers[1];
	public static final Tpfc_BusEventCodeNumber pass_Cross = cNamedNumbers[2];
	public static final Tpfc_BusEventCodeNumber fixed_Cycle = cNamedNumbers[3];
	public static final Tpfc_BusEventCodeNumber enter_Cross = cNamedNumbers[4];
	public static final Tpfc_BusEventCodeNumber exit_Cross = cNamedNumbers[5];
	
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int indexOfValue(long value)
	{
	    if (value >= 0 && value <= 5)
		return (int)value;
	    else
		return -1;
	}
	
	/**
	 * Returns the enumerator with the specified value or null if the value
	 * is not associated with any enumerator.
	 *  @param value The value of the enumerator to return.
	 *  @return The enumerator with the specified value.
	 */
	
	public static Tpfc_BusEventCodeNumber valueOf(long value)
	{
	    int inx = indexOfValue(value);
	    
	    if (inx < 0)
		return null;
	    else
		return cNamedNumbers[inx];
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public int indexOf()
	{
	    return indexOfValue(mValue);
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public Enumerated lookupValue(long value)
	{
	    return valueOf(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusLocationInfo$Tpfc_BusEventCodeNumber"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    800787,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"enter-BusStop",
			0
		    ),
		    new MemberListElement (
			"exit-BusStop",
			1
		    ),
		    new MemberListElement (
			"pass-Cross",
			2
		    ),
		    new MemberListElement (
			"fixed-Cycle",
			3
		    ),
		    new MemberListElement (
			"enter-Cross",
			4
		    ),
		    new MemberListElement (
			"exit-Cross",
			5
		    )
		}
	    ),
	    0,
	    enter_BusStop
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tpfc_BusEventCodeNumber object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpfc_BusEventCodeNumber object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpfc_BusEventCodeNumber

    // Methods for field "tpfc_BusRunCodeNumber"
    public Tpfc_BusRunCodeNumber getTpfc_BusRunCodeNumber()
    {
	return (Tpfc_BusRunCodeNumber)mComponents[4];
    }
    
    public void setTpfc_BusRunCodeNumber(Tpfc_BusRunCodeNumber tpfc_BusRunCodeNumber)
    {
	mComponents[4] = tpfc_BusRunCodeNumber;
    }
    
    
    
    /**
     * Define the ASN1 Type Tpfc_BusRunCodeNumber from ASN1 Module BusInfomation.
     * @see Enumerated
     */
    public static final class Tpfc_BusRunCodeNumber extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private Tpfc_BusRunCodeNumber()
	{
	    super(cFirstNumber);
	}
	
	protected Tpfc_BusRunCodeNumber(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long normal_Run = 0;
	    public static final long abnormal_Run = 1;
	}
	// Named list definitions.
	private final static Tpfc_BusRunCodeNumber cNamedNumbers[] = {
	    new Tpfc_BusRunCodeNumber(), 
	    new Tpfc_BusRunCodeNumber(1)
	};
	public static final Tpfc_BusRunCodeNumber normal_Run = cNamedNumbers[0];
	public static final Tpfc_BusRunCodeNumber abnormal_Run = cNamedNumbers[1];
	
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public static int indexOfValue(long value)
	{
	    if (value >= 0 && value <= 1)
		return (int)value;
	    else
		return -1;
	}
	
	/**
	 * Returns the enumerator with the specified value or null if the value
	 * is not associated with any enumerator.
	 *  @param value The value of the enumerator to return.
	 *  @return The enumerator with the specified value.
	 */
	
	public static Tpfc_BusRunCodeNumber valueOf(long value)
	{
	    int inx = indexOfValue(value);
	    
	    if (inx < 0)
		return null;
	    else
		return cNamedNumbers[inx];
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public int indexOf()
	{
	    return indexOfValue(mValue);
	}
	
	/**
	 * This method is reserved for internal use and must not be invoked from the application code.
	 */
	public Enumerated lookupValue(long value)
	{
	    return valueOf(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusLocationInfo$Tpfc_BusRunCodeNumber"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    800787,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"normal-Run",
			0
		    ),
		    new MemberListElement (
			"abnormal-Run",
			1
		    )
		}
	    ),
	    0,
	    normal_Run
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tpfc_BusRunCodeNumber object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tpfc_BusRunCodeNumber object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tpfc_BusRunCodeNumber

    // Methods for field "tsfc_LastPTVehicle"
    public boolean getTsfc_LastPTVehicle()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setTsfc_LastPTVehicle(boolean tsfc_LastPTVehicle)
    {
	setTsfc_LastPTVehicle(new BOOLEAN(tsfc_LastPTVehicle));
    }
    
    public void setTsfc_LastPTVehicle(BOOLEAN tsfc_LastPTVehicle)
    {
	mComponents[5] = tsfc_LastPTVehicle;
    }
    
    public boolean hasTsfc_LastPTVehicle()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTsfc_LastPTVehicle()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "tpif_EndNodeZoneIDNumber"
    public UTF8String16 getTpif_EndNodeZoneIDNumber()
    {
	return (UTF8String16)mComponents[6];
    }
    
    public void setTpif_EndNodeZoneIDNumber(UTF8String16 tpif_EndNodeZoneIDNumber)
    {
	mComponents[6] = tpif_EndNodeZoneIDNumber;
    }
    
    public boolean hasTpif_EndNodeZoneIDNumber()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTpif_EndNodeZoneIDNumber()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "tpif_EndNodeRouteSequence"
    public long getTpif_EndNodeRouteSequence()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setTpif_EndNodeRouteSequence(long tpif_EndNodeRouteSequence)
    {
	setTpif_EndNodeRouteSequence(new INTEGER(tpif_EndNodeRouteSequence));
    }
    
    public void setTpif_EndNodeRouteSequence(INTEGER tpif_EndNodeRouteSequence)
    {
	mComponents[7] = tpif_EndNodeRouteSequence;
    }
    
    public boolean hasTpif_EndNodeRouteSequence()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTpif_EndNodeRouteSequence()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "tsfc_BusTotalSeatsNumber"
    public long getTsfc_BusTotalSeatsNumber()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setTsfc_BusTotalSeatsNumber(long tsfc_BusTotalSeatsNumber)
    {
	setTsfc_BusTotalSeatsNumber(new INTEGER(tsfc_BusTotalSeatsNumber));
    }
    
    public void setTsfc_BusTotalSeatsNumber(INTEGER tsfc_BusTotalSeatsNumber)
    {
	mComponents[8] = tsfc_BusTotalSeatsNumber;
    }
    
    public boolean hasTsfc_BusTotalSeatsNumber()
    {
	return componentIsPresent(8);
    }
    
    public void deleteTsfc_BusTotalSeatsNumber()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "tsfc_BusPassengerNumber"
    public long getTsfc_BusPassengerNumber()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void setTsfc_BusPassengerNumber(long tsfc_BusPassengerNumber)
    {
	setTsfc_BusPassengerNumber(new INTEGER(tsfc_BusPassengerNumber));
    }
    
    public void setTsfc_BusPassengerNumber(INTEGER tsfc_BusPassengerNumber)
    {
	mComponents[9] = tsfc_BusPassengerNumber;
    }
    
    public boolean hasTsfc_BusPassengerNumber()
    {
	return componentIsPresent(9);
    }
    
    public void deleteTsfc_BusPassengerNumber()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "tsfc_BusRemainSeatsNumber"
    public long getTsfc_BusRemainSeatsNumber()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setTsfc_BusRemainSeatsNumber(long tsfc_BusRemainSeatsNumber)
    {
	setTsfc_BusRemainSeatsNumber(new INTEGER(tsfc_BusRemainSeatsNumber));
    }
    
    public void setTsfc_BusRemainSeatsNumber(INTEGER tsfc_BusRemainSeatsNumber)
    {
	mComponents[10] = tsfc_BusRemainSeatsNumber;
    }
    
    public boolean hasTsfc_BusRemainSeatsNumber()
    {
	return componentIsPresent(10);
    }
    
    public void deleteTsfc_BusRemainSeatsNumber()
    {
	setComponentAbsent(10);
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
	    "BusLocationInfo"
	),
	new QName (
	    "BusInfomation",
	    "BusLocationInfo"
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
					new INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "tsfc-PTVehicleIDNumber",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusLocationInfo$BusLocationInfoType"
			)
		    ),
		    "busLocationInfoType",
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
		    "tpif-SubRouteIdentityNumber",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusLocationInfo$Tpfc_BusEventCodeNumber"
			)
		    ),
		    "tpfc-BusEventCodeNumber",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusLocationInfo$Tpfc_BusRunCodeNumber"
			)
		    ),
		    "tpfc-BusRunCodeNumber",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "tsfc-LastPTVehicle",
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
		    "tpif-EndNodeZoneIDNumber",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "tpif-EndNodeRouteSequence",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "tsfc-BusTotalSeatsNumber",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "tsfc-BusPassengerNumber",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "tsfc-BusRemainSeatsNumber",
		    10,
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
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BusLocationInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BusLocationInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BusLocationInfo
